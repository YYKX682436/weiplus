package com.davemorrissey.labs.subscaleview.legacy;

/* loaded from: classes15.dex */
public class LegacyTileLoaderFactory implements com.davemorrissey.labs.subscaleview.model.ITileLoaderFactory {
    private static final java.lang.String TAG = "MicroMsg.LegacyTileLoaderFactory";

    /* loaded from: classes15.dex */
    public static class LegacyTileLoadTaskWrapper extends android.os.AsyncTask<java.lang.Void, java.lang.Void, android.graphics.Bitmap> implements com.davemorrissey.labs.subscaleview.model.ILoadable {
        private com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult decodeResult;
        private final java.lang.ref.WeakReference<com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder> decoderRef;
        private java.lang.Exception exception;
        private final java.lang.ref.WeakReference<com.davemorrissey.labs.subscaleview.model.Tile> tileRef;
        private final java.lang.ref.WeakReference<com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView> viewRef;
        private long mStartTime = -1;
        private boolean isCancelled = false;

        public LegacyTileLoadTaskWrapper(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView, com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder imageRegionDecoder, com.davemorrissey.labs.subscaleview.model.Tile tile) {
            this.viewRef = new java.lang.ref.WeakReference<>(subsamplingScaleImageView);
            this.decoderRef = new java.lang.ref.WeakReference<>(imageRegionDecoder);
            this.tileRef = new java.lang.ref.WeakReference<>(tile);
            tile.loading = true;
        }

        private void onEnd(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView, com.davemorrissey.labs.subscaleview.model.Tile tile) {
            if (subsamplingScaleImageView == null) {
                return;
            }
            subsamplingScaleImageView.setLastTileTimeStamp();
            if (tile == null || this.mStartTime == -1 || subsamplingScaleImageView.getFullImageSampleSize() != tile.sampleSize) {
                return;
            }
            subsamplingScaleImageView.addTileDecodeTime((int) (java.lang.System.currentTimeMillis() - this.mStartTime));
        }

        private void onExecuteEnd(android.graphics.Bitmap bitmap) {
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
            com.davemorrissey.labs.subscaleview.model.Tile tile = this.tileRef.get();
            if (subsamplingScaleImageView == null || tile == null) {
                return;
            }
            if (bitmap != null) {
                tile.bitmap = bitmap;
                tile.loading = false;
                subsamplingScaleImageView.onTileLoaded(tile);
            } else {
                if (this.exception == null || subsamplingScaleImageView.getOnImageEventListener() == null) {
                    return;
                }
                subsamplingScaleImageView.getOnImageEventListener().onTileLoadError(this.decodeResult);
            }
        }

        @Override // com.davemorrissey.labs.subscaleview.model.ILoadable
        public void cancel() {
            try {
                cancel(true);
                this.isCancelled = true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(com.davemorrissey.labs.subscaleview.legacy.LegacyTileLoaderFactory.TAG, e17, "TileLoaderTask cancel exception", new java.lang.Object[0]);
            }
        }

        @Override // com.davemorrissey.labs.subscaleview.model.ILoadable
        public void startLoad() {
            executeOnExecutor(this.viewRef.get().provideExecutor(), new java.lang.Void[0]);
        }

        @Override // android.os.AsyncTask
        public android.graphics.Bitmap doInBackground(java.lang.Void... voidArr) {
            if (this.viewRef.get() != null && this.tileRef.get() != null && this.viewRef.get().getFullImageSampleSize() == this.tileRef.get().sampleSize) {
                this.mStartTime = java.lang.System.currentTimeMillis();
            }
            try {
                com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
                com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder imageRegionDecoder = this.decoderRef.get();
                com.davemorrissey.labs.subscaleview.model.Tile tile = this.tileRef.get();
                if (imageRegionDecoder != null && tile != null && subsamplingScaleImageView != null && imageRegionDecoder.isReady() && tile.visible) {
                    subsamplingScaleImageView.getDecoderLock().readLock().lock();
                    try {
                        if (imageRegionDecoder.isReady()) {
                            subsamplingScaleImageView.fileSRect(tile.sRect, tile.fileSRect);
                            if (subsamplingScaleImageView.getsRegion() != null) {
                                tile.fileSRect.offset(subsamplingScaleImageView.getsRegion().left, subsamplingScaleImageView.getsRegion().top);
                            }
                            android.graphics.Bitmap decodeRegion = imageRegionDecoder.decodeRegion(tile.fileSRect, tile.sampleSize);
                            onEnd(subsamplingScaleImageView, tile);
                            return decodeRegion;
                        }
                        tile.loading = false;
                        subsamplingScaleImageView.getDecoderLock().readLock().unlock();
                    } finally {
                        subsamplingScaleImageView.getDecoderLock().readLock().unlock();
                    }
                } else if (tile != null) {
                    tile.loading = false;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(com.davemorrissey.labs.subscaleview.legacy.LegacyTileLoaderFactory.TAG, e17, "Failed to decode tile", new java.lang.Object[0]);
                this.exception = e17;
                this.decodeResult = new com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult(5, "decode tile failed");
            } catch (java.lang.OutOfMemoryError e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace(com.davemorrissey.labs.subscaleview.legacy.LegacyTileLoaderFactory.TAG, e18, "Failed to decode tile - OutOfMemoryError", new java.lang.Object[0]);
                this.exception = new java.lang.RuntimeException(e18);
                this.decodeResult = new com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult(6, "decode tile OutOfMemoryError");
                com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.setPreferredBitmapConfig(android.graphics.Bitmap.Config.RGB_565);
            }
            onEnd(this.viewRef.get(), this.tileRef.get());
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(android.graphics.Bitmap bitmap) {
            com.tencent.mars.xlog.Log.i(com.davemorrissey.labs.subscaleview.legacy.LegacyTileLoaderFactory.TAG, "onPostExecute %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            onExecuteEnd(bitmap);
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.model.ITileLoaderFactory
    public com.davemorrissey.labs.subscaleview.model.ILoadable newInstance(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView, com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder imageRegionDecoder, com.davemorrissey.labs.subscaleview.model.Tile tile) {
        return new com.davemorrissey.labs.subscaleview.legacy.LegacyTileLoaderFactory.LegacyTileLoadTaskWrapper(subsamplingScaleImageView, imageRegionDecoder, tile);
    }
}

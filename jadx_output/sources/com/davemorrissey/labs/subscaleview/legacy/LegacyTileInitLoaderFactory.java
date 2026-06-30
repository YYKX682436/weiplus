package com.davemorrissey.labs.subscaleview.legacy;

/* loaded from: classes15.dex */
public class LegacyTileInitLoaderFactory implements com.davemorrissey.labs.subscaleview.model.ITileInitLoaderFactory {
    private static final java.lang.String TAG = "MicroMsg.LegacyTileInitLoaderFactory";

    /* loaded from: classes15.dex */
    public static class LegacyTilesInitTaskWrapper extends android.os.AsyncTask<java.lang.Void, java.lang.Void, int[]> implements com.davemorrissey.labs.subscaleview.model.ILoadable {
        private final java.lang.ref.WeakReference<android.content.Context> contextRef;
        private com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult decodeResult;
        private com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder decoder;
        private final java.lang.ref.WeakReference<com.davemorrissey.labs.subscaleview.decoder.DecoderFactory<? extends com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder>> decoderFactoryRef;
        private java.lang.Exception exception;
        private long mStartLoadTime;
        private final android.net.Uri source;
        private final java.lang.ref.WeakReference<com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView> viewRef;

        public LegacyTilesInitTaskWrapper(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView, android.content.Context context, com.davemorrissey.labs.subscaleview.decoder.DecoderFactory<? extends com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder> decoderFactory, android.net.Uri uri) {
            this.viewRef = new java.lang.ref.WeakReference<>(subsamplingScaleImageView);
            this.contextRef = new java.lang.ref.WeakReference<>(context);
            this.decoderFactoryRef = new java.lang.ref.WeakReference<>(decoderFactory);
            this.source = uri;
        }

        private void onEnd(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView) {
            if (subsamplingScaleImageView == null || this.mStartLoadTime == -1) {
                return;
            }
            subsamplingScaleImageView.addTileInitTime((int) (java.lang.System.currentTimeMillis() - this.mStartLoadTime));
        }

        private void onExecuteEnd(int[] iArr) {
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
            if (subsamplingScaleImageView == null) {
                com.tencent.mars.xlog.Log.e(com.davemorrissey.labs.subscaleview.legacy.LegacyTileInitLoaderFactory.TAG, "TileInitTask onPostExecute view is null");
                return;
            }
            if (this.decoder != null && iArr != null && iArr.length == 3) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                subsamplingScaleImageView.onTilesInited(this.decoder, iArr[0], iArr[1], iArr[2]);
                subsamplingScaleImageView.addTileInitTime((int) (java.lang.System.currentTimeMillis() - currentTimeMillis));
            } else {
                if (this.exception == null || subsamplingScaleImageView.getOnImageEventListener() == null) {
                    return;
                }
                subsamplingScaleImageView.getOnImageEventListener().onImageLoadError(this.decodeResult);
            }
        }

        @Override // com.davemorrissey.labs.subscaleview.model.ILoadable
        public void cancel() {
        }

        @Override // com.davemorrissey.labs.subscaleview.model.ILoadable
        public void startLoad() {
            executeOnExecutor(this.viewRef.get().provideExecutor(), new java.lang.Void[0]);
        }

        @Override // android.os.AsyncTask
        public int[] doInBackground(java.lang.Void... voidArr) {
            this.mStartLoadTime = java.lang.System.currentTimeMillis();
            try {
                android.content.Context context = this.contextRef.get();
                com.davemorrissey.labs.subscaleview.decoder.DecoderFactory<? extends com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder> decoderFactory = this.decoderFactoryRef.get();
                com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
                if (context != null && decoderFactory != null && subsamplingScaleImageView != null) {
                    com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder make = decoderFactory.make();
                    this.decoder = make;
                    android.graphics.Point init = make.init(context, this.source);
                    int i17 = init.x;
                    int i18 = init.y;
                    int exifOrientation = subsamplingScaleImageView.getExifOrientation(context, this.source);
                    if (subsamplingScaleImageView.getsRegion() != null) {
                        android.graphics.Rect rect = subsamplingScaleImageView.getsRegion();
                        rect.left = java.lang.Math.max(0, rect.left);
                        rect.top = java.lang.Math.max(0, rect.top);
                        rect.right = java.lang.Math.min(i17, rect.right);
                        rect.bottom = java.lang.Math.min(i18, rect.bottom);
                        i17 = rect.width();
                        i18 = rect.height();
                        subsamplingScaleImageView.setsRegion(rect);
                    }
                    onEnd(subsamplingScaleImageView);
                    return new int[]{i17, i18, exifOrientation};
                }
            } catch (java.io.FileNotFoundException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(com.davemorrissey.labs.subscaleview.legacy.LegacyTileInitLoaderFactory.TAG, e17, "Failed to initialise bitmap decoder", new java.lang.Object[0]);
                this.exception = e17;
                this.decodeResult = new com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult(1, "tile init file not found");
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace(com.davemorrissey.labs.subscaleview.legacy.LegacyTileInitLoaderFactory.TAG, e18, "Failed to initialise bitmap decoder", new java.lang.Object[0]);
                this.exception = e18;
                this.decodeResult = new com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult(4, "tile init failed");
            }
            onEnd(this.viewRef.get());
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(int[] iArr) {
            onExecuteEnd(iArr);
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.model.ITileInitLoaderFactory
    public com.davemorrissey.labs.subscaleview.model.ILoadable newInstance(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView, android.content.Context context, com.davemorrissey.labs.subscaleview.decoder.DecoderFactory<? extends com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder> decoderFactory, android.net.Uri uri) {
        return new com.davemorrissey.labs.subscaleview.legacy.LegacyTileInitLoaderFactory.LegacyTilesInitTaskWrapper(subsamplingScaleImageView, context, decoderFactory, uri);
    }
}

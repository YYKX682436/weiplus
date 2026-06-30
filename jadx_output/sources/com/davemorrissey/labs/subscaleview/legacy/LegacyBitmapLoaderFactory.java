package com.davemorrissey.labs.subscaleview.legacy;

/* loaded from: classes15.dex */
public class LegacyBitmapLoaderFactory implements com.davemorrissey.labs.subscaleview.model.IBitmapLoaderFactory {
    private static final java.lang.String TAG = "MicroMsg.LegacyBitmapLoaderFactory";

    /* loaded from: classes15.dex */
    public static class BitmapLoaderWrapper extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Integer> implements com.davemorrissey.labs.subscaleview.model.ILoadable {
        private byte _hellAccFlag_;
        private android.graphics.Bitmap bitmap;
        private final java.lang.ref.WeakReference<android.content.Context> contextRef;
        private com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult decodeResult;
        private final java.lang.ref.WeakReference<com.davemorrissey.labs.subscaleview.decoder.DecoderFactory<? extends com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder>> decoderFactoryRef;
        private java.lang.Exception exception;
        private android.graphics.Rect mRect;
        private long mStartLoadTime = -1;
        private final boolean preview;
        private final android.net.Uri source;
        private final java.lang.ref.WeakReference<com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView> viewRef;

        public BitmapLoaderWrapper(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView, android.content.Context context, com.davemorrissey.labs.subscaleview.decoder.DecoderFactory<? extends com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder> decoderFactory, android.net.Uri uri, boolean z17) {
            this.viewRef = new java.lang.ref.WeakReference<>(subsamplingScaleImageView);
            this.contextRef = new java.lang.ref.WeakReference<>(context);
            this.decoderFactoryRef = new java.lang.ref.WeakReference<>(decoderFactory);
            this.source = uri;
            this.preview = z17;
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                java.io.InputStream D = com.tencent.mm.vfs.w6.D(new com.tencent.mm.vfs.z7(uri), null);
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(options);
                    arrayList.add(null);
                    arrayList.add(D);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/davemorrissey/labs/subscaleview/legacy/LegacyBitmapLoaderFactory$BitmapLoaderWrapper", "<init>", "(Lcom/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView;Landroid/content/Context;Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;Landroid/net/Uri;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                    yj0.a.e(obj, android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0), (android.graphics.Rect) arrayList.get(1), (android.graphics.BitmapFactory.Options) arrayList.get(2)), "com/davemorrissey/labs/subscaleview/legacy/LegacyBitmapLoaderFactory$BitmapLoaderWrapper", "<init>", "(Lcom/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView;Landroid/content/Context;Lcom/davemorrissey/labs/subscaleview/decoder/DecoderFactory;Landroid/net/Uri;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                    if (D != null) {
                        D.close();
                    }
                } finally {
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(com.davemorrissey.labs.subscaleview.legacy.LegacyBitmapLoaderFactory.TAG, e17, "Unable to read file: %s", uri.toString());
            }
            this.mRect = new android.graphics.Rect(0, 0, options.outWidth, options.outHeight);
        }

        private void onEnd(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView) {
            if (subsamplingScaleImageView == null || !this.preview || this.mStartLoadTime == -1) {
                return;
            }
            com.tencent.mars.xlog.Log.i(com.davemorrissey.labs.subscaleview.legacy.LegacyBitmapLoaderFactory.TAG, "preview decode onEnd %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            subsamplingScaleImageView.addPreviewLoadedTime((int) (java.lang.System.currentTimeMillis() - this.mStartLoadTime));
        }

        private void onExecuteEnd(java.lang.Integer num) {
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
            if (subsamplingScaleImageView != null) {
                android.graphics.Bitmap bitmap = this.bitmap;
                if (bitmap != null && num != null) {
                    if (this.preview) {
                        subsamplingScaleImageView.onPreviewLoaded(bitmap, num);
                        return;
                    } else {
                        subsamplingScaleImageView.onImageLoaded(bitmap, num.intValue(), false);
                        return;
                    }
                }
                if (this.exception == null || subsamplingScaleImageView.getOnImageEventListener() == null) {
                    return;
                }
                if (this.preview) {
                    subsamplingScaleImageView.getOnImageEventListener().onPreviewLoadError(this.decodeResult);
                } else {
                    subsamplingScaleImageView.getOnImageEventListener().onImageLoadError(this.decodeResult);
                }
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
        public java.lang.Integer doInBackground(java.lang.Void... voidArr) {
            com.tencent.mars.xlog.Log.i(com.davemorrissey.labs.subscaleview.legacy.LegacyBitmapLoaderFactory.TAG, "preview decode start");
            if (this.preview) {
                this.mStartLoadTime = java.lang.System.currentTimeMillis();
            }
            try {
                android.content.Context context = this.contextRef.get();
                com.davemorrissey.labs.subscaleview.decoder.DecoderFactory<? extends com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder> decoderFactory = this.decoderFactoryRef.get();
                com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.viewRef.get();
                if (context != null && decoderFactory != null && subsamplingScaleImageView != null) {
                    subsamplingScaleImageView.debug("BitmapLoadTask.doInBackground", new java.lang.Object[0]);
                    com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder make = decoderFactory.make();
                    make.init(context, this.source);
                    this.bitmap = make.decodeRegion(this.mRect, 1);
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(subsamplingScaleImageView.getExifOrientation(context, this.source));
                    make.recycle();
                    onEnd(subsamplingScaleImageView);
                    return valueOf;
                }
            } catch (java.io.FileNotFoundException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(com.davemorrissey.labs.subscaleview.legacy.LegacyBitmapLoaderFactory.TAG, e17, "Failed to initialise bitmap decoder", new java.lang.Object[0]);
                this.exception = e17;
                this.decodeResult = new com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult(1, "tile init file not found");
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace(com.davemorrissey.labs.subscaleview.legacy.LegacyBitmapLoaderFactory.TAG, e18, "Failed to load bitmap", new java.lang.Object[0]);
                this.exception = e18;
                this.decodeResult = new com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult(2, "bitmap decode failed");
            } catch (java.lang.OutOfMemoryError e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace(com.davemorrissey.labs.subscaleview.legacy.LegacyBitmapLoaderFactory.TAG, e19, "Failed to load bitmap - OutOfMemoryError", new java.lang.Object[0]);
                this.exception = new java.lang.RuntimeException(e19);
                this.decodeResult = new com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult(3, "bitmap decode OutOfMemoryError");
                com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.setPreferredBitmapConfig(android.graphics.Bitmap.Config.RGB_565);
            }
            onEnd(this.viewRef.get());
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(java.lang.Integer num) {
            com.tencent.mars.xlog.Log.i(com.davemorrissey.labs.subscaleview.legacy.LegacyBitmapLoaderFactory.TAG, "preview decode onPostExecute %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            onExecuteEnd(num);
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.model.IBitmapLoaderFactory
    public com.davemorrissey.labs.subscaleview.model.ILoadable newInstance(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView, android.content.Context context, com.davemorrissey.labs.subscaleview.decoder.DecoderFactory<? extends com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder> decoderFactory, android.net.Uri uri, boolean z17) {
        return new com.davemorrissey.labs.subscaleview.legacy.LegacyBitmapLoaderFactory.BitmapLoaderWrapper(subsamplingScaleImageView, context, decoderFactory, uri, z17);
    }
}

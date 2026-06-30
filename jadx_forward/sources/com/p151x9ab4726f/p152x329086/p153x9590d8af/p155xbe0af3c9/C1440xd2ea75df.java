package com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9;

/* renamed from: com.davemorrissey.labs.subscaleview.legacy.LegacyBitmapLoaderFactory */
/* loaded from: classes15.dex */
public class C1440xd2ea75df implements com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1443x7d6b97f {
    private static final java.lang.String TAG = "MicroMsg.LegacyBitmapLoaderFactory";

    /* renamed from: com.davemorrissey.labs.subscaleview.legacy.LegacyBitmapLoaderFactory$BitmapLoaderWrapper */
    /* loaded from: classes15.dex */
    public static class BitmapLoaderWrapper extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Integer> implements com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1444xb96582a9 {

        /* renamed from: _hellAccFlag_ */
        private byte f4453x7f11beae;

        /* renamed from: bitmap */
        private android.graphics.Bitmap f4454xad38f12f;

        /* renamed from: contextRef */
        private final java.lang.ref.WeakReference<android.content.Context> f4455x10517864;

        /* renamed from: decodeResult */
        private com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 f4456x862f9bab;

        /* renamed from: decoderFactoryRef */
        private final java.lang.ref.WeakReference<com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1433xf1915446<? extends com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135>> f4457x945afe8d;

        /* renamed from: exception */
        private java.lang.Exception f4458x584fd04f;

        /* renamed from: mRect */
        private android.graphics.Rect f4459x626cff1;

        /* renamed from: mStartLoadTime */
        private long f4460xd0a357e8 = -1;

        /* renamed from: preview */
        private final boolean f4461xed08e3c8;

        /* renamed from: source */
        private final android.net.Uri f4462xca90681b;

        /* renamed from: viewRef */
        private final java.lang.ref.WeakReference<com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d> f4463x1b12c7ae;

        public BitmapLoaderWrapper(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d, android.content.Context context, com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1433xf1915446<? extends com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135> interfaceC1433xf1915446, android.net.Uri uri, boolean z17) {
            this.f4463x1b12c7ae = new java.lang.ref.WeakReference<>(c1451x2b77465d);
            this.f4455x10517864 = new java.lang.ref.WeakReference<>(context);
            this.f4457x945afe8d = new java.lang.ref.WeakReference<>(interfaceC1433xf1915446);
            this.f4462xca90681b = uri;
            this.f4461xed08e3c8 = z17;
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                java.io.InputStream D = com.p314xaae8f345.mm.vfs.w6.D(new com.p314xaae8f345.mm.vfs.z7(uri), null);
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1440xd2ea75df.TAG, e17, "Unable to read file: %s", uri.toString());
            }
            this.f4459x626cff1 = new android.graphics.Rect(0, 0, options.outWidth, options.outHeight);
        }

        /* renamed from: onEnd */
        private void m15502x64f427c(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d) {
            if (c1451x2b77465d == null || !this.f4461xed08e3c8 || this.f4460xd0a357e8 == -1) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1440xd2ea75df.TAG, "preview decode onEnd %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            c1451x2b77465d.m15640xb6930fb9((int) (java.lang.System.currentTimeMillis() - this.f4460xd0a357e8));
        }

        /* renamed from: onExecuteEnd */
        private void m15503xe7434865(java.lang.Integer num) {
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f4463x1b12c7ae.get();
            if (c1451x2b77465d != null) {
                android.graphics.Bitmap bitmap = this.f4454xad38f12f;
                if (bitmap != null && num != null) {
                    if (this.f4461xed08e3c8) {
                        c1451x2b77465d.m15688x3c79ee4e(bitmap, num);
                        return;
                    } else {
                        c1451x2b77465d.m15687x91f79de1(bitmap, num.intValue(), false);
                        return;
                    }
                }
                if (this.f4458x584fd04f == null || c1451x2b77465d.m15663xac3da088() == null) {
                    return;
                }
                if (this.f4461xed08e3c8) {
                    c1451x2b77465d.m15663xac3da088().mo15807xaf7fedd9(this.f4456x862f9bab);
                } else {
                    c1451x2b77465d.m15663xac3da088().mo15805x5cb2b166(this.f4456x862f9bab);
                }
            }
        }

        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1444xb96582a9
        /* renamed from: cancel */
        public void mo15504xae7a2e7a() {
        }

        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1444xb96582a9
        /* renamed from: startLoad */
        public void mo15505x8111fc68() {
            executeOnExecutor(this.f4463x1b12c7ae.get().m15692x5691fa94(), new java.lang.Void[0]);
        }

        @Override // android.os.AsyncTask
        public java.lang.Integer doInBackground(java.lang.Void... voidArr) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1440xd2ea75df.TAG, "preview decode start");
            if (this.f4461xed08e3c8) {
                this.f4460xd0a357e8 = java.lang.System.currentTimeMillis();
            }
            try {
                android.content.Context context = this.f4455x10517864.get();
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1433xf1915446<? extends com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135> interfaceC1433xf1915446 = this.f4457x945afe8d.get();
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f4463x1b12c7ae.get();
                if (context != null && interfaceC1433xf1915446 != null && c1451x2b77465d != null) {
                    c1451x2b77465d.m15646x5b09653("BitmapLoadTask.doInBackground", new java.lang.Object[0]);
                    com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135 mo15467x3305ee = interfaceC1433xf1915446.mo15467x3305ee();
                    mo15467x3305ee.mo15471x316510(context, this.f4462xca90681b);
                    this.f4454xad38f12f = mo15467x3305ee.mo15470x8629fa82(this.f4459x626cff1, 1);
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(c1451x2b77465d.m15653x2a0b6c6a(context, this.f4462xca90681b));
                    mo15467x3305ee.mo15473x408b7293();
                    m15502x64f427c(c1451x2b77465d);
                    return valueOf;
                }
            } catch (java.io.FileNotFoundException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1440xd2ea75df.TAG, e17, "Failed to initialise bitmap decoder", new java.lang.Object[0]);
                this.f4458x584fd04f = e17;
                this.f4456x862f9bab = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886(1, "tile init file not found");
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1440xd2ea75df.TAG, e18, "Failed to load bitmap", new java.lang.Object[0]);
                this.f4458x584fd04f = e18;
                this.f4456x862f9bab = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886(2, "bitmap decode failed");
            } catch (java.lang.OutOfMemoryError e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1440xd2ea75df.TAG, e19, "Failed to load bitmap - OutOfMemoryError", new java.lang.Object[0]);
                this.f4458x584fd04f = new java.lang.RuntimeException(e19);
                this.f4456x862f9bab = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886(3, "bitmap decode OutOfMemoryError");
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.m15627x6626ad30(android.graphics.Bitmap.Config.RGB_565);
            }
            m15502x64f427c(this.f4463x1b12c7ae.get());
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(java.lang.Integer num) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1440xd2ea75df.TAG, "preview decode onPostExecute %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            m15503xe7434865(num);
        }
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1443x7d6b97f
    /* renamed from: newInstance */
    public com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1444xb96582a9 mo15501x6bff0255(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d, android.content.Context context, com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1433xf1915446<? extends com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135> interfaceC1433xf1915446, android.net.Uri uri, boolean z17) {
        return new com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1440xd2ea75df.BitmapLoaderWrapper(c1451x2b77465d, context, interfaceC1433xf1915446, uri, z17);
    }
}

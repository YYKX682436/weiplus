package com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9;

/* renamed from: com.davemorrissey.labs.subscaleview.legacy.LegacyTileInitLoaderFactory */
/* loaded from: classes15.dex */
public class C1441x2682fcd0 implements com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1445xd16cd870 {
    private static final java.lang.String TAG = "MicroMsg.LegacyTileInitLoaderFactory";

    /* renamed from: com.davemorrissey.labs.subscaleview.legacy.LegacyTileInitLoaderFactory$LegacyTilesInitTaskWrapper */
    /* loaded from: classes15.dex */
    public static class LegacyTilesInitTaskWrapper extends android.os.AsyncTask<java.lang.Void, java.lang.Void, int[]> implements com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1444xb96582a9 {

        /* renamed from: contextRef */
        private final java.lang.ref.WeakReference<android.content.Context> f4464x10517864;

        /* renamed from: decodeResult */
        private com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 f4465x862f9bab;

        /* renamed from: decoder */
        private com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135 f4466x5befac44;

        /* renamed from: decoderFactoryRef */
        private final java.lang.ref.WeakReference<com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1433xf1915446<? extends com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135>> f4467x945afe8d;

        /* renamed from: exception */
        private java.lang.Exception f4468x584fd04f;

        /* renamed from: mStartLoadTime */
        private long f4469xd0a357e8;

        /* renamed from: source */
        private final android.net.Uri f4470xca90681b;

        /* renamed from: viewRef */
        private final java.lang.ref.WeakReference<com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d> f4471x1b12c7ae;

        public LegacyTilesInitTaskWrapper(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d, android.content.Context context, com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1433xf1915446<? extends com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135> interfaceC1433xf1915446, android.net.Uri uri) {
            this.f4471x1b12c7ae = new java.lang.ref.WeakReference<>(c1451x2b77465d);
            this.f4464x10517864 = new java.lang.ref.WeakReference<>(context);
            this.f4467x945afe8d = new java.lang.ref.WeakReference<>(interfaceC1433xf1915446);
            this.f4470xca90681b = uri;
        }

        /* renamed from: onEnd */
        private void m15507x64f427c(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d) {
            if (c1451x2b77465d == null || this.f4469xd0a357e8 == -1) {
                return;
            }
            c1451x2b77465d.m15642xabe2300c((int) (java.lang.System.currentTimeMillis() - this.f4469xd0a357e8));
        }

        /* renamed from: onExecuteEnd */
        private void m15508xe7434865(int[] iArr) {
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f4471x1b12c7ae.get();
            if (c1451x2b77465d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1441x2682fcd0.TAG, "TileInitTask onPostExecute view is null");
                return;
            }
            if (this.f4466x5befac44 != null && iArr != null && iArr.length == 3) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                c1451x2b77465d.m15691x95426e35(this.f4466x5befac44, iArr[0], iArr[1], iArr[2]);
                c1451x2b77465d.m15642xabe2300c((int) (java.lang.System.currentTimeMillis() - currentTimeMillis));
            } else {
                if (this.f4468x584fd04f == null || c1451x2b77465d.m15663xac3da088() == null) {
                    return;
                }
                c1451x2b77465d.m15663xac3da088().mo15805x5cb2b166(this.f4465x862f9bab);
            }
        }

        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1444xb96582a9
        /* renamed from: cancel */
        public void mo15504xae7a2e7a() {
        }

        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1444xb96582a9
        /* renamed from: startLoad */
        public void mo15505x8111fc68() {
            executeOnExecutor(this.f4471x1b12c7ae.get().m15692x5691fa94(), new java.lang.Void[0]);
        }

        @Override // android.os.AsyncTask
        public int[] doInBackground(java.lang.Void... voidArr) {
            this.f4469xd0a357e8 = java.lang.System.currentTimeMillis();
            try {
                android.content.Context context = this.f4464x10517864.get();
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1433xf1915446<? extends com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135> interfaceC1433xf1915446 = this.f4467x945afe8d.get();
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f4471x1b12c7ae.get();
                if (context != null && interfaceC1433xf1915446 != null && c1451x2b77465d != null) {
                    com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135 mo15467x3305ee = interfaceC1433xf1915446.mo15467x3305ee();
                    this.f4466x5befac44 = mo15467x3305ee;
                    android.graphics.Point mo15471x316510 = mo15467x3305ee.mo15471x316510(context, this.f4470xca90681b);
                    int i17 = mo15471x316510.x;
                    int i18 = mo15471x316510.y;
                    int m15653x2a0b6c6a = c1451x2b77465d.m15653x2a0b6c6a(context, this.f4470xca90681b);
                    if (c1451x2b77465d.m15674x2fae5531() != null) {
                        android.graphics.Rect m15674x2fae5531 = c1451x2b77465d.m15674x2fae5531();
                        m15674x2fae5531.left = java.lang.Math.max(0, m15674x2fae5531.left);
                        m15674x2fae5531.top = java.lang.Math.max(0, m15674x2fae5531.top);
                        m15674x2fae5531.right = java.lang.Math.min(i17, m15674x2fae5531.right);
                        m15674x2fae5531.bottom = java.lang.Math.min(i18, m15674x2fae5531.bottom);
                        i17 = m15674x2fae5531.width();
                        i18 = m15674x2fae5531.height();
                        c1451x2b77465d.m15749xa31fa2a5(m15674x2fae5531);
                    }
                    m15507x64f427c(c1451x2b77465d);
                    return new int[]{i17, i18, m15653x2a0b6c6a};
                }
            } catch (java.io.FileNotFoundException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1441x2682fcd0.TAG, e17, "Failed to initialise bitmap decoder", new java.lang.Object[0]);
                this.f4468x584fd04f = e17;
                this.f4465x862f9bab = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886(1, "tile init file not found");
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1441x2682fcd0.TAG, e18, "Failed to initialise bitmap decoder", new java.lang.Object[0]);
                this.f4468x584fd04f = e18;
                this.f4465x862f9bab = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886(4, "tile init failed");
            }
            m15507x64f427c(this.f4471x1b12c7ae.get());
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(int[] iArr) {
            m15508xe7434865(iArr);
        }
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1445xd16cd870
    /* renamed from: newInstance */
    public com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1444xb96582a9 mo15506x6bff0255(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d, android.content.Context context, com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1433xf1915446<? extends com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135> interfaceC1433xf1915446, android.net.Uri uri) {
        return new com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1441x2682fcd0.LegacyTilesInitTaskWrapper(c1451x2b77465d, context, interfaceC1433xf1915446, uri);
    }
}

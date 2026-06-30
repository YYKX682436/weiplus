package com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9;

/* renamed from: com.davemorrissey.labs.subscaleview.legacy.LegacyTileLoaderFactory */
/* loaded from: classes15.dex */
public class C1442x42812480 implements com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1446xeee9d020 {
    private static final java.lang.String TAG = "MicroMsg.LegacyTileLoaderFactory";

    /* renamed from: com.davemorrissey.labs.subscaleview.legacy.LegacyTileLoaderFactory$LegacyTileLoadTaskWrapper */
    /* loaded from: classes15.dex */
    public static class LegacyTileLoadTaskWrapper extends android.os.AsyncTask<java.lang.Void, java.lang.Void, android.graphics.Bitmap> implements com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1444xb96582a9 {

        /* renamed from: decodeResult */
        private com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886 f4472x862f9bab;

        /* renamed from: decoderRef */
        private final java.lang.ref.WeakReference<com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135> f4473xb800fdaf;

        /* renamed from: exception */
        private java.lang.Exception f4474x584fd04f;

        /* renamed from: tileRef */
        private final java.lang.ref.WeakReference<com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce> f4477xb1a0c705;

        /* renamed from: viewRef */
        private final java.lang.ref.WeakReference<com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d> f4478x1b12c7ae;

        /* renamed from: mStartTime */
        private long f4476xfbccd462 = -1;

        /* renamed from: isCancelled */
        private boolean f4475x62a56b47 = false;

        public LegacyTileLoadTaskWrapper(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d, com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135 interfaceC1436x56c1b135, com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce c1447x27c6ce) {
            this.f4478x1b12c7ae = new java.lang.ref.WeakReference<>(c1451x2b77465d);
            this.f4473xb800fdaf = new java.lang.ref.WeakReference<>(interfaceC1436x56c1b135);
            this.f4477xb1a0c705 = new java.lang.ref.WeakReference<>(c1447x27c6ce);
            c1447x27c6ce.f4481x1410e13c = true;
        }

        /* renamed from: onEnd */
        private void m15510x64f427c(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d, com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce c1447x27c6ce) {
            if (c1451x2b77465d == null) {
                return;
            }
            c1451x2b77465d.m15723x7a11beb0();
            if (c1447x27c6ce == null || this.f4476xfbccd462 == -1 || c1451x2b77465d.m15656xd2a5d6c1() != c1447x27c6ce.f4483x887e4cb) {
                return;
            }
            c1451x2b77465d.m15641xe382f62a((int) (java.lang.System.currentTimeMillis() - this.f4476xfbccd462));
        }

        /* renamed from: onExecuteEnd */
        private void m15511xe7434865(android.graphics.Bitmap bitmap) {
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f4478x1b12c7ae.get();
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce c1447x27c6ce = this.f4477xb1a0c705.get();
            if (c1451x2b77465d == null || c1447x27c6ce == null) {
                return;
            }
            if (bitmap != null) {
                c1447x27c6ce.f4479xad38f12f = bitmap;
                c1447x27c6ce.f4481x1410e13c = false;
                c1451x2b77465d.m15690x82449392(c1447x27c6ce);
            } else {
                if (this.f4474x584fd04f == null || c1451x2b77465d.m15663xac3da088() == null) {
                    return;
                }
                c1451x2b77465d.m15663xac3da088().mo15811x68961215(this.f4472x862f9bab);
            }
        }

        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1444xb96582a9
        /* renamed from: cancel */
        public void mo15504xae7a2e7a() {
            try {
                cancel(true);
                this.f4475x62a56b47 = true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1442x42812480.TAG, e17, "TileLoaderTask cancel exception", new java.lang.Object[0]);
            }
        }

        @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1444xb96582a9
        /* renamed from: startLoad */
        public void mo15505x8111fc68() {
            executeOnExecutor(this.f4478x1b12c7ae.get().m15692x5691fa94(), new java.lang.Void[0]);
        }

        @Override // android.os.AsyncTask
        public android.graphics.Bitmap doInBackground(java.lang.Void... voidArr) {
            if (this.f4478x1b12c7ae.get() != null && this.f4477xb1a0c705.get() != null && this.f4478x1b12c7ae.get().m15656xd2a5d6c1() == this.f4477xb1a0c705.get().f4483x887e4cb) {
                this.f4476xfbccd462 = java.lang.System.currentTimeMillis();
            }
            try {
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f4478x1b12c7ae.get();
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135 interfaceC1436x56c1b135 = this.f4473xb800fdaf.get();
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce c1447x27c6ce = this.f4477xb1a0c705.get();
                if (interfaceC1436x56c1b135 != null && c1447x27c6ce != null && c1451x2b77465d != null && interfaceC1436x56c1b135.mo15472x7b5e8699() && c1447x27c6ce.f4485x1bd1f072) {
                    c1451x2b77465d.m15652x21f26a59().readLock().lock();
                    try {
                        if (interfaceC1436x56c1b135.mo15472x7b5e8699()) {
                            c1451x2b77465d.m15648xb0d284db(c1447x27c6ce.f4482x67b5cf7, c1447x27c6ce.f4480xb0d284db);
                            if (c1451x2b77465d.m15674x2fae5531() != null) {
                                c1447x27c6ce.f4480xb0d284db.offset(c1451x2b77465d.m15674x2fae5531().left, c1451x2b77465d.m15674x2fae5531().top);
                            }
                            android.graphics.Bitmap mo15470x8629fa82 = interfaceC1436x56c1b135.mo15470x8629fa82(c1447x27c6ce.f4480xb0d284db, c1447x27c6ce.f4483x887e4cb);
                            m15510x64f427c(c1451x2b77465d, c1447x27c6ce);
                            return mo15470x8629fa82;
                        }
                        c1447x27c6ce.f4481x1410e13c = false;
                        c1451x2b77465d.m15652x21f26a59().readLock().unlock();
                    } finally {
                        c1451x2b77465d.m15652x21f26a59().readLock().unlock();
                    }
                } else if (c1447x27c6ce != null) {
                    c1447x27c6ce.f4481x1410e13c = false;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1442x42812480.TAG, e17, "Failed to decode tile", new java.lang.Object[0]);
                this.f4474x584fd04f = e17;
                this.f4472x862f9bab = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886(5, "decode tile failed");
            } catch (java.lang.OutOfMemoryError e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1442x42812480.TAG, e18, "Failed to decode tile - OutOfMemoryError", new java.lang.Object[0]);
                this.f4474x584fd04f = new java.lang.RuntimeException(e18);
                this.f4472x862f9bab = new com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.C1434xa197a886(6, "decode tile OutOfMemoryError");
                com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.m15627x6626ad30(android.graphics.Bitmap.Config.RGB_565);
            }
            m15510x64f427c(this.f4478x1b12c7ae.get(), this.f4477xb1a0c705.get());
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(android.graphics.Bitmap bitmap) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1442x42812480.TAG, "onPostExecute %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            m15511xe7434865(bitmap);
        }
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1446xeee9d020
    /* renamed from: newInstance */
    public com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.InterfaceC1444xb96582a9 mo15509x6bff0255(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d, com.p151x9ab4726f.p152x329086.p153x9590d8af.p154x5befac44.InterfaceC1436x56c1b135 interfaceC1436x56c1b135, com.p151x9ab4726f.p152x329086.p153x9590d8af.p156x633fb29.C1447x27c6ce c1447x27c6ce) {
        return new com.p151x9ab4726f.p152x329086.p153x9590d8af.p155xbe0af3c9.C1442x42812480.LegacyTileLoadTaskWrapper(c1451x2b77465d, interfaceC1436x56c1b135, c1447x27c6ce);
    }
}

package i72;

/* loaded from: classes14.dex */
public class c extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f370948a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a, i72.a aVar) {
        super(android.os.Looper.getMainLooper());
        this.f370948a = new java.lang.ref.WeakReference(textureViewSurfaceTextureListenerC13526x5bf79f0a);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17;
        java.lang.ref.WeakReference weakReference = this.f370948a;
        if (weakReference == null || weakReference.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectCameraView", "hy: no referenced view. exit");
            return;
        }
        boolean z17 = true;
        if (message.what == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13513x253b41f8 c13513x253b41f8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13513x253b41f8) message.obj;
            int i18 = c13513x253b41f8.f181481d;
            if (i18 <= 0) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a) this.f370948a.get()).f181630h != null) {
                    i72.n nVar = (i72.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a) this.f370948a.get()).f181630h;
                    nVar.getClass();
                    c13513x253b41f8.m55227x9616526c();
                    if (!nVar.f370961a.f181660o) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba45 = nVar.f370961a;
                        if (!c13528xdd12ba45.f181661p) {
                            e72.h hVar = c13528xdd12ba45.f181658m;
                            if (hVar != null && hVar.g(c13513x253b41f8)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectView", "hy: motion eat result");
                                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba452 = nVar.f370961a;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45.a(c13528xdd12ba452, c13528xdd12ba452.f181658m.d());
                                return;
                            }
                            nVar.f370961a.getClass();
                            e72.h hVar2 = nVar.f370961a.f181658m;
                            if (hVar2 == null || !hVar2.i()) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba453 = nVar.f370961a;
                                c13528xdd12ba453.getClass();
                                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                                if (elapsedRealtime - c13528xdd12ba453.f181665t > 1500) {
                                    c13528xdd12ba453.f181665t = elapsedRealtime;
                                } else {
                                    z17 = false;
                                }
                                if (!z17) {
                                    return;
                                }
                            }
                            nVar.f370961a.c();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45.b(nVar.f370961a);
                            return;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceDetectView", "hy: already end pr paused");
                    return;
                }
                return;
            }
            if (i18 > 0 && i18 < 10) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a) this.f370948a.get()).f181630h != null) {
                    i72.y yVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a) this.f370948a.get()).f181630h;
                    int i19 = c13513x253b41f8.f181481d;
                    java.lang.String str = c13513x253b41f8.f181482e;
                    i72.n nVar2 = (i72.n) yVar;
                    nVar2.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectView", "hy: onDetectError: %d, %s", java.lang.Integer.valueOf(i19), str);
                    if (!nVar2.f370961a.f181660o) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba454 = nVar2.f370961a;
                        if (!c13528xdd12ba454.f181661p) {
                            e72.h hVar3 = c13528xdd12ba454.f181658m;
                            if (hVar3 != null && hVar3.f(i19, str)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectView", "hy: motion eat result");
                                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba455 = nVar2.f370961a;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45.a(c13528xdd12ba455, c13528xdd12ba455.f181658m.d());
                                return;
                            }
                            nVar2.f370961a.f(false, null);
                            nVar2.f370961a.getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba456 = nVar2.f370961a;
                            c13528xdd12ba456.e(str != null ? str : c13528xdd12ba456.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6l));
                            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba457 = nVar2.f370961a;
                            i72.x xVar = c13528xdd12ba457.f181657i;
                            if (xVar != null) {
                                if (str == null) {
                                    str = c13528xdd12ba457.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6l);
                                }
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614) xVar).V6(i19, str);
                                return;
                            }
                            return;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceDetectView", "hy: already end or paused");
                    return;
                }
                return;
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a) this.f370948a.get()).f181630h != null) {
                i72.n nVar3 = (i72.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a) this.f370948a.get()).f181630h;
                nVar3.getClass();
                java.lang.String str2 = c13513x253b41f8.f181482e;
                if (!nVar3.f370961a.f181660o) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba458 = nVar3.f370961a;
                    if (!c13528xdd12ba458.f181661p) {
                        e72.h hVar4 = c13528xdd12ba458.f181658m;
                        if (hVar4 != null && hVar4.c(c13513x253b41f8)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectView", "hy: motion eat result");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba459 = nVar3.f370961a;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45.a(c13528xdd12ba459, c13528xdd12ba459.f181658m.d());
                            return;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45.b(nVar3.f370961a);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba4510 = nVar3.f370961a;
                        c13528xdd12ba4510.getClass();
                        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                        if (elapsedRealtime2 - c13528xdd12ba4510.f181665t > 1500) {
                            c13528xdd12ba4510.f181665t = elapsedRealtime2;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba4511 = nVar3.f370961a;
                            if (c13528xdd12ba4511.f181662q || !((i17 = c13513x253b41f8.f181481d) == 10 || i17 == 11)) {
                                if (str2 == null) {
                                    str2 = "";
                                }
                                c13528xdd12ba4511.e(str2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceDetectView", "hy: already end");
            }
        }
    }
}

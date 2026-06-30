package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29;

/* loaded from: classes15.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f243967d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s f243968e;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.b bVar) {
        this.f243968e = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f243968e.g();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar = this.f243968e;
        com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544 interfaceC10689xe9fde544 = (com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar2 = this.f243968e;
        boolean z17 = false;
        sVar.f243982e = interfaceC10689xe9fde544.mo10230xc14e3efd(sVar2.f243980c, 1 == sVar2.f243979b ? 0 : 1, 1, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar3 = this.f243968e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayController", "SightVideoJNI.openFile mVideoPath:%s mVideoId:%s", sVar3.f243980c, java.lang.Integer.valueOf(sVar3.f243982e));
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar4 = this.f243968e;
        ((java.util.concurrent.ConcurrentLinkedQueue) sVar4.f243983f).offer(java.lang.Integer.valueOf(sVar4.f243982e));
        if (this.f243968e.f243982e < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightPlayController", "#0x%x-#0x%x error video id %d, path %s", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f243968e.hashCode()), java.lang.Integer.valueOf(this.f243968e.f243982e), this.f243968e.f243980c);
            this.f243968e.d(null);
            if (this.f243968e.F != null) {
                this.f243968e.F.a(this.f243968e, -1);
                return;
            }
            return;
        }
        int max = java.lang.Math.max(1, ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10226x8d5c7601(this.f243968e.f243982e));
        int max2 = java.lang.Math.max(1, ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10221x463504c(this.f243968e.f243982e));
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar5 = this.f243968e;
        if (sVar5.f243979b == 0) {
            if (sVar5.f244000w) {
                if (max * max2 > 2073600 || max <= 0 || max2 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightPlayController", "get error info for ad,  videoWidth %d height  %d", java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2));
                    return;
                }
            } else if (max * max2 >= 1048576 || max <= 0 || max2 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightPlayController", "get error info videoWidth %d height  %d", java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2));
                return;
            }
            sVar5.hashCode();
            android.graphics.Bitmap bitmap = sVar5.f243985h;
            if (bitmap == null) {
                sVar5.f243985h = com.p314xaae8f345.mm.p872xbfc2bd01.u.f150514d.m(new com.p314xaae8f345.mm.p872xbfc2bd01.t(max, max2));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.SightPlayController", "checkBmp, create new one, videoPath: %s", sVar5.f243980c);
            } else if (bitmap.getWidth() != max || sVar5.f243985h.getHeight() != max2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightPlayController", "reset bmp, old value " + sVar5.f243985h.getWidth() + "*" + sVar5.f243985h.getHeight());
                if (fp.h.c(19) && sVar5.f243985h.getAllocationByteCount() >= max2 * max * 4) {
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightPlayController", "reset bmp, try directly reconfigure");
                        sVar5.f243985h.reconfigure(max, max2, android.graphics.Bitmap.Config.ARGB_8888);
                        z17 = true;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightPlayController", "reconfigure failed: %s" + e17.getMessage());
                    }
                }
                if (!z17) {
                    com.p314xaae8f345.mm.p872xbfc2bd01.u uVar = com.p314xaae8f345.mm.p872xbfc2bd01.u.f150514d;
                    uVar.n(sVar5.f243985h);
                    sVar5.f243985h = uVar.m(new com.p314xaae8f345.mm.p872xbfc2bd01.t(max, max2));
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.SightPlayController", "checkBmp, the origin bmp size not match, create new one, videoPath: %s", sVar5.f243980c);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar6 = this.f243968e;
        sVar6.getClass();
        sVar6.f243984g = 1000 / java.lang.Math.max(1, (int) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10224x4edf9145(sVar6.f243982e));
        sVar6.hashCode();
        float f17 = max;
        float f18 = max2;
        if (java.lang.Float.compare(f17 / f18, 5.0f) > 0 || java.lang.Float.compare(f18 / f17, 5.0f) > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightPlayController", "ERROR Video size %d, %d", java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f243968e.f243980c)) {
                ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s.H).put(this.f243968e.f243980c, 2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar7 = this.f243968e;
            sVar7.f243988k = 0L;
            sVar7.e(sVar7.f243983f);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar8 = this.f243968e;
            sVar8.f243982e = -1;
            sVar8.f243980c = "";
            sVar8.f243981d = "ERROR#PATH";
            sVar8.getClass();
            this.f243967d = true;
            if (this.f243968e.F != null) {
                this.f243968e.F.a(this.f243968e, -1);
                return;
            }
            return;
        }
        m34.g gVar = (m34.g) this.f243968e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f c17689x58a87b4f = (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f) gVar.I.get();
        if (c17689x58a87b4f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightPlayImageView", "onGetVideoSizeEnd, imageView is null, do clear");
            gVar.c();
        } else if (!c17689x58a87b4f.P) {
            c17689x58a87b4f.f244022J = max;
            c17689x58a87b4f.K = max2;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c17689x58a87b4f.L;
            if (a4Var != null) {
                a4Var.T4(max, max2);
            }
            if (c17689x58a87b4f.H > 0) {
                android.view.ViewGroup.LayoutParams layoutParams = c17689x58a87b4f.getLayoutParams();
                int i17 = layoutParams.width;
                int i18 = c17689x58a87b4f.H;
                if (i17 != i18 || layoutParams.height != (i18 * max2) / max) {
                    layoutParams.width = i18;
                    layoutParams.height = (i18 * max2) / max;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new m34.f(gVar, c17689x58a87b4f, layoutParams));
                    c17689x58a87b4f.postInvalidate();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayImageView", "onGetVideoSize::params width %d height %d", java.lang.Integer.valueOf(layoutParams.width), java.lang.Integer.valueOf(layoutParams.height));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayImageView", "onGetVideoSize::DrawWidth %d, video size %d*%d", java.lang.Integer.valueOf(c17689x58a87b4f.H), java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar9 = this.f243968e;
        if (1 == sVar9.f243979b) {
            sVar9.f243992o = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.h(sVar9, null);
            this.f243968e.f243994q = null;
            if (!this.f243967d) {
                wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.h hVar = this.f243968e.f243992o;
                ((vf0.y1) k1Var).getClass();
                t21.o2.aj(hVar, 0L);
            }
        } else {
            sVar9.f243992o = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.h(sVar9, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar10 = this.f243968e;
            sVar10.f243994q = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.i(sVar10);
            this.f243968e.f243992o.f243961e = this.f243968e.f243994q;
            this.f243968e.f243994q.f243964e = this.f243968e.f243992o;
            if (!this.f243967d) {
                wf0.k1 k1Var2 = (wf0.k1) i95.n0.c(wf0.k1.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.h hVar2 = this.f243968e.f243992o;
                ((vf0.y1) k1Var2).getClass();
                t21.o2.aj(hVar2, 0L);
            }
        }
        if (this.f243967d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightPlayController", "#0x%x-#0x%x open file end, match stop %B", java.lang.Integer.valueOf(this.f243968e.hashCode()), java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f243967d));
        }
    }
}

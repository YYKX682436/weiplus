package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class o0 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0 f231590d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0 s0Var) {
        this.f231590d = s0Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 r2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17;
        java.lang.String r17;
        boolean z17;
        int width;
        int height;
        int i17;
        gj3.h hVar;
        fj3.k a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0 s0Var = this.f231590d;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        s0Var.f231650i = android.os.SystemClock.elapsedRealtime();
        if (this.f231590d.f231655q.getWidth() == 0 || this.f231590d.f231655q.getHeight() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTalkCameraManager", "size is zero, drop frame");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0 s0Var2 = this.f231590d;
            is0.c cVar = s0Var2.f231654p;
            if (cVar != null && (r2Var = s0Var2.f231651m) != null) {
                boolean z19 = true;
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().y()) {
                    s0Var2.i(true);
                } else if (s0Var2.f231656r) {
                    if (!com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().B()) {
                        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.l0());
                    }
                    if (z19 && (n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n()) != null) {
                        r17 = c01.z1.r();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
                        z17 = r2Var.f231620a;
                        width = s0Var2.f231655q.getWidth();
                        height = s0Var2.f231655q.getHeight();
                        i17 = r2Var.f231638s;
                        hVar = n17.f231408a;
                        if (hVar != null && (a17 = hVar.a()) != null) {
                            a17.a(new hj3.p(cVar, z17, n17.f231410c, r17, new mj3.g(width, height, i17, z17, false, 16, null)));
                        }
                    }
                }
                z19 = false;
                if (z19) {
                    r17 = c01.z1.r();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
                    z17 = r2Var.f231620a;
                    width = s0Var2.f231655q.getWidth();
                    height = s0Var2.f231655q.getHeight();
                    i17 = r2Var.f231638s;
                    hVar = n17.f231408a;
                    if (hVar != null) {
                        a17.a(new hj3.p(cVar, z17, n17.f231410c, r17, new mj3.g(width, height, i17, z17, false, 16, null)));
                    }
                }
            }
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            surfaceTexture.updateTexImage();
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkCameraManager", "updateTexImage error", m143898xd4a2fc34);
        }
    }
}

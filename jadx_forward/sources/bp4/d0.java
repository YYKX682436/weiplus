package bp4;

/* loaded from: classes10.dex */
public final class d0 implements vm5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.k0 f104671d;

    public d0(bp4.k0 k0Var) {
        this.f104671d = k0Var;
    }

    @Override // vm5.a
    public void a(long j17) {
        for (bp4.z zVar : this.f104671d.f104750p) {
            if (zVar instanceof bp4.a0) {
                ((bp4.a0) zVar).c(j17);
            }
        }
    }

    @Override // vm5.a
    public void e() {
    }

    @Override // vm5.a
    public void g() {
        for (bp4.z zVar : this.f104671d.f104750p) {
            if (zVar instanceof bp4.a0) {
                ((bp4.a0) zVar).mo10982x42fe6352();
            }
        }
    }

    @Override // vm5.a
    public void i() {
    }

    @Override // vm5.b
    public void r() {
        bp4.k0 k0Var = this.f104671d;
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = k0Var.f104747m;
        if (textureViewSurfaceTextureListenerC22778x581fb68 != null && textureViewSurfaceTextureListenerC22778x581fb68.m82510xc00617a4()) {
            if (k0Var.f104742J == 0) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                k0Var.f104742J = android.os.SystemClock.elapsedRealtime();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.c0 c0Var = k0Var.I;
            if (c0Var.f257106b == 0) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                c0Var.f257106b = android.os.SystemClock.elapsedRealtime();
            } else {
                c0Var.f257105a++;
            }
            long j17 = k0Var.f104742J;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (android.os.SystemClock.elapsedRealtime() - j17 >= 1000) {
                if (c0Var.f257105a != 0) {
                    long elapsedRealtime = (r3 * 1000) / (android.os.SystemClock.elapsedRealtime() - c0Var.f257106b);
                }
                int elapsedRealtime2 = c0Var.f257105a == 0 ? 0 : (int) ((r3 * 1000) / (android.os.SystemClock.elapsedRealtime() - c0Var.f257106b));
                if (elapsedRealtime2 > 60) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1468L, 21L);
                } else if (elapsedRealtime2 > 40) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1468L, 22L);
                } else if (elapsedRealtime2 > 30) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1468L, 23L);
                } else if (elapsedRealtime2 > 20) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1468L, 24L);
                } else if (elapsedRealtime2 > 10) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1468L, 25L);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1468L, 26L);
                }
                k0Var.f104742J = 0L;
                c0Var.f257106b = 0L;
                c0Var.f257105a = 0;
            }
        }
    }

    @Override // vm5.a
    public void s() {
        long j17;
        bp4.k0 k0Var = this.f104671d;
        for (bp4.z zVar : k0Var.f104750p) {
            if (zVar instanceof bp4.a0) {
                ((bp4.a0) zVar).n(k0Var.C);
            }
        }
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = k0Var.f104747m;
        if (textureViewSurfaceTextureListenerC22778x581fb68 != null) {
            j17 = textureViewSurfaceTextureListenerC22778x581fb68.m82509xa86cd69f();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = k0Var.f104748n;
            j17 = 0 - ((h1Var != null ? h1Var.j() : 0L) / 1000);
        }
        bp4.c0 c0Var = k0Var.D;
        if (c0Var != null) {
            bp4.c0.m(c0Var, k0Var.E + j17, null, 2, null);
        }
    }

    @Override // vm5.a
    public void x() {
        bp4.k0 k0Var = this.f104671d;
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = k0Var.f104747m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(textureViewSurfaceTextureListenerC22778x581fb68, "null cannot be cast to non-null type android.view.View");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textureViewSurfaceTextureListenerC22778x581fb68, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin$checkInitVideoView$1", "onPlayFirstFrame", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        textureViewSurfaceTextureListenerC22778x581fb68.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(textureViewSurfaceTextureListenerC22778x581fb68, "com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin$checkInitVideoView$1", "onPlayFirstFrame", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ju3.d0.k(k0Var.f546865d, ju3.c0.C1, null, 2, null);
    }
}

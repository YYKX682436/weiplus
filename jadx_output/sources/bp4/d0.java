package bp4;

/* loaded from: classes10.dex */
public final class d0 implements vm5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.k0 f23138d;

    public d0(bp4.k0 k0Var) {
        this.f23138d = k0Var;
    }

    @Override // vm5.a
    public void a(long j17) {
        for (bp4.z zVar : this.f23138d.f23217p) {
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
        for (bp4.z zVar : this.f23138d.f23217p) {
            if (zVar instanceof bp4.a0) {
                ((bp4.a0) zVar).onFinish();
            }
        }
    }

    @Override // vm5.a
    public void i() {
    }

    @Override // vm5.b
    public void r() {
        bp4.k0 k0Var = this.f23138d;
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = k0Var.f23214m;
        if (videoCompositionPlayView != null && videoCompositionPlayView.isPlaying()) {
            if (k0Var.f23209J == 0) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                k0Var.f23209J = android.os.SystemClock.elapsedRealtime();
            }
            com.tencent.mm.plugin.vlog.model.c0 c0Var = k0Var.I;
            if (c0Var.f175573b == 0) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                c0Var.f175573b = android.os.SystemClock.elapsedRealtime();
            } else {
                c0Var.f175572a++;
            }
            long j17 = k0Var.f23209J;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (android.os.SystemClock.elapsedRealtime() - j17 >= 1000) {
                if (c0Var.f175572a != 0) {
                    long elapsedRealtime = (r3 * 1000) / (android.os.SystemClock.elapsedRealtime() - c0Var.f175573b);
                }
                int elapsedRealtime2 = c0Var.f175572a == 0 ? 0 : (int) ((r3 * 1000) / (android.os.SystemClock.elapsedRealtime() - c0Var.f175573b));
                if (elapsedRealtime2 > 60) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1468L, 21L);
                } else if (elapsedRealtime2 > 40) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1468L, 22L);
                } else if (elapsedRealtime2 > 30) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1468L, 23L);
                } else if (elapsedRealtime2 > 20) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1468L, 24L);
                } else if (elapsedRealtime2 > 10) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1468L, 25L);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1468L, 26L);
                }
                k0Var.f23209J = 0L;
                c0Var.f175573b = 0L;
                c0Var.f175572a = 0;
            }
        }
    }

    @Override // vm5.a
    public void s() {
        long j17;
        bp4.k0 k0Var = this.f23138d;
        for (bp4.z zVar : k0Var.f23217p) {
            if (zVar instanceof bp4.a0) {
                ((bp4.a0) zVar).n(k0Var.C);
            }
        }
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = k0Var.f23214m;
        if (videoCompositionPlayView != null) {
            j17 = videoCompositionPlayView.getPosition();
        } else {
            com.tencent.mm.plugin.vlog.model.h1 h1Var = k0Var.f23215n;
            j17 = 0 - ((h1Var != null ? h1Var.j() : 0L) / 1000);
        }
        bp4.c0 c0Var = k0Var.D;
        if (c0Var != null) {
            bp4.c0.m(c0Var, k0Var.E + j17, null, 2, null);
        }
    }

    @Override // vm5.a
    public void x() {
        bp4.k0 k0Var = this.f23138d;
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = k0Var.f23214m;
        kotlin.jvm.internal.o.e(videoCompositionPlayView, "null cannot be cast to non-null type android.view.View");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(videoCompositionPlayView, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin$checkInitVideoView$1", "onPlayFirstFrame", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        videoCompositionPlayView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(videoCompositionPlayView, "com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin$checkInitVideoView$1", "onPlayFirstFrame", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ju3.d0.k(k0Var.f465332d, ju3.c0.C1, null, 2, null);
    }
}

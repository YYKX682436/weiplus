package rc0;

/* loaded from: classes12.dex */
public class k implements com.p314xaae8f345.mm.app.h4 {
    public k(rc0.l lVar) {
    }

    @Override // com.p314xaae8f345.mm.app.h4
    public void a(java.lang.Thread thread, java.lang.String str, java.lang.Throwable th6) {
        int d17;
        d55.r0 a17 = d55.r0.a();
        d55.k0 k0Var = a17.f308148b;
        if (k0Var == null) {
            android.content.Context context = a17.f308147a;
            if (context != null) {
                d55.v vVar = new d55.v(context, "recovery_crash_count");
                vVar.a();
                java.lang.Math.max(vVar.mo123525xb58848b9("crash_count", 0), 0);
                java.io.File file = new java.io.File(new java.io.File(context.getFilesDir().getParentFile(), "MicroMsg/recovery"), "recovery_crash");
                new android.os.Bundle();
                new java.util.concurrent.atomic.AtomicBoolean();
                new java.io.File(file, "fast_persist_data");
                d17 = java.lang.Math.max(vVar.mo123525xb58848b9("crash_count", 0), 0);
            }
            d17 = -1;
        } else {
            if (k0Var instanceof d55.b0) {
                d17 = ((d55.b0) k0Var).d();
            }
            d17 = -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecoveryOnSplashService", "#afterReport, handling java crash with recovery, lastCrashCount = " + d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recovery.reporter", "do recovery report directly");
        ((ku5.t0) ku5.t0.f394148d).g(new h21.i(d17));
        d55.w wVar = new d55.w(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "recovery_statistic");
        wVar.e();
        int mo123525xb58848b9 = wVar.mo123525xb58848b9("crash_count", 0);
        boolean mo123524x41a8a7f2 = wVar.mo123524x41a8a7f2("launch_recovery", false);
        boolean mo123524x41a8a7f22 = wVar.mo123524x41a8a7f2("launch_recovery_real", false);
        boolean mo123524x41a8a7f23 = wVar.mo123524x41a8a7f2("recover_from_crash", false);
        int mo123525xb58848b92 = wVar.mo123525xb58848b9("recovery_status", -1);
        int mo123525xb58848b93 = wVar.mo123525xb58848b9("recovery_from", 0);
        int mo123525xb58848b94 = wVar.mo123525xb58848b9("recover_internal_status", 0);
        int mo123525xb58848b95 = wVar.mo123525xb58848b9("recover_launch_mode", 0);
        long mo123526xfb822ef2 = wVar.mo123526xfb822ef2("recover_running_time", 0L);
        boolean mo123524x41a8a7f24 = wVar.mo123524x41a8a7f2("recover_is_discard", false);
        wVar.mo123527x2fec8307("recover_app_ver", "");
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g;
        wVar.g("crash_count", mo123525xb58848b9);
        wVar.mo123528x1c849219("launch_recovery", mo123524x41a8a7f2);
        wVar.mo123528x1c849219("launch_recovery_real", mo123524x41a8a7f22);
        wVar.mo123528x1c849219("recover_from_crash", mo123524x41a8a7f23);
        wVar.g("recovery_status", mo123525xb58848b92);
        wVar.g("recovery_from", mo123525xb58848b93);
        wVar.g("recover_internal_status", mo123525xb58848b94);
        wVar.g("recover_launch_mode", mo123525xb58848b95);
        wVar.g("recover_running_time", mo123526xfb822ef2);
        wVar.mo123528x1c849219("recover_is_discard", mo123524x41a8a7f24);
        wVar.mo123531xe4673800("recover_app_ver", str2);
        wVar.h();
        d55.r0.a().c(3);
    }

    @Override // com.p314xaae8f345.mm.app.h4
    public void e(int i17, java.lang.String str) {
    }
}

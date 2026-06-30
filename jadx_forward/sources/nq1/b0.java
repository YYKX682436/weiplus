package nq1;

/* loaded from: classes12.dex */
public class b0 implements ak0.i {

    /* renamed from: a, reason: collision with root package name */
    public final nq1.a0 f420487a;

    public b0(nq1.a0 a0Var) {
        this.f420487a = a0Var;
    }

    @Override // ak0.i
    public void a(java.io.File file, java.io.File file2, java.lang.String str, int i17) {
    }

    @Override // ak0.i
    public void b(java.io.File file, java.util.List list, java.lang.Throwable th6) {
    }

    @Override // ak0.i
    public void c(java.io.File file, int i17) {
        y45.C30750x321854 c30750x321854 = (y45.C30750x321854) this.f420487a;
        c30750x321854.getClass();
        d55.u.b("MicroMsg.recovery.operator", "#onPatchPackageCheckFail, code = " + i17, new java.lang.Object[0]);
        int abs = i17 != 0 ? java.lang.Math.abs(i17) + 10 : 0;
        d55.w wVar = new d55.w(c30750x321854.f540905a, "recovery_statistic");
        wVar.e();
        int mo123525xb58848b9 = wVar.mo123525xb58848b9("crash_count", 0);
        boolean mo123524x41a8a7f2 = wVar.mo123524x41a8a7f2("launch_recovery", false);
        boolean mo123524x41a8a7f22 = wVar.mo123524x41a8a7f2("launch_recovery_real", false);
        boolean mo123524x41a8a7f23 = wVar.mo123524x41a8a7f2("recover_from_crash", false);
        wVar.mo123525xb58848b9("recovery_status", -1);
        int mo123525xb58848b92 = wVar.mo123525xb58848b9("recovery_from", 0);
        int mo123525xb58848b93 = wVar.mo123525xb58848b9("recover_internal_status", 0);
        int mo123525xb58848b94 = wVar.mo123525xb58848b9("recover_launch_mode", 0);
        long mo123526xfb822ef2 = wVar.mo123526xfb822ef2("recover_running_time", 0L);
        wVar.mo123524x41a8a7f2("recover_is_discard", false);
        java.lang.String mo123527x2fec8307 = wVar.mo123527x2fec8307("recover_app_ver", "");
        wVar.g("crash_count", mo123525xb58848b9);
        wVar.mo123528x1c849219("launch_recovery", mo123524x41a8a7f2);
        wVar.mo123528x1c849219("launch_recovery_real", mo123524x41a8a7f22);
        wVar.mo123528x1c849219("recover_from_crash", mo123524x41a8a7f23);
        wVar.mo123529xc5c55e60("recovery_status", abs);
        wVar.mo123529xc5c55e60("recovery_from", mo123525xb58848b92);
        wVar.mo123529xc5c55e60("recover_internal_status", mo123525xb58848b93);
        wVar.mo123529xc5c55e60("recover_launch_mode", mo123525xb58848b94);
        wVar.mo123530xf2e7ce2b("recover_running_time", mo123526xfb822ef2);
        wVar.mo123528x1c849219("recover_is_discard", false);
        wVar.mo123531xe4673800("recover_app_ver", mo123527x2fec8307);
        wVar.c();
    }

    @Override // ak0.i
    public void d(java.io.File file, java.lang.String str, java.lang.String str2) {
    }

    @Override // ak0.i
    public void e(java.io.File file, java.lang.Throwable th6) {
    }

    @Override // ak0.i
    public void f(java.io.File file, boolean z17, long j17) {
    }

    @Override // ak0.i
    public void g(android.content.Intent intent) {
    }

    @Override // ak0.i
    public void h(java.io.File file) {
    }
}

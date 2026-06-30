package d55;

/* loaded from: classes12.dex */
public abstract class g0 extends d55.b0 implements java.lang.Runnable {

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f308116r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f308117s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f308118t;

    public g0(d55.b0 b0Var) {
        super(b0Var);
        this.f308116r = new java.util.concurrent.atomic.AtomicBoolean();
        this.f308117s = new java.util.concurrent.atomic.AtomicBoolean();
        this.f308118t = new java.util.concurrent.atomic.AtomicBoolean();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
    
        if (r15.getStatus() == 9) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0102, code lost:
    
        if (r15.getStatus() == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d55.g0.j():void");
    }

    public abstract void k();

    public void l() {
        d55.o0.a(4, "MicroMsg.recovery.safePoint", "onLaunchNormal");
        d55.j jVar = this.f308105o;
        if (jVar == null || jVar.f308124d.f308130a < 1) {
            return;
        }
        d55.w wVar = new d55.w(this.f308097d, "recovery_statistic");
        wVar.e();
        wVar.mo123525xb58848b9("crash_count", 0);
        wVar.mo123524x41a8a7f2("launch_recovery", false);
        boolean mo123524x41a8a7f2 = wVar.mo123524x41a8a7f2("launch_recovery_real", false);
        boolean mo123524x41a8a7f22 = wVar.mo123524x41a8a7f2("recover_from_crash", false);
        int mo123525xb58848b9 = wVar.mo123525xb58848b9("recovery_status", -1);
        wVar.mo123525xb58848b9("recovery_from", 0);
        int mo123525xb58848b92 = wVar.mo123525xb58848b9("recover_internal_status", 0);
        int mo123525xb58848b93 = wVar.mo123525xb58848b9("recover_launch_mode", 0);
        long mo123526xfb822ef2 = wVar.mo123526xfb822ef2("recover_running_time", 0L);
        wVar.mo123524x41a8a7f2("recover_is_discard", false);
        java.lang.String mo123527x2fec8307 = wVar.mo123527x2fec8307("recover_app_ver", "");
        wVar.g("crash_count", this.f308105o.f308124d.f308130a);
        wVar.mo123528x1c849219("launch_recovery", false);
        wVar.mo123528x1c849219("launch_recovery_real", mo123524x41a8a7f2);
        wVar.mo123528x1c849219("recover_from_crash", mo123524x41a8a7f22);
        wVar.mo123529xc5c55e60("recovery_status", mo123525xb58848b9);
        wVar.mo123529xc5c55e60("recovery_from", 1);
        wVar.mo123529xc5c55e60("recover_internal_status", mo123525xb58848b92);
        wVar.mo123529xc5c55e60("recover_launch_mode", mo123525xb58848b93);
        wVar.mo123530xf2e7ce2b("recover_running_time", mo123526xfb822ef2);
        wVar.mo123528x1c849219("recover_is_discard", false);
        wVar.mo123531xe4673800("recover_app_ver", mo123527x2fec8307);
        wVar.d();
    }

    public void m() {
        if (this.f308118t.get()) {
            return;
        }
        android.os.Handler handler = this.f308098e;
        handler.removeCallbacks(this);
        android.os.Handler handler2 = this.f308102i;
        if (handler2 != null) {
            handler2.removeCallbacks(this);
        }
        android.os.Handler handler3 = this.f308102i;
        if (handler3 != null) {
            handler = handler3;
        }
        handler.postDelayed(this, this.f308107q.f308093f);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f308117s.get()) {
            d55.o0.a(4, "MicroMsg.recovery.safePoint", "auto clear task has been canceled, skip");
            return;
        }
        d55.o0.a(4, "MicroMsg.recovery.safePoint", "auto clear point");
        k();
        this.f308118t.set(true);
    }
}

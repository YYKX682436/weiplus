package bp4;

/* loaded from: classes10.dex */
public final class l4 implements kp4.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.o4 f104785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f104786b;

    public l4(bp4.o4 o4Var, ju3.d0 d0Var) {
        this.f104785a = o4Var;
        this.f104786b = d0Var;
    }

    @Override // kp4.t0
    public void a(long j17, long j18) {
        bp4.o4 o4Var = this.f104785a;
        o4Var.f104861u = j17;
        o4Var.f104862v = j18;
        o4Var.B();
    }

    @Override // kp4.t0
    public void b(long j17, long j18) {
        bp4.o4 o4Var = this.f104785a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var.f104850g, "onScrollStateChanged: " + j17 + ", " + j18);
        android.os.Bundle bundle = new android.os.Bundle();
        o4Var.f104861u = j17;
        o4Var.f104862v = j18;
        o4Var.B();
        bundle.putLong("EDIT_VLOG_TRACK_CROP_START", j17);
        bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", j18);
        bundle.putBoolean("EDIT_VLOG_TRACK_CROP_CHANGE", true);
        this.f104786b.w(ju3.c0.f383409f2, bundle);
        bp4.c0 c0Var = o4Var.f104864x;
        if (c0Var != null) {
            c0Var.mo10984xc84dc82d();
        }
    }

    @Override // kp4.t0
    /* renamed from: pause */
    public void mo10993x65825f6() {
        bp4.o4 o4Var = this.f104785a;
        bp4.c0 c0Var = o4Var.f104864x;
        if (c0Var != null) {
            c0Var.mo10983x65825f6();
        }
        bp4.c0 c0Var2 = o4Var.f104865y;
        if (c0Var2 != null) {
            c0Var2.mo10983x65825f6();
        }
    }

    @Override // kp4.t0
    /* renamed from: seekTo */
    public void mo10994xc9fc1b13(long j17) {
        bp4.c0 c0Var = this.f104785a.f104864x;
        if (c0Var != null) {
            bp4.c0.m(c0Var, j17, null, 2, null);
        }
    }
}

package bp4;

/* loaded from: classes10.dex */
public final class l4 implements kp4.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.o4 f23252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f23253b;

    public l4(bp4.o4 o4Var, ju3.d0 d0Var) {
        this.f23252a = o4Var;
        this.f23253b = d0Var;
    }

    @Override // kp4.t0
    public void a(long j17, long j18) {
        bp4.o4 o4Var = this.f23252a;
        o4Var.f23328u = j17;
        o4Var.f23329v = j18;
        o4Var.B();
    }

    @Override // kp4.t0
    public void b(long j17, long j18) {
        bp4.o4 o4Var = this.f23252a;
        com.tencent.mars.xlog.Log.i(o4Var.f23317g, "onScrollStateChanged: " + j17 + ", " + j18);
        android.os.Bundle bundle = new android.os.Bundle();
        o4Var.f23328u = j17;
        o4Var.f23329v = j18;
        o4Var.B();
        bundle.putLong("EDIT_VLOG_TRACK_CROP_START", j17);
        bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", j18);
        bundle.putBoolean("EDIT_VLOG_TRACK_CROP_CHANGE", true);
        this.f23253b.w(ju3.c0.f301876f2, bundle);
        bp4.c0 c0Var = o4Var.f23331x;
        if (c0Var != null) {
            c0Var.resume();
        }
    }

    @Override // kp4.t0
    public void pause() {
        bp4.o4 o4Var = this.f23252a;
        bp4.c0 c0Var = o4Var.f23331x;
        if (c0Var != null) {
            c0Var.pause();
        }
        bp4.c0 c0Var2 = o4Var.f23332y;
        if (c0Var2 != null) {
            c0Var2.pause();
        }
    }

    @Override // kp4.t0
    public void seekTo(long j17) {
        bp4.c0 c0Var = this.f23252a.f23331x;
        if (c0Var != null) {
            bp4.c0.m(c0Var, j17, null, 2, null);
        }
    }
}

package lp4;

/* loaded from: classes10.dex */
public final class x0 implements kp4.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lp4.a1 f401972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f401973b;

    public x0(lp4.a1 a1Var, ju3.d0 d0Var) {
        this.f401972a = a1Var;
        this.f401973b = d0Var;
    }

    @Override // kp4.t0
    public void a(long j17, long j18) {
        lp4.a1 a1Var = this.f401972a;
        a1Var.f401856s = j17;
        a1Var.f401857t = j18;
        a1Var.z();
    }

    @Override // kp4.t0
    public void b(long j17, long j18) {
        lp4.a1 a1Var = this.f401972a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f401847g, "onScrollStateChanged: " + j17 + ", " + j18);
        android.os.Bundle bundle = new android.os.Bundle();
        a1Var.f401856s = j17;
        a1Var.f401857t = j18;
        a1Var.z();
        bundle.putLong("EDIT_VLOG_TRACK_CROP_START", j17);
        bundle.putLong("EDIT_VLOG_TRAKC_CROP_END", j18);
        this.f401973b.w(ju3.c0.f383409f2, bundle);
    }

    @Override // kp4.t0
    /* renamed from: pause */
    public void mo10993x65825f6() {
        ju3.d0.k(this.f401973b, ju3.c0.f383428p1, null, 2, null);
    }

    @Override // kp4.t0
    /* renamed from: seekTo */
    public void mo10994xc9fc1b13(long j17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        lp4.a1 a1Var = this.f401972a;
        if (currentTimeMillis - a1Var.f401858u > 15) {
            a1Var.f401858u = java.lang.System.currentTimeMillis();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("PARAM_1_LONG", j17);
            this.f401973b.w(ju3.c0.H, bundle);
        }
    }
}

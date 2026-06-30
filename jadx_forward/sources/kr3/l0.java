package kr3;

/* loaded from: classes11.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.q0 f392939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f392940e;

    public l0(kr3.q0 q0Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f392939d = q0Var;
        this.f392940e = abstractActivityC21394xb3d2c0cf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f392939d.V6()) {
            this.f392940e.finish();
        }
    }
}

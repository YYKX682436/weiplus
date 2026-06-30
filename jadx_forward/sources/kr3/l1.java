package kr3;

/* loaded from: classes11.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.q1 f392941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f392942e;

    public l1(kr3.q1 q1Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f392941d = q1Var;
        this.f392942e = abstractActivityC21394xb3d2c0cf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f392941d.V6()) {
            this.f392942e.finish();
        }
    }
}

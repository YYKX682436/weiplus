package sc2;

/* loaded from: classes2.dex */
public final class d7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.g0 f487373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f487374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.v6 f487375f;

    public d7(p012xc85e97e9.p093xedfae76a.g0 g0Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, sc2.v6 v6Var) {
        this.f487373d = g0Var;
        this.f487374e = abstractActivityC21394xb3d2c0cf;
        this.f487375f = v6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pm0.v.y(this.f487373d, this.f487374e, this.f487375f);
    }
}

package sc2;

/* loaded from: classes2.dex */
public final class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.j0 f487346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f487347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.v6 f487348f;

    public c7(p012xc85e97e9.p093xedfae76a.j0 j0Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, sc2.v6 v6Var) {
        this.f487346d = j0Var;
        this.f487347e = abstractActivityC21394xb3d2c0cf;
        this.f487348f = v6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pm0.v.y(this.f487346d, this.f487347e, this.f487348f);
    }
}

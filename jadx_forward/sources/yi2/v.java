package yi2;

/* loaded from: classes10.dex */
public final class v extends com.p314xaae8f345.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.i0 f544124d;

    public v(yi2.i0 i0Var) {
        this.f544124d = i0Var;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorWidget", "onAppBackground activity=" + str);
        pm0.v.X(new yi2.t(this.f544124d));
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorWidget", "onAppForeground activity=" + str);
        pm0.v.X(new yi2.u(this.f544124d));
    }
}

package cp2;

/* loaded from: classes2.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f302444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(cp2.v0 v0Var) {
        super(0);
        this.f302444d = v0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cp2.v0 v0Var = this.f302444d;
        if (v0Var.f302464h == 0 && nq2.d.f420513a.e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "requestRefreshForPermission first enter asyncRequestLbs");
            pm0.v.L("LbsPresenter_requestLbs", true, cp2.p0.f302410d);
            v0Var.Q();
        } else if (!v0Var.f302479z) {
            v0Var.f302479z = true;
            pm0.v.L("LbsPresenter_requestLbs", true, new cp2.r0(v0Var));
        }
        return jz5.f0.f384359a;
    }
}

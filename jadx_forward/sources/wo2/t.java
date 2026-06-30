package wo2;

/* loaded from: classes2.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo2.m0 f529659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f529660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f529661f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(wo2.m0 m0Var, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f529659d = m0Var;
        this.f529660e = str;
        this.f529661f = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wo2.m0 m0Var = this.f529659d;
        m0Var.getClass();
        java.lang.String title = this.f529660e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyActionBarUIC", "setNearbyVideoTabTitle title:".concat(title));
        android.view.View findViewById = m0Var.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f568732nv3);
        if (findViewById != null) {
            findViewById.post(new wo2.j0(title, m0Var, findViewById));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setNearbyLiveTabTitle title:");
        java.lang.String str = this.f529661f;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyActionBarUIC", sb6.toString());
        pm0.v.X(new wo2.i0(str, m0Var));
        return jz5.f0.f384359a;
    }
}

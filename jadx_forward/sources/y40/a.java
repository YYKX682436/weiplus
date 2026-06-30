package y40;

/* loaded from: classes7.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y40.i0 f540811d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(y40.i0 i0Var) {
        super(0);
        this.f540811d = i0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_expose_warm_up_engine_group, 1) == 1);
        boolean booleanValue = valueOf.booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f540811d.f540828d, "alwaysWarmUpEngineGroup " + booleanValue);
        return valueOf;
    }
}

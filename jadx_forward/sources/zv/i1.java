package zv;

/* loaded from: classes7.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv.e2 f557525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(zv.e2 e2Var) {
        super(0);
        this.f557525d = e2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_expose_warm_up_engine_group, 1) == 1);
        boolean booleanValue = valueOf.booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f557525d.f557479d, "alwaysWarmUpEngineGroup " + booleanValue);
        return valueOf;
    }
}

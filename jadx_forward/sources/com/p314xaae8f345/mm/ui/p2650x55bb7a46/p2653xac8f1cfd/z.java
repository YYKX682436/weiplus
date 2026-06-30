package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes3.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c0 f281884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c0 c0Var) {
        super(0);
        this.f281884d = c0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean a17 = z65.c.a();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var != null) {
            a17 = ((h62.d) e0Var).fj(e42.d0.clicfg_android_enable_app_msg_wxa_expose_period_stat, a17);
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean booleanValue = valueOf.booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f281884d.f280390e, "isExposePeriodStatEnabled: " + booleanValue);
        return valueOf;
    }
}

package o25;

/* loaded from: classes4.dex */
public final class h2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final o25.h2 f424065d = new o25.h2();

    public h2() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        long j17 = 604800000;
        if (e0Var != null) {
            e42.d0 d0Var = e42.d0.clicfg_opensdk_launch_appbrand_cache_data_expire_time;
            jz5.g gVar = o25.i2.f424072a;
            j17 = ((h62.d) e0Var).Ui(d0Var, 604800000L);
        } else {
            jz5.g gVar2 = o25.i2.f424072a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenSDKLaunchWXMiniProgramHelper", "miniProgramTranslateLinkResultCacheTime:" + j17);
        return java.lang.Long.valueOf(j17);
    }
}

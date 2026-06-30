package eq1;

/* loaded from: classes.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final eq1.l0 f337363d = new eq1.l0();

    public l0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        eq1.n0 n0Var = eq1.n0.f337370a;
        boolean z17 = true;
        if (!((java.lang.Boolean) ((jz5.n) eq1.n0.f337374e).mo141623x754a37bb()).booleanValue() && ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) eq1.n0.f337371b).mo141623x754a37bb()).o("BizTimeLineTestMode", 0) != 1) {
            boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_biz_time_line_test, 0) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TestBiz", "test biz open " + n0Var);
            if (!z18) {
                z17 = false;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}

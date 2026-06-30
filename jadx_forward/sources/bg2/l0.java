package bg2;

/* loaded from: classes3.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.x0 f101794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f101795e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(bg2.x0 x0Var, android.content.Context context) {
        super(2);
        this.f101794d = x0Var;
        this.f101795e = context;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.ix0 ret = (r45.ix0) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((r45.g33) obj, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        bg2.x0 x0Var = this.f101794d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x0Var.f102146e, "[closeDanmaku] live feed danmaku close ret:" + ret);
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        android.content.Context context = this.f101795e;
        if (m75939xb282bd08 == 0) {
            x0Var.c7(java.lang.Boolean.FALSE, null);
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.cvn);
            e4Var.c();
        } else {
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f79723x416541f0);
            e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.eqz);
            e4Var2.c();
        }
        return jz5.f0.f384359a;
    }
}

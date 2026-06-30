package ls4;

/* loaded from: classes8.dex */
public final class w implements ns4.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f402638a;

    /* renamed from: b, reason: collision with root package name */
    public final js4.q f402639b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f402640c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f402641d;

    public w(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, js4.q parameter, java.lang.ref.WeakReference delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameter, "parameter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f402638a = context;
        this.f402639b = parameter;
        this.f402640c = delegate;
    }

    public final void a() {
        js4.q qVar = this.f402639b;
        java.lang.Object obj = qVar.f383093e;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f402638a;
        if (obj != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinEncashLogic", "jumpEncashInterceptor");
            java.lang.Object obj2 = qVar.f383093e;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = obj2 instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) obj2 : null;
            if (c19786x6a1e2862 != null) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                xc2.y2 y2Var = xc2.y2.f534876a;
                xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
                p0Var.f534785n = 0;
                xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinEncashLogic", "gotoIncomeBalanceView: ");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420.class);
        intent.putExtra("wecoin_income_balance", qVar.f383090b);
        intent.putExtra("WECOIN_BUSINESS_ID", qVar.f383089a);
        intent.putExtra("WECOIN_ENCASH_SCENE", qVar.f383094f);
        intent.putExtra("WECOIN_ENCASH_BIZ_TYPE", qVar.f383095g);
        intent.putExtra("WECOIN_ENCASH_BIZ_ACCT_ID", qVar.f383096h);
        intent.putExtra("WECOIN_ENCASH_KEYBOARD_TIPS", qVar.f383097i);
        r45.ma7 ma7Var = qVar.f383091c;
        if (ma7Var != null) {
            intent.putExtra("WECOIN_TAX_CUT_ENTRANCE_INFO", ma7Var.mo14344x5f01b1f6());
        }
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420.f260681v;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420.f260681v = new java.lang.ref.WeakReference(this);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f402638a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/logic/WeCoinEncashLogic", "gotoEnCashView", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/mm/plugin/wallet/wecoin/logic/WeCoinEncashLogic", "gotoEnCashView", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}

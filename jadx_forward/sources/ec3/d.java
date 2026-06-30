package ec3;

/* loaded from: classes9.dex */
public final class d extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.l f332527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k0 f332528e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ec3.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k0 k0Var) {
        super(false);
        this.f332527d = lVar;
        this.f332528e = k0Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        ec3.l lVar = this.f332527d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k0 k0Var = this.f332528e;
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUINewFunctionUIC", "[openNewFunctionClickCell]");
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUINewFunctionUIC", "[openNewFunctionClickCell] resp is null");
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = lVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activity).a(ec3.g1.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((ec3.g1) a17).R6(false);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = lVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((ec3.g1) zVar.a(activity2).a(ec3.g1.class)).Q6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.j jVar = k0Var.f226911u;
            if (jVar != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("appId", jVar.f226871d);
                bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, jVar.f226873f);
                java.lang.String str = jVar.f226872e;
                if (str == null) {
                    str = "";
                }
                bundle.putString("query", str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUINewFunctionUIC", "[openNewFunctionClickCell] open Liteapp，appid：" + jVar.f226871d + "、path：" + jVar.f226873f + "、query: " + ((java.lang.Object) str) + "、version：" + jVar.f226875h);
                java.lang.String str2 = jVar.f226875h;
                if (str2 == null || str2.length() == 0) {
                    bundle.putString("minVersion", "3.0.0");
                } else {
                    bundle.putString("minVersion", jVar.f226875h);
                }
                bundle.putBoolean("isHalfScreen", jVar.f226874g == 1);
                if (jVar.f226876i > 0) {
                    bundle.putDouble("heightPercent", r0 / 10000);
                }
                bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, jVar.f226877m == 1);
                bundle.putInt("nextAnimIn", com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0);
                bundle.putInt("currentAnimOut", com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
                sVar.f225700d = new ec3.i(lVar);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(lVar.m158354x19263085(), bundle, true, false, sVar, new ec3.g(lVar));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q0 q0Var = k0Var.f226912v;
                if (q0Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUINewFunctionUIC", "[openNewFunctionClickCell] open tinyapp，action_type：" + q0Var.f227086g + "、action_app_username：" + q0Var.f227088i + "、action_url：" + q0Var.f227087h);
                    if (q0Var.f227086g == 3) {
                        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.c0(q0Var.f227088i, q0Var.f227087h, 0, 1100, new ec3.k(lVar));
                    }
                }
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new ec3.c(this.f332527d));
    }
}

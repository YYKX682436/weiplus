package ec3;

/* loaded from: classes9.dex */
public final class j0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ec3.g1 g1Var) {
        super(false);
        this.f332575d = g1Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View v17) {
        java.lang.StringBuilder sb6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        ec3.g1 g1Var = this.f332575d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.j jVar = g1Var.f332550n;
        g1Var.getClass();
        if (jVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[12];
        objArr[0] = 16;
        objArr[1] = 0;
        objArr[2] = g1Var.f332559w;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = g1Var.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
        objArr[3] = activityC16373x8a110f13 != null ? activityC16373x8a110f13.s7() : null;
        objArr[4] = "";
        objArr[5] = "";
        objArr[6] = g1Var.Z6();
        objArr[7] = java.lang.Integer.valueOf(g1Var.f332544e.size());
        objArr[8] = g1Var.f332560x;
        objArr[9] = 0;
        objArr[10] = g1Var.f332558v;
        objArr[11] = java.lang.Integer.valueOf(g1Var.C);
        g0Var.d(18890, objArr);
        g1Var.R6(false);
        g1Var.Q6();
        if (g1Var.P6()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = g1Var.f332546g;
            if (c22621x7603e017 != null && c22621x7603e017.hasFocus()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[clickLayout] beforeClickIsInRecommendStyle = true");
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", jVar.f226871d);
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, jVar.f226873f);
        java.lang.String str = jVar.f226872e;
        if (str == null || str.length() == 0) {
            sb6 = new java.lang.StringBuilder();
            sb6.append("bless_text=");
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(str);
            sb7.append("&bless_text=");
            sb6 = sb7;
        }
        sb6.append(g1Var.a7());
        sb6.append("&sessionid=" + g1Var.f332559w);
        sb6.append("&requestid=" + g1Var.f332558v);
        sb6.append("&query_scene=" + g1Var.C);
        if (g1Var.C == 1) {
            sb6.append("&festival_text=" + g1Var.D);
        }
        bundle.putString("query", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[openClickLiteApp] appid：" + jVar.f226871d + "、path：" + jVar.f226873f + "、query: " + ((java.lang.Object) sb6) + "、version：" + jVar.f226875h + "、is_half:" + jVar.f226874g + "、height：" + jVar.f226876i + "、is_transparent：" + jVar.f226877m);
        java.lang.String str2 = jVar.f226875h;
        if (str2 == null || str2.length() == 0) {
            bundle.putString("minVersion", "2.6.1");
        } else {
            bundle.putString("minVersion", jVar.f226875h);
        }
        bundle.putBoolean("isHalfScreen", jVar.f226874g == 1);
        bundle.putDouble("heightPercent", jVar.f226876i / 10000);
        bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, jVar.f226877m == 1);
        bundle.putInt("nextAnimIn", com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0);
        bundle.putInt("currentAnimOut", com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        sVar.f225700d = new ec3.z0(g1Var);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(g1Var.m158354x19263085(), bundle, true, false, sVar, new ec3.x0(g1Var));
    }
}

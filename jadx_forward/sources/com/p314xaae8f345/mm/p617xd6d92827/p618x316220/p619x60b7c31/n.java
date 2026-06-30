package com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31;

/* loaded from: classes4.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f134708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.o f134709e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(lc3.a0 a0Var, com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.o oVar) {
        super(0);
        this.f134708d = a0Var;
        this.f134709e = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashMap hashMap = new java.util.HashMap();
        ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
        hashMap.put("imei", "");
        ((ee0.e) ((fe0.l3) i95.n0.c(fe0.l3.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isReportOAID", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperService");
        boolean b17 = w34.a.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReportOAID", "com.tencent.mm.feature.sns.AdDeviceIdSwitchHelperService");
        if (b17) {
            java.lang.String k96 = ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k96);
            hashMap.put("oaid", k96);
        }
        lc3.a0 a0Var = this.f134708d;
        if (a0Var.has("waidPkg")) {
            java.lang.String optString = a0Var.optString("waidPkg");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiGetAdIdInfo", "waidPkg=" + optString);
            ((ee0.z4) ((fe0.r4) i95.n0.c(fe0.r4.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppWaid", "com.tencent.mm.feature.sns.WaidHelperService");
            java.lang.String d17 = me4.c.d(optString);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppWaid", "com.tencent.mm.feature.sns.WaidHelperService");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getAppWaid(...)");
            hashMap.put("waid", d17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MBJsApiGetAdIdInfo", "no waidPkg param");
        }
        hashMap.put("devIdInfo", ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Ai());
        com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.o oVar = this.f134709e;
        yz5.l s17 = oVar.s();
        lc3.a0 a0Var2 = new lc3.a0(hashMap);
        oVar.m(a0Var2);
        s17.mo146xb9724478(a0Var2);
        return jz5.f0.f384359a;
    }
}

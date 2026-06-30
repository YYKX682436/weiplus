package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class qb extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.qb f267993d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.qb();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        nw4.g gVar = env.f422396d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSaveWaid", "h5 JsApiSaveWaid");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msg.f422547d.toString(), "toString(...)");
            ((ee0.z4) ((fe0.r4) i95.n0.c(fe0.r4.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseWaidFromJsApi", "com.tencent.mm.feature.sns.WaidHelperService");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseWaidFromJsApi", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseWaidFromJsApi", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseWaidFromJsApi", "com.tencent.mm.feature.sns.WaidHelperService");
            hashMap.put("result", java.lang.String.valueOf(0));
            gVar.e(msg.f422546c, msg.f422552i + ":ok", hashMap);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSaveWaid", "h5 JsApiSaveWaid exp=" + e17);
            hashMap.put("result", "0");
            gVar.e(msg.f422546c, msg.f422552i + ":fail", hashMap);
            return false;
        }
    }

    @Override // nw4.q2
    public int b() {
        return 363;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.vc.f34923x24728b;
    }
}

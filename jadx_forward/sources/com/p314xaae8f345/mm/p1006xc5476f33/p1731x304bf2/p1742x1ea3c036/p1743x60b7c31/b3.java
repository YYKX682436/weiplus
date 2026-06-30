package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public final class b3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f221133e = "JsApiOpenWebOnPC";

    @Override // sd.c
    public java.lang.String b() {
        return "openWebOnPC";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        java.lang.String str2 = this.f221133e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "handleMsg!");
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            if (q5Var != null) {
                q5Var.a("openWebOnPC:fail. empty params", null);
                return;
            }
            return;
        }
        java.lang.String optString = e17.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
        java.lang.String optString2 = e17.optString("url", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        if (optString2.length() == 0) {
            if (q5Var != null) {
                q5Var.a("openWebOnPC:fail. url is nil or empty!", null);
                return;
            }
            return;
        }
        if (!((d73.i) i95.n0.c(d73.i.class)).Qg()) {
            if (q5Var != null) {
                q5Var.a("openWebOnPCfail. canSendOpenCommand return fail!", null);
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.g9.f267650d.e()) {
            if (q5Var != null) {
                q5Var.a("openWebOnPC:fail. call too frequently!", null);
                return;
            }
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() == 0) {
            optString = optString2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef c16092xbbe22aef = new com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef(optString, optString2, "", 0, null, null, null, null, 248, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "openUrlOnPc Success(send success) url:" + optString2 + ", title:" + optString);
        ((d73.i) i95.n0.c(d73.i.class)).f6(c16092xbbe22aef);
        if (q5Var != null) {
            q5Var.a(null, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}

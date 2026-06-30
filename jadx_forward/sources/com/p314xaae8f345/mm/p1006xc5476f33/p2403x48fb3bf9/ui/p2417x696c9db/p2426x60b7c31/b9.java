package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class b9 implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 f266498e;

    public b9(nw4.y2 y2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 e9Var) {
        this.f266497d = y2Var;
        this.f266498e = e9Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        nw4.y2 y2Var = this.f266497d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 e9Var = this.f266498e;
        if (i18 != -1) {
            e9Var.f266617a.i5(y2Var, "cancel", kz5.b1.e(new jz5.l("err_msg", "cancel")));
            return;
        }
        java.lang.Object obj = ((java.util.HashMap) y2Var.f422323a).get("liteAppUuid");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "0";
        }
        long parseLong = java.lang.Long.parseLong(str);
        jz5.l[] lVarArr = {new jz5.l("bindMobile", c01.z1.c())};
        e9Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jz5.l lVar = lVarArr[0];
        jSONObject.put(lVar.f384366d.toString(), lVar.f384367e.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65436xa68b2341(parseLong, "onBindMobileChange", jSONObject);
        e9Var.f266617a.i5(y2Var, "ok", kz5.b1.e(new jz5.l("err_msg", "ok")));
    }
}

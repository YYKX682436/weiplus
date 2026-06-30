package oc1;

/* loaded from: classes.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f73032x366c91de = 903;

    /* renamed from: NAME */
    public static final java.lang.String f73033x24728b = "startHandoff";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartHandoff", "invoke startHandoff");
        java.util.HashMap hashMap = new java.util.HashMap();
        int a17 = oc1.d.a("MicroMsg.JsApiStartHandoff", c0Var.mo48798x74292566(), c0Var.t3().u0().f128817z);
        if (a17 != 0) {
            hashMap.put("errCode", java.lang.Integer.valueOf(a17));
            if (a17 < 5 && a17 > 1) {
                android.content.Context f229340d = c0Var.getF229340d();
                java.lang.String string = c0Var.getF229340d().getString(oc1.d.f425679c[a17]);
                ((ku5.t0) ku5.t0.f394148d).B(new oc1.c(f229340d, string));
            }
        } else {
            java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "");
            int optInt = jSONObject.optInt("actionId", 0);
            if (optInt != 1 && optInt != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartHandoff", "  actionId from forehand is wrong!! it is not 1 or 2");
            }
            c0Var.t3().Q2().a(optString, optInt + 2);
            android.content.Context f229340d2 = c0Var.getF229340d();
            ((ku5.t0) ku5.t0.f394148d).B(new oc1.b(f229340d2));
        }
        if (a17 == 0) {
            c0Var.a(i17, o("ok"));
            return;
        }
        if (a17 == 2) {
            c0Var.a(i17, p("fail:invalid login", hashMap));
            return;
        }
        if (a17 == 3) {
            c0Var.a(i17, p("fail:low version", hashMap));
        } else if (a17 == 4) {
            c0Var.a(i17, p("fail:empty xclient data or pc not supported", hashMap));
        } else {
            hashMap.put("errCode", 0);
            c0Var.a(i17, p("fail:unknown reason", hashMap));
        }
    }
}

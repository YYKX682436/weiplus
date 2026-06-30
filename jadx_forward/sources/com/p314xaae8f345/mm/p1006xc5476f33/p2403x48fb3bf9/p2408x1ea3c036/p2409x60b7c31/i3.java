package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class i3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString(dm.i4.f66875xa013b0d5);
            if (optString == null || optString.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiProfile", "doProfile fail, username is null");
                q5Var.a("fail", null);
                return;
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.F3(optString) && !((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ui()) {
                if (context != null) {
                    dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pas), 0).show();
                }
                q5Var.a("fail", null);
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.w0.c(true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.e3(this));
                q5Var.a("fail", null);
                return;
            }
            if (!gm0.j1.b().n()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiProfile", "doProfile, MMCore.hasCfgDefaultUin() is false");
                q5Var.a("fail", null);
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(optString, true);
            if (n17 == null || ((int) n17.E2) <= 0) {
                n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(optString);
            }
            android.content.Intent intent = new android.content.Intent();
            java.lang.String optString2 = jSONObject.optString("profileReportInfo");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                intent.putExtra("key_add_contact_report_info", optString2);
            }
            if (n17 == null || ((int) n17.E2) <= 0) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f3(this, optString, q5Var));
                ((c01.k7) c01.n8.a()).b(optString, 17, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.h3(this, context, q5Var, Q, intent));
                return;
            }
            intent.addFlags(268435456);
            intent.putExtra("Contact_User", n17.d1());
            if (n17.k2()) {
                intent.putExtra("Contact_Scene", 42);
            }
            if (n17.r2()) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f c6005x8a110b2f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f();
                am.au auVar = c6005x8a110b2f.f136299g;
                auVar.f87720a = intent;
                auVar.f87721b = n17.d1();
                c6005x8a110b2f.e();
            }
            ((com.p314xaae8f345.mm.app.y7) dw4.a.f325830a).l(intent, context);
            q5Var.a(null, null);
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiProfile", "parase json fail");
            q5Var.a("fail", null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}

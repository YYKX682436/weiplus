package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes8.dex */
public class j5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    public final void A(android.content.Context context, boolean z17, android.content.Intent intent) {
        if (!z17 || !(context instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f)) {
            j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, z2.j.a(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559345c6, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p).toBundle());
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context;
        p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 wi6 = ((vw.o) ((rv.a3) i95.n0.c(rv.a3.class))).wi(activityC1102x9ee2d9f, intent, null, 0, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).D2(wi6);
        wi6.mo7414x35dafd(activityC1102x9ee2d9f.mo7595x9cdc264(), "BizContactInfoDialogFragment");
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.f66875xa013b0d5);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.F3(optString) && !((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ui()) {
            android.content.Context c17 = c();
            if (c17 != null) {
                dp.a.m125854x26a183b(c17, c17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p4e), 0).show();
            }
            this.f224976f.a("photo account disabled");
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("halfPage", false);
        android.content.Intent intent = new android.content.Intent();
        try {
            intent.putExtra("nextAnimIn", ra3.h0.a(jSONObject));
            intent.putExtra("currentAnimOut", ra3.h0.b(jSONObject));
            android.content.Context c18 = c();
            if (!(c18 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) && !(c18 instanceof android.app.Activity) && !(c18 instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f)) {
                intent.addFlags(268435456);
            }
            if (optString == null || optString.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiProfile", "profile fail, username is null");
                this.f224976f.a("username is null");
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.w0.c(true, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.f5(this, c18));
                this.f224976f.a("fail");
                return;
            }
            if (!gm0.j1.b().n()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiProfile", "have to login");
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(optString, true);
            if (n17 == null || ((int) n17.E2) <= 0) {
                n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(optString);
            }
            java.lang.String optString2 = jSONObject.optString("profileReportInfo");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                intent.putExtra("key_add_contact_report_info", optString2);
            }
            if (n17 == null || ((int) n17.E2) <= 0) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.w0.c(true, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.i5(this, c18, optString, intent, optBoolean));
                return;
            }
            intent.putExtra("Contact_User", n17.d1());
            if (n17.k2()) {
                intent.putExtra("Contact_Scene", 42);
            }
            A(c18, optBoolean, intent);
            this.f224976f.d(false);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiProfile", e17, "parse json", new java.lang.Object[0]);
            this.f224976f.a("exception");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}

package b54;

/* loaded from: classes3.dex */
public final class a implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f99627a;

    public a(yz5.l lVar) {
        this.f99627a = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper$requestAppointment$1");
        yz5.l lVar = this.f99627a;
        if (lVar != null) {
            lVar.mo146xb9724478(new jz5.o(1, -1, -1));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper$requestAppointment$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void b(int i17, int i18, java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        int i19;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper$requestAppointment$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AppointmentHelper", "onCallback, errType=" + i17 + ", errCode=" + i18 + ", data=" + obj);
        yz5.l lVar = this.f99627a;
        if (i17 != 0 || i18 != 0 || !(obj instanceof java.lang.String)) {
            if (lVar != null) {
                lVar.mo146xb9724478(new jz5.o(5, -1, -1));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper$requestAppointment$1");
            return;
        }
        if (lVar != null) {
            java.lang.String str = (java.lang.String) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$parseData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper");
            jz5.f0 f0Var = null;
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (org.json.JSONException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AppointmentHelper", "parse result data error");
                jSONObject = null;
            }
            if (jSONObject != null) {
                i19 = jSONObject.optInt("opType", -1);
                i27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(jSONObject.optString("status"), -1);
                f0Var = jz5.f0.f384359a;
            } else {
                i19 = -1;
                i27 = -1;
            }
            int i28 = 1;
            int i29 = f0Var == null ? 1 : 0;
            if (i29 != 0 || (i19 != -1 && i27 != -1)) {
                i28 = i29;
            }
            jz5.o oVar = new jz5.o(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$parseData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper");
            lVar.mo146xb9724478(oVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper$requestAppointment$1");
    }
}

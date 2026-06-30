package b54;

/* loaded from: classes3.dex */
public final class a implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f18094a;

    public a(yz5.l lVar) {
        this.f18094a = lVar;
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper$requestAppointment$1");
        yz5.l lVar = this.f18094a;
        if (lVar != null) {
            lVar.invoke(new jz5.o(1, -1, -1));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper$requestAppointment$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        int i19;
        int i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper$requestAppointment$1");
        com.tencent.mars.xlog.Log.i("SnsAd.AppointmentHelper", "onCallback, errType=" + i17 + ", errCode=" + i18 + ", data=" + obj);
        yz5.l lVar = this.f18094a;
        if (i17 != 0 || i18 != 0 || !(obj instanceof java.lang.String)) {
            if (lVar != null) {
                lVar.invoke(new jz5.o(5, -1, -1));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper$requestAppointment$1");
            return;
        }
        if (lVar != null) {
            java.lang.String str = (java.lang.String) obj;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$parseData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper");
            jz5.f0 f0Var = null;
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (org.json.JSONException unused) {
                com.tencent.mars.xlog.Log.e("SnsAd.AppointmentHelper", "parse result data error");
                jSONObject = null;
            }
            if (jSONObject != null) {
                i19 = jSONObject.optInt("opType", -1);
                i27 = com.tencent.mm.sdk.platformtools.t8.D1(jSONObject.optString("status"), -1);
                f0Var = jz5.f0.f302826a;
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
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$parseData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper");
            lVar.invoke(oVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper$requestAppointment$1");
    }
}

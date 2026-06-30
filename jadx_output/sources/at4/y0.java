package at4;

/* loaded from: classes9.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f14013a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f14014b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f14015c;

    public static void a(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.WCPayUnderAgeActionReportStruct wCPayUnderAgeActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayUnderAgeActionReportStruct();
        wCPayUnderAgeActionReportStruct.f62129d = i17;
        wCPayUnderAgeActionReportStruct.k();
    }

    public static at4.y0 b(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("under_age_dialog");
            if (jSONObject2 == null) {
                return null;
            }
            at4.y0 y0Var = new at4.y0();
            y0Var.f14013a = jSONObject2.optString("wording");
            y0Var.f14014b = jSONObject2.optString("btn_cancel");
            y0Var.f14015c = jSONObject2.optString("btn_confirm");
            return y0Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UnderAgeDialog", "parseUnderAgeDialogFromJson Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            return null;
        }
    }
}

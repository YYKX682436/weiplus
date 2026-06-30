package at4;

/* loaded from: classes9.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f95546a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f95547b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f95548c;

    public static void a(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7059xdda55242 c7059xdda55242 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7059xdda55242();
        c7059xdda55242.f143662d = i17;
        c7059xdda55242.k();
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
            y0Var.f95546a = jSONObject2.optString("wording");
            y0Var.f95547b = jSONObject2.optString("btn_cancel");
            y0Var.f95548c = jSONObject2.optString("btn_confirm");
            return y0Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UnderAgeDialog", "parseUnderAgeDialogFromJson Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            return null;
        }
    }
}

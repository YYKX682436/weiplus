package w93;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw93/a;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            return;
        }
        try {
            int optInt = jSONObject.optInt("businessId");
            boolean z18 = true;
            if (jSONObject.optInt("isBatchReport") != 1) {
                z18 = false;
            }
            java.lang.String optString = jSONObject.optString("infoList", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (r26.n0.N(optString)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppJsApiSdkReporter", "empty infoList");
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5655x22761072 c5655x22761072 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5655x22761072();
            am.xh xhVar = c5655x22761072.f135981g;
            xhVar.f89911a = optInt;
            xhVar.f89912b = z18;
            xhVar.f89913c = optString;
            c5655x22761072.e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiSdkReporter", "cur bizId = " + optInt + ", isBatchReport = " + z18 + ", info = " + jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiSdkReporter", "invoke error " + e17);
        }
    }
}

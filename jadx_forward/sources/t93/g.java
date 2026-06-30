package t93;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt93/g;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        jz5.l lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiLiveCustomBusiness", "invoke appId:" + str + ",data:" + jSONObject);
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        if (jSONObject.optInt("type") == 4) {
            java.lang.String optString = jSONObject.optString("themeId");
            if (optString == null || optString.length() == 0) {
                lVar = new jz5.l(java.lang.Boolean.FALSE, "themId is error: " + optString);
            } else {
                android.content.Intent intent = new android.content.Intent();
                uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
                android.content.Context c17 = c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getContext(...)");
                if (optString == null) {
                    optString = "";
                }
                ((v40.s) nVar).Bi(c17, intent, optString);
                lVar = new jz5.l(java.lang.Boolean.TRUE, "");
            }
        } else {
            lVar = new jz5.l(java.lang.Boolean.FALSE, "unknown type");
        }
        if (((java.lang.Boolean) lVar.f384366d).booleanValue()) {
            this.f224976f.d(false);
        } else {
            this.f224976f.a((java.lang.String) lVar.f384367e);
        }
    }
}

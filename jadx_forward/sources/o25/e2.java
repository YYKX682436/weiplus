package o25;

/* loaded from: classes4.dex */
public final class e2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424043c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.c2 f424044d;

    public e2(java.lang.String str, java.lang.String str2, java.lang.String str3, o25.c2 c2Var) {
        this.f424041a = str;
        this.f424042b = str2;
        this.f424043c = str3;
        this.f424044d = c2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public final boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        org.json.JSONObject jSONObject;
        java.lang.String str2;
        int i18;
        java.lang.String str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewAsLiteAppHandler", "handle for sessionId:" + this.f424041a + ", receive callback(instanceId:" + j17 + ", actionName:" + str + ", data:" + obj + ", callbackId:" + i17 + ')');
        if (obj instanceof org.json.JSONObject) {
            jSONObject = (org.json.JSONObject) obj;
        } else {
            if (obj instanceof java.lang.String) {
                try {
                    jSONObject = new org.json.JSONObject((java.lang.String) obj);
                } catch (org.json.JSONException unused) {
                }
            }
            jSONObject = null;
        }
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("result");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, ya.b.f77504xbb80cbe3)) {
                i18 = 0;
                str3 = null;
                str2 = jSONObject.toString();
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "cancel")) {
                str3 = null;
                str2 = jSONObject.toString();
                i18 = -2;
            } else {
                str3 = null;
                i18 = -3;
                str2 = jSONObject.toString();
            }
        } else {
            str2 = null;
            i18 = -3;
            str3 = "wrong data when on dispatch";
        }
        o25.g2.f424060a.b(this.f424042b, this.f424043c, this.f424041a, i18, str3, str2);
        o25.c2 c2Var = this.f424044d;
        if (c2Var != null) {
            c2Var.f();
        }
        return false;
    }
}

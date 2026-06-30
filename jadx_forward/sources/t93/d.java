package t93;

/* loaded from: classes.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f498105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t93.e f498106e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, t93.e eVar) {
        super(3);
        this.f498105d = str;
        this.f498106e = eVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj3).intValue();
        t93.e eVar = this.f498106e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.putOpt("ret", java.lang.Integer.valueOf(intValue));
            jSONObject.putOpt("url", str);
            jSONObject.putOpt("requestId", this.f498105d);
            eVar.f224976f.c(jSONObject, false);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiGetFinderLivePreviewUrl", e17, "", new java.lang.Object[0]);
            eVar.f224976f.a("fail");
        }
        return jz5.f0.f384359a;
    }
}

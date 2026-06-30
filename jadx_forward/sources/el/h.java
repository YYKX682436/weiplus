package el;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el.k f335248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, el.k kVar) {
        super(3);
        this.f335247d = str;
        this.f335248e = kVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String errorMsg = (java.lang.String) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = this.f335247d;
        if (intValue2 == 0 && intValue == 0) {
            jSONObject.put("result", true);
            jSONObject.put("errMsg", errorMsg);
            jSONObject.put(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ParamKey.f15121xc2d3420e, str);
        } else {
            jSONObject.put("result", false);
            jSONObject.put("errMsg", errorMsg);
            jSONObject.put(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ParamKey.f15121xc2d3420e, str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiFavoriteAction", "[handleDeleteFavorite] errType = " + intValue2 + ", errCode = " + intValue + ", errMsg = " + errorMsg + ", identifier = " + str + ", return json = " + jSONObject);
        this.f335248e.f224976f.c(jSONObject, false);
        return jz5.f0.f384359a;
    }
}

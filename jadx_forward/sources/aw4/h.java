package aw4;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aw4.l f96414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, aw4.l lVar) {
        super(3);
        this.f96413d = str;
        this.f96414e = lVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        java.lang.String str = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj3).intValue();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.putOpt("ret", java.lang.Integer.valueOf(intValue));
            jSONObject.putOpt("url", str);
            jSONObject.putOpt("requestId", this.f96413d);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.BaseWebSearchJSApi", "getFinderLivePreviewUrl " + e17.getMessage());
        }
        aw4.q i17 = this.f96414e.i();
        if (i17 != null && (mo9090x86b9ebe3 = i17.mo9090x86b9ebe3()) != null) {
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onGetFinderLivePreviewUrl", jSONObject2);
                java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onGetFinderLivePreviewUrl", "onGetFinderLivePreviewUrl", jSONObject2}, 3));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e18, "notifyJsEvent", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f384359a;
    }
}

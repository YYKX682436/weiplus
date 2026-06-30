package ab1;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f2741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ab1.x f2743f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.appbrand.y yVar, int i17, ab1.x xVar) {
        super(1);
        this.f2741d = yVar;
        this.f2742e = i17;
        this.f2743f = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectResponse response = (com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectResponse) obj;
        kotlin.jvm.internal.o.g(response, "response");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ab1.x xVar = this.f2743f;
        xVar.getClass();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("postcode", java.lang.String.valueOf(response.f78709e));
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        jSONObject2.put("code", jSONArray);
        jSONObject2.put("value", jSONArray2);
        java.util.Iterator it = response.f78708d.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                org.json.JSONObject put = jSONObject.put("value", jSONObject2);
                java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (put == null) {
                    put = new org.json.JSONObject();
                }
                try {
                    put.put("errno", 0);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                this.f2741d.a(this.f2742e, xVar.u(str, put));
                return jz5.f0.f302826a;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode addressSelectorContract$AddressNode = (com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode) next;
            jSONArray2.put(i17, addressSelectorContract$AddressNode.f78703d);
            jSONArray.put(i17, java.lang.String.valueOf(addressSelectorContract$AddressNode.f78704e));
            i17 = i18;
        }
    }
}

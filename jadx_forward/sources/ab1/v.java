package ab1;

/* loaded from: classes.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f84274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f84275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ab1.x f84276f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, ab1.x xVar) {
        super(1);
        this.f84274d = yVar;
        this.f84275e = i17;
        this.f84276f = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11956x94aa59fc response = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11956x94aa59fc) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ab1.x xVar = this.f84276f;
        xVar.getClass();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("postcode", java.lang.String.valueOf(response.f160242e));
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        jSONObject2.put("code", jSONArray);
        jSONObject2.put("value", jSONArray2);
        java.util.Iterator it = response.f160241d.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                org.json.JSONObject put = jSONObject.put("value", jSONObject2);
                java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                if (put == null) {
                    put = new org.json.JSONObject();
                }
                try {
                    put.put("errno", 0);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                this.f84274d.a(this.f84275e, xVar.u(str, put));
                return jz5.f0.f384359a;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7 c11954x6b9417d7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7) next;
            jSONArray2.put(i17, c11954x6b9417d7.f160236d);
            jSONArray.put(i17, java.lang.String.valueOf(c11954x6b9417d7.f160237e));
            i17 = i18;
        }
    }
}

package ab1;

/* loaded from: classes.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f84277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f84278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ab1.x f84279f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, ab1.x xVar) {
        super(0);
        this.f84277d = yVar;
        this.f84278e = i17;
        this.f84279f = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ab1.x xVar = this.f84279f;
        xVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 1);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        this.f84277d.a(this.f84278e, xVar.u(str, jSONObject));
        return jz5.f0.f384359a;
    }
}

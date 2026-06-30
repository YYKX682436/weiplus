package ab1;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f2744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ab1.x f2746f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.appbrand.y yVar, int i17, ab1.x xVar) {
        super(0);
        this.f2744d = yVar;
        this.f2745e = i17;
        this.f2746f = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ab1.x xVar = this.f2746f;
        xVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 1);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        this.f2744d.a(this.f2745e, xVar.u(str, jSONObject));
        return jz5.f0.f302826a;
    }
}

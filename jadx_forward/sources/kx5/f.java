package kx5;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kx5.m f394828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f394830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kx5.n f394831g;

    public f(kx5.n nVar, kx5.m mVar, java.lang.String str, int i17) {
        this.f394831g = nVar;
        this.f394828d = mVar;
        this.f394829e = str;
        this.f394830f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f394829e;
        kx5.c cVar = (kx5.c) this.f394828d;
        nx5.c.b("WxaRouter.WxaRouter", "invoke releaseEngine timeout. destroy engine: %d", java.lang.Integer.valueOf(cVar.f394819b));
        if (!cVar.f394818a) {
            kx5.n.a(cVar.f394821d, cVar.f394820c);
            cVar.f394818a = true;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(ya.b.f77491x8758c4e1, str);
            jSONObject.put("timeout", this.f394830f);
        } catch (org.json.JSONException unused) {
        }
        kx5.l lVar = this.f394831g.f394856m;
        if (lVar != null) {
            lVar.mo65523x7f55f5a4("invokeMethodTimeout", jSONObject.toString(), "");
        }
        nx5.c.c("WxaRouter.WxaRouter", "invokeMethod %s timeout", str);
    }
}

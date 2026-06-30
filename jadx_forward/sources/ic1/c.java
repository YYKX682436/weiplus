package ic1;

/* loaded from: classes7.dex */
public class c implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f371834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f371835g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ic1.d f371836h;

    public c(ic1.d dVar, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f371836h = dVar;
        this.f371832d = str;
        this.f371833e = str2;
        this.f371834f = lVar;
        this.f371835g = i17;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "JsApiSetEntryPath";
    }

    @Override // java.lang.Runnable
    public void run() {
        k91.b3 b3Var = (k91.b3) nd.f.a(k91.b3.class);
        java.lang.String str = this.f371833e;
        if (b3Var != null) {
            str = ((nd1.l2) b3Var).a(str);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(str + "_entryPagePath");
        if (M != null) {
            M.D("keyEntryPagePath", this.f371832d);
        }
        ic1.d dVar = this.f371836h;
        dVar.getClass();
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        this.f371834f.a(this.f371835g, dVar.u(str2, jSONObject));
    }
}

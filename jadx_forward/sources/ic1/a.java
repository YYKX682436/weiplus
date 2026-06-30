package ic1;

/* loaded from: classes7.dex */
public class a implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f371829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f371830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ic1.b f371831g;

    public a(ic1.b bVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f371831g = bVar;
        this.f371828d = str;
        this.f371829e = lVar;
        this.f371830f = i17;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return ic1.b.f69918x24728b;
    }

    @Override // java.lang.Runnable
    public void run() {
        k91.b3 b3Var = (k91.b3) nd.f.a(k91.b3.class);
        java.lang.String str = this.f371828d;
        if (b3Var != null) {
            str = ((nd1.l2) b3Var).a(str);
        }
        k91.s1.a(str);
        ic1.b bVar = this.f371831g;
        bVar.getClass();
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
        this.f371829e.a(this.f371830f, bVar.u(str2, jSONObject));
    }
}

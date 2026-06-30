package t00;

/* loaded from: classes.dex */
public final class e1 implements com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f495809a;

    /* renamed from: b, reason: collision with root package name */
    public c00.n3 f495810b;

    /* renamed from: c, reason: collision with root package name */
    public org.json.JSONObject f495811c;

    public final void a(int i17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (!(str == null || r26.n0.N(str))) {
            jSONObject.putOpt("encryptUserName", str);
        }
        jSONObject.putOpt("relayParams", this.f495809a);
        v00.a aVar = new v00.a(f10.a.f340075d, jSONObject);
        c00.n3 n3Var = this.f495810b;
        if (n3Var != null) {
            n3Var.c(aVar);
        }
    }
}

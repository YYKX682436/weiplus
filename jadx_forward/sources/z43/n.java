package z43;

/* loaded from: classes8.dex */
public class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6289xd4421c6b c6289xd4421c6b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6289xd4421c6b();
        am.f30 f30Var = c6289xd4421c6b.f136537g;
        try {
            f30Var.f88166a = jSONObject.getString("eventName");
            f30Var.f88168c = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.h0) ((m33.b1) i95.n0.c(m33.b1.class))).Ai(c());
            f30Var.f88167b = jSONObject.toString();
            c6289xd4421c6b.e();
        } catch (org.json.JSONException unused) {
            this.f224976f.a("Parse json fail");
        }
    }
}

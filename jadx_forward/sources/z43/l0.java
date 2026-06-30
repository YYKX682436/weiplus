package z43;

/* loaded from: classes8.dex */
public class l0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiSetGameTab", "data is null");
            this.f224976f.a("null_data");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6289xd4421c6b c6289xd4421c6b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6289xd4421c6b();
        java.lang.String Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.h0) ((m33.b1) i95.n0.c(m33.b1.class))).Ai(c());
        am.f30 f30Var = c6289xd4421c6b.f136537g;
        f30Var.f88168c = Ai;
        f30Var.f88166a = this.f380556d;
        f30Var.f88167b = jSONObject.toString();
        c6289xd4421c6b.e();
    }
}

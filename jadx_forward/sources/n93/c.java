package n93;

/* loaded from: classes.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        l81.b1 b1Var = new l81.b1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        b1Var.f398574s = c11812xa040dc98;
        c11812xa040dc98.f158856e = jSONObject.optString("referrerAppId");
        b1Var.f398574s.f158855d = 2;
        b1Var.f398547b = jSONObject.optString("targetAppId");
        b1Var.f398555f = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        java.lang.String optString = jSONObject.optString("envVersion");
        optString.getClass();
        b1Var.f398549c = optString.equals("trial") ? 2 : !optString.equals("develop") ? 0 : 1;
        b1Var.f398565k = 1055;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b1Var.f398547b) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b1Var.f398555f)) {
            this.f224976f.a("fail");
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).ij(b1Var, new n93.b(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}

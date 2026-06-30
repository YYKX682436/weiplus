package ax4;

/* loaded from: classes.dex */
public class b extends qw4.a {
    @Override // nw4.q2
    public boolean a(nw4.k kVar, nw4.y2 y2Var) {
        org.json.JSONObject jSONObject = y2Var.f422547d;
        if (jSONObject == null) {
            return false;
        }
        java.lang.String mo52328xed046e09 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1181xed046e09.InterfaceC12555xd3034a9a) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1181xed046e09.InterfaceC12555xd3034a9a.class)).mo52328xed046e09(jSONObject, true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo52328xed046e09)) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":error", null);
        } else {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":" + mo52328xed046e09, null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 366;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j4.f34369x24728b;
    }
}

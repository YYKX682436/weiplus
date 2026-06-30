package nd1;

/* loaded from: classes7.dex */
public final class j0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72943x366c91de = 955;

    /* renamed from: NAME */
    public static final java.lang.String f72944x24728b = "preloadWebview";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke appId:");
        sb6.append(v5Var != null ? v5Var.mo48798x74292566() : null);
        sb6.append(", webviewId:");
        sb6.append(v5Var != null ? v5Var.mo50260x9f1221c2() : 0);
        sb6.append(", url:");
        sb6.append(v5Var != null ? v5Var.X1() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiPreloadNextWebview", sb6.toString());
        if (v5Var != null && (mo32091x9a3f0ba2 = v5Var.mo32091x9a3f0ba2()) != null && (x07 = mo32091x9a3f0ba2.x0()) != null) {
            x07.O(f72944x24728b);
        }
        if (v5Var != null) {
            v5Var.a(i17, o("ok"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}

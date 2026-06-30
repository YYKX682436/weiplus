package kc1;

/* loaded from: classes7.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72429x366c91de = 861;

    /* renamed from: NAME */
    public static final java.lang.String f72430x24728b = "faceDetect";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        kc1.f b17 = kc1.f.b();
        b17.f387827b.execute(new kc1.g(this, b17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar, i17, jSONObject));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0
    public java.nio.ByteBuffer y(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v vVar, int i17) {
        return "frameBuffer".equalsIgnoreCase(str) ? vVar.j0(i17, true) : vVar.j0(i17, false);
    }
}

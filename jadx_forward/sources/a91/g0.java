package a91;

/* loaded from: classes13.dex */
public class g0 implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 4) {
            return false;
        }
        float g17 = ik1.w.g(jSONArray, 0);
        float g18 = ik1.w.g(jSONArray, 1);
        float g19 = ik1.w.g(jSONArray, 2);
        org.json.JSONArray optJSONArray = jSONArray.optJSONArray(3);
        if (optJSONArray == null || optJSONArray.length() < 4) {
            return false;
        }
        int b17 = ik1.w.b(optJSONArray);
        iVar.f552245b.setShadowLayer(g19, g17, g18, b17);
        iVar.f552244a.setShadowLayer(g19, g17, g18, b17);
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11785xaa41625e c11785xaa41625e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11785xaa41625e) interfaceC11753x43f81f3c;
        if (c11785xaa41625e == null) {
            return false;
        }
        float f17 = c11785xaa41625e.f158658e;
        float f18 = c11785xaa41625e.f158659f;
        float f19 = c11785xaa41625e.f158660g;
        int i17 = c11785xaa41625e.f158661h;
        iVar.f552245b.setShadowLayer(f19, f17, f18, i17);
        iVar.f552244a.setShadowLayer(f19, f17, f18, i17);
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "setShadow";
    }
}

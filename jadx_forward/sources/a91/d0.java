package a91;

/* loaded from: classes13.dex */
public class d0 implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        float g17 = ik1.w.g(jSONArray, 0);
        iVar.f552245b.setStrokeWidth(g17);
        iVar.f552244a.setStrokeWidth(g17);
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11783x4b1b1610 c11783x4b1b1610 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11783x4b1b1610) interfaceC11753x43f81f3c;
        if (c11783x4b1b1610 == null) {
            return false;
        }
        float f17 = c11783x4b1b1610.f158652e;
        iVar.f552245b.setStrokeWidth(f17);
        iVar.f552244a.setStrokeWidth(f17);
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "setLineWidth";
    }
}

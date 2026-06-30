package a91;

/* loaded from: classes13.dex */
public class e0 implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        float optDouble = (float) jSONArray.optDouble(0);
        iVar.f552245b.setStrokeMiter(optDouble);
        iVar.f552244a.setStrokeMiter(optDouble);
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11771xf251b758 c11771xf251b758 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11771xf251b758) interfaceC11753x43f81f3c;
        if (c11771xf251b758 == null) {
            return false;
        }
        float f17 = c11771xf251b758.f158638e;
        iVar.f552245b.setStrokeMiter(f17);
        iVar.f552244a.setStrokeMiter(f17);
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "setMiterLimit";
    }
}

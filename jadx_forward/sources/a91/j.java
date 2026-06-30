package a91;

/* loaded from: classes13.dex */
public class j implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 4) {
            return false;
        }
        float g17 = ik1.w.g(jSONArray, 0);
        float g18 = ik1.w.g(jSONArray, 1);
        canvas.drawRect(g17, g18, g17 + ik1.w.g(jSONArray, 2), g18 + ik1.w.g(jSONArray, 3), iVar.f552244a);
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11757x2259e7b8 c11757x2259e7b8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11757x2259e7b8) interfaceC11753x43f81f3c;
        if (c11757x2259e7b8 == null) {
            return false;
        }
        float f17 = c11757x2259e7b8.f158597e;
        float f18 = c11757x2259e7b8.f158598f;
        canvas.drawRect(f17, f18, f17 + c11757x2259e7b8.f158599g, f18 + c11757x2259e7b8.f158600h, iVar.f552244a);
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "strokeRect";
    }
}

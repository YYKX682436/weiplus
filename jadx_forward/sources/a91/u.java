package a91;

/* loaded from: classes13.dex */
public class u implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        float i17 = ik1.w.i(jSONArray, 0);
        iVar.f552245b.setTextSize(i17);
        iVar.f552244a.setTextSize(i17);
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11775x76d6a50e c11775x76d6a50e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11775x76d6a50e) interfaceC11753x43f81f3c;
        if (c11775x76d6a50e == null) {
            return false;
        }
        float f17 = c11775x76d6a50e.f158643e;
        iVar.f552245b.setTextSize(f17);
        iVar.f552244a.setTextSize(f17);
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "setFontSize";
    }
}

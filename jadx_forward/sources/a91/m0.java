package a91;

/* loaded from: classes13.dex */
public class m0 implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 2) {
            return false;
        }
        canvas.translate(ik1.w.g(jSONArray, 0), ik1.w.g(jSONArray, 1));
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11790xdc25d2b2 c11790xdc25d2b2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11790xdc25d2b2) interfaceC11753x43f81f3c;
        if (c11790xdc25d2b2 == null) {
            return false;
        }
        canvas.translate(c11790xdc25d2b2.f158671e, c11790xdc25d2b2.f158672f);
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "translate";
    }
}

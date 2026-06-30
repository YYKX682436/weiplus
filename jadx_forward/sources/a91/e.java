package a91;

/* loaded from: classes13.dex */
public class e implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 5) {
            return false;
        }
        c(iVar, canvas, ik1.w.g(jSONArray, 0), ik1.w.g(jSONArray, 1), ik1.w.g(jSONArray, 2), (float) jSONArray.optDouble(3), (float) jSONArray.optDouble(4));
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11755xa0027192 c11755xa0027192 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11755xa0027192) interfaceC11753x43f81f3c;
        if (c11755xa0027192 == null) {
            return false;
        }
        c(iVar, canvas, c11755xa0027192.f158582e, c11755xa0027192.f158583f, c11755xa0027192.f158584g, c11755xa0027192.f158585h, c11755xa0027192.f158586i);
        return true;
    }

    public final boolean c(z81.i iVar, android.graphics.Canvas canvas, float f17, float f18, float f19, float f27, float f28) {
        canvas.drawArc(new android.graphics.RectF(f17 - f19, f18 - f19, f17 + f19, f18 + f19), (float) ((f27 / 3.141592653589793d) * 180.0d), (float) ((f28 / 3.141592653589793d) * 180.0d), true, iVar.f552244a);
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "arc";
    }
}

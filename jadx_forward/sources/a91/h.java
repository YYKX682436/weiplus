package a91;

/* loaded from: classes13.dex */
public class h implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        int length = jSONArray.length();
        if (length < 3) {
            return false;
        }
        return c(iVar, canvas, length, jSONArray.optString(0), ik1.w.g(jSONArray, 1), ik1.w.g(jSONArray, 2), ik1.w.g(jSONArray, 3), ik1.w.g(jSONArray, 4), jSONArray.optInt(5), jSONArray.optInt(6), jSONArray.optInt(7), jSONArray.optInt(8));
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11756xc414ba9 c11756xc414ba9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11756xc414ba9) interfaceC11753x43f81f3c;
        if (c11756xc414ba9 == null) {
            return false;
        }
        return c(iVar, canvas, c11756xc414ba9.f158587e, c11756xc414ba9.f158588f, c11756xc414ba9.f158589g, c11756xc414ba9.f158590h, c11756xc414ba9.f158591i, c11756xc414ba9.f158592m, c11756xc414ba9.f158593n, c11756xc414ba9.f158594o, c11756xc414ba9.f158595p, c11756xc414ba9.f158596q);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(z81.i r17, android.graphics.Canvas r18, int r19, java.lang.String r20, float r21, float r22, float r23, float r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a91.h.c(z81.i, android.graphics.Canvas, int, java.lang.String, float, float, float, float, int, int, int, int):boolean");
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "drawImage";
    }
}

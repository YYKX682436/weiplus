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
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawImageActionArg drawImageActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawImageActionArg) drawActionArg;
        if (drawImageActionArg == null) {
            return false;
        }
        return c(iVar, canvas, drawImageActionArg.f77054e, drawImageActionArg.f77055f, drawImageActionArg.f77056g, drawImageActionArg.f77057h, drawImageActionArg.f77058i, drawImageActionArg.f77059m, drawImageActionArg.f77060n, drawImageActionArg.f77061o, drawImageActionArg.f77062p, drawImageActionArg.f77063q);
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
    public java.lang.String getMethod() {
        return "drawImage";
    }
}

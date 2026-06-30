package a91;

/* loaded from: classes13.dex */
public class k implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 3) {
            return false;
        }
        c(iVar, canvas, jSONArray.optString(0), ik1.w.g(jSONArray, 1), ik1.w.g(jSONArray, 2), ik1.w.g(jSONArray, 3));
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11758x36229e8f c11758x36229e8f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11758x36229e8f) interfaceC11753x43f81f3c;
        if (c11758x36229e8f == null) {
            return false;
        }
        c(iVar, canvas, c11758x36229e8f.f158601e, c11758x36229e8f.f158602f, c11758x36229e8f.f158603g, c11758x36229e8f.f158604h);
        return true;
    }

    public final boolean c(z81.i iVar, android.graphics.Canvas canvas, java.lang.String str, float f17, float f18, float f19) {
        float abs;
        e91.b bVar;
        android.graphics.Paint.FontMetrics fontMetrics = iVar.f552244a.getFontMetrics();
        e91.a aVar = iVar.f552244a.f331873d;
        if (aVar == e91.a.TOP) {
            abs = java.lang.Math.abs(fontMetrics.ascent);
        } else {
            if (aVar != e91.a.MIDDLE) {
                if (aVar == e91.a.BOTTOM) {
                    f18 -= java.lang.Math.abs(fontMetrics.descent);
                }
                bVar = iVar.f552244a;
                float measureText = bVar.measureText(str);
                if (f19 > 0.0f || f19 >= measureText) {
                    canvas.drawText(str, f17, f18, bVar);
                    return true;
                }
                canvas.save();
                canvas.translate(f17, f18);
                canvas.scale(f19 / measureText, 1.0f);
                canvas.drawText(str, 0.0f, 0.0f, bVar);
                canvas.restore();
                return true;
            }
            float f27 = -fontMetrics.ascent;
            float f28 = fontMetrics.descent;
            abs = java.lang.Math.abs(((f27 + f28) / 2.0f) - f28);
        }
        f18 += abs;
        bVar = iVar.f552244a;
        float measureText2 = bVar.measureText(str);
        if (f19 > 0.0f) {
        }
        canvas.drawText(str, f17, f18, bVar);
        return true;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "strokeText";
    }
}

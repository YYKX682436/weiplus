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
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawTextActionArg drawTextActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawTextActionArg) drawActionArg;
        if (drawTextActionArg == null) {
            return false;
        }
        c(iVar, canvas, drawTextActionArg.f77068e, drawTextActionArg.f77069f, drawTextActionArg.f77070g, drawTextActionArg.f77071h);
        return true;
    }

    public final boolean c(z81.i iVar, android.graphics.Canvas canvas, java.lang.String str, float f17, float f18, float f19) {
        float abs;
        e91.b bVar;
        android.graphics.Paint.FontMetrics fontMetrics = iVar.f470711a.getFontMetrics();
        e91.a aVar = iVar.f470711a.f250340d;
        if (aVar == e91.a.TOP) {
            abs = java.lang.Math.abs(fontMetrics.ascent);
        } else {
            if (aVar != e91.a.MIDDLE) {
                if (aVar == e91.a.BOTTOM) {
                    f18 -= java.lang.Math.abs(fontMetrics.descent);
                }
                bVar = iVar.f470711a;
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
        bVar = iVar.f470711a;
        float measureText2 = bVar.measureText(str);
        if (f19 > 0.0f) {
        }
        canvas.drawText(str, f17, f18, bVar);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "strokeText";
    }
}

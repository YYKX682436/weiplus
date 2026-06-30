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
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawArcActionArg drawArcActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawArcActionArg) drawActionArg;
        if (drawArcActionArg == null) {
            return false;
        }
        c(iVar, canvas, drawArcActionArg.f77049e, drawArcActionArg.f77050f, drawArcActionArg.f77051g, drawArcActionArg.f77052h, drawArcActionArg.f77053i);
        return true;
    }

    public final boolean c(z81.i iVar, android.graphics.Canvas canvas, float f17, float f18, float f19, float f27, float f28) {
        canvas.drawArc(new android.graphics.RectF(f17 - f19, f18 - f19, f17 + f19, f18 + f19), (float) ((f27 / 3.141592653589793d) * 180.0d), (float) ((f28 / 3.141592653589793d) * 180.0d), true, iVar.f470711a);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "arc";
    }
}

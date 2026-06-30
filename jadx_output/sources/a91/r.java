package a91;

/* loaded from: classes13.dex */
public class r implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 2) {
            return false;
        }
        canvas.scale((float) jSONArray.optDouble(0), (float) jSONArray.optDouble(1));
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.ScaleActionArg scaleActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.ScaleActionArg) drawActionArg;
        if (scaleActionArg == null) {
            return false;
        }
        canvas.scale(scaleActionArg.f77103e, scaleActionArg.f77104f);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "scale";
    }
}

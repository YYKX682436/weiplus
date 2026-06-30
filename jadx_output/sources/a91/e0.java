package a91;

/* loaded from: classes13.dex */
public class e0 implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        float optDouble = (float) jSONArray.optDouble(0);
        iVar.f470712b.setStrokeMiter(optDouble);
        iVar.f470711a.setStrokeMiter(optDouble);
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SeMiterLimitActionArg seMiterLimitActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SeMiterLimitActionArg) drawActionArg;
        if (seMiterLimitActionArg == null) {
            return false;
        }
        float f17 = seMiterLimitActionArg.f77105e;
        iVar.f470712b.setStrokeMiter(f17);
        iVar.f470711a.setStrokeMiter(f17);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "setMiterLimit";
    }
}

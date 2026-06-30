package a91;

/* loaded from: classes13.dex */
public class u implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        float i17 = ik1.w.i(jSONArray, 0);
        iVar.f470712b.setTextSize(i17);
        iVar.f470711a.setTextSize(i17);
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontSizeActionArg setFontSizeActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontSizeActionArg) drawActionArg;
        if (setFontSizeActionArg == null) {
            return false;
        }
        float f17 = setFontSizeActionArg.f77110e;
        iVar.f470712b.setTextSize(f17);
        iVar.f470711a.setTextSize(f17);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "setFontSize";
    }
}

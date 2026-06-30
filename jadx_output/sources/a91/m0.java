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
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.TranslateActionArg translateActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.TranslateActionArg) drawActionArg;
        if (translateActionArg == null) {
            return false;
        }
        canvas.translate(translateActionArg.f77138e, translateActionArg.f77139f);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "translate";
    }
}

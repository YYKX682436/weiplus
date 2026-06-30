package a91;

/* loaded from: classes13.dex */
public class m implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 4) {
            return false;
        }
        float g17 = ik1.w.g(jSONArray, 0);
        float g18 = ik1.w.g(jSONArray, 1);
        canvas.drawRect(g17, g18, g17 + ik1.w.g(jSONArray, 2), g18 + ik1.w.g(jSONArray, 3), iVar.f470712b);
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.FillRectActionArg fillRectActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.FillRectActionArg) drawActionArg;
        if (fillRectActionArg == null) {
            return false;
        }
        float f17 = fillRectActionArg.f77072e;
        float f18 = fillRectActionArg.f77073f;
        canvas.drawRect(f17, f18, f17 + fillRectActionArg.f77074g, f18 + fillRectActionArg.f77075h, iVar.f470712b);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "fillRect";
    }
}

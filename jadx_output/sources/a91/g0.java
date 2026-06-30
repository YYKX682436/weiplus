package a91;

/* loaded from: classes13.dex */
public class g0 implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 4) {
            return false;
        }
        float g17 = ik1.w.g(jSONArray, 0);
        float g18 = ik1.w.g(jSONArray, 1);
        float g19 = ik1.w.g(jSONArray, 2);
        org.json.JSONArray optJSONArray = jSONArray.optJSONArray(3);
        if (optJSONArray == null || optJSONArray.length() < 4) {
            return false;
        }
        int b17 = ik1.w.b(optJSONArray);
        iVar.f470712b.setShadowLayer(g19, g17, g18, b17);
        iVar.f470711a.setShadowLayer(g19, g17, g18, b17);
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetShadowActionArg setShadowActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetShadowActionArg) drawActionArg;
        if (setShadowActionArg == null) {
            return false;
        }
        float f17 = setShadowActionArg.f77125e;
        float f18 = setShadowActionArg.f77126f;
        float f19 = setShadowActionArg.f77127g;
        int i17 = setShadowActionArg.f77128h;
        iVar.f470712b.setShadowLayer(f19, f17, f18, i17);
        iVar.f470711a.setShadowLayer(f19, f17, f18, i17);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "setShadow";
    }
}

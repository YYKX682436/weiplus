package a91;

/* loaded from: classes13.dex */
public class d0 implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        float g17 = ik1.w.g(jSONArray, 0);
        iVar.f470712b.setStrokeWidth(g17);
        iVar.f470711a.setStrokeWidth(g17);
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineWidthActionArg setLineWidthActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineWidthActionArg) drawActionArg;
        if (setLineWidthActionArg == null) {
            return false;
        }
        float f17 = setLineWidthActionArg.f77119e;
        iVar.f470712b.setStrokeWidth(f17);
        iVar.f470711a.setStrokeWidth(f17);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "setLineWidth";
    }
}

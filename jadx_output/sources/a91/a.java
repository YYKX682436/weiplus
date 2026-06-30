package a91;

/* loaded from: classes13.dex */
public class a implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 4) {
            return false;
        }
        return c(iVar, canvas, ik1.w.g(jSONArray, 0), ik1.w.g(jSONArray, 1), ik1.w.g(jSONArray, 2), ik1.w.g(jSONArray, 3));
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        if (drawActionArg == null || !(drawActionArg instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.ClearRectActionArg)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.ClearRectActionArg clearRectActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.ClearRectActionArg) drawActionArg;
        return c(iVar, canvas, clearRectActionArg.f77042e, clearRectActionArg.f77043f, clearRectActionArg.f77044g, clearRectActionArg.f77045h);
    }

    public final boolean c(z81.i iVar, android.graphics.Canvas canvas, float f17, float f18, float f19, float f27) {
        if (!canvas.isHardwareAccelerated()) {
            iVar.getClass();
            canvas.drawRect(f17, f18, f17 + f19, f18 + f27, iVar.f470715e);
            return false;
        }
        if (canvas instanceof z81.l) {
            ((z81.l) canvas).a(f17, f18, f19 + f17, f27 + f18);
            return true;
        }
        iVar.getClass();
        return false;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "clearRect";
    }
}

package a91;

/* loaded from: classes13.dex */
public class i0 implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        c(iVar, jSONArray.optString(0));
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTextAlignActionArg setTextAlignActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTextAlignActionArg) drawActionArg;
        if (setTextAlignActionArg == null) {
            return false;
        }
        c(iVar, setTextAlignActionArg.f77130e);
        return true;
    }

    public final boolean c(z81.i iVar, java.lang.String str) {
        if ("left".equalsIgnoreCase(str)) {
            iVar.f470711a.setTextAlign(android.graphics.Paint.Align.LEFT);
            iVar.f470712b.setTextAlign(android.graphics.Paint.Align.LEFT);
            return true;
        }
        if ("right".equalsIgnoreCase(str)) {
            iVar.f470711a.setTextAlign(android.graphics.Paint.Align.RIGHT);
            iVar.f470712b.setTextAlign(android.graphics.Paint.Align.RIGHT);
            return true;
        }
        if (!"center".equalsIgnoreCase(str)) {
            return true;
        }
        iVar.f470711a.setTextAlign(android.graphics.Paint.Align.CENTER);
        iVar.f470712b.setTextAlign(android.graphics.Paint.Align.CENTER);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "setTextAlign";
    }
}

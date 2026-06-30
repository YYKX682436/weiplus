package a91;

/* loaded from: classes13.dex */
public class z implements a91.d {
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
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineCapActionArg setLineCapActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineCapActionArg) drawActionArg;
        if (setLineCapActionArg == null) {
            return false;
        }
        c(iVar, setLineCapActionArg.f77115e);
        return true;
    }

    public final boolean c(z81.i iVar, java.lang.String str) {
        if ("butt".equalsIgnoreCase(str)) {
            iVar.f470712b.setStrokeCap(android.graphics.Paint.Cap.BUTT);
            iVar.f470711a.setStrokeCap(android.graphics.Paint.Cap.BUTT);
            return true;
        }
        if ("round".equalsIgnoreCase(str)) {
            iVar.f470712b.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            iVar.f470711a.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            return true;
        }
        if (!"square".equalsIgnoreCase(str)) {
            return true;
        }
        iVar.f470712b.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        iVar.f470711a.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "setLineCap";
    }
}

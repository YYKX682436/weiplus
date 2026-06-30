package a91;

/* loaded from: classes13.dex */
public class c0 implements a91.d {
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
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineJoinActionArg setLineJoinActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineJoinActionArg) drawActionArg;
        if (setLineJoinActionArg == null) {
            return false;
        }
        c(iVar, setLineJoinActionArg.f77118e);
        return true;
    }

    public final boolean c(z81.i iVar, java.lang.String str) {
        if ("miter".equalsIgnoreCase(str)) {
            iVar.f470712b.setStrokeJoin(android.graphics.Paint.Join.MITER);
            iVar.f470711a.setStrokeJoin(android.graphics.Paint.Join.MITER);
            return true;
        }
        if ("round".equalsIgnoreCase(str)) {
            iVar.f470712b.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            iVar.f470711a.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            return true;
        }
        if (!"bevel".equalsIgnoreCase(str)) {
            return true;
        }
        iVar.f470712b.setStrokeJoin(android.graphics.Paint.Join.BEVEL);
        iVar.f470711a.setStrokeJoin(android.graphics.Paint.Join.BEVEL);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "setLineJoin";
    }
}

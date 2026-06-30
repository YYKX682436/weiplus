package a91;

/* loaded from: classes13.dex */
public class c implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        canvas.clipPath(f91.e.f260237a.c(jSONArray));
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        canvas.clipPath(f91.e.f260237a.b((com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArgWrapper) drawActionArg));
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "clipPath";
    }
}

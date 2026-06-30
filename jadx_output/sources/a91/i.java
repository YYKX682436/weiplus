package a91;

/* loaded from: classes13.dex */
public class i implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        canvas.drawPath(f91.e.f260237a.c(jSONArray), iVar.f470711a);
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        canvas.drawPath(f91.e.f260237a.b((com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArgWrapper) drawActionArg), iVar.f470711a);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "strokePath";
    }
}

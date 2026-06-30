package a91;

/* loaded from: classes13.dex */
public class j0 implements a91.d {
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
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTextBaseLineActionArg setTextBaseLineActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTextBaseLineActionArg) drawActionArg;
        if (setTextBaseLineActionArg == null) {
            return false;
        }
        c(iVar, setTextBaseLineActionArg.f77131e);
        return true;
    }

    public final boolean c(z81.i iVar, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SetTextBaselineAction", "SetTextBaselineAction, align:%s", str);
        if ("top".equalsIgnoreCase(str)) {
            e91.b bVar = iVar.f470711a;
            e91.a aVar = e91.a.TOP;
            bVar.f250340d = aVar;
            iVar.f470712b.f250340d = aVar;
            return true;
        }
        if ("middle".equalsIgnoreCase(str)) {
            e91.b bVar2 = iVar.f470711a;
            e91.a aVar2 = e91.a.MIDDLE;
            bVar2.f250340d = aVar2;
            iVar.f470712b.f250340d = aVar2;
            return true;
        }
        if ("bottom".equalsIgnoreCase(str)) {
            e91.b bVar3 = iVar.f470711a;
            e91.a aVar3 = e91.a.BOTTOM;
            bVar3.f250340d = aVar3;
            iVar.f470712b.f250340d = aVar3;
            return true;
        }
        if (!"normal".equalsIgnoreCase(str)) {
            return true;
        }
        e91.b bVar4 = iVar.f470711a;
        e91.a aVar4 = e91.a.NORMAL;
        bVar4.f250340d = aVar4;
        iVar.f470712b.f250340d = aVar4;
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "setTextBaseline";
    }
}

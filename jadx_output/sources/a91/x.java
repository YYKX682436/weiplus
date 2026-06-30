package a91;

/* loaded from: classes13.dex */
public class x implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        try {
            int i17 = jSONArray.getInt(0);
            e91.b bVar = iVar.f470711a;
            float f17 = i17 / 255.0f;
            bVar.f250341e = f17;
            bVar.setColor(bVar.f250342f);
            e91.b bVar2 = iVar.f470712b;
            bVar2.f250341e = f17;
            bVar2.setColor(bVar2.f250342f);
            return true;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SetGlobalAlphaAction", "getGlobalAlpha value error. exception : %s", e17);
            return false;
        }
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetGlobalAlphaActionArg setGlobalAlphaActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetGlobalAlphaActionArg) drawActionArg;
        if (setGlobalAlphaActionArg == null) {
            return false;
        }
        int i17 = setGlobalAlphaActionArg.f77113e;
        e91.b bVar = iVar.f470711a;
        float f17 = i17 / 255.0f;
        bVar.f250341e = f17;
        bVar.setColor(bVar.f250342f);
        e91.b bVar2 = iVar.f470712b;
        bVar2.f250341e = f17;
        bVar2.setColor(bVar2.f250342f);
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "setGlobalAlpha";
    }
}

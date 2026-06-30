package a91;

/* loaded from: classes13.dex */
public class w implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return false;
        }
        try {
            c(iVar, jSONArray.getString(0));
            return true;
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SetFontWeight", "get 'fontWeight' error.");
            return false;
        }
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontWeightArg setFontWeightArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontWeightArg) drawActionArg;
        if (setFontWeightArg == null) {
            return false;
        }
        c(iVar, setFontWeightArg.f77112e);
        return true;
    }

    public final boolean c(z81.i iVar, java.lang.String str) {
        str.getClass();
        if (str.equals("normal")) {
            iVar.f470711a.setFakeBoldText(false);
            iVar.f470712b.setFakeBoldText(false);
        } else if (str.equals("bold")) {
            iVar.f470711a.setFakeBoldText(true);
            iVar.f470712b.setFakeBoldText(true);
        }
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "setFontWeight";
    }
}

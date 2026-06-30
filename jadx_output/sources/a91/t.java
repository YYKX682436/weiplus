package a91;

/* loaded from: classes13.dex */
public class t implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return false;
        }
        try {
            java.lang.String string = jSONArray.getString(0);
            if (android.text.TextUtils.isEmpty(string)) {
                return false;
            }
            e91.b bVar = iVar.f470711a;
            bVar.f250343g = string;
            bVar.setTypeface(android.graphics.Typeface.create(string, bVar.f250344h));
            e91.b bVar2 = iVar.f470712b;
            bVar2.f250343g = string;
            bVar2.setTypeface(android.graphics.Typeface.create(string, bVar2.f250344h));
            return true;
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SetFontFamily", "get 'fontFamily' error.");
            return false;
        }
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontFamilyActionArg setFontFamilyActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontFamilyActionArg) drawActionArg;
        if (setFontFamilyActionArg == null) {
            return false;
        }
        java.lang.String str = setFontFamilyActionArg.f77109e;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        e91.b bVar = iVar.f470711a;
        bVar.f250343g = str;
        bVar.setTypeface(android.graphics.Typeface.create(str, bVar.f250344h));
        e91.b bVar2 = iVar.f470712b;
        bVar2.f250343g = str;
        bVar2.setTypeface(android.graphics.Typeface.create(str, bVar2.f250344h));
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "setFontFamily";
    }
}

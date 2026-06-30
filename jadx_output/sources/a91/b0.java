package a91;

/* loaded from: classes13.dex */
public class b0 implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return false;
        }
        try {
            android.util.DisplayMetrics displayMetrics = ik1.w.f291842a;
            java.lang.Math.round(ik1.w.f() * ((float) jSONArray.getDouble(0)));
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SetLineHeight", "get 'lineHeight' error");
        }
        return false;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        return false;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return "setLineHeight";
    }
}

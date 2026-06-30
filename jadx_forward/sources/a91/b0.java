package a91;

/* loaded from: classes13.dex */
public class b0 implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return false;
        }
        try {
            android.util.DisplayMetrics displayMetrics = ik1.w.f373375a;
            java.lang.Math.round(ik1.w.f() * ((float) jSONArray.getDouble(0)));
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SetLineHeight", "get 'lineHeight' error");
        }
        return false;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.InterfaceC11753x43f81f3c interfaceC11753x43f81f3c) {
        return false;
    }

    @Override // a91.d
    /* renamed from: getMethod */
    public java.lang.String mo869x24dcf3d7() {
        return "setLineHeight";
    }
}

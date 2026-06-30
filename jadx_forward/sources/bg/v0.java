package bg;

/* loaded from: classes7.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f101373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg.f f101374e;

    public v0(bg.f fVar, int i17) {
        this.f101374e = fVar;
        this.f101373d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f101374e;
        int i17 = this.f101373d;
        if (!fVar.B) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onMediaPlayerBufferingUpdate, mp released");
            return;
        }
        if (i17 != fVar.L) {
            fVar.L = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onBufferingUpdate, percent:%s", java.lang.Integer.valueOf(i17));
        }
        if (fVar.U() && fVar.f101319z) {
            fg1.b0 b0Var = (fg1.b0) fVar.f101298i;
            b0Var.getClass();
            try {
                org.json.JSONObject b17 = b0Var.b();
                b17.put("buffered", i17);
                b0Var.a(new fg1.l0(null), b17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoProgress fail", e17);
            }
        }
    }
}

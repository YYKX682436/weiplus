package bg;

/* loaded from: classes7.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg.f f19841e;

    public v0(bg.f fVar, int i17) {
        this.f19841e = fVar;
        this.f19840d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f19841e;
        int i17 = this.f19840d;
        if (!fVar.B) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "onMediaPlayerBufferingUpdate, mp released");
            return;
        }
        if (i17 != fVar.L) {
            fVar.L = i17;
            com.tencent.mars.xlog.Log.i(fVar.A(), "onBufferingUpdate, percent:%s", java.lang.Integer.valueOf(i17));
        }
        if (fVar.U() && fVar.f19786z) {
            fg1.b0 b0Var = (fg1.b0) fVar.f19765i;
            b0Var.getClass();
            try {
                org.json.JSONObject b17 = b0Var.b();
                b17.put("buffered", i17);
                b0Var.a(new fg1.l0(null), b17);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoProgress fail", e17);
            }
        }
    }
}

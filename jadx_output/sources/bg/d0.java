package bg;

/* loaded from: classes7.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg.e0 f19754e;

    public d0(bg.e0 e0Var, java.lang.String str) {
        this.f19754e = e0Var;
        this.f19753d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.e0 e0Var = this.f19754e;
        bg.f fVar = e0Var.f19758a;
        tf.n nVar = bg.f.Y1;
        if (fVar.U()) {
            dg.e eVar = e0Var.f19758a.f19765i;
            java.lang.String str = this.f19753d;
            fg1.b0 b0Var = (fg1.b0) eVar;
            b0Var.getClass();
            try {
                org.json.JSONObject b17 = b0Var.b();
                b17.put("subtitle", str);
                b0Var.a(new fg1.o0(null), b17);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onVideoUpdateSubtitle fail", e17);
            }
        }
    }
}

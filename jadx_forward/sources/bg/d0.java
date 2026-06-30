package bg;

/* loaded from: classes7.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg.e0 f101287e;

    public d0(bg.e0 e0Var, java.lang.String str) {
        this.f101287e = e0Var;
        this.f101286d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.e0 e0Var = this.f101287e;
        bg.f fVar = e0Var.f101291a;
        tf.n nVar = bg.f.Y1;
        if (fVar.U()) {
            dg.e eVar = e0Var.f101291a.f101298i;
            java.lang.String str = this.f101286d;
            fg1.b0 b0Var = (fg1.b0) eVar;
            b0Var.getClass();
            try {
                org.json.JSONObject b17 = b0Var.b();
                b17.put("subtitle", str);
                b0Var.a(new fg1.o0(null), b17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.AppBrandVideoEventHandler", "onVideoUpdateSubtitle fail", e17);
            }
        }
    }
}

package fg1;

/* loaded from: classes7.dex */
public class a1 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pd1.i f343373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg1.g1 f343374b;

    public a1(fg1.g1 g1Var, pd1.i iVar) {
        this.f343374b = g1Var;
        this.f343373a = iVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        pd1.i iVar = this.f343373a;
        fg1.g1 g1Var = this.f343374b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "getVideoPositionAsync, value: " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            bg.f fVar = g1Var.f343401a;
            bg.f fVar2 = g1Var.f343401a;
            fVar.G = ik1.w.c(jSONObject.optInt("x", fVar.G));
            fVar.H = ik1.w.c(jSONObject.optInt("y", fVar.H));
            fVar.A();
            iVar.a(fVar2.C(), fVar2.D());
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "getVideoPositionAsync, parse " + str + " failed");
            iVar.a(g1Var.f343401a.C(), g1Var.f343401a.D());
        }
    }
}

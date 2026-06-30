package nw4;

/* loaded from: classes8.dex */
public class s2 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f422501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f422502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.v2 f422503c;

    public s2(nw4.v2 v2Var, long j17, boolean z17) {
        this.f422503c = v2Var;
        this.f422501a = j17;
        this.f422502b = z17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f422501a;
        ax4.a.d(80, currentTimeMillis);
        if (str != null && str.contains("succ")) {
            ax4.a.c(83);
        }
        if (currentTimeMillis > 5000) {
            java.lang.Long valueOf = java.lang.Long.valueOf(currentTimeMillis);
            boolean z17 = this.f422502b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsLoader", "loadJavaScript is too slow, cost %d, isXWeb %b", valueOf, java.lang.Boolean.valueOf(z17));
            ax4.a.c(z17 ? 95 : 96);
        }
        nw4.n nVar = this.f422503c.f422524b;
        if (nVar != null) {
            nVar.f422438s = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsLoader", "loadJavaScript, evaluateJavascript cb, ret: %s, cost: %dms", str, java.lang.Long.valueOf(currentTimeMillis));
    }
}

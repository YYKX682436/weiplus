package nw4;

/* loaded from: classes8.dex */
public class r2 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f422492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f422493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f422494c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.v2 f422495d;

    public r2(nw4.v2 v2Var, long j17, long j18, boolean z17) {
        this.f422495d = v2Var;
        this.f422492a = j17;
        this.f422493b = j18;
        this.f422494c = z17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f422492a;
        long j18 = currentTimeMillis - j17;
        long j19 = j17 - this.f422493b;
        ax4.a.d(81, j18);
        ax4.a.d(79, j17 - j19);
        if (str != null && str.contains("succ")) {
            ax4.a.c(85);
        }
        if (j18 > 5000) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j18);
            boolean z17 = this.f422494c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsLoader", "loadJavaScript is too slow, cost %d, isXWeb %b", valueOf, java.lang.Boolean.valueOf(z17));
            ax4.a.c(z17 ? 95 : 96);
        }
        nw4.n nVar = this.f422495d.f422524b;
        if (nVar != null) {
            nVar.f422438s = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsLoader", "loadJavaScript with WebCodeCache, evaluateJavascript cb, ret: %s, ccCost: %dms, cpCost: %dms", str, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19));
    }
}

package nd1;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f417871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f417872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417873f;

    public m(nd1.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f417871d = yVar;
        this.f417872e = jSONObject;
        this.f417873f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.a(this.f417871d);
        boolean z17 = false;
        boolean optBoolean = this.f417872e.optBoolean("ignoreWebviewPreload", false);
        int mo50260x9f1221c2 = a17 != null ? a17.mo50260x9f1221c2() : 0;
        if (a17 != null && a17.mo50262x39e05d35()) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInitReady", "invoke, appId:%s, webviewId:%s, isRunning:%b, ignoreWebviewPreload:%b, url:%s", this.f417873f, java.lang.Integer.valueOf(mo50260x9f1221c2), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(optBoolean), a17 != null ? a17.X1() : "");
        if (z17) {
            if (!optBoolean) {
                a17.t3().x0().d0(a17);
            }
            a17.D2(nd1.n.f72962x24728b);
        }
    }
}

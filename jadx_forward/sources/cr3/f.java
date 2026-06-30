package cr3;

/* loaded from: classes11.dex */
public class f implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j41.e0 f303476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f303477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j41.d0 f303478c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f303479d;

    public f(j41.e0 e0Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, j41.d0 d0Var, android.content.Context context) {
        this.f303476a = e0Var;
        this.f303477b = z3Var;
        this.f303478c = d0Var;
        this.f303479d = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0
    public boolean a(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str;
        j41.e0 e0Var = this.f303476a;
        android.content.Intent intent = new android.content.Intent();
        try {
            str = new org.json.JSONObject(e0Var.f379156e).optString("url");
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Profile.OpenIMProfileLogic", e17, "loadProfile", new java.lang.Object[0]);
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f303477b;
        g0Var.d(15319, z3Var.Q0(), java.lang.Integer.valueOf(e0Var.f379155d), this.f303478c.f379150a);
        intent.putExtra("geta8key_scene", 58);
        intent.putExtra("geta8key_username", z3Var.d1());
        intent.putExtra("msgUsername", z3Var.d1());
        intent.putExtra("rawUrl", str);
        j45.l.j(this.f303479d, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }
}

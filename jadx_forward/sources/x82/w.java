package x82;

/* loaded from: classes9.dex */
public class w implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f534071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f534072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.op0 f534073c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f534074d;

    public w(q80.d0 d0Var, o72.r2 r2Var, r45.op0 op0Var, android.content.Context context) {
        this.f534071a = d0Var;
        this.f534072b = r2Var;
        this.f534073c = op0Var;
        this.f534074d = context;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavItemLogic", "[handleLiteAppItem] fail appId = " + this.f534071a.f442182a);
        ((ku5.t0) ku5.t0.f394148d).B(new x82.m(this));
        if (this.f534073c.f463940d.isEmpty()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavItemLogic", "fallback to url:%s", this.f534073c.f463940d);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f534073c.f463940d);
        j45.l.j(this.f534074d, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavItemLogic", "[handleLiteAppItem] success appId = " + this.f534071a.f442182a);
        ((ku5.t0) ku5.t0.f394148d).B(new x82.l(this));
    }
}

package v10;

/* loaded from: classes9.dex */
public final class a implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bw5.q7 f513849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f513850b;

    public a(bw5.q7 q7Var, android.content.Context context) {
        this.f513849a = q7Var;
        this.f513850b = context;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.Router.LiteApp", "start liteApp fail");
        bw5.q7 q7Var = this.f513849a;
        java.lang.String str = q7Var.f113520o[4] ? q7Var.f113515g : "";
        if (str == null || str.length() == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.Router.LiteApp", "start liteApp fail go default_url");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", q7Var.f113520o[4] ? q7Var.f113515g : "");
        j45.l.j(this.f513850b, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.Router.LiteApp", "start liteApp success");
    }
}

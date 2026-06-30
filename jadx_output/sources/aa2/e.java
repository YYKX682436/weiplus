package aa2;

/* loaded from: classes2.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa2.j f2499d;

    public e(aa2.j jVar) {
        this.f2499d = jVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        aa2.j jVar = this.f2499d;
        if (itemId != 20004) {
            if (itemId != 20005) {
                return;
            }
            androidx.appcompat.app.AppCompatActivity context = jVar.f434158a;
            r45.e21 e21Var = jVar.f2505d;
            long j17 = e21Var != null ? e21Var.getLong(0) : 0L;
            kotlin.jvm.internal.o.g(context, "context");
            java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&topic_id=%s", java.util.Arrays.copyOf(new java.lang.Object[]{68, pm0.v.u(j17)}, 2));
            kotlin.jvm.internal.o.f(format, "format(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", format);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        if (jVar.f2506e == null) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = jVar.f434158a;
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) appCompatActivity, 1, true);
            k0Var.r(appCompatActivity.getResources().getString(com.tencent.mm.R.string.cib), 17, appCompatActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479930ja), null);
            k0Var.f211872n = new aa2.g(jVar);
            k0Var.f211881s = new aa2.h(jVar);
            k0Var.f211854d = new aa2.i(jVar);
            jVar.f2506e = k0Var;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = jVar.f2506e;
        if (k0Var2 == null || k0Var2.i()) {
            return;
        }
        k0Var2.v();
    }
}

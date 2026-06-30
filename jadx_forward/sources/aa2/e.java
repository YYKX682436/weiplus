package aa2;

/* loaded from: classes2.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa2.j f84032d;

    public e(aa2.j jVar) {
        this.f84032d = jVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        aa2.j jVar = this.f84032d;
        if (itemId != 20004) {
            if (itemId != 20005) {
                return;
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = jVar.f515691a;
            r45.e21 e21Var = jVar.f84038d;
            long m75942xfb822ef2 = e21Var != null ? e21Var.m75942xfb822ef2(0) : 0L;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&topic_id=%s", java.util.Arrays.copyOf(new java.lang.Object[]{68, pm0.v.u(m75942xfb822ef2)}, 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", format);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        if (jVar.f84039e == null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = jVar.f515691a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC0065xcd7aa112, 1, true);
            k0Var.r(activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cib), 17, activityC0065xcd7aa112.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja), null);
            k0Var.f293405n = new aa2.g(jVar);
            k0Var.f293414s = new aa2.h(jVar);
            k0Var.f293387d = new aa2.i(jVar);
            jVar.f84039e = k0Var;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = jVar.f84039e;
        if (k0Var2 == null || k0Var2.i()) {
            return;
        }
        k0Var2.v();
    }
}

package lo2;

/* loaded from: classes2.dex */
public final class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14481x516a7dbc f401699d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14481x516a7dbc activityC14481x516a7dbc) {
        this.f401699d = activityC14481x516a7dbc;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14481x516a7dbc context = this.f401699d;
        if (itemId == 10002) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14481x516a7dbc.f202930v;
            context.getClass();
            ya2.b2 b17 = ya2.h.f542017a.b(context.f202931t);
            if (b17 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                if (hz2.d.f367846a.a(ya.a.f77453x4b357bf)) {
                    return;
                }
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q6(b17, context, null), 3, null);
                return;
            }
            return;
        }
        if (itemId != 10004) {
            return;
        }
        java.lang.String username = context.f202931t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&user_ID=%s", java.util.Arrays.copyOf(new java.lang.Object[]{87, username}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}

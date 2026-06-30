package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class gn implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b f191627d;

    public gn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b activityC14103x2367d69b) {
        this.f191627d = activityC14103x2367d69b;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 10004) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b context = this.f191627d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 x10Var = context.f191109v;
            if (x10Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            java.lang.String str = x10Var.G;
            if (str != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&wechat_real_lang=%s&topic_wording=%s", java.util.Arrays.copyOf(new java.lang.Object[]{64, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), str}, 3));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", format);
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            }
        }
    }
}

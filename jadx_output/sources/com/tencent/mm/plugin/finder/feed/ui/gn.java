package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class gn implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI f110094d;

    public gn(com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI finderTopicFeedUI) {
        this.f110094d = finderTopicFeedUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 10004) {
            com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI context = this.f110094d;
            com.tencent.mm.plugin.finder.feed.x10 x10Var = context.f109576v;
            if (x10Var == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            java.lang.String str = x10Var.G;
            if (str != null) {
                kotlin.jvm.internal.o.g(context, "context");
                java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&wechat_real_lang=%s&topic_wording=%s", java.util.Arrays.copyOf(new java.lang.Object[]{64, com.tencent.mm.sdk.platformtools.m2.d(), str}, 3));
                kotlin.jvm.internal.o.f(format, "format(...)");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", format);
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            }
        }
    }
}

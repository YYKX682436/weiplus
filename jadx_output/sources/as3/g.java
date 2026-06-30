package as3;

/* loaded from: classes3.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView f13505d;

    public g(com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView bizProfileFollowMoreView) {
        this.f13505d = bizProfileFollowMoreView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String moreUrl;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/view/BizProfileFollowMoreView$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView bizProfileFollowMoreView = this.f13505d;
        moreUrl = bizProfileFollowMoreView.getMoreUrl();
        intent.putExtra("rawUrl", moreUrl);
        intent.putExtra("hide_option_menu", true);
        intent.putExtra("useJs", true);
        intent.putExtra("geta8key_scene", 3);
        j45.l.j(bizProfileFollowMoreView.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        bizProfileFollowMoreView.getClickReporter().invoke(2302);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileFollowMoreView$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

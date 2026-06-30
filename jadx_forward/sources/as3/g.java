package as3;

/* loaded from: classes3.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 f95038d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 c16911xd5774141) {
        this.f95038d = c16911xd5774141;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m67683x87b411a4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/view/BizProfileFollowMoreView$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 c16911xd5774141 = this.f95038d;
        m67683x87b411a4 = c16911xd5774141.m67683x87b411a4();
        intent.putExtra("rawUrl", m67683x87b411a4);
        intent.putExtra("hide_option_menu", true);
        intent.putExtra("useJs", true);
        intent.putExtra("geta8key_scene", 3);
        j45.l.j(c16911xd5774141.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        c16911xd5774141.getClickReporter().mo146xb9724478(2302);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileFollowMoreView$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

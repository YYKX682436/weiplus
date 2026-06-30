package go2;

/* loaded from: classes2.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.z f355522d;

    public k(go2.z zVar) {
        this.f355522d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        go2.z zVar = this.f355522d;
        r45.tr0 tr0Var = (r45.tr0) zVar.f534252d;
        java.lang.String str = tr0Var != null ? tr0Var.f468267r : null;
        if (!(str == null || str.length() == 0)) {
            r45.tr0 tr0Var2 = (r45.tr0) zVar.f534252d;
            intent.putExtra("rawUrl", tr0Var2 != null ? tr0Var2.f468267r : null);
            j45.l.j(zVar.m80379x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package go2;

/* loaded from: classes.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ go2.z f355612e;

    public x(java.lang.String str, go2.z zVar) {
        this.f355611d = str;
        this.f355612e = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC$updateAuthorInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f355611d);
        j45.l.j(this.f355612e.m80379x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC$updateAuthorInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

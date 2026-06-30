package zl2;

/* loaded from: classes.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555563e;

    public y0(java.lang.String str, android.content.Context context) {
        this.f555562d = str;
        this.f555563e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkGiftLegalArgeement$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f555562d;
        if (str == null) {
            str = "";
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.j(this.f555563e, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkGiftLegalArgeement$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

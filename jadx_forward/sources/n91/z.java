package n91;

/* loaded from: classes.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f417436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417437e;

    public z(android.content.Context context, java.lang.String str) {
        this.f417436d = context;
        this.f417437e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/custom_loading/MagicGameLoadingImpl$setAgeAppropriateImageView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j45.l.j(this.f417436d, "webview", ".ui.tools.WebViewUI", new android.content.Intent().putExtra("rawUrl", this.f417437e).putExtra("forceHideShare", true), null);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/custom_loading/MagicGameLoadingImpl$setAgeAppropriateImageView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

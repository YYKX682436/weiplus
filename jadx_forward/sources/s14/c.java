package s14;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f483676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f483677b;

    public c(int i17, android.widget.TextView textView) {
        this.f483676a = i17;
        this.f483677b = textView;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.c(view);
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI$initScrollView$1$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", this, bVar.a());
        this.f483677b.setAlpha(i18 / this.f483676a);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI$initScrollView$1$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
    }
}

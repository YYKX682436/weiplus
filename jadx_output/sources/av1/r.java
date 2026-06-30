package av1;

/* loaded from: classes3.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cast.ui.ScreenCastActivity f14191d;

    public r(com.tencent.mm.plugin.cast.ui.ScreenCastActivity screenCastActivity) {
        this.f14191d = screenCastActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f14191d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/cast/ui/ScreenCastActivity$switchIconStatus$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

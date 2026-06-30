package aa2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa2.b f2490d;

    public a(aa2.b bVar) {
        this.f2490d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/handler/FinderActivityInvalidHandler$initInvalidView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        aa2.b bVar = this.f2490d;
        if (!bVar.f2491a.isFinishing()) {
            bVar.f2491a.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/handler/FinderActivityInvalidHandler$initInvalidView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

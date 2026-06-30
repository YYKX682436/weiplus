package zv2;

/* loaded from: classes10.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv2.b f557927d;

    public a(zv2.b bVar) {
        this.f557927d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/upload/postui/jumpwidget/FinderBasePostJumpWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zv2.b bVar = this.f557927d;
        if (bVar.f557930f != null) {
            bVar.l();
        } else {
            bVar.a();
        }
        bVar.j();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/upload/postui/jumpwidget/FinderBasePostJumpWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

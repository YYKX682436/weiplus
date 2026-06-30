package ku3;

/* loaded from: classes3.dex */
public final class y5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.c6 f394023d;

    public y5(ku3.c6 c6Var) {
        this.f394023d = c6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin$initLogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zt3.a.U6(this.f394023d.f393716d, 10, 0, null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin$initLogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package df2;

/* loaded from: classes3.dex */
public final class ay implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.cy f311290d;

    public ay(df2.cy cyVar) {
        this.f311290d = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/MsgBoxShowController$showBottomSheet$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f311290d.f311449n;
        if (y1Var != null) {
            y1Var.q();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/MsgBoxShowController$showBottomSheet$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

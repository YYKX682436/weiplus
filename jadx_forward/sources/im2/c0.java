package im2;

/* loaded from: classes.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f373805d;

    public c0(im2.z3 z3Var) {
        this.f373805d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$checkAndChange2HalfScreenMode$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.TextView b76 = this.f373805d.b7();
        if (b76 != null) {
            b76.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$checkAndChange2HalfScreenMode$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

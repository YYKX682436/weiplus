package um2;

/* loaded from: classes3.dex */
public final class a5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510249d;

    public a5(um2.x5 x5Var) {
        this.f510249d = x5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        um2.x5 x5Var = this.f510249d;
        dk2.xf h17 = x5Var.h();
        if (h17 != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = x5Var.f101138b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type android.app.Activity");
            ((dk2.r4) h17).r(activityC0065xcd7aa112, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

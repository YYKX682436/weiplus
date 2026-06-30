package um2;

/* loaded from: classes3.dex */
public final class t2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510498d;

    public t2(um2.x5 x5Var) {
        this.f510498d = x5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$lazyInitPlugins$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        um2.x5 x5Var = this.f510498d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = x5Var.f101138b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (((pl2.x) pf5.z.f435481a.a(activity).a(pl2.x.class)).f438216f) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = x5Var.f101138b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            pl2.s sVar = ((pl2.x) pf5.z.f435481a.a(activity2).a(pl2.x.class)).f438217g;
            if (sVar != null) {
                pl2.s.e(sVar, 0L, null, 3, null);
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = x5Var.f101138b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
            ((pl2.x) pf5.z.f435481a.a(activity3).a(pl2.x.class)).f438220m.f438211h = 3;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$lazyInitPlugins$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

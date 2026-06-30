package sc2;

/* loaded from: classes2.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f487624f;

    public n0(sc2.h1 h1Var, in5.s0 s0Var, r45.t01 t01Var) {
        this.f487622d = h1Var;
        this.f487623e = s0Var;
        this.f487624f = t01Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showCard$10$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g3 g3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g3.f206580g;
        sc2.h1 h1Var = this.f487622d;
        h1Var.A1 = g3Var;
        h1Var.P(this.f487623e, true, true, this.f487624f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$showCard$10$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package sc2;

/* loaded from: classes2.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487827f;

    public v(in5.s0 s0Var, xc2.p0 p0Var, sc2.h1 h1Var) {
        this.f487825d = s0Var;
        this.f487826e = p0Var;
        this.f487827f = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$onBindView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc2.y2 y2Var = xc2.y2.f534876a;
        in5.s0 s0Var = this.f487825d;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        y2Var.h(context, this.f487826e, 1, s0Var);
        sc2.h1.I(this.f487827f, s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f3.f206549e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$onBindView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package pk2;

/* loaded from: classes3.dex */
public final class m3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f437522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.q3 f437523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f437525g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f437526h;

    public m3(r45.t62 t62Var, pk2.q3 q3Var, android.view.View view, r45.t62 t62Var2, r45.t62 t62Var3) {
        this.f437522d = t62Var;
        this.f437523e = q3Var;
        this.f437524f = view;
        this.f437525g = t62Var2;
        this.f437526h = t62Var3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.t62 t62Var = this.f437522d;
        if (t62Var.m75933x41a8a7f2(1)) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        t62Var.set(1, java.lang.Boolean.TRUE);
        android.view.View rootView = this.f437524f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView, "$rootView");
        pk2.q3 q3Var = this.f437523e;
        q3Var.w(rootView, t62Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView, "$rootView");
        q3Var.x(rootView, this.f437525g, this.f437526h);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

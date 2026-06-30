package pk2;

/* loaded from: classes3.dex */
public final class l3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f437479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.q3 f437480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437481f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f437482g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f437483h;

    public l3(r45.t62 t62Var, pk2.q3 q3Var, android.view.View view, r45.t62 t62Var2, r45.t62 t62Var3) {
        this.f437479d = t62Var;
        this.f437480e = q3Var;
        this.f437481f = view;
        this.f437482g = t62Var2;
        this.f437483h = t62Var3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.t62 t62Var = this.f437479d;
        if (!t62Var.m75933x41a8a7f2(1)) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        t62Var.set(1, java.lang.Boolean.FALSE);
        android.view.View rootView = this.f437481f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView, "$rootView");
        pk2.q3 q3Var = this.f437480e;
        q3Var.w(rootView, t62Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView, "$rootView");
        q3Var.x(rootView, this.f437482g, this.f437483h);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption$addItem$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

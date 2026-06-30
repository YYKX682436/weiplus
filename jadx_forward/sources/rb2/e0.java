package rb2;

/* loaded from: classes2.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rb2.m0 f475151f;

    public e0(so2.y0 y0Var, android.view.View view, rb2.m0 m0Var) {
        this.f475149d = y0Var;
        this.f475150e = view;
        this.f475151f = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert$refreshDisplayFlag$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ly0 m76075xab67e9d6 = this.f475149d.f492236d.u0().m76075xab67e9d6();
        if (m76075xab67e9d6 != null && (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) m76075xab67e9d6.m75936x14adae67(1)) != null) {
            xc2.y2 y2Var = xc2.y2.f534876a;
            android.view.View view2 = this.f475150e;
            android.content.Context context = view2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            rb2.m0 m0Var = this.f475151f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s g17 = y2Var.g(context, m0Var.f475219e.f0(), m0Var.f475219e.r());
            android.content.Context context2 = view2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            p0Var.R = g17;
            xc2.y2.i(y2Var, context2, p0Var, 0, null, 12, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert$refreshDisplayFlag$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

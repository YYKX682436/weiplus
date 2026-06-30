package st2;

/* loaded from: classes3.dex */
public final class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f494021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.e34 f494022e;

    public v2(android.view.View view, r45.e34 e34Var) {
        this.f494021d = view;
        this.f494022e = e34Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/ShoppingUtil$addJumpDescWord$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        b1Var.H = k91.z3.TRANSPARENT;
        k91.y3 y3Var = k91.y3.DISABLED;
        b1Var.S = y3Var;
        b1Var.T = y3Var;
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = this.f494021d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r45.ac4 ac4Var = new r45.ac4();
        ac4Var.set(1, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) this.f494022e.m75936x14adae67(1));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        ac4Var.set(5, bool);
        ac4Var.set(7, bool);
        ((c61.p2) ybVar).Bi(context, ac4Var, b1Var, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/ShoppingUtil$addJumpDescWord$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

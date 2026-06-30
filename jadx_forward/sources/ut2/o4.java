package ut2;

/* loaded from: classes3.dex */
public final class o4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f512557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.d56 f512558e;

    public o4(ut2.j5 j5Var, r45.d56 d56Var) {
        this.f512557d = j5Var;
        this.f512558e = d56Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShopWindow$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context = this.f512557d.f512470e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r45.ac4 ac4Var = new r45.ac4();
        ac4Var.set(1, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) this.f512558e.m75936x14adae67(1));
        c61.yb.Yi((c61.yb) c17, context, ac4Var, null, null, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShopWindow$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

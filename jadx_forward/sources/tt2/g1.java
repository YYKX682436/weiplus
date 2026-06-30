package tt2;

/* loaded from: classes3.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.h1 f503449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.p45 f503450e;

    public g1(tt2.h1 h1Var, r45.p45 p45Var) {
        this.f503449d = h1Var;
        this.f503450e = p45Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingPairingAdapter$FinderLiveProductParingViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        b1Var.H = k91.z3.TRANSPARENT;
        k91.y3 y3Var = k91.y3.DISABLED;
        b1Var.S = y3Var;
        b1Var.T = y3Var;
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        tt2.h1 h1Var = this.f503449d;
        android.content.Context context = h1Var.f503461o.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r45.ac4 ac4Var = new r45.ac4();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        ac4Var.set(7, bool);
        ac4Var.set(6, bool);
        ac4Var.set(5, bool);
        r45.p45 p45Var = this.f503450e;
        ac4Var.set(1, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) p45Var.m75936x14adae67(3));
        c61.yb.Yi(ybVar, context, ac4Var, b1Var, null, 8, null);
        h1Var.getClass();
        i95.m c18 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c18;
        ml2.b4 b4Var = ml2.b4.f408797s;
        cl0.g gVar = new cl0.g();
        ml2.f4 f4Var = ml2.f4.f408964e;
        gVar.o("commerceAction", 1070);
        gVar.p("pairing_id", p45Var.m75942xfb822ef2(0));
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingPairingAdapter$FinderLiveProductParingViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

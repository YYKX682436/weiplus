package sc2;

/* loaded from: classes2.dex */
public final class j5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.d6 f487525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f487528g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487529h;

    public j5(sc2.d6 d6Var, xc2.p0 p0Var, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var) {
        this.f487525d = d6Var;
        this.f487526e = p0Var;
        this.f487527f = view;
        this.f487528g = abstractC14490x69736cb5;
        this.f487529h = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver$bindSmallCard$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f487528g;
        java.lang.String field_username = abstractC14490x69736cb5.getFeedObject().f66949xdec927b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
        java.lang.String field_username2 = abstractC14490x69736cb5.getFeedObject().f66949xdec927b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username2, "field_username");
        sc2.d6 d6Var = this.f487525d;
        xc2.p0 p0Var = this.f487526e;
        r45.h32 O = d6Var.O(field_username2, p0Var);
        android.view.View view2 = this.f487527f;
        d6Var.S(p0Var, view2, field_username, O);
        p0Var.H = true;
        xc2.z2 z2Var = d6Var.f84684o;
        xc2.b bVar = z2Var instanceof xc2.b ? (xc2.b) z2Var : null;
        in5.s0 s0Var = this.f487529h;
        if (bVar != null) {
            bVar.B(s0Var, view2, p0Var, 0);
        }
        xc2.z2 z2Var2 = d6Var.f84684o;
        xc2.b bVar2 = z2Var2 instanceof xc2.b ? (xc2.b) z2Var2 : null;
        if (bVar2 != null) {
            bVar2.q(s0Var, view2, p0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver$bindSmallCard$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package st2;

/* loaded from: classes3.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f493966e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(st2.h1 h1Var, tt2.e1 e1Var) {
        super(3);
        this.f493965d = h1Var;
        this.f493966e = e1Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ut2.s3 holder = (ut2.s3) obj;
        android.view.View itemView = (android.view.View) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        st2.h1 h1Var = this.f493965d;
        boolean z17 = false;
        if (st2.h1.a(h1Var)[0] == 0 || st2.h1.a(h1Var)[1] == 0) {
            itemView.getLocationOnScreen(st2.h1.a(h1Var));
        }
        int i17 = st2.h1.a(h1Var)[0];
        int i18 = st2.h1.a(h1Var)[1];
        tt2.e1 e1Var = this.f493966e;
        e1Var.getClass();
        so2.j5 P = e1Var.P(intValue);
        if (P instanceof cm2.m0) {
            r45.y23 y23Var = ((cm2.m0) P).f124901v;
            if (y23Var != null && y23Var.m75939xb282bd08(42) == 10) {
                z17 = true;
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListAdapter", "show popup menu,pos:" + intValue + ",desc:" + ((java.lang.Object) holder.D().getText()) + ",anchorPosX:" + i17 + ",anchorPosY:" + i18);
                e1Var.O().a();
                e1Var.O().h(itemView, new tt2.u0(e1Var), new tt2.v0(e1Var, P), i17, i18);
            }
        }
        return jz5.f0.f384359a;
    }
}

package im2;

/* loaded from: classes3.dex */
public final class j6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.o6 f373939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(im2.o6 o6Var) {
        super(4);
        this.f373939d = o6Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.view.View child = (android.view.View) obj2;
        ((java.lang.Boolean) obj3).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        im2.o6 o6Var = this.f373939d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0 no0Var = o6Var.f374005h;
        if (no0Var != null) {
            no0Var.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c4 c4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c4) kz5.n0.a0(o6Var.f374003f.f198609d, intValue);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0 no0Var2 = c4Var != null ? c4Var.f198503b : null;
        o6Var.f374005h = no0Var2;
        if (no0Var2 != null) {
            no0Var2.a();
        }
        return jz5.f0.f384359a;
    }
}

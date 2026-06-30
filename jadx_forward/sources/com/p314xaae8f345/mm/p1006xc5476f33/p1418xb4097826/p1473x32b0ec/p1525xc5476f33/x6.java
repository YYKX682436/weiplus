package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class x6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 f196566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var) {
        super(4);
        this.f196566d = x7Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.view.View child = (android.view.View) obj2;
        ((java.lang.Boolean) obj3).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = this.f196566d;
        x7Var.Q = intValue;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ViewOnClickListenerC14352x1d00aa30 viewOnClickListenerC14352x1d00aa30 = x7Var.f196572s;
        android.widget.TextView textView = viewOnClickListenerC14352x1d00aa30.f197646e;
        android.widget.TextView textView2 = viewOnClickListenerC14352x1d00aa30.f197645d;
        if (intValue == 0) {
            textView2.setAlpha(1.0f);
            textView.setAlpha(0.5f);
        } else {
            textView2.setAlpha(0.5f);
            textView.setAlpha(1.0f);
        }
        return jz5.f0.f384359a;
    }
}

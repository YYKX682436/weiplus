package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class r8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s8 f198899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f198900e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s8 s8Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(1);
        this.f198899d = s8Var;
        this.f198900e = activityC0065xcd7aa112;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        pk2.f8.d(pk2.f8.f437280a, 2, 0, 1, booleanValue ? 2 : 3, null, 16, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s8 s8Var = this.f198899d;
        android.widget.ProgressBar progressBar = s8Var.f198933e;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        r45.hx0 e17 = ek2.r1.f335057u.e(booleanValue);
        new ek2.r1(s8Var.f198935g, s8Var.f198936h, this.f198900e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14039xbe936a66 ? 1 : 2, e17).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.q8(booleanValue, s8Var));
        return jz5.f0.f384359a;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class k8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l8 f198735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f198736e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l8 l8Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(2);
        this.f198735d = l8Var;
        this.f198736e = activityC0065xcd7aa112;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h8 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h8) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l8 l8Var = this.f198735d;
        android.widget.ProgressBar progressBar = l8Var.f198756e;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(booleanValue ? 1 : 0);
        r45.z63 z63Var = item.f198665d;
        z63Var.set(2, valueOf);
        ek2.q1 q1Var = ek2.r1.f335057u;
        java.lang.String m75945x2fec8307 = z63Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        r45.hx0 b17 = q1Var.b(m75945x2fec8307, booleanValue);
        new ek2.r1(l8Var.f198759h, l8Var.f198760i, this.f198736e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14039xbe936a66 ? 1 : 2, b17).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.j8(l8Var, booleanValue, item));
        return jz5.f0.f384359a;
    }
}

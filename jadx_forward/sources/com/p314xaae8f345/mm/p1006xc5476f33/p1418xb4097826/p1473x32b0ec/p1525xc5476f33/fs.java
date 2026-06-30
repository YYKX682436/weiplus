package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class fs implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f194123d;

    public fs(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar) {
        this.f194123d = etVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        java.lang.String str;
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f194123d;
        r45.qm1 qm1Var = (r45.qm1) ((mm2.e0) etVar.P0(mm2.e0.class)).f410503m.mo3195x754a37bb();
        if (qm1Var == null || (str = qm1Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        java.lang.String str2 = etVar.f193996y1;
        if (str2 != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "notify@all")) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).tj(1, null, str);
            } else {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).tj(2, kz5.b0.c(str2), str);
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).tj(0, null, str);
        }
        etVar.f193996y1 = null;
        etVar.f193994y.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.es(etVar), 200L);
    }
}

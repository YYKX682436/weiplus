package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ai implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ci f193420d;

    public ai(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ci ciVar) {
        this.f193420d = ciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ci ciVar = this.f193420d;
        bw5.x7 x7Var = ((mm2.f6) ciVar.S0().a(mm2.f6.class)).f410574p0;
        if (x7Var != null) {
            android.content.Context context = ciVar.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pq.a aVar = new pq.a(context);
            i95.m c17 = i95.n0.c(pq.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            pq.q.Lb((pq.q) c17, aVar, x7Var, null, 4, null);
            return;
        }
        r45.c33 c33Var = ((mm2.f6) ciVar.S0().a(mm2.f6.class)).Z;
        if (c33Var == null) {
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = c33Var.m75945x2fec8307(0);
        b1Var.f398555f = c33Var.m75945x2fec8307(1);
        b1Var.f398565k = 1177;
        b1Var.X = k91.b1.f387074e;
        dk2.q4 q4Var = dk2.q4.f315471a;
        android.content.Context context2 = ciVar.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        q4Var.l(context2, ciVar.S0(), b1Var, true, null);
    }
}

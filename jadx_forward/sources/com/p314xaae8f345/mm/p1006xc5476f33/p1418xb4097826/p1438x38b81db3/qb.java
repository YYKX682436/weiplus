package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class qb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f185883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f185885f;

    public qb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f185883d = qeVar;
        this.f185884e = s0Var;
        this.f185885f = abstractC14490x69736cb5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.dm2 m76806xdef68064;
        r45.bn2 bn2Var;
        r45.qj2 qj2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f185883d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = qeVar.f185891f.getF204176d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w1) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item = this.f185885f;
        in5.s0 holder = this.f185884e;
        if (w1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var = qeVar.f185891f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "$item");
            w1Var.O6(k8Var, holder, item);
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity2 = qeVar.f185891f.getF204176d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.y) pf5.z.f435481a.a(activity2).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.y.class);
        if (yVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 contract = qeVar.f185891f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "$item");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contract, "contract");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7() || (m76806xdef68064 = item.getFeedObject().getFeedObject().m76806xdef68064()) == null || (bn2Var = (r45.bn2) m76806xdef68064.m75936x14adae67(51)) == null || (qj2Var = (r45.qj2) bn2Var.m75936x14adae67(0)) == null) {
                return;
            }
            int m75939xb282bd08 = bn2Var.m75939xb282bd08(2);
            if (yVar.f186724i) {
                yVar.f186724i = false;
                android.content.Context context = holder.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4 a4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = contract instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) contract : null;
                a4Var.V6(pzVar != null ? pzVar.f190289h : null, item, holder, yVar);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Zj(yVar.m80379x76847179(), qj2Var, item.getFeedObject().m59251x5db1b11(), item.w(), true, java.lang.Integer.valueOf(m75939xb282bd08), -1, null);
            }
        }
    }
}

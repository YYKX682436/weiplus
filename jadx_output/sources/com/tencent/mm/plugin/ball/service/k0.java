package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class k0 implements qp1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gp1.z f93175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.s f93176c;

    public k0(com.tencent.mm.plugin.ball.service.s sVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo, gp1.z zVar) {
        this.f93176c = sVar;
        this.f93174a = ballInfo;
        this.f93175b = zVar;
    }

    @Override // qp1.k0
    public void b(qp1.j0 j0Var) {
        android.util.SparseArray sparseArray = this.f93176c.f93219e;
        java.util.Set set = (java.util.Set) sparseArray.get(this.f93174a.f93046d);
        if (qp1.w.a(set)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((sl4.b) ((qp1.i0) it.next())).b(j0Var);
            }
        }
        java.util.Set set2 = (java.util.Set) sparseArray.get(0);
        if (qp1.w.a(set2)) {
            java.util.Iterator it6 = set2.iterator();
            while (it6.hasNext()) {
                ((sl4.b) ((qp1.i0) it6.next())).b(j0Var);
            }
        }
        if (j0Var.h()) {
            pm0.v.W(new com.tencent.mm.plugin.ball.service.j0(this));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallService", "no float window permission");
        }
    }
}

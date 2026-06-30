package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class l0 implements qp1.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.s f93182b;

    public l0(com.tencent.mm.plugin.ball.service.s sVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93182b = sVar;
        this.f93181a = ballInfo;
    }

    @Override // qp1.l0
    public void a() {
        android.util.SparseArray sparseArray = this.f93182b.f93219e;
        java.util.Set set = (java.util.Set) sparseArray.get(this.f93181a.f93046d);
        if (qp1.w.a(set)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((sl4.b) ((qp1.i0) it.next())).a();
            }
        }
        java.util.Set set2 = (java.util.Set) sparseArray.get(0);
        if (qp1.w.a(set2)) {
            java.util.Iterator it6 = set2.iterator();
            while (it6.hasNext()) {
                ((sl4.b) ((qp1.i0) it6.next())).a();
            }
        }
    }

    @Override // qp1.l0
    public void c() {
        com.tencent.mm.plugin.ball.service.s.G0(this.f93182b, this.f93181a, false);
    }

    @Override // qp1.l0
    public void d() {
        com.tencent.mm.plugin.ball.service.s.G0(this.f93182b, this.f93181a, true);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class cs extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj {

    /* renamed from: y, reason: collision with root package name */
    public fc2.d f188036y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, int i17) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void C() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
        if (abstractC13919x46aff122 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(abstractC13919x46aff122, false, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void P() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj
    public void X(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 model, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj callback) {
        fc2.c n17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.X(model, callback);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f187954d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "activity");
        this.f188036y = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w3(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6()).f206954b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar == null || (n17 = zy2.ra.n1(nyVar, 0, 1, null)) == null) {
            return;
        }
        fc2.d dVar = this.f188036y;
        if (dVar != null) {
            n17.a(dVar);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("observerForExposeReport");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0, fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        fc2.c n17;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f187954d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null && (n17 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            fc2.d dVar = this.f188036y;
            if (dVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("observerForExposeReport");
                throw null;
            }
            n17.d(dVar);
        }
        super.mo979x3f5eee52();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    /* renamed from: onRefreshEnd */
    public void mo56038xb3ee2b3f(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class h10 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 f188409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f188410b;

    public h10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var, int i17) {
        this.f188409a = r10Var;
        this.f188410b = i17;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = this.f188409a;
            java.util.List<E> m56392xfc5c33e5 = r10Var.f188689e.m56392xfc5c33e5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class);
            int i17 = this.f188410b;
            if (i17 < 0 || i17 >= m56392xfc5c33e5.size()) {
                return;
            }
            mu2.b.f412927a.a(r10Var.f188688d, "video_card", 0, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) m56392xfc5c33e5.get(i17)).getFeedObject().m59251x5db1b11(), r10Var.f190400n, r10Var.f190401o);
        }
    }
}

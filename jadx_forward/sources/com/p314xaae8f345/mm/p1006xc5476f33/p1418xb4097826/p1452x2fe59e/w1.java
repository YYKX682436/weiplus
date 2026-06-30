package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class w1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2 f192479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f192480b;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2 c2Var, int i17) {
        this.f192479a = c2Var;
        this.f192480b = i17;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2 c2Var = this.f192479a;
            java.util.List P6 = c2Var.f188146e.P6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class);
            int i17 = this.f192480b;
            if (i17 >= 0) {
                java.util.ArrayList arrayList = (java.util.ArrayList) P6;
                if (i17 < arrayList.size()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) arrayList.get(i17)).getFeedObject();
                    mu2.b bVar = mu2.b.f412927a;
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = c2Var.f188145d;
                    long m59251x5db1b11 = feedObject.m59251x5db1b11();
                    c2Var.getClass();
                    bVar.a(abstractActivityC21394xb3d2c0cf, "video_card", 0, m59251x5db1b11, 0L, c2Var.f187979m);
                }
            }
        }
    }
}

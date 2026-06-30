package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class n20 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h {

    /* renamed from: a, reason: collision with root package name */
    public int f190079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13818x35e7a213 f190080b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n20(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13818x35e7a213 c13818x35e7a213) {
        super(c13818x35e7a213, false, 1, null);
        this.f190080b = c13818x35e7a213;
        this.f190079a = 1000;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeDataAndNotify */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0 mo1053x5ee561e(int i17, java.util.List list, boolean z17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13818x35e7a213 c13818x35e7a213 = this.f190080b;
        r45.vx0 vx0Var = c13818x35e7a213.f187682q;
        if (!(vx0Var != null && vx0Var.m75939xb282bd08(10) == 2) || this.f190079a != 19) {
            return super.mo1053x5ee561e(i17, list, z17, obj);
        }
        this.f190079a = 1000;
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0(0, list.size(), new java.util.LinkedList(), false, false, 24, null);
        c13818x35e7a213.m56387xe6796cde().addAll(0, list);
        c13818x35e7a213.getDispatcher().d(0, list.size());
        return u0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeRefresh */
    public void mo1056x14dcd783(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        this.f190079a = response.getPullType();
        ym5.s3 s3Var = new ym5.s3(0);
        if (response.getErrType() == 0 && response.getErrCode() == 0) {
            s3Var.f545050b = 1;
        } else {
            s3Var.f545050b = -1;
        }
        s3Var.f545053e = java.lang.Integer.valueOf(response.getPullType());
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m20(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0(response.getHasMore() ? 2 : 6, response.m56409x97891cf7(), false, null, 12, null), s3Var, this.f190080b, lVar, response));
    }
}

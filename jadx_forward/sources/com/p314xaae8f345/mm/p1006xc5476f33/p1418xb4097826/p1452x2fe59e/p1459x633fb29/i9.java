package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class i9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba f189488a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba c13918xdafe8cba) {
        super(c13918xdafe8cba, false, 1, null);
        this.f189488a = c13918xdafe8cba;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: findMergeIndex */
    public int mo56341x7e573613(java.util.ArrayList srcList, java.util.List newList, int i17, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcList, "srcList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newList, "newList");
        if (this.f189488a.f189201d == 4 && newList.size() == 1 && (newList.get(0) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5)) {
            java.lang.Object obj2 = newList.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj2).getFeedObject().getFeedObject().m76784x5db1b11() == 0) {
                return 1;
            }
        }
        return super.mo56341x7e573613(srcList, newList, i17, obj);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeLoadMore */
    public void mo1055x1f1ce1b3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        ym5.s3 s3Var = new ym5.s3(1);
        java.util.List m56409x97891cf7 = response.m56409x97891cf7();
        s3Var.f545055g = m56409x97891cf7 != null ? m56409x97891cf7.isEmpty() : true;
        s3Var.f545054f = response.getHasMore();
        s3Var.f545053e = response;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0(response.getHasMore() ? 1 : 5, response.m56409x97891cf7(), false, null, 12, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f189488a.getF204960d(), "mergeLoadMore hasMore: " + response.getHasMore());
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.g9(this, y0Var, s3Var, this.f189488a, lVar, response));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeRefresh */
    public void mo1056x14dcd783(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        ym5.s3 s3Var = new ym5.s3(response.getPullType() == 1 ? 3 : 4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0(response.getPullType() == 1 ? 3 : 4, response.m56409x97891cf7(), false, null, 12, null);
        s3Var.f545054f = response.getHasMore();
        s3Var.f545053e = response;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f189488a.getF204960d(), "mergeRefresh hasMore: " + response.getHasMore() + ", pullType = " + response.getPullType());
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.h9(this, y0Var, s3Var, this.f189488a, lVar, response));
    }
}

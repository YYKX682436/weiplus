package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class c30 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13820xb0e90389 f187986a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13820xb0e90389 c13820xb0e90389) {
        super(c13820xb0e90389, false, 1, null);
        this.f187986a = c13820xb0e90389;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeRefresh */
    public void mo1056x14dcd783(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        int pullType = response.getPullType();
        ym5.s3 s3Var = new ym5.s3(pullType);
        s3Var.f545055g = response.getPullType() != 0;
        s3Var.f545054f = response.getHasMore();
        int errType = response.getErrType();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13820xb0e90389 c13820xb0e90389 = this.f187986a;
        if (errType == 0 && response.getErrCode() == 0) {
            s3Var.f545050b = 1;
            if (pullType == 0 || pullType == 4 || pullType == 1) {
                if (s3Var.f545056h > 0 || c13820xb0e90389.m56388xcaeb60d0().size() <= 0) {
                    s3Var.f545051c = null;
                } else {
                    s3Var.f545051c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.erb);
                }
            }
        } else {
            s3Var.f545051c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o2z);
            s3Var.f545050b = -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13820xb0e90389.getB(), "[onFetchRefreshDone] tabType=" + c13820xb0e90389.f187699e + " opType:4 isNeedClear:" + response.getIsNeedClear() + " reason=" + s3Var);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.b30(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0(4, response.m56409x97891cf7(), response.getIsNeedClear(), response.getRequest()), s3Var, this.f187986a, lVar, response));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h
    /* renamed from: sameFeed */
    public boolean mo56039x75147724(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 r0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 r0Var2) {
        so2.j5 existFeed = (so2.j5) r0Var;
        so2.j5 compareFeed = (so2.j5) r0Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(existFeed, "existFeed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compareFeed, "compareFeed");
        so2.j5 j5Var = compareFeed;
        return super.mo56039x75147724(existFeed, j5Var) || ((existFeed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5) && (compareFeed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5) && existFeed.d(j5Var) == 0);
    }
}

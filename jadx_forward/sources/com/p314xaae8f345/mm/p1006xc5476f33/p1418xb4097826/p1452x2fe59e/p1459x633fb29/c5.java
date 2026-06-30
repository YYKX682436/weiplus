package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class c5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c f189283a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c c13877xf5f46f3c) {
        super(c13877xf5f46f3c, false, 1, null);
        this.f189283a = c13877xf5f46f3c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeRefresh */
    public void mo1056x14dcd783(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        int pullType = response.getPullType();
        ym5.s3 s3Var = new ym5.s3(pullType);
        if (response.getErrType() == 0 && response.getErrCode() == 0) {
            s3Var.f545051c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8a);
            s3Var.f545050b = 1;
        } else {
            s3Var.f545051c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8x);
            s3Var.f545050b = -1;
        }
        s3Var.f545055g = response.getPullType() != 0;
        s3Var.f545054f = response.getHasMore();
        int i17 = 4;
        if ((pullType == 0 || pullType == 4) && s3Var.f545056h > 0) {
            s3Var.f545051c = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c c13877xf5f46f3c = this.f189283a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13877xf5f46f3c.getB(), "FinderMixAllFeedLoader_" + c13877xf5f46f3c.f189059e + '_' + c13877xf5f46f3c.f189060f + " [onFetchRefreshDone] reason=" + s3Var + " dataList(" + c13877xf5f46f3c.m56387xe6796cde().hashCode() + ") size=" + c13877xf5f46f3c.m56387xe6796cde().size());
        java.util.List m56409x97891cf7 = response.m56409x97891cf7();
        int size = m56409x97891cf7 != null ? m56409x97891cf7.size() : 0;
        if (response.getHasMore()) {
            if (size <= c13877xf5f46f3c.m56387xe6796cde().size()) {
                i17 = 2;
            }
        } else if (c13877xf5f46f3c.m56387xe6796cde().size() == 0 || size == 0 || c13877xf5f46f3c.m56387xe6796cde().size() <= size) {
            i17 = 6;
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b5(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0(i17, response.m56409x97891cf7(), response.getIsNeedClear(), null, 8, null), s3Var, this.f189283a, lVar, response));
        java.lang.String b17 = c13877xf5f46f3c.getB();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderMixAllFeedLoader_");
        sb6.append(c13877xf5f46f3c.f189059e);
        sb6.append('_');
        sb6.append(c13877xf5f46f3c.f189060f);
        sb6.append(" mergeRefresh dataList(");
        sb6.append(c13877xf5f46f3c.m56387xe6796cde().hashCode());
        sb6.append(") size=");
        sb6.append(c13877xf5f46f3c.m56387xe6796cde().size());
        sb6.append(' ');
        java.util.AbstractCollection<so2.j5> m56387xe6796cde = c13877xf5f46f3c.m56387xe6796cde();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m56387xe6796cde, 10));
        for (so2.j5 j5Var : m56387xe6796cde) {
            arrayList.add("type=" + j5Var.h() + ",id=" + j5Var.mo2128x1ed62e84());
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b17, sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h
    /* renamed from: sameFeed */
    public boolean mo56039x75147724(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 r0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 r0Var2) {
        so2.j5 existFeed = (so2.j5) r0Var;
        so2.j5 compareFeed = (so2.j5) r0Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(existFeed, "existFeed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compareFeed, "compareFeed");
        if (!(existFeed instanceof so2.a0) || !(compareFeed instanceof so2.a0) || existFeed.d(compareFeed) != 0) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c c13877xf5f46f3c = this.f189283a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13877xf5f46f3c.getB(), "FinderMixAllFeedLoader_" + c13877xf5f46f3c.f189059e + '_' + c13877xf5f46f3c.f189060f + " sameFeed existFeed=" + pm0.v.u(existFeed.mo2128x1ed62e84()) + ",compareFeed=" + pm0.v.u(compareFeed.mo2128x1ed62e84()) + " when merge");
        return true;
    }
}

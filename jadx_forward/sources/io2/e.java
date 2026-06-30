package io2;

/* loaded from: classes2.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5 f375005a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5 c14459x792f41a5) {
        super(c14459x792f41a5, false, 1, null);
        this.f375005a = c14459x792f41a5;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5 c14459x792f41a5 = this.f375005a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14459x792f41a5.getB(), "[onFetchRefreshDone]  reason=" + s3Var);
        java.util.List m56409x97891cf7 = response.m56409x97891cf7();
        int size = m56409x97891cf7 != null ? m56409x97891cf7.size() : 0;
        if (response.getHasMore()) {
            if (size <= c14459x792f41a5.m56387xe6796cde().size()) {
                i17 = 2;
            }
        } else if (c14459x792f41a5.m56387xe6796cde().size() == 0 || size == 0 || c14459x792f41a5.m56387xe6796cde().size() <= size) {
            java.util.List m56409x97891cf72 = response.m56409x97891cf7();
            if (m56409x97891cf72 != null && m56409x97891cf72.isEmpty()) {
                i17 = 7;
            } else {
                java.util.List m56409x97891cf73 = response.m56409x97891cf7();
                if (m56409x97891cf73 != null && m56409x97891cf73.containsAll(kz5.n0.S0(c14459x792f41a5.m56387xe6796cde()))) {
                    i17 = 6;
                }
            }
        }
        pm0.v.X(new io2.d(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0(i17, response.m56409x97891cf7(), response.getIsNeedClear(), null, 8, null), s3Var, this.f375005a, lVar, response));
    }
}

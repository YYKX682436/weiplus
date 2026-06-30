package vu2;

/* loaded from: classes2.dex */
public final class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui.C15114xedf903f6 f521752a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui.C15114xedf903f6 c15114xedf903f6) {
        super(c15114xedf903f6, false, 1, null);
        this.f521752a = c15114xedf903f6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h
    /* renamed from: filterSameFeed */
    public boolean mo56451x6910aebc() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeRefresh */
    public void mo1056x14dcd783(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        ym5.s3 s3Var = new ym5.s3(response.getPullType());
        if (response.getErrType() == 0 && response.getErrCode() == 0) {
            s3Var.f545051c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8a);
            s3Var.f545050b = 1;
        } else {
            s3Var.f545051c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8x);
            s3Var.f545050b = -1;
        }
        java.util.List m56409x97891cf7 = response.m56409x97891cf7();
        int size = m56409x97891cf7 != null ? m56409x97891cf7.size() : 0;
        s3Var.f545055g = size > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.ui.C15114xedf903f6 c15114xedf903f6 = this.f521752a;
        s3Var.f545054f = c15114xedf903f6.f210744i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15114xedf903f6.getB(), "[onFetchRefreshDone] reason=" + s3Var);
        pm0.v.X(new vu2.e(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0(response.getHasMore() ? 12 : (c15114xedf903f6.m56387xe6796cde().size() == 0 || size == 0 || c15114xedf903f6.m56387xe6796cde().size() <= size) ? 6 : 4, response.m56409x97891cf7(), response.getIsNeedClear(), null, 8, null), s3Var, this.f521752a, lVar, response));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: needCleanWhenRefresh */
    public boolean mo56445x151f84ee(java.util.List newList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newList, "newList");
        return false;
    }
}

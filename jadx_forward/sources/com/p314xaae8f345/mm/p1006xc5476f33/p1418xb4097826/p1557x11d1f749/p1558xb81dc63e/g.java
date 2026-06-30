package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e;

/* loaded from: classes8.dex */
public final class g implements kk3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h f202396a;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar) {
        this.f202396a = hVar;
    }

    @Override // kk3.d
    public void b(android.graphics.Bitmap bitmap, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoMultiTaskHelper", "startMaskAnim: transform to float ball animation end ,way:" + i17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.f(this.f202396a), 150L);
    }

    @Override // kk3.d
    public void d(android.graphics.Bitmap bitmap, boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoMultiTaskHelper", "startMaskAnim: transform to float ball animation start, isSwipeBack:" + z17 + ", way:" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar = this.f202396a;
        jk3.f fVar = hVar.f381658r;
        if (fVar != null) {
            kk3.c.h(fVar, hVar.f381610a, null, 2, null);
        }
    }

    @Override // kk3.d
    public void e(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoMultiTaskHelper", "startMaskAnim: transform to float ball animation cancel, way:" + i17);
        jk3.f fVar = this.f202396a.f381658r;
        if (fVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new pk3.j((pk3.l) fVar, false, false, null));
        }
    }
}

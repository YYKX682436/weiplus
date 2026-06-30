package vd2;

/* loaded from: classes3.dex */
public final class p4 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f517388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f517389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f517390c;

    public p4(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c, boolean z18) {
        this.f517388a = z17;
        this.f517389b = c14167x40aca97c;
        this.f517390c = z18;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0155  */
    @Override // ym5.q3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(int r22) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vd2.p4.b(int):void");
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "onLoadMoreEnd");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0 m0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0.f197140a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideStatusReport", "onLoadMoreEnd beginLoadMoreTimeMs=" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0.f197142c);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0.f197144e || com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0.f197142c == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0.f197144e = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0.f197142c = -1L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideStatusReport", "onLoadMoreEnd fail, status invalid");
            return;
        }
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0.f197142c);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0.f197143d = currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0.f197144e = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0.f197142c = -1L;
        if (currentTimeMillis > 20000 || currentTimeMillis <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveSlideStatusReport", "addLoadingTime loadingMs invalid ");
            return;
        }
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m0.f197149j;
        synchronized (arrayList) {
            arrayList.add(java.lang.Integer.valueOf(currentTimeMillis));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideStatusReport", "addLoadingTime timeMs=" + currentTimeMillis + " size=" + arrayList.size());
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "onRefreshBegin");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f517389b;
        c14167x40aca97c.f193015d.post(new vd2.o4(c14167x40aca97c));
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((ml2.r0) c17).Zj(ml2.y1.f409781e, -1L, -1L, -1);
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "onRefreshEnd");
    }
}

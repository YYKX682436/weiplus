package vd2;

/* loaded from: classes3.dex */
public final class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f517481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f517482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f517483f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5499xac76da04 f517484g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f517485h;

    public v3(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c, int i17, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5499xac76da04 c5499xac76da04, long j17) {
        this.f517481d = arrayList;
        this.f517482e = c14167x40aca97c;
        this.f517483f = i17;
        this.f517484g = c5499xac76da04;
        this.f517485h = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = this.f517481d;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b17 = ((km2.t) it.next()).b();
            if (b17 != null && b17.f150082s == this.f517485h) {
                break;
            } else {
                i17++;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f517482e;
        if (i17 >= 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                km2.m mVar = ((km2.t) it6.next()).f390755d;
                if (mVar != null) {
                    arrayList2.add(mVar);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c.j(c14167x40aca97c, i17, new java.util.ArrayList(arrayList2));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "LiveSwipeToNextListener: newCurIndex=" + i17 + ", curIndex=" + this.f517483f);
        java.lang.String str = this.f517484g.f135831g.f87880b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (!(!r26.n0.N(str))) {
            str = null;
        }
        if (str != null) {
            db5.t7.g(c14167x40aca97c.f193025q.getContext(), str);
        }
    }
}

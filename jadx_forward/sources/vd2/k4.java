package vd2;

/* loaded from: classes3.dex */
public final class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f517320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f517321e;

    public k4(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c) {
        this.f517320d = i17;
        this.f517321e = c14167x40aca97c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lxltest onSelectLive step2 pos:");
        int i17 = this.f517320d;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", sb6.toString());
        this.f517321e.z(i17, -1);
    }
}

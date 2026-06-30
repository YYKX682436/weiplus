package dk2;

/* loaded from: classes2.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.t f315085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315086f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f315087g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f315088h;

    public h2(int i17, km2.t tVar, dk2.r4 r4Var, int i18, int i19) {
        this.f315084d = i17;
        this.f315085e = tVar;
        this.f315086f = r4Var;
        this.f315087g = i18;
        this.f315088h = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        dk2.ef efVar = dk2.ef.f314905a;
        km2.n nVar = dk2.ef.H;
        int size = (nVar == null || (arrayList = nVar.f390686e) == null) ? 0 : arrayList.size();
        int i17 = this.f315084d;
        int f17 = e06.p.f(i17, 0, size);
        km2.n nVar2 = dk2.ef.H;
        if (nVar2 != null) {
            java.util.HashMap hashMap = km2.n.f390680p;
            km2.t data = this.f315085e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
            int f18 = e06.p.f(f17, 0, nVar2.f390686e.size());
            nVar2.f390686e.add(f18, data);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar2.f390682a, "#insertGuideData position=" + f18 + ", now liveDataList.size=" + nVar2.f390686e.size());
            km2.u uVar = nVar2.f390687f;
            if (uVar != null) {
                uVar.q(f18, 1);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f315086f.f315542d, "Guide container inserted at position " + f17 + " (original: " + i17 + "), curPos=" + this.f315087g + ", readLiveCount=" + this.f315088h + ", listSize=" + size);
    }
}

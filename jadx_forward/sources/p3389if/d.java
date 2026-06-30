package p3389if;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f372541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f372542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3389if.e f372543f;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, p3389if.e eVar) {
        this.f372541d = yVar;
        this.f372542e = i17;
        this.f372543f = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f372541d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = yVar.t3();
        boolean P = (t37 == null || (x07 = t37.x0()) == null) ? false : x07.P(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiInitPreloadSkylineView", "preloadNextSkylineView isOk:" + P);
        p3389if.e eVar = this.f372543f;
        int i17 = this.f372542e;
        if (P) {
            yVar.a(i17, eVar.o("ok"));
        } else {
            yVar.a(i17, eVar.o("fail"));
        }
    }
}

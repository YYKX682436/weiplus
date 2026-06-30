package dc1;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc1.d f310215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f310216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f310217f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f310218g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310219h;

    public b(dc1.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, int i18, java.lang.String str) {
        this.f310215d = dVar;
        this.f310216e = lVar;
        this.f310217f = i17;
        this.f310218g = i18;
        this.f310219h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f310215d.E(this.f310216e, this.f310217f, this.f310218g, this.f310219h);
    }
}

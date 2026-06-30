package wo4;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f529790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1 f529791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wo4.g f529792f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f529793g;

    public f(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1 p1Var, wo4.g gVar, byte[] bArr) {
        this.f529790d = j17;
        this.f529791e = p1Var;
        this.f529792f = gVar;
        this.f529793g = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1 p1Var = this.f529791e;
        long j17 = (this.f529790d - p1Var.f257244d) + (p1Var.f257241a * 1000);
        wo4.g gVar = this.f529792f;
        yz5.p pVar = gVar.f347748e;
        if (pVar != null) {
        }
        gVar.F = j17;
    }
}

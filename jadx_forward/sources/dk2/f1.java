package dk2;

/* loaded from: classes3.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f314951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f314952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f314953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.s f314954g;

    public f1(p3325xe03a0797.p3326xc267989b.y0 y0Var, boolean z17, dk2.r4 r4Var, yz5.s sVar) {
        this.f314951d = y0Var;
        this.f314952e = z17;
        this.f314953f = r4Var;
        this.f314954g = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3325xe03a0797.p3326xc267989b.l.d(this.f314951d, null, p3325xe03a0797.p3326xc267989b.a1.UNDISPATCHED, new dk2.e1(this.f314952e, this.f314953f, this.f314954g, null), 1, null);
    }
}

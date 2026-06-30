package c13;

/* loaded from: classes11.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y03.f f119432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f119433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f119434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f119435g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f119436h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119437i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f119438m;

    public q(y03.f fVar, int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f119432d = fVar;
        this.f119433e = i17;
        this.f119434f = i18;
        this.f119435g = i19;
        this.f119436h = i27;
        this.f119437i = i28;
        this.f119438m = i29;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24115x44252fc3 c24115x44252fc3 = new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24115x44252fc3(this.f119432d.f540171a, this.f119433e, this.f119434f, this.f119435g, false);
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e = c13.b0.f119394e;
        if (c24132x9b57f23e != null) {
            c24132x9b57f23e.m89497x28cd6a4a(c24115x44252fc3, new c13.p(this.f119432d, this.f119433e, this.f119434f, this.f119435g, this.f119436h, this.f119437i, this.f119438m, c24115x44252fc3));
        }
    }
}

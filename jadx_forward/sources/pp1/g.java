package pp1;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f438942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f438943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f438944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f438945g;

    public g(pp1.z zVar, boolean z17, boolean z18, yz5.a aVar) {
        this.f438942d = zVar;
        this.f438943e = z17;
        this.f438944f = z18;
        this.f438945g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pp1.z zVar = this.f438942d;
        boolean z17 = this.f438943e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = zVar.f438981f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c12917x19ac03e7);
        zVar.n(z17, true, 1.0f, c12917x19ac03e7.m54108x4480f5e7(), this.f438944f);
        ((ku5.t0) ku5.t0.f394148d).B(new pp1.f(this.f438942d, this.f438943e, this.f438945g));
    }
}

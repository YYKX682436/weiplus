package wt3;

/* loaded from: classes5.dex */
public final class t0 extends wt3.b0 {

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f531028p;

    /* renamed from: q, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f531029q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f531030r;

    /* renamed from: s, reason: collision with root package name */
    public final wt3.v0 f531031s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.q f531032t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f531033u;

    /* renamed from: v, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f531034v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(im5.b lifeCycleKeeper, java.util.ArrayList images, int i17, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(lifeCycleKeeper, images, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(images, "images");
        this.f531028p = images;
        this.f531029q = yVar;
        this.f531030r = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("MicroMsg.NewLifeGetImageListRecommendAudioTask", yVar, 1);
        this.f531033u = new java.util.ArrayList();
        this.f531031s = new wt3.v0(lifeCycleKeeper, this.f530932h, this.f530928d, 103, new wt3.q0(this));
    }

    @Override // wt3.e
    public void h(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17) {
        v65.i.b(this.f531030r, null, new wt3.r0(this, z17, null), 1, null);
    }

    @Override // wt3.e
    public void k() {
        this.f531034v = v65.i.b(this.f531030r, null, new wt3.s0(this, null), 1, null);
    }
}

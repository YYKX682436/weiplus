package wt3;

/* loaded from: classes5.dex */
public final class e0 extends wt3.g0 implements wt3.j0 {

    /* renamed from: s, reason: collision with root package name */
    public nv3.f f530939s;

    /* renamed from: t, reason: collision with root package name */
    public wt3.i0 f530940t;

    public /* synthetic */ e0(im5.b bVar, yu3.a aVar, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(bVar, aVar, (i18 & 4) != 0 ? 1 : i17);
    }

    @Override // wt3.j0
    public void a(wt3.i0 i0Var) {
        this.f530940t = i0Var;
    }

    @Override // wt3.e
    public wt3.q e() {
        return new wt3.a0();
    }

    @Override // wt3.j0
    /* renamed from: getHelper */
    public nv3.f mo160996x1c5132a4() {
        return this.f530939s;
    }

    @Override // wt3.e
    public void h(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17) {
        this.f530939s.a(z17, gVar, null);
    }

    @Override // wt3.g0
    public void l(long j17) {
        this.f530928d = j17;
        this.f530939s.f422194c = j17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(im5.b lifeCycleKeeper, yu3.a createInfo, int i17) {
        super(lifeCycleKeeper, createInfo.f547386c, createInfo.f547388e, createInfo.f547389f, createInfo.f547384a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(createInfo, "createInfo");
        this.f530939s = new nv3.f(lifeCycleKeeper, this.f530932h, this.f530928d, i17, createInfo.f547391h, 0, null, null, new wt3.d0(this), 224, null);
    }
}

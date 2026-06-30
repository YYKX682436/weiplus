package cm2;

/* loaded from: classes3.dex */
public final class b0 extends cm2.t {

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f124864v;

    /* renamed from: w, reason: collision with root package name */
    public final int f124865w;

    public b0(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f124864v = data;
        this.f124865w = i17;
    }

    @Override // c61.bc
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g a() {
        return this.f124919e;
    }

    @Override // c61.bc
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f b() {
        return this.f124864v;
    }

    @Override // c61.bc
    public long c() {
        return this.f124918d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return 0;
    }

    public final java.lang.Integer g() {
        return this.f124865w == 15 ? 11 : null;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f124864v.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}

package cm2;

/* loaded from: classes3.dex */
public final class v extends cm2.t {
    public final java.lang.String A;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f124934v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f124935w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f124936x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f124937y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f124938z;

    public v(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f124934v = data;
        this.f124935w = data.m76514x1202da9d();
        this.f124936x = data.m76523x98b23862();
        this.f124937y = data.m76497x4fe38a1f();
        this.f124938z = data.m76495xac8a4bdb();
        data.m76522x978297b9();
        java.lang.String m76501xf2fd2296 = data.m76501xf2fd2296();
        this.A = m76501xf2fd2296 == null ? "" : m76501xf2fd2296;
    }

    @Override // c61.bc
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g a() {
        return this.f124919e;
    }

    @Override // c61.bc
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f b() {
        return this.f124934v;
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

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f124934v.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}

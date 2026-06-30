package vp2;

/* loaded from: classes2.dex */
public final class b implements so2.j5, wp2.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.fa2 f520438d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f520439e;

    public b(r45.fa2 container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f520438d = container;
        this.f520439e = new java.util.ArrayList();
    }

    @Override // wp2.a
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g a() {
        return this.f520438d.f455665n;
    }

    @Override // wp2.a
    public void b(int i17) {
        this.f520438d.f455663i = i17;
    }

    @Override // wp2.a
    public int c() {
        return this.f520439e.size();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof vp2.b) && ((vp2.b) obj).f520438d.f455658d == this.f520438d.f455658d) ? 0 : -1;
    }

    public final java.util.ArrayList e() {
        return this.f520439e;
    }

    @Override // wp2.a
    public void f(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f520438d.f455665n = gVar;
    }

    @Override // wp2.a
    public java.util.List g() {
        return kz5.p0.f395529d;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f520438d.f455658d;
    }

    @Override // in5.c
    public int h() {
        return 5;
    }

    @Override // wp2.a
    public int i() {
        return this.f520438d.f455658d;
    }
}

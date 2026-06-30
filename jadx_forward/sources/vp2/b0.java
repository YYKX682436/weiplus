package vp2;

/* loaded from: classes2.dex */
public final class b0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f520440d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.fa2 f520441e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f520442f;

    public b0(java.lang.String content, r45.fa2 container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f520440d = content;
        this.f520441e = container;
        this.f520442f = new java.util.ArrayList();
    }

    public final java.lang.String a() {
        return this.f520440d;
    }

    public final java.util.List b() {
        return this.f520442f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof vp2.b0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((vp2.b0) obj).f520440d, this.f520440d)) ? 0 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return -5000;
    }
}

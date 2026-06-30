package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class j0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.i0 f192919d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f192920e;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.i0 galleryTabData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(galleryTabData, "galleryTabData");
        this.f192919d = galleryTabData;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.j0) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.j0) obj).f192919d.f192916a == this.f192919d.f192916a) ? 0 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f192919d.f192916a;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public abstract class d implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.r0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final in5.s0 f184636d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f184637e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f184638f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f184639g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13688x80228571 f184640h;

    public d(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 currentItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentItem, "currentItem");
        this.f184636d = holder;
        this.f184637e = currentItem;
        this.f184638f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b.f184446d);
        this.f184639g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c.f184542d);
        this.f184640h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13688x80228571(new java.lang.ref.WeakReference(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.r0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13688x80228571 c13688x80228571 = this.f184640h;
        if (!(c13688x80228571 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13688x80228571)) {
            c13688x80228571 = null;
        }
        if (c13688x80228571 != null) {
            c13688x80228571.mo48814x2efc64();
            c13688x80228571.f184354d.clear();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s0
    public abstract void b();
}

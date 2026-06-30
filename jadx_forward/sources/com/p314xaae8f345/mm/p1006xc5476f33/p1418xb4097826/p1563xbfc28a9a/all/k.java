package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.all;

/* loaded from: classes2.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5506x4ab0ff64 f202619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5506x4ab0ff64 c5506x4ab0ff64) {
        super(1);
        this.f202619d = c5506x4ab0ff64;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        so2.j5 it = (so2.j5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            ya2.b2 contact = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it).getContact();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(contact != null ? contact.D0() : null, this.f202619d.f135837g.f88557a)) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}

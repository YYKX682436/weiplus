package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes8.dex */
public final class y1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s40.s0 f148575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(s40.s0 s0Var) {
        super(1);
        this.f148575d = s0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map hashMap;
        java.util.LinkedList<r45.dl2> m75941xfb821914;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar == null) {
            return null;
        }
        int i17 = fVar.f152148a;
        s40.s0 s0Var = this.f148575d;
        if (i17 != 0 || fVar.f152149b != 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.e2) s0Var).a(new java.util.HashMap(), 0);
            return fVar;
        }
        r45.ov0 ov0Var = (r45.ov0) fVar.f152151d;
        if (ov0Var == null || (m75941xfb821914 = ov0Var.m75941xfb821914(1)) == null) {
            hashMap = new java.util.HashMap();
        } else {
            int d17 = kz5.b1.d(kz5.d0.q(m75941xfb821914, 10));
            if (d17 < 16) {
                d17 = 16;
            }
            hashMap = new java.util.LinkedHashMap(d17);
            for (r45.dl2 dl2Var : m75941xfb821914) {
                java.lang.Long valueOf = java.lang.Long.valueOf(dl2Var.m75942xfb822ef2(0));
                r45.nw1 nw1Var = (r45.nw1) dl2Var.m75936x14adae67(1);
                hashMap.put(valueOf, java.lang.Integer.valueOf(nw1Var != null ? nw1Var.m75939xb282bd08(2) : 1));
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.e2) s0Var).a(hashMap, ((r45.ov0) fVar.f152151d).m75939xb282bd08(3));
        return fVar;
    }
}

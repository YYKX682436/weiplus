package ml2;

/* loaded from: classes3.dex */
public final class d0 {
    public d0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final nm5.c a(so2.j5 rvFeed) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rvFeed, "rvFeed");
        boolean z17 = true;
        if (rvFeed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) rvFeed;
            r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
            r2 = m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : 0L;
            r45.nw1 m59258xd05571302 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
            i17 = m59258xd05571302 != null ? m59258xd05571302.m75939xb282bd08(1) : 0;
        } else {
            if (rvFeed instanceof so2.j1) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((so2.j1) rvFeed).f491972d;
                r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
                r2 = m76794xd0557130 != null ? m76794xd0557130.m75942xfb822ef2(0) : 0L;
                r45.nw1 m76794xd05571302 = c19792x256d2725.m76794xd0557130();
                i17 = m76794xd05571302 != null ? m76794xd05571302.m75939xb282bd08(1) : 0;
                return nm5.j.d(java.lang.Long.valueOf(r2), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
            }
            i17 = -1;
        }
        z17 = false;
        return nm5.j.d(java.lang.Long.valueOf(r2), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
    }

    public final java.lang.String b(so2.j5 rvFeed) {
        java.lang.String m76801x8010e5e4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rvFeed, "rvFeed");
        return rvFeed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) rvFeed).getFeedObject().m59273x80025a04() : (!(rvFeed instanceof so2.j1) || (m76801x8010e5e4 = ((so2.j1) rvFeed).f491972d.m76801x8010e5e4()) == null) ? "" : m76801x8010e5e4;
    }
}

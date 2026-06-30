package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class z60 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.c70 f218193g;

    public z60(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.c70 c70Var) {
        this.f218193g = c70Var;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return event instanceof fc2.t;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        int y17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6 instanceof fc2.t) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.c70 c70Var = this.f218193g;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c70Var.O6().getLayoutManager();
            if ((layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) && (y17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).y()) > c70Var.f215510f) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c70Var.O6().p0(y17);
                if (p07 instanceof in5.s0) {
                    java.lang.Object obj = ((in5.s0) p07).f374658i;
                    if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                        long m59251x5db1b11 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj).getFeedObject().m59251x5db1b11();
                        fc2.t tVar = (fc2.t) ev6;
                        if (tVar.f342525k != m59251x5db1b11) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.c70.f215507g.put(java.lang.Integer.valueOf(c70Var.P6()), java.lang.Long.valueOf(m59251x5db1b11));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamPartialExposeUIC", "[onScrollStateChanged] tabType=" + c70Var.P6() + " lastId=" + m59251x5db1b11 + ' ' + tVar.f342525k + " position=" + y17);
                            c70Var.f215510f = y17;
                        }
                    }
                }
            }
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.c70.f215507g;
            java.lang.Long l17 = (java.lang.Long) hashMap.get(java.lang.Integer.valueOf(c70Var.P6()));
            long j17 = ((fc2.t) ev6).f342525k;
            if (l17 != null && l17.longValue() == j17) {
                hashMap.put(java.lang.Integer.valueOf(c70Var.P6()), 0L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamPartialExposeUIC", "[onScrollStateChanged] tabType=" + c70Var.P6() + " reset");
            }
        }
    }
}

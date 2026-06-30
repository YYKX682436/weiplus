package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes2.dex */
public final class m0 extends in5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 f198001a;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 c14298xca26f590) {
        this.f198001a = c14298xca26f590;
    }

    @Override // in5.i
    public java.lang.Object a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        r45.fa2 fa2Var;
        java.util.LinkedList linkedList;
        if (k3Var == null || (fa2Var = this.f198001a.f197329v.f198155d) == null || (linkedList = fa2Var.f455662h) == null) {
            return null;
        }
        return (r45.ea2) kz5.n0.a0(linkedList, k3Var.m8183xf806b362());
    }

    @Override // in5.i
    public long b(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        r45.fa2 fa2Var;
        java.util.LinkedList linkedList;
        r45.ea2 ea2Var = null;
        if (k3Var != null && (fa2Var = this.f198001a.f197329v.f198155d) != null && (linkedList = fa2Var.f455662h) != null) {
            ea2Var = (r45.ea2) kz5.n0.a0(linkedList, k3Var.m8183xf806b362());
        }
        if (ea2Var == null || (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2)) == null) {
            return 0L;
        }
        return c19792x256d2725.m76784x5db1b11();
    }

    @Override // in5.i
    public void c(java.util.Set recordsSet) {
        java.lang.String str;
        int intValue;
        java.lang.Object tag;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAfterPluginRecommendLiveView", "onExposeTimeRecorded: size = " + recordsSet.size());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 c14298xca26f590 = this.f198001a;
        c14298xca26f590.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = recordsSet.iterator();
        while (it.hasNext()) {
            in5.e eVar = (in5.e) it.next();
            r45.ni4 ni4Var = new r45.ni4();
            r45.ea2 ea2Var = (r45.ea2) eVar.f374555a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2);
            ni4Var.set(0, java.lang.Long.valueOf(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L));
            ni4Var.set(5, java.lang.Integer.valueOf((int) eVar.f374558d));
            ni4Var.set(6, java.lang.Integer.valueOf(eVar.f374559e));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2);
            if (c19792x256d27252 == null || (str = c19792x256d27252.m76829x97edf6c0()) == null) {
                str = "";
            }
            ni4Var.set(4, str);
            if (c14298xca26f590.f197328u != null) {
                android.view.View view = eVar.f374560f;
                if (view == null || (tag = view.getTag(com.p314xaae8f345.mm.R.id.f567633k62)) == null) {
                    java.lang.Integer num = 0;
                    intValue = num.intValue();
                } else {
                    long longValue = tag instanceof java.lang.Long ? ((java.lang.Number) tag).longValue() : 0L;
                    intValue = java.lang.Integer.valueOf(longValue != 0 ? (int) (android.os.SystemClock.elapsedRealtime() - longValue) : 0).intValue();
                }
                ni4Var.set(7, java.lang.Integer.valueOf(intValue));
                android.view.View view2 = eVar.f374560f;
                if (view2 != null) {
                    view2.setTag(com.p314xaae8f345.mm.R.id.f567633k62, 0L);
                }
            }
            ni4Var.set(8, java.lang.Boolean.FALSE);
            linkedList.add(ni4Var);
            ni4Var.set(9, java.lang.Long.valueOf(eVar.f374556b));
            ni4Var.set(13, java.lang.Long.valueOf(eVar.f374556b));
            ni4Var.set(12, java.lang.Integer.valueOf(ni4Var.m75939xb282bd08(5)));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onExposeTimeRecorded pos:");
            sb6.append(eVar.f374559e);
            sb6.append(" start_effective_expose_time_ms: ");
            sb6.append(eVar.f374556b);
            sb6.append(" feedId: ");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2);
            sb6.append(pm0.v.u(c19792x256d27253 != null ? c19792x256d27253.m76784x5db1b11() : 0L));
            sb6.append(" auto_play_time_ms:");
            sb6.append(ni4Var.m75939xb282bd08(7));
            sb6.append("expose_time_ms:");
            sb6.append(eVar.f374558d);
            sb6.append(" nick:");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27254 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2);
            sb6.append(c19792x256d27254 != null ? c19792x256d27254.m76801x8010e5e4() : null);
            sb6.append(" effective_expose_time_ms:");
            sb6.append(ni4Var.m75939xb282bd08(12));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAfterPluginRecommendLiveView", sb6.toString());
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        so2.h3.f491925d.d(linkedList);
    }

    @Override // in5.i
    public void d(in5.e item) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f198001a.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.Object obj = item.f374555a;
        r45.ea2 ea2Var = obj instanceof r45.ea2 ? (r45.ea2) obj : null;
        if (ea2Var != null) {
            r45.ni4 ni4Var = new r45.ni4();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2);
            ni4Var.set(0, java.lang.Long.valueOf(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L));
            ni4Var.set(9, java.lang.Long.valueOf(item.f374556b));
            ni4Var.set(6, java.lang.Integer.valueOf(item.f374559e));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2);
            if (c19792x256d27252 == null || (str = c19792x256d27252.m76829x97edf6c0()) == null) {
                str = "";
            }
            ni4Var.set(4, str);
            ni4Var.set(11, 2);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleOnItemExposeStart pos:");
            sb6.append(item.f374559e);
            sb6.append(" feedId: ");
            sb6.append(pm0.v.u(ni4Var.m75942xfb822ef2(0)));
            sb6.append(" start_expose_time_ms:");
            sb6.append(ni4Var.m75942xfb822ef2(9));
            sb6.append(" nick:");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2);
            sb6.append(c19792x256d27253 != null ? c19792x256d27253.m76801x8010e5e4() : null);
            sb6.append(" sessionBuffer:");
            sb6.append(ni4Var.m75945x2fec8307(4));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAfterPluginRecommendLiveView", sb6.toString());
            linkedList.add(ni4Var);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        so2.h3.f491925d.d(linkedList);
    }
}

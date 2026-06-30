package df2;

/* loaded from: classes3.dex */
public final class nt extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312415m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f312416n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f312417o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312415m = "LivePromoteReportController";
        this.f312416n = java.util.Collections.synchronizedList(new java.util.LinkedList());
    }

    public final void Z6(java.util.List list) {
        if (zl2.r4.f555483a.w1()) {
            return;
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) k0Var : null;
        r45.qt2 reportObj = c14353xe7c1f419 != null ? c14353xe7c1f419.getReportObj() : null;
        gk2.e liveRoomData = getStore().getLiveRoomData();
        r45.jn0 jn0Var = new r45.jn0();
        jn0Var.set(1, xy2.c.e(O6()));
        jn0Var.set(0, java.lang.Long.valueOf(((mm2.e1) liveRoomData.a(mm2.e1.class)).f410516m));
        jn0Var.set(2, ((mm2.e1) liveRoomData.a(mm2.e1.class)).f410526w);
        r45.w42 w42Var = new r45.w42();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(list);
        w42Var.set(0, linkedList);
        jn0Var.set(7, w42Var);
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        ((c61.p2) ybVar).Lj(reportObj, 5, jn0Var, e1Var != null ? e1Var.f410526w : null);
    }

    public final void a7(r45.yp5 item) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[report] extInfo = ");
        r45.x42 x42Var = ((mm2.f6) m56788xbba4bfc0(mm2.f6.class)).F1;
        if (x42Var == null || (obj = pm0.b0.g(x42Var)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f312415m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        r45.x42 x42Var2 = ((mm2.f6) m56788xbba4bfc0(mm2.f6.class)).F1;
        jz5.f0 f0Var = null;
        if (x42Var2 != null) {
            if (!(x42Var2.m75939xb282bd08(1) > 0)) {
                x42Var2 = null;
            }
            if (x42Var2 != null) {
                if (!x42Var2.m75933x41a8a7f2(0)) {
                    this.f312416n.add(item);
                    p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f312417o;
                    if (r2Var != null ? r2Var.a() : false) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "delay job running, so add to list enough");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "no delay job, launch it");
                        this.f312417o = p3325xe03a0797.p3326xc267989b.l.d(getStore().getLiveRoomData().f354008i, null, null, new df2.mt(x42Var2, this, null), 3, null);
                    }
                }
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doReportInternal immediately");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(item);
            Z6(linkedList);
        }
    }

    public final void b7(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[reportAllItem] fromScene = ");
        sb6.append(str);
        sb6.append(", size = ");
        java.util.List list = this.f312416n;
        sb6.append(list.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312415m, sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        java.util.List list2 = list.isEmpty() ^ true ? list : null;
        if (list2 != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(list2);
            Z6(linkedList);
            list.clear();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f312417o;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        b7("onExitLive");
    }
}

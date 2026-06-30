package df2;

/* loaded from: classes3.dex */
public final class yv extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f313429m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313429m = jz5.h.b(new df2.xv(this, store));
    }

    public final jk2.l Z6() {
        return (jk2.l) ((jz5.n) this.f313429m).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        kn0.p pVar;
        super.mo14867x5aa1c816(r71Var);
        tn0.w0 Q6 = Q6();
        boolean z17 = false;
        if (Q6 != null && (pVar = Q6.D) != null && pVar.i()) {
            z17 = true;
        }
        if (z17) {
            jk2.l Z6 = Z6();
            java.util.Iterator it = Z6.f381607b.iterator();
            while (it.hasNext()) {
                jk2.j jVar = (jk2.j) it.next();
                long a17 = dk2.tf.f315666a.a(((mm2.c1) ((df2.wv) Z6.f381606a).b().a(mm2.c1.class)).f410385o);
                if (jVar.f381603b.m75933x41a8a7f2(4) && a17 >= jVar.f381603b.m75939xb282bd08(2) && jVar.g() && jVar.f()) {
                    jVar.k();
                }
            }
        }
        java.util.Iterator it6 = Z6().f381607b.iterator();
        while (it6.hasNext()) {
            ((jk2.j) it6.next()).j(r71Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        r45.yd2 yd2Var;
        java.util.LinkedList<r45.zd2> m75941xfb821914;
        super.mo14863x39a513b7(hc1Var);
        if (hc1Var != null) {
            jk2.l Z6 = Z6();
            Z6.getClass();
            r45.ic1 ic1Var = (r45.ic1) hc1Var.m75936x14adae67(85);
            if (ic1Var != null && (yd2Var = (r45.yd2) ic1Var.m75936x14adae67(0)) != null && (m75941xfb821914 = yd2Var.m75941xfb821914(0)) != null) {
                java.util.ArrayList arrayList = Z6.f381607b;
                arrayList.clear();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleGuideInfoList: ");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                for (r45.zd2 zd2Var : m75941xfb821914) {
                    sb7.append("[type: " + zd2Var.m75939xb282bd08(0) + " priority: " + zd2Var.m75939xb282bd08(1) + " watch_time: " + zd2Var.m75939xb282bd08(2) + " appearTime: " + zd2Var.m75939xb282bd08(3) + ", enablePreload: " + zd2Var.m75933x41a8a7f2(4) + ']');
                    sb7.append("\n");
                }
                java.lang.String sb8 = sb7.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
                sb6.append(sb8);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorGuideManager", sb6.toString());
                for (r45.zd2 zd2Var2 : m75941xfb821914) {
                    if (zl2.q4.f555466a.E()) {
                        lb2.j jVar = ae2.in.A6;
                        if (((java.lang.Number) jVar.r()).intValue() > 0) {
                            zd2Var2.set(2, java.lang.Integer.valueOf(((java.lang.Number) jVar.r()).intValue()));
                        }
                        lb2.j jVar2 = ae2.in.B6;
                        if (((java.lang.Number) jVar2.r()).intValue() > 0) {
                            zd2Var2.set(4, java.lang.Boolean.valueOf(((java.lang.Number) jVar2.r()).intValue() == 1));
                        }
                        lb2.j jVar3 = ae2.in.C6;
                        if (((java.lang.Number) jVar3.r()).intValue() > 1) {
                            zd2Var2.set(3, java.lang.Integer.valueOf(((java.lang.Number) jVar3.r()).intValue()));
                        }
                    }
                    int m75939xb282bd08 = zd2Var2.m75939xb282bd08(0);
                    jk2.a aVar = Z6.f381606a;
                    if (m75939xb282bd08 == 1) {
                        arrayList.add(new jk2.e(aVar, zd2Var2));
                    } else if (m75939xb282bd08 == 3) {
                        arrayList.add(new jk2.g(aVar, zd2Var2));
                    } else if (m75939xb282bd08 == 4) {
                        arrayList.add(new jk2.m(aVar, zd2Var2));
                    }
                }
            }
            java.util.Iterator it = Z6().f381607b.iterator();
            while (it.hasNext()) {
                ((jk2.j) it.next()).h();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        java.util.Iterator it = Z6().f381607b.iterator();
        while (it.hasNext()) {
            ((jk2.j) it.next()).h();
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        java.util.Iterator it = Z6().f381607b.iterator();
        while (it.hasNext()) {
            ((jk2.j) it.next()).l();
        }
    }
}

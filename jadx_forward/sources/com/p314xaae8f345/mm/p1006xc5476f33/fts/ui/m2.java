package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final t13.k f219648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.o2 f219649e;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.o2 o2Var, t13.k unit, java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unit, "unit");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        this.f219649e = o2Var;
        this.f219648d = unit;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.o2 o2Var = this.f219649e;
        java.util.LinkedList linkedList = o2Var.f219665q;
        if (linkedList != null) {
            if (!o2Var.f219666r && ((t13.k) linkedList.get(linkedList.size() - 1)).mo9548xfb85f7b0() == this.f219648d.mo9548xfb85f7b0()) {
                o2Var.f219666r = true;
            }
            java.util.LinkedList linkedList2 = o2Var.f219665q;
            java.util.Iterator it = linkedList2.iterator();
            int i17 = 0;
            int i18 = 0;
            while (it.hasNext()) {
                i18 = ((t13.k) it.next()).j(i18);
            }
            o2Var.n(i18);
            o2Var.notifyDataSetChanged();
            o2Var.l(i18, o2Var.f219666r);
            if (o2Var.f219666r) {
                if (linkedList2 != null) {
                    java.util.Iterator it6 = linkedList2.iterator();
                    while (it6.hasNext()) {
                        i17 += ((t13.k) it6.next()).e();
                    }
                }
                g23.j.f349467e = i17;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6662x813c26a0 c6662x813c26a0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6662x813c26a0();
                c6662x813c26a0.q(g23.j.f349465c);
                c6662x813c26a0.f140076d = 5L;
                c6662x813c26a0.f140077e = g23.j.f349464b;
                c6662x813c26a0.p(g23.j.f349466d);
                c6662x813c26a0.f140079g = g23.j.f349467e;
                c6662x813c26a0.k();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSKefuBoxReporter", "report 29105 " + c6662x813c26a0.m());
            }
        }
    }
}

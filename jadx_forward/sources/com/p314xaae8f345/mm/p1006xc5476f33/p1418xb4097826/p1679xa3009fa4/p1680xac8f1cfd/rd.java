package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class rd extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yd f217325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217326b;

    public rd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yd ydVar, in5.s0 s0Var) {
        this.f217325a = ydVar;
        this.f217326b = s0Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        java.util.List list;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 e76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yd ydVar = this.f217325a;
        ydVar.getClass();
        if (z17) {
            java.lang.Object obj = this.f217326b.f374658i;
            java.lang.Object obj2 = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
            if (abstractC14490x69736cb5 == null || (list = (java.util.List) ydVar.f7().U6(abstractC14490x69736cb5.mo2128x1ed62e84()).mo3195x754a37bb()) == null || (e76 = ydVar.e7(abstractC14490x69736cb5, list)) == null) {
                return;
            }
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = e76.m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            java.util.Iterator<T> it = m76521x7528c3fb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.wf6 wf6Var = (r45.wf6) next;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wf6Var);
                if (ydVar.h7(wf6Var)) {
                    obj2 = next;
                    break;
                }
            }
            r45.wf6 wf6Var2 = (r45.wf6) obj2;
            if (wf6Var2 == null || ((r45.d60) wf6Var2.m75936x14adae67(31)) == null) {
                return;
            }
            xc2.p0 p0Var = new xc2.p0(e76);
            p0Var.f534777f = abstractC14490x69736cb5;
            p0Var.f534790s = 23;
            p0Var.f534789r = 16;
            xc2.n.c(xc2.n.f534745a, ydVar.m80379x76847179(), view, p0Var, 0, "feed_jump_carousel", xc2.k.f534704d, null, null, 200, null);
        }
    }
}

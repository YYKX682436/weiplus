package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class kd extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ld f216490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f216491b;

    public kd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ld ldVar, in5.s0 s0Var) {
        this.f216490a = ldVar;
        this.f216491b = s0Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        xc2.p0 e76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ld ldVar = this.f216490a;
        ldVar.getClass();
        in5.s0 holder = this.f216491b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (z17) {
            java.lang.Object obj = holder.f374658i;
            java.lang.Object obj2 = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
            if (abstractC14490x69736cb5 == null || (e76 = ldVar.e7(abstractC14490x69736cb5)) == null) {
                return;
            }
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = e76.f534767a.m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            java.util.Iterator<T> it = m76521x7528c3fb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.wf6 wf6Var = (r45.wf6) next;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wf6Var);
                if (ldVar.f7(wf6Var)) {
                    obj2 = next;
                    break;
                }
            }
            r45.wf6 wf6Var2 = (r45.wf6) obj2;
            if (wf6Var2 == null || ((r45.d60) wf6Var2.m75936x14adae67(31)) == null) {
                return;
            }
            xc2.n.c(xc2.n.f534745a, ldVar.m80379x76847179(), view, e76, 0, "feed_jump_carousel", xc2.k.f534704d, null, null, 200, null);
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class h6 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 f191643d;

    public h6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 p6Var) {
        this.f191643d = p6Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        so2.e5 e5Var = (so2.e5) holder.f374658i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e5Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 p6Var = this.f191643d;
        p6Var.getClass();
        java.util.List c17 = kz5.b0.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.b6(e5Var));
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = p6Var.f191941q;
        if (c22482x50bddb92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        java.lang.String m80970x134c2d56 = c22482x50bddb92.m80997xdc5215a6().m80970x134c2d56();
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb922 = p6Var.f191941q;
        if (c22482x50bddb922 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb922.m80997xdc5215a6().n(m80970x134c2d56, c17);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = c17.iterator();
        while (it.hasNext()) {
            java.lang.String m75945x2fec8307 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.b6) it.next()).f191230d.f491863d.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            linkedList.add(m75945x2fec8307);
        }
        p6Var.f191931d.mo48674x36654fab();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m80970x134c2d56);
        p6Var.f191932e.h(m80970x134c2d56, linkedList);
    }
}

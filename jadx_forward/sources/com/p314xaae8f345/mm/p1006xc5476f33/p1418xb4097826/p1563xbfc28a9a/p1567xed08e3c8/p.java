package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class p implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 f202802d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 c0Var) {
        this.f202802d = c0Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (i17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c0 c0Var = this.f202802d;
            if (i17 >= c0Var.Q.size()) {
                return;
            }
            java.util.ArrayList arrayList = c0Var.S;
            if (arrayList.get(i17) instanceof jo2.b) {
                db5.t7.m(c0Var.m80379x76847179(), c0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.emu));
                return;
            }
            java.lang.Object obj = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            c0Var.W6(arrayList, (so2.j5) obj, i17, 1);
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class h4 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p4 f203245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp2.q f203246e;

    public h4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p4 p4Var, vp2.q qVar) {
        this.f203245d = p4Var;
        this.f203246e = qVar;
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p4 p4Var = this.f203245d;
        rl5.r rVar = p4Var.f203417g;
        if (rVar != null) {
            rVar.a();
            p4Var.f203417g = null;
        }
        vp2.q qVar = this.f203246e;
        java.lang.Object obj = qVar.f520484e.get(i17);
        vp2.p pVar = obj instanceof vp2.p ? (vp2.p) obj : null;
        p4Var.o(4, (pVar == null || (feedObject = pVar.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null) ? 0L : m59258xd0557130.m75942xfb822ef2(0));
        rl5.r rVar2 = new rl5.r(view.getContext());
        rVar2.C = true;
        rVar2.V = true;
        p4Var.f203417g = rVar2;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = iArr[0] + ((int) (view.getWidth() / 2.0f));
        int a17 = iArr[1] + i65.a.a(view.getContext(), 8.0f);
        rl5.r rVar3 = p4Var.f203417g;
        if (rVar3 != null) {
            rVar3.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.o4(i17, qVar, p4Var, adapter);
            rVar3.f478871f = view;
            if (!(view instanceof android.widget.TextView) && (width == 0 || a17 == 0)) {
                rVar3.l();
            }
            rVar3.f478889z.clear();
            db5.g4 g4Var = rVar3.f478889z;
            if (g4Var != null) {
                g4Var.removeItem(1);
            }
            if (g4Var != null) {
                g4Var.b(1, com.p314xaae8f345.mm.R.C30867xcad56011.dze, com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
            }
            if (width == 0 && a17 == 0) {
                rVar3.m();
            } else {
                rVar3.n(width, a17);
            }
        }
        return true;
    }
}

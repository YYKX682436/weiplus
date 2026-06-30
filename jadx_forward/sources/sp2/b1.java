package sp2;

/* loaded from: classes2.dex */
public final class b1 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492518d;

    public b1(sp2.o2 o2Var) {
        this.f492518d = o2Var;
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 a17;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter).a0();
        if (i17 < a07) {
            return true;
        }
        int i18 = i17 - a07;
        sp2.o2 o2Var = this.f492518d;
        so2.j5 j5Var = (so2.j5) kz5.n0.a0(o2Var.f492678m, i18);
        if (!(j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5)) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
        if (!zl2.q4.f555466a.C(abstractC14490x69736cb5) || (a17 = zl2.r4.f555483a.a1(o2Var.f492654a, abstractC14490x69736cb5, 1005, o2Var.f492660d, new sp2.a1(o2Var, i18, j5Var, adapter, i17))) == null) {
            return true;
        }
        a17.v();
        return true;
    }
}

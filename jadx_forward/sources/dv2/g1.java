package dv2;

/* loaded from: classes2.dex */
public final class g1 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv2.j1 f325389d;

    public g1(dv2.j1 j1Var) {
        this.f325389d = j1Var;
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        dv2.j1 j1Var = this.f325389d;
        if (!(i17 >= 0 && i17 < j1Var.f325411h.size())) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00 O6 = dv2.j1.O6(j1Var);
        java.lang.Object obj = j1Var.f325411h.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        O6.U6(view, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz) obj, i17, 0);
        return true;
    }
}

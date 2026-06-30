package rf2;

/* loaded from: classes10.dex */
public final class p1 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f476385d;

    public p1(rf2.c2 c2Var) {
        this.f476385d = c2Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        yz5.r rVar = this.f476385d.f476219h;
        if (rVar != null) {
            ((rf2.x1) rVar).C(adapter, view, java.lang.Integer.valueOf(i17), holder);
        }
    }
}

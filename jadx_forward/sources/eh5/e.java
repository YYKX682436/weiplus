package eh5;

/* loaded from: classes14.dex */
public final class e implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractActivityC22432xeb4f0b3b f334491a;

    public e(com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractActivityC22432xeb4f0b3b abstractActivityC22432xeb4f0b3b) {
        this.f334491a = abstractActivityC22432xeb4f0b3b;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View view, n3.g3 insets) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractActivityC22432xeb4f0b3b abstractActivityC22432xeb4f0b3b = this.f334491a;
        if (abstractActivityC22432xeb4f0b3b.mo78538xecd98af8()) {
            return n3.g3.f415870b;
        }
        abstractActivityC22432xeb4f0b3b.f290476r = insets;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 d17 = abstractActivityC22432xeb4f0b3b.X6().d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getImmersiveBaseActivity(...)");
        n3.t1 t1Var = new n3.t1(d17);
        while (t1Var.hasNext()) {
            android.view.View view2 = (android.view.View) t1Var.next();
            if (view2 != abstractActivityC22432xeb4f0b3b.X6().a()) {
                n3.l1.b(view2, insets);
            }
        }
        abstractActivityC22432xeb4f0b3b.U6();
        return n3.g3.f415870b;
    }
}

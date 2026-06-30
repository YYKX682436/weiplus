package xt2;

/* loaded from: classes3.dex */
public final class v3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xt2.z3 f538608a;

    public v3(xt2.z3 z3Var) {
        this.f538608a = z3Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: getMovementFlags */
    public int mo8119x457acf62(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 p07, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        tt2.e eVar = (tt2.e) kz5.n0.a0(this.f538608a.f538683q.f503467h, p17.m8183xf806b362());
        so2.j5 j5Var = eVar != null ? eVar.f503405a : null;
        return ((j5Var instanceof cm2.m0) && ((cm2.m0) j5Var).f124901v.m75939xb282bd08(42) == 10) ? p012xc85e97e9.p103xe821e364.p104xd1075a44.a1.m8110x3388cfca(0, 0) : p012xc85e97e9.p103xe821e364.p104xd1075a44.a1.m8110x3388cfca(3, 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: isItemViewSwipeEnabled */
    public boolean mo8126x5b4a2f69() {
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onMove */
    public boolean mo8132xc39cb650(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 source, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        int m8183xf806b362 = source.m8183xf806b362();
        int m8183xf806b3622 = target.m8183xf806b362();
        xt2.z3 z3Var = this.f538608a;
        tt2.i iVar = z3Var.f538683q;
        iVar.getClass();
        try {
            java.util.Collections.swap(iVar.f503467h, m8183xf806b362, m8183xf806b3622);
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "FinderLiveShoppingEditAdapter,moveProductItem:");
        }
        z3Var.f538683q.m8150x87567217(m8183xf806b362, m8183xf806b3622);
        zl2.r4.f555483a.M2(z3Var.f538677h, "onMove from:" + m8183xf806b362 + " - to:" + m8183xf806b3622);
        tt2.i iVar2 = z3Var.f538683q;
        iVar2.m8152xc67946d3(0, iVar2.mo1894x7e414b06(), 1);
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSwiped */
    public void mo8135x59f07f29(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }
}

package in2;

/* loaded from: classes10.dex */
public final class s0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in2.v0 f374430a;

    public s0(in2.v0 v0Var) {
        this.f374430a = v0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: clearView */
    public void mo8113xb4407692(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        super.mo8113xb4407692(recyclerView, viewHolder);
        zl2.r4.f555483a.M2(this.f374430a.f374446J, "clearView pos:" + viewHolder.m8183xf806b362());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: getMovementFlags */
    public int mo8119x457acf62(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 p07, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        if (this.f374430a.e0()) {
            return 0;
        }
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.a1.m8110x3388cfca(3, 0);
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
        in2.v0 v0Var = this.f374430a;
        if (!v0Var.e0()) {
            int m8183xf806b362 = source.m8183xf806b362();
            int m8183xf806b3622 = target.m8183xf806b362();
            zl2.r4.f555483a.M2(v0Var.f374446J, "onMove from:" + m8183xf806b362 + " - to:" + m8183xf806b3622);
            in2.q0 q0Var = v0Var.S;
            java.util.ArrayList arrayList = q0Var.f374413f;
            dk2.yg ygVar = (dk2.yg) kz5.n0.a0(arrayList, m8183xf806b362);
            boolean z17 = false;
            if (ygVar != null && ygVar.a()) {
                dk2.yg ygVar2 = (dk2.yg) kz5.n0.a0(arrayList, m8183xf806b3622);
                if (ygVar2 != null && ygVar2.a()) {
                    try {
                        java.util.Collections.swap(arrayList, m8183xf806b362, m8183xf806b3622);
                    } catch (java.lang.Exception e17) {
                        hc2.c.a(e17, q0Var.f374412e + ",movesongItem:");
                    }
                    z17 = true;
                }
            }
            if (z17) {
                v0Var.S.m8150x87567217(m8183xf806b362, m8183xf806b3622);
            }
        }
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSwiped */
    public void mo8135x59f07f29(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }
}

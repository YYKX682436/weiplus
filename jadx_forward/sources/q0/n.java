package q0;

/* loaded from: classes16.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2724x335620.uic.p2726x2e06d1.C22461xc35960ab C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2726x2e06d1.C22461xc35960ab c22461xc35960ab) {
        super(1);
        this.C = c22461xc35960ab;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.t0 t0Var;
        j75.e eVar;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2726x2e06d1.C22461xc35960ab c22461xc35960ab = this.C;
        android.view.ViewGroup.LayoutParams layoutParams = ((em.l2) ((jz5.n) c22461xc35960ab.B6).mo141623x754a37bb()).k().getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i65.a.b(c22461xc35960ab.m158354x19263085(), 0);
        }
        ((em.l2) ((jz5.n) c22461xc35960ab.B6).mo141623x754a37bb()).k().setLayoutParams(layoutParams);
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.t0) && (eVar = (t0Var = (wi5.t0) dVar).f379600a) != null && (eVar instanceof wi5.w0)) {
            if (((wi5.w0) eVar).f527891b == wi5.u0.f527878d) {
                java.util.LinkedList linkedList = state.f527852o;
                c22461xc35960ab.f290790z6 = new java.util.ArrayList(linkedList);
                if (t0Var.f527876d != 7) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5984x6d192cd2 c5984x6d192cd2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5984x6d192cd2();
                    c5984x6d192cd2.f136279m.f359303a = new java.util.ArrayList(linkedList);
                    c5984x6d192cd2.e();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}

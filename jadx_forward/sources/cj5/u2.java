package cj5;

/* loaded from: classes.dex */
public final class u2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.w2 f123782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(cj5.w2 w2Var) {
        super(1);
        this.f123782d = w2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        cj5.w2 w2Var = this.f123782d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = w2Var.U6().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
        if (a17 != null) {
            a17.z(new cj5.n2(state));
        }
        if (((wi5.t0) state.a(wi5.t0.class)) != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k18 = w2Var.U6().k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k18, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a18 = xm3.u0.a(k18);
            if (a18 != null) {
                a18.z(new cj5.o2(state));
            }
        }
        if (((wi5.x0) state.a(wi5.x0.class)) != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k19 = w2Var.U6().k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k19, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a19 = xm3.u0.a(k19);
            if (a19 != null) {
                a19.z(new cj5.p2(state));
            }
        }
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.a1)) {
            wi5.a1 a1Var = (wi5.a1) dVar;
            android.view.ViewGroup.LayoutParams layoutParams = w2Var.U6().k().getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = a1Var.f527812b;
            }
            w2Var.U6().k().setLayoutParams(layoutParams);
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.k0)) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k27 = w2Var.U6().k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k27, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a27 = xm3.u0.a(k27);
            if (a27 != null) {
                a27.z(new cj5.q2(state));
            }
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof wi5.m0)) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k28 = w2Var.U6().k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k28, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a28 = xm3.u0.a(k28);
            if (a28 != null) {
                a28.z(new cj5.r2(state));
            }
        }
        j75.d dVar4 = state.f379599d;
        if (dVar4 != null && (dVar4 instanceof wi5.j0)) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k29 = w2Var.U6().k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k29, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a29 = xm3.u0.a(k29);
            if (a29 != null) {
                a29.z(new cj5.s2(state));
            }
        }
        j75.d dVar5 = state.f379599d;
        if (dVar5 != null && (dVar5 instanceof wi5.r)) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k37 = w2Var.U6().k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k37, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a37 = xm3.u0.a(k37);
            if (a37 != null) {
                a37.z(new cj5.t2(state));
            }
        }
        return jz5.f0.f384359a;
    }
}

package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class t extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f290898d;

    /* renamed from: e, reason: collision with root package name */
    public rl5.r f290899e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f290900f;

    /* renamed from: g, reason: collision with root package name */
    public em.k2 f290901g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f290902h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f290903i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f290898d = new java.util.ArrayList();
        this.f290902h = new java.util.ArrayList();
    }

    public static final void T6(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t tVar, java.lang.String str, int i17) {
        android.widget.TextView textView;
        b95.j Ai;
        tVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3 c16508x1e702dd3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class);
        if (c16508x1e702dd3 != null && (Ai = c16508x1e702dd3.Ai()) != null) {
            Ai.a(str);
        }
        java.util.ArrayList arrayList = tVar.f290898d;
        arrayList.remove(i17);
        tVar.f290902h.remove(i17);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = tVar.f290900f;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8146xced61ae5();
        }
        rl5.r rVar = tVar.f290899e;
        if (rVar != null) {
            rVar.a();
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.t8.a(arrayList)) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = tVar.f290900f;
        android.widget.LinearLayout linearLayout = null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 b07 = c22848x6ddd90cf2 != null ? c22848x6ddd90cf2.b0() : null;
        if (b07 != null) {
            b07.setVisibility(8);
        }
        em.k2 k2Var = tVar.f290901g;
        if (k2Var != null) {
            if (k2Var.f336035b == null) {
                k2Var.f336035b = (android.widget.TextView) k2Var.f336034a.findViewById(com.p314xaae8f345.mm.R.id.gze);
            }
            textView = k2Var.f336035b;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setVisibility(8);
        }
        em.k2 k2Var2 = tVar.f290901g;
        if (k2Var2 != null) {
            if (k2Var2.f336036c == null) {
                k2Var2.f336036c = (android.widget.LinearLayout) k2Var2.f336034a.findViewById(com.p314xaae8f345.mm.R.id.m7p);
            }
            linearLayout = k2Var2.f336036c;
        }
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    public static final void U6(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t tVar) {
        if (tVar.f290903i) {
            tVar.X6(false);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = tVar.f290900f;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8146xced61ae5();
            }
        }
    }

    public final void V6(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        for (com.p314xaae8f345.mm.ui.p2690x38b72420.v8 v8Var : this.f290898d) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v8Var.f288753d.f288764a, userName)) {
                v8Var.f288753d.f288766c = !r1.f288766c;
            }
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f290900f;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8146xced61ae5();
        }
    }

    public final void W6(wi5.n0 state) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentForwardListViewUIC", "updateMultiSelectStatus " + state.e());
        java.util.Iterator it = this.f290898d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.v8 v8Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.v8) it.next();
            v8Var.f288753d.f288767d = state.e();
            java.util.LinkedList linkedList = state.f527852o;
            com.p314xaae8f345.mm.ui.p2690x38b72420.w8 w8Var = v8Var.f288753d;
            w8Var.f288766c = linkedList.contains(w8Var.f288764a);
        }
        if (state.e()) {
            X6(false);
        }
        em.k2 k2Var = this.f290901g;
        if (k2Var != null) {
            if (k2Var.f336037d == null) {
                k2Var.f336037d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) k2Var.f336034a.findViewById(com.p314xaae8f345.mm.R.id.llt);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = k2Var.f336037d;
            if (c1163xf1deaba4 == null || (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) == null) {
                return;
            }
            mo7946xf939df19.m8146xced61ae5();
        }
    }

    public final void X6(boolean z17) {
        this.f290903i = z17;
        java.util.Iterator it = this.f290898d.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2690x38b72420.v8) it.next()).f288753d.f288768e = z17;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        S6(new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.p(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.q(this));
    }
}

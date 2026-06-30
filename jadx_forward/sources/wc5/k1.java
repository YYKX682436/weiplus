package wc5;

/* loaded from: classes10.dex */
public final class k1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f526124d;

    /* renamed from: e, reason: collision with root package name */
    public int f526125e;

    /* renamed from: f, reason: collision with root package name */
    public kn5.e f526126f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f526127g;

    /* renamed from: h, reason: collision with root package name */
    public final kn5.a f526128h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f526129i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f526130m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 baseActivity) {
        super(baseActivity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseActivity, "baseActivity");
        this.f526124d = baseActivity;
        this.f526128h = new wc5.z0(this);
        this.f526129i = new wc5.g1(this);
        this.f526130m = new wc5.f1(this);
    }

    public static final void T6(wc5.k1 k1Var, xm3.t0 t0Var, uc5.c cVar) {
        int u07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe l76;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m76 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) k1Var.V6()).m7();
        int mo1894x7e414b06 = t0Var.mo1894x7e414b06();
        java.util.Iterator it = t0Var.I.f233598o.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            uc5.l0 l0Var = (uc5.l0) it.next();
            uc5.h0 h0Var = l0Var instanceof uc5.h0 ? (uc5.h0) l0Var : null;
            if (h0Var != null) {
                uc5.d dVar = h0Var.f508027d;
                dVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<set-?>");
                dVar.f508009d = cVar;
            }
        }
        if (!((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) k1Var.V6()).q7() && (l76 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) k1Var.V6()).l7()) != null) {
            l76.d(new wc5.i1(cVar));
        }
        m76.m7957x4145728();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m76.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager : null;
        int i17 = c1161x57298f5d != null ? c1161x57298f5d.f93394w : 1;
        int i18 = (i17 + 2) * i17;
        int childCount = m76.getChildCount();
        int i19 = Integer.MAX_VALUE;
        int i27 = Integer.MIN_VALUE;
        for (int i28 = 0; i28 < childCount; i28++) {
            android.view.View childAt = m76.getChildAt(i28);
            if (childAt != null && (u07 = m76.u0(childAt)) != -1) {
                if (u07 < i19) {
                    i19 = u07;
                }
                if (u07 > i27) {
                    i27 = u07;
                }
            }
        }
        if (i19 <= i27) {
            int i29 = i19 - i18;
            int i37 = i29 >= 0 ? i29 : 0;
            int i38 = i27 + i18;
            int i39 = mo1894x7e414b06 - 1;
            if (i38 > i39) {
                i38 = i39;
            }
            t0Var.m8152xc67946d3(i37, (i38 - i37) + 1, "state_update");
        }
    }

    public final java.util.List U6() {
        java.util.List<uc5.l0> m82898xfb7e5820;
        xm3.t0 b17 = xm3.u0.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) V6()).m7());
        if (b17 == null || (m82898xfb7e5820 = b17.m82898xfb7e5820()) == null) {
            return kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (uc5.l0 l0Var : m82898xfb7e5820) {
            uc5.h0 h0Var = l0Var instanceof uc5.h0 ? (uc5.h0) l0Var : null;
            uc5.d dVar = h0Var != null ? h0Var.f508027d : null;
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            uc5.c cVar = ((uc5.d) obj).f508009d;
            if ((cVar instanceof uc5.b) && ((uc5.b) cVar).f508004a) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final uc5.r V6() {
        android.view.LayoutInflater.Factory factory = this.f526124d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(factory, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryController");
        return (uc5.r) factory;
    }

    public final void W6(java.lang.String uniqueId, uc5.c newState) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe l76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueId, "uniqueId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        xm3.t0 b17 = xm3.u0.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) V6()).m7());
        if (b17 == null) {
            return;
        }
        uc5.c cVar = null;
        for (uc5.l0 l0Var : b17.I.f233598o) {
            uc5.h0 h0Var = l0Var instanceof uc5.h0 ? (uc5.h0) l0Var : null;
            if (h0Var != null) {
                uc5.d dVar = h0Var.f508027d;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.v(), uniqueId)) {
                    if (cVar == null) {
                        cVar = dVar.f508009d;
                    }
                    dVar.getClass();
                    dVar.f508009d = newState;
                }
            }
        }
        if (!((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) V6()).q7() && (l76 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) V6()).l7()) != null) {
            l76.d(new wc5.j1(uniqueId, newState));
        }
        if (cVar != null) {
            int i17 = (((newState instanceof uc5.b) && ((uc5.b) newState).f508004a) ? 1 : 0) - (((cVar instanceof uc5.b) && ((uc5.b) cVar).f508004a) ? 1 : 0);
            if (i17 != 0) {
                this.f526125e += i17;
                X6();
            }
        }
    }

    public final void X6() {
        com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b W6 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) V6()).W6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3.class);
        if (!(W6 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3)) {
            W6 = null;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3 c21816x74d192a3 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21816x74d192a3) W6;
        if (c21816x74d192a3 == null) {
            return;
        }
        c21816x74d192a3.m79664xeba9eec0(this.f526125e);
        com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b W62 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) V6()).W6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21820xe15c1941.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21820xe15c1941 c21820xe15c1941 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21820xe15c1941) (W62 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21820xe15c1941 ? W62 : null);
        if (c21820xe15c1941 == null) {
            return;
        }
        c21820xe15c1941.m79685x72265582(this.f526125e > 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        kn5.e eVar = this.f526126f;
        if (eVar != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) V6()).m7().U0(eVar);
        }
        this.f526126f = null;
        super.mo13982x7cf2e371();
    }
}

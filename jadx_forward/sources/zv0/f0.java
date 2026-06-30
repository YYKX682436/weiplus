package zv0;

/* loaded from: classes5.dex */
public final class f0 extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.l {

    /* renamed from: J, reason: collision with root package name */
    public yz5.a f557707J;
    public yz5.p K;
    public yz5.l L;
    public yz5.a M;
    public final jz5.g N;
    public final jz5.g P;
    public final jz5.g Q;
    public final jz5.g R;
    public zv0.r S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(android.content.Context context, ex0.r focusedSegmentVM) {
        super(context, focusedSegmentVM);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusedSegmentVM, "focusedSegmentVM");
        this.N = jz5.h.b(new zv0.e0(this));
        this.P = jz5.h.b(new zv0.d0(this));
        this.Q = jz5.h.b(new zv0.b0(this));
        this.R = jz5.h.b(new zv0.z(this));
        zv0.r rVar = zv0.r.f557753d;
        this.S = zv0.r.f557753d;
    }

    public static final void K(zv0.f0 f0Var, int i17, zv0.r rVar) {
        yz5.p pVar;
        f0Var.getClass();
        if (rVar.f557756c) {
            zu0.i iVar = zu0.i.f557210g;
            zu0.i iVar2 = rVar.f557755b;
            if (iVar2 != iVar && iVar2 != zu0.i.f557209f) {
                return;
            }
        }
        ex0.j0 m179692x694d681f = f0Var.m179692x694d681f();
        if (m179692x694d681f == null || (pVar = f0Var.K) == null) {
            return;
        }
        pVar.mo149xb9724478(rVar, m179692x694d681f);
    }

    /* renamed from: getApplyToAllButton */
    private final android.view.View m179688x8b0bf720() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.R).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    /* renamed from: getLoadingView */
    private final android.view.View m179689xcc04d8cb() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.Q).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    /* renamed from: getTransitionAdapter */
    private final zv0.q m179690x6e1d9b84() {
        return (zv0.q) ((jz5.n) this.P).mo141623x754a37bb();
    }

    /* renamed from: getTransitionRv */
    private final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m179691x990808ef() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.N).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb;
    }

    /* renamed from: getTransitionSegmentVM */
    private final ex0.j0 m179692x694d681f() {
        ex0.r m47093x8ee49ae9 = m47093x8ee49ae9();
        if (m47093x8ee49ae9 instanceof ex0.j0) {
            return (ex0.j0) m47093x8ee49ae9;
        }
        return null;
    }

    @Override // qv0.f
    public boolean D() {
        return true;
    }

    public final void L(zv0.g0 selectedPack) {
        zv0.q m179690x6e1d9b84 = m179690x6e1d9b84();
        m179690x6e1d9b84.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedPack, "selectedPack");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = m179690x6e1d9b84.f357503d;
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            zv0.r rVar = (zv0.r) obj;
            if (rVar.f557756c) {
                linkedHashMap.put(java.lang.Integer.valueOf(i17), zv0.r.a(rVar, null, null, false, 3, null));
            }
            i17 = i18;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            zv0.r rVar2 = (zv0.r) linkedHashMap.get(java.lang.Integer.valueOf(intValue));
            if (rVar2 != null) {
                arrayList.set(intValue, rVar2);
                m179690x6e1d9b84.m8147xed6e4d18(intValue);
            }
        }
        int i19 = selectedPack.f557711b;
        zv0.r rVar3 = (zv0.r) kz5.n0.a0(arrayList, i19);
        if (rVar3 != null) {
            m179690x6e1d9b84.x(i19, zv0.r.a(rVar3, null, null, true, 3, null));
        }
        if (rVar3 != null) {
            dy0.o.b(m179691x990808ef(), selectedPack.f557711b, false, 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dlw, bodyContainerLayout);
    }

    /* renamed from: getOnApplyToAllButtonClicked */
    public final yz5.l m179693x2c77c188() {
        return this.L;
    }

    /* renamed from: getOnAttached */
    public final yz5.a m179694xb3775899() {
        return this.f557707J;
    }

    /* renamed from: getOnClosed */
    public final yz5.a m179695xb9e4f5a1() {
        return this.M;
    }

    /* renamed from: getOnTransitionSelected */
    public final yz5.p m179696xc1090bc5() {
        return this.K;
    }

    /* renamed from: getSelectedTransitionInfo */
    public final zv0.r m179697xa3329e14() {
        return this.S;
    }

    @Override // qv0.f
    /* renamed from: getToolbarTitle */
    public java.lang.String mo11426x7c1b2e13() {
        java.lang.String string = j65.q.a(getContext()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.m1p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.l, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void p() {
        super.p();
        m179691x990808ef().setVisibility(8);
        android.view.View m179688x8b0bf720 = m179688x8b0bf720();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m179688x8b0bf720, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m179688x8b0bf720.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m179688x8b0bf720, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View m179689xcc04d8cb = m179689xcc04d8cb();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m179689xcc04d8cb, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m179689xcc04d8cb.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(m179689xcc04d8cb, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yz5.a aVar = this.f557707J;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void s() {
        yz5.a aVar = this.M;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    /* renamed from: setInitTransitionInfo */
    public final void m179698x7c6f8cd5(zv0.r initTransitionInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initTransitionInfo, "initTransitionInfo");
        this.S = initTransitionInfo;
    }

    /* renamed from: setOnApplyToAllButtonClicked */
    public final void m179699x764419fc(yz5.l lVar) {
        this.L = lVar;
    }

    /* renamed from: setOnAttached */
    public final void m179700xe19ba6a5(yz5.a aVar) {
        this.f557707J = aVar;
    }

    /* renamed from: setOnClosed */
    public final void m179701xb49d56ad(yz5.a aVar) {
        this.M = aVar;
    }

    /* renamed from: setOnTransitionSelected */
    public final void m179702x3b5c3ad1(yz5.p pVar) {
        this.K = pVar;
    }

    /* renamed from: setSelectedTransitionInfo */
    public final void m179703xd5763a20(zv0.r rVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rVar, "<set-?>");
        this.S = rVar;
    }

    /* renamed from: setTransitionUiState */
    public final void m179704x7374c706(zv0.h0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        zv0.n0 n0Var = state.f557716c;
        boolean z17 = n0Var instanceof zv0.j0;
        zv0.g0 g0Var = state.f557715b;
        if (!z17) {
            if (n0Var instanceof zv0.m0) {
                L(g0Var);
                return;
            }
            if (n0Var instanceof zv0.k0) {
                zv0.k0 k0Var = (zv0.k0) n0Var;
                m179690x6e1d9b84().z(k0Var.f557728a, k0Var.f557729b);
                return;
            } else {
                if (n0Var instanceof zv0.l0) {
                    L(g0Var);
                    zv0.l0 l0Var = (zv0.l0) n0Var;
                    m179690x6e1d9b84().z(l0Var.f557734a, l0Var.f557735b);
                    return;
                }
                return;
            }
        }
        m179690x6e1d9b84().y(state.f557714a);
        L(g0Var);
        m179691x990808ef().setVisibility(0);
        android.view.View m179688x8b0bf720 = m179688x8b0bf720();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m179688x8b0bf720, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m179688x8b0bf720.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m179688x8b0bf720, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View m179689xcc04d8cb = m179689xcc04d8cb();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m179689xcc04d8cb, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m179689xcc04d8cb.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(m179689xcc04d8cb, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void u(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        android.content.res.Resources a17 = j65.q.a(getContext());
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m179691x990808ef = m179691x990808ef();
        m179691x990808ef.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(m179691x990808ef.getContext(), 0, false));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = m179691x990808ef.m7949x5701d990();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 o3Var = m7949x5701d990 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.o3) m7949x5701d990 : null;
        if (o3Var != null) {
            o3Var.f93715g = false;
        }
        m179691x990808ef.N(new lv0.c(a17.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), a17.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), a17.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, 0, lv0.f.f403022f, 24, null));
        m179691x990808ef.mo7960x6cab2c8d(m179690x6e1d9b84());
        m179688x8b0bf720().setOnClickListener(new zv0.a0(this));
    }
}

package pv0;

/* loaded from: classes5.dex */
public final class m extends qv0.f {
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f440070J;
    public final jz5.g K;
    public pv0.i L;
    public boolean M;
    public boolean N;
    public java.lang.String P;
    public pv0.j Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.K = jz5.h.b(new pv0.l(this));
        this.M = true;
        this.P = "";
        this.Q = pv0.j.f440065d;
    }

    public static final void K(pv0.m mVar, int i17, dw0.c cVar) {
        java.lang.Object obj;
        java.util.Iterator it = mVar.m159064x30e4a5c().f357503d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((dw0.c) obj).f325622d) {
                    break;
                }
            }
        }
        dw0.c cVar2 = (dw0.c) obj;
        if (cVar.f325622d) {
            if (cVar.f325621c != zu0.i.f557210g) {
                return;
            }
        }
        pv0.i iVar = mVar.L;
        if (iVar != null) {
            ((pv0.w) iVar).a(cVar2, cVar, mVar.Q);
        }
    }

    /* renamed from: getTimbreAdapter */
    private final cw0.b1 m159064x30e4a5c() {
        return (cw0.b1) ((jz5.n) this.K).mo141623x754a37bb();
    }

    @Override // qv0.f
    public boolean D() {
        return this.N;
    }

    public final void L(dw0.e selectedPack) {
        cw0.b1 m159064x30e4a5c = m159064x30e4a5c();
        m159064x30e4a5c.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedPack, "selectedPack");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = m159064x30e4a5c.f357503d;
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            dw0.c cVar = (dw0.c) obj;
            if (cVar.f325622d) {
                linkedHashMap.put(java.lang.Integer.valueOf(i17), dw0.c.a(cVar, null, null, null, false, 7, null));
            }
            i17 = i18;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            dw0.c cVar2 = (dw0.c) linkedHashMap.get(java.lang.Integer.valueOf(intValue));
            if (cVar2 != null) {
                arrayList.set(intValue, cVar2);
                m159064x30e4a5c.m8147xed6e4d18(intValue);
            }
        }
        int i19 = selectedPack.f325627b;
        dw0.c cVar3 = (dw0.c) kz5.n0.a0(arrayList, i19);
        if (cVar3 != null) {
            m159064x30e4a5c.x(i19, dw0.c.a(cVar3, null, null, null, true, 7, null));
        }
        if (cVar3 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.I;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timbreRv");
                throw null;
            }
            dy0.o.b(c1163xf1deaba4, selectedPack.f325627b, false, 2, null);
        }
    }

    public final void M(dw0.d state) {
        pv0.i iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        state.m126321x9616526c();
        dw0.l lVar = state.f325625c;
        boolean z17 = lVar instanceof dw0.h;
        java.lang.Object obj = null;
        java.util.List list = state.f325623a;
        dw0.e eVar = state.f325624b;
        if (z17) {
            m159064x30e4a5c().y(list);
            L(eVar);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.I;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timbreRv");
                throw null;
            }
            c1163xf1deaba4.setVisibility(0);
            android.view.View view = this.f440070J;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/timbre/TimbrePanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/timbre/TimbrePanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (lVar instanceof dw0.k) {
            L(eVar);
            return;
        }
        if (lVar instanceof dw0.i) {
            dw0.i iVar2 = (dw0.i) lVar;
            m159064x30e4a5c().z(iVar2.f325630a, iVar2.f325631b);
            return;
        }
        if (lVar instanceof dw0.j) {
            L(eVar);
            dw0.j jVar = (dw0.j) lVar;
            m159064x30e4a5c().z(jVar.f325632a, jVar.f325633b);
            dw0.c cVar = (dw0.c) kz5.n0.a0(list, eVar.f325627b);
            if (cVar == null || !isShown() || (iVar = this.L) == null) {
                return;
            }
            pv0.w wVar = (pv0.w) iVar;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = cVar.f325620b;
            if (c4190xd8dd3713 == null) {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                c4190xd8dd3713 = null;
            }
            if (c4190xd8dd3713 == null) {
                return;
            }
            java.lang.Object obj2 = wVar.f440089a.f440097r.get(c4190xd8dd3713.C());
            if (obj2 == null) {
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            } else {
                obj = obj2;
            }
            pv0.g gVar = (pv0.g) obj;
            if (gVar == null) {
                return;
            }
            pv0.n nVar = (pv0.n) gVar.f440053a;
            nVar.getClass();
            if (nVar.f440072b.f440098s.f440074b) {
                return;
            }
            nVar.f440071a.d(cVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.djq, bodyContainerLayout);
    }

    /* renamed from: getTimbrePanelArgs$plugin_mj_template_release */
    public final pv0.h m159065x3fab8e2e() {
        return (pv0.h) com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6.k(this, "KEY_TIMBRE_ARGS", null, 2, null);
    }

    @Override // qv0.f
    /* renamed from: getToolbarTitle */
    public java.lang.String mo11426x7c1b2e13() {
        return this.P;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void p() {
        pv0.h m159065x3fab8e2e = m159065x3fab8e2e();
        if (m159065x3fab8e2e == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            m159065x3fab8e2e = null;
        }
        if (m159065x3fab8e2e == null) {
            return;
        }
        this.M = m159065x3fab8e2e.f440063f;
        this.N = m159065x3fab8e2e.f440064g;
        this.P = m159065x3fab8e2e.f440060c;
        this.Q = m159065x3fab8e2e.f440061d;
        m159065x3fab8e2e.m159060x9616526c();
        G();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.I;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timbreRv");
            throw null;
        }
        c1163xf1deaba4.setVisibility(8);
        android.view.View view = this.f440070J;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/timbre/TimbrePanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/timbre/TimbrePanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: setTimbreCallback */
    public final void m159066x6a45c2e4(pv0.i callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.L = callback;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void u(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.e4u);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById).m7949x5701d990();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 o3Var = m7949x5701d990 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.o3) m7949x5701d990 : null;
        if (o3Var != null) {
            o3Var.f93715g = false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "apply(...)");
        this.I = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.hmo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f440070J = findViewById2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.I;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timbreRv");
            throw null;
        }
        c1163xf1deaba4.mo7960x6cab2c8d(m159064x30e4a5c());
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.I;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timbreRv");
            throw null;
        }
        c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext(), 0, false));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.I;
        if (c1163xf1deaba43 != null) {
            c1163xf1deaba43.N(new uv0.a(i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8)));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timbreRv");
            throw null;
        }
    }
}

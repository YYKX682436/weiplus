package uv0;

/* loaded from: classes5.dex */
public final class u extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.l {

    /* renamed from: J, reason: collision with root package name */
    public vv0.k f512884J;
    public float K;
    public boolean L;
    public android.view.ViewGroup M;
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10956x6271c3cc N;
    public android.widget.TextView P;
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff Q;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 R;
    public android.view.View S;
    public android.view.View T;
    public uv0.i U;
    public final jz5.g V;
    public final java.util.ArrayList W;

    /* renamed from: p0, reason: collision with root package name */
    public final uv0.r f512885p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, ex0.r focusedSegmentVM) {
        super(context, focusedSegmentVM);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusedSegmentVM, "focusedSegmentVM");
        vv0.k kVar = vv0.k.f521916f;
        this.f512884J = vv0.k.f521916f;
        this.K = 1.0f;
        this.V = jz5.h.b(new uv0.l(this));
        this.W = new java.util.ArrayList();
        this.f512885p0 = new uv0.r(this);
    }

    public static final void L(uv0.u uVar, int i17, vv0.k kVar) {
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4108x6d452a1d c4108x6d452a1d;
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb2;
        java.lang.Object obj;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2;
        uVar.getClass();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar, vv0.k.f521917g)) {
            return;
        }
        vv0.k filterInfo = i17 == 0 ? vv0.k.f521916f : kVar;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uVar.f512884J.f521918a, kVar.f521918a)) {
            uVar.K = 1.0f;
            uVar.J();
            uv0.i iVar = uVar.U;
            if (iVar != null) {
                float f17 = uVar.K;
                uv0.h hVar = (uv0.h) iVar;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = hVar.f512868c.f338700a;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
                if (c4181x2248e1a3 != null && (D2 = c4181x2248e1a3.D()) != null) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.G0(c4181x2248e1a3, f17, D2);
                }
                hVar.f512867b.p7().c7();
            }
            uVar.m170582xf939df19().x(i17, filterInfo);
            uv0.i iVar2 = uVar.U;
            if (iVar2 != null) {
                uv0.h hVar2 = (uv0.h) iVar2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterInfo, "filterInfo");
                rv0.n1 n1Var = hVar2.f512867b;
                du0.v0 R6 = n1Var.R6();
                R6.getClass();
                java.lang.String filterID = filterInfo.f521918a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterID, "filterID");
                yy0.m7 m7Var = (yy0.m7) R6.O6();
                m7Var.getClass();
                p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.e4(m7Var, filterID, null), 3, null);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(filterInfo, vv0.k.f521916f)) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd37132 = hVar2.f512868c.f338700a;
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a32 = c4190xd8dd37132 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd37132 : null;
                    if (c4181x2248e1a32 != null && (D = c4181x2248e1a32.D()) != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.k1(c4181x2248e1a32, "", D);
                    }
                    n1Var.p7().c7();
                } else {
                    vv0.c cVar = (vv0.c) n1Var.m7().f96015d.mo3195x754a37bb();
                    if (cVar != null && (c4108x6d452a1d = cVar.f521906a) != null) {
                        java.util.Iterator it = ((java.util.ArrayList) c4108x6d452a1d.a()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                c4104x6d422cb2 = null;
                                break;
                            }
                            java.util.Iterator it6 = ((java.util.ArrayList) ((com.p314xaae8f345.p457x3304c6.p476x11d36527.C4103x6aa7e302) it.next()).a()).iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    obj = null;
                                    break;
                                } else {
                                    obj = it6.next();
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2) obj).f129757b, filterID)) {
                                        break;
                                    }
                                }
                            }
                            c4104x6d422cb2 = (com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2) obj;
                            if (c4104x6d422cb2 != null) {
                                break;
                            }
                        }
                        if (c4104x6d422cb2 != null) {
                            aw0.f m76 = n1Var.m7();
                            vv0.b bVar = vv0.b.f521904d;
                            vv0.a aVar = new vv0.a(c4104x6d422cb2, filterInfo.f521922e);
                            m76.getClass();
                            p3325xe03a0797.p3326xc267989b.l.d(m76.f96013b, null, null, new aw0.d(aVar, m76, bVar, null), 3, null);
                        }
                    }
                }
            }
        }
        uVar.m170583x20fa9543(filterInfo);
        uVar.m170582xf939df19().z(filterInfo);
        uVar.P(filterInfo.f521921d);
        uVar.post(new uv0.t(uVar));
    }

    public static final void M(uv0.u uVar) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = uVar.R;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4 != null ? c1163xf1deaba4.getLayoutManager() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null) {
            return;
        }
        int t17 = (c1162x665295de.t() + c1162x665295de.x()) / 2;
        vv0.k kVar = (vv0.k) kz5.n0.a0(uVar.m170582xf939df19().f357503d, t17);
        if (kVar == null) {
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kVar.f521918a, vv0.k.f521917g.f521918a) && (kVar = (vv0.k) kz5.n0.a0(uVar.m170582xf939df19().f357503d, t17 + 1)) == null) {
            vv0.k kVar2 = (vv0.k) kz5.n0.a0(uVar.m170582xf939df19().f357503d, t17 - 1);
            if (kVar2 == null) {
                kVar2 = vv0.k.f521916f;
            }
            kVar = kVar2;
        }
        uVar.P(kVar.f521921d);
    }

    public static final void N(uv0.u uVar, int i17) {
        uVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FilterPanel", "smoothScrollToCenter: index " + i17);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = uVar.R;
        if (c1163xf1deaba4 != null) {
            dy0.o.a(c1163xf1deaba4, i17, true);
        }
    }

    public static final void O(uv0.u uVar, float f17) {
        uVar.getClass();
        if (java.lang.Float.compare(f17, 0) == 0) {
            android.widget.TextView textView = uVar.P;
            if (textView == null) {
                return;
            }
            textView.setText("0");
            return;
        }
        android.widget.TextView textView2 = uVar.P;
        if (textView2 == null) {
            return;
        }
        java.lang.String format = java.lang.String.format("%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) (f17 * 100))}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        textView2.setText(format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAdapter */
    public final uv0.f m170582xf939df19() {
        return (uv0.f) ((jz5.n) this.V).mo141623x754a37bb();
    }

    /* renamed from: setSelectedFilterInfo */
    private final void m170583x20fa9543(vv0.k kVar) {
        this.f512884J = kVar;
        post(new uv0.t(this));
    }

    public final void P(int i17) {
        oa.i k17;
        java.util.Iterator it = this.W.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            } else {
                if (((vv0.j) it.next()).f521915b == i17) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        if (i18 < 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FilterPanel", "selectTab: tabIndex " + i18);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.Q;
        if (c2718xca2902ff == null || (k17 = c2718xca2902ff.k(i18)) == null) {
            return;
        }
        k17.b();
    }

    public final void Q(java.util.List categories, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categories, "categories");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.W;
        arrayList2.clear();
        vv0.k kVar = vv0.k.f521916f;
        arrayList.add(vv0.k.f521916f);
        java.util.Iterator it = categories.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p457x3304c6.p476x11d36527.C4103x6aa7e302 c4103x6aa7e302 = (com.p314xaae8f345.p457x3304c6.p476x11d36527.C4103x6aa7e302) it.next();
            if (!c4103x6aa7e302.a().isEmpty()) {
                java.lang.String str2 = c4103x6aa7e302.f129753c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getCategoryName(...)");
                arrayList2.add(new vv0.j(str2, c4103x6aa7e302.f129752b));
                vv0.k kVar2 = vv0.k.f521916f;
                arrayList.add(vv0.k.f521917g);
                for (com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb2 : c4103x6aa7e302.a()) {
                    java.lang.String str3 = c4104x6d422cb2.f129757b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getMaterialID(...)");
                    java.lang.String str4 = c4104x6d422cb2.f129759d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getMaterialName(...)");
                    java.lang.String str5 = c4104x6d422cb2.f129760e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "getPreviewImageURL(...)");
                    vv0.k kVar3 = new vv0.k(str3, str4, str5, c4103x6aa7e302.f129752b, zu0.i.f557207d);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, kVar3.f521918a)) {
                        m170583x20fa9543(kVar3);
                    }
                    arrayList.add(kVar3);
                }
            }
        }
        post(new uv0.q(this, arrayList));
        android.view.ViewGroup viewGroup = this.M;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.Q;
        if (c2718xca2902ff != null) {
            c2718xca2902ff.setVisibility(0);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.R;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.setVisibility(0);
        }
        android.view.View view = this.S;
        if (view != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.T;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel", "showContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void R(vv0.a clipData, boolean z17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipData, "clipData");
        java.util.Iterator it = m170582xf939df19().f357503d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((vv0.k) obj).f521918a, clipData.f521902a.f129757b)) {
                    break;
                }
            }
        }
        vv0.k kVar = (vv0.k) obj;
        if (kVar == null) {
            return;
        }
        int i17 = kVar.f521921d;
        vv0.k kVar2 = vv0.k.f521916f;
        java.lang.String filterID = kVar.f521918a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterID, "filterID");
        java.lang.String filterName = kVar.f521919b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filterName, "filterName");
        java.lang.String previewImageURL = kVar.f521920c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewImageURL, "previewImageURL");
        zu0.i materialLoadState = clipData.f521903b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialLoadState, "materialLoadState");
        S(new vv0.k(filterID, filterName, previewImageURL, i17, materialLoadState), z17);
    }

    public final void S(vv0.k kVar, boolean z17) {
        java.util.Iterator it = m170582xf939df19().f357503d.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((vv0.k) it.next()).f521918a, kVar.f521918a)) {
                break;
            } else {
                i17++;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FilterPanel", "updateFilterState: index " + i17);
        if (i17 < 0) {
            return;
        }
        m170582xf939df19().x(i17, kVar);
        if (z17) {
            m170582xf939df19().z(kVar);
            post(new uv0.s(this, kVar, i17));
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dfs, bodyContainerLayout);
    }

    /* renamed from: getFilterIntensity */
    public final float m170584x8dafa565() {
        return this.K;
    }

    @Override // qv0.f
    /* renamed from: getToolbarTitle */
    public java.lang.String mo11426x7c1b2e13() {
        java.lang.String r17 = i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.ll9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        return r17;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.l, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void p() {
        super.p();
        android.view.ViewGroup viewGroup = this.M;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.Q;
        if (c2718xca2902ff != null) {
            c2718xca2902ff.setVisibility(8);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.R;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.setVisibility(8);
        }
        android.view.View view = this.S;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.T;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel", "hideContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        I(new uv0.o(this), new uv0.p(this));
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.b(this, this.S, null);
    }

    /* renamed from: setFilterIntensity */
    public final void m170585xc4863ed9(float f17) {
        this.K = f17;
    }

    /* renamed from: setFilterOptionCallback */
    public final void m170586x8028d8f4(uv0.i optionCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(optionCallback, "optionCallback");
        this.U = optionCallback;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void u(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q panel) {
        java.util.List<yz5.l> m47179xb2e597;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        this.M = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.q7k);
        this.N = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10956x6271c3cc) findViewById(com.p314xaae8f345.mm.R.id.q7j);
        this.P = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.q7l);
        this.Q = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) findViewById(com.p314xaae8f345.mm.R.id.q4x);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.e4u);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = c1163xf1deaba4.m7949x5701d990();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 o3Var = m7949x5701d990 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.o3) m7949x5701d990 : null;
        if (o3Var != null) {
            o3Var.f93715g = false;
        }
        c1163xf1deaba4.i(new uv0.j(this));
        this.R = c1163xf1deaba4;
        this.S = findViewById(com.p314xaae8f345.mm.R.id.q3i);
        this.T = findViewById(com.p314xaae8f345.mm.R.id.hmo);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10956x6271c3cc c10956x6271c3cc = this.N;
        if (c10956x6271c3cc != null && (m47179xb2e597 = c10956x6271c3cc.m47179xb2e597()) != null) {
            m47179xb2e597.add(new uv0.m(this));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.R;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.mo7960x6cab2c8d(m170582xf939df19());
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.R;
        if (c1163xf1deaba43 != null) {
            c1163xf1deaba43.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext(), 0, false));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.R;
        if (c1163xf1deaba44 != null) {
            c1163xf1deaba44.N(new uv0.a(i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn)));
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.Q;
        if (c2718xca2902ff != null) {
            c2718xca2902ff.a(this.f512885p0);
        }
        android.view.View view = this.S;
        if (view != null) {
            view.setOnClickListener(new uv0.n(this));
        }
        post(new uv0.t(this));
    }
}

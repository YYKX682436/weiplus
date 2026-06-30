package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

@db5.a(m123858x6ac9171 = 7)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\f\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderTopicSearchUI;", "Lcom/tencent/mm/ui/MMActivity;", "Ltj5/w;", "Ltj5/n;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickCancelBtn", "onClickBackBtn", "onClickClearTextBtn", "<init>", "()V", "com/tencent/mm/plugin/finder/search/v4", "com/tencent/mm/plugin/finder/search/w4", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.search.FinderTopicSearchUI */
/* loaded from: classes2.dex */
public final class ActivityC14954x2934a5e5 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements tj5.w, tj5.n {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 f207123d;

    /* renamed from: f, reason: collision with root package name */
    public int f207125f;

    /* renamed from: g, reason: collision with root package name */
    public int f207126g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f207127h;

    /* renamed from: n, reason: collision with root package name */
    public int f207130n;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f207133q;

    /* renamed from: r, reason: collision with root package name */
    public p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a f207134r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f207135s;

    /* renamed from: t, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f207136t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f207137u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f207138v;

    /* renamed from: w, reason: collision with root package name */
    public bq.o1 f207139w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 f207140x;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f207124e = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f207128i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f207129m = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f207131o = true;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f207132p = new java.util.HashMap();

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            android.view.View view = this.f207138v;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.f207137u;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(8);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f207135s;
            if (c22801x87cbdc00 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc00.setVisibility(8);
        } else {
            U6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 k4Var = this.f207140x;
        if (k4Var != null) {
            k4Var.b(str3);
        }
    }

    @Override // tj5.n
    public boolean G0() {
        mo48674x36654fab();
        if (U6()) {
            return true;
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(1265L, 9L, 1L, false);
        return false;
    }

    public final int T6() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f207136t;
        if (c1163xf1deaba4 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
            return mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : this.f207128i.size();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
        throw null;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (z17) {
            java.lang.String str = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ",1";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSearchReportLogic", "report19184 " + str);
            jx3.f.INSTANCE.mo68478xbd3cda5f(19184, str);
        }
    }

    public final boolean U6() {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f207123d;
        if (c22482x50bddb92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        java.lang.String m80978xc3706fda = c22482x50bddb92.m80997xdc5215a6().m80978xc3706fda();
        if (m80978xc3706fda == null || (str = r26.n0.u0(m80978xc3706fda).toString()) == null) {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return true;
        }
        X6(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 k4Var = this.f207140x;
        if (k4Var == null) {
            return false;
        }
        k4Var.c(str);
        return false;
    }

    public final void V6(int i17, int i18, r45.tu2 tu2Var) {
        java.util.ArrayList arrayList;
        int T6 = T6();
        int T62 = T6();
        if (i17 == 0 && i18 == 0 && tu2Var != null) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1265L, 10L, 1L, false);
            java.util.LinkedList m75941xfb821914 = tu2Var.m75941xfb821914(7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getTopicInfoList(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = this.f207128i;
                if (!hasNext) {
                    break;
                } else {
                    arrayList2.add(java.lang.Boolean.valueOf(arrayList.add((r45.t03) it.next())));
                }
            }
            this.f207125f = tu2Var.m75939xb282bd08(2);
            this.f207126g = tu2Var.m75939xb282bd08(9);
            this.f207127h = tu2Var.m75934xbce7f2f(5);
            int T63 = T6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicSearchUI", "onSceneEnd " + tu2Var.m75939xb282bd08(2) + ' ' + tu2Var.m75939xb282bd08(3) + ' ' + arrayList.size());
            T62 = T63;
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1265L, 11L, 1L, false);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f207135s;
        if (c22801x87cbdc00 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        c22801x87cbdc00.N(0);
        if (T62 == 0) {
            android.view.View view = this.f207138v;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.f207137u;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(0);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f207135s;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc002.setVisibility(8);
        } else {
            android.view.View view2 = this.f207138v;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = this.f207137u;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
                throw null;
            }
            textView2.setVisibility(8);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = this.f207135s;
            if (c22801x87cbdc003 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc003.setVisibility(0);
            p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a = this.f207134r;
            if (c1081xa22a3e5a == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mainContainer");
                throw null;
            }
            c1081xa22a3e5a.setVisibility(0);
            android.view.View view3 = this.f207133q;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            view3.setBackground(mo55332x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        }
        if (T6 == 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f207136t;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
                return;
            }
            return;
        }
        if (T6 < T62) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f207136t;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c1163xf1deaba42.mo7946xf939df19();
            if (mo7946xf939df192 != null) {
                mo7946xf939df192.m8153xd399a4d9(T6, T62 - T6);
            }
        }
    }

    public final void W6(boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f207129m)) {
            return;
        }
        java.util.HashMap hashMap = this.f207132p;
        if (!hashMap.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t3.f206897a.a(this.f207129m, this.f207124e, 0, hashMap, 2);
            if (z17) {
                hashMap.clear();
            }
        }
    }

    public final void X6(java.lang.String str) {
        W6(true);
        this.f207124e = str;
        this.f207125f = 0;
        this.f207126g = 0;
        this.f207127h = null;
        this.f207128i.clear();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        this.f207129m = uuid;
        bq.o1 o1Var = this.f207139w;
        if (o1Var != null) {
            o1Var.j();
        }
        bq.o1 o1Var2 = new bq.o1(str, this.f207125f, this.f207129m, this.f207127h, this.f207130n, null, null, null, null, null, false, 0, 4064, null);
        this.f207139w = o1Var2;
        pm0.v.T(o1Var2.l(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.b5(this));
        android.view.View view = this.f207138v;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f207137u;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
            throw null;
        }
        textView.setVisibility(8);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f207135s;
        if (c22801x87cbdc00 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        c22801x87cbdc00.setVisibility(8);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f207136t;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: enableActivityAnimation */
    public boolean mo56573xa904b9f2() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b_q;
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.w
    /* renamed from: onClickBackBtn */
    public void mo56568x81ab18cc(android.view.View view) {
        mo48674x36654fab();
        finish();
    }

    /* renamed from: onClickCancelBtn */
    public void m58946x91b34899(android.view.View view) {
        mo48674x36654fab();
        finish();
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f207123d;
        if (c22482x50bddb92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb92.m80997xdc5215a6().m();
        mo26063x7b383410();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = new com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92((android.content.Context) this, false);
        this.f207123d = c22482x50bddb92;
        c22482x50bddb92.m81002xcd6a5043(this);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb922 = this.f207123d;
        if (c22482x50bddb922 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb922.m80997xdc5215a6().m80989x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8));
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb923 = this.f207123d;
        if (c22482x50bddb923 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb923.m80997xdc5215a6().m80988xce28f7ee(this);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb924 = this.f207123d;
        if (c22482x50bddb924 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb924.m80997xdc5215a6().m80980x55355581(false);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb925 = this.f207123d;
        if (c22482x50bddb925 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb925.m80997xdc5215a6().g();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo2533x106ab264);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb926 = this.f207123d;
        if (c22482x50bddb926 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        mo2533x106ab264.y(c22482x50bddb926);
        this.f207130n = getIntent().getIntExtra("request_type", 4);
        this.f207131o = getIntent().getBooleanExtra("need_history", false);
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        this.f207129m = uuid;
        this.f207124e = "";
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb927 = this.f207123d;
        if (c22482x50bddb927 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb927.m80997xdc5215a6().m();
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb928 = this.f207123d;
        if (c22482x50bddb928 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb928.m80997xdc5215a6().t();
        if (this.f207131o) {
            android.view.View findViewById = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.h0r);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f207140x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.a5(this));
        } else {
            android.view.View findViewById2 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.h0r);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicSearchUI", "initData");
        android.view.View findViewById3 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.m7g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f207133q = findViewById3;
        android.view.View findViewById4 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.j8y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f207134r = (p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a) findViewById4;
        android.view.View findViewById5 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.m6e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById5;
        this.f207135s = c22801x87cbdc00;
        this.f207136t = c22801x87cbdc00.m82555x4905e9fa();
        android.view.View findViewById6 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.kcj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f207137u = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.im7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f207138v = findViewById7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f207136t;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba4.mo7967x900dcbe1(c15415x74224fd8);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f207136t;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba42.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.w4(this, 0, 1, null));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f207136t;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba43.m7963x830bc99d(true);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.f207136t;
        if (c1163xf1deaba44 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba44.m7965x440a0e9(5);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba45 = this.f207136t;
        if (c1163xf1deaba45 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba45.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.x4(this));
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f207135s;
        if (c22801x87cbdc002 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        c22801x87cbdc002.m82689x3c9625d9(false);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = this.f207135s;
        if (c22801x87cbdc003 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        c22801x87cbdc003.m82697xe136b7d8(inflate);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc004 = this.f207135s;
        if (c22801x87cbdc004 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        c22801x87cbdc004.m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.z4(this));
        java.lang.String str = this.f207124e;
        if (str != null) {
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb929 = this.f207123d;
            if (c22482x50bddb929 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
                throw null;
            }
            c22482x50bddb929.m80997xdc5215a6().n(str, null);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba46 = this.f207136t;
        if (c1163xf1deaba46 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba46.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba47 = this.f207136t;
        if (c1163xf1deaba47 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c1163xf1deaba47, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba47.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c1163xf1deaba47, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 k4Var = this.f207140x;
        if (k4Var != null) {
            k4Var.a();
        }
        W6(true);
        super.onDestroy();
    }
}

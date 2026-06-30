package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

@db5.a(m123858x6ac9171 = 7)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\f\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "Ltj5/w;", "Ltj5/n;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", "<init>", "()V", "com/tencent/mm/plugin/finder/search/b", "com/tencent/mm/plugin/finder/search/c", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI */
/* loaded from: classes2.dex */
public final class ActivityC14941x5c78ef2b extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 implements tj5.w, tj5.n {
    public static final /* synthetic */ int E = 0;
    public android.widget.TextView A;
    public android.view.View B;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 C;
    public bq.o1 D;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 f207040d;

    /* renamed from: f, reason: collision with root package name */
    public int f207042f;

    /* renamed from: g, reason: collision with root package name */
    public int f207043g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f207044h;

    /* renamed from: n, reason: collision with root package name */
    public int f207047n;

    /* renamed from: p, reason: collision with root package name */
    public int f207049p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f207051r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f207052s;

    /* renamed from: t, reason: collision with root package name */
    public long f207053t;

    /* renamed from: u, reason: collision with root package name */
    public int f207054u;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f207056w;

    /* renamed from: x, reason: collision with root package name */
    public p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a f207057x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f207058y;

    /* renamed from: z, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f207059z;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f207041e = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f207045i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f207046m = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f207048o = "";

    /* renamed from: q, reason: collision with root package name */
    public boolean f207050q = true;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f207055v = new java.util.HashMap();

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            android.view.View view = this.B;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.A;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(8);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f207058y;
            if (c22801x87cbdc00 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc00.setVisibility(8);
        } else {
            V6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 k4Var = this.C;
        if (k4Var != null) {
            k4Var.b(str3);
        }
    }

    @Override // tj5.n
    public boolean G0() {
        mo48674x36654fab();
        if (V6()) {
            return true;
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(1265L, 9L, 1L, false);
        return false;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (z17) {
            java.lang.String str = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ",1";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSearchReportLogic", "report19184 " + str);
            jx3.f.INSTANCE.mo68478xbd3cda5f(19184, str);
        }
    }

    public final int U6() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f207059z;
        if (c1163xf1deaba4 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
            return mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : this.f207045i.size();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
        throw null;
    }

    public final boolean V6() {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f207040d;
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
        Z6(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 k4Var = this.C;
        if (k4Var == null) {
            return false;
        }
        k4Var.c(str);
        return false;
    }

    public final void W6(int i17, int i18, r45.tu2 tu2Var) {
        java.util.ArrayList arrayList;
        int U6 = U6();
        int U62 = U6();
        if (i17 == 0 && i18 == 0 && tu2Var != null) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1265L, 10L, 1L, false);
            java.util.LinkedList m75941xfb821914 = tu2Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getInfoList(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = this.f207045i;
                if (!hasNext) {
                    break;
                } else {
                    arrayList2.add(java.lang.Boolean.valueOf(arrayList.add((r45.mu2) it.next())));
                }
            }
            this.f207042f = tu2Var.m75939xb282bd08(2);
            this.f207043g = tu2Var.m75939xb282bd08(3);
            this.f207044h = tu2Var.m75934xbce7f2f(5);
            int U63 = U6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderContactSearchIncludeFollowUI", "onSceneEnd " + tu2Var.m75939xb282bd08(2) + ' ' + tu2Var.m75939xb282bd08(3) + ' ' + arrayList.size());
            U62 = U63;
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1265L, 11L, 1L, false);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f207058y;
        if (c22801x87cbdc00 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        c22801x87cbdc00.N(0);
        if (U62 == 0) {
            android.view.View view = this.B;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.A;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(0);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f207058y;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc002.setVisibility(8);
        } else {
            android.view.View view2 = this.B;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = this.A;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
                throw null;
            }
            textView2.setVisibility(8);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = this.f207058y;
            if (c22801x87cbdc003 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc003.setVisibility(0);
            p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a = this.f207057x;
            if (c1081xa22a3e5a == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mainContainer");
                throw null;
            }
            c1081xa22a3e5a.setVisibility(0);
        }
        if (U6 == 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f207059z;
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
        if (U6 < U62) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f207059z;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c1163xf1deaba42.mo7946xf939df19();
            if (mo7946xf939df192 != null) {
                mo7946xf939df192.m8153xd399a4d9(U6, U62 - U6);
            }
        }
    }

    public final void X6(r45.mu2 mu2Var, int i17) {
        if (this.f207051r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderContactSearchIncludeFollowUI", "onContactItemClick select atContact");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
            if (c19782x23db1cfa == null) {
                c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
            }
            r45.gb4 i18 = hc2.s.i(c19782x23db1cfa);
            getIntent().putExtra("at_select_contact", i18 != null ? i18.mo14344x5f01b1f6() : null);
            android.content.Intent intent = getIntent();
            ya2.g gVar = ya2.h.f542017a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
            intent.putExtra("is_follow", ya2.g.h(gVar, c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76197x6c03c64c() : null, null, false, false, 14, null));
            setResult(-1, getIntent());
            finish();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107 c14637xcb061107 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.f204132a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
        c14637xcb061107.a(this, c19782x23db1cfa3 != null ? ya2.d.h(c19782x23db1cfa3, null, false, 3, null) : null, false);
        java.lang.String requestId = this.f207048o;
        java.lang.String str = this.f207041e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
        java.lang.String m76197x6c03c64c = c19782x23db1cfa4 != null ? c19782x23db1cfa4.m76197x6c03c64c() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String t17 = r26.i0.t(str, ",", " ", false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(requestId);
        sb6.append(',');
        sb6.append(t17);
        sb6.append(",0,1,");
        if (m76197x6c03c64c == null) {
            m76197x6c03c64c = "";
        }
        sb6.append(m76197x6c03c64c);
        sb6.append(',');
        sb6.append(i17);
        sb6.append(",2");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSearchReportLogic", "report18690 %s", sb7);
        jx3.f.INSTANCE.mo68478xbd3cda5f(18690, sb7);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = mo55332x76847179 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            r45.qt2 V6 = nyVar.V6();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa5 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
            o3Var.Zi(6, 0L, V6, 1, c19782x23db1cfa5 != null ? c19782x23db1cfa5.m76197x6c03c64c() : null);
        }
    }

    public final void Y6(boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f207048o)) {
            return;
        }
        java.util.HashMap hashMap = this.f207055v;
        if (!hashMap.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t3.f206897a.a(this.f207048o, this.f207041e, 0, hashMap, 2);
            if (z17) {
                hashMap.clear();
            }
        }
    }

    public final void Z6(java.lang.String str) {
        Y6(true);
        this.f207041e = str;
        this.f207042f = 0;
        this.f207043g = 0;
        this.f207044h = null;
        if (this.f207049p == 4) {
            this.f207046m.clear();
        } else {
            this.f207045i.clear();
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        this.f207048o = uuid;
        bq.o1 o1Var = this.D;
        if (o1Var != null) {
            o1Var.j();
        }
        bq.o1 o1Var2 = new bq.o1(str, this.f207042f, this.f207048o, this.f207044h, this.f207049p, null, null, null, null, null, false, 0, 4064, null);
        this.D = o1Var2;
        pm0.v.T(o1Var2.l(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.m(this)).f(this);
        android.view.View view = this.B;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.A;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
            throw null;
        }
        textView.setVisibility(8);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f207058y;
        if (c22801x87cbdc00 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        c22801x87cbdc00.setVisibility(8);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f207059z;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
        android.view.View view2 = this.f207056w;
        if (view2 != null) {
            view2.setBackground(mo55332x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: enableActivityAnimation */
    public boolean mo56573xa904b9f2() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.afh;
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
    public void m58940x91b34899(android.view.View view) {
        mo48674x36654fab();
        finish();
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f207040d;
        if (c22482x50bddb92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb92.m80997xdc5215a6().m();
        mo26063x7b383410();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = new com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92((android.content.Context) this, false);
        this.f207040d = c22482x50bddb92;
        c22482x50bddb92.m81002xcd6a5043(this);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb922 = this.f207040d;
        if (c22482x50bddb922 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb922.m80997xdc5215a6().m80989x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8));
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb923 = this.f207040d;
        if (c22482x50bddb923 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb923.m80997xdc5215a6().m80988xce28f7ee(this);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb924 = this.f207040d;
        if (c22482x50bddb924 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb924.m80997xdc5215a6().m80980x55355581(false);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb925 = this.f207040d;
        if (c22482x50bddb925 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb925.m80997xdc5215a6().g();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo2533x106ab264);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb926 = this.f207040d;
        if (c22482x50bddb926 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        mo2533x106ab264.y(c22482x50bddb926);
        this.f207049p = getIntent().getIntExtra("request_type", 3);
        this.f207051r = getIntent().getBooleanExtra("from_at_contact", false);
        this.f207050q = getIntent().getBooleanExtra("need_history", false);
        this.f207052s = getIntent().getBooleanExtra("key_need_hide_top_padding", false);
        this.f207053t = getIntent().getLongExtra("key_finder_object_id", 0L);
        this.f207054u = getIntent().getIntExtra("key_remind_finder_half_screen_source", 0);
        r45.b31 b31Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207296c;
        if (b31Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207296c = null;
            java.lang.String m75945x2fec8307 = b31Var.m75945x2fec8307(6);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            this.f207048o = m75945x2fec8307;
            java.lang.String m75945x2fec83072 = b31Var.m75945x2fec8307(0);
            this.f207041e = m75945x2fec83072 != null ? m75945x2fec83072 : "";
            this.f207042f = b31Var.m75939xb282bd08(1);
            this.f207043g = b31Var.m75939xb282bd08(2);
            this.f207044h = b31Var.m75934xbce7f2f(4);
            this.f207047n = b31Var.m75939xb282bd08(5);
            java.util.LinkedList m75941xfb821914 = b31Var.m75941xfb821914(7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getContactList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Boolean.valueOf(this.f207045i.add((r45.mu2) it.next())));
            }
        } else {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
            this.f207048o = uuid;
            this.f207041e = "";
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb927 = this.f207040d;
            if (c22482x50bddb927 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
                throw null;
            }
            c22482x50bddb927.m80997xdc5215a6().m();
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb928 = this.f207040d;
            if (c22482x50bddb928 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
                throw null;
            }
            c22482x50bddb928.m80997xdc5215a6().t();
        }
        if (this.f207050q) {
            android.view.View findViewById = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.h0r);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.C = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.g(this));
        } else {
            android.view.View findViewById2 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.h0r);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f207051r) {
            setResult(0, getIntent());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderContactSearchIncludeFollowUI", "fromAtContact:%s", java.lang.Boolean.valueOf(this.f207051r));
        android.view.View findViewById3 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.m7g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f207056w = findViewById3;
        android.view.View findViewById4 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.j8y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f207057x = (p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a) findViewById4;
        android.view.View findViewById5 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.m6e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById5;
        this.f207058y = c22801x87cbdc00;
        this.f207059z = c22801x87cbdc00.m82555x4905e9fa();
        android.view.View findViewById6 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.kcj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.A = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.im7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.B = findViewById7;
        if (this.f207052s) {
            android.view.View view = this.f207056w;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            view.setPadding(0, 0, 0, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f207059z;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba4.mo7967x900dcbe1(c15415x74224fd8);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f207059z;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba42.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.b(this, 0, 1, null));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f207059z;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba43.m7963x830bc99d(true);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.f207059z;
        if (c1163xf1deaba44 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba44.m7965x440a0e9(5);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba45 = this.f207059z;
        if (c1163xf1deaba45 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba45.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.d(this));
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f207058y;
        if (c22801x87cbdc002 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        c22801x87cbdc002.m82689x3c9625d9(false);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = this.f207058y;
        if (c22801x87cbdc003 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        c22801x87cbdc003.m82697xe136b7d8(inflate);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc004 = this.f207058y;
        if (c22801x87cbdc004 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        c22801x87cbdc004.m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.f(this));
        java.lang.String str = this.f207041e;
        if (str != null) {
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb929 = this.f207040d;
            if (c22482x50bddb929 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
                throw null;
            }
            c22482x50bddb929.m80997xdc5215a6().n(str, null);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba46 = this.f207059z;
        if (c1163xf1deaba46 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba46.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba47 = this.f207059z;
        if (c1163xf1deaba47 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        int i17 = this.f207047n;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(c1163xf1deaba47, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba47.a1(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(c1163xf1deaba47, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 k4Var = this.C;
        if (k4Var != null) {
            k4Var.a();
        }
        Y6(true);
        super.onDestroy();
    }
}

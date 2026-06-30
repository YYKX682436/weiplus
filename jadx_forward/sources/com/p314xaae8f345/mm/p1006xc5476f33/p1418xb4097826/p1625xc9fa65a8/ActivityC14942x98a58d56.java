package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderContactSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Ltj5/w;", "Ltj5/n;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", "onContactItemLongClick", "<init>", "()V", "com/tencent/mm/plugin/finder/search/q", "com/tencent/mm/plugin/finder/search/r", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.search.FinderContactSearchUI */
/* loaded from: classes2.dex */
public final class ActivityC14942x98a58d56 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa implements tj5.w, tj5.n {
    public int A;
    public int C;
    public boolean E;
    public boolean F;
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 H;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f207060J;
    public android.view.View K;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 M;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u4 N;
    public bq.o1 Q;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14943x36244ee3 R;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.z S;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 f207062u;

    /* renamed from: w, reason: collision with root package name */
    public int f207064w;

    /* renamed from: x, reason: collision with root package name */
    public int f207065x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f207066y;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f207061t = "Finder.FinderContactSearchUI";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f207063v = "";

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f207067z = new java.util.ArrayList();
    public java.lang.String B = "";
    public boolean D = true;
    public final java.util.HashMap G = new java.util.HashMap();
    public int L = 1;
    public final fc2.c P = new fc2.c("EventDispatcher");

    /* JADX WARN: Type inference failed for: r1v3, types: [com.tencent.mm.plugin.finder.search.FinderContactSearchUI$contactChangelistener$1] */
    public ActivityC14942x98a58d56() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.R = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5436xd7d34ee8>(a0Var) { // from class: com.tencent.mm.plugin.finder.search.FinderContactSearchUI$contactChangelistener$1
            {
                this.f39173x3fe91575 = 797560056;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5436xd7d34ee8 c5436xd7d34ee8) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5436xd7d34ee8 event = c5436xd7d34ee8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.s(event, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14942x98a58d56.this));
                return false;
            }
        };
        this.S = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.z();
    }

    public static void c7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14942x98a58d56 activityC14942x98a58d56, java.lang.String str, int i17, int i18, int i19, java.lang.Object obj) {
        int i27 = (i19 & 4) != 0 ? 1 : i18;
        int i28 = activityC14942x98a58d56.L;
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
        java.lang.String str2 = activityC14942x98a58d56.B;
        java.lang.String str3 = activityC14942x98a58d56.f207063v;
        java.lang.String str4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).f206741d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activityC14942x98a58d56).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        int i29 = i27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Ij(o3Var, str2, str3, 1, 1, str, i17, 2, 1, str4, 1, i28, nyVar != null ? nyVar.V6() : null, null, 0, 12288, null);
        if (str != null) {
            java.util.HashMap hashMap = activityC14942x98a58d56.G;
            if (hashMap.containsKey(str)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.e0 e0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.e0();
            e0Var.f207199b = str;
            e0Var.f207198a = i17;
            e0Var.f207200c = i29;
            e0Var.f207201d = java.lang.System.currentTimeMillis();
            hashMap.put(str, e0Var);
            if (hashMap.size() % 30 == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC14942x98a58d56.B) && (!hashMap.isEmpty())) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t3.f206897a.a(activityC14942x98a58d56.B, activityC14942x98a58d56.f207063v, 0, hashMap, 2);
            }
        }
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            android.view.View view = this.K;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.f207060J;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(8);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.H;
            if (c22801x87cbdc00 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc00.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 k4Var = this.M;
        if (k4Var != null) {
            k4Var.b(str3);
        }
    }

    @Override // tj5.n
    public boolean G0() {
        java.lang.String str;
        mo48674x36654fab();
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f207062u;
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
        this.L = 1;
        e7(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 k4Var = this.M;
        if (k4Var != null) {
            k4Var.c(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u4 u4Var = this.N;
        if (u4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchSuggestionManager");
            throw null;
        }
        u4Var.b();
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        return 6;
    }

    public final void d7(int i17, int i18, r45.tu2 tu2Var) {
        java.util.ArrayList arrayList = this.f207067z;
        int size = arrayList.size();
        int size2 = arrayList.size();
        if (i17 == 0 && i18 == 0 && tu2Var != null) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1265L, 10L, 1L, false);
            java.util.LinkedList m75941xfb821914 = tu2Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getInfoList(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                arrayList2.add(java.lang.Boolean.valueOf(arrayList.add((r45.mu2) it.next())));
            }
            this.f207064w = tu2Var.m75939xb282bd08(2);
            this.f207065x = tu2Var.m75939xb282bd08(3);
            this.f207066y = tu2Var.m75934xbce7f2f(5);
            int size3 = arrayList.size();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f207061t, "onSceneEnd " + tu2Var.m75939xb282bd08(2) + ' ' + tu2Var.m75939xb282bd08(3) + ' ' + arrayList.size());
            java.lang.String str = this.f207063v;
            boolean isEmpty = tu2Var.m75941xfb821914(1).isEmpty();
            int i19 = this.L;
            int i27 = isEmpty ? 1 : 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).f206741d;
            java.lang.String str3 = this.B;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = mo55332x76847179 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            o3Var.Gj(1, str2, str3, str, 2, i19, 2, i27, 1, nyVar != null ? nyVar.V6() : null);
            size2 = size3;
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1265L, 11L, 1L, false);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.H;
        if (c22801x87cbdc00 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        c22801x87cbdc00.N(0);
        if (size2 == 0) {
            android.view.View view = this.K;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.f207060J;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
                throw null;
            }
            textView.setVisibility(0);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.H;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc002.setVisibility(8);
        } else {
            android.view.View view2 = this.K;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "onCgiBack", "(IILcom/tencent/mm/protocal/protobuf/FinderSearchResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = this.f207060J;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
                throw null;
            }
            textView2.setVisibility(8);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = this.H;
            if (c22801x87cbdc003 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc003.setVisibility(0);
        }
        if (size == 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.I;
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
        if (size < size2) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.I;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c1163xf1deaba42.mo7946xf939df19();
            if (mo7946xf939df192 != null) {
                mo7946xf939df192.m8153xd399a4d9(size, size2 - size);
            }
        }
    }

    public final void e7(java.lang.String str) {
        this.f207063v = str;
        this.f207064w = 0;
        this.f207065x = 0;
        this.f207066y = null;
        this.f207067z.clear();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        this.B = uuid;
        bq.o1 o1Var = this.Q;
        if (o1Var != null) {
            o1Var.j();
        }
        bq.o1 o1Var2 = new bq.o1(str, this.f207064w, this.B, this.f207066y, this.C, null, null, null, null, null, false, 0, 4064, null);
        this.Q = o1Var2;
        pm0.v.T(o1Var2.l(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.d0(this)).f(this);
        android.view.View view = this.K;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f207060J;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
            throw null;
        }
        textView.setVisibility(8);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.H;
        if (c22801x87cbdc00 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        c22801x87cbdc00.setVisibility(8);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.I;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return this.F ? com.p314xaae8f345.mm.R.C30864xbddafb2a.afl : com.p314xaae8f345.mm.R.C30864xbddafb2a.afk;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.o1.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h80.class);
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
    public void m58941x91b34899(android.view.View view) {
        mo48674x36654fab();
        finish();
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f207062u;
        if (c22482x50bddb92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb92.m80997xdc5215a6().m();
        mo26063x7b383410();
    }

    /* renamed from: onContactItemLongClick */
    public final void m58942xdd1982d8(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (this.C == 8) {
            rl5.r rVar = new rl5.r(mo55332x76847179());
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.I;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            int u07 = c1163xf1deaba4.u0(view);
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            f0Var.f391649d = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.a0(f0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.c0 c0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.c0(u07, this);
            int i17 = com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d;
            rVar.g(view, u07, 0L, a0Var, c0Var, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
            rVar.m();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("is_force_night_mode", false);
        this.F = booleanExtra;
        if (booleanExtra) {
            mo78514x143f1b92().p0(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
            m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u);
        }
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = new com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92((android.content.Context) this, false, this.F);
        this.f207062u = c22482x50bddb92;
        c22482x50bddb92.m81002xcd6a5043(this);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb922 = this.f207062u;
        if (c22482x50bddb922 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb922.m80997xdc5215a6().m80989x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8));
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb923 = this.f207062u;
        if (c22482x50bddb923 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb923.m80997xdc5215a6().m80988xce28f7ee(this);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb924 = this.f207062u;
        if (c22482x50bddb924 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb924.m80997xdc5215a6().m80980x55355581(false);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb925 = this.f207062u;
        if (c22482x50bddb925 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb925.m80997xdc5215a6().g();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo2533x106ab264);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb926 = this.f207062u;
        if (c22482x50bddb926 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        mo2533x106ab264.y(c22482x50bddb926);
        this.C = getIntent().getIntExtra("request_type", 2);
        this.E = getIntent().getBooleanExtra("from_at_contact", false);
        this.D = getIntent().getBooleanExtra("need_history", true);
        r45.b31 b31Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207296c;
        if (b31Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207296c = null;
            java.lang.String m75945x2fec8307 = b31Var.m75945x2fec8307(6);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            this.B = m75945x2fec8307;
            java.lang.String m75945x2fec83072 = b31Var.m75945x2fec8307(0);
            this.f207063v = m75945x2fec83072 != null ? m75945x2fec83072 : "";
            this.f207064w = b31Var.m75939xb282bd08(1);
            this.f207065x = b31Var.m75939xb282bd08(2);
            this.f207066y = b31Var.m75934xbce7f2f(4);
            this.A = b31Var.m75939xb282bd08(5);
            java.util.LinkedList m75941xfb821914 = b31Var.m75941xfb821914(7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getContactList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Boolean.valueOf(this.f207067z.add((r45.mu2) it.next())));
            }
        } else {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
            this.B = uuid;
            this.f207063v = "";
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb927 = this.f207062u;
            if (c22482x50bddb927 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
                throw null;
            }
            c22482x50bddb927.m80997xdc5215a6().m();
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb928 = this.f207062u;
            if (c22482x50bddb928 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
                throw null;
            }
            c22482x50bddb928.m80997xdc5215a6().t();
        }
        if (this.D) {
            this.M = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4(this, false, this.F, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.w(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.x());
        } else {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.h0r);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "initData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.E) {
            setResult(0, getIntent());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f207061t, "fromAtContact:%s", java.lang.Boolean.valueOf(this.E));
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb929 = this.f207062u;
        if (c22482x50bddb929 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 m80997xdc5215a6 = c22482x50bddb929.m80997xdc5215a6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80997xdc5215a6, "getFtsEditText(...)");
        this.N = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u4(this, m80997xdc5215a6, 0, 2, false, this.F, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.y(this));
        android.view.View findViewById2 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.m6e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById2;
        this.H = c22801x87cbdc00;
        this.I = c22801x87cbdc00.m82555x4905e9fa();
        android.view.View findViewById3 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.kcj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f207060J = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.im7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.K = findViewById4;
        if (this.F) {
            android.view.View findViewById5 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.j8y);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById5, "null cannot be cast to non-null type android.view.View");
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.H;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc002.setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
            findViewById5.setBackgroundColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.I;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba4.mo7967x900dcbe1(c15415x74224fd8);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.I;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba42.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q(this, this.F));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.I;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba43.m7963x830bc99d(true);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.I;
        if (c1163xf1deaba44 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba44.m7965x440a0e9(5);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba45 = this.I;
        if (c1163xf1deaba45 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba45.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.t(this));
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = this.H;
        if (c22801x87cbdc003 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        c22801x87cbdc003.m82689x3c9625d9(false);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc004 = this.H;
        if (c22801x87cbdc004 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(this.F ? com.p314xaae8f345.mm.R.C30864xbddafb2a.bsc : com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        c22801x87cbdc004.m82697xe136b7d8(inflate);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc005 = this.H;
        if (c22801x87cbdc005 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        c22801x87cbdc005.m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v(this));
        java.lang.String str = this.f207063v;
        if (str != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u4 u4Var = this.N;
            if (u4Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchSuggestionManager");
                throw null;
            }
            u4Var.f207424l = str;
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb9210 = this.f207062u;
            if (c22482x50bddb9210 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
                throw null;
            }
            c22482x50bddb9210.m80997xdc5215a6().n(str, null);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba46 = this.I;
        if (c1163xf1deaba46 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba46.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba47 = this.I;
        if (c1163xf1deaba47 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        int i17 = this.A;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c1163xf1deaba47, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba47.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c1163xf1deaba47, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI", "initContentView", "()V", "Undefined", "scrollToPosition", "(I)V");
        this.P.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.r(this));
        mo48813x58998cd();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba48 = this.I;
        if (c1163xf1deaba48 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba48.i(this.S);
        if (this.F) {
            ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderContactSearchUI_Live)).Rj(this, iy1.a.FinderLive);
        } else {
            ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderContactSearchUI_Finder)).Rj(this, iy1.a.Finder);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k4 k4Var = this.M;
        if (k4Var != null) {
            k4Var.a();
        }
        this.P.c();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.I;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba4.V0(this.S);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.I;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        ml2.x1 x1Var = ml2.x1.f409734e;
        ml2.q1 q1Var = ml2.q1.f409345e;
        zy2.zb.Kh(zbVar, c1163xf1deaba4, x1Var, "temp_3", ml2.y.f409774f, 0, 0L, 0, 112, null);
        if (this.N != null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchSuggestionManager");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.I;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        ml2.x1 x1Var = ml2.x1.f409734e;
        ml2.q1 q1Var = ml2.q1.f409345e;
        zy2.zb.Kh(zbVar, c1163xf1deaba4, x1Var, "temp_3", ml2.y.f409773e, 0, 0L, 0, 112, null);
        if (this.N != null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchSuggestionManager");
        throw null;
    }
}

package ut2;

/* loaded from: classes3.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public final st2.h1 f512644a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f512645b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f512646c;

    /* renamed from: d, reason: collision with root package name */
    public final tt2.o1 f512647d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f512648e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f512649f;

    /* renamed from: g, reason: collision with root package name */
    public r45.xv2 f512650g;

    /* renamed from: h, reason: collision with root package name */
    public long f512651h;

    /* renamed from: i, reason: collision with root package name */
    public long f512652i;

    public u3(st2.h1 internal, android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(internal, "internal");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f512644a = internal;
        this.f512645b = rootView;
        this.f512646c = "FinderShoppingTagHolder";
        tt2.o1 o1Var = new tt2.o1(this);
        this.f512647d = o1Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) rootView.findViewById(com.p314xaae8f345.mm.R.id.qdg);
        c1163xf1deaba4.mo7960x6cab2c8d(o1Var);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(rootView.getContext(), 0, false));
        this.f512648e = c1163xf1deaba4;
        this.f512649f = kz5.p0.f395529d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    public final void a(r45.xv2 labelInfo, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelInfo, "labelInfo");
        android.view.View view = this.f512645b;
        if (z17) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("commerceAction", 1042);
            jSONObject.put("cate_id", labelInfo.m75942xfb822ef2(2));
            jSONObject.put("tab_name", labelInfo.m75945x2fec8307(0));
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(labelInfo.m75945x2fec8307(0), view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ewi))) {
                jSONObject.put("tab_type", 3);
            }
            r45.xv2 xv2Var = this.f512650g;
            if (xv2Var != null) {
                jSONObject.put("last_cate_id", xv2Var.m75942xfb822ef2(2));
                jSONObject.put("last_tab_name", xv2Var.m75945x2fec8307(0));
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xv2Var.m75945x2fec8307(0), view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ewi))) {
                    jSONObject.put("last_tab_type", 3);
                } else {
                    jSONObject.put("last_tab_type", xv2Var.m75942xfb822ef2(2) == 0 ? 2 : 1);
                }
            }
            jSONObject.put("last_tab_duration", c01.id.c() - this.f512652i);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.Dj((ml2.r0) c17, ml2.f4.L, null, "", null, null, null, 0, 0L, jSONObject, null, null, null, false, null, 16120, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f512646c, "reportClick json = " + jSONObject);
            r45.xv2 xv2Var2 = this.f512650g;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xv2Var2 != null ? xv2Var2.m75945x2fec8307(0) : null, labelInfo.m75945x2fec8307(0))) {
                this.f512652i = c01.id.c();
            }
        }
        this.f512650g = labelInfo;
        this.f512647d.m8146xced61ae5();
        st2.h1 h1Var = this.f512644a;
        h1Var.getClass();
        int m75939xb282bd08 = labelInfo.m75939xb282bd08(4);
        gk2.e eVar = h1Var.f493868f;
        if (m75939xb282bd08 == 2) {
            st2.v1 v1Var = h1Var.S;
            if (v1Var == null) {
                v1Var = new st2.v1(h1Var.f493866d, eVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "live " + ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0) + " pairing tab init");
                h1Var.S = v1Var;
            }
            st2.v1 v1Var2 = h1Var.S;
            if (v1Var2 != null) {
                android.view.View view2 = v1Var2.f494016c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingParingTab", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingParingTab", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            h1Var.q().setVisibility(8);
            if (z17) {
                v1Var.a(true);
            }
        } else {
            st2.v1 v1Var3 = h1Var.S;
            if (v1Var3 != null) {
                android.view.View view3 = v1Var3.f494016c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingParingTab", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingParingTab", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            h1Var.q().setVisibility(0);
            java.util.LinkedList m75941xfb821914 = labelInfo.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getProduct_ids(...)");
            boolean isEmpty = m75941xfb821914.isEmpty();
            tt2.e1 e1Var = h1Var.P;
            if (isEmpty) {
                e1Var.c0(((mm2.f6) eVar.a(mm2.f6.class)).f410572o);
            } else {
                ?? b17 = ((mm2.f6) eVar.a(mm2.f6.class)).f410572o.b(new st2.h(m75941xfb821914));
                if (h1Var.y()) {
                    int d17 = kz5.b1.d(kz5.d0.q(b17, 10));
                    if (d17 < 16) {
                        d17 = 16;
                    }
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
                    java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        so2.j5 j5Var = (so2.j5) next;
                        cm2.m0 m0Var = j5Var instanceof cm2.m0 ? (cm2.m0) j5Var : null;
                        linkedHashMap.put(m0Var != null ? java.lang.Long.valueOf(m0Var.f124902w) : null, next);
                    }
                    b17 = new java.util.ArrayList();
                    java.util.Iterator it6 = m75941xfb821914.iterator();
                    while (it6.hasNext()) {
                        so2.j5 j5Var2 = (so2.j5) linkedHashMap.get(java.lang.Long.valueOf(((java.lang.Number) it6.next()).longValue()));
                        if (j5Var2 != null) {
                            b17.add(j5Var2);
                        }
                    }
                }
                e1Var.c0(new qm0.a(b17, null));
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14399xad75a698 q17 = h1Var.q();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(q17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "applyProductFilter", "(Ljava/util/List;Z)V", "Undefined", "scrollToPosition", "(I)V");
                q17.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(q17, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "applyProductFilter", "(Ljava/util/List;Z)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f512648e.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null) {
            return;
        }
        ut2.t3 t3Var = new ut2.t3(view.getContext());
        t3Var.f93582a = i17;
        c1162x665295de.m8099x6305639d(t3Var);
    }
}

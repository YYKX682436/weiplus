package st2;

/* loaded from: classes3.dex */
public final class o1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f493940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ st2.s1 f493941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493942c;

    public o1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, st2.s1 s1Var, java.lang.String str) {
        this.f493940a = h0Var;
        this.f493941b = s1Var;
        this.f493942c = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.y23 y23Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean z17 = true;
        boolean z18 = fVar != null && fVar.f152148a == 0;
        java.lang.String str = this.f493942c;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f493940a;
        st2.s1 s1Var = this.f493941b;
        if (z18 && fVar.f152149b == 0) {
            r45.w82 w82Var = (r45.w82) ke2.o0.f388509v.a(fVar, new r45.w82());
            java.util.LinkedList m75941xfb821914 = w82Var != null ? w82Var.m75941xfb821914(0) : null;
            h0Var.f391656d = m75941xfb821914;
            s1Var.f493987n = (m75941xfb821914 == null || (y23Var = (r45.y23) kz5.n0.Z(m75941xfb821914)) == null) ? null : y23Var.m75945x2fec8307(17);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.f4 f4Var = ml2.f4.f408984x0;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("query", str);
            ml2.r0.Dj(r0Var, f4Var, null, null, null, null, null, 0, 0L, jSONObject, null, null, null, false, s1Var.f493987n, 7928, null);
        } else {
            java.lang.String str2 = s1Var.f493977d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("search failed, errType = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
            sb6.append(", errCode = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, sb6.toString());
        }
        java.util.List<r45.y23> list = (java.util.List) h0Var.f391656d;
        android.view.View view = s1Var.f493982i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "showSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "showSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (list != null && !list.isEmpty()) {
            z17 = false;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = s1Var.f493984k;
        if (z17) {
            android.view.View view2 = s1Var.f493983j;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "showSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "showSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1163xf1deaba4.setVisibility(4);
        } else {
            android.view.View view3 = s1Var.f493983j;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "showSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage", "showSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1163xf1deaba4.setVisibility(0);
            qm0.a aVar = new qm0.a(new java.util.LinkedList(), null);
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (r45.y23 y23Var2 : list) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y23Var2, "<this>");
                arrayList4.add(new cm2.m0(y23Var2));
            }
            aVar.f446213a.addAll(arrayList4);
            tt2.f1 f1Var = s1Var.f493985l;
            f1Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            f1Var.B = str;
            f1Var.c0(aVar);
        }
        s1Var.f493988o = str;
        return jz5.f0.f384359a;
    }
}

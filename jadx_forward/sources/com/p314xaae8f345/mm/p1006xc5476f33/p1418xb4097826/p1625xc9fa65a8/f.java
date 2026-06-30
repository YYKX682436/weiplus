package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class f extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b f207214a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b activityC14941x5c78ef2b) {
        this.f207214a = activityC14941x5c78ef2b;
    }

    @Override // ym5.q3
    public void b(int i17) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b.E;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderContactSearchIncludeFollowUI", "onLoadMoreBegin");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b activityC14941x5c78ef2b = this.f207214a;
        java.lang.String str = activityC14941x5c78ef2b.f207041e;
        if (activityC14941x5c78ef2b.f207043g != 1) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = activityC14941x5c78ef2b.f207058y;
            if (c22801x87cbdc00 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            android.view.View f294968x = c22801x87cbdc00.getF294968x();
            if (f294968x != null && (textView = (android.widget.TextView) f294968x.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = activityC14941x5c78ef2b.f207058y;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            android.view.View f294968x2 = c22801x87cbdc002.getF294968x();
            android.widget.TextView textView3 = f294968x2 != null ? (android.widget.TextView) f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ili) : null;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = activityC14941x5c78ef2b.f207058y;
            if (c22801x87cbdc003 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            android.view.View f294968x3 = c22801x87cbdc003.getF294968x();
            android.view.View findViewById = f294968x3 != null ? f294968x3.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        bq.o1 o1Var = new bq.o1(str, activityC14941x5c78ef2b.f207042f, activityC14941x5c78ef2b.f207048o, activityC14941x5c78ef2b.f207044h, activityC14941x5c78ef2b.f207049p, null, null, null, null, null, false, 0, 4064, null);
        activityC14941x5c78ef2b.D = o1Var;
        pm0.v.T(o1Var.l(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.e(activityC14941x5c78ef2b));
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc004 = activityC14941x5c78ef2b.f207058y;
        if (c22801x87cbdc004 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        android.view.View f294968x4 = c22801x87cbdc004.getF294968x();
        if (f294968x4 != null && (textView2 = (android.widget.TextView) f294968x4.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573427el1);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc005 = activityC14941x5c78ef2b.f207058y;
        if (c22801x87cbdc005 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        android.view.View f294968x5 = c22801x87cbdc005.getF294968x();
        android.widget.TextView textView4 = f294968x5 != null ? (android.widget.TextView) f294968x5.findViewById(com.p314xaae8f345.mm.R.id.ili) : null;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc006 = activityC14941x5c78ef2b.f207058y;
        if (c22801x87cbdc006 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        android.view.View f294968x6 = c22801x87cbdc006.getF294968x();
        android.view.View findViewById2 = f294968x6 != null ? f294968x6.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
        if (findViewById2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/search/FinderContactSearchIncludeFollowUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

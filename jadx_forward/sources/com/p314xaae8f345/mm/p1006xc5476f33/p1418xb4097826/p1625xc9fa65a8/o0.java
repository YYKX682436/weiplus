package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes8.dex */
public final class o0 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14944x7f25a182 f207328a;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14944x7f25a182 activityC14944x7f25a182) {
        this.f207328a = activityC14944x7f25a182;
    }

    @Override // ym5.q3
    public void b(int i17) {
        android.view.View findViewById;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFansSearchUI", "onLoadMoreBegin");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14944x7f25a182 activityC14944x7f25a182 = this.f207328a;
        if (activityC14944x7f25a182.f207070u != null) {
            if (activityC14944x7f25a182.f207072w != 1) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = activityC14944x7f25a182.B;
                if (c22801x87cbdc00 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                    throw null;
                }
                android.view.View f294968x = c22801x87cbdc00.getF294968x();
                if (f294968x != null && (textView = (android.widget.TextView) f294968x.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
                }
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = activityC14944x7f25a182.B;
                if (c22801x87cbdc002 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                    throw null;
                }
                android.view.View f294968x2 = c22801x87cbdc002.getF294968x();
                android.widget.TextView textView3 = f294968x2 != null ? (android.widget.TextView) f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ili) : null;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = activityC14944x7f25a182.B;
                if (c22801x87cbdc003 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                    throw null;
                }
                android.view.View f294968x3 = c22801x87cbdc003.getF294968x();
                findViewById = f294968x3 != null ? f294968x3.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
                if (findViewById == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view = findViewById;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String query = activityC14944x7f25a182.f207070u;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = activityC14944x7f25a182.f207071v;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14944x7f25a182.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            r45.qt2 d17 = xy2.c.d(mo55332x76847179);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l0 l0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l0(activityC14944x7f25a182);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.n0 n0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.n0(activityC14944x7f25a182);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
            bq.u uVar = new bq.u(query, gVar, d17);
            uVar.l().q(new cq.a0(l0Var, n0Var));
            activityC14944x7f25a182.I = uVar;
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc004 = activityC14944x7f25a182.B;
            if (c22801x87cbdc004 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            android.view.View f294968x4 = c22801x87cbdc004.getF294968x();
            if (f294968x4 != null && (textView2 = (android.widget.TextView) f294968x4.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573427el1);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc005 = activityC14944x7f25a182.B;
            if (c22801x87cbdc005 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            android.view.View f294968x5 = c22801x87cbdc005.getF294968x();
            android.widget.TextView textView4 = f294968x5 != null ? (android.widget.TextView) f294968x5.findViewById(com.p314xaae8f345.mm.R.id.ili) : null;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc006 = activityC14944x7f25a182.B;
            if (c22801x87cbdc006 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            android.view.View f294968x6 = c22801x87cbdc006.getF294968x();
            findViewById = f294968x6 != null ? f294968x6.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view2 = findViewById;
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

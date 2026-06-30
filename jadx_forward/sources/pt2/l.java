package pt2;

/* loaded from: classes8.dex */
public final class l extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.AbstractActivityC14960x21b59453 f439785a;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.AbstractActivityC14960x21b59453 abstractActivityC14960x21b59453) {
        this.f439785a = abstractActivityC14960x21b59453;
    }

    @Override // ym5.q3
    public void b(int i17) {
        android.view.View findViewById;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.AbstractActivityC14960x21b59453 abstractActivityC14960x21b59453 = this.f439785a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractActivityC14960x21b59453.f207443t, "onLoadMoreBegin");
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0) abstractActivityC14960x21b59453.c7()).f207210e == 1;
        java.lang.String str = abstractActivityC14960x21b59453.f207443t;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showNoMoreFooter");
            android.view.View f294968x = abstractActivityC14960x21b59453.e7().getF294968x();
            if (f294968x != null && (textView = (android.widget.TextView) f294968x.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
            }
            android.view.View f294968x2 = abstractActivityC14960x21b59453.e7().getF294968x();
            android.widget.TextView textView3 = f294968x2 != null ? (android.widget.TextView) f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ili) : null;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            android.view.View f294968x3 = abstractActivityC14960x21b59453.e7().getF294968x();
            findViewById = f294968x3 != null ? f294968x3.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view = findViewById;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startSearchNextPage: " + abstractActivityC14960x21b59453.f207445v);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 c14957x1a4885f0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0) abstractActivityC14960x21b59453.c7();
        c14957x1a4885f0.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(c14957x1a4885f0, false, 1, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showLoadMoreFooter");
        android.view.View f294968x4 = abstractActivityC14960x21b59453.e7().getF294968x();
        if (f294968x4 != null && (textView2 = (android.widget.TextView) f294968x4.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573427el1);
        }
        android.view.View f294968x5 = abstractActivityC14960x21b59453.e7().getF294968x();
        android.widget.TextView textView4 = f294968x5 != null ? (android.widget.TextView) f294968x5.findViewById(com.p314xaae8f345.mm.R.id.ili) : null;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        android.view.View f294968x6 = abstractActivityC14960x21b59453.e7().getF294968x();
        findViewById = f294968x6 != null ? f294968x6.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        android.view.View view2 = findViewById;
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

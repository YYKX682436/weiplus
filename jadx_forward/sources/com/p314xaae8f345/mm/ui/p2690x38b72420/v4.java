package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes5.dex */
public class v4 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 f288749d;

    public v4(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47) {
        this.f288749d = abstractActivityC22312xbd689c47;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47 = this.f288749d;
        if (!abstractActivityC22312xbd689c47.l7() && abstractActivityC22312xbd689c47.f287983h != null) {
            android.widget.ListView listView = abstractActivityC22312xbd689c47.f287979d;
            android.view.View childAt = listView.getChildAt(listView.getFirstVisiblePosition());
            if (childAt == null || childAt.getTop() != 0) {
                android.view.View view = abstractActivityC22312xbd689c47.f287988p;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "onScroll", "(Landroid/widget/AbsListView;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "onScroll", "(Landroid/widget/AbsListView;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = abstractActivityC22312xbd689c47.f287988p;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "onScroll", "(Landroid/widget/AbsListView;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "onScroll", "(Landroid/widget/AbsListView;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (i17 < 2) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
            return;
        }
        ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1((java.lang.Boolean) gm0.j1.u().c().l(12296, null))) {
            gm0.j1.u().c().w(12296, java.lang.Boolean.TRUE);
            db5.d5 d5Var = abstractActivityC22312xbd689c47.f287987o;
            if (d5Var != null) {
                d5Var.dismiss();
            }
            abstractActivityC22312xbd689c47.f287987o = db5.t7.o(abstractActivityC22312xbd689c47, abstractActivityC22312xbd689c47.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gqy), 4000L);
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 != 0) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47 = this.f288749d;
            abstractActivityC22312xbd689c47.mo48674x36654fab();
            abstractActivityC22312xbd689c47.X6();
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$6", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}

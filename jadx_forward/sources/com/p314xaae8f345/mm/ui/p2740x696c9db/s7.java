package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public final class s7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 f292261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292262e;

    public s7(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 activityC22515xdd3b1ad7, android.view.View view) {
        this.f292261d = activityC22515xdd3b1ad7;
        this.f292262e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.ListView listView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/NewCountryCodeUI$initListView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 activityC22515xdd3b1ad7 = this.f292261d;
        android.widget.ListView listView2 = activityC22515xdd3b1ad7.f291646d;
        if (listView2 != null) {
            listView2.removeHeaderView(this.f292262e);
        }
        if (!activityC22515xdd3b1ad7.A) {
            android.view.View view2 = activityC22515xdd3b1ad7.B;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/tools/NewCountryCodeUI", "expandSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/tools/NewCountryCodeUI", "expandSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            activityC22515xdd3b1ad7.A = true;
            android.view.ViewGroup viewGroup = activityC22515xdd3b1ad7.f291660u;
            android.widget.TextView textView = viewGroup != null ? (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f563975ep) : null;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.view.ViewGroup viewGroup2 = activityC22515xdd3b1ad7.f291660u;
            android.view.View findViewById = viewGroup2 != null ? viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                android.view.View view3 = findViewById;
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/tools/NewCountryCodeUI", "expandSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/tools/NewCountryCodeUI", "expandSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.k7 k7Var = activityC22515xdd3b1ad7.f291665z;
            if (k7Var != null) {
                k7Var.setVisibility(0);
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.k7 k7Var2 = activityC22515xdd3b1ad7.f291665z;
            if (k7Var2 != null) {
                k7Var2.c(java.lang.Boolean.TRUE);
            }
            android.view.View view4 = activityC22515xdd3b1ad7.f291661v;
            if (view4 != null && (listView = activityC22515xdd3b1ad7.f291646d) != null) {
                listView.removeHeaderView(view4);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/NewCountryCodeUI$initListView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package pt2;

/* loaded from: classes2.dex */
public final class f implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.C14959x1a54a2ac f439780a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.C14959x1a54a2ac c14959x1a54a2ac) {
        this.f439780a = c14959x1a54a2ac;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    /* renamed from: onLoadMore */
    public boolean mo15402x1318b45a() {
        jz5.l lVar;
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        android.widget.TextView textView;
        android.view.View view4;
        android.view.View view5;
        android.view.View view6;
        android.widget.TextView textView2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.C14959x1a54a2ac c14959x1a54a2ac = this.f439780a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.C14951x18cbc2ca c14951x18cbc2ca = c14959x1a54a2ac.f207437u;
        if (c14951x18cbc2ca != null) {
            lVar = c14951x18cbc2ca.p(c14959x1a54a2ac.f210798p);
        } else {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            lVar = new jz5.l(bool, bool);
        }
        boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
        if (!((java.lang.Boolean) lVar.f384367e).booleanValue()) {
            return false;
        }
        if (booleanValue) {
            on5.c m82923x19404fcc = c14959x1a54a2ac.z0().m82923x19404fcc();
            android.view.View view7 = m82923x19404fcc != null ? m82923x19404fcc.getView() : null;
            if (view7 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view7, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            on5.c m82923x19404fcc2 = c14959x1a54a2ac.z0().m82923x19404fcc();
            if (m82923x19404fcc2 != null && (view6 = m82923x19404fcc2.getView()) != null && (textView2 = (android.widget.TextView) view6.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573427el1);
            }
            on5.c m82923x19404fcc3 = c14959x1a54a2ac.z0().m82923x19404fcc();
            android.widget.TextView textView3 = (m82923x19404fcc3 == null || (view5 = m82923x19404fcc3.getView()) == null) ? null : (android.widget.TextView) view5.findViewById(com.p314xaae8f345.mm.R.id.ili);
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            on5.c m82923x19404fcc4 = c14959x1a54a2ac.z0().m82923x19404fcc();
            android.view.View findViewById = (m82923x19404fcc4 == null || (view4 = m82923x19404fcc4.getView()) == null) ? null : view4.findViewById(com.p314xaae8f345.mm.R.id.ilg);
            if (findViewById == null) {
                return true;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        on5.c m82923x19404fcc5 = c14959x1a54a2ac.z0().m82923x19404fcc();
        android.view.View view8 = m82923x19404fcc5 != null ? m82923x19404fcc5.getView() : null;
        if (view8 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view8, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        on5.c m82923x19404fcc6 = c14959x1a54a2ac.z0().m82923x19404fcc();
        if (m82923x19404fcc6 != null && (view3 = m82923x19404fcc6.getView()) != null && (textView = (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
        }
        on5.c m82923x19404fcc7 = c14959x1a54a2ac.z0().m82923x19404fcc();
        android.widget.TextView textView4 = (m82923x19404fcc7 == null || (view2 = m82923x19404fcc7.getView()) == null) ? null : (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ili);
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        on5.c m82923x19404fcc8 = c14959x1a54a2ac.z0().m82923x19404fcc();
        android.view.View findViewById2 = (m82923x19404fcc8 == null || (view = m82923x19404fcc8.getView()) == null) ? null : view.findViewById(com.p314xaae8f345.mm.R.id.ilg);
        if (findViewById2 == null) {
            return true;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment$initViews$1", "onLoadMore", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }
}

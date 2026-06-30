package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public class a1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 f218358d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var) {
        this.f218358d = n1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.p3210x3857dc.d1 mo120147x1d5dd38c;
        int i17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/webview/WebViewLongClickHelper$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        hy4.h0 h0Var = new hy4.h0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var = this.f218358d;
        n1Var.f218437h = h0Var;
        h0Var.f367644e = 1;
        h0Var.f367640a = java.lang.System.currentTimeMillis();
        n1Var.f218430a.clear();
        n1Var.f218433d = null;
        n1Var.f218432c = null;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) n1Var.f218436g).n();
        if (n1Var.f().mo63373x86b9ebe3() == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/webview/WebViewLongClickHelper$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        if (!n1Var.h()) {
            try {
                if (view instanceof android.webkit.WebView) {
                    com.p314xaae8f345.p3210x3857dc.d1 mo120147x1d5dd38c2 = n1Var.f().mo63373x86b9ebe3().mo120147x1d5dd38c();
                    if (mo120147x1d5dd38c2 != null && ((i18 = mo120147x1d5dd38c2.f301772a) == 5 || i18 == 8)) {
                        n1Var.k(mo120147x1d5dd38c2);
                    }
                } else if ((view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) && (mo120147x1d5dd38c = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) view).mo120147x1d5dd38c()) != null && ((i17 = mo120147x1d5dd38c.f301772a) == 5 || i17 == 8)) {
                    n1Var.j(mo120147x1d5dd38c);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "onCreateContextMenu exp %s", e17.getMessage());
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/webview/WebViewLongClickHelper$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}

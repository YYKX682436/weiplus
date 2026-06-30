package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class m3 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 f264091d;

    public m3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 w3Var) {
        this.f264091d = w3Var;
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
        yj0.a.b("com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 w3Var = this.f264091d;
        w3Var.f264193a = null;
        w3Var.f264198f = null;
        w3Var.f264197e = null;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) w3Var.f264201i).n();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = w3Var.f264202j;
        if (e0Var == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        try {
            if (view instanceof android.webkit.WebView) {
                com.p314xaae8f345.p3210x3857dc.d1 mo120147x1d5dd38c2 = e0Var.f263713p.mo120147x1d5dd38c();
                if (mo120147x1d5dd38c2 != null && ((i18 = mo120147x1d5dd38c2.f301772a) == 5 || i18 == 8)) {
                    w3Var.d(mo120147x1d5dd38c2);
                }
            } else if ((view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) && (mo120147x1d5dd38c = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) view).mo120147x1d5dd38c()) != null && ((i17 = mo120147x1d5dd38c.f301772a) == 5 || i17 == 8)) {
                w3Var.c(mo120147x1d5dd38c);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageWebViewLongClickHelper", "onCreateContextMenu exp %s", e17.getMessage());
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}

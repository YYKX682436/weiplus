package ey4;

/* loaded from: classes8.dex */
public class x implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19495xb67e4e30 f339168d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19495xb67e4e30 c19495xb67e4e30) {
        this.f339168d = c19495xb67e4e30;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String d17;
        ey4.g gVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyGrid$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19495xb67e4e30 c19495xb67e4e30 = this.f339168d;
        if (i17 == c19495xb67e4e30.f268845d.f339169d.f268848g - 1) {
            ey4.b0 b0Var = c19495xb67e4e30.f268846e.f339144c;
            if (b0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c c19493xb618544c = ((ey4.c) b0Var).f339141a;
                if (!c19493xb618544c.f268822s || (gVar = c19493xb618544c.f268811e) == null) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c19493xb618544c.f268818o;
                    if (c22621x7603e017 != null) {
                        c22621x7603e017.t();
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.h0 h0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.h0) gVar;
                    h0Var.f263748a.f488188i.c(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.g0(h0Var, "[DELETE_EMOTION]"));
                }
            }
            yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyGrid$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        int i18 = ((c19495xb67e4e30.f268848g - 1) * c19495xb67e4e30.f268849h) + i17;
        if (i18 >= c19495xb67e4e30.f268847f) {
            yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyGrid$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        ey4.c0 c0Var = c19495xb67e4e30.f268846e;
        ey4.b0 b0Var2 = c0Var.f339144c;
        if (b0Var2 != null) {
            com.p314xaae8f345.mm.p2614xca6eae71.e1 e1Var = (com.p314xaae8f345.mm.p2614xca6eae71.e1) c0Var.a();
            synchronized (e1Var.f274776c) {
                if (i18 >= 0) {
                    if (i18 < e1Var.f274776c.size()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21055x16b9a563 c21055x16b9a563 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21055x16b9a563) e1Var.f274776c.get(i18);
                        d17 = c21055x16b9a563 != null ? e1Var.d(c21055x16b9a563.f67353x4b6e619a) : "";
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MergerSmileyManager", "get text, error index");
                d17 = "";
            }
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c c19493xb618544c2 = ((ey4.c) b0Var2).f339141a;
                if (c19493xb618544c2.f268822s) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.h0 h0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.h0) c19493xb618544c2.f268811e;
                    h0Var2.f263748a.f488188i.c(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.g0(h0Var2, d17));
                } else {
                    c19493xb618544c2.f268818o.n(d17);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewInputFooter", "appendText, exp = %s", e17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyGrid$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class d2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c f265913d;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c) {
        this.f265913d = activityC19380x649e7d5c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c = this.f265913d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19380x649e7d5c.f265779c4)) {
            activityC19380x649e7d5c.f265794s4.put("query", activityC19380x649e7d5c.N9());
        } else {
            activityC19380x649e7d5c.f265794s4.put("query", activityC19380x649e7d5c.f265779c4);
        }
        activityC19380x649e7d5c.f265794s4.put("exittype", "5");
        activityC19380x649e7d5c.oa();
        activityC19380x649e7d5c.Q9();
        activityC19380x649e7d5c.Ia(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

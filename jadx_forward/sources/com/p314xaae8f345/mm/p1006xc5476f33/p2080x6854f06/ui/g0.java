package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class g0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17665xba0f5e4d f243804d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17665xba0f5e4d activityC17665xba0f5e4d) {
        this.f243804d = activityC17665xba0f5e4d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeMsgListUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        c34.t tVar = (c34.t) this.f243804d.f243636e.getItem(i17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f4167x4b6e82d5)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(11316, this.f243804d.f243642n + "," + tVar.f4167x4b6e82d5);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", tVar.f4167x4b6e82d5);
            j45.l.j(this.f243804d.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6868x3446b505 c6868x3446b505 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6868x3446b505();
            ku5.u0 u0Var = ku5.t0.f394148d;
            y24.a aVar = new y24.a(c6868x3446b505, 201);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.w(aVar, 100L, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeMsgListUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

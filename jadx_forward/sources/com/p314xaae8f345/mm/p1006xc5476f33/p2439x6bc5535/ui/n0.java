package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes5.dex */
public class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f269582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f269583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269584f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19508xaed090d f269585g;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19508xaed090d activityC19508xaed090d, android.widget.TextView textView, int i17, java.lang.String str) {
        this.f269585g = activityC19508xaed090d;
        this.f269582d = textView;
        this.f269583e = i17;
        this.f269584f = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/WebWXUnlockUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f269582d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.oon);
        android.view.View findViewById = this.f269585g.findViewById(com.p314xaae8f345.mm.R.id.vk_);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/webwx/ui/WebWXUnlockUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/webwx/ui/WebWXUnlockUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        iy4.w0 w0Var = new iy4.w0(2, this.f269583e, this.f269584f, 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebWxPopUnlockUI", "doScene netSceneExtDeviceControl : UNLOCK");
        w0Var.mo807x6c193ac1(gm0.j1.d().f152297d, new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.m0(this));
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/WebWXUnlockUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

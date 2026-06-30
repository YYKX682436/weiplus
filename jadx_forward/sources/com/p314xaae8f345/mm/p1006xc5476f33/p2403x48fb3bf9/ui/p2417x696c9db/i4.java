package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class i4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266356f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 f266357g;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 activityC19328xb24711f5, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f266357g = activityC19328xb24711f5;
        this.f266354d = str;
        this.f266355e = str2;
        this.f266356f = str3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 activityC19328xb24711f5 = this.f266357g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDownloadUI", "doCancelDownloadTask, downloadId = %d, state=%s", java.lang.Long.valueOf(activityC19328xb24711f5.f265298w), activityC19328xb24711f5.f265297v);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14217, this.f266354d, 3, this.f266355e, this.f266356f, java.lang.Integer.valueOf(activityC19328xb24711f5.D));
        if (activityC19328xb24711f5.f265298w <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewDownloadUI", "doCancelDownloadTask fail, unexpected branch! ");
            dp.a.m125854x26a183b(activityC19328xb24711f5.mo55332x76847179(), activityC19328xb24711f5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5s), 1).show();
        } else {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            int t17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(activityC19328xb24711f5.f265298w);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDownloadUI", "doCancelDownloadTask, ret = %d", java.lang.Integer.valueOf(t17));
            if (t17 > 0) {
                dp.a.m125854x26a183b(activityC19328xb24711f5.mo55332x76847179(), activityC19328xb24711f5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5t), 1).show();
                activityC19328xb24711f5.U6();
            } else {
                dp.a.m125854x26a183b(activityC19328xb24711f5.mo55332x76847179(), activityC19328xb24711f5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5s), 1).show();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

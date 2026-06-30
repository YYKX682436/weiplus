package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class h4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266324f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266325g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266326h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266327i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266328m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f266329n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 f266330o;

    public h4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 activityC19328xb24711f5, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17) {
        this.f266330o = activityC19328xb24711f5;
        this.f266322d = str;
        this.f266323e = str2;
        this.f266324f = str3;
        this.f266325g = str4;
        this.f266326h = str5;
        this.f266327i = str6;
        this.f266328m = str7;
        this.f266329n = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 activityC19328xb24711f5 = this.f266330o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDownloadUI", "downloadOpBtn.onClick state=%s", activityC19328xb24711f5.f265297v);
        activityC19328xb24711f5.getClass();
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        if (mo168058x74219ae7) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(activityC19328xb24711f5);
        }
        if (!(!mo168058x74219ae7)) {
            yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (activityC19328xb24711f5.f265297v.ordinal() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewDownloadUI", "downloadOpBtn.onClick unexpected download state");
        } else if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(activityC19328xb24711f5.A)) {
            dp.a.m125854x26a183b(activityC19328xb24711f5.A, activityC19328xb24711f5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573741fm1), 0).show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDownloadUI", "startDownload fail, network not ready");
            yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(activityC19328xb24711f5.A)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 activityC19328xb24711f52 = this.f266330o;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5.T6(activityC19328xb24711f52, this.f266322d, this.f266323e, this.f266324f, this.f266325g, this.f266326h, this.f266327i, this.f266328m, activityC19328xb24711f52.E, this.f266329n);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14217, this.f266325g, 4, this.f266327i, this.f266322d, java.lang.Integer.valueOf(activityC19328xb24711f5.D));
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 activityC19328xb24711f53 = this.f266330o;
            db5.e1.D(activityC19328xb24711f53, activityC19328xb24711f53.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5x), activityC19328xb24711f5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5y), activityC19328xb24711f5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5q), activityC19328xb24711f5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.f4(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.g4(this), com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class ea extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f249761a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f249762b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.Button f249763c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f249764d;

    public ea(android.widget.Button button, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f249761a = str;
        this.f249762b = str2;
        this.f249763c = button;
        this.f249764d = str3;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInBackground", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInBackground", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
        int i17 = 1;
        if (!za4.k.g().m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f249761a)) {
            int f17 = za4.k.g().f(this.f249762b);
            i17 = f17 == 3 ? 2 : f17 == 2 ? 3 : f17 == 1 ? 4 : 0;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
        return valueOf;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
        java.lang.Integer num = (java.lang.Integer) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
        int intValue = num.intValue();
        android.widget.Button button = this.f249763c;
        if (intValue == 1) {
            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574700j64);
        } else if (num.intValue() == 2) {
            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574699j63);
        } else if (num.intValue() == 3) {
            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j67);
        } else if (num.intValue() == 4) {
            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574698j62);
        } else {
            button.setText(this.f249764d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class iw extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f250982a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f250983b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f250984c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f250985d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f250986e;

    public iw(android.widget.TextView textView, android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f250982a = str;
        this.f250983b = str2;
        this.f250984c = textView;
        this.f250985d = imageView;
        this.f250986e = str3;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInBackground", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$DownLoadStateRefreshTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInBackground", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$DownLoadStateRefreshTask");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        za4.k g17 = za4.k.g();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str = this.f250982a;
        boolean m17 = g17.m(context, str);
        int i17 = 1;
        if (!m17) {
            int f17 = za4.k.g().f(this.f250983b);
            i17 = f17 == 3 ? 2 : f17 == 2 ? 3 : f17 == 1 ? 4 : 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeLineAdView", "pkg is " + str + ", state is " + i17 + ", cost time is " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$DownLoadStateRefreshTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInBackground", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$DownLoadStateRefreshTask");
        return valueOf;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$DownLoadStateRefreshTask");
        java.lang.Integer num = (java.lang.Integer) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$DownLoadStateRefreshTask");
        int intValue = num.intValue();
        android.widget.TextView textView = this.f250984c;
        if (intValue == 1) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574700j64);
        } else if (num.intValue() == 2) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574699j63);
        } else if (num.intValue() == 3) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j67);
        } else if (num.intValue() == 4) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574698j62);
        } else {
            textView.setText(this.f250986e);
        }
        int intValue2 = num.intValue();
        android.widget.ImageView imageView = this.f250985d;
        if (intValue2 != 1) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80471x5ecaa67);
        } else {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78391x28090db6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$DownLoadStateRefreshTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$DownLoadStateRefreshTask");
    }
}

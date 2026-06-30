package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes.dex */
public class f1 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f252659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f252661c;

    public f1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, java.lang.String str, android.widget.TextView textView) {
        this.f252659a = c22699x3dcdb352;
        this.f252660b = str;
        this.f252661c = textView;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f252659a;
        c22699x3dcdb352.setTag(com.p314xaae8f345.mm.R.id.n1z, "");
        c22699x3dcdb352.setVisibility(8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsCardAdTagUtils", "onDownloadError, hash=" + c22699x3dcdb352.hashCode() + ", url=" + this.f252660b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f252659a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
        try {
            java.lang.String str2 = (java.lang.String) c22699x3dcdb352.getTag(com.p314xaae8f345.mm.R.id.n1z);
            java.lang.String l17 = android.text.TextUtils.isEmpty(str2) ? "" : za4.t0.l("adId", str2);
            if (!android.text.TextUtils.isEmpty(str) && str.equals(l17)) {
                android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null);
                if (J2 != null) {
                    c22699x3dcdb352.setImageBitmap(J2);
                    c22699x3dcdb352.setVisibility(0);
                    android.widget.TextView textView = this.f252661c;
                    if (textView != null && (textView.getLayoutParams() instanceof android.widget.LinearLayout.LayoutParams)) {
                        ((android.widget.LinearLayout.LayoutParams) textView.getLayoutParams()).leftMargin = 0;
                    }
                    c22699x3dcdb352.hashCode();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsCardAdTagUtils", "onDownloaded, bitmap==null");
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsCardAdTagUtils", "onDownloaded, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils$1");
    }
}

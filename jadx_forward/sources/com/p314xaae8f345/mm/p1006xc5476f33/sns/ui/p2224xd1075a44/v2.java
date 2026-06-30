package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public class v2 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f252818b;

    public v2(java.lang.String str, android.widget.ImageView imageView) {
        this.f252817a = str;
        this.f252818b = imageView;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsCommentUtil", "trySetAdBossCommentAvater onDownloadError, url=" + this.f252817a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$2");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.graphics.Bitmap b17;
        android.widget.ImageView imageView = this.f252818b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$2");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsCommentUtil", "trySetAdBossCommentAvater onDownloadedSucc, url=" + this.f252817a);
            java.lang.String str2 = (java.lang.String) imageView.getTag(com.p314xaae8f345.mm.R.id.nae);
            java.lang.String l17 = android.text.TextUtils.isEmpty(str2) ? "" : za4.t0.l("adId", str2);
            if (!android.text.TextUtils.isEmpty(str) && str.equals(l17) && (b17 = i64.m1.f370771c.b(str)) != null) {
                imageView.setImageBitmap(b17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsCommentUtil", "trySetAdBossCommentAvater setImageBitmap");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsCommentUtil", "trySetAdBossCommentAvater, download decode, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil$2");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes3.dex */
public class am implements a84.l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f249307a;

    /* renamed from: b, reason: collision with root package name */
    public final int f249308b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f249309c;

    public am(android.widget.TextView textView, java.lang.String str) {
        this.f249307a = new java.lang.ref.WeakReference(textView);
        this.f249308b = i65.a.b(textView.getContext(), 16);
        this.f249309c = str;
    }

    @Override // a84.l
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        java.lang.ref.WeakReference weakReference;
        java.lang.String str = this.f249309c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$DownloadCallback");
        try {
            weakReference = this.f249307a;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsMsgUI", "onDownloadResult, exp=" + th6.toString());
        }
        if (weakReference == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$DownloadCallback");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) weakReference.get();
        if (textView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$DownloadCallback");
            return;
        }
        java.lang.Object tag = textView.getTag(com.p314xaae8f345.mm.R.id.n5q);
        if (tag instanceof java.lang.String) {
            java.lang.String str2 = (java.lang.String) tag;
            if (!android.text.TextUtils.isEmpty(str) && str.equals(str2) && z17 && bitmap != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "onDownloadResult: success");
                android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), bitmap);
                int i17 = this.f249308b;
                bitmapDrawable.setBounds(0, 0, i17, i17);
                textView.setCompoundDrawables(bitmapDrawable, null, null, null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$DownloadCallback");
    }
}

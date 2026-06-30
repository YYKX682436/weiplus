package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class el implements a84.l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f249783a;

    /* renamed from: b, reason: collision with root package name */
    public final int f249784b;

    public el(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18073x2b4e1ad6 c18073x2b4e1ad6) {
        this.f249783a = new java.lang.ref.WeakReference(c18073x2b4e1ad6);
        this.f249784b = i65.a.b(c18073x2b4e1ad6.getContext(), 16);
    }

    @Override // a84.l
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        java.lang.ref.WeakReference weakReference;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$DownloadCallback");
        try {
            weakReference = this.f249783a;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsLikesTextView", "onDownloadResult, exp=" + th6.toString());
        }
        if (weakReference == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$DownloadCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18073x2b4e1ad6 c18073x2b4e1ad6 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18073x2b4e1ad6) weakReference.get();
        if (c18073x2b4e1ad6 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$DownloadCallback");
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = c18073x2b4e1ad6.f248779m;
        java.lang.Object tag = c18073x2b4e1ad6.f248778i.getTag(com.p314xaae8f345.mm.R.id.n5q);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        java.lang.String str = c18073x2b4e1ad6.f248789w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
        if (tag instanceof java.lang.String) {
            java.lang.String str2 = (java.lang.String) tag;
            if (!android.text.TextUtils.isEmpty(str) && str.equals(str2) && spannableStringBuilder != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
                android.graphics.drawable.Drawable drawable = c18073x2b4e1ad6.f248788v;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
                if (z17 && bitmap != null) {
                    drawable = new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), bitmap);
                    int i17 = this.f249784b;
                    drawable.setBounds(0, 0, i17, i17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
                    c18073x2b4e1ad6.f248790x = drawable;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
                }
                spannableStringBuilder.setSpan(new al5.w(drawable, 1), 0, 1, 33);
                c18073x2b4e1ad6.f248778i.setText(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLikesTextView", "onDownloadResult, set likeicon " + str2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$DownloadCallback");
    }
}

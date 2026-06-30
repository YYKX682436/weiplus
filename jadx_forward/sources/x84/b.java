package x84;

/* loaded from: classes4.dex */
public final class b implements a84.l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f534110a;

    /* renamed from: b, reason: collision with root package name */
    public final int f534111b;

    /* renamed from: c, reason: collision with root package name */
    public final int f534112c;

    /* renamed from: d, reason: collision with root package name */
    public final int f534113d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f534114e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f534115f;

    public b(android.widget.TextView textView, java.lang.String imgUrl, int i17, int i18, int i19, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgUrl, "imgUrl");
        this.f534110a = imgUrl;
        this.f534111b = i17;
        this.f534112c = i18;
        this.f534113d = i19;
        this.f534114e = z17;
        this.f534115f = new java.lang.ref.WeakReference(textView);
    }

    @Override // a84.l
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        java.lang.String str = this.f534110a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$DownloadCallback");
        boolean z18 = this.f534114e;
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdHandleImageSpanLogic", "onDownloadResult, exp=" + th6);
        }
        if (bitmap == null || !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdHandleImageSpanLogic", "bitmap is null or isSuccess is " + z17 + ", isRefresh is " + z18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$DownloadCallback");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) this.f534115f.get();
        if (textView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdHandleImageSpanLogic", "mTextViewRef getRef is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$DownloadCallback");
            return;
        }
        java.lang.Object tag = textView.getTag(com.p314xaae8f345.mm.R.id.n5q);
        java.lang.String str2 = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHandleImageSpanLogic", "imgUrl is " + str + ", tagUrl is " + str2 + ", isRefresh is " + z18);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(textView.getText());
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), bitmap);
            bitmapDrawable.setBounds(0, 0, this.f534111b, this.f534112c);
            al5.w wVar = new al5.w(bitmapDrawable, 1);
            wVar.f87612d = this.f534113d;
            if (!z18 && !r26.n0.E(spannableStringBuilder, (char) 8199, false, 2, null)) {
                spannableStringBuilder.append((char) 8199);
            }
            spannableStringBuilder.setSpan(wVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 34);
            textView.setText(spannableStringBuilder);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$DownloadCallback");
    }
}

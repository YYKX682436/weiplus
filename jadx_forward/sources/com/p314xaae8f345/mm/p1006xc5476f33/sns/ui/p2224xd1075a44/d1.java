package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f252644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18409xf85d1ccf f252645e;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18409xf85d1ccf c18409xf85d1ccf, int[] iArr) {
        this.f252645e = c18409xf85d1ccf;
        this.f252644d = iArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView$1");
        int[] iArr = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18409xf85d1ccf c18409xf85d1ccf = this.f252645e;
        android.view.View contentView = c18409xf85d1ccf.f252374q.getContentView();
        contentView.getLocationOnScreen(iArr);
        android.view.View findViewById = contentView.findViewById(com.p314xaae8f345.mm.R.id.qqi);
        findViewById.measure(0, 0);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = ((this.f252644d[0] + (c18409xf85d1ccf.getWidth() / 2)) - iArr[0]) - (findViewById.getMeasuredWidth() / 2);
        findViewById.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView$1");
    }
}

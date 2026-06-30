package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes2.dex */
public final class n1 extends android.widget.FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f252762g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f252763d;

    /* renamed from: e, reason: collision with root package name */
    public final int f252764e;

    /* renamed from: f, reason: collision with root package name */
    public final int f252765f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(android.content.Context context, int i17, int i18, int i19) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f252763d = i17;
        this.f252764e = i18;
        this.f252765f = i19;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(context);
        c22699x3dcdb352.m82040x7541828(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
        if (i17 == 1) {
            setBackgroundColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77626xb498cd1b));
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f81065xea7afe79);
        } else if (i17 == 2) {
            setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d96);
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80862x137353c3);
        }
        int min = java.lang.Math.min(java.lang.Math.min(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), i18), java.lang.Math.min(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), i19));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(min, min);
        layoutParams.gravity = 17;
        addView(c22699x3dcdb352, layoutParams);
    }

    /* renamed from: getH */
    public final int m71336x305bb2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getH", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentDefaultThumbView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getH", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentDefaultThumbView");
        return this.f252765f;
    }

    /* renamed from: getType */
    public final int m71337xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentDefaultThumbView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentDefaultThumbView");
        return this.f252763d;
    }

    /* renamed from: getW */
    public final int m71338x305bc1() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getW", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentDefaultThumbView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getW", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentDefaultThumbView");
        return this.f252764e;
    }
}

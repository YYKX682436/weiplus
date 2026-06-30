package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0001\u0002B%\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015B\u001d\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/SnsEditTipsWidget;", "Lcom/tencent/mm/ui/widget/MMTextView;", "Lcom/tencent/mm/plugin/sns/ui/widget/x2;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setOnEditTipsVisibilityChangedListener", "", "h", "I", "getErrorColorResId", "()I", "errorColorResId", "i", "getTipsColorResId", "tipsColorResId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget */
/* loaded from: classes4.dex */
public abstract class AbstractC18420xe54becbe extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int errorColorResId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final int tipsColorResId;

    /* renamed from: m, reason: collision with root package name */
    public int f252418m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f252419n;

    public AbstractC18420xe54becbe(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.errorColorResId = com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac;
        this.tipsColorResId = com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj;
    }

    public final boolean b(java.lang.String newText) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkVisibilityByText", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newText, "newText");
        int f17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(newText);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkVisibilityByTextLength", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        this.f252418m = f17;
        getVisibility();
        int c17 = c();
        int f18 = f();
        int i17 = this.f252418m;
        ca4.e1 e1Var = ca4.f1.f121430a;
        boolean z17 = true;
        if (i17 > c17) {
            java.lang.String newText2 = d(ca4.e1.a(e1Var, i17, false, 2, null) - ca4.e1.a(e1Var, c17, false, 2, null));
            int d17 = i65.a.d(getContext(), this.errorColorResId);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("show", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newText2, "newText");
            setVisibility(0);
            setTextColor(d17);
            setText(newText2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("show", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            if (!this.f252419n) {
                this.f252419n = true;
                performHapticFeedback(3, 2);
            }
        } else if (i17 >= c17 - f18) {
            java.lang.String newText3 = e(ca4.e1.a(e1Var, c17, false, 2, null) - ca4.e1.a(e1Var, this.f252418m, false, 2, null));
            int d18 = i65.a.d(getContext(), this.tipsColorResId);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("show", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newText3, "newText");
            setVisibility(0);
            setTextColor(d18);
            setText(newText3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("show", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hide", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            setVisibility(8);
            setText("");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hide", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            z17 = false;
        }
        getVisibility();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkVisibilityByTextLength", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkVisibilityByText", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        return z17;
    }

    public abstract int c();

    public abstract java.lang.String d(int i17);

    public abstract java.lang.String e(int i17);

    public abstract int f();

    /* renamed from: getErrorColorResId */
    public final int m71275x89e0b62a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getErrorColorResId", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getErrorColorResId", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        return this.errorColorResId;
    }

    /* renamed from: getTipsColorResId */
    public final int m71276x1e3c7686() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTipsColorResId", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTipsColorResId", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        return this.tipsColorResId;
    }

    /* renamed from: setOnEditTipsVisibilityChangedListener */
    public final void m71277x872381f3(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x2 listener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnEditTipsVisibilityChangedListener", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnEditTipsVisibilityChangedListener", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
    }

    public AbstractC18420xe54becbe(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.errorColorResId = com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac;
        this.tipsColorResId = com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/ad/AdLandingPageRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.widget.ad.AdLandingPageRecyclerView */
/* loaded from: classes2.dex */
public final class C18428xa0a45427 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name */
    public int f252458b2;

    /* renamed from: c2, reason: collision with root package name */
    public boolean f252459c2;

    /* renamed from: d2, reason: collision with root package name */
    public boolean f252460d2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18428xa0a45427(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.AdLandingPageRecyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        try {
            super.dispatchDraw(canvas);
        } catch (java.lang.Exception e17) {
            if (this.f252458b2 < 10) {
                if (!this.f252459c2) {
                    this.f252459c2 = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2023, 18);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingPageRecyclerView", "dispatchDraw, exp=" + android.util.Log.getStackTraceString(e17) + ", crashNum=" + this.f252458b2);
            } else if (!this.f252460d2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageRecyclerView", "dispatchDraw, exp=" + e17 + ", crashNum=" + this.f252458b2);
                this.f252460d2 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2023, 19);
            }
            this.f252458b2++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchDraw", "com.tencent.mm.plugin.sns.ui.widget.ad.AdLandingPageRecyclerView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18428xa0a45427(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
    }
}

package g44;

/* loaded from: classes3.dex */
public final class y implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17711x240984e1 f350377d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17711x240984e1 c17711x240984e1) {
        this.f350377d = c17711x240984e1;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper$doExpandClickAreaLogic$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17711x240984e1 c17711x240984e1 = this.f350377d;
        android.view.View f17 = c17711x240984e1.f();
        if (f17 != null && (viewTreeObserver = f17.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        int[] iArr = new int[2];
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d e17 = c17711x240984e1.e();
        if (e17 != null) {
            e17.getLocationInWindow(iArr);
        }
        int[] iArr2 = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMTip2TextView$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 c17790xf59c6992 = c17711x240984e1.f244207r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMTip2TextView$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        if (c17790xf59c6992 != null) {
            c17790xf59c6992.getLocationInWindow(iArr2);
        }
        int i17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        android.widget.Button h17 = c17711x240984e1.h();
        int width = h17 != null ? h17.getWidth() + i65.a.b(c17711x240984e1.g(), 40) : 0;
        if (width <= i17) {
            i17 = width;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMTip2TextView$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 c17790xf59c69922 = c17711x240984e1.f244207r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMTip2TextView$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        java.lang.Integer valueOf = c17790xf59c69922 != null ? java.lang.Integer.valueOf(((c17790xf59c69922.getHeight() + iArr2[1]) + i65.a.b(c17711x240984e1.g(), 31)) - iArr[1]) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMExpandClickAreaTop$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout = c17711x240984e1.f244209t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMExpandClickAreaTop$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = i17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMExpandClickAreaTop$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout2 = c17711x240984e1.f244209t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMExpandClickAreaTop$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout2 != null ? frameLayout2.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = valueOf.intValue();
        }
        android.widget.Button h18 = c17711x240984e1.h();
        java.lang.Integer valueOf2 = h18 != null ? java.lang.Integer.valueOf(h18.getHeight() + i65.a.b(c17711x240984e1.g(), 40)) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMExpandClickAreaBottom$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout3 = c17711x240984e1.f244210u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMExpandClickAreaBottom$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout3 != null ? frameLayout3.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.width = i17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMExpandClickAreaBottom$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout4 = c17711x240984e1.f244210u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMExpandClickAreaBottom$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.view.ViewGroup.LayoutParams layoutParams4 = frameLayout4 != null ? frameLayout4.getLayoutParams() : null;
        if (layoutParams4 != null) {
            layoutParams4.height = valueOf2.intValue();
        }
        android.widget.FrameLayout q17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17711x240984e1.q(c17711x240984e1);
        android.view.ViewGroup.LayoutParams layoutParams5 = q17 != null ? q17.getLayoutParams() : null;
        if (layoutParams5 != null) {
            android.widget.Button h19 = c17711x240984e1.h();
            layoutParams5.width = (h19 != null ? java.lang.Integer.valueOf(h19.getWidth()) : null).intValue();
        }
        android.widget.FrameLayout q18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17711x240984e1.q(c17711x240984e1);
        android.view.ViewGroup.LayoutParams layoutParams6 = q18 != null ? q18.getLayoutParams() : null;
        if (layoutParams6 != null) {
            layoutParams6.height = (valueOf != null ? java.lang.Integer.valueOf(valueOf.intValue() - i65.a.b(c17711x240984e1.g(), 15)) : null).intValue();
        }
        android.widget.FrameLayout p17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17711x240984e1.p(c17711x240984e1);
        android.view.ViewGroup.LayoutParams layoutParams7 = p17 != null ? p17.getLayoutParams() : null;
        if (layoutParams7 != null) {
            android.widget.Button h27 = c17711x240984e1.h();
            layoutParams7.width = (h27 != null ? java.lang.Integer.valueOf(h27.getWidth()) : null).intValue();
        }
        android.widget.FrameLayout p18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17711x240984e1.p(c17711x240984e1);
        android.view.ViewGroup.LayoutParams layoutParams8 = p18 != null ? p18.getLayoutParams() : null;
        if (layoutParams8 != null) {
            android.widget.Button h28 = c17711x240984e1.h();
            layoutParams8.height = (h28 != null ? java.lang.Integer.valueOf(h28.getHeight()) : null).intValue();
        }
        android.view.View f18 = c17711x240984e1.f();
        android.view.ViewGroup.LayoutParams layoutParams9 = f18 != null ? f18.getLayoutParams() : null;
        if (layoutParams9 != null) {
            android.view.View f19 = c17711x240984e1.f();
            layoutParams9.height = (f19 != null ? java.lang.Integer.valueOf(f19.getHeight()) : null).intValue();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMExpandClickArea$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        android.widget.LinearLayout linearLayout = c17711x240984e1.f244208s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMExpandClickArea$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper");
        if (linearLayout != null) {
            linearLayout.requestLayout();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper$doExpandClickAreaLogic$1");
        return true;
    }
}

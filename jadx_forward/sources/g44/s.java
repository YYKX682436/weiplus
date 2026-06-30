package g44;

/* loaded from: classes3.dex */
public final class s implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17710x34e09215 f350371d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17710x34e09215 c17710x34e09215) {
        this.f350371d = c17710x34e09215;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper$doExpandClickAreaLogic$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17710x34e09215 c17710x34e09215 = this.f350371d;
        android.view.View f17 = c17710x34e09215.f();
        if (f17 != null && (viewTreeObserver = f17.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        int[] iArr = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMGalleryContainer$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        android.widget.LinearLayout linearLayout = c17710x34e09215.f244199r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMGalleryContainer$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        if (linearLayout != null) {
            linearLayout.getLocationInWindow(iArr);
        }
        int[] iArr2 = new int[2];
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d e17 = c17710x34e09215.e();
        if (e17 != null) {
            e17.getLocationInWindow(iArr2);
        }
        int i17 = iArr[1] - iArr2[1];
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMGalleryContainer$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        android.widget.LinearLayout linearLayout2 = c17710x34e09215.f244199r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMGalleryContainer$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        int height = i17 + (linearLayout2 != null ? linearLayout2.getHeight() : 0) + i65.a.b(c17710x34e09215.g(), 12);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMExpandClickAreaTop", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout = c17710x34e09215.f244201t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMExpandClickAreaTop", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.height = height;
        }
        int[] iArr3 = new int[2];
        android.widget.Button h17 = c17710x34e09215.h();
        if (h17 != null) {
            h17.getLocationInWindow(iArr3);
        }
        int b17 = i65.a.b(c17710x34e09215.g(), 12) * 2;
        android.widget.Button h18 = c17710x34e09215.h();
        int width = (h18 != null ? h18.getWidth() : 0) + b17;
        android.widget.Button h19 = c17710x34e09215.h();
        int height2 = b17 + (h19 != null ? h19.getHeight() : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMExpandClickAreaBottom", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout2 = c17710x34e09215.f244202u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMExpandClickAreaBottom", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        java.lang.Object layoutParams2 = frameLayout2 != null ? frameLayout2.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.width = width;
            marginLayoutParams2.height = height2;
            marginLayoutParams2.topMargin = ((iArr3[1] - iArr2[1]) - height) - i65.a.b(c17710x34e09215.g(), 12);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMExpandClickArea$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        android.widget.LinearLayout linearLayout3 = c17710x34e09215.f244200s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMExpandClickArea$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        if (linearLayout3 != null) {
            linearLayout3.requestLayout();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper$doExpandClickAreaLogic$1");
        return true;
    }
}

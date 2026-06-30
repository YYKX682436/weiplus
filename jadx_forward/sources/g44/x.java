package g44;

/* loaded from: classes3.dex */
public final class x implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17710x34e09215 f350376d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17710x34e09215 c17710x34e09215) {
        this.f350376d = c17710x34e09215;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper$showBottomSheet$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/AdGalleryOpenAppHalfScreenHelper$showBottomSheet$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17710x34e09215 c17710x34e09215 = this.f350376d;
        if (action == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMExpandClickAreaBottomBg$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
            android.widget.FrameLayout frameLayout = c17710x34e09215.f244203v;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMExpandClickAreaBottomBg$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else if (action == 1 || action == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMExpandClickAreaBottomBg$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
            android.widget.FrameLayout frameLayout2 = c17710x34e09215.f244203v;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMExpandClickAreaBottomBg$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(4);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ad/halfscreen/AdGalleryOpenAppHalfScreenHelper$showBottomSheet$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper$showBottomSheet$2");
        return false;
    }
}

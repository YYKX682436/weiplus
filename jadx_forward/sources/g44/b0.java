package g44;

/* loaded from: classes3.dex */
public final class b0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17711x240984e1 f350343d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17711x240984e1 c17711x240984e1) {
        this.f350343d = c17711x240984e1;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.widget.FrameLayout p17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper$showBottomSheet$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/AdOpenAppHalfScreenHelper$showBottomSheet$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17711x240984e1 c17711x240984e1 = this.f350343d;
        if (action == 0) {
            android.widget.FrameLayout p18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17711x240984e1.p(c17711x240984e1);
            if (p18 != null) {
                p18.setVisibility(0);
            }
        } else if ((action == 1 || action == 3) && (p17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.C17711x240984e1.p(c17711x240984e1)) != null) {
            p17.setVisibility(4);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ad/halfscreen/AdOpenAppHalfScreenHelper$showBottomSheet$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper$showBottomSheet$4");
        return false;
    }
}

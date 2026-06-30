package e84;

/* loaded from: classes.dex */
public final class r implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e84.t f331812d;

    public r(e84.t tVar) {
        this.f331812d = tVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.View C;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$setClickEvent$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adSingleProduct/AdSingleProductComponent$setClickEvent$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        e84.t tVar = this.f331812d;
        if (action == 0) {
            android.view.View C2 = e84.t.C(tVar);
            if (C2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(C2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adSingleProduct/AdSingleProductComponent$setClickEvent$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(C2, "com/tencent/mm/plugin/sns/ad/widget/adSingleProduct/AdSingleProductComponent$setClickEvent$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if ((action == 1 || action == 3) && (C = e84.t.C(tVar)) != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(C, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adSingleProduct/AdSingleProductComponent$setClickEvent$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(C, "com/tencent/mm/plugin/sns/ad/widget/adSingleProduct/AdSingleProductComponent$setClickEvent$2", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ad/widget/adSingleProduct/AdSingleProductComponent$setClickEvent$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$setClickEvent$2");
        return false;
    }
}

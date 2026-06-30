package uk4;

/* loaded from: classes8.dex */
public final class f implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2286x2e06d1.p2287x373aa5.AbstractDialogC18712xbaa9ebba f510078d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2286x2e06d1.p2287x373aa5.AbstractDialogC18712xbaa9ebba abstractDialogC18712xbaa9ebba) {
        this.f510078d = abstractDialogC18712xbaa9ebba;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/base/view/TingBaseHalfDialog$initContentView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2286x2e06d1.p2287x373aa5.AbstractDialogC18712xbaa9ebba.f256198r;
        this.f510078d.cancel();
        yj0.a.i(true, this, "com/tencent/mm/plugin/ting/base/view/TingBaseHalfDialog$initContentView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}

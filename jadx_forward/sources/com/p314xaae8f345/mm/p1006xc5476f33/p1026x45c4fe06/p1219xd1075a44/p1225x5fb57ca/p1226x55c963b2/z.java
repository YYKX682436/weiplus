package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2;

/* loaded from: classes15.dex */
public class z implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.C12778x1b9c8edd f172895d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.C12778x1b9c8edd c12778x1b9c8edd, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.t tVar) {
        this.f172895d = c12778x1b9c8edd;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.widget.PopupWindow popupWindow;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillListPopupWindowBase$PopupTouchInterceptor", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.C12778x1b9c8edd c12778x1b9c8edd = this.f172895d;
        if (action == 0 && (popupWindow = c12778x1b9c8edd.f172823b) != null && popupWindow.isShowing() && x17 >= 0 && x17 < c12778x1b9c8edd.f172823b.getWidth() && y17 >= 0 && y17 < c12778x1b9c8edd.f172823b.getHeight()) {
            c12778x1b9c8edd.f172839r.mo50297x7c4d7ca2(c12778x1b9c8edd.f172835n, 250L);
        } else if (action == 1) {
            c12778x1b9c8edd.f172839r.mo50300x3fa464aa(c12778x1b9c8edd.f172835n);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillListPopupWindowBase$PopupTouchInterceptor", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

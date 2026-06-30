package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public class z implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase f91362d;

    public z(com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase autoFillListPopupWindowBase, com.tencent.mm.plugin.appbrand.widget.input.autofill.t tVar) {
        this.f91362d = autoFillListPopupWindowBase;
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
        com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase autoFillListPopupWindowBase = this.f91362d;
        if (action == 0 && (popupWindow = autoFillListPopupWindowBase.f91290b) != null && popupWindow.isShowing() && x17 >= 0 && x17 < autoFillListPopupWindowBase.f91290b.getWidth() && y17 >= 0 && y17 < autoFillListPopupWindowBase.f91290b.getHeight()) {
            autoFillListPopupWindowBase.f91306r.postDelayed(autoFillListPopupWindowBase.f91302n, 250L);
        } else if (action == 1) {
            autoFillListPopupWindowBase.f91306r.removeCallbacks(autoFillListPopupWindowBase.f91302n);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillListPopupWindowBase$PopupTouchInterceptor", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

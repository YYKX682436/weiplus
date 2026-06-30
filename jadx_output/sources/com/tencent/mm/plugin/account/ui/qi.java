package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class qi implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.SimpleLoginUI f74150d;

    public qi(com.tencent.mm.plugin.account.ui.SimpleLoginUI simpleLoginUI) {
        this.f74150d = simpleLoginUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/SimpleLoginUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.account.ui.SimpleLoginUI simpleLoginUI = this.f74150d;
        simpleLoginUI.f73664h.setFocusableInTouchMode(true);
        simpleLoginUI.f73663g.setFocusableInTouchMode(false);
        boolean onTouch = simpleLoginUI.f73664h.getDefaultOnTouchListener().onTouch(view, motionEvent);
        yj0.a.i(onTouch, this, "com/tencent/mm/plugin/account/ui/SimpleLoginUI$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouch;
    }
}

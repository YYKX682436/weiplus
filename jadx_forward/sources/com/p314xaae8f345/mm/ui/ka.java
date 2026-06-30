package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public class ka implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.eb f290572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ga f290573e;

    public ka(com.p314xaae8f345.mm.ui.ga gaVar, com.p314xaae8f345.mm.ui.eb ebVar) {
        this.f290573e = gaVar;
        this.f290572d = ebVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean onTouch;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMActivityController$13", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (this.f290573e.f290183j) {
            android.view.View.OnTouchListener onTouchListener = this.f290572d.f289923p;
            onTouch = onTouchListener != null ? onTouchListener.onTouch(view, motionEvent) : false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMActivityController", "callTouchCallback screen not enable.");
            onTouch = true;
        }
        yj0.a.i(onTouch, this, "com/tencent/mm/ui/MMActivityController$13", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouch;
    }
}

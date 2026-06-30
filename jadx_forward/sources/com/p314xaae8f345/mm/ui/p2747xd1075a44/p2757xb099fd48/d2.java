package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes.dex */
public class d2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f293295d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewParent f293296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f293297f;

    public d2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, android.view.ViewParent viewParent) {
        this.f293297f = y1Var;
        this.f293296e = viewParent;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f293296e.getParent().requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f293295d = true;
        } else if (action == 1) {
            if (this.f293295d) {
                this.f293297f.q();
            }
            this.f293295d = false;
        } else if (action == 3) {
            this.f293295d = false;
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}

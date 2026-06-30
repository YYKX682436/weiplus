package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes5.dex */
public final class ta implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f f211403d;

    public ta(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f) {
        this.f211403d = activityC15047x3a53ff1f;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderModifyNameUI$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f = this.f211403d;
        android.widget.EditText editText = activityC15047x3a53ff1f.f210162u;
        if (editText == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
            throw null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, editText)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                android.widget.ScrollView scrollView = activityC15047x3a53ff1f.A;
                if (scrollView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollView");
                    throw null;
                }
                scrollView.requestDisallowInterceptTouchEvent(true);
            } else if (actionMasked == 1 || actionMasked == 3) {
                android.widget.ScrollView scrollView2 = activityC15047x3a53ff1f.A;
                if (scrollView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollView");
                    throw null;
                }
                scrollView2.requestDisallowInterceptTouchEvent(false);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/ui/FinderModifyNameUI$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

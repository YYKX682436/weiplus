package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.LayoutWrapper */
/* loaded from: classes9.dex */
class C3326x9cc74de9 extends android.widget.LinearLayout {
    public C3326x9cc74de9(android.content.Context context, android.view.View view) {
        super(context);
        setGravity(16);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(view, layoutParams);
        setClickable(true);
        setLongClickable(true);
        view.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.kinda.framework.widget.base.LayoutWrapper.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                this.onTouchEvent(motionEvent);
                return false;
            }
        });
        view.setImportantForAccessibility(2);
    }
}

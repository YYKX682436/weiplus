package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
class LayoutWrapper extends android.widget.LinearLayout {
    public LayoutWrapper(android.content.Context context, android.view.View view) {
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

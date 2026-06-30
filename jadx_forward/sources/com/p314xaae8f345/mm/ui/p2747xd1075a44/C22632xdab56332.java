package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.MMTextView */
/* loaded from: classes12.dex */
public class C22632xdab56332 extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f292899d;

    /* renamed from: e, reason: collision with root package name */
    public al5.i2 f292900e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.GestureDetector f292901f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f292902g;

    public C22632xdab56332(android.content.Context context) {
        super(context);
        this.f292899d = false;
        this.f292900e = null;
        this.f292901f = null;
        this.f292902g = false;
        a();
    }

    public final void a() {
        this.f292901f = new android.view.GestureDetector(getContext(), new al5.g2(this), new android.os.Handler(android.os.Looper.getMainLooper()));
    }

    @Override // android.widget.TextView, android.view.View
    public void cancelLongPress() {
        this.f292899d = true;
        super.cancelLongPress();
    }

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        try {
            return super.getBaseline();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTextView", th6, "", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTextView", th6, "", new java.lang.Object[0]);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        try {
            super.onMeasure(i17, i18);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTextView", th6, "", new java.lang.Object[0]);
        }
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        try {
            return super.onPreDraw();
        } catch (java.lang.Throwable unused) {
            return true;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector;
        int action = motionEvent.getAction();
        boolean z17 = false;
        if (action == 1 && this.f292899d) {
            return true;
        }
        if (action == 0) {
            this.f292899d = false;
        }
        if (this.f292900e != null && (gestureDetector = this.f292901f) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(motionEvent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/widget/MMTextView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            z17 = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
            yj0.a.g(gestureDetector, z17, "com/tencent/mm/ui/widget/MMTextView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        return !z17 ? super.onTouchEvent(motionEvent) : z17;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean performLongClick() {
        this.f292899d = true;
        return super.performLongClick();
    }

    /* renamed from: setMMTextViewCallBack */
    public void m81397xf84c3199(al5.h2 h2Var) {
        if (this.f292902g || h2Var == null) {
            return;
        }
        this.f292902g = true;
    }

    /* renamed from: setOnDoubleClickLitsener */
    public void m81398x7671b388(al5.i2 i2Var) {
        this.f292900e = i2Var;
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    public C22632xdab56332(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f292899d = false;
        this.f292900e = null;
        this.f292901f = null;
        this.f292902g = false;
        a();
    }

    public C22632xdab56332(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f292899d = false;
        this.f292900e = null;
        this.f292901f = null;
        this.f292902g = false;
        a();
    }
}

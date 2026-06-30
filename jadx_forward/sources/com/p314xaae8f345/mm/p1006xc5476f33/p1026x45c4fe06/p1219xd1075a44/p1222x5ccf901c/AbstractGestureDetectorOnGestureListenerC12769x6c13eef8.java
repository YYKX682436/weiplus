package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.DragRecyclerView */
/* loaded from: classes8.dex */
public abstract class AbstractGestureDetectorOnGestureListenerC12769x6c13eef8 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: b2, reason: collision with root package name */
    public android.view.GestureDetector f172656b2;

    /* renamed from: c2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 f172657c2;

    /* renamed from: d2, reason: collision with root package name */
    public boolean f172658d2;

    public AbstractGestureDetectorOnGestureListenerC12769x6c13eef8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f172658d2 = false;
        this.f172656b2 = new android.view.GestureDetector(context, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 abstractGestureDetectorOnGestureListenerC12768x381d68c7;
        android.content.Context context = getContext();
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isInMultiWindowMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        android.view.GestureDetector gestureDetector = this.f172656b2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (this.f172658d2 || ((motionEvent.getAction() == 3 || motionEvent.getAction() == 1) && (abstractGestureDetectorOnGestureListenerC12768x381d68c7 = this.f172657c2) != null && abstractGestureDetectorOnGestureListenerC12768x381d68c7.f172654y)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 abstractGestureDetectorOnGestureListenerC12768x381d68c72 = this.f172657c2;
            if (abstractGestureDetectorOnGestureListenerC12768x381d68c72 != null) {
                abstractGestureDetectorOnGestureListenerC12768x381d68c72.onTouch(this, motionEvent);
            }
            int action = motionEvent.getAction();
            motionEvent.setAction(3);
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                getChildAt(i17).dispatchTouchEvent(motionEvent);
            }
            motionEvent.setAction(action);
        } else if (motionEvent.getAction() == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 abstractGestureDetectorOnGestureListenerC12768x381d68c73 = this.f172657c2;
            abstractGestureDetectorOnGestureListenerC12768x381d68c73.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DragFeatureView", "cancelGestureDetector");
            android.view.GestureDetector gestureDetector2 = abstractGestureDetectorOnGestureListenerC12768x381d68c73.f172640h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(motionEvent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(gestureDetector2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "cancelGestureDetector", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(gestureDetector2, gestureDetector2.onTouchEvent((android.view.MotionEvent) arrayList2.get(0)), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "cancelGestureDetector", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        return this.f172658d2 || super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: getDragRubbishView */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 m53374x64bf9516() {
        return this.f172657c2;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        if (this.f172658d2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DragRecyclerView", "onLongPress ignore");
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 abstractGestureDetectorOnGestureListenerC12768x381d68c7 = this.f172657c2;
        if (abstractGestureDetectorOnGestureListenerC12768x381d68c7 != null) {
            abstractGestureDetectorOnGestureListenerC12768x381d68c7.onLongPress(motionEvent);
            this.f172658d2 = this.f172657c2.getVisibility() == 0;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    /* renamed from: setLongPress */
    public void m53375x628fcce5(boolean z17) {
        this.f172658d2 = z17;
    }

    public AbstractGestureDetectorOnGestureListenerC12769x6c13eef8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f172658d2 = false;
        this.f172656b2 = new android.view.GestureDetector(context, this);
    }

    public AbstractGestureDetectorOnGestureListenerC12769x6c13eef8(android.content.Context context) {
        super(context, null);
        this.f172658d2 = false;
        this.f172656b2 = new android.view.GestureDetector(context, this);
    }
}

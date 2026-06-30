package com.tencent.mm.plugin.appbrand.widget.desktop;

/* loaded from: classes8.dex */
public abstract class DragRecyclerView extends androidx.recyclerview.widget.RecyclerView implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: b2, reason: collision with root package name */
    public android.view.GestureDetector f91123b2;

    /* renamed from: c2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView f91124c2;

    /* renamed from: d2, reason: collision with root package name */
    public boolean f91125d2;

    public DragRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91125d2 = false;
        this.f91123b2 = new android.view.GestureDetector(context, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView dragFeatureView;
        android.content.Context context = getContext();
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isInMultiWindowMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        android.view.GestureDetector gestureDetector = this.f91123b2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (this.f91125d2 || ((motionEvent.getAction() == 3 || motionEvent.getAction() == 1) && (dragFeatureView = this.f91124c2) != null && dragFeatureView.f91121y)) {
            com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView dragFeatureView2 = this.f91124c2;
            if (dragFeatureView2 != null) {
                dragFeatureView2.onTouch(this, motionEvent);
            }
            int action = motionEvent.getAction();
            motionEvent.setAction(3);
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                getChildAt(i17).dispatchTouchEvent(motionEvent);
            }
            motionEvent.setAction(action);
        } else if (motionEvent.getAction() == 3) {
            com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView dragFeatureView3 = this.f91124c2;
            dragFeatureView3.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.DragFeatureView", "cancelGestureDetector");
            android.view.GestureDetector gestureDetector2 = dragFeatureView3.f91107h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(motionEvent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(gestureDetector2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "cancelGestureDetector", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(gestureDetector2, gestureDetector2.onTouchEvent((android.view.MotionEvent) arrayList2.get(0)), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "cancelGestureDetector", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        return this.f91125d2 || super.dispatchTouchEvent(motionEvent);
    }

    public com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView getDragRubbishView() {
        return this.f91124c2;
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
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        if (this.f91125d2) {
            com.tencent.mars.xlog.Log.i("DragRecyclerView", "onLongPress ignore");
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView dragFeatureView = this.f91124c2;
        if (dragFeatureView != null) {
            dragFeatureView.onLongPress(motionEvent);
            this.f91125d2 = this.f91124c2.getVisibility() == 0;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
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

    public void setLongPress(boolean z17) {
        this.f91125d2 = z17;
    }

    public DragRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f91125d2 = false;
        this.f91123b2 = new android.view.GestureDetector(context, this);
    }

    public DragRecyclerView(android.content.Context context) {
        super(context, null);
        this.f91125d2 = false;
        this.f91123b2 = new android.view.GestureDetector(context, this);
    }
}

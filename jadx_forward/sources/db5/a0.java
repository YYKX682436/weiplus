package db5;

/* loaded from: classes15.dex */
public class a0 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3 f309808d;

    public a0(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3 c21478xd3361da3, db5.x xVar) {
        this.f309808d = c21478xd3361da3;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        this.f309808d.g(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        this.f309808d.h(motionEvent, motionEvent2, f17, f18);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        int i17 = com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3.H;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3 c21478xd3361da3 = this.f309808d;
        c21478xd3361da3.k();
        int d17 = c21478xd3361da3.d((int) motionEvent.getX(), (int) motionEvent.getY());
        if (d17 >= 0 && !c21478xd3361da3.C) {
            android.view.View childAt = c21478xd3361da3.getChildAt(d17);
            android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener = c21478xd3361da3.getOnItemLongClickListener();
            if (onItemLongClickListener != null) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3 c21478xd3361da32 = this.f309808d;
                int i18 = c21478xd3361da32.f278823u + d17;
                if (onItemLongClickListener.onItemLongClick(c21478xd3361da32, childAt, i18, c21478xd3361da32.f278812g.getItemId(i18))) {
                    c21478xd3361da3.performHapticFeedback(0);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        int i17 = com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3.H;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3 c21478xd3361da3 = this.f309808d;
        c21478xd3361da3.i(bool);
        c21478xd3361da3.m78893xf667fe8d(db5.b0.SCROLL_STATE_TOUCH_SCROLL);
        c21478xd3361da3.k();
        c21478xd3361da3.f278820r += (int) f17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3.b(c21478xd3361da3, java.lang.Math.round(f17));
        c21478xd3361da3.requestLayout();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        int i17 = com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3.H;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3 c21478xd3361da3 = this.f309808d;
        c21478xd3361da3.k();
        android.widget.AdapterView.OnItemClickListener onItemClickListener = c21478xd3361da3.getOnItemClickListener();
        int d17 = c21478xd3361da3.d((int) motionEvent.getX(), (int) motionEvent.getY());
        if (d17 >= 0 && !c21478xd3361da3.C) {
            android.view.View childAt = c21478xd3361da3.getChildAt(d17);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3 c21478xd3361da32 = this.f309808d;
            int i18 = c21478xd3361da32.f278823u + d17;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(c21478xd3361da32, childAt, i18, c21478xd3361da32.f278812g.getItemId(i18));
                return true;
            }
        }
        android.view.View.OnClickListener onClickListener = c21478xd3361da3.E;
        if (onClickListener == null || c21478xd3361da3.C) {
            return false;
        }
        onClickListener.onClick(c21478xd3361da3);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/ui/base/HorizontalListViewV2$GestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}

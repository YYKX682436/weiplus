package db5;

/* loaded from: classes15.dex */
public class v extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21477xd5dd28c7 f310081d;

    public v(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21477xd5dd28c7 c21477xd5dd28c7) {
        this.f310081d = c21477xd5dd28c7;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/HorizontalListView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/ui/base/HorizontalListView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/HorizontalListView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/ui/base/HorizontalListView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        this.f310081d.f278801n.forceFinished(true);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21477xd5dd28c7 c21477xd5dd28c7 = this.f310081d;
        synchronized (c21477xd5dd28c7) {
            c21477xd5dd28c7.f278801n.fling(c21477xd5dd28c7.f278798h, 0, (int) (-f17), 0, 0, c21477xd5dd28c7.f278799i, 0, 0);
        }
        c21477xd5dd28c7.requestLayout();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/HorizontalListView$3", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/ui/base/HorizontalListView$3", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21477xd5dd28c7 c21477xd5dd28c7;
        synchronized (this.f310081d) {
            c21477xd5dd28c7 = this.f310081d;
            c21477xd5dd28c7.f278798h += (int) f17;
        }
        c21477xd5dd28c7.requestLayout();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21477xd5dd28c7 c21477xd5dd28c7 = this.f310081d;
            if (i17 >= c21477xd5dd28c7.getChildCount()) {
                break;
            }
            android.view.View childAt = c21477xd5dd28c7.getChildAt(i17);
            rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21477xd5dd28c7 c21477xd5dd28c72 = this.f310081d;
                android.widget.AdapterView.OnItemClickListener onItemClickListener = c21477xd5dd28c72.f278805r;
                if (onItemClickListener != null) {
                    int i18 = c21477xd5dd28c72.f278795e;
                    onItemClickListener.onItemClick(c21477xd5dd28c72, childAt, i18 + 1 + i17, c21477xd5dd28c72.f278794d.getItemId(i18 + 1 + i17));
                }
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21477xd5dd28c7 c21477xd5dd28c73 = this.f310081d;
                android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = c21477xd5dd28c73.f278804q;
                if (onItemSelectedListener != null) {
                    int i19 = c21477xd5dd28c73.f278795e;
                    onItemSelectedListener.onItemSelected(c21477xd5dd28c73, childAt, i19 + 1 + i17, c21477xd5dd28c73.f278794d.getItemId(i19 + 1 + i17));
                }
            } else {
                i17++;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/HorizontalListView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/ui/base/HorizontalListView$3", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}

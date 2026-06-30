package db5;

/* loaded from: classes15.dex */
public class l3 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 f309964d;

    public l3(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 c21500x7be515c9) {
        this.f309964d = c21500x7be515c9;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMHorList$3", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/ui/base/MMHorList$3", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMHorList$3", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/ui/base/MMHorList$3", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        this.f309964d.f278971q.forceFinished(true);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 c21500x7be515c9 = this.f309964d;
        c21500x7be515c9.f278971q.fling(c21500x7be515c9.f278966i, 0, (int) (-f17), 0, 0, c21500x7be515c9.f278967m, 0, 0);
        c21500x7be515c9.requestLayout();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMHorList$3", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/ui/base/MMHorList$3", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 c21500x7be515c9 = this.f309964d;
        c21500x7be515c9.f278966i += (int) f17;
        c21500x7be515c9.requestLayout();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 c21500x7be515c9 = this.f309964d;
            if (i17 >= c21500x7be515c9.getChildCount()) {
                break;
            }
            android.view.View childAt = c21500x7be515c9.getChildAt(i17);
            rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 c21500x7be515c92 = this.f309964d;
                android.widget.AdapterView.OnItemClickListener onItemClickListener = c21500x7be515c92.f278974t;
                if (onItemClickListener != null) {
                    int i18 = c21500x7be515c92.f278962e;
                    onItemClickListener.onItemClick(c21500x7be515c92, childAt, i18 + 1 + i17, c21500x7be515c92.f278975u.getItemId(i18 + 1 + i17));
                }
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 c21500x7be515c93 = this.f309964d;
                android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = c21500x7be515c93.f278973s;
                if (onItemSelectedListener != null) {
                    int i19 = c21500x7be515c93.f278962e;
                    onItemSelectedListener.onItemSelected(c21500x7be515c93, childAt, i19 + 1 + i17, c21500x7be515c93.f278975u.getItemId(i19 + 1 + i17));
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
        yj0.a.b("com/tencent/mm/ui/base/MMHorList$3", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/ui/base/MMHorList$3", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}

package if1;

/* loaded from: classes7.dex */
public abstract class s {
    public static boolean a(android.view.ViewGroup viewGroup, android.view.MotionEvent motionEvent, boolean z17, android.view.View view, int i17) {
        android.view.MotionEvent obtain;
        if (view == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (z17 || action == 3) {
            motionEvent.setAction(3);
            boolean dispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
            motionEvent.setAction(action);
            return dispatchTouchEvent;
        }
        int pointerCount = motionEvent.getPointerCount();
        int i18 = 0;
        for (int i19 = 0; i19 < pointerCount; i19++) {
            i18 |= 1 << motionEvent.getPointerId(i19);
        }
        int i27 = i17 & i18;
        if (i27 == 0) {
            return false;
        }
        boolean isIdentity = view.getMatrix().isIdentity();
        if (i27 != i18) {
            android.view.MotionEvent c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1221x2e06d1.C12764xd5406843.c(motionEvent, i27);
            obtain = c17 == null ? android.view.MotionEvent.obtain(motionEvent) : c17;
        } else {
            if (isIdentity) {
                float scrollX = viewGroup.getScrollX() - view.getLeft();
                float scrollY = viewGroup.getScrollY() - view.getTop();
                motionEvent.offsetLocation(scrollX, scrollY);
                boolean dispatchTouchEvent2 = view.dispatchTouchEvent(motionEvent);
                motionEvent.offsetLocation(-scrollX, -scrollY);
                return dispatchTouchEvent2;
            }
            obtain = android.view.MotionEvent.obtain(motionEvent);
        }
        obtain.offsetLocation(viewGroup.getScrollX() - view.getLeft(), viewGroup.getScrollY() - view.getTop());
        if (!isIdentity) {
            android.graphics.Matrix matrix = (android.graphics.Matrix) view.getTag(com.p314xaae8f345.mm.R.id.f564782a36);
            if (matrix == null) {
                matrix = new android.graphics.Matrix();
                view.setTag(com.p314xaae8f345.mm.R.id.f564782a36, matrix);
            }
            view.getMatrix().invert(matrix);
            obtain.transform(matrix);
        }
        boolean dispatchTouchEvent3 = view.dispatchTouchEvent(obtain);
        obtain.recycle();
        return dispatchTouchEvent3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(android.view.ViewGroup viewGroup, android.view.MotionEvent motionEvent) {
        int childCount = viewGroup.getChildCount();
        int pointerId = viewGroup.isMotionEventSplittingEnabled() ? 1 << motionEvent.getPointerId(motionEvent.getActionIndex()) : -1;
        for (int i17 = childCount - 1; i17 >= 0; i17--) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1221x2e06d1.C12764xd5406843.a(childAt) && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1221x2e06d1.C12764xd5406843.b(viewGroup, x17, y17, childAt, null) && childAt.isDuplicateParentStateEnabled()) {
                a(viewGroup, motionEvent, false, childAt, pointerId);
                if ((childAt instanceof gb1.j) && ((gb1.j) childAt).a()) {
                    return;
                }
            }
        }
    }

    public static if1.r c(android.view.View view) {
        view.getLocationOnScreen(new int[2]);
        return new if1.r(0, r0[0], r0[1]);
    }
}

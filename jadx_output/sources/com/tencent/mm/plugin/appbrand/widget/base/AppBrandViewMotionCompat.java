package com.tencent.mm.plugin.appbrand.widget.base;

/* loaded from: classes7.dex */
public final class AppBrandViewMotionCompat {

    /* renamed from: a, reason: collision with root package name */
    public static android.view.MotionEvent.PointerCoords[] f91056a;

    /* renamed from: b, reason: collision with root package name */
    public static android.view.MotionEvent.PointerProperties[] f91057b;

    /* renamed from: c, reason: collision with root package name */
    public static int[] f91058c;

    public static boolean a(android.view.View view) {
        return view.getVisibility() == 0 || view.getAnimation() != null;
    }

    public static boolean b(android.view.ViewGroup viewGroup, float f17, float f18, android.view.View view, android.graphics.PointF pointF) {
        float[] fArr = {0.0f, 0.0f};
        fArr[0] = f17 + (viewGroup.getScrollX() - view.getLeft());
        fArr[1] = f18 + (viewGroup.getScrollY() - view.getTop());
        android.graphics.Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.invert(matrix);
            matrix.mapPoints(fArr);
        }
        float f19 = fArr[0];
        boolean z17 = f19 >= 0.0f && fArr[1] >= 0.0f && f19 < ((float) (view.getRight() - view.getLeft())) && fArr[1] < ((float) (view.getBottom() - view.getTop()));
        if (z17 && pointF != null) {
            pointF.set(fArr[0], fArr[1]);
        }
        return z17;
    }

    public static android.view.MotionEvent c(android.view.MotionEvent motionEvent, int i17) {
        int i18;
        int i19;
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr;
        android.view.MotionEvent motionEvent2 = motionEvent;
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.RuntimeException("Should be called on main-thread");
        }
        int pointerCount = motionEvent.getPointerCount();
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr2 = f91056a;
        if (pointerCoordsArr2 == null || pointerCoordsArr2.length < pointerCount) {
            int length = pointerCoordsArr2 != null ? pointerCoordsArr2.length : 8;
            while (length < pointerCount) {
                length *= 2;
            }
            android.view.MotionEvent.PointerCoords[] pointerCoordsArr3 = new android.view.MotionEvent.PointerCoords[length];
            for (int i27 = 0; i27 < length; i27++) {
                pointerCoordsArr3[i27] = new android.view.MotionEvent.PointerCoords();
            }
            f91056a = pointerCoordsArr3;
            android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[length];
            for (int i28 = 0; i28 < length; i28++) {
                pointerPropertiesArr[i28] = new android.view.MotionEvent.PointerProperties();
            }
            f91057b = pointerPropertiesArr;
            f91058c = new int[length];
        }
        android.view.MotionEvent.PointerProperties[] pointerPropertiesArr2 = f91057b;
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr4 = f91056a;
        int[] iArr = f91058c;
        int action = motionEvent.getAction();
        int i29 = action & 255;
        int i37 = (65280 & action) >> 8;
        int i38 = -1;
        int i39 = 0;
        for (int i47 = 0; i47 < pointerCount; i47++) {
            motionEvent2.getPointerProperties(i47, pointerPropertiesArr2[i39]);
            if (((1 << pointerPropertiesArr2[i39].id) & i17) != 0) {
                if (i47 == i37) {
                    i38 = i39;
                }
                iArr[i39] = i47;
                i39++;
            }
        }
        if (i39 == 0) {
            throw new java.lang.IllegalArgumentException("idBits did not match any ids in the event");
        }
        if (i29 == 5 || i29 == 6) {
            action = i38 < 0 ? 2 : i39 == 1 ? i29 == 5 ? 0 : 1 : i29 | (i38 << 8);
        }
        int i48 = action;
        int historySize = motionEvent.getHistorySize();
        android.view.MotionEvent motionEvent3 = null;
        int i49 = 0;
        while (i49 <= historySize) {
            int i57 = i49 == historySize ? Integer.MIN_VALUE : i49;
            for (int i58 = 0; i58 < i39; i58++) {
                motionEvent2.getHistoricalPointerCoords(iArr[i58], i57, pointerCoordsArr4[i58]);
            }
            long historicalEventTime = motionEvent2.getHistoricalEventTime(i57);
            if (i49 == 0) {
                i18 = i49;
                i19 = i39;
                pointerCoordsArr = pointerCoordsArr4;
                motionEvent3 = android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i48, i39, pointerPropertiesArr2, pointerCoordsArr4, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
                motionEvent3.offsetLocation(motionEvent3.getX() - motionEvent3.getRawX(), motionEvent3.getY() - motionEvent3.getRawY());
            } else {
                i18 = i49;
                i19 = i39;
                pointerCoordsArr = pointerCoordsArr4;
                motionEvent3.addBatch(historicalEventTime, pointerCoordsArr, 0);
            }
            i49 = i18 + 1;
            pointerCoordsArr4 = pointerCoordsArr;
            i39 = i19;
            motionEvent2 = motionEvent;
        }
        return motionEvent3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(android.view.View view) {
        return view != 0 && (view instanceof bl1.c) && ((bl1.c) view).g();
    }

    public static boolean dispatchTransformedTouchEvent(android.view.ViewGroup viewGroup, android.view.MotionEvent motionEvent, boolean z17, android.view.View view, int i17) {
        android.view.MotionEvent c17;
        if (viewGroup == null || motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (z17 || action == 3) {
            motionEvent.setAction(3);
            if (view == null) {
                return false;
            }
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
        if (i27 != i18) {
            try {
                c17 = c(motionEvent, i27);
            } catch (java.lang.IllegalArgumentException e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandViewMotionCompat", "dispatchTransformedTouchEvent e=%s", e17.getMessage());
                return false;
            }
        } else {
            if (view == null || view.getMatrix().isIdentity()) {
                if (view == null) {
                    return false;
                }
                float scrollX = viewGroup.getScrollX() - view.getLeft();
                float scrollY = viewGroup.getScrollY() - view.getTop();
                motionEvent.offsetLocation(scrollX, scrollY);
                boolean dispatchTouchEvent2 = view.dispatchTouchEvent(motionEvent);
                motionEvent.offsetLocation(-scrollX, -scrollY);
                return dispatchTouchEvent2;
            }
            c17 = android.view.MotionEvent.obtain(motionEvent);
        }
        if (view == null) {
            return false;
        }
        c17.offsetLocation(viewGroup.getScrollX() - view.getLeft(), viewGroup.getScrollY() - view.getTop());
        if (!view.getMatrix().isIdentity()) {
            android.graphics.Matrix matrix = view.getMatrix();
            matrix.invert(matrix);
            c17.transform(matrix);
        }
        boolean dispatchTouchEvent3 = view.dispatchTouchEvent(c17);
        c17.recycle();
        return dispatchTouchEvent3;
    }
}

package com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p323x36f002;

/* loaded from: classes13.dex */
public class a {
    public static float a(android.view.MotionEvent motionEvent) {
        float x17 = motionEvent.getX(0) - motionEvent.getX(1);
        float y17 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) java.lang.Math.sqrt((x17 * x17) + (y17 * y17));
    }
}

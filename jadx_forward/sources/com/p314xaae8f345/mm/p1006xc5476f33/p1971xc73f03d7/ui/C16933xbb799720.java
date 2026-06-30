package com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.EmbedWebView */
/* loaded from: classes8.dex */
public class C16933xbb799720 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 {
    public final android.view.GestureDetector G;
    public boolean H;
    public final float[] I;

    /* renamed from: J, reason: collision with root package name */
    public final float[] f236402J;
    public final float[] K;
    public final float[] L;

    public C16933xbb799720(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = false;
        this.I = new float[2];
        this.f236402J = new float[2];
        this.K = new float[2];
        this.L = new float[2];
        this.G = new android.view.GestureDetector(new os3.k1(this));
        postDelayed(new os3.m1(this), 100L);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        float[] fArr;
        float[] fArr2;
        boolean z17;
        android.view.GestureDetector gestureDetector = this.G;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/EmbedWebView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        int i17 = 0;
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/qqmail/ui/EmbedWebView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (this.H) {
            int action = motionEvent.getAction() & 255;
            int pointerCount = motionEvent.getPointerCount();
            if (pointerCount != 2) {
                z17 = true;
            } else {
                float[] fArr3 = this.f236402J;
                float[] fArr4 = this.I;
                if (action != 2) {
                    if (action == 5) {
                        while (i17 < pointerCount) {
                            fArr4[i17] = motionEvent.getX(i17);
                            fArr3[i17] = motionEvent.getY(i17);
                            i17++;
                        }
                    }
                    z17 = true;
                } else {
                    int i18 = 0;
                    while (true) {
                        fArr = this.L;
                        fArr2 = this.K;
                        if (i18 >= pointerCount) {
                            break;
                        }
                        fArr2[i18] = motionEvent.getX(i18);
                        fArr[i18] = motionEvent.getY(i18);
                        i18++;
                    }
                    float pow = (float) (java.lang.Math.pow(fArr4[1] - fArr4[0], 2.0d) + java.lang.Math.pow(fArr3[1] - fArr3[0], 2.0d));
                    float pow2 = (float) (java.lang.Math.pow(fArr2[1] - fArr2[0], 2.0d) + java.lang.Math.pow(fArr[1] - fArr[0], 2.0d));
                    if (pow - pow2 > 20000.0f) {
                        mo120196xf9711e7b();
                    } else if (pow2 - pow > 20000.0f) {
                        mo120195xd67f8458();
                    }
                    fArr4[0] = fArr2[0];
                    z17 = true;
                    fArr4[1] = fArr2[1];
                    fArr3[0] = fArr[0];
                    fArr3[1] = fArr[1];
                }
                i17 = z17 ? 1 : 0;
            }
            if (i17 != 0) {
                return z17;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}

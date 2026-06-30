package io.p3277xa1c40a32.p3283xc97dd6cb;

/* renamed from: io.clipworks.displaysys.DSViewProxy */
/* loaded from: classes5.dex */
public abstract class AbstractC28530xd96ac6fa {

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f70390x39e86013 = m136923xfce9a72c();

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m136923xfce9a72c();

    /* renamed from: nativeOnDidAttachToWindow */
    private native void m136924xe8229859();

    /* renamed from: nativeOnDidDetachFromWindow */
    private native void m136925x953cd696();

    /* renamed from: nativeOnSizeDidChange */
    private native void m136926xe5f3d558(int i17, int i18, int i19, int i27);

    /* renamed from: nativeOnSurfaceDidChange */
    private native void m136927x8f989758(int i17, int i18, int i19);

    /* renamed from: nativeOnSurfaceDidCreate */
    private native void m136928x902724a4(android.view.Surface surface);

    /* renamed from: nativeOnSurfaceDidDestroy */
    private native void m136929x94429152();

    /* renamed from: nativeOnTouchesBegin */
    private native void m136930x2544b7f2(int i17, float f17, float f18, long j17);

    /* renamed from: nativeOnTouchesCancel */
    private native void m136931x84d1d851(int[] iArr, float[] fArr, float[] fArr2, long j17);

    /* renamed from: nativeOnTouchesEnd */
    private native void m136932xc01b0664(int i17, float f17, float f18, long j17);

    /* renamed from: nativeOnTouchesMove */
    private native void m136933x43496f68(int[] iArr, float[] fArr, float[] fArr2, long j17);

    /* renamed from: nativeOnVisibilityDidChange */
    private native void m136934x9e6c15e7(boolean z17);

    /* renamed from: getHeight */
    public abstract int mo136911x1c4fb41d();

    /* renamed from: getScaleFactor */
    public abstract float mo136912x91b49603();

    /* renamed from: getVisibility */
    public abstract int mo136914x61f71b08();

    /* renamed from: getWidth */
    public abstract int mo136915x755bd410();

    /* renamed from: getX */
    public abstract float mo136916x305bc2();

    /* renamed from: getY */
    public abstract float mo136917x305bc3();

    /* renamed from: notifyOnDidAttachToWindow */
    public void m136935xff4dcfe7() {
        m136924xe8229859();
    }

    /* renamed from: notifyOnDidDetachFromWindow */
    public void m136936x8e7862a4() {
        m136925x953cd696();
    }

    /* renamed from: notifyOnSizeDidChange */
    public void m136937x259503e6(int i17, int i18, int i19, int i27) {
        m136926xe5f3d558(i17, i18, i19, i27);
    }

    /* renamed from: notifyOnTouchEvent */
    public boolean m136938xac03f7c3(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        long eventTime = motionEvent.getEventTime();
        int[] iArr = new int[pointerCount];
        float[] fArr = new float[pointerCount];
        float[] fArr2 = new float[pointerCount];
        for (int i17 = 0; i17 < pointerCount; i17++) {
            iArr[i17] = motionEvent.getPointerId(i17);
            fArr[i17] = motionEvent.getX(i17);
            fArr2[i17] = motionEvent.getY(i17);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            m136930x2544b7f2(motionEvent.getPointerId(0), fArr[0], fArr2[0], eventTime);
        } else if (action == 1) {
            m136932xc01b0664(motionEvent.getPointerId(0), fArr[0], fArr2[0], eventTime);
        } else if (action == 2) {
            m136933x43496f68(iArr, fArr, fArr2, eventTime);
        } else if (action == 3) {
            m136931x84d1d851(iArr, fArr, fArr2, eventTime);
        } else if (action == 5) {
            int action2 = motionEvent.getAction() >> 8;
            m136930x2544b7f2(motionEvent.getPointerId(action2), motionEvent.getX(action2), motionEvent.getY(action2), eventTime);
        } else if (action == 6) {
            int action3 = motionEvent.getAction() >> 8;
            m136932xc01b0664(motionEvent.getPointerId(action3), motionEvent.getX(action3), motionEvent.getY(action3), eventTime);
        }
        return true;
    }

    /* renamed from: notifyOnVisibilityDidChange */
    public void m136939x97a7a1f5(boolean z17) {
        m136934x9e6c15e7(z17);
    }

    /* renamed from: notifySurfaceChanged */
    public void mo136918xa36f50f0(int i17, int i18, int i19) {
        m136927x8f989758(i17, i18, i19);
    }

    /* renamed from: notifySurfaceCreated */
    public void m136940xb4b26d24(android.view.Surface surface) {
        m136928x902724a4(surface);
    }

    /* renamed from: notifySurfaceDidDestroy */
    public void m136941x26cc0ebf() {
        m136929x94429152();
    }
}

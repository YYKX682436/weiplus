package com.tencent.magicbrush.handler;

/* loaded from: classes7.dex */
public class JsTouchEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public java.nio.IntBuffer f48632a;

    /* renamed from: b, reason: collision with root package name */
    public java.nio.FloatBuffer f48633b;

    /* renamed from: c, reason: collision with root package name */
    public final ch.d f48634c = new ch.d(this);

    public JsTouchEventHandler() {
        b(10);
    }

    private native long nativeCreateTouchEvent(int i17, int i18, int i19, java.nio.IntBuffer intBuffer, java.nio.FloatBuffer floatBuffer, long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeFreeTouchEvent(long j17);

    public final void b(int i17) {
        int i18;
        java.nio.IntBuffer intBuffer = this.f48632a;
        if (intBuffer != null && intBuffer.capacity() >= i17) {
            this.f48632a.clear();
            this.f48633b.clear();
            return;
        }
        java.nio.IntBuffer intBuffer2 = this.f48632a;
        if (intBuffer2 != null) {
            i18 = intBuffer2.capacity();
            while (i18 < i17) {
                i18 *= 2;
            }
        } else {
            i18 = i17;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.nio.IntBuffer intBuffer3 = this.f48632a;
        objArr[0] = java.lang.Integer.valueOf(intBuffer3 == null ? 0 : intBuffer3.capacity());
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        ah.i.b("MicroMsg.JsTouchEventHandler", "Should Create A New Buffer, Current = [%d], Request = [%d], ShouldBe = [%d]", objArr);
        this.f48632a = java.nio.ByteBuffer.allocateDirect(i18 * 4).order(java.nio.ByteOrder.nativeOrder()).asIntBuffer();
        this.f48633b = java.nio.ByteBuffer.allocateDirect(i18 * 6 * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public long c(int i17, int i18, long j17, java.util.List list, float f17) {
        b(list.size());
        int e17 = e(i17);
        if (e17 == -1) {
            return 0L;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ch.c cVar = (ch.c) it.next();
            this.f48632a.put(cVar.f41176a);
            this.f48633b.put(cVar.f41177b);
            this.f48633b.put(cVar.f41178c);
            this.f48633b.put(0.0f);
            this.f48633b.put(0.0f);
            this.f48633b.put(0.0f);
            this.f48633b.put(java.lang.Math.max(0.0f, 0.0f));
        }
        return nativeCreateTouchEvent(e17, i18, list.size(), this.f48632a, this.f48633b, j17);
    }

    public long d(android.view.MotionEvent motionEvent, float f17, boolean z17) {
        b(motionEvent.getPointerCount());
        if (e(motionEvent.getActionMasked()) == -1) {
            return 0L;
        }
        int pointerCount = motionEvent.getPointerCount();
        int i17 = 0;
        while (i17 < pointerCount) {
            this.f48632a.put(motionEvent.getPointerId(i17));
            if (z17) {
                this.f48633b.put(i17 == 0 ? motionEvent.getRawX() : motionEvent.getX(i17) + (motionEvent.getRawX() - motionEvent.getX()));
                this.f48633b.put(i17 == 0 ? motionEvent.getRawY() : motionEvent.getY(i17) + (motionEvent.getRawY() - motionEvent.getY()));
            } else {
                this.f48633b.put(motionEvent.getX(i17));
                this.f48633b.put(motionEvent.getY(i17));
            }
            float touchMinor = motionEvent.getTouchMinor(i17) / 2.0f;
            float touchMajor = motionEvent.getTouchMajor(i17) / 2.0f;
            float round = java.lang.Math.round((motionEvent.getOrientation(i17) / 3.1415927f) * 180.0f);
            if (round >= 90.0f) {
                round -= 180.0f;
            } else if (round < -90.0f) {
                round += 180.0f;
            }
            if (round >= 0.0f) {
                touchMajor = touchMinor;
                touchMinor = touchMajor;
            } else {
                round += 90.0f;
            }
            this.f48633b.put(touchMinor);
            this.f48633b.put(touchMajor);
            this.f48633b.put(round);
            this.f48633b.put(java.lang.Math.max(0.0f, motionEvent.getPressure(i17)));
            i17++;
        }
        return nativeCreateTouchEvent(e(motionEvent.getActionMasked()), motionEvent.getActionIndex(), pointerCount, this.f48632a, this.f48633b, motionEvent.getEventTime());
    }

    public final int e(int i17) {
        if (i17 == 0) {
            return 0;
        }
        int i18 = 1;
        if (i17 != 1) {
            if (i17 != 2) {
                i18 = 3;
                if (i17 != 3) {
                    if (i17 == 5) {
                        return 0;
                    }
                    if (i17 != 6) {
                        return -1;
                    }
                }
            }
            return i18;
        }
        return 2;
    }
}

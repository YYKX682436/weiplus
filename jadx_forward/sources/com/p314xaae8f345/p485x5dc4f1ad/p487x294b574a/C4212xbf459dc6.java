package com.p314xaae8f345.p485x5dc4f1ad.p487x294b574a;

/* renamed from: com.tencent.magicbrush.handler.JsTouchEventHandler */
/* loaded from: classes7.dex */
public class C4212xbf459dc6 {

    /* renamed from: a, reason: collision with root package name */
    public java.nio.IntBuffer f130165a;

    /* renamed from: b, reason: collision with root package name */
    public java.nio.FloatBuffer f130166b;

    /* renamed from: c, reason: collision with root package name */
    public final ch.d f130167c = new ch.d(this);

    public C4212xbf459dc6() {
        b(10);
    }

    /* renamed from: nativeCreateTouchEvent */
    private native long m34824x2bda4aee(int i17, int i18, int i19, java.nio.IntBuffer intBuffer, java.nio.FloatBuffer floatBuffer, long j17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeFreeTouchEvent */
    public native void m34825xe02ed61e(long j17);

    public final void b(int i17) {
        int i18;
        java.nio.IntBuffer intBuffer = this.f130165a;
        if (intBuffer != null && intBuffer.capacity() >= i17) {
            this.f130165a.clear();
            this.f130166b.clear();
            return;
        }
        java.nio.IntBuffer intBuffer2 = this.f130165a;
        if (intBuffer2 != null) {
            i18 = intBuffer2.capacity();
            while (i18 < i17) {
                i18 *= 2;
            }
        } else {
            i18 = i17;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.nio.IntBuffer intBuffer3 = this.f130165a;
        objArr[0] = java.lang.Integer.valueOf(intBuffer3 == null ? 0 : intBuffer3.capacity());
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        ah.i.b("MicroMsg.JsTouchEventHandler", "Should Create A New Buffer, Current = [%d], Request = [%d], ShouldBe = [%d]", objArr);
        this.f130165a = java.nio.ByteBuffer.allocateDirect(i18 * 4).order(java.nio.ByteOrder.nativeOrder()).asIntBuffer();
        this.f130166b = java.nio.ByteBuffer.allocateDirect(i18 * 6 * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
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
            this.f130165a.put(cVar.f122709a);
            this.f130166b.put(cVar.f122710b);
            this.f130166b.put(cVar.f122711c);
            this.f130166b.put(0.0f);
            this.f130166b.put(0.0f);
            this.f130166b.put(0.0f);
            this.f130166b.put(java.lang.Math.max(0.0f, 0.0f));
        }
        return m34824x2bda4aee(e17, i18, list.size(), this.f130165a, this.f130166b, j17);
    }

    public long d(android.view.MotionEvent motionEvent, float f17, boolean z17) {
        b(motionEvent.getPointerCount());
        if (e(motionEvent.getActionMasked()) == -1) {
            return 0L;
        }
        int pointerCount = motionEvent.getPointerCount();
        int i17 = 0;
        while (i17 < pointerCount) {
            this.f130165a.put(motionEvent.getPointerId(i17));
            if (z17) {
                this.f130166b.put(i17 == 0 ? motionEvent.getRawX() : motionEvent.getX(i17) + (motionEvent.getRawX() - motionEvent.getX()));
                this.f130166b.put(i17 == 0 ? motionEvent.getRawY() : motionEvent.getY(i17) + (motionEvent.getRawY() - motionEvent.getY()));
            } else {
                this.f130166b.put(motionEvent.getX(i17));
                this.f130166b.put(motionEvent.getY(i17));
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
            this.f130166b.put(touchMinor);
            this.f130166b.put(touchMajor);
            this.f130166b.put(round);
            this.f130166b.put(java.lang.Math.max(0.0f, motionEvent.getPressure(i17)));
            i17++;
        }
        return m34824x2bda4aee(e(motionEvent.getActionMasked()), motionEvent.getActionIndex(), pointerCount, this.f130165a, this.f130166b, motionEvent.getEventTime());
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

package com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3184xac8f1cfd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J(\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J!\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0082 J)\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0082 J\u0019\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0082 JI\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0082 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/tencent/wemagic/common/component/MBCanvasSurfaceNotifier;", "Lcom/tencent/wemagic/common/api/MBCanvasSurfaceDelegate;", "envId", "", "<init>", "(J)V", "TAG", "", "notifySurfaceCreated", "", "canvasId", "surface", "Landroid/view/Surface;", "notifySurfaceChanged", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54557xe73e0b15, "", "width", "height", "notifySurfaceDestroyed", "notifyTouchEvent", "", "event", "Landroid/view/MotionEvent;", "nativeNotifySurfaceCreated", "nativeNotifySurfaceChanged", "nativeNotifySurfaceDestroyed", "nativeNotifyTouchEvent", "action", com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "changed", "ids", "", "posX", "", "posY", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.tencent.wemagic.common.component.MBCanvasSurfaceNotifier */
/* loaded from: classes8.dex */
public final class C27732x57207a66 implements vw5.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f301600a;

    public C27732x57207a66(long j17) {
        this.f301600a = j17;
    }

    /* renamed from: nativeNotifySurfaceChanged */
    private final native void m119758x29ece3a7(long envId, long canvasId, int width, int height);

    /* renamed from: nativeNotifySurfaceCreated */
    private final native void m119759x3b2fffdb(long envId, long canvasId, android.view.Surface surface);

    /* renamed from: nativeNotifySurfaceDestroyed */
    private final native void m119760x81f0a64c(long envId, long canvasId);

    /* renamed from: nativeNotifyTouchEvent */
    private final native void m119761xb5ca84fb(long envId, long canvasId, int action, long timestamp, int changed, int[] ids, float[] posX, float[] posY);

    public void a(long j17, int i17, int i18, int i19) {
        java.lang.String format = "notifySurfaceChanged, canvasId: " + j17;
        java.lang.Object[] objArr = new java.lang.Object[0];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
        m119758x29ece3a7(this.f301600a, j17, i18, i19);
    }

    public void b(long j17, android.view.Surface surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        java.lang.String format = "notifySurfaceCreated, canvasId: " + j17;
        java.lang.Object[] objArr = new java.lang.Object[0];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
        m119759x3b2fffdb(this.f301600a, j17, surface);
    }

    public void c(long j17) {
        java.lang.String format = "notifySurfaceDestroyed, canvasId: " + j17;
        java.lang.Object[] objArr = new java.lang.Object[0];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
        m119760x81f0a64c(this.f301600a, j17);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[LOOP:0: B:16:0x002f->B:17:0x0031, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(long r19, android.view.MotionEvent r21) {
        /*
            r18 = this;
            r0 = r21
            java.lang.String r1 = "event"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r1)
            int r1 = r21.getActionMasked()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L24
            r4 = 2
            if (r1 == r3) goto L22
            if (r1 == r4) goto L20
            r5 = 3
            if (r1 == r5) goto L1e
            r5 = 5
            if (r1 == r5) goto L24
            r5 = 6
            if (r1 == r5) goto L22
            return r2
        L1e:
            r11 = r5
            goto L25
        L20:
            r11 = r3
            goto L25
        L22:
            r11 = r4
            goto L25
        L24:
            r11 = r2
        L25:
            int r1 = r21.getPointerCount()
            int[] r15 = new int[r1]
            float[] r4 = new float[r1]
            float[] r5 = new float[r1]
        L2f:
            if (r2 >= r1) goto L46
            int r6 = r0.getPointerId(r2)
            r15[r2] = r6
            float r6 = r0.getX(r2)
            r4[r2] = r6
            float r6 = r0.getY(r2)
            r5[r2] = r6
            int r2 = r2 + 1
            goto L2f
        L46:
            long r12 = r21.getEventTime()
            int r14 = r21.getActionIndex()
            r0 = r18
            long r7 = r0.f301600a
            r6 = r18
            r9 = r19
            r16 = r4
            r17 = r5
            r6.m119761xb5ca84fb(r7, r9, r11, r12, r14, r15, r16, r17)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3184xac8f1cfd.C27732x57207a66.d(long, android.view.MotionEvent):boolean");
    }
}

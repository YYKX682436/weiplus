package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.JavaI420Buffer */
/* loaded from: classes16.dex */
public class C29794x1389e1eb implements org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer {

    /* renamed from: dataU */
    private final java.nio.ByteBuffer f75496x5af05eb;

    /* renamed from: dataV */
    private final java.nio.ByteBuffer f75497x5af05ec;

    /* renamed from: dataY */
    private final java.nio.ByteBuffer f75498x5af05ef;

    /* renamed from: height */
    private final int f75499xb7389127;

    /* renamed from: refCountDelegate */
    private final org.p3371xd0ce3e8d.C29845xdcc09601 f75500xefc51e1;

    /* renamed from: strideU */
    private final int f75501x8fd67c9c;

    /* renamed from: strideV */
    private final int f75502x8fd67c9d;

    /* renamed from: strideY */
    private final int f75503x8fd67ca0;

    /* renamed from: width */
    private final int f75504x6be2dc6;

    private C29794x1389e1eb(int i17, int i18, java.nio.ByteBuffer byteBuffer, int i19, java.nio.ByteBuffer byteBuffer2, int i27, java.nio.ByteBuffer byteBuffer3, int i28, java.lang.Runnable runnable) {
        this.f75504x6be2dc6 = i17;
        this.f75499xb7389127 = i18;
        this.f75498x5af05ef = byteBuffer;
        this.f75496x5af05eb = byteBuffer2;
        this.f75497x5af05ec = byteBuffer3;
        this.f75503x8fd67ca0 = i19;
        this.f75501x8fd67c9c = i27;
        this.f75502x8fd67c9d = i28;
        this.f75500xefc51e1 = new org.p3371xd0ce3e8d.C29845xdcc09601(runnable);
    }

    /* renamed from: allocate */
    public static org.p3371xd0ce3e8d.C29794x1389e1eb m155631x6c090f3d(int i17, int i18) {
        int i19 = (i18 + 1) / 2;
        int i27 = (i17 + 1) / 2;
        int i28 = i17 * i18;
        int i29 = i28 + 0;
        int i37 = i27 * i19;
        int i38 = i29 + i37;
        final java.nio.ByteBuffer m155648xe88792fc = org.p3371xd0ce3e8d.C29797xa99bc1d0.m155648xe88792fc(i28 + (i27 * 2 * i19));
        m155648xe88792fc.position(0);
        m155648xe88792fc.limit(i29);
        java.nio.ByteBuffer slice = m155648xe88792fc.slice();
        m155648xe88792fc.position(i29);
        m155648xe88792fc.limit(i38);
        java.nio.ByteBuffer slice2 = m155648xe88792fc.slice();
        m155648xe88792fc.position(i38);
        m155648xe88792fc.limit(i38 + i37);
        return new org.p3371xd0ce3e8d.C29794x1389e1eb(i17, i18, slice, i17, slice2, i27, m155648xe88792fc.slice(), i27, new java.lang.Runnable() { // from class: org.webrtc.JavaI420Buffer$$b
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.C29797xa99bc1d0.m155649x41617eeb(m155648xe88792fc);
            }
        });
    }

    /* renamed from: checkCapacity */
    private static void m155632x8be1d5e2(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19) {
        int i27 = (i19 * (i18 - 1)) + i17;
        if (byteBuffer.capacity() >= i27) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Buffer must be at least " + i27 + " bytes, but was " + byteBuffer.capacity());
    }

    /* renamed from: cropAndScaleI420 */
    public static org.p3371xd0ce3e8d.C29904x150215d2.Buffer m155633xea28cb6c(final org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer i420Buffer, int i17, int i18, int i19, int i27, int i28, int i29) {
        if (i19 == i28 && i27 == i29) {
            java.nio.ByteBuffer mo155640x744cac39 = i420Buffer.mo155640x744cac39();
            java.nio.ByteBuffer mo155638x744cac35 = i420Buffer.mo155638x744cac35();
            java.nio.ByteBuffer mo155639x744cac36 = i420Buffer.mo155639x744cac36();
            mo155640x744cac39.position(i17 + (i420Buffer.mo155644xcda3b86a() * i18));
            int i37 = i17 / 2;
            int i38 = i18 / 2;
            mo155638x744cac35.position((i420Buffer.mo155642xcda3b866() * i38) + i37);
            mo155639x744cac36.position(i37 + (i38 * i420Buffer.mo155643xcda3b867()));
            i420Buffer.mo155514xc84df105();
            return m155636x37d04a(i28, i29, mo155640x744cac39.slice(), i420Buffer.mo155644xcda3b86a(), mo155638x744cac35.slice(), i420Buffer.mo155642xcda3b866(), mo155639x744cac36.slice(), i420Buffer.mo155643xcda3b867(), new java.lang.Runnable() { // from class: org.webrtc.JavaI420Buffer$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer.this.mo155513x41012807();
                }
            });
        }
        org.p3371xd0ce3e8d.C29794x1389e1eb m155631x6c090f3d = m155631x6c090f3d(i28, i29);
        m155635x9d251a3(i420Buffer.mo155640x744cac39(), i420Buffer.mo155644xcda3b86a(), i420Buffer.mo155638x744cac35(), i420Buffer.mo155642xcda3b866(), i420Buffer.mo155639x744cac36(), i420Buffer.mo155643xcda3b867(), i17, i18, i19, i27, m155631x6c090f3d.mo155640x744cac39(), m155631x6c090f3d.mo155644xcda3b86a(), m155631x6c090f3d.mo155638x744cac35(), m155631x6c090f3d.mo155642xcda3b866(), m155631x6c090f3d.mo155639x744cac36(), m155631x6c090f3d.mo155643xcda3b867(), i28, i29);
        return m155631x6c090f3d;
    }

    /* renamed from: nativeCropAndScaleI420 */
    private static native void m155635x9d251a3(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, int i27, int i28, int i29, int i37, java.nio.ByteBuffer byteBuffer4, int i38, java.nio.ByteBuffer byteBuffer5, int i39, java.nio.ByteBuffer byteBuffer6, int i47, int i48, int i49);

    /* renamed from: wrap */
    public static org.p3371xd0ce3e8d.C29794x1389e1eb m155636x37d04a(int i17, int i18, java.nio.ByteBuffer byteBuffer, int i19, java.nio.ByteBuffer byteBuffer2, int i27, java.nio.ByteBuffer byteBuffer3, int i28, java.lang.Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new java.lang.IllegalArgumentException("Data buffers cannot be null.");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new java.lang.IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        java.nio.ByteBuffer slice = byteBuffer.slice();
        java.nio.ByteBuffer slice2 = byteBuffer2.slice();
        java.nio.ByteBuffer slice3 = byteBuffer3.slice();
        int i29 = (i17 + 1) / 2;
        int i37 = (i18 + 1) / 2;
        m155632x8be1d5e2(slice, i17, i18, i19);
        m155632x8be1d5e2(slice2, i29, i37, i27);
        m155632x8be1d5e2(slice3, i29, i37, i28);
        return new org.p3371xd0ce3e8d.C29794x1389e1eb(i17, i18, slice, i19, slice2, i27, slice3, i28, runnable);
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: cropAndScale */
    public org.p3371xd0ce3e8d.C29904x150215d2.Buffer mo155637xdbd1bc63(int i17, int i18, int i19, int i27, int i28, int i29) {
        return m155633xea28cb6c(this, i17, i18, i19, i27, i28, i29);
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer
    /* renamed from: getDataU */
    public java.nio.ByteBuffer mo155638x744cac35() {
        return this.f75496x5af05eb.slice();
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer
    /* renamed from: getDataV */
    public java.nio.ByteBuffer mo155639x744cac36() {
        return this.f75497x5af05ec.slice();
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer
    /* renamed from: getDataY */
    public java.nio.ByteBuffer mo155640x744cac39() {
        return this.f75498x5af05ef.slice();
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: getHeight */
    public int mo155641x1c4fb41d() {
        return this.f75499xb7389127;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer
    /* renamed from: getStrideU */
    public int mo155642xcda3b866() {
        return this.f75501x8fd67c9c;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer
    /* renamed from: getStrideV */
    public int mo155643xcda3b867() {
        return this.f75502x8fd67c9d;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer
    /* renamed from: getStrideY */
    public int mo155644xcda3b86a() {
        return this.f75503x8fd67ca0;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: getWidth */
    public int mo155645x755bd410() {
        return this.f75504x6be2dc6;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer, org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
    /* renamed from: release */
    public void mo155513x41012807() {
        this.f75500xefc51e1.mo155513x41012807();
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer, org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
    /* renamed from: retain */
    public void mo155514xc84df105() {
        this.f75500xefc51e1.mo155514xc84df105();
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: toI420 */
    public org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer mo155646xcc305184() {
        mo155514xc84df105();
        return this;
    }
}

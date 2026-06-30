package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.NV12Buffer */
/* loaded from: classes16.dex */
public class C29818xebaf6b89 implements org.p3371xd0ce3e8d.C29904x150215d2.Buffer {

    /* renamed from: buffer */
    private final java.nio.ByteBuffer f75575xaddb9440;

    /* renamed from: height */
    private final int f75576xb7389127;

    /* renamed from: refCountDelegate */
    private final org.p3371xd0ce3e8d.C29845xdcc09601 f75577xefc51e1;

    /* renamed from: sliceHeight */
    private final int f75578x4d50c559;

    /* renamed from: stride */
    private final int f75579xcad55ed9;

    /* renamed from: width */
    private final int f75580x6be2dc6;

    public C29818xebaf6b89(int i17, int i18, int i19, int i27, java.nio.ByteBuffer byteBuffer, java.lang.Runnable runnable) {
        this.f75580x6be2dc6 = i17;
        this.f75576xb7389127 = i18;
        this.f75579xcad55ed9 = i19;
        this.f75578x4d50c559 = i27;
        this.f75575xaddb9440 = byteBuffer;
        this.f75577xefc51e1 = new org.p3371xd0ce3e8d.C29845xdcc09601(runnable);
    }

    /* renamed from: nativeCropAndScale */
    private static native void m155785x33acf61a(int i17, int i18, int i19, int i27, int i28, int i29, java.nio.ByteBuffer byteBuffer, int i37, int i38, int i39, int i47, java.nio.ByteBuffer byteBuffer2, int i48, java.nio.ByteBuffer byteBuffer3, int i49, java.nio.ByteBuffer byteBuffer4, int i57);

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: cropAndScale */
    public org.p3371xd0ce3e8d.C29904x150215d2.Buffer mo155637xdbd1bc63(int i17, int i18, int i19, int i27, int i28, int i29) {
        org.p3371xd0ce3e8d.C29794x1389e1eb m155631x6c090f3d = org.p3371xd0ce3e8d.C29794x1389e1eb.m155631x6c090f3d(i28, i29);
        m155785x33acf61a(i17, i18, i19, i27, i28, i29, this.f75575xaddb9440, this.f75580x6be2dc6, this.f75576xb7389127, this.f75579xcad55ed9, this.f75578x4d50c559, m155631x6c090f3d.mo155640x744cac39(), m155631x6c090f3d.mo155644xcda3b86a(), m155631x6c090f3d.mo155638x744cac35(), m155631x6c090f3d.mo155642xcda3b866(), m155631x6c090f3d.mo155639x744cac36(), m155631x6c090f3d.mo155643xcda3b867());
        return m155631x6c090f3d;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: getHeight */
    public int mo155641x1c4fb41d() {
        return this.f75576xb7389127;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: getWidth */
    public int mo155645x755bd410() {
        return this.f75580x6be2dc6;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer, org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
    /* renamed from: release */
    public void mo155513x41012807() {
        this.f75577xefc51e1.mo155513x41012807();
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer, org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
    /* renamed from: retain */
    public void mo155514xc84df105() {
        this.f75577xefc51e1.mo155514xc84df105();
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: toI420 */
    public org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer mo155646xcc305184() {
        int i17 = this.f75580x6be2dc6;
        int i18 = this.f75576xb7389127;
        return (org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer) mo155637xdbd1bc63(0, 0, i17, i18, i17, i18);
    }
}

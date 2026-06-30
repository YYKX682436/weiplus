package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.NV21Buffer */
/* loaded from: classes16.dex */
public class C29819x1eaa5d27 implements org.p3371xd0ce3e8d.C29904x150215d2.Buffer {

    /* renamed from: data */
    private final byte[] f75581x2eefaa;

    /* renamed from: height */
    private final int f75582xb7389127;

    /* renamed from: refCountDelegate */
    private final org.p3371xd0ce3e8d.C29845xdcc09601 f75583xefc51e1;

    /* renamed from: width */
    private final int f75584x6be2dc6;

    public C29819x1eaa5d27(byte[] bArr, int i17, int i18, java.lang.Runnable runnable) {
        this.f75581x2eefaa = bArr;
        this.f75584x6be2dc6 = i17;
        this.f75582xb7389127 = i18;
        this.f75583xefc51e1 = new org.p3371xd0ce3e8d.C29845xdcc09601(runnable);
    }

    /* renamed from: nativeCropAndScale */
    private static native void m155786x33acf61a(int i17, int i18, int i19, int i27, int i28, int i29, byte[] bArr, int i37, int i38, java.nio.ByteBuffer byteBuffer, int i39, java.nio.ByteBuffer byteBuffer2, int i47, java.nio.ByteBuffer byteBuffer3, int i48);

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: cropAndScale */
    public org.p3371xd0ce3e8d.C29904x150215d2.Buffer mo155637xdbd1bc63(int i17, int i18, int i19, int i27, int i28, int i29) {
        org.p3371xd0ce3e8d.C29794x1389e1eb m155631x6c090f3d = org.p3371xd0ce3e8d.C29794x1389e1eb.m155631x6c090f3d(i28, i29);
        m155786x33acf61a(i17, i18, i19, i27, i28, i29, this.f75581x2eefaa, this.f75584x6be2dc6, this.f75582xb7389127, m155631x6c090f3d.mo155640x744cac39(), m155631x6c090f3d.mo155644xcda3b86a(), m155631x6c090f3d.mo155638x744cac35(), m155631x6c090f3d.mo155642xcda3b866(), m155631x6c090f3d.mo155639x744cac36(), m155631x6c090f3d.mo155643xcda3b867());
        return m155631x6c090f3d;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: getHeight */
    public int mo155641x1c4fb41d() {
        return this.f75582xb7389127;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: getWidth */
    public int mo155645x755bd410() {
        return this.f75584x6be2dc6;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer, org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
    /* renamed from: release */
    public void mo155513x41012807() {
        this.f75583xefc51e1.mo155513x41012807();
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer, org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
    /* renamed from: retain */
    public void mo155514xc84df105() {
        this.f75583xefc51e1.mo155514xc84df105();
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: toI420 */
    public org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer mo155646xcc305184() {
        int i17 = this.f75584x6be2dc6;
        int i18 = this.f75582xb7389127;
        return (org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer) mo155637xdbd1bc63(0, 0, i17, i18, i17, i18);
    }
}

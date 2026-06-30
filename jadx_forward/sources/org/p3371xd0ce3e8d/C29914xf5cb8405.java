package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.WrappedNativeI420Buffer */
/* loaded from: classes16.dex */
class C29914xf5cb8405 implements org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer {

    /* renamed from: dataU */
    private final java.nio.ByteBuffer f76148x5af05eb;

    /* renamed from: dataV */
    private final java.nio.ByteBuffer f76149x5af05ec;

    /* renamed from: dataY */
    private final java.nio.ByteBuffer f76150x5af05ef;

    /* renamed from: height */
    private final int f76151xb7389127;

    /* renamed from: nativeBuffer */
    private final long f76152x72362337;

    /* renamed from: strideU */
    private final int f76153x8fd67c9c;

    /* renamed from: strideV */
    private final int f76154x8fd67c9d;

    /* renamed from: strideY */
    private final int f76155x8fd67ca0;

    /* renamed from: width */
    private final int f76156x6be2dc6;

    public C29914xf5cb8405(int i17, int i18, java.nio.ByteBuffer byteBuffer, int i19, java.nio.ByteBuffer byteBuffer2, int i27, java.nio.ByteBuffer byteBuffer3, int i28, long j17) {
        this.f76156x6be2dc6 = i17;
        this.f76151xb7389127 = i18;
        this.f76150x5af05ef = byteBuffer;
        this.f76155x8fd67ca0 = i19;
        this.f76148x5af05eb = byteBuffer2;
        this.f76153x8fd67c9c = i27;
        this.f76149x5af05ec = byteBuffer3;
        this.f76154x8fd67c9d = i28;
        this.f76152x72362337 = j17;
        mo155514xc84df105();
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: cropAndScale */
    public org.p3371xd0ce3e8d.C29904x150215d2.Buffer mo155637xdbd1bc63(int i17, int i18, int i19, int i27, int i28, int i29) {
        return org.p3371xd0ce3e8d.C29794x1389e1eb.m155633xea28cb6c(this, i17, i18, i19, i27, i28, i29);
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer
    /* renamed from: getDataU */
    public java.nio.ByteBuffer mo155638x744cac35() {
        return this.f76148x5af05eb.slice();
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer
    /* renamed from: getDataV */
    public java.nio.ByteBuffer mo155639x744cac36() {
        return this.f76149x5af05ec.slice();
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer
    /* renamed from: getDataY */
    public java.nio.ByteBuffer mo155640x744cac39() {
        return this.f76150x5af05ef.slice();
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: getHeight */
    public int mo155641x1c4fb41d() {
        return this.f76151xb7389127;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer
    /* renamed from: getStrideU */
    public int mo155642xcda3b866() {
        return this.f76153x8fd67c9c;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer
    /* renamed from: getStrideV */
    public int mo155643xcda3b867() {
        return this.f76154x8fd67c9d;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer
    /* renamed from: getStrideY */
    public int mo155644xcda3b86a() {
        return this.f76155x8fd67ca0;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: getWidth */
    public int mo155645x755bd410() {
        return this.f76156x6be2dc6;
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer, org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
    /* renamed from: release */
    public void mo155513x41012807() {
        org.p3371xd0ce3e8d.C29797xa99bc1d0.m155650x8b8e8283(this.f76152x72362337);
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer, org.p3371xd0ce3e8d.InterfaceC29846xbe8dd5fb
    /* renamed from: retain */
    public void mo155514xc84df105() {
        org.p3371xd0ce3e8d.C29797xa99bc1d0.m155647x6f908729(this.f76152x72362337);
    }

    @Override // org.p3371xd0ce3e8d.C29904x150215d2.Buffer
    /* renamed from: toI420 */
    public org.p3371xd0ce3e8d.C29904x150215d2.I420Buffer mo155646xcc305184() {
        mo155514xc84df105();
        return this;
    }
}

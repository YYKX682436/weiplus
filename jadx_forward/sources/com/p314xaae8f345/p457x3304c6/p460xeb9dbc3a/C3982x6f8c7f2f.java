package com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a;

/* renamed from: com.tencent.maas.camerafun.MJVideoFrame */
/* loaded from: classes5.dex */
public class C3982x6f8c7f2f implements com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4033xab659e32 {

    /* renamed from: a, reason: collision with root package name */
    public final int f129358a;

    /* renamed from: b, reason: collision with root package name */
    public final int f129359b;

    /* renamed from: c, reason: collision with root package name */
    public final int f129360c;

    /* renamed from: d, reason: collision with root package name */
    public final long f129361d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f129362e = false;

    /* renamed from: f, reason: collision with root package name */
    public final jg.e[] f129363f;

    public C3982x6f8c7f2f(int i17, int i18, int i19, int i27, java.nio.ByteBuffer byteBuffer, int i28, long j17) {
        this.f129358a = i17;
        this.f129359b = i18;
        this.f129360c = i28;
        this.f129361d = j17;
        this.f129363f = r2;
        jg.e[] eVarArr = {new jg.e(i19, i27, byteBuffer)};
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2
    /* renamed from: accessibility */
    public int mo32464xf34bc14e() {
        return 0;
    }

    /* renamed from: getBuffer */
    public java.nio.ByteBuffer m32465x12f2b736() {
        return this.f129363f[0].f381069c;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4033xab659e32
    /* renamed from: getFormat */
    public int mo32466x19771aed() {
        return 0;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2
    /* renamed from: getFrameCWAngle */
    public int mo32467xdcde8d28() {
        return this.f129360c;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2
    /* renamed from: getHeight */
    public int mo32468x1c4fb41d() {
        return this.f129359b;
    }

    /* renamed from: getIsMirrored */
    public boolean m32469x7549e3de() {
        return this.f129362e;
    }

    /* renamed from: getPixelStride */
    public int m32470x9149e7c9() {
        return this.f129363f[0].f381068b;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4033xab659e32
    /* renamed from: getPlanes */
    public com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4035x499ea3c[] mo32471x2a55948d() {
        return this.f129363f;
    }

    /* renamed from: getRowStride */
    public int m32472x3bc92a9d() {
        return this.f129363f[0].f381067a;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4034x40fb94d
    /* renamed from: getTimestamp */
    public long mo32473x2b69a60() {
        return this.f129361d;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2
    /* renamed from: getWidth */
    public int mo32474x755bd410() {
        return this.f129358a;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2
    /* renamed from: isMirrored */
    public boolean mo32475x87092be8() {
        return this.f129362e;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2
    /* renamed from: release */
    public void mo32476x41012807() {
    }
}

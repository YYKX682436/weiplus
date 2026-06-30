package jg;

/* loaded from: classes5.dex */
public class e implements com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4035x499ea3c {

    /* renamed from: a, reason: collision with root package name */
    public final int f381067a;

    /* renamed from: b, reason: collision with root package name */
    public final int f381068b;

    /* renamed from: c, reason: collision with root package name */
    public final java.nio.ByteBuffer f381069c;

    public e(int i17, int i18, java.nio.ByteBuffer byteBuffer) {
        this.f381067a = i17;
        this.f381068b = i18;
        this.f381069c = byteBuffer;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4035x499ea3c
    /* renamed from: getBuffer */
    public java.nio.ByteBuffer mo32901x12f2b736() {
        return this.f381069c;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4035x499ea3c
    /* renamed from: getPixelStride */
    public int mo32902x9149e7c9() {
        return this.f381068b;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4035x499ea3c
    /* renamed from: getRowStride */
    public int mo32903x3bc92a9d() {
        return this.f381067a;
    }
}

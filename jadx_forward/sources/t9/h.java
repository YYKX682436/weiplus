package t9;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f498046a;

    /* renamed from: b, reason: collision with root package name */
    public final int f498047b;

    /* renamed from: c, reason: collision with root package name */
    public final int f498048c;

    /* renamed from: d, reason: collision with root package name */
    public final long f498049d;

    public h(byte[] bArr, int i17) {
        t9.o oVar = new t9.o(bArr, bArr.length);
        oVar.e(i17 * 8);
        oVar.d(16);
        oVar.d(16);
        oVar.d(24);
        oVar.d(24);
        this.f498046a = oVar.d(20);
        this.f498047b = oVar.d(3) + 1;
        this.f498048c = oVar.d(5) + 1;
        this.f498049d = ((oVar.d(4) & 15) << 32) | (oVar.d(32) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);
    }
}

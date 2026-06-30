package o45;

/* loaded from: classes12.dex */
public class fi extends o45.zg implements o45.xg {

    /* renamed from: b, reason: collision with root package name */
    public int f424460b;

    /* renamed from: c, reason: collision with root package name */
    public int f424461c;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f424463e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f424464f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f424465g;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f424459a = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public long f424462d = 0;

    @Override // o45.zg
    /* renamed from: getCmdId */
    public int mo13850x7443ca3f() {
        return 800;
    }

    @Override // o45.xg
    /* renamed from: getFuncId */
    public int mo13851x19c9adf5() {
        return 0;
    }

    @Override // o45.zg
    /* renamed from: getShortSupport */
    public boolean mo150590x4bad6229() {
        return false;
    }

    @Override // o45.zg, o45.xg
    /* renamed from: isRawData */
    public boolean mo150591x182b0f68() {
        return true;
    }

    @Override // o45.zg
    /* renamed from: setClientVersion */
    public void mo150592x7e38194b(int i17) {
    }

    @Override // o45.xg
    /* renamed from: toProtoBuf */
    public byte[] mo13852xc3d7db06() {
        byte[] bArr = this.f424459a;
        if (bArr != null) {
            int length = bArr.length;
        }
        long j17 = this.f424462d;
        if (j17 == 0) {
            return new byte[0];
        }
        int i17 = (int) (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 & j17);
        int i18 = (int) (j17 >> 32);
        int i19 = ((i17 >>> 13) | (i18 << 19)) ^ 1442968193;
        int i27 = ((i18 >>> 13) | (i17 << 19)) ^ 1442968193;
        r45.de5 de5Var = new r45.de5();
        de5Var.f453887d = i19;
        de5Var.f453888e = i27;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(this.f424459a)) {
            de5Var.f453889f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(this.f424459a);
        }
        de5Var.f453890g = o45.wf.f424562g;
        de5Var.f453891h = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        de5Var.f453892i = 2;
        de5Var.f453893m = this.f424460b;
        de5Var.f453894n = this.f424461c;
        byte[] bArr2 = this.f424464f;
        if (bArr2 != null && bArr2.length == 32) {
            de5Var.f453895o = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr2);
        }
        byte[] bArr3 = this.f424465g;
        if (bArr3 != null && bArr3.length > 0) {
            de5Var.f453896p = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr3);
        }
        byte[] mo14344x5f01b1f6 = de5Var.mo14344x5f01b1f6();
        this.f424463e = kk.k.h(mo14344x5f01b1f6);
        return mo14344x5f01b1f6;
    }
}

package o45;

/* loaded from: classes12.dex */
public class zh extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f424579a = null;

    /* renamed from: b, reason: collision with root package name */
    public long f424580b = -1;

    @Override // o45.zg
    /* renamed from: getCmdId */
    public int mo13850x7443ca3f() {
        return 1000000190;
    }

    @Override // o45.xg
    /* renamed from: getFuncId */
    public int mo13851x19c9adf5() {
        return 268369922;
    }

    @Override // o45.zg
    /* renamed from: getShortSupport */
    public boolean mo150590x4bad6229() {
        return false;
    }

    @Override // o45.xg
    /* renamed from: toProtoBuf */
    public byte[] mo13852xc3d7db06() {
        byte[] bArr = new byte[this.f424579a.length + 8];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - this.f424580b);
        bArr[0] = (byte) ((currentTimeMillis >> 24) & 255);
        bArr[1] = (byte) ((currentTimeMillis >> 16) & 255);
        bArr[2] = (byte) ((currentTimeMillis >> 8) & 255);
        bArr[3] = (byte) (currentTimeMillis & 255);
        byte[] bArr2 = this.f424579a;
        bArr[4] = (byte) ((bArr2.length >> 24) & 255);
        bArr[5] = (byte) ((bArr2.length >> 16) & 255);
        bArr[6] = (byte) ((bArr2.length >> 8) & 255);
        bArr[7] = (byte) (bArr2.length & 255);
        java.lang.System.arraycopy(bArr2, 0, bArr, 8, bArr2.length);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j(bArr);
        return bArr;
    }
}

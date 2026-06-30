package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes13.dex */
public final class t extends com.p176xb6135e39.p283xc50a8b8b.w {

    /* renamed from: h, reason: collision with root package name */
    public final int f127038h;

    /* renamed from: i, reason: collision with root package name */
    public final int f127039i;

    public t(byte[] bArr, int i17, int i18) {
        super(bArr);
        com.p176xb6135e39.p283xc50a8b8b.y.e(i17, i17 + i18, bArr.length);
        this.f127038h = i17;
        this.f127039i = i18;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.w, com.p176xb6135e39.p283xc50a8b8b.y
    public byte d(int i17) {
        int i18 = this.f127039i;
        if (((i18 - (i17 + 1)) | i17) >= 0) {
            return this.f127159g[this.f127038h + i17];
        }
        if (i17 < 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(22);
            sb6.append("Index < 0: ");
            sb6.append(i17);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb6.toString());
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(40);
        sb7.append("Index > length: ");
        sb7.append(i17);
        sb7.append(", ");
        sb7.append(i18);
        throw new java.lang.ArrayIndexOutOfBoundsException(sb7.toString());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.w, com.p176xb6135e39.p283xc50a8b8b.y
    public void j(byte[] bArr, int i17, int i18, int i19) {
        java.lang.System.arraycopy(this.f127159g, this.f127038h + i17, bArr, i18, i19);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.w, com.p176xb6135e39.p283xc50a8b8b.y
    public byte k(int i17) {
        return this.f127159g[this.f127038h + i17];
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.w, com.p176xb6135e39.p283xc50a8b8b.y
    /* renamed from: size */
    public int mo20907x35e001() {
        return this.f127039i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.w
    public int t() {
        return this.f127038h;
    }
}

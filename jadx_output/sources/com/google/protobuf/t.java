package com.google.protobuf;

/* loaded from: classes13.dex */
public final class t extends com.google.protobuf.w {

    /* renamed from: h, reason: collision with root package name */
    public final int f45505h;

    /* renamed from: i, reason: collision with root package name */
    public final int f45506i;

    public t(byte[] bArr, int i17, int i18) {
        super(bArr);
        com.google.protobuf.y.e(i17, i17 + i18, bArr.length);
        this.f45505h = i17;
        this.f45506i = i18;
    }

    @Override // com.google.protobuf.w, com.google.protobuf.y
    public byte d(int i17) {
        int i18 = this.f45506i;
        if (((i18 - (i17 + 1)) | i17) >= 0) {
            return this.f45626g[this.f45505h + i17];
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

    @Override // com.google.protobuf.w, com.google.protobuf.y
    public void j(byte[] bArr, int i17, int i18, int i19) {
        java.lang.System.arraycopy(this.f45626g, this.f45505h + i17, bArr, i18, i19);
    }

    @Override // com.google.protobuf.w, com.google.protobuf.y
    public byte k(int i17) {
        return this.f45626g[this.f45505h + i17];
    }

    @Override // com.google.protobuf.w, com.google.protobuf.y
    public int size() {
        return this.f45506i;
    }

    @Override // com.google.protobuf.w
    public int t() {
        return this.f45505h;
    }
}

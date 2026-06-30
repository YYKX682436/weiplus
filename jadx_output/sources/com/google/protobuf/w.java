package com.google.protobuf;

/* loaded from: classes16.dex */
public class w extends com.google.protobuf.v {

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f45626g;

    public w(byte[] bArr) {
        bArr.getClass();
        this.f45626g = bArr;
    }

    @Override // com.google.protobuf.y
    public byte d(int i17) {
        return this.f45626g[i17];
    }

    @Override // com.google.protobuf.y
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.y) || size() != ((com.google.protobuf.y) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.w)) {
            return obj.equals(this);
        }
        com.google.protobuf.w wVar = (com.google.protobuf.w) obj;
        int i17 = this.f45714d;
        int i18 = wVar.f45714d;
        if (i17 != 0 && i18 != 0 && i17 != i18) {
            return false;
        }
        int size = size();
        if (size > wVar.size()) {
            int size2 = size();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(40);
            sb6.append("Length too large: ");
            sb6.append(size);
            sb6.append(size2);
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
        if (0 + size > wVar.size()) {
            int size3 = wVar.size();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(59);
            sb7.append("Ran off end of other: 0, ");
            sb7.append(size);
            sb7.append(", ");
            sb7.append(size3);
            throw new java.lang.IllegalArgumentException(sb7.toString());
        }
        int t17 = t() + size;
        int t18 = t();
        int t19 = wVar.t() + 0;
        while (t18 < t17) {
            if (this.f45626g[t18] != wVar.f45626g[t19]) {
                return false;
            }
            t18++;
            t19++;
        }
        return true;
    }

    @Override // com.google.protobuf.y
    public void j(byte[] bArr, int i17, int i18, int i19) {
        java.lang.System.arraycopy(this.f45626g, i17, bArr, i18, i19);
    }

    @Override // com.google.protobuf.y
    public byte k(int i17) {
        return this.f45626g[i17];
    }

    @Override // com.google.protobuf.y
    public final boolean l() {
        int t17 = t();
        return com.google.protobuf.ob.f45371a.e(0, this.f45626g, t17, size() + t17) == 0;
    }

    @Override // com.google.protobuf.y
    public final com.google.protobuf.d0 m() {
        return com.google.protobuf.d0.i(this.f45626g, t(), size(), true);
    }

    @Override // com.google.protobuf.y
    public final int n(int i17, int i18, int i19) {
        int t17 = t() + i18;
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        for (int i27 = t17; i27 < t17 + i19; i27++) {
            i17 = (i17 * 31) + this.f45626g[i27];
        }
        return i17;
    }

    @Override // com.google.protobuf.y
    public final com.google.protobuf.y o(int i17, int i18) {
        int e17 = com.google.protobuf.y.e(i17, i18, size());
        if (e17 == 0) {
            return com.google.protobuf.y.f45712e;
        }
        return new com.google.protobuf.t(this.f45626g, t() + i17, e17);
    }

    @Override // com.google.protobuf.y
    public final java.lang.String p(java.nio.charset.Charset charset) {
        return new java.lang.String(this.f45626g, t(), size(), charset);
    }

    @Override // com.google.protobuf.y
    public final void s(com.google.protobuf.p pVar) {
        pVar.a(this.f45626g, t(), size());
    }

    @Override // com.google.protobuf.y
    public int size() {
        return this.f45626g.length;
    }

    public int t() {
        return 0;
    }
}

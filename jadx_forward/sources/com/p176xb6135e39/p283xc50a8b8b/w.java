package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class w extends com.p176xb6135e39.p283xc50a8b8b.v {

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f127159g;

    public w(byte[] bArr) {
        bArr.getClass();
        this.f127159g = bArr;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.y
    public byte d(int i17) {
        return this.f127159g[i17];
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.y
    /* renamed from: equals */
    public final boolean mo20935xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.y) || mo20907x35e001() != ((com.p176xb6135e39.p283xc50a8b8b.y) obj).mo20907x35e001()) {
            return false;
        }
        if (mo20907x35e001() == 0) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.w)) {
            return obj.equals(this);
        }
        com.p176xb6135e39.p283xc50a8b8b.w wVar = (com.p176xb6135e39.p283xc50a8b8b.w) obj;
        int i17 = this.f127247d;
        int i18 = wVar.f127247d;
        if (i17 != 0 && i18 != 0 && i17 != i18) {
            return false;
        }
        int mo20907x35e001 = mo20907x35e001();
        if (mo20907x35e001 > wVar.mo20907x35e001()) {
            int mo20907x35e0012 = mo20907x35e001();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(40);
            sb6.append("Length too large: ");
            sb6.append(mo20907x35e001);
            sb6.append(mo20907x35e0012);
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
        if (0 + mo20907x35e001 > wVar.mo20907x35e001()) {
            int mo20907x35e0013 = wVar.mo20907x35e001();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(59);
            sb7.append("Ran off end of other: 0, ");
            sb7.append(mo20907x35e001);
            sb7.append(", ");
            sb7.append(mo20907x35e0013);
            throw new java.lang.IllegalArgumentException(sb7.toString());
        }
        int t17 = t() + mo20907x35e001;
        int t18 = t();
        int t19 = wVar.t() + 0;
        while (t18 < t17) {
            if (this.f127159g[t18] != wVar.f127159g[t19]) {
                return false;
            }
            t18++;
            t19++;
        }
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.y
    public void j(byte[] bArr, int i17, int i18, int i19) {
        java.lang.System.arraycopy(this.f127159g, i17, bArr, i18, i19);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.y
    public byte k(int i17) {
        return this.f127159g[i17];
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.y
    public final boolean l() {
        int t17 = t();
        return com.p176xb6135e39.p283xc50a8b8b.ob.f126904a.e(0, this.f127159g, t17, mo20907x35e001() + t17) == 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.y
    public final com.p176xb6135e39.p283xc50a8b8b.d0 m() {
        return com.p176xb6135e39.p283xc50a8b8b.d0.i(this.f127159g, t(), mo20907x35e001(), true);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.y
    public final int n(int i17, int i18, int i19) {
        int t17 = t() + i18;
        java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
        for (int i27 = t17; i27 < t17 + i19; i27++) {
            i17 = (i17 * 31) + this.f127159g[i27];
        }
        return i17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.y
    public final com.p176xb6135e39.p283xc50a8b8b.y o(int i17, int i18) {
        int e17 = com.p176xb6135e39.p283xc50a8b8b.y.e(i17, i18, mo20907x35e001());
        if (e17 == 0) {
            return com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
        }
        return new com.p176xb6135e39.p283xc50a8b8b.t(this.f127159g, t() + i17, e17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.y
    public final java.lang.String p(java.nio.charset.Charset charset) {
        return new java.lang.String(this.f127159g, t(), mo20907x35e001(), charset);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.y
    public final void s(com.p176xb6135e39.p283xc50a8b8b.p pVar) {
        pVar.a(this.f127159g, t(), mo20907x35e001());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.y
    /* renamed from: size */
    public int mo20907x35e001() {
        return this.f127159g.length;
    }

    public int t() {
        return 0;
    }
}

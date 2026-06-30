package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzzc */
/* loaded from: classes13.dex */
public class C2389x394e69 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2388x394e68 {

    /* renamed from: zzbrc */
    protected final byte[] f7216x6f026d3;

    public C2389x394e69(byte[] bArr) {
        this.f7216x6f026d3 = bArr;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e
    /* renamed from: equals */
    public final boolean mo19372xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e) || mo19374x35e001() != ((com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e) obj).mo19374x35e001()) {
            return false;
        }
        if (mo19374x35e001() == 0) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2389x394e69)) {
            return obj.equals(this);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2389x394e69 c2389x394e69 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2389x394e69) obj;
        int m19377x394da5 = m19377x394da5();
        int m19377x394da52 = c2389x394e69.m19377x394da5();
        if (m19377x394da5 == 0 || m19377x394da52 == 0 || m19377x394da5 == m19377x394da52) {
            return zza(c2389x394e69, 0, mo19374x35e001());
        }
        return false;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e
    /* renamed from: size */
    public int mo19374x35e001() {
        return this.f7216x6f026d3.length;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e
    public final int zza(int i17, int i18, int i19) {
        return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2404x394e78.zza(i17, this.f7216x6f026d3, mo19379x394da6(), i19);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e
    /* renamed from: zzae */
    public byte mo19376x394b64(int i17) {
        return this.f7216x6f026d3[i17];
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e
    public final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e zzb(int i17, int i18) {
        int zzb = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e.zzb(0, i18, mo19374x35e001());
        return zzb == 0 ? com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e.f7208x6f026c9 : new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2386x394e61(this.f7216x6f026d3, mo19379x394da6(), zzb);
    }

    /* renamed from: zzsy */
    public int mo19379x394da6() {
        return 0;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2388x394e68
    public final boolean zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e abstractC2383x394e5e, int i17, int i18) {
        if (i18 > abstractC2383x394e5e.mo19374x35e001()) {
            int mo19374x35e001 = mo19374x35e001();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(40);
            sb6.append("Length too large: ");
            sb6.append(i18);
            sb6.append(mo19374x35e001);
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
        if (i18 > abstractC2383x394e5e.mo19374x35e001()) {
            int mo19374x35e0012 = abstractC2383x394e5e.mo19374x35e001();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(59);
            sb7.append("Ran off end of other: 0, ");
            sb7.append(i18);
            sb7.append(", ");
            sb7.append(mo19374x35e0012);
            throw new java.lang.IllegalArgumentException(sb7.toString());
        }
        if (!(abstractC2383x394e5e instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2389x394e69)) {
            return abstractC2383x394e5e.zzb(0, i18).mo19372xb2c87fbf(zzb(0, i18));
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2389x394e69 c2389x394e69 = (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2389x394e69) abstractC2383x394e5e;
        byte[] bArr = this.f7216x6f026d3;
        byte[] bArr2 = c2389x394e69.f7216x6f026d3;
        int mo19379x394da6 = mo19379x394da6() + i18;
        int mo19379x394da62 = mo19379x394da6();
        int mo19379x394da63 = c2389x394e69.mo19379x394da6();
        while (mo19379x394da62 < mo19379x394da6) {
            if (bArr[mo19379x394da62] != bArr2[mo19379x394da63]) {
                return false;
            }
            mo19379x394da62++;
            mo19379x394da63++;
        }
        return true;
    }
}

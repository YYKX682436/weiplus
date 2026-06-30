package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzyz */
/* loaded from: classes13.dex */
public final class C2386x394e61 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2389x394e69 {

    /* renamed from: zzbra */
    private final int f7214x6f026d1;

    /* renamed from: zzbrb */
    private final int f7215x6f026d2;

    public C2386x394e61(byte[] bArr, int i17, int i18) {
        super(bArr);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e.zzb(i17, i17 + i18, bArr.length);
        this.f7214x6f026d1 = i17;
        this.f7215x6f026d2 = i18;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2389x394e69, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e
    /* renamed from: size */
    public final int mo19374x35e001() {
        return this.f7215x6f026d2;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2389x394e69, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e
    /* renamed from: zzae */
    public final byte mo19376x394b64(int i17) {
        int mo19374x35e001 = mo19374x35e001();
        if (((mo19374x35e001 - (i17 + 1)) | i17) >= 0) {
            return this.f7216x6f026d3[this.f7214x6f026d1 + i17];
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
        sb7.append(mo19374x35e001);
        throw new java.lang.ArrayIndexOutOfBoundsException(sb7.toString());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2389x394e69
    /* renamed from: zzsy */
    public final int mo19379x394da6() {
        return this.f7214x6f026d1;
    }
}

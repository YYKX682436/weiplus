package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzzg extends com.google.android.gms.internal.measurement.zzze {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzbrh;
    private int zzbri;
    private int zzbrj;
    private int zzbrk;

    private zzzg(byte[] bArr, int i17, int i18, boolean z17) {
        super();
        this.zzbrk = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i18 + i17;
        this.pos = i17;
        this.zzbrj = i17;
        this.zzbrh = z17;
    }

    private final void zzta() {
        int i17 = this.limit + this.zzbri;
        this.limit = i17;
        int i18 = i17 - this.zzbrj;
        int i19 = this.zzbrk;
        if (i18 <= i19) {
            this.zzbri = 0;
            return;
        }
        int i27 = i18 - i19;
        this.zzbri = i27;
        this.limit = i17 - i27;
    }

    public final int zzaf(int i17) {
        if (i17 < 0) {
            throw com.google.android.gms.internal.measurement.zzzt.zztn();
        }
        int zzsz = i17 + zzsz();
        int i18 = this.zzbrk;
        if (zzsz > i18) {
            throw com.google.android.gms.internal.measurement.zzzt.zztm();
        }
        this.zzbrk = zzsz;
        zzta();
        return i18;
    }

    @Override // com.google.android.gms.internal.measurement.zzze
    public final int zzsz() {
        return this.pos - this.zzbrj;
    }
}

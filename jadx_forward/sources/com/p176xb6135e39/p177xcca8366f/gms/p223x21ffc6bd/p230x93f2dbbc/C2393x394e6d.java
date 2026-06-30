package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzzg */
/* loaded from: classes13.dex */
public final class C2393x394e6d extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2391x394e6b {

    /* renamed from: buffer */
    private final byte[] f7221xaddb9440;

    /* renamed from: limit */
    private int f7222x6234bbb;
    private int pos;

    /* renamed from: zzbrh */
    private final boolean f7223x6f026d8;

    /* renamed from: zzbri */
    private int f7224x6f026d9;

    /* renamed from: zzbrj */
    private int f7225x6f026da;

    /* renamed from: zzbrk */
    private int f7226x6f026db;

    private C2393x394e6d(byte[] bArr, int i17, int i18, boolean z17) {
        super();
        this.f7226x6f026db = Integer.MAX_VALUE;
        this.f7221xaddb9440 = bArr;
        this.f7222x6234bbb = i18 + i17;
        this.pos = i17;
        this.f7225x6f026da = i17;
        this.f7223x6f026d8 = z17;
    }

    /* renamed from: zzta */
    private final void m19381x394dad() {
        int i17 = this.f7222x6234bbb + this.f7224x6f026d9;
        this.f7222x6234bbb = i17;
        int i18 = i17 - this.f7225x6f026da;
        int i19 = this.f7226x6f026db;
        if (i18 <= i19) {
            this.f7224x6f026d9 = 0;
            return;
        }
        int i27 = i18 - i19;
        this.f7224x6f026d9 = i27;
        this.f7222x6234bbb = i17 - i27;
    }

    /* renamed from: zzaf */
    public final int m19382x394b65(int i17) {
        if (i17 < 0) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2406x394e7a.m19413x394dba();
        }
        int mo19380x394da7 = i17 + mo19380x394da7();
        int i18 = this.f7226x6f026db;
        if (mo19380x394da7 > i18) {
            throw com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2406x394e7a.m19412x394db9();
        }
        this.f7226x6f026db = mo19380x394da7;
        m19381x394dad();
        return i18;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2391x394e6b
    /* renamed from: zzsz */
    public final int mo19380x394da7() {
        return this.pos - this.f7225x6f026da;
    }
}

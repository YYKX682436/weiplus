package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.CdnTransferConfig */
/* loaded from: classes8.dex */
public class C4470xe0ae847a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a f18535xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a();

    /* renamed from: hasSetFields */
    private final boolean[] f18536xcb94b041 = new boolean[5];

    /* renamed from: max_cellular_transfer_mb */
    private int f18537xb9130f;

    /* renamed from: max_cellular_transfer_multiplier */
    private int f18538x81e8693b;

    /* renamed from: max_retry_count */
    private int f18539x487c465d;

    /* renamed from: transfor_timeout_seconds */
    private int f18540xd0cafa83;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a m38441xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a m38442x7c90cfc0() {
        return f18535xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a m38443x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a m38444x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a c4470xe0ae847a = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f18540xd0cafa83), java.lang.Integer.valueOf(c4470xe0ae847a.f18540xd0cafa83)) && n51.f.a(java.lang.Integer.valueOf(this.f18539x487c465d), java.lang.Integer.valueOf(c4470xe0ae847a.f18539x487c465d)) && n51.f.a(java.lang.Integer.valueOf(this.f18538x81e8693b), java.lang.Integer.valueOf(c4470xe0ae847a.f18538x81e8693b)) && n51.f.a(java.lang.Integer.valueOf(this.f18537xb9130f), java.lang.Integer.valueOf(c4470xe0ae847a.f18537xb9130f));
    }

    /* renamed from: getMaxCellularTransferMb */
    public int m38445xdf10eb8() {
        return this.f18537xb9130f;
    }

    /* renamed from: getMaxCellularTransferMultiplier */
    public int m38446x6222abe4() {
        return this.f18538x81e8693b;
    }

    /* renamed from: getMaxRetryCount */
    public int m38447x32207815() {
        return this.f18539x487c465d;
    }

    /* renamed from: getTransforTimeoutSeconds */
    public int m38448xf066e455() {
        return this.f18540xd0cafa83;
    }

    /* renamed from: hasFieldNumber */
    public boolean m38449x6e095e9(int i17) {
        return this.f18536xcb94b041[i17];
    }

    /* renamed from: hasMaxCellularTransferMb */
    public boolean m38450x5aa67df4() {
        return m38449x6e095e9(4);
    }

    /* renamed from: hasMaxCellularTransferMultiplier */
    public boolean m38451x96031f20() {
        return m38449x6e095e9(3);
    }

    /* renamed from: hasMaxRetryCount */
    public boolean m38452xca66e351() {
        return m38449x6e095e9(2);
    }

    /* renamed from: hasTransforTimeoutSeconds */
    public boolean m38453x3a5f5c99() {
        return m38449x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a m38454x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18536xcb94b041[1]) {
                fVar.e(1, this.f18540xd0cafa83);
            }
            if (this.f18536xcb94b041[2]) {
                fVar.e(2, this.f18539x487c465d);
            }
            if (this.f18536xcb94b041[3]) {
                fVar.e(3, this.f18538x81e8693b);
            }
            if (this.f18536xcb94b041[4]) {
                fVar.e(4, this.f18537xb9130f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f18536xcb94b041[1] ? 0 + b36.f.e(1, this.f18540xd0cafa83) : 0;
            if (this.f18536xcb94b041[2]) {
                e17 += b36.f.e(2, this.f18539x487c465d);
            }
            if (this.f18536xcb94b041[3]) {
                e17 += b36.f.e(3, this.f18538x81e8693b);
            }
            return this.f18536xcb94b041[4] ? e17 + b36.f.e(4, this.f18537xb9130f) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f18540xd0cafa83 = aVar2.g(intValue);
            this.f18536xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f18539x487c465d = aVar2.g(intValue);
            this.f18536xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f18538x81e8693b = aVar2.g(intValue);
            this.f18536xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f18537xb9130f = aVar2.g(intValue);
        this.f18536xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setMaxCellularTransferMb */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a m38456xde03c12c(int i17) {
        this.f18537xb9130f = i17;
        this.f18536xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setMaxCellularTransferMultiplier */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a m38457xc465aa58(int i17) {
        this.f18538x81e8693b = i17;
        this.f18536xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setMaxRetryCount */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a m38458xc4f6de89(int i17) {
        this.f18539x487c465d = i17;
        this.f18536xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setTransforTimeoutSeconds */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a m38459x22aa8061(int i17) {
        this.f18540xd0cafa83 = i17;
        this.f18536xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a m38455x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4470xe0ae847a) super.mo11468x92b714fd(bArr);
    }
}

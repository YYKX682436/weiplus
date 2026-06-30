package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.ResourceRequestInfo */
/* loaded from: classes8.dex */
public class C27115xc6e22cf extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf f59236xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf();

    /* renamed from: app_req */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f59237xd0b26980;

    /* renamed from: hasSetFields */
    private final boolean[] f59238xcb94b041 = new boolean[7];

    /* renamed from: limit_flow */
    private boolean f59239x97b88b32;

    /* renamed from: limit_frequency */
    private boolean f59240x5ce49dd8;

    /* renamed from: retry_count */
    private int f59241xc8af38b8;

    /* renamed from: scene */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27116x81de1e8b f59242x683188c;

    /* renamed from: timeout_ms */
    private int f59243x5f1f1d44;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf m110547xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf m110548x7c90cfc0() {
        return f59236xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf m110549x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf m110550x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf c27115xc6e22cf = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf) fVar;
        return n51.f.a(this.f59237xd0b26980, c27115xc6e22cf.f59237xd0b26980) && n51.f.a(java.lang.Integer.valueOf(this.f59243x5f1f1d44), java.lang.Integer.valueOf(c27115xc6e22cf.f59243x5f1f1d44)) && n51.f.a(java.lang.Integer.valueOf(this.f59241xc8af38b8), java.lang.Integer.valueOf(c27115xc6e22cf.f59241xc8af38b8)) && n51.f.a(java.lang.Boolean.valueOf(this.f59239x97b88b32), java.lang.Boolean.valueOf(c27115xc6e22cf.f59239x97b88b32)) && n51.f.a(java.lang.Boolean.valueOf(this.f59240x5ce49dd8), java.lang.Boolean.valueOf(c27115xc6e22cf.f59240x5ce49dd8)) && n51.f.a(this.f59242x683188c, c27115xc6e22cf.f59242x683188c);
    }

    /* renamed from: getAppReq */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m110551x10fba9b3() {
        return this.f59238xcb94b041[1] ? this.f59237xd0b26980 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getLimitFlow */
    public boolean m110552x675fdcd3() {
        return this.f59239x97b88b32;
    }

    /* renamed from: getLimitFrequency */
    public boolean m110553x88e428d7() {
        return this.f59240x5ce49dd8;
    }

    /* renamed from: getRetryCount */
    public int m110554xa8e25f3d() {
        return this.f59241xc8af38b8;
    }

    /* renamed from: getScene */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27116x81de1e8b m110555x7520bed6() {
        return this.f59238xcb94b041[6] ? this.f59242x683188c : com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27116x81de1e8b.kNormal;
    }

    /* renamed from: getTimeoutMs */
    public int m110556x27ef431() {
        return this.f59243x5f1f1d44;
    }

    /* renamed from: hasAppReq */
    public boolean m110557xd0d529f7() {
        return m110558x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m110558x6e095e9(int i17) {
        return this.f59238xcb94b041[i17];
    }

    /* renamed from: hasLimitFlow */
    public boolean m110559x2735460f() {
        return m110558x6e095e9(4);
    }

    /* renamed from: hasLimitFrequency */
    public boolean m110560xf96b251b() {
        return m110558x6e095e9(5);
    }

    /* renamed from: hasRetryCount */
    public boolean m110561xe3ba1d81() {
        return m110558x6e095e9(3);
    }

    /* renamed from: hasScene */
    public boolean m110562x7b42612() {
        return m110558x6e095e9(6);
    }

    /* renamed from: hasTimeoutMs */
    public boolean m110563xc2545d6d() {
        return m110558x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf m110564x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f59237xd0b26980;
            if (gVar != null && this.f59238xcb94b041[1]) {
                fVar.b(1, gVar);
            }
            if (this.f59238xcb94b041[2]) {
                fVar.e(2, this.f59243x5f1f1d44);
            }
            if (this.f59238xcb94b041[3]) {
                fVar.e(3, this.f59241xc8af38b8);
            }
            if (this.f59238xcb94b041[4]) {
                fVar.a(4, this.f59239x97b88b32);
            }
            if (this.f59238xcb94b041[5]) {
                fVar.a(5, this.f59240x5ce49dd8);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27116x81de1e8b enumC27116x81de1e8b = this.f59242x683188c;
            if (enumC27116x81de1e8b != null && this.f59238xcb94b041[6]) {
                fVar.e(6, enumC27116x81de1e8b.f59251x6ac9171);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f59237xd0b26980;
            if (gVar2 != null && this.f59238xcb94b041[1]) {
                i18 = 0 + b36.f.b(1, gVar2);
            }
            if (this.f59238xcb94b041[2]) {
                i18 += b36.f.e(2, this.f59243x5f1f1d44);
            }
            if (this.f59238xcb94b041[3]) {
                i18 += b36.f.e(3, this.f59241xc8af38b8);
            }
            if (this.f59238xcb94b041[4]) {
                i18 += b36.f.a(4, this.f59239x97b88b32);
            }
            if (this.f59238xcb94b041[5]) {
                i18 += b36.f.a(5, this.f59240x5ce49dd8);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27116x81de1e8b enumC27116x81de1e8b2 = this.f59242x683188c;
            return (enumC27116x81de1e8b2 == null || !this.f59238xcb94b041[6]) ? i18 : i18 + b36.f.e(6, enumC27116x81de1e8b2.f59251x6ac9171);
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
        switch (intValue) {
            case 1:
                this.f59237xd0b26980 = aVar2.d(intValue);
                this.f59238xcb94b041[1] = true;
                return 0;
            case 2:
                this.f59243x5f1f1d44 = aVar2.g(intValue);
                this.f59238xcb94b041[2] = true;
                return 0;
            case 3:
                this.f59241xc8af38b8 = aVar2.g(intValue);
                this.f59238xcb94b041[3] = true;
                return 0;
            case 4:
                this.f59239x97b88b32 = aVar2.c(intValue);
                this.f59238xcb94b041[4] = true;
                return 0;
            case 5:
                this.f59240x5ce49dd8 = aVar2.c(intValue);
                this.f59238xcb94b041[5] = true;
                return 0;
            case 6:
                this.f59242x683188c = com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27116x81de1e8b.m110574x382ad972(aVar2.g(intValue));
                this.f59238xcb94b041[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAppReq */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf m110566x430ddbf(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59237xd0b26980 = gVar;
        this.f59238xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setLimitFlow */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf m110567xc3b39d47(boolean z17) {
        this.f59239x97b88b32 = z17;
        this.f59238xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setLimitFrequency */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf m110568x50da90e3(boolean z17) {
        this.f59240x5ce49dd8 = z17;
        this.f59238xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setRetryCount */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf m110569xd706ad49(int i17) {
        this.f59241xc8af38b8 = i17;
        this.f59238xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setScene */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf m110570x53aed94a(com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27116x81de1e8b enumC27116x81de1e8b) {
        this.f59242x683188c = enumC27116x81de1e8b;
        this.f59238xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setTimeoutMs */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf m110571x5ed2b4a5(int i17) {
        this.f59243x5f1f1d44 = i17;
        this.f59238xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf m110565x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27115xc6e22cf) super.mo11468x92b714fd(bArr);
    }
}

package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.ResourceRequestInfo */
/* loaded from: classes15.dex */
public class C3071xc6e22cf extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf f11160xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf();

    /* renamed from: app_req */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f11161xd0b26980;

    /* renamed from: crypto_algo */
    private com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3049x46d37ed7 f11162x9f26d311;

    /* renamed from: hasSetFields */
    private final boolean[] f11163xcb94b041 = new boolean[9];

    /* renamed from: limit_flow */
    private boolean f11164x97b88b32;

    /* renamed from: limit_frequency */
    private boolean f11165x5ce49dd8;

    /* renamed from: net_type */
    private com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3060x25d29934 f11166x4cfa189c;

    /* renamed from: retry_count */
    private int f11167xc8af38b8;

    /* renamed from: scene */
    private com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3072x81de1e8b f11168x683188c;

    /* renamed from: timeout_ms */
    private int f11169x5f1f1d44;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf m24583xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf m24584x7c90cfc0() {
        return f11160xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf m24585x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf m24586x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf c3071xc6e22cf = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf) fVar;
        return n51.f.a(this.f11161xd0b26980, c3071xc6e22cf.f11161xd0b26980) && n51.f.a(java.lang.Integer.valueOf(this.f11169x5f1f1d44), java.lang.Integer.valueOf(c3071xc6e22cf.f11169x5f1f1d44)) && n51.f.a(java.lang.Integer.valueOf(this.f11167xc8af38b8), java.lang.Integer.valueOf(c3071xc6e22cf.f11167xc8af38b8)) && n51.f.a(java.lang.Boolean.valueOf(this.f11164x97b88b32), java.lang.Boolean.valueOf(c3071xc6e22cf.f11164x97b88b32)) && n51.f.a(java.lang.Boolean.valueOf(this.f11165x5ce49dd8), java.lang.Boolean.valueOf(c3071xc6e22cf.f11165x5ce49dd8)) && n51.f.a(this.f11168x683188c, c3071xc6e22cf.f11168x683188c) && n51.f.a(this.f11162x9f26d311, c3071xc6e22cf.f11162x9f26d311) && n51.f.a(this.f11166x4cfa189c, c3071xc6e22cf.f11166x4cfa189c);
    }

    /* renamed from: getAppReq */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24587x10fba9b3() {
        return this.f11163xcb94b041[1] ? this.f11161xd0b26980 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getCryptoAlgo */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3049x46d37ed7 m24588x77768eaa() {
        return this.f11163xcb94b041[7] ? this.f11162x9f26d311 : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3049x46d37ed7.kIlinkNoCrypto;
    }

    /* renamed from: getLimitFlow */
    public boolean m24589x675fdcd3() {
        return this.f11164x97b88b32;
    }

    /* renamed from: getLimitFrequency */
    public boolean m24590x88e428d7() {
        return this.f11165x5ce49dd8;
    }

    /* renamed from: getNetType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3060x25d29934 m24591xab9ed241() {
        return this.f11163xcb94b041[8] ? this.f11166x4cfa189c : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3060x25d29934.kIlinkShortlink;
    }

    /* renamed from: getRetryCount */
    public int m24592xa8e25f3d() {
        return this.f11167xc8af38b8;
    }

    /* renamed from: getScene */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3072x81de1e8b m24593x7520bed6() {
        return this.f11163xcb94b041[6] ? this.f11168x683188c : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3072x81de1e8b.kNormal;
    }

    /* renamed from: getTimeoutMs */
    public int m24594x27ef431() {
        return this.f11169x5f1f1d44;
    }

    /* renamed from: hasAppReq */
    public boolean m24595xd0d529f7() {
        return m24597x6e095e9(1);
    }

    /* renamed from: hasCryptoAlgo */
    public boolean m24596xb24e4cee() {
        return m24597x6e095e9(7);
    }

    /* renamed from: hasFieldNumber */
    public boolean m24597x6e095e9(int i17) {
        return this.f11163xcb94b041[i17];
    }

    /* renamed from: hasLimitFlow */
    public boolean m24598x2735460f() {
        return m24597x6e095e9(4);
    }

    /* renamed from: hasLimitFrequency */
    public boolean m24599xf96b251b() {
        return m24597x6e095e9(5);
    }

    /* renamed from: hasNetType */
    public boolean m24600xe6f55a7d() {
        return m24597x6e095e9(8);
    }

    /* renamed from: hasRetryCount */
    public boolean m24601xe3ba1d81() {
        return m24597x6e095e9(3);
    }

    /* renamed from: hasScene */
    public boolean m24602x7b42612() {
        return m24597x6e095e9(6);
    }

    /* renamed from: hasTimeoutMs */
    public boolean m24603xc2545d6d() {
        return m24597x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf m24604x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f11161xd0b26980;
            if (gVar != null && this.f11163xcb94b041[1]) {
                fVar.b(1, gVar);
            }
            if (this.f11163xcb94b041[2]) {
                fVar.e(2, this.f11169x5f1f1d44);
            }
            if (this.f11163xcb94b041[3]) {
                fVar.e(3, this.f11167xc8af38b8);
            }
            if (this.f11163xcb94b041[4]) {
                fVar.a(4, this.f11164x97b88b32);
            }
            if (this.f11163xcb94b041[5]) {
                fVar.a(5, this.f11165x5ce49dd8);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3072x81de1e8b enumC3072x81de1e8b = this.f11168x683188c;
            if (enumC3072x81de1e8b != null && this.f11163xcb94b041[6]) {
                fVar.e(6, enumC3072x81de1e8b.f11179x6ac9171);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3049x46d37ed7 enumC3049x46d37ed7 = this.f11162x9f26d311;
            if (enumC3049x46d37ed7 != null && this.f11163xcb94b041[7]) {
                fVar.e(7, enumC3049x46d37ed7.f11006x6ac9171);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3060x25d29934 enumC3060x25d29934 = this.f11166x4cfa189c;
            if (enumC3060x25d29934 != null && this.f11163xcb94b041[8]) {
                fVar.e(8, enumC3060x25d29934.f11079x6ac9171);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f11161xd0b26980;
            if (gVar2 != null && this.f11163xcb94b041[1]) {
                i18 = 0 + b36.f.b(1, gVar2);
            }
            if (this.f11163xcb94b041[2]) {
                i18 += b36.f.e(2, this.f11169x5f1f1d44);
            }
            if (this.f11163xcb94b041[3]) {
                i18 += b36.f.e(3, this.f11167xc8af38b8);
            }
            if (this.f11163xcb94b041[4]) {
                i18 += b36.f.a(4, this.f11164x97b88b32);
            }
            if (this.f11163xcb94b041[5]) {
                i18 += b36.f.a(5, this.f11165x5ce49dd8);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3072x81de1e8b enumC3072x81de1e8b2 = this.f11168x683188c;
            if (enumC3072x81de1e8b2 != null && this.f11163xcb94b041[6]) {
                i18 += b36.f.e(6, enumC3072x81de1e8b2.f11179x6ac9171);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3049x46d37ed7 enumC3049x46d37ed72 = this.f11162x9f26d311;
            if (enumC3049x46d37ed72 != null && this.f11163xcb94b041[7]) {
                i18 += b36.f.e(7, enumC3049x46d37ed72.f11006x6ac9171);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3060x25d29934 enumC3060x25d299342 = this.f11166x4cfa189c;
            return (enumC3060x25d299342 == null || !this.f11163xcb94b041[8]) ? i18 : i18 + b36.f.e(8, enumC3060x25d299342.f11079x6ac9171);
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
                this.f11161xd0b26980 = aVar2.d(intValue);
                this.f11163xcb94b041[1] = true;
                return 0;
            case 2:
                this.f11169x5f1f1d44 = aVar2.g(intValue);
                this.f11163xcb94b041[2] = true;
                return 0;
            case 3:
                this.f11167xc8af38b8 = aVar2.g(intValue);
                this.f11163xcb94b041[3] = true;
                return 0;
            case 4:
                this.f11164x97b88b32 = aVar2.c(intValue);
                this.f11163xcb94b041[4] = true;
                return 0;
            case 5:
                this.f11165x5ce49dd8 = aVar2.c(intValue);
                this.f11163xcb94b041[5] = true;
                return 0;
            case 6:
                this.f11168x683188c = com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3072x81de1e8b.m24616x382ad972(aVar2.g(intValue));
                this.f11163xcb94b041[6] = true;
                return 0;
            case 7:
                this.f11162x9f26d311 = com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3049x46d37ed7.m24200x382ad972(aVar2.g(intValue));
                this.f11163xcb94b041[7] = true;
                return 0;
            case 8:
                this.f11166x4cfa189c = com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3060x25d29934.m24361x382ad972(aVar2.g(intValue));
                this.f11163xcb94b041[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAppReq */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf m24606x430ddbf(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f11161xd0b26980 = gVar;
        this.f11163xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setCryptoAlgo */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf m24607xa59adcb6(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3049x46d37ed7 enumC3049x46d37ed7) {
        this.f11162x9f26d311 = enumC3049x46d37ed7;
        this.f11163xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setLimitFlow */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf m24608xc3b39d47(boolean z17) {
        this.f11164x97b88b32 = z17;
        this.f11163xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setLimitFrequency */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf m24609x50da90e3(boolean z17) {
        this.f11165x5ce49dd8 = z17;
        this.f11163xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setNetType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf m24610x1f101fb5(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3060x25d29934 enumC3060x25d29934) {
        this.f11166x4cfa189c = enumC3060x25d29934;
        this.f11163xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setRetryCount */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf m24611xd706ad49(int i17) {
        this.f11167xc8af38b8 = i17;
        this.f11163xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setScene */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf m24612x53aed94a(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3072x81de1e8b enumC3072x81de1e8b) {
        this.f11168x683188c = enumC3072x81de1e8b;
        this.f11163xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setTimeoutMs */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf m24613x5ed2b4a5(int i17) {
        this.f11169x5f1f1d44 = i17;
        this.f11163xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf m24605x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3071xc6e22cf) super.mo11468x92b714fd(bArr);
    }
}

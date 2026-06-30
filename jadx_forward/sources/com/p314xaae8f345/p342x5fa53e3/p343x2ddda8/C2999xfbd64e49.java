package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkLoginRequest */
/* loaded from: classes8.dex */
public class C2999xfbd64e49 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 f10404xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49();

    /* renamed from: auth_code */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10405x570bd224;

    /* renamed from: business_req_buffer */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10406x57bcc8e0;

    /* renamed from: client_info */
    private java.lang.String f10407xf5a0d0a2;

    /* renamed from: custom_auth_scene */
    private int f10408x7d0764c3;

    /* renamed from: hasSetFields */
    private final boolean[] f10409xcb94b041 = new boolean[10];

    /* renamed from: lkid */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10410x32b6da;

    /* renamed from: retry_count */
    private int f10411xc8af38b8;

    /* renamed from: security_info */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10412xd6022e4d;

    /* renamed from: timeout_ms */
    private int f10413x5f1f1d44;

    /* renamed from: vendorid */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10414x820a8063;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 m22797xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 m22798x7c90cfc0() {
        return f10404xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 m22799x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 m22800x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 c2999xfbd64e49 = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f10413x5f1f1d44), java.lang.Integer.valueOf(c2999xfbd64e49.f10413x5f1f1d44)) && n51.f.a(java.lang.Integer.valueOf(this.f10411xc8af38b8), java.lang.Integer.valueOf(c2999xfbd64e49.f10411xc8af38b8)) && n51.f.a(this.f10405x570bd224, c2999xfbd64e49.f10405x570bd224) && n51.f.a(this.f10414x820a8063, c2999xfbd64e49.f10414x820a8063) && n51.f.a(this.f10410x32b6da, c2999xfbd64e49.f10410x32b6da) && n51.f.a(this.f10412xd6022e4d, c2999xfbd64e49.f10412xd6022e4d) && n51.f.a(this.f10407xf5a0d0a2, c2999xfbd64e49.f10407xf5a0d0a2) && n51.f.a(this.f10406x57bcc8e0, c2999xfbd64e49.f10406x57bcc8e0) && n51.f.a(java.lang.Integer.valueOf(this.f10408x7d0764c3), java.lang.Integer.valueOf(c2999xfbd64e49.f10408x7d0764c3));
    }

    /* renamed from: getAuthCode */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22801xd131292b() {
        return this.f10409xcb94b041[3] ? this.f10405x570bd224 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getBusinessReqBuffer */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22802xbd2e69e8() {
        return this.f10409xcb94b041[8] ? this.f10406x57bcc8e0 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getClientInfo */
    public java.lang.String m22803x2ff1a70f() {
        return this.f10409xcb94b041[7] ? this.f10407xf5a0d0a2 : "";
    }

    /* renamed from: getCustomAuthScene */
    public int m22804xe037491d() {
        return this.f10408x7d0764c3;
    }

    /* renamed from: getLkid */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22805xfb821f50() {
        return this.f10409xcb94b041[5] ? this.f10410x32b6da : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getRetryCount */
    public int m22806xa8e25f3d() {
        return this.f10411xc8af38b8;
    }

    /* renamed from: getSecurityInfo */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22807x911a4284() {
        return this.f10409xcb94b041[6] ? this.f10412xd6022e4d : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getTimeoutMs */
    public int m22808x27ef431() {
        return this.f10413x5f1f1d44;
    }

    /* renamed from: getVendorid */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22809xfde4bdd9() {
        return this.f10409xcb94b041[4] ? this.f10414x820a8063 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: hasAuthCode */
    public boolean m22810xaba86f() {
        return m22814x6e095e9(3);
    }

    /* renamed from: hasBusinessReqBuffer */
    public boolean m22811xa994d724() {
        return m22814x6e095e9(8);
    }

    /* renamed from: hasClientInfo */
    public boolean m22812x6ac96553() {
        return m22814x6e095e9(7);
    }

    /* renamed from: hasCustomAuthScene */
    public boolean m22813x808fd559() {
        return m22814x6e095e9(9);
    }

    /* renamed from: hasFieldNumber */
    public boolean m22814x6e095e9(int i17) {
        return this.f10409xcb94b041[i17];
    }

    /* renamed from: hasLkid */
    public boolean m22815x2986e094() {
        return m22814x6e095e9(5);
    }

    /* renamed from: hasRetryCount */
    public boolean m22816xe3ba1d81() {
        return m22814x6e095e9(2);
    }

    /* renamed from: hasSecurityInfo */
    public boolean m22817x74fb7fc8() {
        return m22814x6e095e9(6);
    }

    /* renamed from: hasTimeoutMs */
    public boolean m22818xc2545d6d() {
        return m22814x6e095e9(1);
    }

    /* renamed from: hasVendorid */
    public boolean m22819x2d5f3d1d() {
        return m22814x6e095e9(4);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 m22820x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f10409xcb94b041[1]) {
                fVar.e(1, this.f10413x5f1f1d44);
            }
            if (this.f10409xcb94b041[2]) {
                fVar.e(2, this.f10411xc8af38b8);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10405x570bd224;
            if (gVar != null && this.f10409xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10414x820a8063;
            if (gVar2 != null && this.f10409xcb94b041[4]) {
                fVar.b(4, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f10410x32b6da;
            if (gVar3 != null && this.f10409xcb94b041[5]) {
                fVar.b(5, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f10412xd6022e4d;
            if (gVar4 != null && this.f10409xcb94b041[6]) {
                fVar.b(6, gVar4);
            }
            java.lang.String str = this.f10407xf5a0d0a2;
            if (str != null && this.f10409xcb94b041[7]) {
                fVar.j(7, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f10406x57bcc8e0;
            if (gVar5 != null && this.f10409xcb94b041[8]) {
                fVar.b(8, gVar5);
            }
            if (this.f10409xcb94b041[9]) {
                fVar.e(9, this.f10408x7d0764c3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f10409xcb94b041[1] ? 0 + b36.f.e(1, this.f10413x5f1f1d44) : 0;
            if (this.f10409xcb94b041[2]) {
                e17 += b36.f.e(2, this.f10411xc8af38b8);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f10405x570bd224;
            if (gVar6 != null && this.f10409xcb94b041[3]) {
                e17 += b36.f.b(3, gVar6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = this.f10414x820a8063;
            if (gVar7 != null && this.f10409xcb94b041[4]) {
                e17 += b36.f.b(4, gVar7);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = this.f10410x32b6da;
            if (gVar8 != null && this.f10409xcb94b041[5]) {
                e17 += b36.f.b(5, gVar8);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar9 = this.f10412xd6022e4d;
            if (gVar9 != null && this.f10409xcb94b041[6]) {
                e17 += b36.f.b(6, gVar9);
            }
            java.lang.String str2 = this.f10407xf5a0d0a2;
            if (str2 != null && this.f10409xcb94b041[7]) {
                e17 += b36.f.j(7, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar10 = this.f10406x57bcc8e0;
            if (gVar10 != null && this.f10409xcb94b041[8]) {
                e17 += b36.f.b(8, gVar10);
            }
            return this.f10409xcb94b041[9] ? e17 + b36.f.e(9, this.f10408x7d0764c3) : e17;
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
                this.f10413x5f1f1d44 = aVar2.g(intValue);
                this.f10409xcb94b041[1] = true;
                return 0;
            case 2:
                this.f10411xc8af38b8 = aVar2.g(intValue);
                this.f10409xcb94b041[2] = true;
                return 0;
            case 3:
                this.f10405x570bd224 = aVar2.d(intValue);
                this.f10409xcb94b041[3] = true;
                return 0;
            case 4:
                this.f10414x820a8063 = aVar2.d(intValue);
                this.f10409xcb94b041[4] = true;
                return 0;
            case 5:
                this.f10410x32b6da = aVar2.d(intValue);
                this.f10409xcb94b041[5] = true;
                return 0;
            case 6:
                this.f10412xd6022e4d = aVar2.d(intValue);
                this.f10409xcb94b041[6] = true;
                return 0;
            case 7:
                this.f10407xf5a0d0a2 = aVar2.k(intValue);
                this.f10409xcb94b041[7] = true;
                return 0;
            case 8:
                this.f10406x57bcc8e0 = aVar2.d(intValue);
                this.f10409xcb94b041[8] = true;
                return 0;
            case 9:
                this.f10408x7d0764c3 = aVar2.g(intValue);
                this.f10409xcb94b041[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAuthCode */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 m22822xcbe98a37(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10405x570bd224 = gVar;
        this.f10409xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setBusinessReqBuffer */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 m22823x98c4765c(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10406x57bcc8e0 = gVar;
        this.f10409xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setClientInfo */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 m22824x5e15f51b(java.lang.String str) {
        this.f10407xf5a0d0a2 = str;
        this.f10409xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setCustomAuthScene */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 m22825x170de291(int i17) {
        this.f10408x7d0764c3 = i17;
        this.f10409xcb94b041[9] = true;
        return this;
    }

    /* renamed from: setLkid */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 m22826x764ce65c(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10410x32b6da = gVar;
        this.f10409xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setRetryCount */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 m22827xd706ad49(int i17) {
        this.f10411xc8af38b8 = i17;
        this.f10409xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setSecurityInfo */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 m22828xc7633d90(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10412xd6022e4d = gVar;
        this.f10409xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setTimeoutMs */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 m22829x5ed2b4a5(int i17) {
        this.f10413x5f1f1d44 = i17;
        this.f10409xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setVendorid */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 m22830xf89d1ee5(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10414x820a8063 = gVar;
        this.f10409xcb94b041[4] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 m22821x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2999xfbd64e49) super.mo11468x92b714fd(bArr);
    }
}

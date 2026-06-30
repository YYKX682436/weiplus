package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkDeviceSessionInfo */
/* loaded from: classes8.dex */
public class C3051x58cff2ab extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab f11010xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab();

    /* renamed from: autoauth_enc_key */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f11011x5d7f8512;

    /* renamed from: client_random_key */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f11012x934d3dd7;

    /* renamed from: cookie */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f11013xaf400a64;

    /* renamed from: hasSetFields */
    private final boolean[] f11014xcb94b041 = new boolean[9];

    /* renamed from: ilink_deviceid */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f11015xc7947acd;

    /* renamed from: ilink_productid */
    private int f11016xeac868ee;

    /* renamed from: server_random_key */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f11017x2960a75f;

    /* renamed from: serverid */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f11018x5233779e;
    private long uin;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab m24219xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab m24220x7c90cfc0() {
        return f11010xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab m24221x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab m24222x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab c3051x58cff2ab = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab) fVar;
        return n51.f.a(this.f11012x934d3dd7, c3051x58cff2ab.f11012x934d3dd7) && n51.f.a(this.f11017x2960a75f, c3051x58cff2ab.f11017x2960a75f) && n51.f.a(this.f11011x5d7f8512, c3051x58cff2ab.f11011x5d7f8512) && n51.f.a(this.f11018x5233779e, c3051x58cff2ab.f11018x5233779e) && n51.f.a(this.f11013xaf400a64, c3051x58cff2ab.f11013xaf400a64) && n51.f.a(java.lang.Long.valueOf(this.uin), java.lang.Long.valueOf(c3051x58cff2ab.uin)) && n51.f.a(this.f11015xc7947acd, c3051x58cff2ab.f11015xc7947acd) && n51.f.a(java.lang.Integer.valueOf(this.f11016xeac868ee), java.lang.Integer.valueOf(c3051x58cff2ab.f11016xeac868ee));
    }

    /* renamed from: getAutoauthEncKey */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24223xefd13ed2() {
        return this.f11014xcb94b041[3] ? this.f11011x5d7f8512 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getClientRandomKey */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24224xbc4b78db() {
        return this.f11014xcb94b041[1] ? this.f11012x934d3dd7 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getCookie */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24225x14572d5a() {
        return this.f11014xcb94b041[5] ? this.f11013xaf400a64 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getIlinkDeviceid */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24226x17fccf3e() {
        return this.f11014xcb94b041[7] ? this.f11015xc7947acd : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getIlinkProductid */
    public int m24227xa76aa29d() {
        return this.f11016xeac868ee;
    }

    /* renamed from: getServerRandomKey */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24228xedbba463() {
        return this.f11014xcb94b041[2] ? this.f11017x2960a75f : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getServerid */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24229xce0db514() {
        return this.f11014xcb94b041[4] ? this.f11018x5233779e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getUin */
    public long m24230xb5887524() {
        return this.uin;
    }

    /* renamed from: hasAutoauthEncKey */
    public boolean m24231x60583b16() {
        return m24234x6e095e9(3);
    }

    /* renamed from: hasClientRandomKey */
    public boolean m24232x5ca40517() {
        return m24234x6e095e9(1);
    }

    /* renamed from: hasCookie */
    public boolean m24233xd430ad9e() {
        return m24234x6e095e9(5);
    }

    /* renamed from: hasFieldNumber */
    public boolean m24234x6e095e9(int i17) {
        return this.f11014xcb94b041[i17];
    }

    /* renamed from: hasIlinkDeviceid */
    public boolean m24235xb0433a7a() {
        return m24234x6e095e9(7);
    }

    /* renamed from: hasIlinkProductid */
    public boolean m24236x17f19ee1() {
        return m24234x6e095e9(8);
    }

    /* renamed from: hasServerRandomKey */
    public boolean m24237x8e14309f() {
        return m24234x6e095e9(2);
    }

    /* renamed from: hasServerid */
    public boolean m24238xfd883458() {
        return m24234x6e095e9(4);
    }

    /* renamed from: hasUin */
    public boolean m24239xb7047b60() {
        return m24234x6e095e9(6);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab m24240x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f11012x934d3dd7;
            if (gVar != null && this.f11014xcb94b041[1]) {
                fVar.b(1, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f11017x2960a75f;
            if (gVar2 != null && this.f11014xcb94b041[2]) {
                fVar.b(2, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f11011x5d7f8512;
            if (gVar3 != null && this.f11014xcb94b041[3]) {
                fVar.b(3, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f11018x5233779e;
            if (gVar4 != null && this.f11014xcb94b041[4]) {
                fVar.b(4, gVar4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f11013xaf400a64;
            if (gVar5 != null && this.f11014xcb94b041[5]) {
                fVar.b(5, gVar5);
            }
            if (this.f11014xcb94b041[6]) {
                fVar.h(6, this.uin);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f11015xc7947acd;
            if (gVar6 != null && this.f11014xcb94b041[7]) {
                fVar.b(7, gVar6);
            }
            if (this.f11014xcb94b041[8]) {
                fVar.e(8, this.f11016xeac868ee);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = this.f11012x934d3dd7;
            if (gVar7 != null && this.f11014xcb94b041[1]) {
                i18 = 0 + b36.f.b(1, gVar7);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = this.f11017x2960a75f;
            if (gVar8 != null && this.f11014xcb94b041[2]) {
                i18 += b36.f.b(2, gVar8);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar9 = this.f11011x5d7f8512;
            if (gVar9 != null && this.f11014xcb94b041[3]) {
                i18 += b36.f.b(3, gVar9);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar10 = this.f11018x5233779e;
            if (gVar10 != null && this.f11014xcb94b041[4]) {
                i18 += b36.f.b(4, gVar10);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar11 = this.f11013xaf400a64;
            if (gVar11 != null && this.f11014xcb94b041[5]) {
                i18 += b36.f.b(5, gVar11);
            }
            if (this.f11014xcb94b041[6]) {
                i18 += b36.f.h(6, this.uin);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar12 = this.f11015xc7947acd;
            if (gVar12 != null && this.f11014xcb94b041[7]) {
                i18 += b36.f.b(7, gVar12);
            }
            return this.f11014xcb94b041[8] ? i18 + b36.f.e(8, this.f11016xeac868ee) : i18;
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
                this.f11012x934d3dd7 = aVar2.d(intValue);
                this.f11014xcb94b041[1] = true;
                return 0;
            case 2:
                this.f11017x2960a75f = aVar2.d(intValue);
                this.f11014xcb94b041[2] = true;
                return 0;
            case 3:
                this.f11011x5d7f8512 = aVar2.d(intValue);
                this.f11014xcb94b041[3] = true;
                return 0;
            case 4:
                this.f11018x5233779e = aVar2.d(intValue);
                this.f11014xcb94b041[4] = true;
                return 0;
            case 5:
                this.f11013xaf400a64 = aVar2.d(intValue);
                this.f11014xcb94b041[5] = true;
                return 0;
            case 6:
                this.uin = aVar2.i(intValue);
                this.f11014xcb94b041[6] = true;
                return 0;
            case 7:
                this.f11015xc7947acd = aVar2.d(intValue);
                this.f11014xcb94b041[7] = true;
                return 0;
            case 8:
                this.f11016xeac868ee = aVar2.g(intValue);
                this.f11014xcb94b041[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAutoauthEncKey */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab m24242xb7c7a6de(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f11011x5d7f8512 = gVar;
        this.f11014xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setClientRandomKey */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab m24243xf322124f(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f11012x934d3dd7 = gVar;
        this.f11014xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setCookie */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab m24244x78c6166(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f11013xaf400a64 = gVar;
        this.f11014xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setIlinkDeviceid */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab m24245xaad335b2(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f11015xc7947acd = gVar;
        this.f11014xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setIlinkProductid */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab m24246x6f610aa9(int i17) {
        this.f11016xeac868ee = i17;
        this.f11014xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setServerRandomKey */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab m24247x24923dd7(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f11017x2960a75f = gVar;
        this.f11014xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setServerid */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab m24248xc8c61620(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f11018x5233779e = gVar;
        this.f11014xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setUin */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab m24249xca029c98(long j17) {
        this.uin = j17;
        this.f11014xcb94b041[6] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab m24241x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3051x58cff2ab) super.mo11468x92b714fd(bArr);
    }
}

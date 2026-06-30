package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkAppCommSessionInfo */
/* loaded from: classes8.dex */
public class C3028x1e4be67a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a f10678xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a();

    /* renamed from: auth_flag */
    private com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3027x7803c6b2 f10679x570d23a3;

    /* renamed from: autoauth_enc_key */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10680x5d7f8512;

    /* renamed from: client_session_key */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10681xfebf0ec2;

    /* renamed from: h5_transfer_route_info */
    private com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f f10682xc83faf46;

    /* renamed from: hasSetFields */
    private final boolean[] f10683xcb94b041 = new boolean[8];

    /* renamed from: server_session_key */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10684x2b18d63a;

    /* renamed from: serverid */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10685x5233779e;
    private long uin;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a m23288xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a m23289x7c90cfc0() {
        return f10678xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a m23290x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a m23291x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a c3028x1e4be67a = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a) fVar;
        return n51.f.a(this.f10681xfebf0ec2, c3028x1e4be67a.f10681xfebf0ec2) && n51.f.a(this.f10684x2b18d63a, c3028x1e4be67a.f10684x2b18d63a) && n51.f.a(this.f10680x5d7f8512, c3028x1e4be67a.f10680x5d7f8512) && n51.f.a(java.lang.Long.valueOf(this.uin), java.lang.Long.valueOf(c3028x1e4be67a.uin)) && n51.f.a(this.f10685x5233779e, c3028x1e4be67a.f10685x5233779e) && n51.f.a(this.f10679x570d23a3, c3028x1e4be67a.f10679x570d23a3) && n51.f.a(this.f10682xc83faf46, c3028x1e4be67a.f10682xc83faf46);
    }

    /* renamed from: getAuthFlag */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3027x7803c6b2 m23292xd1327aaa() {
        return this.f10683xcb94b041[6] ? this.f10679x570d23a3 : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3027x7803c6b2.kIlinkAppNoSessionEncrypt;
    }

    /* renamed from: getAutoauthEncKey */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m23293xefd13ed2() {
        return this.f10683xcb94b041[3] ? this.f10680x5d7f8512 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getClientSessionKey */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m23294x2950c98a() {
        return this.f10683xcb94b041[1] ? this.f10681xfebf0ec2 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getH5TransferRouteInfo */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f m23295xd9bb0269() {
        return this.f10683xcb94b041[7] ? this.f10682xc83faf46 : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f.m23145xaf65a0fc();
    }

    /* renamed from: getServerSessionKey */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m23296x25e60f02() {
        return this.f10683xcb94b041[2] ? this.f10684x2b18d63a : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getServerid */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m23297xce0db514() {
        return this.f10683xcb94b041[5] ? this.f10685x5233779e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getUin */
    public long m23298xb5887524() {
        return this.uin;
    }

    /* renamed from: hasAuthFlag */
    public boolean m23299xacf9ee() {
        return m23302x6e095e9(6);
    }

    /* renamed from: hasAutoauthEncKey */
    public boolean m23300x60583b16() {
        return m23302x6e095e9(3);
    }

    /* renamed from: hasClientSessionKey */
    public boolean m23301x9409c4ce() {
        return m23302x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m23302x6e095e9(int i17) {
        return this.f10683xcb94b041[i17];
    }

    /* renamed from: hasH5TransferRouteInfo */
    public boolean m23303x463b10a5() {
        return m23302x6e095e9(7);
    }

    /* renamed from: hasServerSessionKey */
    public boolean m23304x909f0a46() {
        return m23302x6e095e9(2);
    }

    /* renamed from: hasServerid */
    public boolean m23305xfd883458() {
        return m23302x6e095e9(5);
    }

    /* renamed from: hasUin */
    public boolean m23306xb7047b60() {
        return m23302x6e095e9(4);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a m23307x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10681xfebf0ec2;
            if (gVar != null && this.f10683xcb94b041[1]) {
                fVar.b(1, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10684x2b18d63a;
            if (gVar2 != null && this.f10683xcb94b041[2]) {
                fVar.b(2, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f10680x5d7f8512;
            if (gVar3 != null && this.f10683xcb94b041[3]) {
                fVar.b(3, gVar3);
            }
            if (this.f10683xcb94b041[4]) {
                fVar.h(4, this.uin);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f10685x5233779e;
            if (gVar4 != null && this.f10683xcb94b041[5]) {
                fVar.b(5, gVar4);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3027x7803c6b2 enumC3027x7803c6b2 = this.f10679x570d23a3;
            if (enumC3027x7803c6b2 != null && this.f10683xcb94b041[6]) {
                fVar.e(6, enumC3027x7803c6b2.f10677x6ac9171);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f c3020xcc3eed7f = this.f10682xc83faf46;
            if (c3020xcc3eed7f != null && this.f10683xcb94b041[7]) {
                fVar.i(7, c3020xcc3eed7f.mo75928xcd1e8d8());
                this.f10682xc83faf46.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f10681xfebf0ec2;
            if (gVar5 != null && this.f10683xcb94b041[1]) {
                i18 = 0 + b36.f.b(1, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f10684x2b18d63a;
            if (gVar6 != null && this.f10683xcb94b041[2]) {
                i18 += b36.f.b(2, gVar6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = this.f10680x5d7f8512;
            if (gVar7 != null && this.f10683xcb94b041[3]) {
                i18 += b36.f.b(3, gVar7);
            }
            if (this.f10683xcb94b041[4]) {
                i18 += b36.f.h(4, this.uin);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = this.f10685x5233779e;
            if (gVar8 != null && this.f10683xcb94b041[5]) {
                i18 += b36.f.b(5, gVar8);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3027x7803c6b2 enumC3027x7803c6b22 = this.f10679x570d23a3;
            if (enumC3027x7803c6b22 != null && this.f10683xcb94b041[6]) {
                i18 += b36.f.e(6, enumC3027x7803c6b22.f10677x6ac9171);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f c3020xcc3eed7f2 = this.f10682xc83faf46;
            return (c3020xcc3eed7f2 == null || !this.f10683xcb94b041[7]) ? i18 : i18 + b36.f.i(7, c3020xcc3eed7f2.mo75928xcd1e8d8());
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
                this.f10681xfebf0ec2 = aVar2.d(intValue);
                this.f10683xcb94b041[1] = true;
                return 0;
            case 2:
                this.f10684x2b18d63a = aVar2.d(intValue);
                this.f10683xcb94b041[2] = true;
                return 0;
            case 3:
                this.f10680x5d7f8512 = aVar2.d(intValue);
                this.f10683xcb94b041[3] = true;
                return 0;
            case 4:
                this.uin = aVar2.i(intValue);
                this.f10683xcb94b041[4] = true;
                return 0;
            case 5:
                this.f10685x5233779e = aVar2.d(intValue);
                this.f10683xcb94b041[5] = true;
                return 0;
            case 6:
                this.f10679x570d23a3 = com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3027x7803c6b2.m23283x382ad972(aVar2.g(intValue));
                this.f10683xcb94b041[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f c3020xcc3eed7f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f();
                    if (bArr != null && bArr.length > 0) {
                        c3020xcc3eed7f3.mo11468x92b714fd(bArr);
                    }
                    this.f10682xc83faf46 = c3020xcc3eed7f3;
                }
                this.f10683xcb94b041[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAuthFlag */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a m23309xcbeadbb6(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3027x7803c6b2 enumC3027x7803c6b2) {
        this.f10679x570d23a3 = enumC3027x7803c6b2;
        this.f10683xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setAutoauthEncKey */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a m23310xb7c7a6de(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10680x5d7f8512 = gVar;
        this.f10683xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setClientSessionKey */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a m23311xcd4d5e96(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10681xfebf0ec2 = gVar;
        this.f10683xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setH5TransferRouteInfo */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a m23312x27ffc1dd(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f c3020xcc3eed7f) {
        this.f10682xc83faf46 = c3020xcc3eed7f;
        this.f10683xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setServerSessionKey */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a m23313xc9e2a40e(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10684x2b18d63a = gVar;
        this.f10683xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setServerid */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a m23314xc8c61620(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10685x5233779e = gVar;
        this.f10683xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setUin */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a m23315xca029c98(long j17) {
        this.uin = j17;
        this.f10683xcb94b041[4] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a m23308x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3028x1e4be67a) super.mo11468x92b714fd(bArr);
    }
}

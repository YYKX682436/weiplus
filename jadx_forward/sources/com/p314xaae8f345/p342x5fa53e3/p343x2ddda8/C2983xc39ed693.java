package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkCheckLoginQrCodeResponse */
/* loaded from: classes4.dex */
public class C2983xc39ed693 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693 f10318xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693();

    /* renamed from: avatar_url */
    private java.lang.String f10319xe7fd6189;

    /* renamed from: business_confirm_resp_buffer */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10320x39ad5d91;

    /* renamed from: hasSetFields */
    private final boolean[] f10321xcb94b041 = new boolean[6];

    /* renamed from: nickname */
    private java.lang.String f10322x436a86e;

    /* renamed from: status */
    private com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2998x3b62e1c6 f10323xcacdcff2;
    private long uin;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693 m22536xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693 m22537x7c90cfc0() {
        return f10318xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693 m22538x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693 m22539x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693 c2983xc39ed693 = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693) fVar;
        return n51.f.a(this.f10323xcacdcff2, c2983xc39ed693.f10323xcacdcff2) && n51.f.a(java.lang.Long.valueOf(this.uin), java.lang.Long.valueOf(c2983xc39ed693.uin)) && n51.f.a(this.f10322x436a86e, c2983xc39ed693.f10322x436a86e) && n51.f.a(this.f10319xe7fd6189, c2983xc39ed693.f10319xe7fd6189) && n51.f.a(this.f10320x39ad5d91, c2983xc39ed693.f10320x39ad5d91);
    }

    /* renamed from: getAvatarUrl */
    public java.lang.String m22540xe5e0d2a0() {
        return this.f10321xcb94b041[4] ? this.f10319xe7fd6189 : "";
    }

    /* renamed from: getBusinessConfirmRespBuffer */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22541xc7bba87a() {
        return this.f10321xcb94b041[5] ? this.f10320x39ad5d91 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getNickname */
    public java.lang.String m22542x8010e5e4() {
        return this.f10321xcb94b041[3] ? this.f10322x436a86e : "";
    }

    /* renamed from: getStatus */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2998x3b62e1c6 m22543x2fe4f2e8() {
        return this.f10321xcb94b041[1] ? this.f10323xcacdcff2 : com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2998x3b62e1c6.kLoginQrCodeStatus_NoScan;
    }

    /* renamed from: getUin */
    public long m22544xb5887524() {
        return this.uin;
    }

    /* renamed from: hasAvatarUrl */
    public boolean m22545xa5b63bdc() {
        return m22547x6e095e9(4);
    }

    /* renamed from: hasBusinessConfirmRespBuffer */
    public boolean m22546xd16f19b6() {
        return m22547x6e095e9(5);
    }

    /* renamed from: hasFieldNumber */
    public boolean m22547x6e095e9(int i17) {
        return this.f10321xcb94b041[i17];
    }

    /* renamed from: hasNickname */
    public boolean m22548xaf8b6528() {
        return m22547x6e095e9(3);
    }

    /* renamed from: hasStatus */
    public boolean m22549xefbe732c() {
        return m22547x6e095e9(1);
    }

    /* renamed from: hasUin */
    public boolean m22550xb7047b60() {
        return m22547x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693 m22551x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2998x3b62e1c6 enumC2998x3b62e1c6 = this.f10323xcacdcff2;
            if (enumC2998x3b62e1c6 != null && this.f10321xcb94b041[1]) {
                fVar.e(1, enumC2998x3b62e1c6.f10403x6ac9171);
            }
            if (this.f10321xcb94b041[2]) {
                fVar.h(2, this.uin);
            }
            java.lang.String str = this.f10322x436a86e;
            if (str != null && this.f10321xcb94b041[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f10319xe7fd6189;
            if (str2 != null && this.f10321xcb94b041[4]) {
                fVar.j(4, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10320x39ad5d91;
            if (gVar != null && this.f10321xcb94b041[5]) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2998x3b62e1c6 enumC2998x3b62e1c62 = this.f10323xcacdcff2;
            if (enumC2998x3b62e1c62 != null && this.f10321xcb94b041[1]) {
                i18 = 0 + b36.f.e(1, enumC2998x3b62e1c62.f10403x6ac9171);
            }
            if (this.f10321xcb94b041[2]) {
                i18 += b36.f.h(2, this.uin);
            }
            java.lang.String str3 = this.f10322x436a86e;
            if (str3 != null && this.f10321xcb94b041[3]) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f10319xe7fd6189;
            if (str4 != null && this.f10321xcb94b041[4]) {
                i18 += b36.f.j(4, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10320x39ad5d91;
            return (gVar2 == null || !this.f10321xcb94b041[5]) ? i18 : i18 + b36.f.b(5, gVar2);
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
            this.f10323xcacdcff2 = com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2998x3b62e1c6.m22792x382ad972(aVar2.g(intValue));
            this.f10321xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.uin = aVar2.i(intValue);
            this.f10321xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f10322x436a86e = aVar2.k(intValue);
            this.f10321xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f10319xe7fd6189 = aVar2.k(intValue);
            this.f10321xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f10320x39ad5d91 = aVar2.d(intValue);
        this.f10321xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setAvatarUrl */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693 m22553x42349314(java.lang.String str) {
        this.f10319xe7fd6189 = str;
        this.f10321xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setBusinessConfirmRespBuffer */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693 m22554x118800ee(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10320x39ad5d91 = gVar;
        this.f10321xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setNickname */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693 m22555x7ac946f0(java.lang.String str) {
        this.f10322x436a86e = str;
        this.f10321xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setStatus */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693 m22556x231a26f4(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2998x3b62e1c6 enumC2998x3b62e1c6) {
        this.f10323xcacdcff2 = enumC2998x3b62e1c6;
        this.f10321xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setUin */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693 m22557xca029c98(long j17) {
        this.uin = j17;
        this.f10321xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693 m22552x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2983xc39ed693) super.mo11468x92b714fd(bArr);
    }
}

package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.CloudCgiRequest */
/* loaded from: classes15.dex */
public class C3017xbcf84e3f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f f10615xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f();

    /* renamed from: cgi_type */
    private com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3018xa502518a f10616x2d5452b4;

    /* renamed from: cloud_taskid */
    private int f10617x7a319eaa;

    /* renamed from: hasSetFields */
    private final boolean[] f10618xcb94b041 = new boolean[8];

    /* renamed from: ilink_cgi_url */
    private java.lang.String f10619xcbf61259;

    /* renamed from: long_polling */
    private boolean f10620xe20aa500;

    /* renamed from: request_body */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10621x4da64152;

    /* renamed from: timeout_ms */
    private int f10622x5f1f1d44;

    /* renamed from: use_network_type */
    private com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5 f10623x13323263;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f m23104xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f m23105x7c90cfc0() {
        return f10615xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f m23106x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f m23107x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f c3017xbcf84e3f = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f) fVar;
        return n51.f.a(this.f10616x2d5452b4, c3017xbcf84e3f.f10616x2d5452b4) && n51.f.a(java.lang.Integer.valueOf(this.f10617x7a319eaa), java.lang.Integer.valueOf(c3017xbcf84e3f.f10617x7a319eaa)) && n51.f.a(this.f10621x4da64152, c3017xbcf84e3f.f10621x4da64152) && n51.f.a(java.lang.Integer.valueOf(this.f10622x5f1f1d44), java.lang.Integer.valueOf(c3017xbcf84e3f.f10622x5f1f1d44)) && n51.f.a(java.lang.Boolean.valueOf(this.f10620xe20aa500), java.lang.Boolean.valueOf(c3017xbcf84e3f.f10620xe20aa500)) && n51.f.a(this.f10619xcbf61259, c3017xbcf84e3f.f10619xcbf61259) && n51.f.a(this.f10623x13323263, c3017xbcf84e3f.f10623x13323263);
    }

    /* renamed from: getCgiType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3018xa502518a m23108x6888f529() {
        return this.f10618xcb94b041[1] ? this.f10616x2d5452b4 : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3018xa502518a.kAuthRequest;
    }

    /* renamed from: getCloudTaskid */
    public int m23109x7fabcabf() {
        return this.f10617x7a319eaa;
    }

    /* renamed from: getIlinkCgiUrl */
    public java.lang.String m23110x1de1337() {
        return this.f10618xcb94b041[6] ? this.f10619xcbf61259 : "";
    }

    /* renamed from: getLongPolling */
    public boolean m23111x62ab8871() {
        return this.f10620xe20aa500;
    }

    /* renamed from: getRequestBody */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m23112x1e5b079b() {
        return this.f10618xcb94b041[3] ? this.f10621x4da64152 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getTimeoutMs */
    public int m23113x27ef431() {
        return this.f10622x5f1f1d44;
    }

    /* renamed from: getUseNetworkType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5 m23114x46a55b77() {
        return this.f10618xcb94b041[7] ? this.f10623x13323263 : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5.kIlinkNetworkTypeDefault;
    }

    /* renamed from: hasCgiType */
    public boolean m23115xa3df7d65() {
        return m23117x6e095e9(1);
    }

    /* renamed from: hasCloudTaskid */
    public boolean m23116x9fcbd4fb() {
        return m23117x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m23117x6e095e9(int i17) {
        return this.f10618xcb94b041[i17];
    }

    /* renamed from: hasIlinkCgiUrl */
    public boolean m23118x21fe1d73() {
        return m23117x6e095e9(6);
    }

    /* renamed from: hasLongPolling */
    public boolean m23119x82cb92ad() {
        return m23117x6e095e9(5);
    }

    /* renamed from: hasRequestBody */
    public boolean m23120x3e7b11d7() {
        return m23117x6e095e9(3);
    }

    /* renamed from: hasTimeoutMs */
    public boolean m23121xc2545d6d() {
        return m23117x6e095e9(4);
    }

    /* renamed from: hasUseNetworkType */
    public boolean m23122xb72c57bb() {
        return m23117x6e095e9(7);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f m23123x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3018xa502518a enumC3018xa502518a = this.f10616x2d5452b4;
            if (enumC3018xa502518a != null && this.f10618xcb94b041[1]) {
                fVar.e(1, enumC3018xa502518a.f10629x6ac9171);
            }
            if (this.f10618xcb94b041[2]) {
                fVar.e(2, this.f10617x7a319eaa);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10621x4da64152;
            if (gVar != null && this.f10618xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            if (this.f10618xcb94b041[4]) {
                fVar.e(4, this.f10622x5f1f1d44);
            }
            if (this.f10618xcb94b041[5]) {
                fVar.a(5, this.f10620xe20aa500);
            }
            java.lang.String str = this.f10619xcbf61259;
            if (str != null && this.f10618xcb94b041[6]) {
                fVar.j(6, str);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5 enumC3061x826bf2c5 = this.f10623x13323263;
            if (enumC3061x826bf2c5 != null && this.f10618xcb94b041[7]) {
                fVar.e(7, enumC3061x826bf2c5.f11085x6ac9171);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3018xa502518a enumC3018xa502518a2 = this.f10616x2d5452b4;
            if (enumC3018xa502518a2 != null && this.f10618xcb94b041[1]) {
                i18 = 0 + b36.f.e(1, enumC3018xa502518a2.f10629x6ac9171);
            }
            if (this.f10618xcb94b041[2]) {
                i18 += b36.f.e(2, this.f10617x7a319eaa);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10621x4da64152;
            if (gVar2 != null && this.f10618xcb94b041[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            if (this.f10618xcb94b041[4]) {
                i18 += b36.f.e(4, this.f10622x5f1f1d44);
            }
            if (this.f10618xcb94b041[5]) {
                i18 += b36.f.a(5, this.f10620xe20aa500);
            }
            java.lang.String str2 = this.f10619xcbf61259;
            if (str2 != null && this.f10618xcb94b041[6]) {
                i18 += b36.f.j(6, str2);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5 enumC3061x826bf2c52 = this.f10623x13323263;
            return (enumC3061x826bf2c52 == null || !this.f10618xcb94b041[7]) ? i18 : i18 + b36.f.e(7, enumC3061x826bf2c52.f11085x6ac9171);
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
                this.f10616x2d5452b4 = com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3018xa502518a.m23134x382ad972(aVar2.g(intValue));
                this.f10618xcb94b041[1] = true;
                return 0;
            case 2:
                this.f10617x7a319eaa = aVar2.g(intValue);
                this.f10618xcb94b041[2] = true;
                return 0;
            case 3:
                this.f10621x4da64152 = aVar2.d(intValue);
                this.f10618xcb94b041[3] = true;
                return 0;
            case 4:
                this.f10622x5f1f1d44 = aVar2.g(intValue);
                this.f10618xcb94b041[4] = true;
                return 0;
            case 5:
                this.f10620xe20aa500 = aVar2.c(intValue);
                this.f10618xcb94b041[5] = true;
                return 0;
            case 6:
                this.f10619xcbf61259 = aVar2.k(intValue);
                this.f10618xcb94b041[6] = true;
                return 0;
            case 7:
                this.f10623x13323263 = com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5.m24367x382ad972(aVar2.g(intValue));
                this.f10618xcb94b041[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setCgiType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f m23125xdbfa429d(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3018xa502518a enumC3018xa502518a) {
        this.f10616x2d5452b4 = enumC3018xa502518a;
        this.f10618xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setCloudTaskid */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f m23126x16113e33(int i17) {
        this.f10617x7a319eaa = i17;
        this.f10618xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setIlinkCgiUrl */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f m23127x984386ab(java.lang.String str) {
        this.f10619xcbf61259 = str;
        this.f10618xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setLongPolling */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f m23128xf910fbe5(boolean z17) {
        this.f10620xe20aa500 = z17;
        this.f10618xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setRequestBody */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f m23129xb4c07b0f(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10621x4da64152 = gVar;
        this.f10618xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setTimeoutMs */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f m23130x5ed2b4a5(int i17) {
        this.f10622x5f1f1d44 = i17;
        this.f10618xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setUseNetworkType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f m23131xe9bc383(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5 enumC3061x826bf2c5) {
        this.f10623x13323263 = enumC3061x826bf2c5;
        this.f10618xcb94b041[7] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f m23124x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f) super.mo11468x92b714fd(bArr);
    }
}

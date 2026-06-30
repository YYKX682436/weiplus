package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkRequestInfo */
/* loaded from: classes15.dex */
public class C27109x3a9f481a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a f59193xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a();

    /* renamed from: body */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f59194x2e39a2;

    /* renamed from: cgi_type */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27108x354cef04 f59195x2d5452b4;

    /* renamed from: cmdid */
    private int f59196x5a627d5;

    /* renamed from: content_type */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27094xdee5af90 f59197x3194f740;

    /* renamed from: crypto_algo */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27095x46d37ed7 f59198x9f26d311;

    /* renamed from: hasSetFields */
    private final boolean[] f59199xcb94b041 = new boolean[15];

    /* renamed from: limit_flow */
    private boolean f59200x97b88b32;

    /* renamed from: limit_frequency */
    private boolean f59201x5ce49dd8;

    /* renamed from: long_polling */
    private boolean f59202xe20aa500;

    /* renamed from: long_polling_timeout */
    private int f59203x91d49922;

    /* renamed from: net_type */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27105x25d29934 f59204x4cfa189c;

    /* renamed from: network_status_sensitive */
    private boolean f59205x59443c7a;

    /* renamed from: retry_count */
    private int f59206xc8af38b8;

    /* renamed from: timeout_ms */
    private int f59207x5f1f1d44;
    private java.lang.String url;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110413xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110414x7c90cfc0() {
        return f59193xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110415x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110416x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a c27109x3a9f481a = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f59196x5a627d5), java.lang.Integer.valueOf(c27109x3a9f481a.f59196x5a627d5)) && n51.f.a(this.url, c27109x3a9f481a.url) && n51.f.a(this.f59194x2e39a2, c27109x3a9f481a.f59194x2e39a2) && n51.f.a(java.lang.Integer.valueOf(this.f59207x5f1f1d44), java.lang.Integer.valueOf(c27109x3a9f481a.f59207x5f1f1d44)) && n51.f.a(java.lang.Integer.valueOf(this.f59206xc8af38b8), java.lang.Integer.valueOf(c27109x3a9f481a.f59206xc8af38b8)) && n51.f.a(this.f59204x4cfa189c, c27109x3a9f481a.f59204x4cfa189c) && n51.f.a(this.f59198x9f26d311, c27109x3a9f481a.f59198x9f26d311) && n51.f.a(java.lang.Boolean.valueOf(this.f59200x97b88b32), java.lang.Boolean.valueOf(c27109x3a9f481a.f59200x97b88b32)) && n51.f.a(java.lang.Boolean.valueOf(this.f59201x5ce49dd8), java.lang.Boolean.valueOf(c27109x3a9f481a.f59201x5ce49dd8)) && n51.f.a(java.lang.Boolean.valueOf(this.f59202xe20aa500), java.lang.Boolean.valueOf(c27109x3a9f481a.f59202xe20aa500)) && n51.f.a(java.lang.Integer.valueOf(this.f59203x91d49922), java.lang.Integer.valueOf(c27109x3a9f481a.f59203x91d49922)) && n51.f.a(this.f59197x3194f740, c27109x3a9f481a.f59197x3194f740) && n51.f.a(java.lang.Boolean.valueOf(this.f59205x59443c7a), java.lang.Boolean.valueOf(c27109x3a9f481a.f59205x59443c7a)) && n51.f.a(this.f59195x2d5452b4, c27109x3a9f481a.f59195x2d5452b4);
    }

    /* renamed from: getBody */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m110417xfb7da218() {
        return this.f59199xcb94b041[3] ? this.f59194x2e39a2 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getCgiType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27108x354cef04 m110418x6888f529() {
        return this.f59199xcb94b041[14] ? this.f59195x2d5452b4 : com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27108x354cef04.kIlinkCGITypeDirect;
    }

    /* renamed from: getCmdid */
    public int m110419x7443ce1f() {
        return this.f59196x5a627d5;
    }

    /* renamed from: getContentType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27094xdee5af90 m110420xc2a49a1d() {
        return this.f59199xcb94b041[12] ? this.f59197x3194f740 : com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27094xdee5af90.kIlinkContentTypeDefault;
    }

    /* renamed from: getCryptoAlgo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27095x46d37ed7 m110421x77768eaa() {
        return this.f59199xcb94b041[7] ? this.f59198x9f26d311 : com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27095x46d37ed7.kIlinkNoCrypto;
    }

    /* renamed from: getLimitFlow */
    public boolean m110422x675fdcd3() {
        return this.f59200x97b88b32;
    }

    /* renamed from: getLimitFrequency */
    public boolean m110423x88e428d7() {
        return this.f59201x5ce49dd8;
    }

    /* renamed from: getLongPolling */
    public boolean m110424x62ab8871() {
        return this.f59202xe20aa500;
    }

    /* renamed from: getLongPollingTimeout */
    public int m110425xe6182bb0() {
        return this.f59203x91d49922;
    }

    /* renamed from: getNetType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27105x25d29934 m110426xab9ed241() {
        return this.f59199xcb94b041[6] ? this.f59204x4cfa189c : com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27105x25d29934.kIlinkShortlink;
    }

    /* renamed from: getNetworkStatusSensitive */
    public boolean m110427xe17de1ac() {
        return this.f59205x59443c7a;
    }

    /* renamed from: getRetryCount */
    public int m110428xa8e25f3d() {
        return this.f59206xc8af38b8;
    }

    /* renamed from: getTimeoutMs */
    public int m110429x27ef431() {
        return this.f59207x5f1f1d44;
    }

    /* renamed from: getUrl */
    public java.lang.String m110430xb5887639() {
        return this.f59199xcb94b041[2] ? this.url : "";
    }

    /* renamed from: hasBody */
    public boolean m110431x2982635c() {
        return m110436x6e095e9(3);
    }

    /* renamed from: hasCgiType */
    public boolean m110432xa3df7d65() {
        return m110436x6e095e9(14);
    }

    /* renamed from: hasCmdid */
    public boolean m110433x6d7355b() {
        return m110436x6e095e9(1);
    }

    /* renamed from: hasContentType */
    public boolean m110434xe2c4a459() {
        return m110436x6e095e9(12);
    }

    /* renamed from: hasCryptoAlgo */
    public boolean m110435xb24e4cee() {
        return m110436x6e095e9(7);
    }

    /* renamed from: hasFieldNumber */
    public boolean m110436x6e095e9(int i17) {
        return this.f59199xcb94b041[i17];
    }

    /* renamed from: hasLimitFlow */
    public boolean m110437x2735460f() {
        return m110436x6e095e9(8);
    }

    /* renamed from: hasLimitFrequency */
    public boolean m110438xf96b251b() {
        return m110436x6e095e9(9);
    }

    /* renamed from: hasLongPolling */
    public boolean m110439x82cb92ad() {
        return m110436x6e095e9(10);
    }

    /* renamed from: hasLongPollingTimeout */
    public boolean m110440x867f65f4() {
        return m110436x6e095e9(11);
    }

    /* renamed from: hasNetType */
    public boolean m110441xe6f55a7d() {
        return m110436x6e095e9(6);
    }

    /* renamed from: hasNetworkStatusSensitive */
    public boolean m110442x2b7659f0() {
        return m110436x6e095e9(13);
    }

    /* renamed from: hasRetryCount */
    public boolean m110443xe3ba1d81() {
        return m110436x6e095e9(5);
    }

    /* renamed from: hasTimeoutMs */
    public boolean m110444xc2545d6d() {
        return m110436x6e095e9(4);
    }

    /* renamed from: hasUrl */
    public boolean m110445xb7047c75() {
        return m110436x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110446x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f59199xcb94b041[1]) {
                fVar.e(1, this.f59196x5a627d5);
            }
            java.lang.String str = this.url;
            if (str != null && this.f59199xcb94b041[2]) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f59194x2e39a2;
            if (gVar != null && this.f59199xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            if (this.f59199xcb94b041[4]) {
                fVar.e(4, this.f59207x5f1f1d44);
            }
            if (this.f59199xcb94b041[5]) {
                fVar.e(5, this.f59206xc8af38b8);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27105x25d29934 enumC27105x25d29934 = this.f59204x4cfa189c;
            if (enumC27105x25d29934 != null && this.f59199xcb94b041[6]) {
                fVar.e(6, enumC27105x25d29934.f59169x6ac9171);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27095x46d37ed7 enumC27095x46d37ed7 = this.f59198x9f26d311;
            if (enumC27095x46d37ed7 != null && this.f59199xcb94b041[7]) {
                fVar.e(7, enumC27095x46d37ed7.f59101x6ac9171);
            }
            if (this.f59199xcb94b041[8]) {
                fVar.a(8, this.f59200x97b88b32);
            }
            if (this.f59199xcb94b041[9]) {
                fVar.a(9, this.f59201x5ce49dd8);
            }
            if (this.f59199xcb94b041[10]) {
                fVar.a(10, this.f59202xe20aa500);
            }
            if (this.f59199xcb94b041[11]) {
                fVar.e(11, this.f59203x91d49922);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27094xdee5af90 enumC27094xdee5af90 = this.f59197x3194f740;
            if (enumC27094xdee5af90 != null && this.f59199xcb94b041[12]) {
                fVar.e(12, enumC27094xdee5af90.f59091x6ac9171);
            }
            if (this.f59199xcb94b041[13]) {
                fVar.a(13, this.f59205x59443c7a);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27108x354cef04 enumC27108x354cef04 = this.f59195x2d5452b4;
            if (enumC27108x354cef04 == null || !this.f59199xcb94b041[14]) {
                return 0;
            }
            fVar.e(14, enumC27108x354cef04.f59192x6ac9171);
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f59199xcb94b041[1] ? 0 + b36.f.e(1, this.f59196x5a627d5) : 0;
            java.lang.String str2 = this.url;
            if (str2 != null && this.f59199xcb94b041[2]) {
                e17 += b36.f.j(2, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f59194x2e39a2;
            if (gVar2 != null && this.f59199xcb94b041[3]) {
                e17 += b36.f.b(3, gVar2);
            }
            if (this.f59199xcb94b041[4]) {
                e17 += b36.f.e(4, this.f59207x5f1f1d44);
            }
            if (this.f59199xcb94b041[5]) {
                e17 += b36.f.e(5, this.f59206xc8af38b8);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27105x25d29934 enumC27105x25d299342 = this.f59204x4cfa189c;
            if (enumC27105x25d299342 != null && this.f59199xcb94b041[6]) {
                e17 += b36.f.e(6, enumC27105x25d299342.f59169x6ac9171);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27095x46d37ed7 enumC27095x46d37ed72 = this.f59198x9f26d311;
            if (enumC27095x46d37ed72 != null && this.f59199xcb94b041[7]) {
                e17 += b36.f.e(7, enumC27095x46d37ed72.f59101x6ac9171);
            }
            if (this.f59199xcb94b041[8]) {
                e17 += b36.f.a(8, this.f59200x97b88b32);
            }
            if (this.f59199xcb94b041[9]) {
                e17 += b36.f.a(9, this.f59201x5ce49dd8);
            }
            if (this.f59199xcb94b041[10]) {
                e17 += b36.f.a(10, this.f59202xe20aa500);
            }
            if (this.f59199xcb94b041[11]) {
                e17 += b36.f.e(11, this.f59203x91d49922);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27094xdee5af90 enumC27094xdee5af902 = this.f59197x3194f740;
            if (enumC27094xdee5af902 != null && this.f59199xcb94b041[12]) {
                e17 += b36.f.e(12, enumC27094xdee5af902.f59091x6ac9171);
            }
            if (this.f59199xcb94b041[13]) {
                e17 += b36.f.a(13, this.f59205x59443c7a);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27108x354cef04 enumC27108x354cef042 = this.f59195x2d5452b4;
            return (enumC27108x354cef042 == null || !this.f59199xcb94b041[14]) ? e17 : e17 + b36.f.e(14, enumC27108x354cef042.f59192x6ac9171);
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
                this.f59196x5a627d5 = aVar2.g(intValue);
                this.f59199xcb94b041[1] = true;
                return 0;
            case 2:
                this.url = aVar2.k(intValue);
                this.f59199xcb94b041[2] = true;
                return 0;
            case 3:
                this.f59194x2e39a2 = aVar2.d(intValue);
                this.f59199xcb94b041[3] = true;
                return 0;
            case 4:
                this.f59207x5f1f1d44 = aVar2.g(intValue);
                this.f59199xcb94b041[4] = true;
                return 0;
            case 5:
                this.f59206xc8af38b8 = aVar2.g(intValue);
                this.f59199xcb94b041[5] = true;
                return 0;
            case 6:
                this.f59204x4cfa189c = com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27105x25d29934.m110357x382ad972(aVar2.g(intValue));
                this.f59199xcb94b041[6] = true;
                return 0;
            case 7:
                this.f59198x9f26d311 = com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27095x46d37ed7.m110215x382ad972(aVar2.g(intValue));
                this.f59199xcb94b041[7] = true;
                return 0;
            case 8:
                this.f59200x97b88b32 = aVar2.c(intValue);
                this.f59199xcb94b041[8] = true;
                return 0;
            case 9:
                this.f59201x5ce49dd8 = aVar2.c(intValue);
                this.f59199xcb94b041[9] = true;
                return 0;
            case 10:
                this.f59202xe20aa500 = aVar2.c(intValue);
                this.f59199xcb94b041[10] = true;
                return 0;
            case 11:
                this.f59203x91d49922 = aVar2.g(intValue);
                this.f59199xcb94b041[11] = true;
                return 0;
            case 12:
                this.f59197x3194f740 = com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27094xdee5af90.m110209x382ad972(aVar2.g(intValue));
                this.f59199xcb94b041[12] = true;
                return 0;
            case 13:
                this.f59205x59443c7a = aVar2.c(intValue);
                this.f59199xcb94b041[13] = true;
                return 0;
            case 14:
                this.f59195x2d5452b4 = com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27108x354cef04.m110408x382ad972(aVar2.g(intValue));
                this.f59199xcb94b041[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setBody */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110448x76486924(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59194x2e39a2 = gVar;
        this.f59199xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setCgiType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110449xdbfa429d(com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27108x354cef04 enumC27108x354cef04) {
        this.f59195x2d5452b4 = enumC27108x354cef04;
        this.f59199xcb94b041[14] = true;
        return this;
    }

    /* renamed from: setCmdid */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110450x52d1e893(int i17) {
        this.f59196x5a627d5 = i17;
        this.f59199xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setContentType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110451x590a0d91(com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27094xdee5af90 enumC27094xdee5af90) {
        this.f59197x3194f740 = enumC27094xdee5af90;
        this.f59199xcb94b041[12] = true;
        return this;
    }

    /* renamed from: setCryptoAlgo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110452xa59adcb6(com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27095x46d37ed7 enumC27095x46d37ed7) {
        this.f59198x9f26d311 = enumC27095x46d37ed7;
        this.f59199xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setLimitFlow */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110453xc3b39d47(boolean z17) {
        this.f59200x97b88b32 = z17;
        this.f59199xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setLimitFrequency */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110454x50da90e3(boolean z17) {
        this.f59201x5ce49dd8 = z17;
        this.f59199xcb94b041[9] = true;
        return this;
    }

    /* renamed from: setLongPolling */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110455xf910fbe5(boolean z17) {
        this.f59202xe20aa500 = z17;
        this.f59199xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setLongPollingTimeout */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110456x7d43adbc(int i17) {
        this.f59203x91d49922 = i17;
        this.f59199xcb94b041[11] = true;
        return this;
    }

    /* renamed from: setNetType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110457x1f101fb5(com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27105x25d29934 enumC27105x25d29934) {
        this.f59204x4cfa189c = enumC27105x25d29934;
        this.f59199xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setNetworkStatusSensitive */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110458x13c17db8(boolean z17) {
        this.f59205x59443c7a = z17;
        this.f59199xcb94b041[13] = true;
        return this;
    }

    /* renamed from: setRetryCount */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110459xd706ad49(int i17) {
        this.f59206xc8af38b8 = i17;
        this.f59199xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setTimeoutMs */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110460x5ed2b4a5(int i17) {
        this.f59207x5f1f1d44 = i17;
        this.f59199xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setUrl */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110461xca029dad(java.lang.String str) {
        this.url = str;
        this.f59199xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a m110447x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27109x3a9f481a) super.mo11468x92b714fd(bArr);
    }
}

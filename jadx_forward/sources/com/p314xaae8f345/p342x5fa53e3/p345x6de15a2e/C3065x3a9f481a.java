package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkRequestInfo */
/* loaded from: classes15.dex */
public class C3065x3a9f481a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a f11109xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a();

    /* renamed from: auth_h5_url */
    private java.lang.String f11110xc8b4c574;

    /* renamed from: body */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f11111x2e39a2;

    /* renamed from: cgi_method */
    private int f11113x1c809ddb;

    /* renamed from: cgi_type */
    private com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3064x354cef04 f11114x2d5452b4;

    /* renamed from: cmdid */
    private int f11115x5a627d5;

    /* renamed from: content_type */
    private com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3048xdee5af90 f11116x3194f740;

    /* renamed from: crypto_algo */
    private com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3049x46d37ed7 f11117x9f26d311;

    /* renamed from: limit_flow */
    private boolean f11119x97b88b32;

    /* renamed from: limit_frequency */
    private boolean f11120x5ce49dd8;

    /* renamed from: long_polling */
    private boolean f11121xe20aa500;

    /* renamed from: long_polling_timeout */
    private int f11122x91d49922;

    /* renamed from: net_type */
    private com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3060x25d29934 f11123x4cfa189c;

    /* renamed from: network_status_sensitive */
    private boolean f11124x59443c7a;

    /* renamed from: retry_count */
    private int f11125xc8af38b8;

    /* renamed from: timeout_ms */
    private int f11126x5f1f1d44;
    private java.lang.String url;

    /* renamed from: use_network_type */
    private com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5 f11127x13323263;

    /* renamed from: cgi_header */
    private java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3023x9b062d55> f11112x13efaf87 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f11118xcb94b041 = new boolean[19];

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24423xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24424x7c90cfc0() {
        return f11109xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24425x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a();
    }

    /* renamed from: addAllElementCgiHeader */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24426x6d73b136(java.util.Collection<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3023x9b062d55> collection) {
        this.f11112x13efaf87.addAll(collection);
        this.f11118xcb94b041[15] = true;
        return this;
    }

    /* renamed from: addElementCgiHeader */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24427x193e8e97(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3023x9b062d55 c3023x9b062d55) {
        this.f11112x13efaf87.add(c3023x9b062d55);
        this.f11118xcb94b041[15] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24428x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a c3065x3a9f481a = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f11115x5a627d5), java.lang.Integer.valueOf(c3065x3a9f481a.f11115x5a627d5)) && n51.f.a(this.url, c3065x3a9f481a.url) && n51.f.a(this.f11111x2e39a2, c3065x3a9f481a.f11111x2e39a2) && n51.f.a(java.lang.Integer.valueOf(this.f11126x5f1f1d44), java.lang.Integer.valueOf(c3065x3a9f481a.f11126x5f1f1d44)) && n51.f.a(java.lang.Integer.valueOf(this.f11125xc8af38b8), java.lang.Integer.valueOf(c3065x3a9f481a.f11125xc8af38b8)) && n51.f.a(this.f11123x4cfa189c, c3065x3a9f481a.f11123x4cfa189c) && n51.f.a(this.f11117x9f26d311, c3065x3a9f481a.f11117x9f26d311) && n51.f.a(java.lang.Boolean.valueOf(this.f11119x97b88b32), java.lang.Boolean.valueOf(c3065x3a9f481a.f11119x97b88b32)) && n51.f.a(java.lang.Boolean.valueOf(this.f11120x5ce49dd8), java.lang.Boolean.valueOf(c3065x3a9f481a.f11120x5ce49dd8)) && n51.f.a(java.lang.Boolean.valueOf(this.f11121xe20aa500), java.lang.Boolean.valueOf(c3065x3a9f481a.f11121xe20aa500)) && n51.f.a(java.lang.Integer.valueOf(this.f11122x91d49922), java.lang.Integer.valueOf(c3065x3a9f481a.f11122x91d49922)) && n51.f.a(this.f11116x3194f740, c3065x3a9f481a.f11116x3194f740) && n51.f.a(java.lang.Boolean.valueOf(this.f11124x59443c7a), java.lang.Boolean.valueOf(c3065x3a9f481a.f11124x59443c7a)) && n51.f.a(this.f11114x2d5452b4, c3065x3a9f481a.f11114x2d5452b4) && n51.f.a(this.f11112x13efaf87, c3065x3a9f481a.f11112x13efaf87) && n51.f.a(java.lang.Integer.valueOf(this.f11113x1c809ddb), java.lang.Integer.valueOf(c3065x3a9f481a.f11113x1c809ddb)) && n51.f.a(this.f11110xc8b4c574, c3065x3a9f481a.f11110xc8b4c574) && n51.f.a(this.f11127x13323263, c3065x3a9f481a.f11127x13323263);
    }

    /* renamed from: getAuthH5Url */
    public java.lang.String m24429x551fdde4() {
        return this.f11118xcb94b041[17] ? this.f11110xc8b4c574 : "";
    }

    /* renamed from: getBody */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24430xfb7da218() {
        return this.f11118xcb94b041[3] ? this.f11111x2e39a2 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getCgiHeader */
    public java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3023x9b062d55> m24431x548588bc() {
        return this.f11112x13efaf87;
    }

    /* renamed from: getCgiMethod */
    public int m24432x5d167710() {
        return this.f11113x1c809ddb;
    }

    /* renamed from: getCgiType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3064x354cef04 m24433x6888f529() {
        return this.f11118xcb94b041[14] ? this.f11114x2d5452b4 : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3064x354cef04.kIlinkCGITypeDirect;
    }

    /* renamed from: getCmdid */
    public int m24434x7443ce1f() {
        return this.f11115x5a627d5;
    }

    /* renamed from: getContentType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3048xdee5af90 m24435xc2a49a1d() {
        return this.f11118xcb94b041[12] ? this.f11116x3194f740 : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3048xdee5af90.kIlinkContentTypeDefault;
    }

    /* renamed from: getCryptoAlgo */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3049x46d37ed7 m24436x77768eaa() {
        return this.f11118xcb94b041[7] ? this.f11117x9f26d311 : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3049x46d37ed7.kIlinkNoCrypto;
    }

    /* renamed from: getLimitFlow */
    public boolean m24437x675fdcd3() {
        return this.f11119x97b88b32;
    }

    /* renamed from: getLimitFrequency */
    public boolean m24438x88e428d7() {
        return this.f11120x5ce49dd8;
    }

    /* renamed from: getLongPolling */
    public boolean m24439x62ab8871() {
        return this.f11121xe20aa500;
    }

    /* renamed from: getLongPollingTimeout */
    public int m24440xe6182bb0() {
        return this.f11122x91d49922;
    }

    /* renamed from: getNetType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3060x25d29934 m24441xab9ed241() {
        return this.f11118xcb94b041[6] ? this.f11123x4cfa189c : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3060x25d29934.kIlinkShortlink;
    }

    /* renamed from: getNetworkStatusSensitive */
    public boolean m24442xe17de1ac() {
        return this.f11124x59443c7a;
    }

    /* renamed from: getRetryCount */
    public int m24443xa8e25f3d() {
        return this.f11125xc8af38b8;
    }

    /* renamed from: getTimeoutMs */
    public int m24444x27ef431() {
        return this.f11126x5f1f1d44;
    }

    /* renamed from: getUrl */
    public java.lang.String m24445xb5887639() {
        return this.f11118xcb94b041[2] ? this.url : "";
    }

    /* renamed from: getUseNetworkType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5 m24446x46a55b77() {
        return this.f11118xcb94b041[18] ? this.f11127x13323263 : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5.kIlinkNetworkTypeDefault;
    }

    /* renamed from: hasAuthH5Url */
    public boolean m24447x14f54720() {
        return m24455x6e095e9(17);
    }

    /* renamed from: hasBody */
    public boolean m24448x2982635c() {
        return m24455x6e095e9(3);
    }

    /* renamed from: hasCgiHeader */
    public boolean m24449x145af1f8() {
        return m24455x6e095e9(15);
    }

    /* renamed from: hasCgiMethod */
    public boolean m24450x1cebe04c() {
        return m24455x6e095e9(16);
    }

    /* renamed from: hasCgiType */
    public boolean m24451xa3df7d65() {
        return m24455x6e095e9(14);
    }

    /* renamed from: hasCmdid */
    public boolean m24452x6d7355b() {
        return m24455x6e095e9(1);
    }

    /* renamed from: hasContentType */
    public boolean m24453xe2c4a459() {
        return m24455x6e095e9(12);
    }

    /* renamed from: hasCryptoAlgo */
    public boolean m24454xb24e4cee() {
        return m24455x6e095e9(7);
    }

    /* renamed from: hasFieldNumber */
    public boolean m24455x6e095e9(int i17) {
        return this.f11118xcb94b041[i17];
    }

    /* renamed from: hasLimitFlow */
    public boolean m24456x2735460f() {
        return m24455x6e095e9(8);
    }

    /* renamed from: hasLimitFrequency */
    public boolean m24457xf96b251b() {
        return m24455x6e095e9(9);
    }

    /* renamed from: hasLongPolling */
    public boolean m24458x82cb92ad() {
        return m24455x6e095e9(10);
    }

    /* renamed from: hasLongPollingTimeout */
    public boolean m24459x867f65f4() {
        return m24455x6e095e9(11);
    }

    /* renamed from: hasNetType */
    public boolean m24460xe6f55a7d() {
        return m24455x6e095e9(6);
    }

    /* renamed from: hasNetworkStatusSensitive */
    public boolean m24461x2b7659f0() {
        return m24455x6e095e9(13);
    }

    /* renamed from: hasRetryCount */
    public boolean m24462xe3ba1d81() {
        return m24455x6e095e9(5);
    }

    /* renamed from: hasTimeoutMs */
    public boolean m24463xc2545d6d() {
        return m24455x6e095e9(4);
    }

    /* renamed from: hasUrl */
    public boolean m24464xb7047c75() {
        return m24455x6e095e9(2);
    }

    /* renamed from: hasUseNetworkType */
    public boolean m24465xb72c57bb() {
        return m24455x6e095e9(18);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24466x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f11118xcb94b041[1]) {
                fVar.e(1, this.f11115x5a627d5);
            }
            java.lang.String str = this.url;
            if (str != null && this.f11118xcb94b041[2]) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f11111x2e39a2;
            if (gVar != null && this.f11118xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            if (this.f11118xcb94b041[4]) {
                fVar.e(4, this.f11126x5f1f1d44);
            }
            if (this.f11118xcb94b041[5]) {
                fVar.e(5, this.f11125xc8af38b8);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3060x25d29934 enumC3060x25d29934 = this.f11123x4cfa189c;
            if (enumC3060x25d29934 != null && this.f11118xcb94b041[6]) {
                fVar.e(6, enumC3060x25d29934.f11079x6ac9171);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3049x46d37ed7 enumC3049x46d37ed7 = this.f11117x9f26d311;
            if (enumC3049x46d37ed7 != null && this.f11118xcb94b041[7]) {
                fVar.e(7, enumC3049x46d37ed7.f11006x6ac9171);
            }
            if (this.f11118xcb94b041[8]) {
                fVar.a(8, this.f11119x97b88b32);
            }
            if (this.f11118xcb94b041[9]) {
                fVar.a(9, this.f11120x5ce49dd8);
            }
            if (this.f11118xcb94b041[10]) {
                fVar.a(10, this.f11121xe20aa500);
            }
            if (this.f11118xcb94b041[11]) {
                fVar.e(11, this.f11122x91d49922);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3048xdee5af90 enumC3048xdee5af90 = this.f11116x3194f740;
            if (enumC3048xdee5af90 != null && this.f11118xcb94b041[12]) {
                fVar.e(12, enumC3048xdee5af90.f10996x6ac9171);
            }
            if (this.f11118xcb94b041[13]) {
                fVar.a(13, this.f11124x59443c7a);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3064x354cef04 enumC3064x354cef04 = this.f11114x2d5452b4;
            if (enumC3064x354cef04 != null && this.f11118xcb94b041[14]) {
                fVar.e(14, enumC3064x354cef04.f11108x6ac9171);
            }
            fVar.g(15, 8, this.f11112x13efaf87);
            if (this.f11118xcb94b041[16]) {
                fVar.e(16, this.f11113x1c809ddb);
            }
            java.lang.String str2 = this.f11110xc8b4c574;
            if (str2 != null && this.f11118xcb94b041[17]) {
                fVar.j(17, str2);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5 enumC3061x826bf2c5 = this.f11127x13323263;
            if (enumC3061x826bf2c5 != null && this.f11118xcb94b041[18]) {
                fVar.e(18, enumC3061x826bf2c5.f11085x6ac9171);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f11118xcb94b041[1] ? b36.f.e(1, this.f11115x5a627d5) + 0 : 0;
            java.lang.String str3 = this.url;
            if (str3 != null && this.f11118xcb94b041[2]) {
                e17 += b36.f.j(2, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f11111x2e39a2;
            if (gVar2 != null && this.f11118xcb94b041[3]) {
                e17 += b36.f.b(3, gVar2);
            }
            if (this.f11118xcb94b041[4]) {
                e17 += b36.f.e(4, this.f11126x5f1f1d44);
            }
            if (this.f11118xcb94b041[5]) {
                e17 += b36.f.e(5, this.f11125xc8af38b8);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3060x25d29934 enumC3060x25d299342 = this.f11123x4cfa189c;
            if (enumC3060x25d299342 != null && this.f11118xcb94b041[6]) {
                e17 += b36.f.e(6, enumC3060x25d299342.f11079x6ac9171);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3049x46d37ed7 enumC3049x46d37ed72 = this.f11117x9f26d311;
            if (enumC3049x46d37ed72 != null && this.f11118xcb94b041[7]) {
                e17 += b36.f.e(7, enumC3049x46d37ed72.f11006x6ac9171);
            }
            if (this.f11118xcb94b041[8]) {
                e17 += b36.f.a(8, this.f11119x97b88b32);
            }
            if (this.f11118xcb94b041[9]) {
                e17 += b36.f.a(9, this.f11120x5ce49dd8);
            }
            if (this.f11118xcb94b041[10]) {
                e17 += b36.f.a(10, this.f11121xe20aa500);
            }
            if (this.f11118xcb94b041[11]) {
                e17 += b36.f.e(11, this.f11122x91d49922);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3048xdee5af90 enumC3048xdee5af902 = this.f11116x3194f740;
            if (enumC3048xdee5af902 != null && this.f11118xcb94b041[12]) {
                e17 += b36.f.e(12, enumC3048xdee5af902.f10996x6ac9171);
            }
            if (this.f11118xcb94b041[13]) {
                e17 += b36.f.a(13, this.f11124x59443c7a);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3064x354cef04 enumC3064x354cef042 = this.f11114x2d5452b4;
            if (enumC3064x354cef042 != null && this.f11118xcb94b041[14]) {
                e17 += b36.f.e(14, enumC3064x354cef042.f11108x6ac9171);
            }
            int g17 = e17 + b36.f.g(15, 8, this.f11112x13efaf87);
            if (this.f11118xcb94b041[16]) {
                g17 += b36.f.e(16, this.f11113x1c809ddb);
            }
            java.lang.String str4 = this.f11110xc8b4c574;
            if (str4 != null && this.f11118xcb94b041[17]) {
                g17 += b36.f.j(17, str4);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5 enumC3061x826bf2c52 = this.f11127x13323263;
            return (enumC3061x826bf2c52 == null || !this.f11118xcb94b041[18]) ? g17 : g17 + b36.f.e(18, enumC3061x826bf2c52.f11085x6ac9171);
        }
        if (i17 == 2) {
            this.f11112x13efaf87.clear();
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
                this.f11115x5a627d5 = aVar2.g(intValue);
                this.f11118xcb94b041[1] = true;
                return 0;
            case 2:
                this.url = aVar2.k(intValue);
                this.f11118xcb94b041[2] = true;
                return 0;
            case 3:
                this.f11111x2e39a2 = aVar2.d(intValue);
                this.f11118xcb94b041[3] = true;
                return 0;
            case 4:
                this.f11126x5f1f1d44 = aVar2.g(intValue);
                this.f11118xcb94b041[4] = true;
                return 0;
            case 5:
                this.f11125xc8af38b8 = aVar2.g(intValue);
                this.f11118xcb94b041[5] = true;
                return 0;
            case 6:
                this.f11123x4cfa189c = com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3060x25d29934.m24361x382ad972(aVar2.g(intValue));
                this.f11118xcb94b041[6] = true;
                return 0;
            case 7:
                this.f11117x9f26d311 = com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3049x46d37ed7.m24200x382ad972(aVar2.g(intValue));
                this.f11118xcb94b041[7] = true;
                return 0;
            case 8:
                this.f11119x97b88b32 = aVar2.c(intValue);
                this.f11118xcb94b041[8] = true;
                return 0;
            case 9:
                this.f11120x5ce49dd8 = aVar2.c(intValue);
                this.f11118xcb94b041[9] = true;
                return 0;
            case 10:
                this.f11121xe20aa500 = aVar2.c(intValue);
                this.f11118xcb94b041[10] = true;
                return 0;
            case 11:
                this.f11122x91d49922 = aVar2.g(intValue);
                this.f11118xcb94b041[11] = true;
                return 0;
            case 12:
                this.f11116x3194f740 = com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3048xdee5af90.m24194x382ad972(aVar2.g(intValue));
                this.f11118xcb94b041[12] = true;
                return 0;
            case 13:
                this.f11124x59443c7a = aVar2.c(intValue);
                this.f11118xcb94b041[13] = true;
                return 0;
            case 14:
                this.f11114x2d5452b4 = com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3064x354cef04.m24418x382ad972(aVar2.g(intValue));
                this.f11118xcb94b041[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3023x9b062d55 c3023x9b062d55 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3023x9b062d55();
                    if (bArr != null && bArr.length > 0) {
                        c3023x9b062d55.mo11468x92b714fd(bArr);
                    }
                    this.f11112x13efaf87.add(c3023x9b062d55);
                }
                this.f11118xcb94b041[15] = true;
                return 0;
            case 16:
                this.f11113x1c809ddb = aVar2.g(intValue);
                this.f11118xcb94b041[16] = true;
                return 0;
            case 17:
                this.f11110xc8b4c574 = aVar2.k(intValue);
                this.f11118xcb94b041[17] = true;
                return 0;
            case 18:
                this.f11127x13323263 = com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5.m24367x382ad972(aVar2.g(intValue));
                this.f11118xcb94b041[18] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAuthH5Url */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24468xb1739e58(java.lang.String str) {
        this.f11110xc8b4c574 = str;
        this.f11118xcb94b041[17] = true;
        return this;
    }

    /* renamed from: setBody */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24469x76486924(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f11111x2e39a2 = gVar;
        this.f11118xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setCgiHeader */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24470xb0d94930(java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3023x9b062d55> linkedList) {
        this.f11112x13efaf87 = linkedList;
        this.f11118xcb94b041[15] = true;
        return this;
    }

    /* renamed from: setCgiMethod */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24471xb96a3784(int i17) {
        this.f11113x1c809ddb = i17;
        this.f11118xcb94b041[16] = true;
        return this;
    }

    /* renamed from: setCgiType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24472xdbfa429d(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3064x354cef04 enumC3064x354cef04) {
        this.f11114x2d5452b4 = enumC3064x354cef04;
        this.f11118xcb94b041[14] = true;
        return this;
    }

    /* renamed from: setCmdid */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24473x52d1e893(int i17) {
        this.f11115x5a627d5 = i17;
        this.f11118xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setContentType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24474x590a0d91(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3048xdee5af90 enumC3048xdee5af90) {
        this.f11116x3194f740 = enumC3048xdee5af90;
        this.f11118xcb94b041[12] = true;
        return this;
    }

    /* renamed from: setCryptoAlgo */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24475xa59adcb6(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3049x46d37ed7 enumC3049x46d37ed7) {
        this.f11117x9f26d311 = enumC3049x46d37ed7;
        this.f11118xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setLimitFlow */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24476xc3b39d47(boolean z17) {
        this.f11119x97b88b32 = z17;
        this.f11118xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setLimitFrequency */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24477x50da90e3(boolean z17) {
        this.f11120x5ce49dd8 = z17;
        this.f11118xcb94b041[9] = true;
        return this;
    }

    /* renamed from: setLongPolling */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24478xf910fbe5(boolean z17) {
        this.f11121xe20aa500 = z17;
        this.f11118xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setLongPollingTimeout */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24479x7d43adbc(int i17) {
        this.f11122x91d49922 = i17;
        this.f11118xcb94b041[11] = true;
        return this;
    }

    /* renamed from: setNetType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24480x1f101fb5(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3060x25d29934 enumC3060x25d29934) {
        this.f11123x4cfa189c = enumC3060x25d29934;
        this.f11118xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setNetworkStatusSensitive */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24481x13c17db8(boolean z17) {
        this.f11124x59443c7a = z17;
        this.f11118xcb94b041[13] = true;
        return this;
    }

    /* renamed from: setRetryCount */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24482xd706ad49(int i17) {
        this.f11125xc8af38b8 = i17;
        this.f11118xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setTimeoutMs */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24483x5ed2b4a5(int i17) {
        this.f11126x5f1f1d44 = i17;
        this.f11118xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setUrl */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24484xca029dad(java.lang.String str) {
        this.url = str;
        this.f11118xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setUseNetworkType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24485xe9bc383(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5 enumC3061x826bf2c5) {
        this.f11127x13323263 = enumC3061x826bf2c5;
        this.f11118xcb94b041[18] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a m24467x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3065x3a9f481a) super.mo11468x92b714fd(bArr);
    }
}

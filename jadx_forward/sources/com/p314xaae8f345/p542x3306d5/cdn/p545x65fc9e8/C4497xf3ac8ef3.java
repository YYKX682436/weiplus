package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.GetCDNDnsResponse */
/* loaded from: classes8.dex */
public class C4497xf3ac8ef3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 f18833xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3();

    /* renamed from: AppDnsInfo */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa f18834x266e2436;

    /* renamed from: BaseResponse */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 f18835x92037252;

    /* renamed from: C2cRoamDnsInfo */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa f18836x8191af7a;

    /* renamed from: CDNDnsRuleBuf */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 f18837xd7c0d45b;

    /* renamed from: CdnUserIdcInfo */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a f18838x4aa3c2de;

    /* renamed from: DefaultConfig */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a f18839x4e1400c3;

    /* renamed from: DisasterConfig */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a f18840xa11de1a3;

    /* renamed from: DnsInfo */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa f18841xcf543957;

    /* renamed from: FakeCDNDnsRuleBuf */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 f18842x9ae8f06;

    /* renamed from: FakeDnsInfo */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa f18843xa221042;

    /* renamed from: GetCdnDnsIntervalMS */
    private int f18844xf941e35d;

    /* renamed from: NextIpv6 */
    private int f18845x58bc1f9a;

    /* renamed from: SnsDnsInfo */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa f18846x62b2c0ff;

    /* renamed from: VCodec1Limit */
    private int f18847x2cf92f6a;

    /* renamed from: hasSetFields */
    private final boolean[] f18848xcb94b041 = new boolean[15];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39024xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39025x7c90cfc0() {
        return f18833xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39026x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39027x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 c4497xf3ac8ef3 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3) fVar;
        return n51.f.a(this.f18835x92037252, c4497xf3ac8ef3.f18835x92037252) && n51.f.a(this.f18841xcf543957, c4497xf3ac8ef3.f18841xcf543957) && n51.f.a(this.f18846x62b2c0ff, c4497xf3ac8ef3.f18846x62b2c0ff) && n51.f.a(this.f18834x266e2436, c4497xf3ac8ef3.f18834x266e2436) && n51.f.a(this.f18837xd7c0d45b, c4497xf3ac8ef3.f18837xd7c0d45b) && n51.f.a(this.f18842x9ae8f06, c4497xf3ac8ef3.f18842x9ae8f06) && n51.f.a(this.f18843xa221042, c4497xf3ac8ef3.f18843xa221042) && n51.f.a(java.lang.Integer.valueOf(this.f18844xf941e35d), java.lang.Integer.valueOf(c4497xf3ac8ef3.f18844xf941e35d)) && n51.f.a(this.f18839x4e1400c3, c4497xf3ac8ef3.f18839x4e1400c3) && n51.f.a(this.f18840xa11de1a3, c4497xf3ac8ef3.f18840xa11de1a3) && n51.f.a(java.lang.Integer.valueOf(this.f18845x58bc1f9a), java.lang.Integer.valueOf(c4497xf3ac8ef3.f18845x58bc1f9a)) && n51.f.a(this.f18836x8191af7a, c4497xf3ac8ef3.f18836x8191af7a) && n51.f.a(this.f18838x4aa3c2de, c4497xf3ac8ef3.f18838x4aa3c2de) && n51.f.a(java.lang.Integer.valueOf(this.f18847x2cf92f6a), java.lang.Integer.valueOf(c4497xf3ac8ef3.f18847x2cf92f6a));
    }

    /* renamed from: getAppDnsInfo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m39028x9ddd000c() {
        return this.f18848xcb94b041[4] ? this.f18834x266e2436 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa.m38321xaf65a0fc();
    }

    /* renamed from: getBaseResponse */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 m39029xe92ab0a8() {
        return this.f18848xcb94b041[1] ? this.f18835x92037252 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252.m38101xaf65a0fc();
    }

    /* renamed from: getC2cRoamDnsInfo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m39030xabe2b050() {
        return this.f18848xcb94b041[12] ? this.f18836x8191af7a : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa.m38321xaf65a0fc();
    }

    /* renamed from: getCDNDnsRuleBuf */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 m39031x658160c5() {
        return this.f18848xcb94b041[5] ? this.f18837xd7c0d45b : new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000();
    }

    /* renamed from: getCdnUserIdcInfo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a m39032x74f4c3b4() {
        return this.f18848xcb94b041[13] ? this.f18838x4aa3c2de : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a.m39950xaf65a0fc();
    }

    /* renamed from: getDefaultConfig */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a m39033xdbd48d2d() {
        return this.f18848xcb94b041[9] ? this.f18839x4e1400c3 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a.m38295xaf65a0fc();
    }

    /* renamed from: getDisasterConfig */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a m39034xcb6ee279() {
        return this.f18848xcb94b041[10] ? this.f18840xa11de1a3 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a.m38295xaf65a0fc();
    }

    /* renamed from: getDnsInfo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m39035xa9e8dd41() {
        return this.f18848xcb94b041[2] ? this.f18841xcf543957 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa.m38321xaf65a0fc();
    }

    /* renamed from: getFakeCDNDnsRuleBuf */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 m39036x721ed670() {
        return this.f18848xcb94b041[6] ? this.f18842x9ae8f06 : new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000();
    }

    /* renamed from: getFakeDnsInfo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m39037x808eaf2c() {
        return this.f18848xcb94b041[7] ? this.f18843xa221042 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa.m38321xaf65a0fc();
    }

    /* renamed from: getGetCdnDnsIntervalMS */
    public int m39038x6bdf847() {
        return this.f18844xf941e35d;
    }

    /* renamed from: getNextIpv6 */
    public int m39039xd0bbf8f0() {
        return this.f18845x58bc1f9a;
    }

    /* renamed from: getSnsDnsInfo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m39040xda219cd5() {
        return this.f18848xcb94b041[3] ? this.f18846x62b2c0ff : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa.m38321xaf65a0fc();
    }

    /* renamed from: getVCodec1Limit */
    public int m39041x84206dc0() {
        return this.f18847x2cf92f6a;
    }

    /* renamed from: hasAppDnsInfo */
    public boolean m39042xd8b4be50() {
        return m39052x6e095e9(4);
    }

    /* renamed from: hasBaseResponse */
    public boolean m39043xcd0bedec() {
        return m39052x6e095e9(1);
    }

    /* renamed from: hasC2cRoamDnsInfo */
    public boolean m39044x1c69ac94() {
        return m39052x6e095e9(12);
    }

    /* renamed from: hasCDNDnsRuleBuf */
    public boolean m39045xfdc7cc01() {
        return m39052x6e095e9(5);
    }

    /* renamed from: hasCdnUserIdcInfo */
    public boolean m39046xe57bbff8() {
        return m39052x6e095e9(13);
    }

    /* renamed from: hasDefaultConfig */
    public boolean m39047x741af869() {
        return m39052x6e095e9(9);
    }

    /* renamed from: hasDisasterConfig */
    public boolean m39048x3bf5debd() {
        return m39052x6e095e9(10);
    }

    /* renamed from: hasDnsInfo */
    public boolean m39049xe53f657d() {
        return m39052x6e095e9(2);
    }

    /* renamed from: hasFakeCDNDnsRuleBuf */
    public boolean m39050x5e8543ac() {
        return m39052x6e095e9(6);
    }

    /* renamed from: hasFakeDnsInfo */
    public boolean m39051xa0aeb968() {
        return m39052x6e095e9(7);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39052x6e095e9(int i17) {
        return this.f18848xcb94b041[i17];
    }

    /* renamed from: hasGetCdnDnsIntervalMS */
    public boolean m39053x733e0683() {
        return m39052x6e095e9(8);
    }

    /* renamed from: hasNextIpv6 */
    public boolean m39054x367834() {
        return m39052x6e095e9(11);
    }

    /* renamed from: hasSnsDnsInfo */
    public boolean m39055x14f95b19() {
        return m39052x6e095e9(3);
    }

    /* renamed from: hasVCodec1Limit */
    public boolean m39056x6801ab04() {
        return m39052x6e095e9(14);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39057x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 c4455x92037252 = this.f18835x92037252;
            if (c4455x92037252 != null && this.f18848xcb94b041[1]) {
                fVar.i(1, c4455x92037252.mo75928xcd1e8d8());
                this.f18835x92037252.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa = this.f18841xcf543957;
            if (c4466xc755fcaa != null && this.f18848xcb94b041[2]) {
                fVar.i(2, c4466xc755fcaa.mo75928xcd1e8d8());
                this.f18841xcf543957.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa2 = this.f18846x62b2c0ff;
            if (c4466xc755fcaa2 != null && this.f18848xcb94b041[3]) {
                fVar.i(3, c4466xc755fcaa2.mo75928xcd1e8d8());
                this.f18846x62b2c0ff.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa3 = this.f18834x266e2436;
            if (c4466xc755fcaa3 != null && this.f18848xcb94b041[4]) {
                fVar.i(4, c4466xc755fcaa3.mo75928xcd1e8d8());
                this.f18834x266e2436.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb70000 = this.f18837xd7c0d45b;
            if (c4519xbcb70000 != null && this.f18848xcb94b041[5]) {
                fVar.i(5, c4519xbcb70000.mo75928xcd1e8d8());
                this.f18837xd7c0d45b.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb700002 = this.f18842x9ae8f06;
            if (c4519xbcb700002 != null && this.f18848xcb94b041[6]) {
                fVar.i(6, c4519xbcb700002.mo75928xcd1e8d8());
                this.f18842x9ae8f06.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa4 = this.f18843xa221042;
            if (c4466xc755fcaa4 != null && this.f18848xcb94b041[7]) {
                fVar.i(7, c4466xc755fcaa4.mo75928xcd1e8d8());
                this.f18843xa221042.mo75956x3d5d1f78(fVar);
            }
            if (this.f18848xcb94b041[8]) {
                fVar.e(8, this.f18844xf941e35d);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a c4465xc813cb9a = this.f18839x4e1400c3;
            if (c4465xc813cb9a != null && this.f18848xcb94b041[9]) {
                fVar.i(9, c4465xc813cb9a.mo75928xcd1e8d8());
                this.f18839x4e1400c3.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a c4465xc813cb9a2 = this.f18840xa11de1a3;
            if (c4465xc813cb9a2 != null && this.f18848xcb94b041[10]) {
                fVar.i(10, c4465xc813cb9a2.mo75928xcd1e8d8());
                this.f18840xa11de1a3.mo75956x3d5d1f78(fVar);
            }
            if (this.f18848xcb94b041[11]) {
                fVar.e(11, this.f18845x58bc1f9a);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa5 = this.f18836x8191af7a;
            if (c4466xc755fcaa5 != null && this.f18848xcb94b041[12]) {
                fVar.i(12, c4466xc755fcaa5.mo75928xcd1e8d8());
                this.f18836x8191af7a.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a c4544x5de11f6a = this.f18838x4aa3c2de;
            if (c4544x5de11f6a != null && this.f18848xcb94b041[13]) {
                fVar.i(13, c4544x5de11f6a.mo75928xcd1e8d8());
                this.f18838x4aa3c2de.mo75956x3d5d1f78(fVar);
            }
            if (!this.f18848xcb94b041[14]) {
                return 0;
            }
            fVar.e(14, this.f18847x2cf92f6a);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 c4455x920372522 = this.f18835x92037252;
            int i18 = (c4455x920372522 == null || !this.f18848xcb94b041[1]) ? 0 : b36.f.i(1, c4455x920372522.mo75928xcd1e8d8()) + 0;
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa6 = this.f18841xcf543957;
            if (c4466xc755fcaa6 != null && this.f18848xcb94b041[2]) {
                i18 += b36.f.i(2, c4466xc755fcaa6.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa7 = this.f18846x62b2c0ff;
            if (c4466xc755fcaa7 != null && this.f18848xcb94b041[3]) {
                i18 += b36.f.i(3, c4466xc755fcaa7.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa8 = this.f18834x266e2436;
            if (c4466xc755fcaa8 != null && this.f18848xcb94b041[4]) {
                i18 += b36.f.i(4, c4466xc755fcaa8.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb700003 = this.f18837xd7c0d45b;
            if (c4519xbcb700003 != null && this.f18848xcb94b041[5]) {
                i18 += b36.f.i(5, c4519xbcb700003.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb700004 = this.f18842x9ae8f06;
            if (c4519xbcb700004 != null && this.f18848xcb94b041[6]) {
                i18 += b36.f.i(6, c4519xbcb700004.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa9 = this.f18843xa221042;
            if (c4466xc755fcaa9 != null && this.f18848xcb94b041[7]) {
                i18 += b36.f.i(7, c4466xc755fcaa9.mo75928xcd1e8d8());
            }
            if (this.f18848xcb94b041[8]) {
                i18 += b36.f.e(8, this.f18844xf941e35d);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a c4465xc813cb9a3 = this.f18839x4e1400c3;
            if (c4465xc813cb9a3 != null && this.f18848xcb94b041[9]) {
                i18 += b36.f.i(9, c4465xc813cb9a3.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a c4465xc813cb9a4 = this.f18840xa11de1a3;
            if (c4465xc813cb9a4 != null && this.f18848xcb94b041[10]) {
                i18 += b36.f.i(10, c4465xc813cb9a4.mo75928xcd1e8d8());
            }
            if (this.f18848xcb94b041[11]) {
                i18 += b36.f.e(11, this.f18845x58bc1f9a);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa10 = this.f18836x8191af7a;
            if (c4466xc755fcaa10 != null && this.f18848xcb94b041[12]) {
                i18 += b36.f.i(12, c4466xc755fcaa10.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a c4544x5de11f6a2 = this.f18838x4aa3c2de;
            if (c4544x5de11f6a2 != null && this.f18848xcb94b041[13]) {
                i18 += b36.f.i(13, c4544x5de11f6a2.mo75928xcd1e8d8());
            }
            return this.f18848xcb94b041[14] ? i18 + b36.f.e(14, this.f18847x2cf92f6a) : i18;
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 c4455x920372523 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252();
                    if (bArr != null && bArr.length > 0) {
                        c4455x920372523.mo11468x92b714fd(bArr);
                    }
                    this.f18835x92037252 = c4455x920372523;
                }
                this.f18848xcb94b041[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa11 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa();
                    if (bArr2 != null && bArr2.length > 0) {
                        c4466xc755fcaa11.mo11468x92b714fd(bArr2);
                    }
                    this.f18841xcf543957 = c4466xc755fcaa11;
                }
                this.f18848xcb94b041[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa12 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa();
                    if (bArr3 != null && bArr3.length > 0) {
                        c4466xc755fcaa12.mo11468x92b714fd(bArr3);
                    }
                    this.f18846x62b2c0ff = c4466xc755fcaa12;
                }
                this.f18848xcb94b041[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa13 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa();
                    if (bArr4 != null && bArr4.length > 0) {
                        c4466xc755fcaa13.mo11468x92b714fd(bArr4);
                    }
                    this.f18834x266e2436 = c4466xc755fcaa13;
                }
                this.f18848xcb94b041[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb700005 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000();
                    if (bArr5 != null && bArr5.length > 0) {
                        c4519xbcb700005.mo11468x92b714fd(bArr5);
                    }
                    this.f18837xd7c0d45b = c4519xbcb700005;
                }
                this.f18848xcb94b041[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb700006 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000();
                    if (bArr6 != null && bArr6.length > 0) {
                        c4519xbcb700006.mo11468x92b714fd(bArr6);
                    }
                    this.f18842x9ae8f06 = c4519xbcb700006;
                }
                this.f18848xcb94b041[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa14 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa();
                    if (bArr7 != null && bArr7.length > 0) {
                        c4466xc755fcaa14.mo11468x92b714fd(bArr7);
                    }
                    this.f18843xa221042 = c4466xc755fcaa14;
                }
                this.f18848xcb94b041[7] = true;
                return 0;
            case 8:
                this.f18844xf941e35d = aVar2.g(intValue);
                this.f18848xcb94b041[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a c4465xc813cb9a5 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a();
                    if (bArr8 != null && bArr8.length > 0) {
                        c4465xc813cb9a5.mo11468x92b714fd(bArr8);
                    }
                    this.f18839x4e1400c3 = c4465xc813cb9a5;
                }
                this.f18848xcb94b041[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a c4465xc813cb9a6 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a();
                    if (bArr9 != null && bArr9.length > 0) {
                        c4465xc813cb9a6.mo11468x92b714fd(bArr9);
                    }
                    this.f18840xa11de1a3 = c4465xc813cb9a6;
                }
                this.f18848xcb94b041[10] = true;
                return 0;
            case 11:
                this.f18845x58bc1f9a = aVar2.g(intValue);
                this.f18848xcb94b041[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa15 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa();
                    if (bArr10 != null && bArr10.length > 0) {
                        c4466xc755fcaa15.mo11468x92b714fd(bArr10);
                    }
                    this.f18836x8191af7a = c4466xc755fcaa15;
                }
                this.f18848xcb94b041[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a c4544x5de11f6a3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a();
                    if (bArr11 != null && bArr11.length > 0) {
                        c4544x5de11f6a3.mo11468x92b714fd(bArr11);
                    }
                    this.f18838x4aa3c2de = c4544x5de11f6a3;
                }
                this.f18848xcb94b041[13] = true;
                return 0;
            case 14:
                this.f18847x2cf92f6a = aVar2.g(intValue);
                this.f18848xcb94b041[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAppDnsInfo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39059xcc014e18(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa) {
        this.f18834x266e2436 = c4466xc755fcaa;
        this.f18848xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setBaseResponse */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39060x1f73abb4(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4455x92037252 c4455x92037252) {
        this.f18835x92037252 = c4455x92037252;
        this.f18848xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setC2cRoamDnsInfo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39061x73d9185c(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa) {
        this.f18836x8191af7a = c4466xc755fcaa;
        this.f18848xcb94b041[12] = true;
        return this;
    }

    /* renamed from: setCDNDnsRuleBuf */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39062xf857c739(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb70000) {
        this.f18837xd7c0d45b = c4519xbcb70000;
        this.f18848xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setCdnUserIdcInfo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39063x3ceb2bc0(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a c4544x5de11f6a) {
        this.f18838x4aa3c2de = c4544x5de11f6a;
        this.f18848xcb94b041[13] = true;
        return this;
    }

    /* renamed from: setDefaultConfig */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39064x6eaaf3a1(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a c4465xc813cb9a) {
        this.f18839x4e1400c3 = c4465xc813cb9a;
        this.f18848xcb94b041[9] = true;
        return this;
    }

    /* renamed from: setDisasterConfig */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39065x93654a85(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a c4465xc813cb9a) {
        this.f18840xa11de1a3 = c4465xc813cb9a;
        this.f18848xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setDnsInfo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39066x1d5a2ab5(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa) {
        this.f18841xcf543957 = c4466xc755fcaa;
        this.f18848xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setFakeCDNDnsRuleBuf */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39067x4db4e2e4(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb70000) {
        this.f18842x9ae8f06 = c4519xbcb70000;
        this.f18848xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setFakeDnsInfo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39068x16f422a0(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa) {
        this.f18843xa221042 = c4466xc755fcaa;
        this.f18848xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setGetCdnDnsIntervalMS */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39069x5502b7bb(int i17) {
        this.f18844xf941e35d = i17;
        this.f18848xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setNextIpv6 */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39070xcb7459fc(int i17) {
        this.f18845x58bc1f9a = i17;
        this.f18848xcb94b041[11] = true;
        return this;
    }

    /* renamed from: setSnsDnsInfo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39071x845eae1(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa) {
        this.f18846x62b2c0ff = c4466xc755fcaa;
        this.f18848xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setVCodec1Limit */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39072xba6968cc(int i17) {
        this.f18847x2cf92f6a = i17;
        this.f18848xcb94b041[14] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 m39058x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4497xf3ac8ef3) super.mo11468x92b714fd(bArr);
    }
}

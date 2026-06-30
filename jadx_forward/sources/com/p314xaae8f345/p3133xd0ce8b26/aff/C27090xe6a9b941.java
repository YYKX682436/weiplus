package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile */
/* loaded from: classes15.dex */
public class C27090xe6a9b941 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 f59037xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941();

    /* renamed from: connect_end */
    private long f59038x66c6ac06;

    /* renamed from: connect_start */
    private long f59039xd093c8cd;

    /* renamed from: domain_lookup_end */
    private long f59040xd883b2f1;

    /* renamed from: domain_lookup_start */
    private long f59041xc72ac0f8;

    /* renamed from: downstream_throughput_kbps_estimate */
    private int f59042x851b13d5;

    /* renamed from: fetch_start */
    private long f59043x355eba9d;

    /* renamed from: hasSetFields */
    private final boolean[] f59044xcb94b041 = new boolean[27];

    /* renamed from: http_rtt_estimate */
    private int f59045x2cc7baac;

    /* renamed from: network_estimate_type */
    private int f59046x8a08dfa0;

    /* renamed from: peer_ip */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f59047xd6d7ed24;

    /* renamed from: peer_port */
    private int f59048x80946d3e;

    /* renamed from: protocol */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f59049xc50a8e98;

    /* renamed from: received_bytes_count */
    private long f59050x4097b6dd;

    /* renamed from: redirect_end */
    private long f59051x38b261f8;

    /* renamed from: redirect_start */
    private long f59052xd669ca3f;

    /* renamed from: request_end */
    private long f59053x4491cb2b;

    /* renamed from: request_start */
    private long f59054x6813b2b2;

    /* renamed from: response_end */
    private long f59055x55cdc3dd;

    /* renamed from: response_start */
    private long f59056x1a3446e4;
    private int rtt;

    /* renamed from: secure_connection_end */
    private long f59057xf9786dc2;

    /* renamed from: secure_connection_start */
    private long f59058x7ddc0b89;

    /* renamed from: sent_bytes_count */
    private long f59059xcffbc214;

    /* renamed from: socket_reused */
    private boolean f59060x24cccebc;

    /* renamed from: status_code */
    private int f59061xcad9be1a;

    /* renamed from: throughput_kbps */
    private int f59062x2e0ae8f;

    /* renamed from: transport_rtt_estimate */
    private int f59063x1fc459ab;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110096xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110097x7c90cfc0() {
        return f59037xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110098x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110099x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 c27090xe6a9b941 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f59052xd669ca3f), java.lang.Long.valueOf(c27090xe6a9b941.f59052xd669ca3f)) && n51.f.a(java.lang.Long.valueOf(this.f59051x38b261f8), java.lang.Long.valueOf(c27090xe6a9b941.f59051x38b261f8)) && n51.f.a(java.lang.Long.valueOf(this.f59043x355eba9d), java.lang.Long.valueOf(c27090xe6a9b941.f59043x355eba9d)) && n51.f.a(java.lang.Long.valueOf(this.f59041xc72ac0f8), java.lang.Long.valueOf(c27090xe6a9b941.f59041xc72ac0f8)) && n51.f.a(java.lang.Long.valueOf(this.f59040xd883b2f1), java.lang.Long.valueOf(c27090xe6a9b941.f59040xd883b2f1)) && n51.f.a(java.lang.Long.valueOf(this.f59039xd093c8cd), java.lang.Long.valueOf(c27090xe6a9b941.f59039xd093c8cd)) && n51.f.a(java.lang.Long.valueOf(this.f59038x66c6ac06), java.lang.Long.valueOf(c27090xe6a9b941.f59038x66c6ac06)) && n51.f.a(java.lang.Long.valueOf(this.f59058x7ddc0b89), java.lang.Long.valueOf(c27090xe6a9b941.f59058x7ddc0b89)) && n51.f.a(java.lang.Long.valueOf(this.f59057xf9786dc2), java.lang.Long.valueOf(c27090xe6a9b941.f59057xf9786dc2)) && n51.f.a(java.lang.Long.valueOf(this.f59054x6813b2b2), java.lang.Long.valueOf(c27090xe6a9b941.f59054x6813b2b2)) && n51.f.a(java.lang.Long.valueOf(this.f59053x4491cb2b), java.lang.Long.valueOf(c27090xe6a9b941.f59053x4491cb2b)) && n51.f.a(java.lang.Long.valueOf(this.f59056x1a3446e4), java.lang.Long.valueOf(c27090xe6a9b941.f59056x1a3446e4)) && n51.f.a(java.lang.Long.valueOf(this.f59055x55cdc3dd), java.lang.Long.valueOf(c27090xe6a9b941.f59055x55cdc3dd)) && n51.f.a(this.f59049xc50a8e98, c27090xe6a9b941.f59049xc50a8e98) && n51.f.a(java.lang.Integer.valueOf(this.rtt), java.lang.Integer.valueOf(c27090xe6a9b941.rtt)) && n51.f.a(java.lang.Integer.valueOf(this.f59061xcad9be1a), java.lang.Integer.valueOf(c27090xe6a9b941.f59061xcad9be1a)) && n51.f.a(java.lang.Integer.valueOf(this.f59046x8a08dfa0), java.lang.Integer.valueOf(c27090xe6a9b941.f59046x8a08dfa0)) && n51.f.a(java.lang.Integer.valueOf(this.f59045x2cc7baac), java.lang.Integer.valueOf(c27090xe6a9b941.f59045x2cc7baac)) && n51.f.a(java.lang.Integer.valueOf(this.f59063x1fc459ab), java.lang.Integer.valueOf(c27090xe6a9b941.f59063x1fc459ab)) && n51.f.a(java.lang.Integer.valueOf(this.f59042x851b13d5), java.lang.Integer.valueOf(c27090xe6a9b941.f59042x851b13d5)) && n51.f.a(java.lang.Integer.valueOf(this.f59062x2e0ae8f), java.lang.Integer.valueOf(c27090xe6a9b941.f59062x2e0ae8f)) && n51.f.a(this.f59047xd6d7ed24, c27090xe6a9b941.f59047xd6d7ed24) && n51.f.a(java.lang.Integer.valueOf(this.f59048x80946d3e), java.lang.Integer.valueOf(c27090xe6a9b941.f59048x80946d3e)) && n51.f.a(java.lang.Boolean.valueOf(this.f59060x24cccebc), java.lang.Boolean.valueOf(c27090xe6a9b941.f59060x24cccebc)) && n51.f.a(java.lang.Long.valueOf(this.f59059xcffbc214), java.lang.Long.valueOf(c27090xe6a9b941.f59059xcffbc214)) && n51.f.a(java.lang.Long.valueOf(this.f59050x4097b6dd), java.lang.Long.valueOf(c27090xe6a9b941.f59050x4097b6dd));
    }

    /* renamed from: getConnectEnd */
    public long m110100xc004af87() {
        return this.f59038x66c6ac06;
    }

    /* renamed from: getConnectStart */
    public long m110101xd25ef00e() {
        return this.f59039xd093c8cd;
    }

    /* renamed from: getDomainLookupEnd */
    public long m110102x2ab97667() {
        return this.f59040xd883b2f1;
    }

    /* renamed from: getDomainLookupStart */
    public long m110103x62fd7eee() {
        return this.f59041xc72ac0f8;
    }

    /* renamed from: getDownstreamThroughputKbpsEstimate */
    public int m110104x727d20e4() {
        return this.f59042x851b13d5;
    }

    /* renamed from: getFetchStart */
    public long m110105xffd4a9be() {
        return this.f59043x355eba9d;
    }

    /* renamed from: getHttpRttEstimate */
    public int m110106x4fb0fddc() {
        return this.f59045x2cc7baac;
    }

    /* renamed from: getNetworkEstimateType */
    public int m110107x71220a9a() {
        return this.f59046x8a08dfa0;
    }

    /* renamed from: getPeerIp */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m110108x29f4cd1f() {
        return this.f59044xcb94b041[22] ? this.f59047xd6d7ed24 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getPeerPort */
    public int m110109x7ff93a79() {
        return this.f59048x80946d3e;
    }

    /* renamed from: getProtocol */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m110110x40e4cc0e() {
        return this.f59044xcb94b041[14] ? this.f59049xc50a8e98 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getReceivedBytesCount */
    public long m110111xad612e1b() {
        return this.f59050x4097b6dd;
    }

    /* renamed from: getRedirectEnd */
    public long m110112x4f470229() {
        return this.f59051x38b261f8;
    }

    /* renamed from: getRedirectStart */
    public long m110113x9a572230() {
        return this.f59052xd669ca3f;
    }

    /* renamed from: getRequestEnd */
    public long m110114xf07697c2() {
        return this.f59053x4491cb2b;
    }

    /* renamed from: getRequestStart */
    public long m110115xadf7b589() {
        return this.f59054x6813b2b2;
    }

    /* renamed from: getResponseEnd */
    public long m110116x47f54fa4() {
        return this.f59055x55cdc3dd;
    }

    /* renamed from: getResponseStart */
    public long m110117x20a7fceb() {
        return this.f59056x1a3446e4;
    }

    /* renamed from: getRtt */
    public int m110118xb5886b3c() {
        return this.rtt;
    }

    /* renamed from: getSecureConnectionEnd */
    public long m110119xc3e107b0() {
        return this.f59057xf9786dc2;
    }

    /* renamed from: getSecureConnectionStart */
    public long m110120x5085e1f7() {
        return this.f59058x7ddc0b89;
    }

    /* renamed from: getSentBytesCount */
    public long m110121xd280612() {
        return this.f59059xcffbc214;
    }

    /* renamed from: getSocketReused */
    public boolean m110122x5bc7a439() {
        return this.f59060x24cccebc;
    }

    /* renamed from: getStatusCode */
    public int m110123xfd0160f5() {
        return this.f59061xcad9be1a;
    }

    /* renamed from: getThroughputKbps */
    public int m110124x9c11b3da() {
        return this.f59062x2e0ae8f;
    }

    /* renamed from: getTransportRttEstimate */
    public int m110125xc4613b47() {
        return this.f59063x1fc459ab;
    }

    /* renamed from: hasConnectEnd */
    public boolean m110126xfadc6dcb() {
        return m110132x6e095e9(7);
    }

    /* renamed from: hasConnectStart */
    public boolean m110127xb6402d52() {
        return m110132x6e095e9(6);
    }

    /* renamed from: hasDomainLookupEnd */
    public boolean m110128xcb1202a3() {
        return m110132x6e095e9(5);
    }

    /* renamed from: hasDomainLookupStart */
    public boolean m110129x4f63ec2a() {
        return m110132x6e095e9(4);
    }

    /* renamed from: hasDownstreamThroughputKbpsEstimate */
    public boolean m110130x66ff1428() {
        return m110132x6e095e9(20);
    }

    /* renamed from: hasFetchStart */
    public boolean m110131x3aac6802() {
        return m110132x6e095e9(3);
    }

    /* renamed from: hasFieldNumber */
    public boolean m110132x6e095e9(int i17) {
        return this.f59044xcb94b041[i17];
    }

    /* renamed from: hasHttpRttEstimate */
    public boolean m110133xf0098a18() {
        return m110132x6e095e9(18);
    }

    /* renamed from: hasNetworkEstimateType */
    public boolean m110134xdda218d6() {
        return m110132x6e095e9(17);
    }

    /* renamed from: hasPeerIp */
    public boolean m110135xe9ce4d63() {
        return m110132x6e095e9(22);
    }

    /* renamed from: hasPeerPort */
    public boolean m110136xaf73b9bd() {
        return m110132x6e095e9(23);
    }

    /* renamed from: hasProtocol */
    public boolean m110137x705f4b52() {
        return m110132x6e095e9(14);
    }

    /* renamed from: hasReceivedBytesCount */
    public boolean m110138x4dc8685f() {
        return m110132x6e095e9(26);
    }

    /* renamed from: hasRedirectEnd */
    public boolean m110139x6f670c65() {
        return m110132x6e095e9(2);
    }

    /* renamed from: hasRedirectStart */
    public boolean m110140x329d8d6c() {
        return m110132x6e095e9(1);
    }

    /* renamed from: hasRequestEnd */
    public boolean m110141x2b4e5606() {
        return m110132x6e095e9(11);
    }

    /* renamed from: hasRequestStart */
    public boolean m110142x91d8f2cd() {
        return m110132x6e095e9(10);
    }

    /* renamed from: hasResponseEnd */
    public boolean m110143x681559e0() {
        return m110132x6e095e9(13);
    }

    /* renamed from: hasResponseStart */
    public boolean m110144xb8ee6827() {
        return m110132x6e095e9(12);
    }

    /* renamed from: hasRtt */
    public boolean m110145xb7047178() {
        return m110132x6e095e9(15);
    }

    /* renamed from: hasSecureConnectionEnd */
    public boolean m110146x306115ec() {
        return m110132x6e095e9(9);
    }

    /* renamed from: hasSecureConnectionStart */
    public boolean m110147x9d3b5133() {
        return m110132x6e095e9(8);
    }

    /* renamed from: hasSentBytesCount */
    public boolean m110148x7daf0256() {
        return m110132x6e095e9(25);
    }

    /* renamed from: hasSocketReused */
    public boolean m110149x3fa8e17d() {
        return m110132x6e095e9(24);
    }

    /* renamed from: hasStatusCode */
    public boolean m110150x37d91f39() {
        return m110132x6e095e9(16);
    }

    /* renamed from: hasThroughputKbps */
    public boolean m110151xc98b01e() {
        return m110132x6e095e9(21);
    }

    /* renamed from: hasTransportRttEstimate */
    public boolean m110152xe7e2f48b() {
        return m110132x6e095e9(19);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110153x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f59044xcb94b041[1]) {
                fVar.h(1, this.f59052xd669ca3f);
            }
            if (this.f59044xcb94b041[2]) {
                fVar.h(2, this.f59051x38b261f8);
            }
            if (this.f59044xcb94b041[3]) {
                fVar.h(3, this.f59043x355eba9d);
            }
            if (this.f59044xcb94b041[4]) {
                fVar.h(4, this.f59041xc72ac0f8);
            }
            if (this.f59044xcb94b041[5]) {
                fVar.h(5, this.f59040xd883b2f1);
            }
            if (this.f59044xcb94b041[6]) {
                fVar.h(6, this.f59039xd093c8cd);
            }
            if (this.f59044xcb94b041[7]) {
                fVar.h(7, this.f59038x66c6ac06);
            }
            if (this.f59044xcb94b041[8]) {
                fVar.h(8, this.f59058x7ddc0b89);
            }
            if (this.f59044xcb94b041[9]) {
                fVar.h(9, this.f59057xf9786dc2);
            }
            if (this.f59044xcb94b041[10]) {
                fVar.h(10, this.f59054x6813b2b2);
            }
            if (this.f59044xcb94b041[11]) {
                fVar.h(11, this.f59053x4491cb2b);
            }
            if (this.f59044xcb94b041[12]) {
                fVar.h(12, this.f59056x1a3446e4);
            }
            if (this.f59044xcb94b041[13]) {
                fVar.h(13, this.f59055x55cdc3dd);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f59049xc50a8e98;
            if (gVar != null && this.f59044xcb94b041[14]) {
                fVar.b(14, gVar);
            }
            if (this.f59044xcb94b041[15]) {
                fVar.e(15, this.rtt);
            }
            if (this.f59044xcb94b041[16]) {
                fVar.e(16, this.f59061xcad9be1a);
            }
            if (this.f59044xcb94b041[17]) {
                fVar.e(17, this.f59046x8a08dfa0);
            }
            if (this.f59044xcb94b041[18]) {
                fVar.e(18, this.f59045x2cc7baac);
            }
            if (this.f59044xcb94b041[19]) {
                fVar.e(19, this.f59063x1fc459ab);
            }
            if (this.f59044xcb94b041[20]) {
                fVar.e(20, this.f59042x851b13d5);
            }
            if (this.f59044xcb94b041[21]) {
                fVar.e(21, this.f59062x2e0ae8f);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f59047xd6d7ed24;
            if (gVar2 != null && this.f59044xcb94b041[22]) {
                fVar.b(22, gVar2);
            }
            if (this.f59044xcb94b041[23]) {
                fVar.e(23, this.f59048x80946d3e);
            }
            if (this.f59044xcb94b041[24]) {
                fVar.a(24, this.f59060x24cccebc);
            }
            if (this.f59044xcb94b041[25]) {
                fVar.h(25, this.f59059xcffbc214);
            }
            if (this.f59044xcb94b041[26]) {
                fVar.h(26, this.f59050x4097b6dd);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.f59044xcb94b041[1] ? b36.f.h(1, this.f59052xd669ca3f) + 0 : 0;
            if (this.f59044xcb94b041[2]) {
                h17 += b36.f.h(2, this.f59051x38b261f8);
            }
            if (this.f59044xcb94b041[3]) {
                h17 += b36.f.h(3, this.f59043x355eba9d);
            }
            if (this.f59044xcb94b041[4]) {
                h17 += b36.f.h(4, this.f59041xc72ac0f8);
            }
            if (this.f59044xcb94b041[5]) {
                h17 += b36.f.h(5, this.f59040xd883b2f1);
            }
            if (this.f59044xcb94b041[6]) {
                h17 += b36.f.h(6, this.f59039xd093c8cd);
            }
            if (this.f59044xcb94b041[7]) {
                h17 += b36.f.h(7, this.f59038x66c6ac06);
            }
            if (this.f59044xcb94b041[8]) {
                h17 += b36.f.h(8, this.f59058x7ddc0b89);
            }
            if (this.f59044xcb94b041[9]) {
                h17 += b36.f.h(9, this.f59057xf9786dc2);
            }
            if (this.f59044xcb94b041[10]) {
                h17 += b36.f.h(10, this.f59054x6813b2b2);
            }
            if (this.f59044xcb94b041[11]) {
                h17 += b36.f.h(11, this.f59053x4491cb2b);
            }
            if (this.f59044xcb94b041[12]) {
                h17 += b36.f.h(12, this.f59056x1a3446e4);
            }
            if (this.f59044xcb94b041[13]) {
                h17 += b36.f.h(13, this.f59055x55cdc3dd);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f59049xc50a8e98;
            if (gVar3 != null && this.f59044xcb94b041[14]) {
                h17 += b36.f.b(14, gVar3);
            }
            if (this.f59044xcb94b041[15]) {
                h17 += b36.f.e(15, this.rtt);
            }
            if (this.f59044xcb94b041[16]) {
                h17 += b36.f.e(16, this.f59061xcad9be1a);
            }
            if (this.f59044xcb94b041[17]) {
                h17 += b36.f.e(17, this.f59046x8a08dfa0);
            }
            if (this.f59044xcb94b041[18]) {
                h17 += b36.f.e(18, this.f59045x2cc7baac);
            }
            if (this.f59044xcb94b041[19]) {
                h17 += b36.f.e(19, this.f59063x1fc459ab);
            }
            if (this.f59044xcb94b041[20]) {
                h17 += b36.f.e(20, this.f59042x851b13d5);
            }
            if (this.f59044xcb94b041[21]) {
                h17 += b36.f.e(21, this.f59062x2e0ae8f);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f59047xd6d7ed24;
            if (gVar4 != null && this.f59044xcb94b041[22]) {
                h17 += b36.f.b(22, gVar4);
            }
            if (this.f59044xcb94b041[23]) {
                h17 += b36.f.e(23, this.f59048x80946d3e);
            }
            if (this.f59044xcb94b041[24]) {
                h17 += b36.f.a(24, this.f59060x24cccebc);
            }
            if (this.f59044xcb94b041[25]) {
                h17 += b36.f.h(25, this.f59059xcffbc214);
            }
            return this.f59044xcb94b041[26] ? h17 + b36.f.h(26, this.f59050x4097b6dd) : h17;
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
                this.f59052xd669ca3f = aVar2.i(intValue);
                this.f59044xcb94b041[1] = true;
                return 0;
            case 2:
                this.f59051x38b261f8 = aVar2.i(intValue);
                this.f59044xcb94b041[2] = true;
                return 0;
            case 3:
                this.f59043x355eba9d = aVar2.i(intValue);
                this.f59044xcb94b041[3] = true;
                return 0;
            case 4:
                this.f59041xc72ac0f8 = aVar2.i(intValue);
                this.f59044xcb94b041[4] = true;
                return 0;
            case 5:
                this.f59040xd883b2f1 = aVar2.i(intValue);
                this.f59044xcb94b041[5] = true;
                return 0;
            case 6:
                this.f59039xd093c8cd = aVar2.i(intValue);
                this.f59044xcb94b041[6] = true;
                return 0;
            case 7:
                this.f59038x66c6ac06 = aVar2.i(intValue);
                this.f59044xcb94b041[7] = true;
                return 0;
            case 8:
                this.f59058x7ddc0b89 = aVar2.i(intValue);
                this.f59044xcb94b041[8] = true;
                return 0;
            case 9:
                this.f59057xf9786dc2 = aVar2.i(intValue);
                this.f59044xcb94b041[9] = true;
                return 0;
            case 10:
                this.f59054x6813b2b2 = aVar2.i(intValue);
                this.f59044xcb94b041[10] = true;
                return 0;
            case 11:
                this.f59053x4491cb2b = aVar2.i(intValue);
                this.f59044xcb94b041[11] = true;
                return 0;
            case 12:
                this.f59056x1a3446e4 = aVar2.i(intValue);
                this.f59044xcb94b041[12] = true;
                return 0;
            case 13:
                this.f59055x55cdc3dd = aVar2.i(intValue);
                this.f59044xcb94b041[13] = true;
                return 0;
            case 14:
                this.f59049xc50a8e98 = aVar2.d(intValue);
                this.f59044xcb94b041[14] = true;
                return 0;
            case 15:
                this.rtt = aVar2.g(intValue);
                this.f59044xcb94b041[15] = true;
                return 0;
            case 16:
                this.f59061xcad9be1a = aVar2.g(intValue);
                this.f59044xcb94b041[16] = true;
                return 0;
            case 17:
                this.f59046x8a08dfa0 = aVar2.g(intValue);
                this.f59044xcb94b041[17] = true;
                return 0;
            case 18:
                this.f59045x2cc7baac = aVar2.g(intValue);
                this.f59044xcb94b041[18] = true;
                return 0;
            case 19:
                this.f59063x1fc459ab = aVar2.g(intValue);
                this.f59044xcb94b041[19] = true;
                return 0;
            case 20:
                this.f59042x851b13d5 = aVar2.g(intValue);
                this.f59044xcb94b041[20] = true;
                return 0;
            case 21:
                this.f59062x2e0ae8f = aVar2.g(intValue);
                this.f59044xcb94b041[21] = true;
                return 0;
            case 22:
                this.f59047xd6d7ed24 = aVar2.d(intValue);
                this.f59044xcb94b041[22] = true;
                return 0;
            case 23:
                this.f59048x80946d3e = aVar2.g(intValue);
                this.f59044xcb94b041[23] = true;
                return 0;
            case 24:
                this.f59060x24cccebc = aVar2.c(intValue);
                this.f59044xcb94b041[24] = true;
                return 0;
            case 25:
                this.f59059xcffbc214 = aVar2.i(intValue);
                this.f59044xcb94b041[25] = true;
                return 0;
            case 26:
                this.f59050x4097b6dd = aVar2.i(intValue);
                this.f59044xcb94b041[26] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setConnectEnd */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110155xee28fd93(long j17) {
        this.f59038x66c6ac06 = j17;
        this.f59044xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setConnectStart */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110156x8a7eb1a(long j17) {
        this.f59039xd093c8cd = j17;
        this.f59044xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setDomainLookupEnd */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110157x61900fdb(long j17) {
        this.f59040xd883b2f1 = j17;
        this.f59044xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setDomainLookupStart */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110158x3e938b62(long j17) {
        this.f59041xc72ac0f8 = j17;
        this.f59044xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setDownstreamThroughputKbpsEstimate */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110159x44a61df0(int i17) {
        this.f59042x851b13d5 = i17;
        this.f59044xcb94b041[20] = true;
        return this;
    }

    /* renamed from: setFetchStart */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110160x2df8f7ca(long j17) {
        this.f59043x355eba9d = j17;
        this.f59044xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setHttpRttEstimate */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110161x86879750(int i17) {
        this.f59045x2cc7baac = i17;
        this.f59044xcb94b041[18] = true;
        return this;
    }

    /* renamed from: setNetworkEstimateType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110162xbf66ca0e(int i17) {
        this.f59046x8a08dfa0 = i17;
        this.f59044xcb94b041[17] = true;
        return this;
    }

    /* renamed from: setPeerIp */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110163x1d2a012b(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59047xd6d7ed24 = gVar;
        this.f59044xcb94b041[22] = true;
        return this;
    }

    /* renamed from: setPeerPort */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110164x7ab19b85(int i17) {
        this.f59048x80946d3e = i17;
        this.f59044xcb94b041[23] = true;
        return this;
    }

    /* renamed from: setProtocol */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110165x3b9d2d1a(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59049xc50a8e98 = gVar;
        this.f59044xcb94b041[14] = true;
        return this;
    }

    /* renamed from: setReceivedBytesCount */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110166x448cb027(long j17) {
        this.f59050x4097b6dd = j17;
        this.f59044xcb94b041[26] = true;
        return this;
    }

    /* renamed from: setRedirectEnd */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110167xe5ac759d(long j17) {
        this.f59051x38b261f8 = j17;
        this.f59044xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setRedirectStart */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110168x2d2d88a4(long j17) {
        this.f59052xd669ca3f = j17;
        this.f59044xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setRequestEnd */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110169x1e9ae5ce(long j17) {
        this.f59053x4491cb2b = j17;
        this.f59044xcb94b041[11] = true;
        return this;
    }

    /* renamed from: setRequestStart */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110170xe440b095(long j17) {
        this.f59054x6813b2b2 = j17;
        this.f59044xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setResponseEnd */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110171xde5ac318(long j17) {
        this.f59055x55cdc3dd = j17;
        this.f59044xcb94b041[13] = true;
        return this;
    }

    /* renamed from: setResponseStart */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110172xb37e635f(long j17) {
        this.f59056x1a3446e4 = j17;
        this.f59044xcb94b041[12] = true;
        return this;
    }

    /* renamed from: setRtt */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110173xca0292b0(int i17) {
        this.rtt = i17;
        this.f59044xcb94b041[15] = true;
        return this;
    }

    /* renamed from: setSecureConnectionEnd */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110174x1225c724(long j17) {
        this.f59057xf9786dc2 = j17;
        this.f59044xcb94b041[9] = true;
        return this;
    }

    /* renamed from: setSecureConnectionStart */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110175x2098946b(long j17) {
        this.f59058x7ddc0b89 = j17;
        this.f59044xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setSentBytesCount */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110176xd51e6e1e(long j17) {
        this.f59059xcffbc214 = j17;
        this.f59044xcb94b041[25] = true;
        return this;
    }

    /* renamed from: setSocketReused */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110177x92109f45(boolean z17) {
        this.f59060x24cccebc = z17;
        this.f59044xcb94b041[24] = true;
        return this;
    }

    /* renamed from: setStatusCode */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110178x2b25af01(int i17) {
        this.f59061xcad9be1a = i17;
        this.f59044xcb94b041[16] = true;
        return this;
    }

    /* renamed from: setThroughputKbps */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110179x64081be6(int i17) {
        this.f59062x2e0ae8f = i17;
        this.f59044xcb94b041[21] = true;
        return this;
    }

    /* renamed from: setTransportRttEstimate */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110180x3eb46a53(int i17) {
        this.f59063x1fc459ab = i17;
        this.f59044xcb94b041[19] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 m110154x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27090xe6a9b941) super.mo11468x92b714fd(bArr);
    }
}

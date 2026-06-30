package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.NetworkProfile */
/* loaded from: classes8.dex */
public class C4511x4c4963bb extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb f18935xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb();

    /* renamed from: avg_conn_cost */
    private int f18936x57f1ebd3;

    /* renamed from: avg_rtt */
    private int f18937xda70ab85;

    /* renamed from: avg_speed */
    private int f18938xfff89a;

    /* renamed from: conn_times */
    private int f18939xc8720873;

    /* renamed from: first_conn_cost */
    private int f18940x18918631;

    /* renamed from: http_response_header */
    private java.lang.String f18942x753bfe94;

    /* renamed from: http_status_code */
    private int f18943xb24698e3;

    /* renamed from: is_cross_network */
    private boolean f18944x3ecfe6da;

    /* renamed from: is_private_protocol */
    private boolean f18945x6cb12c49;

    /* renamed from: last_client_ip */
    private java.lang.String f18946xcb67afb2;

    /* renamed from: last_network_type */
    private int f18947xb77555b4;

    /* renamed from: last_server_ip */
    private java.lang.String f18948x3121213a;

    /* renamed from: last_server_port */
    private int f18949x6d60f3d4;

    /* renamed from: server_fallback_count */
    private int f18950xeaa299ee;

    /* renamed from: used_url */
    private java.lang.String f18952xef5db9ed;

    /* renamed from: xerrno */
    private java.lang.String f18953xd28a5c6e;

    /* renamed from: server_ips */
    private java.util.LinkedList<java.lang.String> f18951x932f9d30 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f18941xcb94b041 = new boolean[18];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39251xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39252x7c90cfc0() {
        return f18935xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39253x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb();
    }

    /* renamed from: addAllElementServerIps */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39254xc969fad(java.util.Collection<java.lang.String> collection) {
        this.f18951x932f9d30.addAll(collection);
        this.f18941xcb94b041[15] = true;
        return this;
    }

    /* renamed from: addElementServerIps */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39255xb8617d0e(java.lang.String str) {
        this.f18951x932f9d30.add(str);
        this.f18941xcb94b041[15] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39256x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb c4511x4c4963bb = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb) fVar;
        return n51.f.a(this.f18948x3121213a, c4511x4c4963bb.f18948x3121213a) && n51.f.a(this.f18946xcb67afb2, c4511x4c4963bb.f18946xcb67afb2) && n51.f.a(java.lang.Boolean.valueOf(this.f18944x3ecfe6da), java.lang.Boolean.valueOf(c4511x4c4963bb.f18944x3ecfe6da)) && n51.f.a(java.lang.Integer.valueOf(this.f18938xfff89a), java.lang.Integer.valueOf(c4511x4c4963bb.f18938xfff89a)) && n51.f.a(java.lang.Integer.valueOf(this.f18936x57f1ebd3), java.lang.Integer.valueOf(c4511x4c4963bb.f18936x57f1ebd3)) && n51.f.a(java.lang.Integer.valueOf(this.f18940x18918631), java.lang.Integer.valueOf(c4511x4c4963bb.f18940x18918631)) && n51.f.a(java.lang.Integer.valueOf(this.f18939xc8720873), java.lang.Integer.valueOf(c4511x4c4963bb.f18939xc8720873)) && n51.f.a(java.lang.Integer.valueOf(this.f18937xda70ab85), java.lang.Integer.valueOf(c4511x4c4963bb.f18937xda70ab85)) && n51.f.a(java.lang.Integer.valueOf(this.f18950xeaa299ee), java.lang.Integer.valueOf(c4511x4c4963bb.f18950xeaa299ee)) && n51.f.a(java.lang.Integer.valueOf(this.f18943xb24698e3), java.lang.Integer.valueOf(c4511x4c4963bb.f18943xb24698e3)) && n51.f.a(this.f18942x753bfe94, c4511x4c4963bb.f18942x753bfe94) && n51.f.a(this.f18952xef5db9ed, c4511x4c4963bb.f18952xef5db9ed) && n51.f.a(this.f18953xd28a5c6e, c4511x4c4963bb.f18953xd28a5c6e) && n51.f.a(java.lang.Boolean.valueOf(this.f18945x6cb12c49), java.lang.Boolean.valueOf(c4511x4c4963bb.f18945x6cb12c49)) && n51.f.a(this.f18951x932f9d30, c4511x4c4963bb.f18951x932f9d30) && n51.f.a(java.lang.Integer.valueOf(this.f18949x6d60f3d4), java.lang.Integer.valueOf(c4511x4c4963bb.f18949x6d60f3d4)) && n51.f.a(java.lang.Integer.valueOf(this.f18947xb77555b4), java.lang.Integer.valueOf(c4511x4c4963bb.f18947xb77555b4));
    }

    /* renamed from: getAvgConnCost */
    public int m39257x678690d5() {
        return this.f18936x57f1ebd3;
    }

    /* renamed from: getAvgRtt */
    public int m39258x114c2136() {
        return this.f18937xda70ab85;
    }

    /* renamed from: getAvgSpeed */
    public int m39259xeed4c60b() {
        return this.f18938xfff89a;
    }

    /* renamed from: getConnTimes */
    public int m39260xdbfa74c4() {
        return this.f18939xc8720873;
    }

    /* renamed from: getFirstConnCost */
    public int m39261x8eea033() {
        return this.f18940x18918631;
    }

    /* renamed from: getHttpResponseHeader */
    public java.lang.String m39262xb81d96cc() {
        return this.f18941xcb94b041[11] ? this.f18942x753bfe94 : "";
    }

    /* renamed from: getHttpStatusCode */
    public int m39263xea30509d() {
        return this.f18943xb24698e3;
    }

    /* renamed from: getIsCrossNetwork */
    public boolean m39264xa98510e() {
        return this.f18944x3ecfe6da;
    }

    /* renamed from: getIsPrivateProtocol */
    public boolean m39265x2a2fddfb() {
        return this.f18945x6cb12c49;
    }

    /* renamed from: getLastClientIp */
    public java.lang.String m39266x308bc97e() {
        return this.f18941xcb94b041[2] ? this.f18946xcb67afb2 : "";
    }

    /* renamed from: getLastNetworkType */
    public int m39267xf31523dc() {
        return this.f18947xb77555b4;
    }

    /* renamed from: getLastServerIp */
    public java.lang.String m39268x4c9a06f6() {
        return this.f18941xcb94b041[1] ? this.f18948x3121213a : "";
    }

    /* renamed from: getLastServerPort */
    public int m39269x8e375a90() {
        return this.f18949x6d60f3d4;
    }

    /* renamed from: getServerFallbackCount */
    public int m39270x8620b994() {
        return this.f18950xeaa299ee;
    }

    /* renamed from: getServerIps */
    public java.util.LinkedList<java.lang.String> m39271xf3a87733() {
        return this.f18951x932f9d30;
    }

    /* renamed from: getUsedUrl */
    public java.lang.String m39272x3501a83c() {
        return this.f18941xcb94b041[12] ? this.f18952xef5db9ed : "";
    }

    /* renamed from: getXerrno */
    public java.lang.String m39273x37a17f64() {
        return this.f18941xcb94b041[13] ? this.f18953xd28a5c6e : "";
    }

    /* renamed from: hasAvgConnCost */
    public boolean m39274x87a69b11() {
        return m39278x6e095e9(5);
    }

    /* renamed from: hasAvgRtt */
    public boolean m39275xd125a17a() {
        return m39278x6e095e9(8);
    }

    /* renamed from: hasAvgSpeed */
    public boolean m39276x1e4f454f() {
        return m39278x6e095e9(4);
    }

    /* renamed from: hasConnTimes */
    public boolean m39277x9bcfde00() {
        return m39278x6e095e9(7);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39278x6e095e9(int i17) {
        return this.f18941xcb94b041[i17];
    }

    /* renamed from: hasFirstConnCost */
    public boolean m39279xa1350b6f() {
        return m39278x6e095e9(6);
    }

    /* renamed from: hasHttpResponseHeader */
    public boolean m39280x5884d110() {
        return m39278x6e095e9(11);
    }

    /* renamed from: hasHttpStatusCode */
    public boolean m39281x5ab74ce1() {
        return m39278x6e095e9(10);
    }

    /* renamed from: hasIsCrossNetwork */
    public boolean m39282x7b1f4d52() {
        return m39278x6e095e9(3);
    }

    /* renamed from: hasIsPrivateProtocol */
    public boolean m39283x16964b37() {
        return m39278x6e095e9(14);
    }

    /* renamed from: hasLastClientIp */
    public boolean m39284x146d06c2() {
        return m39278x6e095e9(2);
    }

    /* renamed from: hasLastNetworkType */
    public boolean m39285x936db018() {
        return m39278x6e095e9(17);
    }

    /* renamed from: hasLastServerIp */
    public boolean m39286x307b443a() {
        return m39278x6e095e9(1);
    }

    /* renamed from: hasLastServerPort */
    public boolean m39287xfebe56d4() {
        return m39278x6e095e9(16);
    }

    /* renamed from: hasServerFallbackCount */
    public boolean m39288xf2a0c7d0() {
        return m39278x6e095e9(9);
    }

    /* renamed from: hasServerIps */
    public boolean m39289xb37de06f() {
        return m39278x6e095e9(15);
    }

    /* renamed from: hasUsedUrl */
    public boolean m39290x70583078() {
        return m39278x6e095e9(12);
    }

    /* renamed from: hasXerrno */
    public boolean m39291xf77affa8() {
        return m39278x6e095e9(13);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39292x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f18948x3121213a;
            if (str != null && this.f18941xcb94b041[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f18946xcb67afb2;
            if (str2 != null && this.f18941xcb94b041[2]) {
                fVar.j(2, str2);
            }
            if (this.f18941xcb94b041[3]) {
                fVar.a(3, this.f18944x3ecfe6da);
            }
            if (this.f18941xcb94b041[4]) {
                fVar.e(4, this.f18938xfff89a);
            }
            if (this.f18941xcb94b041[5]) {
                fVar.e(5, this.f18936x57f1ebd3);
            }
            if (this.f18941xcb94b041[6]) {
                fVar.e(6, this.f18940x18918631);
            }
            if (this.f18941xcb94b041[7]) {
                fVar.e(7, this.f18939xc8720873);
            }
            if (this.f18941xcb94b041[8]) {
                fVar.e(8, this.f18937xda70ab85);
            }
            if (this.f18941xcb94b041[9]) {
                fVar.e(9, this.f18950xeaa299ee);
            }
            if (this.f18941xcb94b041[10]) {
                fVar.e(10, this.f18943xb24698e3);
            }
            java.lang.String str3 = this.f18942x753bfe94;
            if (str3 != null && this.f18941xcb94b041[11]) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f18952xef5db9ed;
            if (str4 != null && this.f18941xcb94b041[12]) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f18953xd28a5c6e;
            if (str5 != null && this.f18941xcb94b041[13]) {
                fVar.j(13, str5);
            }
            if (this.f18941xcb94b041[14]) {
                fVar.a(14, this.f18945x6cb12c49);
            }
            fVar.g(15, 1, this.f18951x932f9d30);
            if (this.f18941xcb94b041[16]) {
                fVar.e(16, this.f18949x6d60f3d4);
            }
            if (this.f18941xcb94b041[17]) {
                fVar.e(17, this.f18947xb77555b4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f18948x3121213a;
            if (str6 != null && this.f18941xcb94b041[1]) {
                i18 = b36.f.j(1, str6) + 0;
            }
            java.lang.String str7 = this.f18946xcb67afb2;
            if (str7 != null && this.f18941xcb94b041[2]) {
                i18 += b36.f.j(2, str7);
            }
            if (this.f18941xcb94b041[3]) {
                i18 += b36.f.a(3, this.f18944x3ecfe6da);
            }
            if (this.f18941xcb94b041[4]) {
                i18 += b36.f.e(4, this.f18938xfff89a);
            }
            if (this.f18941xcb94b041[5]) {
                i18 += b36.f.e(5, this.f18936x57f1ebd3);
            }
            if (this.f18941xcb94b041[6]) {
                i18 += b36.f.e(6, this.f18940x18918631);
            }
            if (this.f18941xcb94b041[7]) {
                i18 += b36.f.e(7, this.f18939xc8720873);
            }
            if (this.f18941xcb94b041[8]) {
                i18 += b36.f.e(8, this.f18937xda70ab85);
            }
            if (this.f18941xcb94b041[9]) {
                i18 += b36.f.e(9, this.f18950xeaa299ee);
            }
            if (this.f18941xcb94b041[10]) {
                i18 += b36.f.e(10, this.f18943xb24698e3);
            }
            java.lang.String str8 = this.f18942x753bfe94;
            if (str8 != null && this.f18941xcb94b041[11]) {
                i18 += b36.f.j(11, str8);
            }
            java.lang.String str9 = this.f18952xef5db9ed;
            if (str9 != null && this.f18941xcb94b041[12]) {
                i18 += b36.f.j(12, str9);
            }
            java.lang.String str10 = this.f18953xd28a5c6e;
            if (str10 != null && this.f18941xcb94b041[13]) {
                i18 += b36.f.j(13, str10);
            }
            if (this.f18941xcb94b041[14]) {
                i18 += b36.f.a(14, this.f18945x6cb12c49);
            }
            int g17 = i18 + b36.f.g(15, 1, this.f18951x932f9d30);
            if (this.f18941xcb94b041[16]) {
                g17 += b36.f.e(16, this.f18949x6d60f3d4);
            }
            return this.f18941xcb94b041[17] ? g17 + b36.f.e(17, this.f18947xb77555b4) : g17;
        }
        if (i17 == 2) {
            this.f18951x932f9d30.clear();
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
                this.f18948x3121213a = aVar2.k(intValue);
                this.f18941xcb94b041[1] = true;
                return 0;
            case 2:
                this.f18946xcb67afb2 = aVar2.k(intValue);
                this.f18941xcb94b041[2] = true;
                return 0;
            case 3:
                this.f18944x3ecfe6da = aVar2.c(intValue);
                this.f18941xcb94b041[3] = true;
                return 0;
            case 4:
                this.f18938xfff89a = aVar2.g(intValue);
                this.f18941xcb94b041[4] = true;
                return 0;
            case 5:
                this.f18936x57f1ebd3 = aVar2.g(intValue);
                this.f18941xcb94b041[5] = true;
                return 0;
            case 6:
                this.f18940x18918631 = aVar2.g(intValue);
                this.f18941xcb94b041[6] = true;
                return 0;
            case 7:
                this.f18939xc8720873 = aVar2.g(intValue);
                this.f18941xcb94b041[7] = true;
                return 0;
            case 8:
                this.f18937xda70ab85 = aVar2.g(intValue);
                this.f18941xcb94b041[8] = true;
                return 0;
            case 9:
                this.f18950xeaa299ee = aVar2.g(intValue);
                this.f18941xcb94b041[9] = true;
                return 0;
            case 10:
                this.f18943xb24698e3 = aVar2.g(intValue);
                this.f18941xcb94b041[10] = true;
                return 0;
            case 11:
                this.f18942x753bfe94 = aVar2.k(intValue);
                this.f18941xcb94b041[11] = true;
                return 0;
            case 12:
                this.f18952xef5db9ed = aVar2.k(intValue);
                this.f18941xcb94b041[12] = true;
                return 0;
            case 13:
                this.f18953xd28a5c6e = aVar2.k(intValue);
                this.f18941xcb94b041[13] = true;
                return 0;
            case 14:
                this.f18945x6cb12c49 = aVar2.c(intValue);
                this.f18941xcb94b041[14] = true;
                return 0;
            case 15:
                this.f18951x932f9d30.add(aVar2.k(intValue));
                this.f18941xcb94b041[15] = true;
                return 0;
            case 16:
                this.f18949x6d60f3d4 = aVar2.g(intValue);
                this.f18941xcb94b041[16] = true;
                return 0;
            case 17:
                this.f18947xb77555b4 = aVar2.g(intValue);
                this.f18941xcb94b041[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAvgConnCost */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39294xfdec0449(int i17) {
        this.f18936x57f1ebd3 = i17;
        this.f18941xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setAvgRtt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39295x4815542(int i17) {
        this.f18937xda70ab85 = i17;
        this.f18941xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setAvgSpeed */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39296xe98d2717(int i17) {
        this.f18938xfff89a = i17;
        this.f18941xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setConnTimes */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39297x384e3538(int i17) {
        this.f18939xc8720873 = i17;
        this.f18941xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setFirstConnCost */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39298x9bc506a7(int i17) {
        this.f18940x18918631 = i17;
        this.f18941xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setHttpResponseHeader */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39299x4f4918d8(java.lang.String str) {
        this.f18942x753bfe94 = str;
        this.f18941xcb94b041[11] = true;
        return this;
    }

    /* renamed from: setHttpStatusCode */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39300xb226b8a9(int i17) {
        this.f18943xb24698e3 = i17;
        this.f18941xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setIsCrossNetwork */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39301xd28eb91a(boolean z17) {
        this.f18944x3ecfe6da = z17;
        this.f18941xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setIsPrivateProtocol */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39302x5c5ea6f(boolean z17) {
        this.f18945x6cb12c49 = z17;
        this.f18941xcb94b041[14] = true;
        return this;
    }

    /* renamed from: setLastClientIp */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39303x66d4c48a(java.lang.String str) {
        this.f18946xcb67afb2 = str;
        this.f18941xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setLastNetworkType */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39304x29ebbd50(int i17) {
        this.f18947xb77555b4 = i17;
        this.f18941xcb94b041[17] = true;
        return this;
    }

    /* renamed from: setLastServerIp */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39305x82e30202(java.lang.String str) {
        this.f18948x3121213a = str;
        this.f18941xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setLastServerPort */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39306x562dc29c(int i17) {
        this.f18949x6d60f3d4 = i17;
        this.f18941xcb94b041[16] = true;
        return this;
    }

    /* renamed from: setServerFallbackCount */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39307xd4657908(int i17) {
        this.f18950xeaa299ee = i17;
        this.f18941xcb94b041[9] = true;
        return this;
    }

    /* renamed from: setServerIps */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39308x4ffc37a7(java.util.LinkedList<java.lang.String> linkedList) {
        this.f18951x932f9d30 = linkedList;
        this.f18941xcb94b041[15] = true;
        return this;
    }

    /* renamed from: setUsedUrl */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39309xa872f5b0(java.lang.String str) {
        this.f18952xef5db9ed = str;
        this.f18941xcb94b041[12] = true;
        return this;
    }

    /* renamed from: setXerrno */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39310x2ad6b370(java.lang.String str) {
        this.f18953xd28a5c6e = str;
        this.f18941xcb94b041[13] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39293x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb) super.mo11468x92b714fd(bArr);
    }
}

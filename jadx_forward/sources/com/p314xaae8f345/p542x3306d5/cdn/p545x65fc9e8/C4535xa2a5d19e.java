package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.UploadResult */
/* loaded from: classes8.dex */
public class C4535xa2a5d19e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e f19137xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e();

    /* renamed from: append */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result f19138xabe4cf1a;

    /* renamed from: apptype */
    private int f19139xd0bc10db;

    /* renamed from: base */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e f19140x2e06d1;

    /* renamed from: batch */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result f19141x592d73a;

    /* renamed from: bizid */
    private int f19142x596916e;
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 c2c;

    /* renamed from: cost */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed f19143x2eafcd;

    /* renamed from: embed */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result f19144x5c24ed9;

    /* renamed from: error_code */
    private int f19145x617e99c4;

    /* renamed from: error_msg */
    private java.lang.String f19146x13a964ca;

    /* renamed from: error_type */
    private int f19147x61867b11;

    /* renamed from: filekey */
    private java.lang.String f19148xcd09e763;

    /* renamed from: filetype */
    private int f19150xd43766b6;

    /* renamed from: network */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb f19152x6de15a2e;
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 sns;

    /* renamed from: transfor */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 f19153x4c58b921;

    /* renamed from: files */
    private java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610> f19149x5ceba77 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f19151xcb94b041 = new boolean[18];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39721xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39722x7c90cfc0() {
        return f19137xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39723x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e();
    }

    /* renamed from: addAllElementFiles */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39724xba65d63b(java.util.Collection<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610> collection) {
        this.f19149x5ceba77.addAll(collection);
        this.f19151xcb94b041[11] = true;
        return this;
    }

    /* renamed from: addElementFiles */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39725x58308c1c(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b610) {
        this.f19149x5ceba77.add(c4490xd802b610);
        this.f19151xcb94b041[11] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39726x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e c4535xa2a5d19e = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e) fVar;
        return n51.f.a(this.f19148xcd09e763, c4535xa2a5d19e.f19148xcd09e763) && n51.f.a(java.lang.Integer.valueOf(this.f19142x596916e), java.lang.Integer.valueOf(c4535xa2a5d19e.f19142x596916e)) && n51.f.a(java.lang.Integer.valueOf(this.f19139xd0bc10db), java.lang.Integer.valueOf(c4535xa2a5d19e.f19139xd0bc10db)) && n51.f.a(java.lang.Integer.valueOf(this.f19150xd43766b6), java.lang.Integer.valueOf(c4535xa2a5d19e.f19150xd43766b6)) && n51.f.a(java.lang.Integer.valueOf(this.f19147x61867b11), java.lang.Integer.valueOf(c4535xa2a5d19e.f19147x61867b11)) && n51.f.a(java.lang.Integer.valueOf(this.f19145x617e99c4), java.lang.Integer.valueOf(c4535xa2a5d19e.f19145x617e99c4)) && n51.f.a(this.f19146x13a964ca, c4535xa2a5d19e.f19146x13a964ca) && n51.f.a(this.f19140x2e06d1, c4535xa2a5d19e.f19140x2e06d1) && n51.f.a(this.c2c, c4535xa2a5d19e.c2c) && n51.f.a(this.sns, c4535xa2a5d19e.sns) && n51.f.a(this.f19149x5ceba77, c4535xa2a5d19e.f19149x5ceba77) && n51.f.a(this.f19141x592d73a, c4535xa2a5d19e.f19141x592d73a) && n51.f.a(this.f19144x5c24ed9, c4535xa2a5d19e.f19144x5c24ed9) && n51.f.a(this.f19138xabe4cf1a, c4535xa2a5d19e.f19138xabe4cf1a) && n51.f.a(this.f19143x2eafcd, c4535xa2a5d19e.f19143x2eafcd) && n51.f.a(this.f19152x6de15a2e, c4535xa2a5d19e.f19152x6de15a2e) && n51.f.a(this.f19153x4c58b921, c4535xa2a5d19e.f19153x4c58b921);
    }

    /* renamed from: getAppend */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result m39727x10fbf210() {
        return this.f19151xcb94b041[14] ? this.f19138xabe4cf1a : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result.m38047xaf65a0fc();
    }

    /* renamed from: getApptype */
    public int m39728xe894ca5() {
        return this.f19139xd0bc10db;
    }

    /* renamed from: getBase */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e m39729xfb7d6f47() {
        return this.f19151xcb94b041[8] ? this.f19140x2e06d1 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e.m38115xaf65a0fc();
    }

    /* renamed from: getBatch */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result m39730x74307d84() {
        return this.f19151xcb94b041[12] ? this.f19141x592d73a : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result.m38173xaf65a0fc();
    }

    /* renamed from: getBizid */
    public int m39731x743437b8() {
        return this.f19142x596916e;
    }

    /* renamed from: getC2c */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 m39732xb5882ade() {
        return this.f19151xcb94b041[9] ? this.c2c : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31.m38237xaf65a0fc();
    }

    /* renamed from: getCost */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m39733xfb7e1843() {
        return this.f19151xcb94b041[15] ? this.f19143x2eafcd : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed.m38534xaf65a0fc();
    }

    /* renamed from: getEmbed */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result m39734x745ff523() {
        return this.f19151xcb94b041[13] ? this.f19144x5c24ed9 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result.m38810xaf65a0fc();
    }

    /* renamed from: getErrorCode */
    public int m39735x130a215f() {
        return this.f19145x617e99c4;
    }

    /* renamed from: getErrorMsg */
    public java.lang.String m39736xcf10fdcf() {
        return this.f19151xcb94b041[7] ? this.f19146x13a964ca : "";
    }

    /* renamed from: getErrorType */
    public int m39737x131202ac() {
        return this.f19147x61867b11;
    }

    /* renamed from: getFilekey */
    public java.lang.String m39738xad7232d() {
        return this.f19151xcb94b041[1] ? this.f19148xcd09e763 : "";
    }

    /* renamed from: getFiles */
    public java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610> m39739x746c60c1() {
        return this.f19149x5ceba77;
    }

    /* renamed from: getFiletype */
    public int m39740x5011a42c() {
        return this.f19150xd43766b6;
    }

    /* renamed from: getNetwork */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m39741xabae95f8() {
        return this.f19151xcb94b041[16] ? this.f19152x6de15a2e : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb.m39251xaf65a0fc();
    }

    /* renamed from: getSns */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 m39742xb5886e42() {
        return this.f19151xcb94b041[10] ? this.sns : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795.m39465xaf65a0fc();
    }

    /* renamed from: getTransfor */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39743xc832f697() {
        return this.f19151xcb94b041[17] ? this.f19153x4c58b921 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928.m39612xaf65a0fc();
    }

    /* renamed from: hasAppend */
    public boolean m39744xd0d57254() {
        return m39755x6e095e9(14);
    }

    /* renamed from: hasApptype */
    public boolean m39745x49dfd4e1() {
        return m39755x6e095e9(3);
    }

    /* renamed from: hasBase */
    public boolean m39746x2982308b() {
        return m39755x6e095e9(8);
    }

    /* renamed from: hasBatch */
    public boolean m39747x6c3e4c0() {
        return m39755x6e095e9(12);
    }

    /* renamed from: hasBizid */
    public boolean m39748x6c79ef4() {
        return m39755x6e095e9(2);
    }

    /* renamed from: hasC2c */
    public boolean m39749xb704311a() {
        return m39755x6e095e9(9);
    }

    /* renamed from: hasCost */
    public boolean m39750x2982d987() {
        return m39755x6e095e9(15);
    }

    /* renamed from: hasEmbed */
    public boolean m39751x6f35c5f() {
        return m39755x6e095e9(13);
    }

    /* renamed from: hasErrorCode */
    public boolean m39752xd2df8a9b() {
        return m39755x6e095e9(6);
    }

    /* renamed from: hasErrorMsg */
    public boolean m39753xfe8b7d13() {
        return m39755x6e095e9(7);
    }

    /* renamed from: hasErrorType */
    public boolean m39754xd2e76be8() {
        return m39755x6e095e9(5);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39755x6e095e9(int i17) {
        return this.f19151xcb94b041[i17];
    }

    /* renamed from: hasFilekey */
    public boolean m39756x462dab69() {
        return m39755x6e095e9(1);
    }

    /* renamed from: hasFiles */
    public boolean m39757x6ffc7fd() {
        return m39755x6e095e9(11);
    }

    /* renamed from: hasFiletype */
    public boolean m39758x7f8c2370() {
        return m39755x6e095e9(4);
    }

    /* renamed from: hasNetwork */
    public boolean m39759xe7051e34() {
        return m39755x6e095e9(16);
    }

    /* renamed from: hasSns */
    public boolean m39760xb704747e() {
        return m39755x6e095e9(10);
    }

    /* renamed from: hasTransfor */
    public boolean m39761xf7ad75db() {
        return m39755x6e095e9(17);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39762x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f19148xcd09e763;
            if (str != null && this.f19151xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f19151xcb94b041[2]) {
                fVar.e(2, this.f19142x596916e);
            }
            if (this.f19151xcb94b041[3]) {
                fVar.e(3, this.f19139xd0bc10db);
            }
            if (this.f19151xcb94b041[4]) {
                fVar.e(4, this.f19150xd43766b6);
            }
            if (this.f19151xcb94b041[5]) {
                fVar.e(5, this.f19147x61867b11);
            }
            if (this.f19151xcb94b041[6]) {
                fVar.e(6, this.f19145x617e99c4);
            }
            java.lang.String str2 = this.f19146x13a964ca;
            if (str2 != null && this.f19151xcb94b041[7]) {
                fVar.j(7, str2);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e c4456x438c766e = this.f19140x2e06d1;
            if (c4456x438c766e != null && this.f19151xcb94b041[8]) {
                fVar.i(8, c4456x438c766e.mo75928xcd1e8d8());
                this.f19140x2e06d1.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 c4463x1e9f6f31 = this.c2c;
            if (c4463x1e9f6f31 != null && this.f19151xcb94b041[9]) {
                fVar.i(9, c4463x1e9f6f31.mo75928xcd1e8d8());
                this.c2c.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 c4523xa109795 = this.sns;
            if (c4523xa109795 != null && this.f19151xcb94b041[10]) {
                fVar.i(10, c4523xa109795.mo75928xcd1e8d8());
                this.sns.mo75956x3d5d1f78(fVar);
            }
            fVar.g(11, 8, this.f19149x5ceba77);
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result result = this.f19141x592d73a;
            if (result != null && this.f19151xcb94b041[12]) {
                fVar.i(12, result.mo75928xcd1e8d8());
                this.f19141x592d73a.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result result2 = this.f19144x5c24ed9;
            if (result2 != null && this.f19151xcb94b041[13]) {
                fVar.i(13, result2.mo75928xcd1e8d8());
                this.f19144x5c24ed9.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result result3 = this.f19138xabe4cf1a;
            if (result3 != null && this.f19151xcb94b041[14]) {
                fVar.i(14, result3.mo75928xcd1e8d8());
                this.f19138xabe4cf1a.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed c4476x2023ed = this.f19143x2eafcd;
            if (c4476x2023ed != null && this.f19151xcb94b041[15]) {
                fVar.i(15, c4476x2023ed.mo75928xcd1e8d8());
                this.f19143x2eafcd.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb c4511x4c4963bb = this.f19152x6de15a2e;
            if (c4511x4c4963bb != null && this.f19151xcb94b041[16]) {
                fVar.i(16, c4511x4c4963bb.mo75928xcd1e8d8());
                this.f19152x6de15a2e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 c4530xd375c928 = this.f19153x4c58b921;
            if (c4530xd375c928 != null && this.f19151xcb94b041[17]) {
                fVar.i(17, c4530xd375c928.mo75928xcd1e8d8());
                this.f19153x4c58b921.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f19148xcd09e763;
            if (str3 != null && this.f19151xcb94b041[1]) {
                i18 = b36.f.j(1, str3) + 0;
            }
            if (this.f19151xcb94b041[2]) {
                i18 += b36.f.e(2, this.f19142x596916e);
            }
            if (this.f19151xcb94b041[3]) {
                i18 += b36.f.e(3, this.f19139xd0bc10db);
            }
            if (this.f19151xcb94b041[4]) {
                i18 += b36.f.e(4, this.f19150xd43766b6);
            }
            if (this.f19151xcb94b041[5]) {
                i18 += b36.f.e(5, this.f19147x61867b11);
            }
            if (this.f19151xcb94b041[6]) {
                i18 += b36.f.e(6, this.f19145x617e99c4);
            }
            java.lang.String str4 = this.f19146x13a964ca;
            if (str4 != null && this.f19151xcb94b041[7]) {
                i18 += b36.f.j(7, str4);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e c4456x438c766e2 = this.f19140x2e06d1;
            if (c4456x438c766e2 != null && this.f19151xcb94b041[8]) {
                i18 += b36.f.i(8, c4456x438c766e2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 c4463x1e9f6f312 = this.c2c;
            if (c4463x1e9f6f312 != null && this.f19151xcb94b041[9]) {
                i18 += b36.f.i(9, c4463x1e9f6f312.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 c4523xa1097952 = this.sns;
            if (c4523xa1097952 != null && this.f19151xcb94b041[10]) {
                i18 += b36.f.i(10, c4523xa1097952.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(11, 8, this.f19149x5ceba77);
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result result4 = this.f19141x592d73a;
            if (result4 != null && this.f19151xcb94b041[12]) {
                g17 += b36.f.i(12, result4.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result result5 = this.f19144x5c24ed9;
            if (result5 != null && this.f19151xcb94b041[13]) {
                g17 += b36.f.i(13, result5.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result result6 = this.f19138xabe4cf1a;
            if (result6 != null && this.f19151xcb94b041[14]) {
                g17 += b36.f.i(14, result6.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed c4476x2023ed2 = this.f19143x2eafcd;
            if (c4476x2023ed2 != null && this.f19151xcb94b041[15]) {
                g17 += b36.f.i(15, c4476x2023ed2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb c4511x4c4963bb2 = this.f19152x6de15a2e;
            if (c4511x4c4963bb2 != null && this.f19151xcb94b041[16]) {
                g17 += b36.f.i(16, c4511x4c4963bb2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 c4530xd375c9282 = this.f19153x4c58b921;
            return (c4530xd375c9282 == null || !this.f19151xcb94b041[17]) ? g17 : g17 + b36.f.i(17, c4530xd375c9282.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f19149x5ceba77.clear();
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
                this.f19148xcd09e763 = aVar2.k(intValue);
                this.f19151xcb94b041[1] = true;
                return 0;
            case 2:
                this.f19142x596916e = aVar2.g(intValue);
                this.f19151xcb94b041[2] = true;
                return 0;
            case 3:
                this.f19139xd0bc10db = aVar2.g(intValue);
                this.f19151xcb94b041[3] = true;
                return 0;
            case 4:
                this.f19150xd43766b6 = aVar2.g(intValue);
                this.f19151xcb94b041[4] = true;
                return 0;
            case 5:
                this.f19147x61867b11 = aVar2.g(intValue);
                this.f19151xcb94b041[5] = true;
                return 0;
            case 6:
                this.f19145x617e99c4 = aVar2.g(intValue);
                this.f19151xcb94b041[6] = true;
                return 0;
            case 7:
                this.f19146x13a964ca = aVar2.k(intValue);
                this.f19151xcb94b041[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e c4456x438c766e3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e();
                    if (bArr != null && bArr.length > 0) {
                        c4456x438c766e3.mo11468x92b714fd(bArr);
                    }
                    this.f19140x2e06d1 = c4456x438c766e3;
                }
                this.f19151xcb94b041[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 c4463x1e9f6f313 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31();
                    if (bArr2 != null && bArr2.length > 0) {
                        c4463x1e9f6f313.mo11468x92b714fd(bArr2);
                    }
                    this.c2c = c4463x1e9f6f313;
                }
                this.f19151xcb94b041[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 c4523xa1097953 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795();
                    if (bArr3 != null && bArr3.length > 0) {
                        c4523xa1097953.mo11468x92b714fd(bArr3);
                    }
                    this.sns = c4523xa1097953;
                }
                this.f19151xcb94b041[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b610 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610();
                    if (bArr4 != null && bArr4.length > 0) {
                        c4490xd802b610.mo11468x92b714fd(bArr4);
                    }
                    this.f19149x5ceba77.add(c4490xd802b610);
                }
                this.f19151xcb94b041[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result result7 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result();
                    if (bArr5 != null && bArr5.length > 0) {
                        result7.mo11468x92b714fd(bArr5);
                    }
                    this.f19141x592d73a = result7;
                }
                this.f19151xcb94b041[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result result8 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result();
                    if (bArr6 != null && bArr6.length > 0) {
                        result8.mo11468x92b714fd(bArr6);
                    }
                    this.f19144x5c24ed9 = result8;
                }
                this.f19151xcb94b041[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result result9 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result();
                    if (bArr7 != null && bArr7.length > 0) {
                        result9.mo11468x92b714fd(bArr7);
                    }
                    this.f19138xabe4cf1a = result9;
                }
                this.f19151xcb94b041[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed c4476x2023ed3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed();
                    if (bArr8 != null && bArr8.length > 0) {
                        c4476x2023ed3.mo11468x92b714fd(bArr8);
                    }
                    this.f19143x2eafcd = c4476x2023ed3;
                }
                this.f19151xcb94b041[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb c4511x4c4963bb3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb();
                    if (bArr9 != null && bArr9.length > 0) {
                        c4511x4c4963bb3.mo11468x92b714fd(bArr9);
                    }
                    this.f19152x6de15a2e = c4511x4c4963bb3;
                }
                this.f19151xcb94b041[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 c4530xd375c9283 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928();
                    if (bArr10 != null && bArr10.length > 0) {
                        c4530xd375c9283.mo11468x92b714fd(bArr10);
                    }
                    this.f19153x4c58b921 = c4530xd375c9283;
                }
                this.f19151xcb94b041[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAppend */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39764x431261c(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Result result) {
        this.f19138xabe4cf1a = result;
        this.f19151xcb94b041[14] = true;
        return this;
    }

    /* renamed from: setApptype */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39765x81fa9a19(int i17) {
        this.f19139xd0bc10db = i17;
        this.f19151xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setBase */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39766x76483653(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e c4456x438c766e) {
        this.f19140x2e06d1 = c4456x438c766e;
        this.f19151xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setBatch */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39767x52be97f8(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Result result) {
        this.f19141x592d73a = result;
        this.f19151xcb94b041[12] = true;
        return this;
    }

    /* renamed from: setBizid */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39768x52c2522c(int i17) {
        this.f19142x596916e = i17;
        this.f19151xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setC2c */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39769xca025252(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 c4463x1e9f6f31) {
        this.c2c = c4463x1e9f6f31;
        this.f19151xcb94b041[9] = true;
        return this;
    }

    /* renamed from: setCost */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39770x7648df4f(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed c4476x2023ed) {
        this.f19143x2eafcd = c4476x2023ed;
        this.f19151xcb94b041[15] = true;
        return this;
    }

    /* renamed from: setEmbed */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39771x52ee0f97(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Result result) {
        this.f19144x5c24ed9 = result;
        this.f19151xcb94b041[13] = true;
        return this;
    }

    /* renamed from: setErrorCode */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39772x6f5de1d3(int i17) {
        this.f19145x617e99c4 = i17;
        this.f19151xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setErrorMsg */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39773xc9c95edb(java.lang.String str) {
        this.f19146x13a964ca = str;
        this.f19151xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setErrorType */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39774x6f65c320(int i17) {
        this.f19147x61867b11 = i17;
        this.f19151xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setFilekey */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39775x7e4870a1(java.lang.String str) {
        this.f19148xcd09e763 = str;
        this.f19151xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setFiles */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39776x52fa7b35(java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610> linkedList) {
        this.f19149x5ceba77 = linkedList;
        this.f19151xcb94b041[11] = true;
        return this;
    }

    /* renamed from: setFiletype */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39777x4aca0538(int i17) {
        this.f19150xd43766b6 = i17;
        this.f19151xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setNetwork */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39778x1f1fe36c(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb c4511x4c4963bb) {
        this.f19152x6de15a2e = c4511x4c4963bb;
        this.f19151xcb94b041[16] = true;
        return this;
    }

    /* renamed from: setSns */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39779xca0295b6(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 c4523xa109795) {
        this.sns = c4523xa109795;
        this.f19151xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setTransfor */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39780xc2eb57a3(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 c4530xd375c928) {
        this.f19153x4c58b921 = c4530xd375c928;
        this.f19151xcb94b041[17] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e m39763x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4535xa2a5d19e) super.mo11468x92b714fd(bArr);
    }
}

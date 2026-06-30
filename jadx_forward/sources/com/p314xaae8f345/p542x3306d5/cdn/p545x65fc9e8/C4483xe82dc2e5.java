package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.DownloadResult */
/* loaded from: classes8.dex */
public class C4483xe82dc2e5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 f18637xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5();

    /* renamed from: append */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4452xef33d9bc.Result f18638xabe4cf1a;

    /* renamed from: apptype */
    private int f18639xd0bc10db;

    /* renamed from: base */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e f18640x2e06d1;

    /* renamed from: bizid */
    private int f18641x596916e;

    /* renamed from: cost */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed f18642x2eafcd;

    /* renamed from: error_code */
    private int f18643x617e99c4;

    /* renamed from: error_msg */
    private java.lang.String f18644x13a964ca;

    /* renamed from: error_type */
    private int f18645x61867b11;

    /* renamed from: filekey */
    private java.lang.String f18646xcd09e763;

    /* renamed from: filetype */
    private int f18648xd43766b6;

    /* renamed from: friends_video */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 f18649x9dad7d51;

    /* renamed from: network */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb f18651x6de15a2e;

    /* renamed from: preload */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 f18652xed046e09;

    /* renamed from: streaming */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 f18653xed301862;

    /* renamed from: transfor */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 f18654x4c58b921;

    /* renamed from: video */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce f18655x6b0147b;

    /* renamed from: files */
    private java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610> f18647x5ceba77 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f18650xcb94b041 = new boolean[18];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38705xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38706x7c90cfc0() {
        return f18637xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38707x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5();
    }

    /* renamed from: addAllElementFiles */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38708xba65d63b(java.util.Collection<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610> collection) {
        this.f18647x5ceba77.addAll(collection);
        this.f18650xcb94b041[9] = true;
        return this;
    }

    /* renamed from: addElementFiles */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38709x58308c1c(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b610) {
        this.f18647x5ceba77.add(c4490xd802b610);
        this.f18650xcb94b041[9] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38710x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 c4483xe82dc2e5 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5) fVar;
        return n51.f.a(this.f18646xcd09e763, c4483xe82dc2e5.f18646xcd09e763) && n51.f.a(java.lang.Integer.valueOf(this.f18641x596916e), java.lang.Integer.valueOf(c4483xe82dc2e5.f18641x596916e)) && n51.f.a(java.lang.Integer.valueOf(this.f18639xd0bc10db), java.lang.Integer.valueOf(c4483xe82dc2e5.f18639xd0bc10db)) && n51.f.a(java.lang.Integer.valueOf(this.f18648xd43766b6), java.lang.Integer.valueOf(c4483xe82dc2e5.f18648xd43766b6)) && n51.f.a(java.lang.Integer.valueOf(this.f18645x61867b11), java.lang.Integer.valueOf(c4483xe82dc2e5.f18645x61867b11)) && n51.f.a(java.lang.Integer.valueOf(this.f18643x617e99c4), java.lang.Integer.valueOf(c4483xe82dc2e5.f18643x617e99c4)) && n51.f.a(this.f18644x13a964ca, c4483xe82dc2e5.f18644x13a964ca) && n51.f.a(this.f18640x2e06d1, c4483xe82dc2e5.f18640x2e06d1) && n51.f.a(this.f18647x5ceba77, c4483xe82dc2e5.f18647x5ceba77) && n51.f.a(this.f18652xed046e09, c4483xe82dc2e5.f18652xed046e09) && n51.f.a(this.f18655x6b0147b, c4483xe82dc2e5.f18655x6b0147b) && n51.f.a(this.f18653xed301862, c4483xe82dc2e5.f18653xed301862) && n51.f.a(this.f18642x2eafcd, c4483xe82dc2e5.f18642x2eafcd) && n51.f.a(this.f18651x6de15a2e, c4483xe82dc2e5.f18651x6de15a2e) && n51.f.a(this.f18654x4c58b921, c4483xe82dc2e5.f18654x4c58b921) && n51.f.a(this.f18649x9dad7d51, c4483xe82dc2e5.f18649x9dad7d51) && n51.f.a(this.f18638xabe4cf1a, c4483xe82dc2e5.f18638xabe4cf1a);
    }

    /* renamed from: getAppend */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4452xef33d9bc.Result m38711x10fbf210() {
        return this.f18650xcb94b041[17] ? this.f18638xabe4cf1a : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4452xef33d9bc.Result.m38009xaf65a0fc();
    }

    /* renamed from: getApptype */
    public int m38712xe894ca5() {
        return this.f18639xd0bc10db;
    }

    /* renamed from: getBase */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e m38713xfb7d6f47() {
        return this.f18650xcb94b041[8] ? this.f18640x2e06d1 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e.m38115xaf65a0fc();
    }

    /* renamed from: getBizid */
    public int m38714x743437b8() {
        return this.f18641x596916e;
    }

    /* renamed from: getCost */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m38715xfb7e1843() {
        return this.f18650xcb94b041[13] ? this.f18642x2eafcd : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed.m38534xaf65a0fc();
    }

    /* renamed from: getErrorCode */
    public int m38716x130a215f() {
        return this.f18643x617e99c4;
    }

    /* renamed from: getErrorMsg */
    public java.lang.String m38717xcf10fdcf() {
        return this.f18650xcb94b041[7] ? this.f18644x13a964ca : "";
    }

    /* renamed from: getErrorType */
    public int m38718x131202ac() {
        return this.f18645x61867b11;
    }

    /* renamed from: getFilekey */
    public java.lang.String m38719xad7232d() {
        return this.f18650xcb94b041[1] ? this.f18646xcd09e763 : "";
    }

    /* renamed from: getFiles */
    public java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610> m38720x746c60c1() {
        return this.f18647x5ceba77;
    }

    /* renamed from: getFiletype */
    public int m38721x5011a42c() {
        return this.f18648xd43766b6;
    }

    /* renamed from: getFriendsVideo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 m38722x868c225c() {
        return this.f18650xcb94b041[16] ? this.f18649x9dad7d51 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3.m38987xaf65a0fc();
    }

    /* renamed from: getNetwork */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb m38723xabae95f8() {
        return this.f18650xcb94b041[14] ? this.f18651x6de15a2e : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb.m39251xaf65a0fc();
    }

    /* renamed from: getPreload */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 m38724x2ad1a9d3() {
        return this.f18650xcb94b041[10] ? this.f18652xed046e09 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380.m39357xaf65a0fc();
    }

    /* renamed from: getStreaming */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m38725xec9d89ac() {
        return this.f18650xcb94b041[12] ? this.f18653xed301862 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07.m39504xaf65a0fc();
    }

    /* renamed from: getTransfor */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m38726xc832f697() {
        return this.f18650xcb94b041[15] ? this.f18654x4c58b921 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928.m39612xaf65a0fc();
    }

    /* renamed from: getVideo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce m38727x754dbac5() {
        return this.f18650xcb94b041[11] ? this.f18655x6b0147b : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce.m39874xaf65a0fc();
    }

    /* renamed from: hasAppend */
    public boolean m38728xd0d57254() {
        return m38736x6e095e9(17);
    }

    /* renamed from: hasApptype */
    public boolean m38729x49dfd4e1() {
        return m38736x6e095e9(3);
    }

    /* renamed from: hasBase */
    public boolean m38730x2982308b() {
        return m38736x6e095e9(8);
    }

    /* renamed from: hasBizid */
    public boolean m38731x6c79ef4() {
        return m38736x6e095e9(2);
    }

    /* renamed from: hasCost */
    public boolean m38732x2982d987() {
        return m38736x6e095e9(13);
    }

    /* renamed from: hasErrorCode */
    public boolean m38733xd2df8a9b() {
        return m38736x6e095e9(6);
    }

    /* renamed from: hasErrorMsg */
    public boolean m38734xfe8b7d13() {
        return m38736x6e095e9(7);
    }

    /* renamed from: hasErrorType */
    public boolean m38735xd2e76be8() {
        return m38736x6e095e9(5);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38736x6e095e9(int i17) {
        return this.f18650xcb94b041[i17];
    }

    /* renamed from: hasFilekey */
    public boolean m38737x462dab69() {
        return m38736x6e095e9(1);
    }

    /* renamed from: hasFiles */
    public boolean m38738x6ffc7fd() {
        return m38736x6e095e9(9);
    }

    /* renamed from: hasFiletype */
    public boolean m38739x7f8c2370() {
        return m38736x6e095e9(4);
    }

    /* renamed from: hasFriendsVideo */
    public boolean m38740x6a6d5fa0() {
        return m38736x6e095e9(16);
    }

    /* renamed from: hasNetwork */
    public boolean m38741xe7051e34() {
        return m38736x6e095e9(14);
    }

    /* renamed from: hasPreload */
    public boolean m38742x6628320f() {
        return m38736x6e095e9(10);
    }

    /* renamed from: hasStreaming */
    public boolean m38743xac72f2e8() {
        return m38736x6e095e9(12);
    }

    /* renamed from: hasTransfor */
    public boolean m38744xf7ad75db() {
        return m38736x6e095e9(15);
    }

    /* renamed from: hasVideo */
    public boolean m38745x7e12201() {
        return m38736x6e095e9(11);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38746x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f18646xcd09e763;
            if (str != null && this.f18650xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f18650xcb94b041[2]) {
                fVar.e(2, this.f18641x596916e);
            }
            if (this.f18650xcb94b041[3]) {
                fVar.e(3, this.f18639xd0bc10db);
            }
            if (this.f18650xcb94b041[4]) {
                fVar.e(4, this.f18648xd43766b6);
            }
            if (this.f18650xcb94b041[5]) {
                fVar.e(5, this.f18645x61867b11);
            }
            if (this.f18650xcb94b041[6]) {
                fVar.e(6, this.f18643x617e99c4);
            }
            java.lang.String str2 = this.f18644x13a964ca;
            if (str2 != null && this.f18650xcb94b041[7]) {
                fVar.j(7, str2);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e c4456x438c766e = this.f18640x2e06d1;
            if (c4456x438c766e != null && this.f18650xcb94b041[8]) {
                fVar.i(8, c4456x438c766e.mo75928xcd1e8d8());
                this.f18640x2e06d1.mo75956x3d5d1f78(fVar);
            }
            fVar.g(9, 8, this.f18647x5ceba77);
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 c4516xa3bc5380 = this.f18652xed046e09;
            if (c4516xa3bc5380 != null && this.f18650xcb94b041[10]) {
                fVar.i(10, c4516xa3bc5380.mo75928xcd1e8d8());
                this.f18652xed046e09.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce c4540xee9470ce = this.f18655x6b0147b;
            if (c4540xee9470ce != null && this.f18650xcb94b041[11]) {
                fVar.i(11, c4540xee9470ce.mo75928xcd1e8d8());
                this.f18655x6b0147b.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 c4526xdbc37b07 = this.f18653xed301862;
            if (c4526xdbc37b07 != null && this.f18650xcb94b041[12]) {
                fVar.i(12, c4526xdbc37b07.mo75928xcd1e8d8());
                this.f18653xed301862.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed c4476x2023ed = this.f18642x2eafcd;
            if (c4476x2023ed != null && this.f18650xcb94b041[13]) {
                fVar.i(13, c4476x2023ed.mo75928xcd1e8d8());
                this.f18642x2eafcd.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb c4511x4c4963bb = this.f18651x6de15a2e;
            if (c4511x4c4963bb != null && this.f18650xcb94b041[14]) {
                fVar.i(14, c4511x4c4963bb.mo75928xcd1e8d8());
                this.f18651x6de15a2e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 c4530xd375c928 = this.f18654x4c58b921;
            if (c4530xd375c928 != null && this.f18650xcb94b041[15]) {
                fVar.i(15, c4530xd375c928.mo75928xcd1e8d8());
                this.f18654x4c58b921.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 c4495xc420cac3 = this.f18649x9dad7d51;
            if (c4495xc420cac3 != null && this.f18650xcb94b041[16]) {
                fVar.i(16, c4495xc420cac3.mo75928xcd1e8d8());
                this.f18649x9dad7d51.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4452xef33d9bc.Result result = this.f18638xabe4cf1a;
            if (result != null && this.f18650xcb94b041[17]) {
                fVar.i(17, result.mo75928xcd1e8d8());
                this.f18638xabe4cf1a.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f18646xcd09e763;
            if (str3 != null && this.f18650xcb94b041[1]) {
                i18 = b36.f.j(1, str3) + 0;
            }
            if (this.f18650xcb94b041[2]) {
                i18 += b36.f.e(2, this.f18641x596916e);
            }
            if (this.f18650xcb94b041[3]) {
                i18 += b36.f.e(3, this.f18639xd0bc10db);
            }
            if (this.f18650xcb94b041[4]) {
                i18 += b36.f.e(4, this.f18648xd43766b6);
            }
            if (this.f18650xcb94b041[5]) {
                i18 += b36.f.e(5, this.f18645x61867b11);
            }
            if (this.f18650xcb94b041[6]) {
                i18 += b36.f.e(6, this.f18643x617e99c4);
            }
            java.lang.String str4 = this.f18644x13a964ca;
            if (str4 != null && this.f18650xcb94b041[7]) {
                i18 += b36.f.j(7, str4);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e c4456x438c766e2 = this.f18640x2e06d1;
            if (c4456x438c766e2 != null && this.f18650xcb94b041[8]) {
                i18 += b36.f.i(8, c4456x438c766e2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(9, 8, this.f18647x5ceba77);
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 c4516xa3bc53802 = this.f18652xed046e09;
            if (c4516xa3bc53802 != null && this.f18650xcb94b041[10]) {
                g17 += b36.f.i(10, c4516xa3bc53802.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce c4540xee9470ce2 = this.f18655x6b0147b;
            if (c4540xee9470ce2 != null && this.f18650xcb94b041[11]) {
                g17 += b36.f.i(11, c4540xee9470ce2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 c4526xdbc37b072 = this.f18653xed301862;
            if (c4526xdbc37b072 != null && this.f18650xcb94b041[12]) {
                g17 += b36.f.i(12, c4526xdbc37b072.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed c4476x2023ed2 = this.f18642x2eafcd;
            if (c4476x2023ed2 != null && this.f18650xcb94b041[13]) {
                g17 += b36.f.i(13, c4476x2023ed2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb c4511x4c4963bb2 = this.f18651x6de15a2e;
            if (c4511x4c4963bb2 != null && this.f18650xcb94b041[14]) {
                g17 += b36.f.i(14, c4511x4c4963bb2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 c4530xd375c9282 = this.f18654x4c58b921;
            if (c4530xd375c9282 != null && this.f18650xcb94b041[15]) {
                g17 += b36.f.i(15, c4530xd375c9282.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 c4495xc420cac32 = this.f18649x9dad7d51;
            if (c4495xc420cac32 != null && this.f18650xcb94b041[16]) {
                g17 += b36.f.i(16, c4495xc420cac32.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4452xef33d9bc.Result result2 = this.f18638xabe4cf1a;
            return (result2 == null || !this.f18650xcb94b041[17]) ? g17 : g17 + b36.f.i(17, result2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f18647x5ceba77.clear();
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
                this.f18646xcd09e763 = aVar2.k(intValue);
                this.f18650xcb94b041[1] = true;
                return 0;
            case 2:
                this.f18641x596916e = aVar2.g(intValue);
                this.f18650xcb94b041[2] = true;
                return 0;
            case 3:
                this.f18639xd0bc10db = aVar2.g(intValue);
                this.f18650xcb94b041[3] = true;
                return 0;
            case 4:
                this.f18648xd43766b6 = aVar2.g(intValue);
                this.f18650xcb94b041[4] = true;
                return 0;
            case 5:
                this.f18645x61867b11 = aVar2.g(intValue);
                this.f18650xcb94b041[5] = true;
                return 0;
            case 6:
                this.f18643x617e99c4 = aVar2.g(intValue);
                this.f18650xcb94b041[6] = true;
                return 0;
            case 7:
                this.f18644x13a964ca = aVar2.k(intValue);
                this.f18650xcb94b041[7] = true;
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
                    this.f18640x2e06d1 = c4456x438c766e3;
                }
                this.f18650xcb94b041[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b610 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610();
                    if (bArr2 != null && bArr2.length > 0) {
                        c4490xd802b610.mo11468x92b714fd(bArr2);
                    }
                    this.f18647x5ceba77.add(c4490xd802b610);
                }
                this.f18650xcb94b041[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 c4516xa3bc53803 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380();
                    if (bArr3 != null && bArr3.length > 0) {
                        c4516xa3bc53803.mo11468x92b714fd(bArr3);
                    }
                    this.f18652xed046e09 = c4516xa3bc53803;
                }
                this.f18650xcb94b041[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce c4540xee9470ce3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce();
                    if (bArr4 != null && bArr4.length > 0) {
                        c4540xee9470ce3.mo11468x92b714fd(bArr4);
                    }
                    this.f18655x6b0147b = c4540xee9470ce3;
                }
                this.f18650xcb94b041[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 c4526xdbc37b073 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07();
                    if (bArr5 != null && bArr5.length > 0) {
                        c4526xdbc37b073.mo11468x92b714fd(bArr5);
                    }
                    this.f18653xed301862 = c4526xdbc37b073;
                }
                this.f18650xcb94b041[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed c4476x2023ed3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed();
                    if (bArr6 != null && bArr6.length > 0) {
                        c4476x2023ed3.mo11468x92b714fd(bArr6);
                    }
                    this.f18642x2eafcd = c4476x2023ed3;
                }
                this.f18650xcb94b041[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb c4511x4c4963bb3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb();
                    if (bArr7 != null && bArr7.length > 0) {
                        c4511x4c4963bb3.mo11468x92b714fd(bArr7);
                    }
                    this.f18651x6de15a2e = c4511x4c4963bb3;
                }
                this.f18650xcb94b041[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 c4530xd375c9283 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928();
                    if (bArr8 != null && bArr8.length > 0) {
                        c4530xd375c9283.mo11468x92b714fd(bArr8);
                    }
                    this.f18654x4c58b921 = c4530xd375c9283;
                }
                this.f18650xcb94b041[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 c4495xc420cac33 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3();
                    if (bArr9 != null && bArr9.length > 0) {
                        c4495xc420cac33.mo11468x92b714fd(bArr9);
                    }
                    this.f18649x9dad7d51 = c4495xc420cac33;
                }
                this.f18650xcb94b041[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4452xef33d9bc.Result result3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4452xef33d9bc.Result();
                    if (bArr10 != null && bArr10.length > 0) {
                        result3.mo11468x92b714fd(bArr10);
                    }
                    this.f18638xabe4cf1a = result3;
                }
                this.f18650xcb94b041[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAppend */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38748x431261c(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4452xef33d9bc.Result result) {
        this.f18638xabe4cf1a = result;
        this.f18650xcb94b041[17] = true;
        return this;
    }

    /* renamed from: setApptype */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38749x81fa9a19(int i17) {
        this.f18639xd0bc10db = i17;
        this.f18650xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setBase */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38750x76483653(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e c4456x438c766e) {
        this.f18640x2e06d1 = c4456x438c766e;
        this.f18650xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setBizid */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38751x52c2522c(int i17) {
        this.f18641x596916e = i17;
        this.f18650xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setCost */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38752x7648df4f(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed c4476x2023ed) {
        this.f18642x2eafcd = c4476x2023ed;
        this.f18650xcb94b041[13] = true;
        return this;
    }

    /* renamed from: setErrorCode */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38753x6f5de1d3(int i17) {
        this.f18643x617e99c4 = i17;
        this.f18650xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setErrorMsg */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38754xc9c95edb(java.lang.String str) {
        this.f18644x13a964ca = str;
        this.f18650xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setErrorType */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38755x6f65c320(int i17) {
        this.f18645x61867b11 = i17;
        this.f18650xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setFilekey */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38756x7e4870a1(java.lang.String str) {
        this.f18646xcd09e763 = str;
        this.f18650xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setFiles */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38757x52fa7b35(java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610> linkedList) {
        this.f18647x5ceba77 = linkedList;
        this.f18650xcb94b041[9] = true;
        return this;
    }

    /* renamed from: setFiletype */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38758x4aca0538(int i17) {
        this.f18648xd43766b6 = i17;
        this.f18650xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setFriendsVideo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38759xbcd51d68(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4495xc420cac3 c4495xc420cac3) {
        this.f18649x9dad7d51 = c4495xc420cac3;
        this.f18650xcb94b041[16] = true;
        return this;
    }

    /* renamed from: setNetwork */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38760x1f1fe36c(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4511x4c4963bb c4511x4c4963bb) {
        this.f18651x6de15a2e = c4511x4c4963bb;
        this.f18650xcb94b041[14] = true;
        return this;
    }

    /* renamed from: setPreload */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38761x9e42f747(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 c4516xa3bc5380) {
        this.f18652xed046e09 = c4516xa3bc5380;
        this.f18650xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setStreaming */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38762x48f14a20(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 c4526xdbc37b07) {
        this.f18653xed301862 = c4526xdbc37b07;
        this.f18650xcb94b041[12] = true;
        return this;
    }

    /* renamed from: setTransfor */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38763xc2eb57a3(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 c4530xd375c928) {
        this.f18654x4c58b921 = c4530xd375c928;
        this.f18650xcb94b041[15] = true;
        return this;
    }

    /* renamed from: setVideo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38764x53dbd539(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4540xee9470ce c4540xee9470ce) {
        this.f18655x6b0147b = c4540xee9470ce;
        this.f18650xcb94b041[11] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 m38747x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4483xe82dc2e5) super.mo11468x92b714fd(bArr);
    }
}

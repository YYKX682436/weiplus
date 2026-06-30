package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.UploadRequest */
/* loaded from: classes8.dex */
public class C4534xb1f8192e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e f19122xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e();

    /* renamed from: append_task */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request f19123x8f937f8a;

    /* renamed from: apptype */
    private int f19124xd0bc10db;

    /* renamed from: base */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 f19125x2e06d1;

    /* renamed from: batch_task */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request f19126xf0058b6a;

    /* renamed from: bizid */
    private int f19127x596916e;

    /* renamed from: c2c_opt */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 f19128xcffb2e08;

    /* renamed from: embed_task */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request f19129xd53aff2b;

    /* renamed from: filekey */
    private java.lang.String f19130xcd09e763;

    /* renamed from: from */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4532x684e8d6b f19131x3017aa;

    /* renamed from: ftn_opt */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd f19132xdfe8bb54;

    /* renamed from: hasSetFields */
    private final boolean[] f19133xcb94b041 = new boolean[15];

    /* renamed from: sns_opt */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5 f19134x85a31f6c;

    /* renamed from: upload_opt */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4457xe45141ec f19135xf1880375;
    private java.lang.String uri;

    /* renamed from: video_opt */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 f19136x4f783cef;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39671xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39672x7c90cfc0() {
        return f19122xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39673x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39674x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e c4534xb1f8192e = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e) fVar;
        return n51.f.a(this.f19130xcd09e763, c4534xb1f8192e.f19130xcd09e763) && n51.f.a(java.lang.Integer.valueOf(this.f19127x596916e), java.lang.Integer.valueOf(c4534xb1f8192e.f19127x596916e)) && n51.f.a(java.lang.Integer.valueOf(this.f19124xd0bc10db), java.lang.Integer.valueOf(c4534xb1f8192e.f19124xd0bc10db)) && n51.f.a(this.f19125x2e06d1, c4534xb1f8192e.f19125x2e06d1) && n51.f.a(this.f19131x3017aa, c4534xb1f8192e.f19131x3017aa) && n51.f.a(this.f19128xcffb2e08, c4534xb1f8192e.f19128xcffb2e08) && n51.f.a(this.f19134x85a31f6c, c4534xb1f8192e.f19134x85a31f6c) && n51.f.a(this.f19132xdfe8bb54, c4534xb1f8192e.f19132xdfe8bb54) && n51.f.a(this.f19136x4f783cef, c4534xb1f8192e.f19136x4f783cef) && n51.f.a(this.f19135xf1880375, c4534xb1f8192e.f19135xf1880375) && n51.f.a(this.f19129xd53aff2b, c4534xb1f8192e.f19129xd53aff2b) && n51.f.a(this.f19126xf0058b6a, c4534xb1f8192e.f19126xf0058b6a) && n51.f.a(this.f19123x8f937f8a, c4534xb1f8192e.f19123x8f937f8a) && n51.f.a(this.uri, c4534xb1f8192e.uri);
    }

    /* renamed from: getAppendTask */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request m39675x6ebc13b5() {
        return this.f19133xcb94b041[13] ? this.f19123x8f937f8a : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request.m38030xaf65a0fc();
    }

    /* renamed from: getApptype */
    public int m39676xe894ca5() {
        return this.f19124xd0bc10db;
    }

    /* renamed from: getBase */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m39677xfb7d6f47() {
        return this.f19133xcb94b041[4] ? this.f19125x2e06d1 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1.m38058xaf65a0fc();
    }

    /* renamed from: getBatchTask */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request m39678xc515c529() {
        return this.f19133xcb94b041[12] ? this.f19126xf0058b6a : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request.m38160xaf65a0fc();
    }

    /* renamed from: getBizid */
    public int m39679x743437b8() {
        return this.f19127x596916e;
    }

    /* renamed from: getC2cOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 m39680x10f5b6f5() {
        return this.f19133xcb94b041[6] ? this.f19128xcffb2e08 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9.m38263xaf65a0fc();
    }

    /* renamed from: getEmbedTask */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request m39681xab725548() {
        return this.f19133xcb94b041[11] ? this.f19129xd53aff2b : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request.m38794xaf65a0fc();
    }

    /* renamed from: getFilekey */
    public java.lang.String m39682xad7232d() {
        return this.f19133xcb94b041[1] ? this.f19130xcd09e763 : "";
    }

    /* renamed from: getFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4532x684e8d6b m39683xfb7f8020() {
        return this.f19133xcb94b041[5] ? this.f19131x3017aa : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4532x684e8d6b.UPLOAD_FROM_UNSPECIFIED;
    }

    /* renamed from: getFtnOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd m39684x19bb5029() {
        return this.f19133xcb94b041[8] ? this.f19132xdfe8bb54 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd.m39010xaf65a0fc();
    }

    /* renamed from: getSnsOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5 m39685x2f980911() {
        return this.f19133xcb94b041[7] ? this.f19134x85a31f6c : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5.m39479xaf65a0fc();
    }

    /* renamed from: getUploadOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4457xe45141ec m39686x49484e3c() {
        return this.f19133xcb94b041[10] ? this.f19135xf1880375 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4457xe45141ec.m38141xaf65a0fc();
    }

    /* renamed from: getUri */
    public java.lang.String m39687xb5887636() {
        return this.f19133xcb94b041[14] ? this.uri : "";
    }

    /* renamed from: getVideoOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 m39688xc07ac9ae() {
        return this.f19133xcb94b041[9] ? this.f19136x4f783cef : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2.m39930xaf65a0fc();
    }

    /* renamed from: hasAppendTask */
    public boolean m39689xa993d1f9() {
        return m39696x6e095e9(13);
    }

    /* renamed from: hasApptype */
    public boolean m39690x49dfd4e1() {
        return m39696x6e095e9(3);
    }

    /* renamed from: hasBase */
    public boolean m39691x2982308b() {
        return m39696x6e095e9(4);
    }

    /* renamed from: hasBatchTask */
    public boolean m39692x84eb2e65() {
        return m39696x6e095e9(12);
    }

    /* renamed from: hasBizid */
    public boolean m39693x6c79ef4() {
        return m39696x6e095e9(2);
    }

    /* renamed from: hasC2cOpt */
    public boolean m39694xd0cf3739() {
        return m39696x6e095e9(6);
    }

    /* renamed from: hasEmbedTask */
    public boolean m39695x6b47be84() {
        return m39696x6e095e9(11);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39696x6e095e9(int i17) {
        return this.f19133xcb94b041[i17];
    }

    /* renamed from: hasFilekey */
    public boolean m39697x462dab69() {
        return m39696x6e095e9(1);
    }

    /* renamed from: hasFrom */
    public boolean m39698x29844164() {
        return m39696x6e095e9(5);
    }

    /* renamed from: hasFtnOpt */
    public boolean m39699xd994d06d() {
        return m39696x6e095e9(8);
    }

    /* renamed from: hasSnsOpt */
    public boolean m39700xef718955() {
        return m39696x6e095e9(7);
    }

    /* renamed from: hasUploadOpt */
    public boolean m39701x91db778() {
        return m39696x6e095e9(10);
    }

    /* renamed from: hasUri */
    public boolean m39702xb7047c72() {
        return m39696x6e095e9(14);
    }

    /* renamed from: hasVideoOpt */
    public boolean m39703xeff548f2() {
        return m39696x6e095e9(9);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39704x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f19130xcd09e763;
            if (str != null && this.f19133xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f19133xcb94b041[2]) {
                fVar.e(2, this.f19127x596916e);
            }
            if (this.f19133xcb94b041[3]) {
                fVar.e(3, this.f19124xd0bc10db);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 c4454x1f7af1 = this.f19125x2e06d1;
            if (c4454x1f7af1 != null && this.f19133xcb94b041[4]) {
                fVar.i(4, c4454x1f7af1.mo75928xcd1e8d8());
                this.f19125x2e06d1.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4532x684e8d6b enumC4532x684e8d6b = this.f19131x3017aa;
            if (enumC4532x684e8d6b != null && this.f19133xcb94b041[5]) {
                fVar.e(5, enumC4532x684e8d6b.f19113x6ac9171);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 c4464x14fc77c9 = this.f19128xcffb2e08;
            if (c4464x14fc77c9 != null && this.f19133xcb94b041[6]) {
                fVar.i(6, c4464x14fc77c9.mo75928xcd1e8d8());
                this.f19128xcffb2e08.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5 c4524x5b63d6e5 = this.f19134x85a31f6c;
            if (c4524x5b63d6e5 != null && this.f19133xcb94b041[7]) {
                fVar.i(7, c4524x5b63d6e5.mo75928xcd1e8d8());
                this.f19134x85a31f6c.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd c4496x98cb1ffd = this.f19132xdfe8bb54;
            if (c4496x98cb1ffd != null && this.f19133xcb94b041[8]) {
                fVar.i(8, c4496x98cb1ffd.mo75928xcd1e8d8());
                this.f19132xdfe8bb54.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 c4543xc493b4c2 = this.f19136x4f783cef;
            if (c4543xc493b4c2 != null && this.f19133xcb94b041[9]) {
                fVar.i(9, c4543xc493b4c2.mo75928xcd1e8d8());
                this.f19136x4f783cef.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4457xe45141ec c4457xe45141ec = this.f19135xf1880375;
            if (c4457xe45141ec != null && this.f19133xcb94b041[10]) {
                fVar.i(10, c4457xe45141ec.mo75928xcd1e8d8());
                this.f19135xf1880375.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request request = this.f19129xd53aff2b;
            if (request != null && this.f19133xcb94b041[11]) {
                fVar.i(11, request.mo75928xcd1e8d8());
                this.f19129xd53aff2b.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request request2 = this.f19126xf0058b6a;
            if (request2 != null && this.f19133xcb94b041[12]) {
                fVar.i(12, request2.mo75928xcd1e8d8());
                this.f19126xf0058b6a.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request request3 = this.f19123x8f937f8a;
            if (request3 != null && this.f19133xcb94b041[13]) {
                fVar.i(13, request3.mo75928xcd1e8d8());
                this.f19123x8f937f8a.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.uri;
            if (str2 == null || !this.f19133xcb94b041[14]) {
                return 0;
            }
            fVar.j(14, str2);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f19130xcd09e763;
            int j17 = (str3 == null || !this.f19133xcb94b041[1]) ? 0 : b36.f.j(1, str3) + 0;
            if (this.f19133xcb94b041[2]) {
                j17 += b36.f.e(2, this.f19127x596916e);
            }
            if (this.f19133xcb94b041[3]) {
                j17 += b36.f.e(3, this.f19124xd0bc10db);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 c4454x1f7af12 = this.f19125x2e06d1;
            if (c4454x1f7af12 != null && this.f19133xcb94b041[4]) {
                j17 += b36.f.i(4, c4454x1f7af12.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4532x684e8d6b enumC4532x684e8d6b2 = this.f19131x3017aa;
            if (enumC4532x684e8d6b2 != null && this.f19133xcb94b041[5]) {
                j17 += b36.f.e(5, enumC4532x684e8d6b2.f19113x6ac9171);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 c4464x14fc77c92 = this.f19128xcffb2e08;
            if (c4464x14fc77c92 != null && this.f19133xcb94b041[6]) {
                j17 += b36.f.i(6, c4464x14fc77c92.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5 c4524x5b63d6e52 = this.f19134x85a31f6c;
            if (c4524x5b63d6e52 != null && this.f19133xcb94b041[7]) {
                j17 += b36.f.i(7, c4524x5b63d6e52.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd c4496x98cb1ffd2 = this.f19132xdfe8bb54;
            if (c4496x98cb1ffd2 != null && this.f19133xcb94b041[8]) {
                j17 += b36.f.i(8, c4496x98cb1ffd2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 c4543xc493b4c22 = this.f19136x4f783cef;
            if (c4543xc493b4c22 != null && this.f19133xcb94b041[9]) {
                j17 += b36.f.i(9, c4543xc493b4c22.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4457xe45141ec c4457xe45141ec2 = this.f19135xf1880375;
            if (c4457xe45141ec2 != null && this.f19133xcb94b041[10]) {
                j17 += b36.f.i(10, c4457xe45141ec2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request request4 = this.f19129xd53aff2b;
            if (request4 != null && this.f19133xcb94b041[11]) {
                j17 += b36.f.i(11, request4.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request request5 = this.f19126xf0058b6a;
            if (request5 != null && this.f19133xcb94b041[12]) {
                j17 += b36.f.i(12, request5.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request request6 = this.f19123x8f937f8a;
            if (request6 != null && this.f19133xcb94b041[13]) {
                j17 += b36.f.i(13, request6.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.uri;
            return (str4 == null || !this.f19133xcb94b041[14]) ? j17 : j17 + b36.f.j(14, str4);
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
                this.f19130xcd09e763 = aVar2.k(intValue);
                this.f19133xcb94b041[1] = true;
                return 0;
            case 2:
                this.f19127x596916e = aVar2.g(intValue);
                this.f19133xcb94b041[2] = true;
                return 0;
            case 3:
                this.f19124xd0bc10db = aVar2.g(intValue);
                this.f19133xcb94b041[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 c4454x1f7af13 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1();
                    if (bArr != null && bArr.length > 0) {
                        c4454x1f7af13.mo11468x92b714fd(bArr);
                    }
                    this.f19125x2e06d1 = c4454x1f7af13;
                }
                this.f19133xcb94b041[4] = true;
                return 0;
            case 5:
                this.f19131x3017aa = com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4532x684e8d6b.m39660x382ad972(aVar2.g(intValue));
                this.f19133xcb94b041[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 c4464x14fc77c93 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9();
                    if (bArr2 != null && bArr2.length > 0) {
                        c4464x14fc77c93.mo11468x92b714fd(bArr2);
                    }
                    this.f19128xcffb2e08 = c4464x14fc77c93;
                }
                this.f19133xcb94b041[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5 c4524x5b63d6e53 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5();
                    if (bArr3 != null && bArr3.length > 0) {
                        c4524x5b63d6e53.mo11468x92b714fd(bArr3);
                    }
                    this.f19134x85a31f6c = c4524x5b63d6e53;
                }
                this.f19133xcb94b041[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd c4496x98cb1ffd3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd();
                    if (bArr4 != null && bArr4.length > 0) {
                        c4496x98cb1ffd3.mo11468x92b714fd(bArr4);
                    }
                    this.f19132xdfe8bb54 = c4496x98cb1ffd3;
                }
                this.f19133xcb94b041[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j29.get(i29);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 c4543xc493b4c23 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2();
                    if (bArr5 != null && bArr5.length > 0) {
                        c4543xc493b4c23.mo11468x92b714fd(bArr5);
                    }
                    this.f19136x4f783cef = c4543xc493b4c23;
                }
                this.f19133xcb94b041[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j37.get(i37);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4457xe45141ec c4457xe45141ec3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4457xe45141ec();
                    if (bArr6 != null && bArr6.length > 0) {
                        c4457xe45141ec3.mo11468x92b714fd(bArr6);
                    }
                    this.f19135xf1880375 = c4457xe45141ec3;
                }
                this.f19133xcb94b041[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size7 = j38.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j38.get(i38);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request request7 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request();
                    if (bArr7 != null && bArr7.length > 0) {
                        request7.mo11468x92b714fd(bArr7);
                    }
                    this.f19129xd53aff2b = request7;
                }
                this.f19133xcb94b041[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size8 = j39.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j39.get(i39);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request request8 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request();
                    if (bArr8 != null && bArr8.length > 0) {
                        request8.mo11468x92b714fd(bArr8);
                    }
                    this.f19126xf0058b6a = request8;
                }
                this.f19133xcb94b041[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size9 = j47.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j47.get(i47);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request request9 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request();
                    if (bArr9 != null && bArr9.length > 0) {
                        request9.mo11468x92b714fd(bArr9);
                    }
                    this.f19123x8f937f8a = request9;
                }
                this.f19133xcb94b041[13] = true;
                return 0;
            case 14:
                this.uri = aVar2.k(intValue);
                this.f19133xcb94b041[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAppendTask */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39706x9ce061c1(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4453xef33fd75.Request request) {
        this.f19123x8f937f8a = request;
        this.f19133xcb94b041[13] = true;
        return this;
    }

    /* renamed from: setApptype */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39707x81fa9a19(int i17) {
        this.f19124xd0bc10db = i17;
        this.f19133xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setBase */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39708x76483653(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 c4454x1f7af1) {
        this.f19125x2e06d1 = c4454x1f7af1;
        this.f19133xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setBatchTask */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39709x2169859d(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4458x62d1a5bb.Request request) {
        this.f19126xf0058b6a = request;
        this.f19133xcb94b041[12] = true;
        return this;
    }

    /* renamed from: setBizid */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39710x52c2522c(int i17) {
        this.f19127x596916e = i17;
        this.f19133xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setC2cOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39711x42aeb01(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4464x14fc77c9 c4464x14fc77c9) {
        this.f19128xcffb2e08 = c4464x14fc77c9;
        this.f19133xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setEmbedTask */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39712x7c615bc(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4485x244aaa1a.Request request) {
        this.f19129xd53aff2b = request;
        this.f19133xcb94b041[11] = true;
        return this;
    }

    /* renamed from: setFilekey */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39713x7e4870a1(java.lang.String str) {
        this.f19130xcd09e763 = str;
        this.f19133xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39714x764a472c(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4532x684e8d6b enumC4532x684e8d6b) {
        this.f19131x3017aa = enumC4532x684e8d6b;
        this.f19133xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setFtnOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39715xcf08435(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd c4496x98cb1ffd) {
        this.f19132xdfe8bb54 = c4496x98cb1ffd;
        this.f19133xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setSnsOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39716x22cd3d1d(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5 c4524x5b63d6e5) {
        this.f19134x85a31f6c = c4524x5b63d6e5;
        this.f19133xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setUploadOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39717xa59c0eb0(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4457xe45141ec c4457xe45141ec) {
        this.f19135xf1880375 = c4457xe45141ec;
        this.f19133xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setUri */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39718xca029daa(java.lang.String str) {
        this.uri = str;
        this.f19133xcb94b041[14] = true;
        return this;
    }

    /* renamed from: setVideoOpt */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39719xbb332aba(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4543xc493b4c2 c4543xc493b4c2) {
        this.f19136x4f783cef = c4543xc493b4c2;
        this.f19133xcb94b041[9] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e m39705x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4534xb1f8192e) super.mo11468x92b714fd(bArr);
    }
}

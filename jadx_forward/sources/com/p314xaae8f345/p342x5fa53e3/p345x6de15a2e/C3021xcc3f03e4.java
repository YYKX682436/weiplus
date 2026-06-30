package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.H5TransferRouteItem */
/* loaded from: classes8.dex */
public class C3021xcc3f03e4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4 f10641xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4();

    /* renamed from: biz_cgi_cmdid */
    private int f10642x8e844f6f;

    /* renamed from: biz_cgi_url */
    private java.lang.String f10643x91990b89;

    /* renamed from: hasSetFields */
    private final boolean[] f10644xcb94b041 = new boolean[6];

    /* renamed from: transfer_cgi_cmdid */
    private int f10645xb91dc47;

    /* renamed from: transfer_cgi_url */
    private java.lang.String f10646x31d3ee61;

    /* renamed from: transfer_req_type */
    private com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3019xbf7485e0 f10647xc2b5740f;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4 m23158xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4 m23159x7c90cfc0() {
        return f10641xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4 m23160x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4 m23161x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4 c3021xcc3f03e4 = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4) fVar;
        return n51.f.a(this.f10643x91990b89, c3021xcc3f03e4.f10643x91990b89) && n51.f.a(java.lang.Integer.valueOf(this.f10642x8e844f6f), java.lang.Integer.valueOf(c3021xcc3f03e4.f10642x8e844f6f)) && n51.f.a(this.f10646x31d3ee61, c3021xcc3f03e4.f10646x31d3ee61) && n51.f.a(java.lang.Integer.valueOf(this.f10645xb91dc47), java.lang.Integer.valueOf(c3021xcc3f03e4.f10645xb91dc47)) && n51.f.a(this.f10647xc2b5740f, c3021xcc3f03e4.f10647xc2b5740f);
    }

    /* renamed from: getBizCgiCmdid */
    public int m23162xe3bfa74d() {
        return this.f10642x8e844f6f;
    }

    /* renamed from: getBizCgiUrl */
    public java.lang.String m23163xae4c2e7() {
        return this.f10644xcb94b041[1] ? this.f10643x91990b89 : "";
    }

    /* renamed from: getTransferCgiCmdid */
    public int m23164x51fcaad1() {
        return this.f10645xb91dc47;
    }

    /* renamed from: getTransferCgiUrl */
    public java.lang.String m23165x34d4d76b() {
        return this.f10644xcb94b041[3] ? this.f10646x31d3ee61 : "";
    }

    /* renamed from: getTransferReqType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3019xbf7485e0 m23166x7c4a4057() {
        return this.f10644xcb94b041[5] ? this.f10647xc2b5740f : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3019xbf7485e0.kH5TransferReqType_UnKnown;
    }

    /* renamed from: hasBizCgiCmdid */
    public boolean m23167x3dfb189() {
        return m23169x6e095e9(2);
    }

    /* renamed from: hasBizCgiUrl */
    public boolean m23168xcaba2c23() {
        return m23169x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m23169x6e095e9(int i17) {
        return this.f10644xcb94b041[i17];
    }

    /* renamed from: hasTransferCgiCmdid */
    public boolean m23170xbcb5a615() {
        return m23169x6e095e9(4);
    }

    /* renamed from: hasTransferCgiUrl */
    public boolean m23171xa55bd3af() {
        return m23169x6e095e9(3);
    }

    /* renamed from: hasTransferReqType */
    public boolean m23172x1ca2cc93() {
        return m23169x6e095e9(5);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4 m23173x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f10643x91990b89;
            if (str != null && this.f10644xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f10644xcb94b041[2]) {
                fVar.e(2, this.f10642x8e844f6f);
            }
            java.lang.String str2 = this.f10646x31d3ee61;
            if (str2 != null && this.f10644xcb94b041[3]) {
                fVar.j(3, str2);
            }
            if (this.f10644xcb94b041[4]) {
                fVar.e(4, this.f10645xb91dc47);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3019xbf7485e0 enumC3019xbf7485e0 = this.f10647xc2b5740f;
            if (enumC3019xbf7485e0 != null && this.f10644xcb94b041[5]) {
                fVar.e(5, enumC3019xbf7485e0.f10637x6ac9171);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f10643x91990b89;
            if (str3 != null && this.f10644xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (this.f10644xcb94b041[2]) {
                i18 += b36.f.e(2, this.f10642x8e844f6f);
            }
            java.lang.String str4 = this.f10646x31d3ee61;
            if (str4 != null && this.f10644xcb94b041[3]) {
                i18 += b36.f.j(3, str4);
            }
            if (this.f10644xcb94b041[4]) {
                i18 += b36.f.e(4, this.f10645xb91dc47);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3019xbf7485e0 enumC3019xbf7485e02 = this.f10647xc2b5740f;
            return (enumC3019xbf7485e02 == null || !this.f10644xcb94b041[5]) ? i18 : i18 + b36.f.e(5, enumC3019xbf7485e02.f10637x6ac9171);
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
            this.f10643x91990b89 = aVar2.k(intValue);
            this.f10644xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f10642x8e844f6f = aVar2.g(intValue);
            this.f10644xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f10646x31d3ee61 = aVar2.k(intValue);
            this.f10644xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f10645xb91dc47 = aVar2.g(intValue);
            this.f10644xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f10647xc2b5740f = com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3019xbf7485e0.m23140x382ad972(aVar2.g(intValue));
        this.f10644xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setBizCgiCmdid */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4 m23175x7a251ac1(int i17) {
        this.f10642x8e844f6f = i17;
        this.f10644xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setBizCgiUrl */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4 m23176x6738835b(java.lang.String str) {
        this.f10643x91990b89 = str;
        this.f10644xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setTransferCgiCmdid */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4 m23177xf5f93fdd(int i17) {
        this.f10645xb91dc47 = i17;
        this.f10644xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setTransferCgiUrl */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4 m23178xfccb3f77(java.lang.String str) {
        this.f10646x31d3ee61 = str;
        this.f10644xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setTransferReqType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4 m23179xb320d9cb(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3019xbf7485e0 enumC3019xbf7485e0) {
        this.f10647xc2b5740f = enumC3019xbf7485e0;
        this.f10644xcb94b041[5] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4 m23174x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4) super.mo11468x92b714fd(bArr);
    }
}

package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkKvReportInfo */
/* loaded from: classes4.dex */
public class C27101x8f69ff30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30 f59130xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30();

    /* renamed from: hasSetFields */
    private final boolean[] f59131xcb94b041 = new boolean[7];

    /* renamed from: ignore_freq_check */
    private boolean f59132x3c0f850e;

    /* renamed from: logid */
    private int f59133x625ef5f;

    /* renamed from: report_now */
    private boolean f59134x7323754b;

    /* renamed from: report_uin_type */
    private int f59135xc191a2aa;

    /* renamed from: type */
    private int f59136x368f3a;

    /* renamed from: value */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f59137x6ac9171;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30 m110284xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30 m110285x7c90cfc0() {
        return f59130xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30 m110286x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30 m110287x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30 c27101x8f69ff30 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f59133x625ef5f), java.lang.Integer.valueOf(c27101x8f69ff30.f59133x625ef5f)) && n51.f.a(java.lang.Integer.valueOf(this.f59136x368f3a), java.lang.Integer.valueOf(c27101x8f69ff30.f59136x368f3a)) && n51.f.a(this.f59137x6ac9171, c27101x8f69ff30.f59137x6ac9171) && n51.f.a(java.lang.Boolean.valueOf(this.f59134x7323754b), java.lang.Boolean.valueOf(c27101x8f69ff30.f59134x7323754b)) && n51.f.a(java.lang.Boolean.valueOf(this.f59132x3c0f850e), java.lang.Boolean.valueOf(c27101x8f69ff30.f59132x3c0f850e)) && n51.f.a(java.lang.Integer.valueOf(this.f59135xc191a2aa), java.lang.Integer.valueOf(c27101x8f69ff30.f59135xc191a2aa));
    }

    /* renamed from: getIgnoreFreqCheck */
    public boolean m110288x91478988() {
        return this.f59132x3c0f850e;
    }

    /* renamed from: getLogid */
    public int m110289x74c395a9() {
        return this.f59133x625ef5f;
    }

    /* renamed from: getReportNow */
    public boolean m110290xea5dd24c() {
        return this.f59134x7323754b;
    }

    /* renamed from: getReportUinType */
    public int m110291x6f0b872a() {
        return this.f59135xc191a2aa;
    }

    /* renamed from: getType */
    public int m110292xfb85f7b0() {
        return this.f59136x368f3a;
    }

    /* renamed from: getValue */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m110293x754a37bb() {
        return this.f59131xcb94b041[3] ? this.f59137x6ac9171 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: hasFieldNumber */
    public boolean m110294x6e095e9(int i17) {
        return this.f59131xcb94b041[i17];
    }

    /* renamed from: hasIgnoreFreqCheck */
    public boolean m110295x31a015c4() {
        return m110294x6e095e9(5);
    }

    /* renamed from: hasLogid */
    public boolean m110296x756fce5() {
        return m110294x6e095e9(1);
    }

    /* renamed from: hasReportNow */
    public boolean m110297xaa333b88() {
        return m110294x6e095e9(4);
    }

    /* renamed from: hasReportUinType */
    public boolean m110298x751f266() {
        return m110294x6e095e9(6);
    }

    /* renamed from: hasType */
    public boolean m110299x298ab8f4() {
        return m110294x6e095e9(2);
    }

    /* renamed from: hasValue */
    public boolean m110300x7dd9ef7() {
        return m110294x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30 m110301x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f59131xcb94b041[1]) {
                fVar.e(1, this.f59133x625ef5f);
            }
            if (this.f59131xcb94b041[2]) {
                fVar.e(2, this.f59136x368f3a);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f59137x6ac9171;
            if (gVar != null && this.f59131xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            if (this.f59131xcb94b041[4]) {
                fVar.a(4, this.f59134x7323754b);
            }
            if (this.f59131xcb94b041[5]) {
                fVar.a(5, this.f59132x3c0f850e);
            }
            if (this.f59131xcb94b041[6]) {
                fVar.e(6, this.f59135xc191a2aa);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f59131xcb94b041[1] ? 0 + b36.f.e(1, this.f59133x625ef5f) : 0;
            if (this.f59131xcb94b041[2]) {
                e17 += b36.f.e(2, this.f59136x368f3a);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f59137x6ac9171;
            if (gVar2 != null && this.f59131xcb94b041[3]) {
                e17 += b36.f.b(3, gVar2);
            }
            if (this.f59131xcb94b041[4]) {
                e17 += b36.f.a(4, this.f59134x7323754b);
            }
            if (this.f59131xcb94b041[5]) {
                e17 += b36.f.a(5, this.f59132x3c0f850e);
            }
            return this.f59131xcb94b041[6] ? e17 + b36.f.e(6, this.f59135xc191a2aa) : e17;
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
                this.f59133x625ef5f = aVar2.g(intValue);
                this.f59131xcb94b041[1] = true;
                return 0;
            case 2:
                this.f59136x368f3a = aVar2.g(intValue);
                this.f59131xcb94b041[2] = true;
                return 0;
            case 3:
                this.f59137x6ac9171 = aVar2.d(intValue);
                this.f59131xcb94b041[3] = true;
                return 0;
            case 4:
                this.f59134x7323754b = aVar2.c(intValue);
                this.f59131xcb94b041[4] = true;
                return 0;
            case 5:
                this.f59132x3c0f850e = aVar2.c(intValue);
                this.f59131xcb94b041[5] = true;
                return 0;
            case 6:
                this.f59135xc191a2aa = aVar2.g(intValue);
                this.f59131xcb94b041[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setIgnoreFreqCheck */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30 m110303xc81e22fc(boolean z17) {
        this.f59132x3c0f850e = z17;
        this.f59131xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setLogid */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30 m110304x5351b01d(int i17) {
        this.f59133x625ef5f = i17;
        this.f59131xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setReportNow */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30 m110305x46b192c0(boolean z17) {
        this.f59134x7323754b = z17;
        this.f59131xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setReportUinType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30 m110306x1e1ed9e(int i17) {
        this.f59135xc191a2aa = i17;
        this.f59131xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30 m110307x7650bebc(int i17) {
        this.f59136x368f3a = i17;
        this.f59131xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setValue */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30 m110308x53d8522f(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59137x6ac9171 = gVar;
        this.f59131xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30 m110302x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27101x8f69ff30) super.mo11468x92b714fd(bArr);
    }
}

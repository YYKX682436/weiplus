package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.FinderVideoOptions */
/* loaded from: classes4.dex */
public class C4493xe5589909 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 f18812xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909();

    /* renamed from: bypass */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f18813xae186ce8;

    /* renamed from: ctrlinfo */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f18814xed12f999;

    /* renamed from: feedid */
    private java.lang.String f18815xb3cd0339;

    /* renamed from: hasSetFields */
    private final boolean[] f18816xcb94b041 = new boolean[5];

    /* renamed from: report_transinfo */
    private boolean f18817xed1b220b;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 m38953xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 m38954x7c90cfc0() {
        return f18812xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 m38955x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 m38956x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 c4493xe5589909 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909) fVar;
        return n51.f.a(this.f18813xae186ce8, c4493xe5589909.f18813xae186ce8) && n51.f.a(this.f18814xed12f999, c4493xe5589909.f18814xed12f999) && n51.f.a(java.lang.Boolean.valueOf(this.f18817xed1b220b), java.lang.Boolean.valueOf(c4493xe5589909.f18817xed1b220b)) && n51.f.a(this.f18815xb3cd0339, c4493xe5589909.f18815xb3cd0339);
    }

    /* renamed from: getBypass */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m38957x132f8fde() {
        return this.f18816xcb94b041[1] ? this.f18813xae186ce8 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getCtrlinfo */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m38958x68ed370f() {
        return this.f18816xcb94b041[2] ? this.f18814xed12f999 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getFeedid */
    public java.lang.String m38959x18e4262f() {
        return this.f18816xcb94b041[4] ? this.f18815xb3cd0339 : "";
    }

    /* renamed from: getReportTransinfo */
    public boolean m38960x6941fa4c() {
        return this.f18817xed1b220b;
    }

    /* renamed from: hasBypass */
    public boolean m38961xd3091022() {
        return m38964x6e095e9(1);
    }

    /* renamed from: hasCtrlinfo */
    public boolean m38962x9867b653() {
        return m38964x6e095e9(2);
    }

    /* renamed from: hasFeedid */
    public boolean m38963xd8bda673() {
        return m38964x6e095e9(4);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38964x6e095e9(int i17) {
        return this.f18816xcb94b041[i17];
    }

    /* renamed from: hasReportTransinfo */
    public boolean m38965x99a8688() {
        return m38964x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 m38966x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f18813xae186ce8;
            if (gVar != null && this.f18816xcb94b041[1]) {
                fVar.b(1, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f18814xed12f999;
            if (gVar2 != null && this.f18816xcb94b041[2]) {
                fVar.b(2, gVar2);
            }
            if (this.f18816xcb94b041[3]) {
                fVar.a(3, this.f18817xed1b220b);
            }
            java.lang.String str = this.f18815xb3cd0339;
            if (str != null && this.f18816xcb94b041[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f18813xae186ce8;
            if (gVar3 != null && this.f18816xcb94b041[1]) {
                i18 = 0 + b36.f.b(1, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f18814xed12f999;
            if (gVar4 != null && this.f18816xcb94b041[2]) {
                i18 += b36.f.b(2, gVar4);
            }
            if (this.f18816xcb94b041[3]) {
                i18 += b36.f.a(3, this.f18817xed1b220b);
            }
            java.lang.String str2 = this.f18815xb3cd0339;
            return (str2 == null || !this.f18816xcb94b041[4]) ? i18 : i18 + b36.f.j(4, str2);
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
            this.f18813xae186ce8 = aVar2.d(intValue);
            this.f18816xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f18814xed12f999 = aVar2.d(intValue);
            this.f18816xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f18817xed1b220b = aVar2.c(intValue);
            this.f18816xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f18815xb3cd0339 = aVar2.k(intValue);
        this.f18816xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setBypass */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 m38968x664c3ea(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f18813xae186ce8 = gVar;
        this.f18816xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setCtrlinfo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 m38969x63a5981b(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f18814xed12f999 = gVar;
        this.f18816xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setFeedid */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 m38970xc195a3b(java.lang.String str) {
        this.f18815xb3cd0339 = str;
        this.f18816xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setReportTransinfo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 m38971xa01893c0(boolean z17) {
        this.f18817xed1b220b = z17;
        this.f18816xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 m38967x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4493xe5589909) super.mo11468x92b714fd(bArr);
    }
}

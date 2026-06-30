package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.StreamingProfile */
/* loaded from: classes8.dex */
public class C4526xdbc37b07 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 f19023xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07();

    /* renamed from: avg_request_cost */
    private int f19024x93ea4bca;

    /* renamed from: avg_request_size */
    private long f19025x93f17bfe;

    /* renamed from: first_request_cost */
    private int f19026x61172cac;

    /* renamed from: first_request_download_size */
    private long f19027x84c27359;

    /* renamed from: first_request_size */
    private long f19028x611e5ce0;

    /* renamed from: hasSetFields */
    private final boolean[] f19029xcb94b041 = new boolean[15];

    /* renamed from: is_first_request_completed */
    private boolean f19030x5a5860b7;

    /* renamed from: is_moov_completed */
    private boolean f19031xa3f0dc4a;

    /* renamed from: moov_cost */
    private int f19032xea5eab43;

    /* renamed from: moov_fail_reason */
    private int f19033xab736e4f;

    /* renamed from: moov_request_times */
    private int f19034x1e917ee0;

    /* renamed from: moov_size */
    private int f19035xea65db77;

    /* renamed from: request_completed_count */
    private int f19036x85b6d06b;

    /* renamed from: request_timeout_count */
    private int f19037xb35f5301;

    /* renamed from: request_total_count */
    private int f19038x9642fea4;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39504xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39505x7c90cfc0() {
        return f19023xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39506x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39507x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 c4526xdbc37b07 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f19026x61172cac), java.lang.Integer.valueOf(c4526xdbc37b07.f19026x61172cac)) && n51.f.a(java.lang.Long.valueOf(this.f19028x611e5ce0), java.lang.Long.valueOf(c4526xdbc37b07.f19028x611e5ce0)) && n51.f.a(java.lang.Long.valueOf(this.f19027x84c27359), java.lang.Long.valueOf(c4526xdbc37b07.f19027x84c27359)) && n51.f.a(java.lang.Boolean.valueOf(this.f19030x5a5860b7), java.lang.Boolean.valueOf(c4526xdbc37b07.f19030x5a5860b7)) && n51.f.a(java.lang.Integer.valueOf(this.f19034x1e917ee0), java.lang.Integer.valueOf(c4526xdbc37b07.f19034x1e917ee0)) && n51.f.a(java.lang.Integer.valueOf(this.f19032xea5eab43), java.lang.Integer.valueOf(c4526xdbc37b07.f19032xea5eab43)) && n51.f.a(java.lang.Integer.valueOf(this.f19035xea65db77), java.lang.Integer.valueOf(c4526xdbc37b07.f19035xea65db77)) && n51.f.a(java.lang.Boolean.valueOf(this.f19031xa3f0dc4a), java.lang.Boolean.valueOf(c4526xdbc37b07.f19031xa3f0dc4a)) && n51.f.a(java.lang.Integer.valueOf(this.f19033xab736e4f), java.lang.Integer.valueOf(c4526xdbc37b07.f19033xab736e4f)) && n51.f.a(java.lang.Long.valueOf(this.f19025x93f17bfe), java.lang.Long.valueOf(c4526xdbc37b07.f19025x93f17bfe)) && n51.f.a(java.lang.Integer.valueOf(this.f19024x93ea4bca), java.lang.Integer.valueOf(c4526xdbc37b07.f19024x93ea4bca)) && n51.f.a(java.lang.Integer.valueOf(this.f19038x9642fea4), java.lang.Integer.valueOf(c4526xdbc37b07.f19038x9642fea4)) && n51.f.a(java.lang.Integer.valueOf(this.f19036x85b6d06b), java.lang.Integer.valueOf(c4526xdbc37b07.f19036x85b6d06b)) && n51.f.a(java.lang.Integer.valueOf(this.f19037xb35f5301), java.lang.Integer.valueOf(c4526xdbc37b07.f19037xb35f5301));
    }

    /* renamed from: getAvgRequestCost */
    public int m39508x346e99c0() {
        return this.f19024x93ea4bca;
    }

    /* renamed from: getAvgRequestSize */
    public long m39509x3475c9f4() {
        return this.f19025x93f17bfe;
    }

    /* renamed from: getFirstRequestCost */
    public int m39510x4102e5a2() {
        return this.f19026x61172cac;
    }

    /* renamed from: getFirstRequestDownloadSize */
    public long m39511xf6da297e() {
        return this.f19027x84c27359;
    }

    /* renamed from: getFirstRequestSize */
    public long m39512x410a15d6() {
        return this.f19028x611e5ce0;
    }

    /* renamed from: getIsFirstRequestCompleted */
    public boolean m39513xb9feb40c() {
        return this.f19030x5a5860b7;
    }

    /* renamed from: getIsMoovCompleted */
    public boolean m39514x96485e02() {
        return this.f19031xa3f0dc4a;
    }

    /* renamed from: getMoovCost */
    public int m39515x6a96efec() {
        return this.f19032xea5eab43;
    }

    /* renamed from: getMoovFailReason */
    public int m39516xf47173e1() {
        return this.f19033xab736e4f;
    }

    /* renamed from: getMoovRequestTimes */
    public int m39517xdf801716() {
        return this.f19034x1e917ee0;
    }

    /* renamed from: getMoovSize */
    public int m39518x6a9e2020() {
        return this.f19035xea65db77;
    }

    /* renamed from: getRequestCompletedCount */
    public int m39519xa86b0c3d() {
        return this.f19036x85b6d06b;
    }

    /* renamed from: getRequestTimeoutCount */
    public int m39520x47e30d27() {
        return this.f19037xb35f5301;
    }

    /* renamed from: getRequestTotalCount */
    public int m39521x72f69f64() {
        return this.f19038x9642fea4;
    }

    /* renamed from: hasAvgRequestCost */
    public boolean m39522xa4f59604() {
        return m39524x6e095e9(11);
    }

    /* renamed from: hasAvgRequestSize */
    public boolean m39523xa4fcc638() {
        return m39524x6e095e9(10);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39524x6e095e9(int i17) {
        return this.f19029xcb94b041[i17];
    }

    /* renamed from: hasFirstRequestCost */
    public boolean m39525xabbbe0e6() {
        return m39524x6e095e9(1);
    }

    /* renamed from: hasFirstRequestDownloadSize */
    public boolean m39526xa495a0c2() {
        return m39524x6e095e9(3);
    }

    /* renamed from: hasFirstRequestSize */
    public boolean m39527xabc3111a() {
        return m39524x6e095e9(2);
    }

    /* renamed from: hasIsFirstRequestCompleted */
    public boolean m39528xaf154448() {
        return m39524x6e095e9(4);
    }

    /* renamed from: hasIsMoovCompleted */
    public boolean m39529x36a0ea3e() {
        return m39524x6e095e9(8);
    }

    /* renamed from: hasMoovCost */
    public boolean m39530x9a116f30() {
        return m39524x6e095e9(6);
    }

    /* renamed from: hasMoovFailReason */
    public boolean m39531x64f87025() {
        return m39524x6e095e9(9);
    }

    /* renamed from: hasMoovRequestTimes */
    public boolean m39532x4a39125a() {
        return m39524x6e095e9(5);
    }

    /* renamed from: hasMoovSize */
    public boolean m39533x9a189f64() {
        return m39524x6e095e9(7);
    }

    /* renamed from: hasRequestCompletedCount */
    public boolean m39534xf5207b79() {
        return m39524x6e095e9(13);
    }

    /* renamed from: hasRequestTimeoutCount */
    public boolean m39535xb4631b63() {
        return m39524x6e095e9(14);
    }

    /* renamed from: hasRequestTotalCount */
    public boolean m39536x5f5d0ca0() {
        return m39524x6e095e9(12);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39537x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f19029xcb94b041[1]) {
                fVar.e(1, this.f19026x61172cac);
            }
            if (this.f19029xcb94b041[2]) {
                fVar.h(2, this.f19028x611e5ce0);
            }
            if (this.f19029xcb94b041[3]) {
                fVar.h(3, this.f19027x84c27359);
            }
            if (this.f19029xcb94b041[4]) {
                fVar.a(4, this.f19030x5a5860b7);
            }
            if (this.f19029xcb94b041[5]) {
                fVar.e(5, this.f19034x1e917ee0);
            }
            if (this.f19029xcb94b041[6]) {
                fVar.e(6, this.f19032xea5eab43);
            }
            if (this.f19029xcb94b041[7]) {
                fVar.e(7, this.f19035xea65db77);
            }
            if (this.f19029xcb94b041[8]) {
                fVar.a(8, this.f19031xa3f0dc4a);
            }
            if (this.f19029xcb94b041[9]) {
                fVar.e(9, this.f19033xab736e4f);
            }
            if (this.f19029xcb94b041[10]) {
                fVar.h(10, this.f19025x93f17bfe);
            }
            if (this.f19029xcb94b041[11]) {
                fVar.e(11, this.f19024x93ea4bca);
            }
            if (this.f19029xcb94b041[12]) {
                fVar.e(12, this.f19038x9642fea4);
            }
            if (this.f19029xcb94b041[13]) {
                fVar.e(13, this.f19036x85b6d06b);
            }
            if (!this.f19029xcb94b041[14]) {
                return 0;
            }
            fVar.e(14, this.f19037xb35f5301);
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f19029xcb94b041[1] ? b36.f.e(1, this.f19026x61172cac) + 0 : 0;
            if (this.f19029xcb94b041[2]) {
                e17 += b36.f.h(2, this.f19028x611e5ce0);
            }
            if (this.f19029xcb94b041[3]) {
                e17 += b36.f.h(3, this.f19027x84c27359);
            }
            if (this.f19029xcb94b041[4]) {
                e17 += b36.f.a(4, this.f19030x5a5860b7);
            }
            if (this.f19029xcb94b041[5]) {
                e17 += b36.f.e(5, this.f19034x1e917ee0);
            }
            if (this.f19029xcb94b041[6]) {
                e17 += b36.f.e(6, this.f19032xea5eab43);
            }
            if (this.f19029xcb94b041[7]) {
                e17 += b36.f.e(7, this.f19035xea65db77);
            }
            if (this.f19029xcb94b041[8]) {
                e17 += b36.f.a(8, this.f19031xa3f0dc4a);
            }
            if (this.f19029xcb94b041[9]) {
                e17 += b36.f.e(9, this.f19033xab736e4f);
            }
            if (this.f19029xcb94b041[10]) {
                e17 += b36.f.h(10, this.f19025x93f17bfe);
            }
            if (this.f19029xcb94b041[11]) {
                e17 += b36.f.e(11, this.f19024x93ea4bca);
            }
            if (this.f19029xcb94b041[12]) {
                e17 += b36.f.e(12, this.f19038x9642fea4);
            }
            if (this.f19029xcb94b041[13]) {
                e17 += b36.f.e(13, this.f19036x85b6d06b);
            }
            return this.f19029xcb94b041[14] ? e17 + b36.f.e(14, this.f19037xb35f5301) : e17;
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
                this.f19026x61172cac = aVar2.g(intValue);
                this.f19029xcb94b041[1] = true;
                return 0;
            case 2:
                this.f19028x611e5ce0 = aVar2.i(intValue);
                this.f19029xcb94b041[2] = true;
                return 0;
            case 3:
                this.f19027x84c27359 = aVar2.i(intValue);
                this.f19029xcb94b041[3] = true;
                return 0;
            case 4:
                this.f19030x5a5860b7 = aVar2.c(intValue);
                this.f19029xcb94b041[4] = true;
                return 0;
            case 5:
                this.f19034x1e917ee0 = aVar2.g(intValue);
                this.f19029xcb94b041[5] = true;
                return 0;
            case 6:
                this.f19032xea5eab43 = aVar2.g(intValue);
                this.f19029xcb94b041[6] = true;
                return 0;
            case 7:
                this.f19035xea65db77 = aVar2.g(intValue);
                this.f19029xcb94b041[7] = true;
                return 0;
            case 8:
                this.f19031xa3f0dc4a = aVar2.c(intValue);
                this.f19029xcb94b041[8] = true;
                return 0;
            case 9:
                this.f19033xab736e4f = aVar2.g(intValue);
                this.f19029xcb94b041[9] = true;
                return 0;
            case 10:
                this.f19025x93f17bfe = aVar2.i(intValue);
                this.f19029xcb94b041[10] = true;
                return 0;
            case 11:
                this.f19024x93ea4bca = aVar2.g(intValue);
                this.f19029xcb94b041[11] = true;
                return 0;
            case 12:
                this.f19038x9642fea4 = aVar2.g(intValue);
                this.f19029xcb94b041[12] = true;
                return 0;
            case 13:
                this.f19036x85b6d06b = aVar2.g(intValue);
                this.f19029xcb94b041[13] = true;
                return 0;
            case 14:
                this.f19037xb35f5301 = aVar2.g(intValue);
                this.f19029xcb94b041[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAvgRequestCost */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39539xfc6501cc(int i17) {
        this.f19024x93ea4bca = i17;
        this.f19029xcb94b041[11] = true;
        return this;
    }

    /* renamed from: setAvgRequestSize */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39540xfc6c3200(long j17) {
        this.f19025x93f17bfe = j17;
        this.f19029xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setFirstRequestCost */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39541xe4ff7aae(int i17) {
        this.f19026x61172cac = i17;
        this.f19029xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setFirstRequestDownloadSize */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39542xa6a6f28a(long j17) {
        this.f19027x84c27359 = j17;
        this.f19029xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setFirstRequestSize */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39543xe506aae2(long j17) {
        this.f19028x611e5ce0 = j17;
        this.f19029xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setIsFirstRequestCompleted */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39544xd02e9980(boolean z17) {
        this.f19030x5a5860b7 = z17;
        this.f19029xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setIsMoovCompleted */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39545xcd1ef776(boolean z17) {
        this.f19031xa3f0dc4a = z17;
        this.f19029xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setMoovCost */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39546x654f50f8(int i17) {
        this.f19032xea5eab43 = i17;
        this.f19029xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setMoovFailReason */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39547xbc67dbed(int i17) {
        this.f19033xab736e4f = i17;
        this.f19029xcb94b041[9] = true;
        return this;
    }

    /* renamed from: setMoovRequestTimes */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39548x837cac22(int i17) {
        this.f19034x1e917ee0 = i17;
        this.f19029xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setMoovSize */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39549x6556812c(int i17) {
        this.f19035xea65db77 = i17;
        this.f19029xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setRequestCompletedCount */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39550x787dbeb1(int i17) {
        this.f19036x85b6d06b = i17;
        this.f19029xcb94b041[13] = true;
        return this;
    }

    /* renamed from: setRequestTimeoutCount */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39551x9627cc9b(int i17) {
        this.f19037xb35f5301 = i17;
        this.f19029xcb94b041[14] = true;
        return this;
    }

    /* renamed from: setRequestTotalCount */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39552x4e8cabd8(int i17) {
        this.f19038x9642fea4 = i17;
        this.f19029xcb94b041[12] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 m39538x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4526xdbc37b07) super.mo11468x92b714fd(bArr);
    }
}

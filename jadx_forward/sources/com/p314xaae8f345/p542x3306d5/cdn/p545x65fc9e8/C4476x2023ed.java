package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.Cost */
/* loaded from: classes8.dex */
public class C4476x2023ed extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed f18569xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed();

    /* renamed from: begin_unix_timestamp */
    private long f18570x95e92175;

    /* renamed from: connect_ms */
    private int f18571xd1c4591b;

    /* renamed from: connect_unix_timestamp */
    private long f18572x4d27714;

    /* renamed from: dns_ms */
    private int f18573xb0e8707c;

    /* renamed from: end_unix_timestamp */
    private long f18574x376703;

    /* renamed from: hasSetFields */
    private final boolean[] f18575xcb94b041 = new boolean[10];

    /* renamed from: queue_ms */
    private int f18576xba977394;

    /* renamed from: response_all_ms */
    private int f18577xd3156c2;

    /* renamed from: response_wait_ms */
    private int f18578x11dc5ab2;

    /* renamed from: total_ms */
    private int f18579xcd57a081;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m38534xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m38535x7c90cfc0() {
        return f18569xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m38536x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m38537x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed c4476x2023ed = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f18576xba977394), java.lang.Integer.valueOf(c4476x2023ed.f18576xba977394)) && n51.f.a(java.lang.Integer.valueOf(this.f18573xb0e8707c), java.lang.Integer.valueOf(c4476x2023ed.f18573xb0e8707c)) && n51.f.a(java.lang.Integer.valueOf(this.f18571xd1c4591b), java.lang.Integer.valueOf(c4476x2023ed.f18571xd1c4591b)) && n51.f.a(java.lang.Integer.valueOf(this.f18578x11dc5ab2), java.lang.Integer.valueOf(c4476x2023ed.f18578x11dc5ab2)) && n51.f.a(java.lang.Integer.valueOf(this.f18577xd3156c2), java.lang.Integer.valueOf(c4476x2023ed.f18577xd3156c2)) && n51.f.a(java.lang.Long.valueOf(this.f18570x95e92175), java.lang.Long.valueOf(c4476x2023ed.f18570x95e92175)) && n51.f.a(java.lang.Long.valueOf(this.f18572x4d27714), java.lang.Long.valueOf(c4476x2023ed.f18572x4d27714)) && n51.f.a(java.lang.Long.valueOf(this.f18574x376703), java.lang.Long.valueOf(c4476x2023ed.f18574x376703)) && n51.f.a(java.lang.Integer.valueOf(this.f18579xcd57a081), java.lang.Integer.valueOf(c4476x2023ed.f18579xcd57a081));
    }

    /* renamed from: getBeginUnixTimestamp */
    public long m38538x5f00dc3b() {
        return this.f18570x95e92175;
    }

    /* renamed from: getConnectMs */
    public int m38539xdce7617a() {
        return this.f18571xd1c4591b;
    }

    /* renamed from: getConnectUnixTimestamp */
    public long m38540x33a0681a() {
        return this.f18572x4d27714;
    }

    /* renamed from: getDnsMs */
    public int m38541x74528ef9() {
        return this.f18573xb0e8707c;
    }

    /* renamed from: getEndUnixTimestamp */
    public long m38542xc1b32c9() {
        return this.f18574x376703;
    }

    /* renamed from: getQueueMs */
    public int m38543x64da5e61() {
        return this.f18576xba977394;
    }

    /* renamed from: getResponseAllMs */
    public int m38544x1fa6d7b0() {
        return this.f18577xd3156c2;
    }

    /* renamed from: getResponseWaitMs */
    public int m38545xfa22ea92() {
        return this.f18578x11dc5ab2;
    }

    /* renamed from: getTotalMs */
    public int m38546xfa1a5fd4() {
        return this.f18579xcd57a081;
    }

    /* renamed from: hasBeginUnixTimestamp */
    public boolean m38547xff68167f() {
        return m38552x6e095e9(6);
    }

    /* renamed from: hasConnectMs */
    public boolean m38548x9cbccab6() {
        return m38552x6e095e9(3);
    }

    /* renamed from: hasConnectUnixTimestamp */
    public boolean m38549x5722215e() {
        return m38552x6e095e9(7);
    }

    /* renamed from: hasDnsMs */
    public boolean m38550x6e5f635() {
        return m38552x6e095e9(2);
    }

    /* renamed from: hasEndUnixTimestamp */
    public boolean m38551x76d42e0d() {
        return m38552x6e095e9(8);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38552x6e095e9(int i17) {
        return this.f18575xcb94b041[i17];
    }

    /* renamed from: hasQueueMs */
    public boolean m38553xa030e69d() {
        return m38552x6e095e9(1);
    }

    /* renamed from: hasResponseAllMs */
    public boolean m38554xb7ed42ec() {
        return m38552x6e095e9(5);
    }

    /* renamed from: hasResponseWaitMs */
    public boolean m38555x6aa9e6d6() {
        return m38552x6e095e9(4);
    }

    /* renamed from: hasTotalMs */
    public boolean m38556x3570e810() {
        return m38552x6e095e9(9);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m38557x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18575xcb94b041[1]) {
                fVar.e(1, this.f18576xba977394);
            }
            if (this.f18575xcb94b041[2]) {
                fVar.e(2, this.f18573xb0e8707c);
            }
            if (this.f18575xcb94b041[3]) {
                fVar.e(3, this.f18571xd1c4591b);
            }
            if (this.f18575xcb94b041[4]) {
                fVar.e(4, this.f18578x11dc5ab2);
            }
            if (this.f18575xcb94b041[5]) {
                fVar.e(5, this.f18577xd3156c2);
            }
            if (this.f18575xcb94b041[6]) {
                fVar.h(6, this.f18570x95e92175);
            }
            if (this.f18575xcb94b041[7]) {
                fVar.h(7, this.f18572x4d27714);
            }
            if (this.f18575xcb94b041[8]) {
                fVar.h(8, this.f18574x376703);
            }
            if (this.f18575xcb94b041[9]) {
                fVar.e(9, this.f18579xcd57a081);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f18575xcb94b041[1] ? 0 + b36.f.e(1, this.f18576xba977394) : 0;
            if (this.f18575xcb94b041[2]) {
                e17 += b36.f.e(2, this.f18573xb0e8707c);
            }
            if (this.f18575xcb94b041[3]) {
                e17 += b36.f.e(3, this.f18571xd1c4591b);
            }
            if (this.f18575xcb94b041[4]) {
                e17 += b36.f.e(4, this.f18578x11dc5ab2);
            }
            if (this.f18575xcb94b041[5]) {
                e17 += b36.f.e(5, this.f18577xd3156c2);
            }
            if (this.f18575xcb94b041[6]) {
                e17 += b36.f.h(6, this.f18570x95e92175);
            }
            if (this.f18575xcb94b041[7]) {
                e17 += b36.f.h(7, this.f18572x4d27714);
            }
            if (this.f18575xcb94b041[8]) {
                e17 += b36.f.h(8, this.f18574x376703);
            }
            return this.f18575xcb94b041[9] ? e17 + b36.f.e(9, this.f18579xcd57a081) : e17;
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
                this.f18576xba977394 = aVar2.g(intValue);
                this.f18575xcb94b041[1] = true;
                return 0;
            case 2:
                this.f18573xb0e8707c = aVar2.g(intValue);
                this.f18575xcb94b041[2] = true;
                return 0;
            case 3:
                this.f18571xd1c4591b = aVar2.g(intValue);
                this.f18575xcb94b041[3] = true;
                return 0;
            case 4:
                this.f18578x11dc5ab2 = aVar2.g(intValue);
                this.f18575xcb94b041[4] = true;
                return 0;
            case 5:
                this.f18577xd3156c2 = aVar2.g(intValue);
                this.f18575xcb94b041[5] = true;
                return 0;
            case 6:
                this.f18570x95e92175 = aVar2.i(intValue);
                this.f18575xcb94b041[6] = true;
                return 0;
            case 7:
                this.f18572x4d27714 = aVar2.i(intValue);
                this.f18575xcb94b041[7] = true;
                return 0;
            case 8:
                this.f18574x376703 = aVar2.i(intValue);
                this.f18575xcb94b041[8] = true;
                return 0;
            case 9:
                this.f18579xcd57a081 = aVar2.g(intValue);
                this.f18575xcb94b041[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setBeginUnixTimestamp */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m38559xf62c5e47(long j17) {
        this.f18570x95e92175 = j17;
        this.f18575xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setConnectMs */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m38560x393b21ee(int i17) {
        this.f18571xd1c4591b = i17;
        this.f18575xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setConnectUnixTimestamp */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m38561xadf39726(long j17) {
        this.f18572x4d27714 = j17;
        this.f18575xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setDnsMs */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m38562x52e0a96d(int i17) {
        this.f18573xb0e8707c = i17;
        this.f18575xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setEndUnixTimestamp */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m38563xb017c7d5(long j17) {
        this.f18574x376703 = j17;
        this.f18575xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setQueueMs */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m38564xd84babd5(int i17) {
        this.f18576xba977394 = i17;
        this.f18575xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setResponseAllMs */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m38565xb27d3e24(int i17) {
        this.f18577xd3156c2 = i17;
        this.f18575xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setResponseWaitMs */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m38566xc219529e(int i17) {
        this.f18578x11dc5ab2 = i17;
        this.f18575xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setTotalMs */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m38567x6d8bad48(int i17) {
        this.f18579xcd57a081 = i17;
        this.f18575xcb94b041[9] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed m38558x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4476x2023ed) super.mo11468x92b714fd(bArr);
    }
}

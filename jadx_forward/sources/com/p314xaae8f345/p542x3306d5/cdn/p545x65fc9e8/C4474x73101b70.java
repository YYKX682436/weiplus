package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.ConnRecordItem */
/* loaded from: classes4.dex */
public class C4474x73101b70 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70 f18560xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70();

    /* renamed from: begin_timestamp_ms */
    private long f18561x9e3db545;
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4462x5d6756cd biz;

    /* renamed from: cost_ms */
    private int f18562x38fd9358;

    /* renamed from: hasSetFields */
    private final boolean[] f18563xcb94b041 = new boolean[6];

    /* renamed from: proto */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4517x53b2b922 f18564x65fc9e8;

    /* renamed from: succeed */
    private boolean f18565x90b53e42;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70 m38498xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70 m38499x7c90cfc0() {
        return f18560xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70 m38500x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70 m38501x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70 c4474x73101b70 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70) fVar;
        return n51.f.a(this.biz, c4474x73101b70.biz) && n51.f.a(this.f18564x65fc9e8, c4474x73101b70.f18564x65fc9e8) && n51.f.a(java.lang.Boolean.valueOf(this.f18565x90b53e42), java.lang.Boolean.valueOf(c4474x73101b70.f18565x90b53e42)) && n51.f.a(java.lang.Long.valueOf(this.f18561x9e3db545), java.lang.Long.valueOf(c4474x73101b70.f18561x9e3db545)) && n51.f.a(java.lang.Integer.valueOf(this.f18562x38fd9358), java.lang.Integer.valueOf(c4474x73101b70.f18562x38fd9358));
    }

    /* renamed from: getBeginTimestampMs */
    public long m38502x309c0869() {
        return this.f18561x9e3db545;
    }

    /* renamed from: getBiz */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4462x5d6756cd m38503xb5882ddd() {
        return this.f18563xcb94b041[1] ? this.biz : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4462x5d6756cd.BIZ_TYPE_CGI;
    }

    /* renamed from: getCostMs */
    public int m38504x14591d49() {
        return this.f18562x38fd9358;
    }

    /* renamed from: getProto */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4517x53b2b922 m38505x74fd7032() {
        return this.f18563xcb94b041[2] ? this.f18564x65fc9e8 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4517x53b2b922.PROTO_TYPE_TCP;
    }

    /* renamed from: getSucceed */
    public boolean m38506xce827a0c() {
        return this.f18565x90b53e42;
    }

    /* renamed from: hasBeginTimestampMs */
    public boolean m38507x9b5503ad() {
        return m38510x6e095e9(4);
    }

    /* renamed from: hasBiz */
    public boolean m38508xb7043419() {
        return m38510x6e095e9(1);
    }

    /* renamed from: hasCostMs */
    public boolean m38509xd4329d8d() {
        return m38510x6e095e9(5);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38510x6e095e9(int i17) {
        return this.f18563xcb94b041[i17];
    }

    /* renamed from: hasProto */
    public boolean m38511x790d76e() {
        return m38510x6e095e9(2);
    }

    /* renamed from: hasSucceed */
    public boolean m38512x9d90248() {
        return m38510x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70 m38513x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4462x5d6756cd enumC4462x5d6756cd = this.biz;
            if (enumC4462x5d6756cd != null && this.f18563xcb94b041[1]) {
                fVar.e(1, enumC4462x5d6756cd.f18476x6ac9171);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4517x53b2b922 enumC4517x53b2b922 = this.f18564x65fc9e8;
            if (enumC4517x53b2b922 != null && this.f18563xcb94b041[2]) {
                fVar.e(2, enumC4517x53b2b922.f18988x6ac9171);
            }
            if (this.f18563xcb94b041[3]) {
                fVar.a(3, this.f18565x90b53e42);
            }
            if (this.f18563xcb94b041[4]) {
                fVar.h(4, this.f18561x9e3db545);
            }
            if (this.f18563xcb94b041[5]) {
                fVar.e(5, this.f18562x38fd9358);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4462x5d6756cd enumC4462x5d6756cd2 = this.biz;
            if (enumC4462x5d6756cd2 != null && this.f18563xcb94b041[1]) {
                i18 = 0 + b36.f.e(1, enumC4462x5d6756cd2.f18476x6ac9171);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4517x53b2b922 enumC4517x53b2b9222 = this.f18564x65fc9e8;
            if (enumC4517x53b2b9222 != null && this.f18563xcb94b041[2]) {
                i18 += b36.f.e(2, enumC4517x53b2b9222.f18988x6ac9171);
            }
            if (this.f18563xcb94b041[3]) {
                i18 += b36.f.a(3, this.f18565x90b53e42);
            }
            if (this.f18563xcb94b041[4]) {
                i18 += b36.f.h(4, this.f18561x9e3db545);
            }
            return this.f18563xcb94b041[5] ? i18 + b36.f.e(5, this.f18562x38fd9358) : i18;
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
            this.biz = com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4462x5d6756cd.m38232x382ad972(aVar2.g(intValue));
            this.f18563xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f18564x65fc9e8 = com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4517x53b2b922.m39378x382ad972(aVar2.g(intValue));
            this.f18563xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f18565x90b53e42 = aVar2.c(intValue);
            this.f18563xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f18561x9e3db545 = aVar2.i(intValue);
            this.f18563xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f18562x38fd9358 = aVar2.g(intValue);
        this.f18563xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setBeginTimestampMs */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70 m38515xd4989d75(long j17) {
        this.f18561x9e3db545 = j17;
        this.f18563xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setBiz */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70 m38516xca025551(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4462x5d6756cd enumC4462x5d6756cd) {
        this.biz = enumC4462x5d6756cd;
        this.f18563xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setCostMs */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70 m38517x78e5155(int i17) {
        this.f18562x38fd9358 = i17;
        this.f18563xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setProto */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70 m38518x538b8aa6(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4517x53b2b922 enumC4517x53b2b922) {
        this.f18564x65fc9e8 = enumC4517x53b2b922;
        this.f18563xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setSucceed */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70 m38519x41f3c780(boolean z17) {
        this.f18565x90b53e42 = z17;
        this.f18563xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70 m38514x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70) super.mo11468x92b714fd(bArr);
    }
}

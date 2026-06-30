package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.CDNClientConfig */
/* loaded from: classes8.dex */
public class C4465xc813cb9a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a f18495xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a();

    /* renamed from: C2CRWTimeout */
    private int f18496xe7bb8008;

    /* renamed from: C2CRetryInterval */
    private int f18497x9caa0a19;

    /* renamed from: C2CShowErrorDelayMS */
    private int f18498x3b0c14d2;

    /* renamed from: SNSRWTimeout */
    private int f18499xf0707504;

    /* renamed from: SNSRetryInterval */
    private int f18500xa7a42115;

    /* renamed from: SNSShowErrorDelayMS */
    private int f18501xa044cc56;

    /* renamed from: hasSetFields */
    private final boolean[] f18502xcb94b041 = new boolean[7];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a m38295xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a m38296x7c90cfc0() {
        return f18495xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a m38297x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a m38298x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a c4465xc813cb9a = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f18498x3b0c14d2), java.lang.Integer.valueOf(c4465xc813cb9a.f18498x3b0c14d2)) && n51.f.a(java.lang.Integer.valueOf(this.f18501xa044cc56), java.lang.Integer.valueOf(c4465xc813cb9a.f18501xa044cc56)) && n51.f.a(java.lang.Integer.valueOf(this.f18497x9caa0a19), java.lang.Integer.valueOf(c4465xc813cb9a.f18497x9caa0a19)) && n51.f.a(java.lang.Integer.valueOf(this.f18500xa7a42115), java.lang.Integer.valueOf(c4465xc813cb9a.f18500xa7a42115)) && n51.f.a(java.lang.Integer.valueOf(this.f18496xe7bb8008), java.lang.Integer.valueOf(c4465xc813cb9a.f18496xe7bb8008)) && n51.f.a(java.lang.Integer.valueOf(this.f18499xf0707504), java.lang.Integer.valueOf(c4465xc813cb9a.f18499xf0707504));
    }

    /* renamed from: getC2CRWTimeout */
    public int m38299x3ee2be5e() {
        return this.f18496xe7bb8008;
    }

    /* renamed from: getC2CRetryInterval */
    public int m38300x76be2d6f() {
        return this.f18497x9caa0a19;
    }

    /* renamed from: getC2CShowErrorDelayMS */
    public int m38301x488829bc() {
        return this.f18498x3b0c14d2;
    }

    /* renamed from: getSNSRWTimeout */
    public int m38302x4797b35a() {
        return this.f18499xf0707504;
    }

    /* renamed from: getSNSRetryInterval */
    public int m38303x81b8446b() {
        return this.f18500xa7a42115;
    }

    /* renamed from: getSNSShowErrorDelayMS */
    public int m38304xadc0e140() {
        return this.f18501xa044cc56;
    }

    /* renamed from: hasC2CRWTimeout */
    public boolean m38305x22c3fba2() {
        return m38308x6e095e9(5);
    }

    /* renamed from: hasC2CRetryInterval */
    public boolean m38306xe17728b3() {
        return m38308x6e095e9(3);
    }

    /* renamed from: hasC2CShowErrorDelayMS */
    public boolean m38307xb50837f8() {
        return m38308x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38308x6e095e9(int i17) {
        return this.f18502xcb94b041[i17];
    }

    /* renamed from: hasSNSRWTimeout */
    public boolean m38309x2b78f09e() {
        return m38308x6e095e9(6);
    }

    /* renamed from: hasSNSRetryInterval */
    public boolean m38310xec713faf() {
        return m38308x6e095e9(4);
    }

    /* renamed from: hasSNSShowErrorDelayMS */
    public boolean m38311x1a40ef7c() {
        return m38308x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a m38312x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18502xcb94b041[1]) {
                fVar.e(1, this.f18498x3b0c14d2);
            }
            if (this.f18502xcb94b041[2]) {
                fVar.e(2, this.f18501xa044cc56);
            }
            if (this.f18502xcb94b041[3]) {
                fVar.e(3, this.f18497x9caa0a19);
            }
            if (this.f18502xcb94b041[4]) {
                fVar.e(4, this.f18500xa7a42115);
            }
            if (this.f18502xcb94b041[5]) {
                fVar.e(5, this.f18496xe7bb8008);
            }
            if (this.f18502xcb94b041[6]) {
                fVar.e(6, this.f18499xf0707504);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f18502xcb94b041[1] ? 0 + b36.f.e(1, this.f18498x3b0c14d2) : 0;
            if (this.f18502xcb94b041[2]) {
                e17 += b36.f.e(2, this.f18501xa044cc56);
            }
            if (this.f18502xcb94b041[3]) {
                e17 += b36.f.e(3, this.f18497x9caa0a19);
            }
            if (this.f18502xcb94b041[4]) {
                e17 += b36.f.e(4, this.f18500xa7a42115);
            }
            if (this.f18502xcb94b041[5]) {
                e17 += b36.f.e(5, this.f18496xe7bb8008);
            }
            return this.f18502xcb94b041[6] ? e17 + b36.f.e(6, this.f18499xf0707504) : e17;
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
                this.f18498x3b0c14d2 = aVar2.g(intValue);
                this.f18502xcb94b041[1] = true;
                return 0;
            case 2:
                this.f18501xa044cc56 = aVar2.g(intValue);
                this.f18502xcb94b041[2] = true;
                return 0;
            case 3:
                this.f18497x9caa0a19 = aVar2.g(intValue);
                this.f18502xcb94b041[3] = true;
                return 0;
            case 4:
                this.f18500xa7a42115 = aVar2.g(intValue);
                this.f18502xcb94b041[4] = true;
                return 0;
            case 5:
                this.f18496xe7bb8008 = aVar2.g(intValue);
                this.f18502xcb94b041[5] = true;
                return 0;
            case 6:
                this.f18499xf0707504 = aVar2.g(intValue);
                this.f18502xcb94b041[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setC2CRWTimeout */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a m38314x752bb96a(int i17) {
        this.f18496xe7bb8008 = i17;
        this.f18502xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setC2CRetryInterval */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a m38315x1abac27b(int i17) {
        this.f18497x9caa0a19 = i17;
        this.f18502xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setC2CShowErrorDelayMS */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a m38316x96cce930(int i17) {
        this.f18498x3b0c14d2 = i17;
        this.f18502xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setSNSRWTimeout */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a m38317x7de0ae66(int i17) {
        this.f18499xf0707504 = i17;
        this.f18502xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setSNSRetryInterval */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a m38318x25b4d977(int i17) {
        this.f18500xa7a42115 = i17;
        this.f18502xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setSNSShowErrorDelayMS */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a m38319xfc05a0b4(int i17) {
        this.f18501xa044cc56 = i17;
        this.f18502xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a m38313x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4465xc813cb9a) super.mo11468x92b714fd(bArr);
    }
}

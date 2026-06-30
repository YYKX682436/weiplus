package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.DownloadedSizes */
/* loaded from: classes2.dex */
public class C4484x723f58b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b f18656xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b();

    /* renamed from: continous */
    private long f18657xe7f45416;

    /* renamed from: finished */
    private long f18658xd7d8c072;

    /* renamed from: hasSetFields */
    private final boolean[] f18659xcb94b041 = new boolean[5];

    /* renamed from: offset */
    private long f18660xc3376493;

    /* renamed from: total */
    private long f18661x696db44;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b m38766xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b m38767x7c90cfc0() {
        return f18656xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b m38768x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b m38769x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b c4484x723f58b = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f18660xc3376493), java.lang.Long.valueOf(c4484x723f58b.f18660xc3376493)) && n51.f.a(java.lang.Long.valueOf(this.f18657xe7f45416), java.lang.Long.valueOf(c4484x723f58b.f18657xe7f45416)) && n51.f.a(java.lang.Long.valueOf(this.f18658xd7d8c072), java.lang.Long.valueOf(c4484x723f58b.f18658xd7d8c072)) && n51.f.a(java.lang.Long.valueOf(this.f18661x696db44), java.lang.Long.valueOf(c4484x723f58b.f18661x696db44));
    }

    /* renamed from: getContinous */
    public long m38770xe761c560() {
        return this.f18657xe7f45416;
    }

    /* renamed from: getFinished */
    public long m38771x53b2fde8() {
        return this.f18658xd7d8c072;
    }

    /* renamed from: getOffset */
    public long m38772x284e8789() {
        return this.f18660xc3376493;
    }

    /* renamed from: getTotal */
    public long m38773x7534818e() {
        return this.f18661x696db44;
    }

    /* renamed from: hasContinous */
    public boolean m38774xa7372e9c() {
        return m38775x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38775x6e095e9(int i17) {
        return this.f18659xcb94b041[i17];
    }

    /* renamed from: hasFinished */
    public boolean m38776x832d7d2c() {
        return m38775x6e095e9(3);
    }

    /* renamed from: hasOffset */
    public boolean m38777xe82807cd() {
        return m38775x6e095e9(1);
    }

    /* renamed from: hasTotal */
    public boolean m38778x7c7e8ca() {
        return m38775x6e095e9(4);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b m38779x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18659xcb94b041[1]) {
                fVar.h(1, this.f18660xc3376493);
            }
            if (this.f18659xcb94b041[2]) {
                fVar.h(2, this.f18657xe7f45416);
            }
            if (this.f18659xcb94b041[3]) {
                fVar.h(3, this.f18658xd7d8c072);
            }
            if (this.f18659xcb94b041[4]) {
                fVar.h(4, this.f18661x696db44);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.f18659xcb94b041[1] ? 0 + b36.f.h(1, this.f18660xc3376493) : 0;
            if (this.f18659xcb94b041[2]) {
                h17 += b36.f.h(2, this.f18657xe7f45416);
            }
            if (this.f18659xcb94b041[3]) {
                h17 += b36.f.h(3, this.f18658xd7d8c072);
            }
            return this.f18659xcb94b041[4] ? h17 + b36.f.h(4, this.f18661x696db44) : h17;
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
            this.f18660xc3376493 = aVar2.i(intValue);
            this.f18659xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f18657xe7f45416 = aVar2.i(intValue);
            this.f18659xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f18658xd7d8c072 = aVar2.i(intValue);
            this.f18659xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f18661x696db44 = aVar2.i(intValue);
        this.f18659xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setContinous */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b m38781x43b585d4(long j17) {
        this.f18657xe7f45416 = j17;
        this.f18659xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setFinished */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b m38782x4e6b5ef4(long j17) {
        this.f18658xd7d8c072 = j17;
        this.f18659xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setOffset */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b m38783x1b83bb95(long j17) {
        this.f18660xc3376493 = j17;
        this.f18659xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setTotal */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b m38784x53c29c02(long j17) {
        this.f18661x696db44 = j17;
        this.f18659xcb94b041[4] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b m38780x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4484x723f58b) super.mo11468x92b714fd(bArr);
    }
}

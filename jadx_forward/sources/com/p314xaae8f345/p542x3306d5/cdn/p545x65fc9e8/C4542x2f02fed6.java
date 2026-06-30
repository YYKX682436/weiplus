package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.VideoTsRangeItem */
/* loaded from: classes2.dex */
public class C4542x2f02fed6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6 f19194xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6();

    /* renamed from: begin_ts */
    private double f19195x58c6cdd5;

    /* renamed from: end_ts */
    private double f19196xb2967863;

    /* renamed from: hasSetFields */
    private final boolean[] f19197xcb94b041 = new boolean[5];

    /* renamed from: length */
    private int f19198xbe0e3ae6;

    /* renamed from: offset */
    private long f19199xc3376493;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6 m39910xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6 m39911x7c90cfc0() {
        return f19194xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6 m39912x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6 m39913x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6 c4542x2f02fed6 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f19195x58c6cdd5), java.lang.Double.valueOf(c4542x2f02fed6.f19195x58c6cdd5)) && n51.f.a(java.lang.Double.valueOf(this.f19196xb2967863), java.lang.Double.valueOf(c4542x2f02fed6.f19196xb2967863)) && n51.f.a(java.lang.Long.valueOf(this.f19199xc3376493), java.lang.Long.valueOf(c4542x2f02fed6.f19199xc3376493)) && n51.f.a(java.lang.Integer.valueOf(this.f19198xbe0e3ae6), java.lang.Integer.valueOf(c4542x2f02fed6.f19198xbe0e3ae6));
    }

    /* renamed from: getBeginTs */
    public double m39914x302638d2() {
        return this.f19195x58c6cdd5;
    }

    /* renamed from: getEndTs */
    public double m39915x74606f04() {
        return this.f19196xb2967863;
    }

    /* renamed from: getLength */
    public int m39916x23255ddc() {
        return this.f19198xbe0e3ae6;
    }

    /* renamed from: getOffset */
    public long m39917x284e8789() {
        return this.f19199xc3376493;
    }

    /* renamed from: hasBeginTs */
    public boolean m39918x6b7cc10e() {
        return m39920x6e095e9(1);
    }

    /* renamed from: hasEndTs */
    public boolean m39919x6f3d640() {
        return m39920x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39920x6e095e9(int i17) {
        return this.f19197xcb94b041[i17];
    }

    /* renamed from: hasLength */
    public boolean m39921xe2fede20() {
        return m39920x6e095e9(4);
    }

    /* renamed from: hasOffset */
    public boolean m39922xe82807cd() {
        return m39920x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6 m39923x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f19197xcb94b041[1]) {
                fVar.c(1, this.f19195x58c6cdd5);
            }
            if (this.f19197xcb94b041[2]) {
                fVar.c(2, this.f19196xb2967863);
            }
            if (this.f19197xcb94b041[3]) {
                fVar.h(3, this.f19199xc3376493);
            }
            if (this.f19197xcb94b041[4]) {
                fVar.e(4, this.f19198xbe0e3ae6);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = this.f19197xcb94b041[1] ? 0 + b36.f.c(1, this.f19195x58c6cdd5) : 0;
            if (this.f19197xcb94b041[2]) {
                c17 += b36.f.c(2, this.f19196xb2967863);
            }
            if (this.f19197xcb94b041[3]) {
                c17 += b36.f.h(3, this.f19199xc3376493);
            }
            return this.f19197xcb94b041[4] ? c17 + b36.f.e(4, this.f19198xbe0e3ae6) : c17;
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
            this.f19195x58c6cdd5 = aVar2.e(intValue);
            this.f19197xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f19196xb2967863 = aVar2.e(intValue);
            this.f19197xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f19199xc3376493 = aVar2.i(intValue);
            this.f19197xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f19198xbe0e3ae6 = aVar2.g(intValue);
        this.f19197xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setBeginTs */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6 m39925xa3978646(double d17) {
        this.f19195x58c6cdd5 = d17;
        this.f19197xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setEndTs */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6 m39926x52ee8978(double d17) {
        this.f19196xb2967863 = d17;
        this.f19197xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setLength */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6 m39927x165a91e8(int i17) {
        this.f19198xbe0e3ae6 = i17;
        this.f19197xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setOffset */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6 m39928x1b83bb95(long j17) {
        this.f19199xc3376493 = j17;
        this.f19197xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6 m39924x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6) super.mo11468x92b714fd(bArr);
    }
}

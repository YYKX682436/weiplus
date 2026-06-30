package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.PreloadProfile */
/* loaded from: classes8.dex */
public class C4516xa3bc5380 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 f18977xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380();

    /* renamed from: finished */
    private long f18978xd7d8c072;

    /* renamed from: hasSetFields */
    private final boolean[] f18979xcb94b041 = new boolean[5];

    /* renamed from: minsize */
    private long f18980x3f780d53;

    /* renamed from: percent */
    private int f18981xd7886445;

    /* renamed from: total */
    private long f18982x696db44;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 m39357xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 m39358x7c90cfc0() {
        return f18977xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 m39359x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 m39360x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 c4516xa3bc5380 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f18981xd7886445), java.lang.Integer.valueOf(c4516xa3bc5380.f18981xd7886445)) && n51.f.a(java.lang.Long.valueOf(this.f18980x3f780d53), java.lang.Long.valueOf(c4516xa3bc5380.f18980x3f780d53)) && n51.f.a(java.lang.Long.valueOf(this.f18978xd7d8c072), java.lang.Long.valueOf(c4516xa3bc5380.f18978xd7d8c072)) && n51.f.a(java.lang.Long.valueOf(this.f18982x696db44), java.lang.Long.valueOf(c4516xa3bc5380.f18982x696db44));
    }

    /* renamed from: getFinished */
    public long m39361x53b2fde8() {
        return this.f18978xd7d8c072;
    }

    /* renamed from: getMinsize */
    public long m39362x7d45491d() {
        return this.f18980x3f780d53;
    }

    /* renamed from: getPercent */
    public int m39363x1555a00f() {
        return this.f18981xd7886445;
    }

    /* renamed from: getTotal */
    public long m39364x7534818e() {
        return this.f18982x696db44;
    }

    /* renamed from: hasFieldNumber */
    public boolean m39365x6e095e9(int i17) {
        return this.f18979xcb94b041[i17];
    }

    /* renamed from: hasFinished */
    public boolean m39366x832d7d2c() {
        return m39365x6e095e9(3);
    }

    /* renamed from: hasMinsize */
    public boolean m39367xb89bd159() {
        return m39365x6e095e9(2);
    }

    /* renamed from: hasPercent */
    public boolean m39368x50ac284b() {
        return m39365x6e095e9(1);
    }

    /* renamed from: hasTotal */
    public boolean m39369x7c7e8ca() {
        return m39365x6e095e9(4);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 m39370x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18979xcb94b041[1]) {
                fVar.e(1, this.f18981xd7886445);
            }
            if (this.f18979xcb94b041[2]) {
                fVar.h(2, this.f18980x3f780d53);
            }
            if (this.f18979xcb94b041[3]) {
                fVar.h(3, this.f18978xd7d8c072);
            }
            if (this.f18979xcb94b041[4]) {
                fVar.h(4, this.f18982x696db44);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f18979xcb94b041[1] ? 0 + b36.f.e(1, this.f18981xd7886445) : 0;
            if (this.f18979xcb94b041[2]) {
                e17 += b36.f.h(2, this.f18980x3f780d53);
            }
            if (this.f18979xcb94b041[3]) {
                e17 += b36.f.h(3, this.f18978xd7d8c072);
            }
            return this.f18979xcb94b041[4] ? e17 + b36.f.h(4, this.f18982x696db44) : e17;
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
            this.f18981xd7886445 = aVar2.g(intValue);
            this.f18979xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f18980x3f780d53 = aVar2.i(intValue);
            this.f18979xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f18978xd7d8c072 = aVar2.i(intValue);
            this.f18979xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f18982x696db44 = aVar2.i(intValue);
        this.f18979xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setFinished */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 m39372x4e6b5ef4(long j17) {
        this.f18978xd7d8c072 = j17;
        this.f18979xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setMinsize */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 m39373xf0b69691(long j17) {
        this.f18980x3f780d53 = j17;
        this.f18979xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setPercent */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 m39374x88c6ed83(int i17) {
        this.f18981xd7886445 = i17;
        this.f18979xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setTotal */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 m39375x53c29c02(long j17) {
        this.f18982x696db44 = j17;
        this.f18979xcb94b041[4] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 m39371x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4516xa3bc5380) super.mo11468x92b714fd(bArr);
    }
}

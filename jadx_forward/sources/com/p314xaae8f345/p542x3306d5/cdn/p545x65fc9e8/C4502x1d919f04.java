package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.HostResolve */
/* loaded from: classes8.dex */
public class C4502x1d919f04 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 f18865xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04();

    /* renamed from: flags */
    private int f18866x5cfee87;

    /* renamed from: hasSetFields */
    private final boolean[] f18867xcb94b041 = new boolean[3];

    /* renamed from: priority */
    private int f18868xba8879a4;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 m39133xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 m39134x7c90cfc0() {
        return f18865xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 m39135x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 m39136x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 c4502x1d919f04 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f18868xba8879a4), java.lang.Integer.valueOf(c4502x1d919f04.f18868xba8879a4)) && n51.f.a(java.lang.Integer.valueOf(this.f18866x5cfee87), java.lang.Integer.valueOf(c4502x1d919f04.f18866x5cfee87));
    }

    /* renamed from: getFlags */
    public int m39137x746d94d1() {
        return this.f18866x5cfee87;
    }

    /* renamed from: getPriority */
    public int m39138x3662b71a() {
        return this.f18868xba8879a4;
    }

    /* renamed from: hasFieldNumber */
    public boolean m39139x6e095e9(int i17) {
        return this.f18867xcb94b041[i17];
    }

    /* renamed from: hasFlags */
    public boolean m39140x700fc0d() {
        return m39139x6e095e9(2);
    }

    /* renamed from: hasPriority */
    public boolean m39141x65dd365e() {
        return m39139x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 m39142x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18867xcb94b041[1]) {
                fVar.e(1, this.f18868xba8879a4);
            }
            if (this.f18867xcb94b041[2]) {
                fVar.e(2, this.f18866x5cfee87);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f18867xcb94b041[1] ? 0 + b36.f.e(1, this.f18868xba8879a4) : 0;
            return this.f18867xcb94b041[2] ? e17 + b36.f.e(2, this.f18866x5cfee87) : e17;
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
            this.f18868xba8879a4 = aVar2.g(intValue);
            this.f18867xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f18866x5cfee87 = aVar2.g(intValue);
        this.f18867xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setFlags */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 m39144x52fbaf45(int i17) {
        this.f18866x5cfee87 = i17;
        this.f18867xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setPriority */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 m39145x311b1826(int i17) {
        this.f18868xba8879a4 = i17;
        this.f18867xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 m39143x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4502x1d919f04) super.mo11468x92b714fd(bArr);
    }
}

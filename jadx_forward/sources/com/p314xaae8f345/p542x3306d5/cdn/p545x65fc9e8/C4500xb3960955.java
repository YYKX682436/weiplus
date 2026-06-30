package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.HitCheck */
/* loaded from: classes8.dex */
public class C4500xb3960955 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955 f18856xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955();

    /* renamed from: base */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 f18857x2e06d1;

    /* renamed from: fileid */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 f18858xb4089397;

    /* renamed from: filetype */
    private int f18859xd43766b6;

    /* renamed from: hasSetFields */
    private final boolean[] f18860xcb94b041 = new boolean[4];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955 m39099xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955 m39100x7c90cfc0() {
        return f18856xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955 m39101x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955 m39102x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955 c4500xb3960955 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955) fVar;
        return n51.f.a(this.f18857x2e06d1, c4500xb3960955.f18857x2e06d1) && n51.f.a(java.lang.Integer.valueOf(this.f18859xd43766b6), java.lang.Integer.valueOf(c4500xb3960955.f18859xd43766b6)) && n51.f.a(this.f18858xb4089397, c4500xb3960955.f18858xb4089397);
    }

    /* renamed from: getBase */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m39103xfb7d6f47() {
        return this.f18860xcb94b041[1] ? this.f18857x2e06d1 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1.m38058xaf65a0fc();
    }

    /* renamed from: getFileid */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 m39104x191fb68d() {
        return this.f18860xcb94b041[3] ? this.f18858xb4089397 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6.m38847xaf65a0fc();
    }

    /* renamed from: getFiletype */
    public int m39105x5011a42c() {
        return this.f18859xd43766b6;
    }

    /* renamed from: hasBase */
    public boolean m39106x2982308b() {
        return m39107x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39107x6e095e9(int i17) {
        return this.f18860xcb94b041[i17];
    }

    /* renamed from: hasFileid */
    public boolean m39108xd8f936d1() {
        return m39107x6e095e9(3);
    }

    /* renamed from: hasFiletype */
    public boolean m39109x7f8c2370() {
        return m39107x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955 m39110x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 c4454x1f7af1 = this.f18857x2e06d1;
            if (c4454x1f7af1 != null && this.f18860xcb94b041[1]) {
                fVar.i(1, c4454x1f7af1.mo75928xcd1e8d8());
                this.f18857x2e06d1.mo75956x3d5d1f78(fVar);
            }
            if (this.f18860xcb94b041[2]) {
                fVar.e(2, this.f18859xd43766b6);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 c4487x363e7af6 = this.f18858xb4089397;
            if (c4487x363e7af6 != null && this.f18860xcb94b041[3]) {
                fVar.i(3, c4487x363e7af6.mo75928xcd1e8d8());
                this.f18858xb4089397.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 c4454x1f7af12 = this.f18857x2e06d1;
            if (c4454x1f7af12 != null && this.f18860xcb94b041[1]) {
                i18 = 0 + b36.f.i(1, c4454x1f7af12.mo75928xcd1e8d8());
            }
            if (this.f18860xcb94b041[2]) {
                i18 += b36.f.e(2, this.f18859xd43766b6);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 c4487x363e7af62 = this.f18858xb4089397;
            return (c4487x363e7af62 == null || !this.f18860xcb94b041[3]) ? i18 : i18 + b36.f.i(3, c4487x363e7af62.mo75928xcd1e8d8());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 c4454x1f7af13 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1();
                if (bArr != null && bArr.length > 0) {
                    c4454x1f7af13.mo11468x92b714fd(bArr);
                }
                this.f18857x2e06d1 = c4454x1f7af13;
            }
            this.f18860xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f18859xd43766b6 = aVar2.g(intValue);
            this.f18860xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 c4487x363e7af63 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6();
            if (bArr2 != null && bArr2.length > 0) {
                c4487x363e7af63.mo11468x92b714fd(bArr2);
            }
            this.f18858xb4089397 = c4487x363e7af63;
        }
        this.f18860xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setBase */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955 m39112x76483653(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 c4454x1f7af1) {
        this.f18857x2e06d1 = c4454x1f7af1;
        this.f18860xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setFileid */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955 m39113xc54ea99(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4487x363e7af6 c4487x363e7af6) {
        this.f18858xb4089397 = c4487x363e7af6;
        this.f18860xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setFiletype */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955 m39114x4aca0538(int i17) {
        this.f18859xd43766b6 = i17;
        this.f18860xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955 m39111x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4500xb3960955) super.mo11468x92b714fd(bArr);
    }
}

package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.C2cResult */
/* loaded from: classes4.dex */
public class C4463x1e9f6f31 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 f18477xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31();

    /* renamed from: hasSetFields */
    private final boolean[] f18478xcb94b041 = new boolean[7];

    /* renamed from: hitcache_type */
    private int f18479x867471aa;

    /* renamed from: is_reduced_video */
    private boolean f18480x67117665;

    /* renamed from: is_safecdn */
    private boolean f18481xc82c636b;

    /* renamed from: sendmsg_from_cdn */
    private boolean f18482x2eb9109e;

    /* renamed from: session_response */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f18483x3464bca;

    /* renamed from: talker */
    private java.lang.String f18484xcb7bc659;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 m38237xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 m38238x7c90cfc0() {
        return f18477xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 m38239x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 m38240x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 c4463x1e9f6f31 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f18479x867471aa), java.lang.Integer.valueOf(c4463x1e9f6f31.f18479x867471aa)) && n51.f.a(this.f18483x3464bca, c4463x1e9f6f31.f18483x3464bca) && n51.f.a(java.lang.Boolean.valueOf(this.f18482x2eb9109e), java.lang.Boolean.valueOf(c4463x1e9f6f31.f18482x2eb9109e)) && n51.f.a(java.lang.Boolean.valueOf(this.f18480x67117665), java.lang.Boolean.valueOf(c4463x1e9f6f31.f18480x67117665)) && n51.f.a(java.lang.Boolean.valueOf(this.f18481xc82c636b), java.lang.Boolean.valueOf(c4463x1e9f6f31.f18481xc82c636b)) && n51.f.a(this.f18484xcb7bc659, c4463x1e9f6f31.f18484xcb7bc659);
    }

    /* renamed from: getHitcacheType */
    public int m38241x2333761f() {
        return this.f18479x867471aa;
    }

    /* renamed from: getIsReducedVideo */
    public boolean m38242xd6ff529d() {
        return this.f18480x67117665;
    }

    /* renamed from: getIsSafecdn */
    public boolean m38243x4b9e3240() {
        return this.f18481xc82c636b;
    }

    /* renamed from: getSendmsgFromCdn */
    public boolean m38244x9ffd57e0() {
        return this.f18482x2eb9109e;
    }

    /* renamed from: getSessionResponse */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m38245x9abad6c1() {
        return this.f18478xcb94b041[2] ? this.f18483x3464bca : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getTalker */
    public java.lang.String m38246x3092e94f() {
        return this.f18478xcb94b041[6] ? this.f18484xcb7bc659 : "";
    }

    /* renamed from: hasFieldNumber */
    public boolean m38247x6e095e9(int i17) {
        return this.f18478xcb94b041[i17];
    }

    /* renamed from: hasHitcacheType */
    public boolean m38248x714b363() {
        return m38247x6e095e9(1);
    }

    /* renamed from: hasIsReducedVideo */
    public boolean m38249x47864ee1() {
        return m38247x6e095e9(4);
    }

    /* renamed from: hasIsSafecdn */
    public boolean m38250xb739b7c() {
        return m38247x6e095e9(5);
    }

    /* renamed from: hasSendmsgFromCdn */
    public boolean m38251x10845424() {
        return m38247x6e095e9(3);
    }

    /* renamed from: hasSessionResponse */
    public boolean m38252x3b1362fd() {
        return m38247x6e095e9(2);
    }

    /* renamed from: hasTalker */
    public boolean m38253xf06c6993() {
        return m38247x6e095e9(6);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 m38254x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18478xcb94b041[1]) {
                fVar.e(1, this.f18479x867471aa);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f18483x3464bca;
            if (gVar != null && this.f18478xcb94b041[2]) {
                fVar.b(2, gVar);
            }
            if (this.f18478xcb94b041[3]) {
                fVar.a(3, this.f18482x2eb9109e);
            }
            if (this.f18478xcb94b041[4]) {
                fVar.a(4, this.f18480x67117665);
            }
            if (this.f18478xcb94b041[5]) {
                fVar.a(5, this.f18481xc82c636b);
            }
            java.lang.String str = this.f18484xcb7bc659;
            if (str != null && this.f18478xcb94b041[6]) {
                fVar.j(6, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f18478xcb94b041[1] ? 0 + b36.f.e(1, this.f18479x867471aa) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f18483x3464bca;
            if (gVar2 != null && this.f18478xcb94b041[2]) {
                e17 += b36.f.b(2, gVar2);
            }
            if (this.f18478xcb94b041[3]) {
                e17 += b36.f.a(3, this.f18482x2eb9109e);
            }
            if (this.f18478xcb94b041[4]) {
                e17 += b36.f.a(4, this.f18480x67117665);
            }
            if (this.f18478xcb94b041[5]) {
                e17 += b36.f.a(5, this.f18481xc82c636b);
            }
            java.lang.String str2 = this.f18484xcb7bc659;
            return (str2 == null || !this.f18478xcb94b041[6]) ? e17 : e17 + b36.f.j(6, str2);
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
                this.f18479x867471aa = aVar2.g(intValue);
                this.f18478xcb94b041[1] = true;
                return 0;
            case 2:
                this.f18483x3464bca = aVar2.d(intValue);
                this.f18478xcb94b041[2] = true;
                return 0;
            case 3:
                this.f18482x2eb9109e = aVar2.c(intValue);
                this.f18478xcb94b041[3] = true;
                return 0;
            case 4:
                this.f18480x67117665 = aVar2.c(intValue);
                this.f18478xcb94b041[4] = true;
                return 0;
            case 5:
                this.f18481xc82c636b = aVar2.c(intValue);
                this.f18478xcb94b041[5] = true;
                return 0;
            case 6:
                this.f18484xcb7bc659 = aVar2.k(intValue);
                this.f18478xcb94b041[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setHitcacheType */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 m38256x597c712b(int i17) {
        this.f18479x867471aa = i17;
        this.f18478xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setIsReducedVideo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 m38257x9ef5baa9(boolean z17) {
        this.f18480x67117665 = z17;
        this.f18478xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setIsSafecdn */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 m38258xa7f1f2b4(boolean z17) {
        this.f18481xc82c636b = z17;
        this.f18478xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setSendmsgFromCdn */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 m38259x67f3bfec(boolean z17) {
        this.f18482x2eb9109e = z17;
        this.f18478xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setSessionResponse */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 m38260xd1917035(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f18483x3464bca = gVar;
        this.f18478xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setTalker */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 m38261x23c81d5b(java.lang.String str) {
        this.f18484xcb7bc659 = str;
        this.f18478xcb94b041[6] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 m38255x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4463x1e9f6f31) super.mo11468x92b714fd(bArr);
    }
}

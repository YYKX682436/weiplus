package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.StatusReadUserRecord */
/* loaded from: classes2.dex */
public class C27544x21b1b2e4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4 f60532xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4();

    /* renamed from: hasSetFields */
    private final boolean[] f60533xcb94b041 = new boolean[4];

    /* renamed from: read_time */
    private long f60534xbda23fd6;

    /* renamed from: status_id */
    private java.lang.String f60535x849b4488;

    /* renamed from: username */
    private java.lang.String f60536xf02988d6;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4 m117453xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4 m117454x7c90cfc0() {
        return f60532xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4 m117455x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4 m117456x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4 c27544x21b1b2e4 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4) fVar;
        return n51.f.a(this.f60535x849b4488, c27544x21b1b2e4.f60535x849b4488) && n51.f.a(this.f60536xf02988d6, c27544x21b1b2e4.f60536xf02988d6) && n51.f.a(java.lang.Long.valueOf(this.f60534xbda23fd6), java.lang.Long.valueOf(c27544x21b1b2e4.f60534xbda23fd6));
    }

    /* renamed from: getReadTime */
    public long m117457x4824a2f9() {
        return this.f60534xbda23fd6;
    }

    /* renamed from: getStatusId */
    public java.lang.String m117458xca73e223() {
        return this.f60533xcb94b041[3] ? this.f60535x849b4488 : "";
    }

    /* renamed from: getUsername */
    public java.lang.String m117459x6c03c64c() {
        return this.f60533xcb94b041[1] ? this.f60536xf02988d6 : "";
    }

    /* renamed from: hasFieldNumber */
    public boolean m117460x6e095e9(int i17) {
        return this.f60533xcb94b041[i17];
    }

    /* renamed from: hasReadTime */
    public boolean m117461x779f223d() {
        return m117460x6e095e9(2);
    }

    /* renamed from: hasStatusId */
    public boolean m117462xf9ee6167() {
        return m117460x6e095e9(3);
    }

    /* renamed from: hasUsername */
    public boolean m117463x9b7e4590() {
        return m117460x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4 m117464x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f60535x849b4488;
            if (str != null && this.f60533xcb94b041[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f60536xf02988d6;
            if (str2 != null && this.f60533xcb94b041[1]) {
                fVar.j(1, str2);
            }
            if (this.f60533xcb94b041[2]) {
                fVar.h(2, this.f60534xbda23fd6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f60535x849b4488;
            if (str3 != null && this.f60533xcb94b041[3]) {
                i18 = 0 + b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f60536xf02988d6;
            if (str4 != null && this.f60533xcb94b041[1]) {
                i18 += b36.f.j(1, str4);
            }
            return this.f60533xcb94b041[2] ? i18 + b36.f.h(2, this.f60534xbda23fd6) : i18;
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
            this.f60536xf02988d6 = aVar2.k(intValue);
            this.f60533xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f60534xbda23fd6 = aVar2.i(intValue);
            this.f60533xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f60535x849b4488 = aVar2.k(intValue);
        this.f60533xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setReadTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4 m117466x42dd0405(long j17) {
        this.f60534xbda23fd6 = j17;
        this.f60533xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setStatusId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4 m117467xc52c432f(java.lang.String str) {
        this.f60535x849b4488 = str;
        this.f60533xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setUsername */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4 m117468x66bc2758(java.lang.String str) {
        this.f60536xf02988d6 = str;
        this.f60533xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4 m117465x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4) super.mo11468x92b714fd(bArr);
    }
}

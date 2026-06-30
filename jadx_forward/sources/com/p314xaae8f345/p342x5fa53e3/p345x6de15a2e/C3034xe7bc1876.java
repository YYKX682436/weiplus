package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkC2CBatchSnsReqImageData */
/* loaded from: classes15.dex */
public class C3034xe7bc1876 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876 f10733xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876();

    /* renamed from: decryptKey */
    private long f10734x7b254592;

    /* renamed from: fileKey */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10735xcd096f43;

    /* renamed from: hasSetFields */
    private final boolean[] f10736xcb94b041 = new boolean[8];

    /* renamed from: imageCachePath */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10737xbb7fc3ac;

    /* renamed from: picIndex */
    private int f10738xd219ed68;

    /* renamed from: retry */
    private boolean f10739x67622a8;

    /* renamed from: totalFileSize */
    private long f10740xd5bbe701;
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g url;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876 m23417xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876 m23418x7c90cfc0() {
        return f10733xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876 m23419x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876 m23420x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876 c3034xe7bc1876 = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876) fVar;
        return n51.f.a(this.url, c3034xe7bc1876.url) && n51.f.a(java.lang.Integer.valueOf(this.f10738xd219ed68), java.lang.Integer.valueOf(c3034xe7bc1876.f10738xd219ed68)) && n51.f.a(this.f10737xbb7fc3ac, c3034xe7bc1876.f10737xbb7fc3ac) && n51.f.a(java.lang.Long.valueOf(this.f10734x7b254592), java.lang.Long.valueOf(c3034xe7bc1876.f10734x7b254592)) && n51.f.a(java.lang.Long.valueOf(this.f10740xd5bbe701), java.lang.Long.valueOf(c3034xe7bc1876.f10740xd5bbe701)) && n51.f.a(this.f10735xcd096f43, c3034xe7bc1876.f10735xcd096f43) && n51.f.a(java.lang.Boolean.valueOf(this.f10739x67622a8), java.lang.Boolean.valueOf(c3034xe7bc1876.f10739x67622a8));
    }

    /* renamed from: getDecryptKey */
    public long m23421x6965fd88() {
        return this.f10734x7b254592;
    }

    /* renamed from: getFileKey */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m23422xad6ab0d() {
        return this.f10736xcb94b041[6] ? this.f10735xcd096f43 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getImageCachePath */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m23423xaa1790a2() {
        return this.f10736xcb94b041[3] ? this.f10737xbb7fc3ac : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getPicIndex */
    public int m23424x4df42ade() {
        return this.f10738xd219ed68;
    }

    /* renamed from: getRetry */
    public boolean m23425x7513c8f2() {
        return this.f10739x67622a8;
    }

    /* renamed from: getTotalFileSize */
    public long m23426x931ba34b() {
        return this.f10740xd5bbe701;
    }

    /* renamed from: getUrl */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m23427xb5887639() {
        return this.f10736xcb94b041[1] ? this.url : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: hasDecryptKey */
    public boolean m23428xa43dbbcc() {
        return m23429x6e095e9(4);
    }

    /* renamed from: hasFieldNumber */
    public boolean m23429x6e095e9(int i17) {
        return this.f10736xcb94b041[i17];
    }

    /* renamed from: hasFileKey */
    public boolean m23430x462d3349() {
        return m23429x6e095e9(6);
    }

    /* renamed from: hasImageCachePath */
    public boolean m23431x1a9e8ce6() {
        return m23429x6e095e9(3);
    }

    /* renamed from: hasPicIndex */
    public boolean m23432x7d6eaa22() {
        return m23429x6e095e9(2);
    }

    /* renamed from: hasRetry */
    public boolean m23433x7a7302e() {
        return m23429x6e095e9(7);
    }

    /* renamed from: hasTotalFileSize */
    public boolean m23434x2b620e87() {
        return m23429x6e095e9(5);
    }

    /* renamed from: hasUrl */
    public boolean m23435xb7047c75() {
        return m23429x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876 m23436x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.url;
            if (gVar != null && this.f10736xcb94b041[1]) {
                fVar.b(1, gVar);
            }
            if (this.f10736xcb94b041[2]) {
                fVar.e(2, this.f10738xd219ed68);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10737xbb7fc3ac;
            if (gVar2 != null && this.f10736xcb94b041[3]) {
                fVar.b(3, gVar2);
            }
            if (this.f10736xcb94b041[4]) {
                fVar.h(4, this.f10734x7b254592);
            }
            if (this.f10736xcb94b041[5]) {
                fVar.h(5, this.f10740xd5bbe701);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f10735xcd096f43;
            if (gVar3 != null && this.f10736xcb94b041[6]) {
                fVar.b(6, gVar3);
            }
            if (this.f10736xcb94b041[7]) {
                fVar.a(7, this.f10739x67622a8);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.url;
            if (gVar4 != null && this.f10736xcb94b041[1]) {
                i18 = 0 + b36.f.b(1, gVar4);
            }
            if (this.f10736xcb94b041[2]) {
                i18 += b36.f.e(2, this.f10738xd219ed68);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f10737xbb7fc3ac;
            if (gVar5 != null && this.f10736xcb94b041[3]) {
                i18 += b36.f.b(3, gVar5);
            }
            if (this.f10736xcb94b041[4]) {
                i18 += b36.f.h(4, this.f10734x7b254592);
            }
            if (this.f10736xcb94b041[5]) {
                i18 += b36.f.h(5, this.f10740xd5bbe701);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f10735xcd096f43;
            if (gVar6 != null && this.f10736xcb94b041[6]) {
                i18 += b36.f.b(6, gVar6);
            }
            return this.f10736xcb94b041[7] ? i18 + b36.f.a(7, this.f10739x67622a8) : i18;
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
                this.url = aVar2.d(intValue);
                this.f10736xcb94b041[1] = true;
                return 0;
            case 2:
                this.f10738xd219ed68 = aVar2.g(intValue);
                this.f10736xcb94b041[2] = true;
                return 0;
            case 3:
                this.f10737xbb7fc3ac = aVar2.d(intValue);
                this.f10736xcb94b041[3] = true;
                return 0;
            case 4:
                this.f10734x7b254592 = aVar2.i(intValue);
                this.f10736xcb94b041[4] = true;
                return 0;
            case 5:
                this.f10740xd5bbe701 = aVar2.i(intValue);
                this.f10736xcb94b041[5] = true;
                return 0;
            case 6:
                this.f10735xcd096f43 = aVar2.d(intValue);
                this.f10736xcb94b041[6] = true;
                return 0;
            case 7:
                this.f10739x67622a8 = aVar2.c(intValue);
                this.f10736xcb94b041[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setDecryptKey */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876 m23438x978a4b94(long j17) {
        this.f10734x7b254592 = j17;
        this.f10736xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setFileKey */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876 m23439x7e47f881(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10735xcd096f43 = gVar;
        this.f10736xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setImageCachePath */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876 m23440x720df8ae(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10737xbb7fc3ac = gVar;
        this.f10736xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setPicIndex */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876 m23441x48ac8bea(int i17) {
        this.f10738xd219ed68 = i17;
        this.f10736xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setRetry */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876 m23442x53a1e366(boolean z17) {
        this.f10739x67622a8 = z17;
        this.f10736xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setTotalFileSize */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876 m23443x25f209bf(long j17) {
        this.f10740xd5bbe701 = j17;
        this.f10736xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setUrl */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876 m23444xca029dad(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.url = gVar;
        this.f10736xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876 m23437x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3034xe7bc1876) super.mo11468x92b714fd(bArr);
    }
}

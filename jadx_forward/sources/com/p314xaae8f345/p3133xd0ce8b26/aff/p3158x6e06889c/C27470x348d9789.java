package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.SourceInfo */
/* loaded from: classes8.dex */
public class C27470x348d9789 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789 f60333xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789();

    /* renamed from: source_type */
    public int f60334xfaf4b8de = 0;

    /* renamed from: com.tencent.wechat.aff.newlife.SourceInfo$SourceType */
    /* loaded from: classes6.dex */
    public enum SourceType implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
        NewLife(0),
        WebSearch(1);


        /* renamed from: NewLife_VALUE */
        public static final int f60337x2ab4abee = 0;

        /* renamed from: WebSearch_VALUE */
        public static final int f60339x17edfd4e = 1;

        /* renamed from: value */
        public final int f60340x6ac9171;

        SourceType(int i17) {
            this.f60340x6ac9171 = i17;
        }

        /* renamed from: forNumber */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789.SourceType m116456x382ad972(int i17) {
            if (i17 == 0) {
                return NewLife;
            }
            if (i17 != 1) {
                return null;
            }
            return WebSearch;
        }

        @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
        /* renamed from: getNumber */
        public final int mo11476x276ffe3f() {
            return this.f60340x6ac9171;
        }

        /* renamed from: valueOf */
        public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789.SourceType m116457xdce0328(int i17) {
            return m116456x382ad972(i17);
        }
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789 m116444xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789 m116445x7c90cfc0() {
        return f60333xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789 m116446x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789 m116447x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789) && n51.f.a(java.lang.Integer.valueOf(this.f60334xfaf4b8de), java.lang.Integer.valueOf(((com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789) fVar).f60334xfaf4b8de));
    }

    /* renamed from: getSourceType */
    public int m116448xac019deb() {
        return this.f60334xfaf4b8de;
    }

    /* renamed from: getSource_type */
    public int m116449xd4caffa8() {
        return this.f60334xfaf4b8de;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789 m116450x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).e(1, this.f60334xfaf4b8de);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f60334xfaf4b8de) + 0;
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
        if (intValue != 1) {
            return -1;
        }
        this.f60334xfaf4b8de = aVar2.g(intValue);
        return 0;
    }

    /* renamed from: setSourceType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789 m116452xda25ebf7(int i17) {
        this.f60334xfaf4b8de = i17;
        return this;
    }

    /* renamed from: setSource_type */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789 m116453x6b30731c(int i17) {
        this.f60334xfaf4b8de = i17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789 m116451x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27470x348d9789) super.mo11468x92b714fd(bArr);
    }
}

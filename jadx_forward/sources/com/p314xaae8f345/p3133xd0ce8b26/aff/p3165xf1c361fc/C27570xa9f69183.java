package com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc;

/* renamed from: com.tencent.wechat.aff.websearch.PreRequestContext */
/* loaded from: classes10.dex */
public class C27570xa9f69183 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 f60547xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183();

    /* renamed from: cache_timeout */
    private int f60548xb68101a4;

    /* renamed from: hasSetFields */
    private final boolean[] f60549xcb94b041 = new boolean[5];

    /* renamed from: is_infer_request */
    private boolean f60550x5e362949;

    /* renamed from: is_pre_request */
    private boolean f60551xdd60f55e;

    /* renamed from: need_cache */
    private boolean f60552xc4115299;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 m117677xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 m117678x7c90cfc0() {
        return f60547xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 m117679x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 m117680x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 c27570xa9f69183 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f60551xdd60f55e), java.lang.Boolean.valueOf(c27570xa9f69183.f60551xdd60f55e)) && n51.f.a(java.lang.Boolean.valueOf(this.f60552xc4115299), java.lang.Boolean.valueOf(c27570xa9f69183.f60552xc4115299)) && n51.f.a(java.lang.Integer.valueOf(this.f60548xb68101a4), java.lang.Integer.valueOf(c27570xa9f69183.f60548xb68101a4)) && n51.f.a(java.lang.Boolean.valueOf(this.f60550x5e362949), java.lang.Boolean.valueOf(c27570xa9f69183.f60550x5e362949));
    }

    /* renamed from: getCacheTimeout */
    public int m117681x8a3fb1f5() {
        return this.f60548xb68101a4;
    }

    /* renamed from: getIsInferRequest */
    public boolean m117682x9e68c5a1() {
        return this.f60550x5e362949;
    }

    /* renamed from: getIsPreRequest */
    public boolean m117683x6956b9ac() {
        return this.f60551xdd60f55e;
    }

    /* renamed from: getNeedCache */
    public boolean m117684x3e0395d6() {
        return this.f60552xc4115299;
    }

    /* renamed from: hasCacheTimeout */
    public boolean m117685x6e20ef39() {
        return m117686x6e095e9(3);
    }

    /* renamed from: hasFieldNumber */
    public boolean m117686x6e095e9(int i17) {
        return this.f60549xcb94b041[i17];
    }

    /* renamed from: hasIsInferRequest */
    public boolean m117687xeefc1e5() {
        return m117686x6e095e9(4);
    }

    /* renamed from: hasIsPreRequest */
    public boolean m117688x4d37f6f0() {
        return m117686x6e095e9(1);
    }

    /* renamed from: hasNeedCache */
    public boolean m117689xfdd8ff12() {
        return m117686x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 m117690x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f60549xcb94b041[1]) {
                fVar.a(1, this.f60551xdd60f55e);
            }
            if (this.f60549xcb94b041[2]) {
                fVar.a(2, this.f60552xc4115299);
            }
            if (this.f60549xcb94b041[3]) {
                fVar.e(3, this.f60548xb68101a4);
            }
            if (this.f60549xcb94b041[4]) {
                fVar.a(4, this.f60550x5e362949);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = this.f60549xcb94b041[1] ? 0 + b36.f.a(1, this.f60551xdd60f55e) : 0;
            if (this.f60549xcb94b041[2]) {
                a17 += b36.f.a(2, this.f60552xc4115299);
            }
            if (this.f60549xcb94b041[3]) {
                a17 += b36.f.e(3, this.f60548xb68101a4);
            }
            return this.f60549xcb94b041[4] ? a17 + b36.f.a(4, this.f60550x5e362949) : a17;
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
            this.f60551xdd60f55e = aVar2.c(intValue);
            this.f60549xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f60552xc4115299 = aVar2.c(intValue);
            this.f60549xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f60548xb68101a4 = aVar2.g(intValue);
            this.f60549xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f60550x5e362949 = aVar2.c(intValue);
        this.f60549xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setCacheTimeout */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 m117692xc088ad01(int i17) {
        this.f60548xb68101a4 = i17;
        this.f60549xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setIsInferRequest */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 m117693x665f2dad(boolean z17) {
        this.f60550x5e362949 = z17;
        this.f60549xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setIsPreRequest */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 m117694x9f9fb4b8(boolean z17) {
        this.f60551xdd60f55e = z17;
        this.f60549xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setNeedCache */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 m117695x9a57564a(boolean z17) {
        this.f60552xc4115299 = z17;
        this.f60549xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 m117691x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183) super.mo11468x92b714fd(bArr);
    }
}

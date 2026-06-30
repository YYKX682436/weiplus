package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkGetOAuthCodeResponse */
/* loaded from: classes2.dex */
public class C2997xddc00552 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552 f10389xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552();

    /* renamed from: hasSetFields */
    private final boolean[] f10390xcb94b041 = new boolean[2];

    /* renamed from: oauth_code */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10391x42e3de95;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552 m22780xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552 m22781x7c90cfc0() {
        return f10389xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552 m22782x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552 m22783x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552) && n51.f.a(this.f10391x42e3de95, ((com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552) fVar).f10391x42e3de95);
    }

    /* renamed from: getOauthCode */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22784x9e707e6e() {
        return this.f10390xcb94b041[1] ? this.f10391x42e3de95 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: hasFieldNumber */
    public boolean m22785x6e095e9(int i17) {
        return this.f10390xcb94b041[i17];
    }

    /* renamed from: hasOauthCode */
    public boolean m22786x5e45e7aa() {
        return m22785x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552 m22787x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10391x42e3de95;
            if (gVar != null && this.f10390xcb94b041[1]) {
                fVar.b(1, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10391x42e3de95;
            if (gVar2 == null || !this.f10390xcb94b041[1]) {
                return 0;
            }
            return 0 + b36.f.b(1, gVar2);
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
        this.f10391x42e3de95 = aVar2.d(intValue);
        this.f10390xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setOauthCode */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552 m22789xfac43ee2(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10391x42e3de95 = gVar;
        this.f10390xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552 m22788x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2997xddc00552) super.mo11468x92b714fd(bArr);
    }
}

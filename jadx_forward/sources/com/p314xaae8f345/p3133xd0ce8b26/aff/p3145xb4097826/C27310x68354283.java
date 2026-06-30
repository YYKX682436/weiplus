package com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826;

/* renamed from: com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse */
/* loaded from: classes2.dex */
public class C27310x68354283 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27310x68354283 f59626xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27310x68354283();

    /* renamed from: body */
    public java.lang.String f59627x2e39a2 = "";

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27310x68354283 m112833xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27310x68354283();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27310x68354283 m112834x7c90cfc0() {
        return f59626xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27310x68354283 m112835x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27310x68354283();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27310x68354283 m112836x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27310x68354283) && n51.f.a(this.f59627x2e39a2, ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27310x68354283) fVar).f59627x2e39a2);
    }

    /* renamed from: getBody */
    public java.lang.String m112837xfb7da218() {
        return this.f59627x2e39a2;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27310x68354283 m112838x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27310x68354283();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f59627x2e39a2;
            if (str != null) {
                fVar.j(1, str);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f59627x2e39a2;
            if (str2 != null) {
                return 0 + b36.f.j(1, str2);
            }
            return 0;
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
        this.f59627x2e39a2 = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setBody */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27310x68354283 m112840x76486924(java.lang.String str) {
        this.f59627x2e39a2 = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27310x68354283 m112839x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27310x68354283 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27310x68354283) super.mo11468x92b714fd(bArr);
    }
}

package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkEchoResponse */
/* loaded from: classes2.dex */
public class C2987xe16f18e9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2987xe16f18e9 f10341xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2987xe16f18e9();

    /* renamed from: body */
    private java.lang.String f10342x2e39a2;

    /* renamed from: hasSetFields */
    private final boolean[] f10343xcb94b041 = new boolean[2];

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2987xe16f18e9 m22616xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2987xe16f18e9();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2987xe16f18e9 m22617x7c90cfc0() {
        return f10341xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2987xe16f18e9 m22618x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2987xe16f18e9();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2987xe16f18e9 m22619x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2987xe16f18e9) && n51.f.a(this.f10342x2e39a2, ((com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2987xe16f18e9) fVar).f10342x2e39a2);
    }

    /* renamed from: getBody */
    public java.lang.String m22620xfb7da218() {
        return this.f10343xcb94b041[1] ? this.f10342x2e39a2 : "";
    }

    /* renamed from: hasBody */
    public boolean m22621x2982635c() {
        return m22622x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m22622x6e095e9(int i17) {
        return this.f10343xcb94b041[i17];
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2987xe16f18e9 m22623x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2987xe16f18e9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f10342x2e39a2;
            if (str != null && this.f10343xcb94b041[1]) {
                fVar.j(1, str);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f10342x2e39a2;
            if (str2 == null || !this.f10343xcb94b041[1]) {
                return 0;
            }
            return 0 + b36.f.j(1, str2);
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
        this.f10342x2e39a2 = aVar2.k(intValue);
        this.f10343xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setBody */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2987xe16f18e9 m22625x76486924(java.lang.String str) {
        this.f10342x2e39a2 = str;
        this.f10343xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2987xe16f18e9 m22624x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2987xe16f18e9 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2987xe16f18e9) super.mo11468x92b714fd(bArr);
    }
}

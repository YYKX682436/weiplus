package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkGetLoginQrCodeRequest */
/* loaded from: classes2.dex */
public class C2994x27fa9c0b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b f10379xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b();

    /* renamed from: confirm_business_info */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10380xc18d1e8e;

    /* renamed from: hasSetFields */
    private final boolean[] f10381xcb94b041 = new boolean[3];

    /* renamed from: qrcode_verify_scene */
    private int f10382xf9fd6257;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b m22744xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b m22745x7c90cfc0() {
        return f10379xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b m22746x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b m22747x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b c2994x27fa9c0b = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f10382xf9fd6257), java.lang.Integer.valueOf(c2994x27fa9c0b.f10382xf9fd6257)) && n51.f.a(this.f10380xc18d1e8e, c2994x27fa9c0b.f10380xc18d1e8e);
    }

    /* renamed from: getConfirmBusinessInfo */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22748x84a9b038() {
        return this.f10381xcb94b041[2] ? this.f10380xc18d1e8e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getQrcodeVerifyScene */
    public int m22749x33064a6f() {
        return this.f10382xf9fd6257;
    }

    /* renamed from: hasConfirmBusinessInfo */
    public boolean m22750xf129be74() {
        return m22751x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m22751x6e095e9(int i17) {
        return this.f10381xcb94b041[i17];
    }

    /* renamed from: hasQrcodeVerifyScene */
    public boolean m22752x1f6cb7ab() {
        return m22751x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b m22753x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f10381xcb94b041[1]) {
                fVar.e(1, this.f10382xf9fd6257);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10380xc18d1e8e;
            if (gVar != null && this.f10381xcb94b041[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f10381xcb94b041[1] ? 0 + b36.f.e(1, this.f10382xf9fd6257) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10380xc18d1e8e;
            return (gVar2 == null || !this.f10381xcb94b041[2]) ? e17 : e17 + b36.f.b(2, gVar2);
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
            this.f10382xf9fd6257 = aVar2.g(intValue);
            this.f10381xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f10380xc18d1e8e = aVar2.d(intValue);
        this.f10381xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setConfirmBusinessInfo */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b m22755xd2ee6fac(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10380xc18d1e8e = gVar;
        this.f10381xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setQrcodeVerifyScene */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b m22756xe9c56e3(int i17) {
        this.f10382xf9fd6257 = i17;
        this.f10381xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b m22754x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2994x27fa9c0b) super.mo11468x92b714fd(bArr);
    }
}

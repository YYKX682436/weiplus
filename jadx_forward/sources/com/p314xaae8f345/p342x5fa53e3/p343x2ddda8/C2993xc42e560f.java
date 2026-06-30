package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkFaceRecognizeResponse */
/* loaded from: classes8.dex */
public class C2993xc42e560f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f f10374xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f();

    /* renamed from: hasSetFields */
    private final boolean[] f10375xcb94b041 = new boolean[4];

    /* renamed from: pass_type */
    private com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2975x2103d429 f10376xc75dc6a8;

    /* renamed from: wxbase_resp */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10377x4c76c6bd;

    /* renamed from: wxpay_resp */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10378x5fe22ae8;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f m22727xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f m22728x7c90cfc0() {
        return f10374xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f m22729x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f m22730x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f c2993xc42e560f = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f) fVar;
        return n51.f.a(this.f10377x4c76c6bd, c2993xc42e560f.f10377x4c76c6bd) && n51.f.a(this.f10378x5fe22ae8, c2993xc42e560f.f10378x5fe22ae8) && n51.f.a(this.f10376xc75dc6a8, c2993xc42e560f.f10376xc75dc6a8);
    }

    /* renamed from: getPassType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2975x2103d429 m22731xc4543461() {
        return this.f10375xcb94b041[3] ? this.f10376xc75dc6a8 : com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2975x2103d429.kFaceRecognizeTypeRes_Non;
    }

    /* renamed from: getWxbaseResp */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22732x95db5c18() {
        return this.f10375xcb94b041[1] ? this.f10377x4c76c6bd : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getWxpayResp */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22733x6dd9ffe1() {
        return this.f10375xcb94b041[2] ? this.f10378x5fe22ae8 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: hasFieldNumber */
    public boolean m22734x6e095e9(int i17) {
        return this.f10375xcb94b041[i17];
    }

    /* renamed from: hasPassType */
    public boolean m22735xf3ceb3a5() {
        return m22734x6e095e9(3);
    }

    /* renamed from: hasWxbaseResp */
    public boolean m22736xd0b31a5c() {
        return m22734x6e095e9(1);
    }

    /* renamed from: hasWxpayResp */
    public boolean m22737x2daf691d() {
        return m22734x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f m22738x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10377x4c76c6bd;
            if (gVar != null && this.f10375xcb94b041[1]) {
                fVar.b(1, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10378x5fe22ae8;
            if (gVar2 != null && this.f10375xcb94b041[2]) {
                fVar.b(2, gVar2);
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2975x2103d429 enumC2975x2103d429 = this.f10376xc75dc6a8;
            if (enumC2975x2103d429 != null && this.f10375xcb94b041[3]) {
                fVar.e(3, enumC2975x2103d429.f10241x6ac9171);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f10377x4c76c6bd;
            if (gVar3 != null && this.f10375xcb94b041[1]) {
                i18 = 0 + b36.f.b(1, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f10378x5fe22ae8;
            if (gVar4 != null && this.f10375xcb94b041[2]) {
                i18 += b36.f.b(2, gVar4);
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2975x2103d429 enumC2975x2103d4292 = this.f10376xc75dc6a8;
            return (enumC2975x2103d4292 == null || !this.f10375xcb94b041[3]) ? i18 : i18 + b36.f.e(3, enumC2975x2103d4292.f10241x6ac9171);
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
            this.f10377x4c76c6bd = aVar2.d(intValue);
            this.f10375xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f10378x5fe22ae8 = aVar2.d(intValue);
            this.f10375xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f10376xc75dc6a8 = com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2975x2103d429.m22447x382ad972(aVar2.g(intValue));
        this.f10375xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setPassType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f m22740xbf0c956d(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2975x2103d429 enumC2975x2103d429) {
        this.f10376xc75dc6a8 = enumC2975x2103d429;
        this.f10375xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setWxbaseResp */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f m22741xc3ffaa24(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10377x4c76c6bd = gVar;
        this.f10375xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setWxpayResp */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f m22742xca2dc055(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10378x5fe22ae8 = gVar;
        this.f10375xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f m22739x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2993xc42e560f) super.mo11468x92b714fd(bArr);
    }
}

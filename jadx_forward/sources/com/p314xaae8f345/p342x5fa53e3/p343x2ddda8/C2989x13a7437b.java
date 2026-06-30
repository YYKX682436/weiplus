package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkFaceExtVerifyResponse */
/* loaded from: classes8.dex */
public class C2989x13a7437b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b f10351xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b();

    /* renamed from: business_resp */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10352x258d2cef;

    /* renamed from: hasSetFields */
    private final boolean[] f10353xcb94b041 = new boolean[4];

    /* renamed from: pass_type */
    private com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2975x2103d429 f10354xc75dc6a8;

    /* renamed from: type */
    private com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7 f10355x368f3a;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b m22650xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b m22651x7c90cfc0() {
        return f10351xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b m22652x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b m22653x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b c2989x13a7437b = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b) fVar;
        return n51.f.a(this.f10355x368f3a, c2989x13a7437b.f10355x368f3a) && n51.f.a(this.f10354xc75dc6a8, c2989x13a7437b.f10354xc75dc6a8) && n51.f.a(this.f10352x258d2cef, c2989x13a7437b.f10352x258d2cef);
    }

    /* renamed from: getBusinessResp */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22654x38d84226() {
        return this.f10353xcb94b041[3] ? this.f10352x258d2cef : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getPassType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2975x2103d429 m22655xc4543461() {
        return this.f10353xcb94b041[2] ? this.f10354xc75dc6a8 : com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2975x2103d429.kFaceRecognizeTypeRes_Non;
    }

    /* renamed from: getType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7 m22656xfb85f7b0() {
        return this.f10353xcb94b041[1] ? this.f10355x368f3a : com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7.kFaceExtVerifyType_WxBase_Begin;
    }

    /* renamed from: hasBusinessResp */
    public boolean m22657x1cb97f6a() {
        return m22658x6e095e9(3);
    }

    /* renamed from: hasFieldNumber */
    public boolean m22658x6e095e9(int i17) {
        return this.f10353xcb94b041[i17];
    }

    /* renamed from: hasPassType */
    public boolean m22659xf3ceb3a5() {
        return m22658x6e095e9(2);
    }

    /* renamed from: hasType */
    public boolean m22660x298ab8f4() {
        return m22658x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b m22661x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7 enumC2973xf88930d7 = this.f10355x368f3a;
            if (enumC2973xf88930d7 != null && this.f10353xcb94b041[1]) {
                fVar.e(1, enumC2973xf88930d7.f10226x6ac9171);
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2975x2103d429 enumC2975x2103d429 = this.f10354xc75dc6a8;
            if (enumC2975x2103d429 != null && this.f10353xcb94b041[2]) {
                fVar.e(2, enumC2975x2103d429.f10241x6ac9171);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10352x258d2cef;
            if (gVar != null && this.f10353xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7 enumC2973xf88930d72 = this.f10355x368f3a;
            if (enumC2973xf88930d72 != null && this.f10353xcb94b041[1]) {
                i18 = 0 + b36.f.e(1, enumC2973xf88930d72.f10226x6ac9171);
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2975x2103d429 enumC2975x2103d4292 = this.f10354xc75dc6a8;
            if (enumC2975x2103d4292 != null && this.f10353xcb94b041[2]) {
                i18 += b36.f.e(2, enumC2975x2103d4292.f10241x6ac9171);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10352x258d2cef;
            return (gVar2 == null || !this.f10353xcb94b041[3]) ? i18 : i18 + b36.f.b(3, gVar2);
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
            this.f10355x368f3a = com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7.m22420x382ad972(aVar2.g(intValue));
            this.f10353xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f10354xc75dc6a8 = com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2975x2103d429.m22447x382ad972(aVar2.g(intValue));
            this.f10353xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f10352x258d2cef = aVar2.d(intValue);
        this.f10353xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setBusinessResp */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b m22663x6f213d32(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10352x258d2cef = gVar;
        this.f10353xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setPassType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b m22664xbf0c956d(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2975x2103d429 enumC2975x2103d429) {
        this.f10354xc75dc6a8 = enumC2975x2103d429;
        this.f10353xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b m22665x7650bebc(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7 enumC2973xf88930d7) {
        this.f10355x368f3a = enumC2973xf88930d7;
        this.f10353xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b m22662x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2989x13a7437b) super.mo11468x92b714fd(bArr);
    }
}

package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkFaceExtVerifyRequest */
/* loaded from: classes8.dex */
public class C2988x5b5ef415 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415 f10344xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415();

    /* renamed from: business_req */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10345xd7ebc79f;

    /* renamed from: business_type */
    private com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2970xe1b2373a f10346x258e6059;

    /* renamed from: hasSetFields */
    private final boolean[] f10347xcb94b041 = new boolean[6];

    /* renamed from: retry_count */
    private int f10348xc8af38b8;

    /* renamed from: timeout_ms */
    private int f10349x5f1f1d44;

    /* renamed from: type */
    private com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7 f10350x368f3a;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415 m22627xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415 m22628x7c90cfc0() {
        return f10344xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415 m22629x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415 m22630x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415 c2988x5b5ef415 = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f10349x5f1f1d44), java.lang.Integer.valueOf(c2988x5b5ef415.f10349x5f1f1d44)) && n51.f.a(this.f10350x368f3a, c2988x5b5ef415.f10350x368f3a) && n51.f.a(this.f10346x258e6059, c2988x5b5ef415.f10346x258e6059) && n51.f.a(this.f10345xd7ebc79f, c2988x5b5ef415.f10345xd7ebc79f) && n51.f.a(java.lang.Integer.valueOf(this.f10348xc8af38b8), java.lang.Integer.valueOf(c2988x5b5ef415.f10348xc8af38b8));
    }

    /* renamed from: getBusinessReq */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22631x22ddaf88() {
        return this.f10347xcb94b041[4] ? this.f10345xd7ebc79f : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getBusinessType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2970xe1b2373a m22632x38d97590() {
        return this.f10347xcb94b041[3] ? this.f10346x258e6059 : com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2970xe1b2373a.kBusinessTypeUnknown;
    }

    /* renamed from: getRetryCount */
    public int m22633xa8e25f3d() {
        return this.f10348xc8af38b8;
    }

    /* renamed from: getTimeoutMs */
    public int m22634x27ef431() {
        return this.f10349x5f1f1d44;
    }

    /* renamed from: getType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7 m22635xfb85f7b0() {
        return this.f10347xcb94b041[2] ? this.f10350x368f3a : com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7.kFaceExtVerifyType_WxBase_Begin;
    }

    /* renamed from: hasBusinessReq */
    public boolean m22636x42fdb9c4() {
        return m22638x6e095e9(4);
    }

    /* renamed from: hasBusinessType */
    public boolean m22637x1cbab2d4() {
        return m22638x6e095e9(3);
    }

    /* renamed from: hasFieldNumber */
    public boolean m22638x6e095e9(int i17) {
        return this.f10347xcb94b041[i17];
    }

    /* renamed from: hasRetryCount */
    public boolean m22639xe3ba1d81() {
        return m22638x6e095e9(5);
    }

    /* renamed from: hasTimeoutMs */
    public boolean m22640xc2545d6d() {
        return m22638x6e095e9(1);
    }

    /* renamed from: hasType */
    public boolean m22641x298ab8f4() {
        return m22638x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415 m22642x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f10347xcb94b041[1]) {
                fVar.e(1, this.f10349x5f1f1d44);
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7 enumC2973xf88930d7 = this.f10350x368f3a;
            if (enumC2973xf88930d7 != null && this.f10347xcb94b041[2]) {
                fVar.e(2, enumC2973xf88930d7.f10226x6ac9171);
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2970xe1b2373a enumC2970xe1b2373a = this.f10346x258e6059;
            if (enumC2970xe1b2373a != null && this.f10347xcb94b041[3]) {
                fVar.e(3, enumC2970xe1b2373a.f10193x6ac9171);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10345xd7ebc79f;
            if (gVar != null && this.f10347xcb94b041[4]) {
                fVar.b(4, gVar);
            }
            if (this.f10347xcb94b041[5]) {
                fVar.e(5, this.f10348xc8af38b8);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f10347xcb94b041[1] ? 0 + b36.f.e(1, this.f10349x5f1f1d44) : 0;
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7 enumC2973xf88930d72 = this.f10350x368f3a;
            if (enumC2973xf88930d72 != null && this.f10347xcb94b041[2]) {
                e17 += b36.f.e(2, enumC2973xf88930d72.f10226x6ac9171);
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2970xe1b2373a enumC2970xe1b2373a2 = this.f10346x258e6059;
            if (enumC2970xe1b2373a2 != null && this.f10347xcb94b041[3]) {
                e17 += b36.f.e(3, enumC2970xe1b2373a2.f10193x6ac9171);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10345xd7ebc79f;
            if (gVar2 != null && this.f10347xcb94b041[4]) {
                e17 += b36.f.b(4, gVar2);
            }
            return this.f10347xcb94b041[5] ? e17 + b36.f.e(5, this.f10348xc8af38b8) : e17;
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
            this.f10349x5f1f1d44 = aVar2.g(intValue);
            this.f10347xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f10350x368f3a = com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7.m22420x382ad972(aVar2.g(intValue));
            this.f10347xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f10346x258e6059 = com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2970xe1b2373a.m22383x382ad972(aVar2.g(intValue));
            this.f10347xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f10345xd7ebc79f = aVar2.d(intValue);
            this.f10347xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f10348xc8af38b8 = aVar2.g(intValue);
        this.f10347xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setBusinessReq */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415 m22644xb94322fc(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10345xd7ebc79f = gVar;
        this.f10347xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setBusinessType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415 m22645x6f22709c(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2970xe1b2373a enumC2970xe1b2373a) {
        this.f10346x258e6059 = enumC2970xe1b2373a;
        this.f10347xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setRetryCount */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415 m22646xd706ad49(int i17) {
        this.f10348xc8af38b8 = i17;
        this.f10347xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setTimeoutMs */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415 m22647x5ed2b4a5(int i17) {
        this.f10349x5f1f1d44 = i17;
        this.f10347xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415 m22648x7650bebc(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2973xf88930d7 enumC2973xf88930d7) {
        this.f10350x368f3a = enumC2973xf88930d7;
        this.f10347xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415 m22643x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2988x5b5ef415) super.mo11468x92b714fd(bArr);
    }
}

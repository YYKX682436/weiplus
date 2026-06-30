package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkDeviceLoginRequest */
/* loaded from: classes2.dex */
public class C2984x1a50997f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f f10324xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f();

    /* renamed from: device_auth_type */
    private int f10325x36c658c8;

    /* renamed from: device_id */
    private java.lang.String f10326x180aba4;

    /* renamed from: device_signature */
    private java.lang.String f10327x1fb03e0f;

    /* renamed from: device_signature_timestamp */
    private int f10328xaeb5ae6;

    /* renamed from: device_signature_version */
    private int f10329x541982a8;

    /* renamed from: hasSetFields */
    private final boolean[] f10330xcb94b041 = new boolean[7];

    /* renamed from: product_id */
    private int f10331x687cca6b;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f m22559xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f m22560x7c90cfc0() {
        return f10324xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f m22561x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f m22562x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f c2984x1a50997f = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f10331x687cca6b), java.lang.Integer.valueOf(c2984x1a50997f.f10331x687cca6b)) && n51.f.a(this.f10326x180aba4, c2984x1a50997f.f10326x180aba4) && n51.f.a(this.f10327x1fb03e0f, c2984x1a50997f.f10327x1fb03e0f) && n51.f.a(java.lang.Integer.valueOf(this.f10325x36c658c8), java.lang.Integer.valueOf(c2984x1a50997f.f10325x36c658c8)) && n51.f.a(java.lang.Integer.valueOf(this.f10329x541982a8), java.lang.Integer.valueOf(c2984x1a50997f.f10329x541982a8)) && n51.f.a(java.lang.Integer.valueOf(this.f10328xaeb5ae6), java.lang.Integer.valueOf(c2984x1a50997f.f10328xaeb5ae6));
    }

    /* renamed from: getDeviceAuthType */
    public int m22563x313b666e() {
        return this.f10325x36c658c8;
    }

    /* renamed from: getDeviceId */
    public java.lang.String m22564xbdf72787() {
        return this.f10330xcb94b041[2] ? this.f10326x180aba4 : "";
    }

    /* renamed from: getDeviceSignature */
    public java.lang.String m22565xdfb42ccc() {
        return this.f10330xcb94b041[3] ? this.f10327x1fb03e0f : "";
    }

    /* renamed from: getDeviceSignatureTimestamp */
    public int m22566x4f7ec1aa() {
        return this.f10328xaeb5ae6;
    }

    /* renamed from: getDeviceSignatureVersion */
    public int m22567xc11fca6c() {
        return this.f10329x541982a8;
    }

    /* renamed from: getProductId */
    public int m22568xc0bbc7b4() {
        return this.f10331x687cca6b;
    }

    /* renamed from: hasDeviceAuthType */
    public boolean m22569xa1c262b2() {
        return m22574x6e095e9(4);
    }

    /* renamed from: hasDeviceId */
    public boolean m22570xed71a6cb() {
        return m22574x6e095e9(2);
    }

    /* renamed from: hasDeviceSignature */
    public boolean m22571x800cb908() {
        return m22574x6e095e9(3);
    }

    /* renamed from: hasDeviceSignatureTimestamp */
    public boolean m22572xfd3a38ee() {
        return m22574x6e095e9(6);
    }

    /* renamed from: hasDeviceSignatureVersion */
    public boolean m22573xb1842b0() {
        return m22574x6e095e9(5);
    }

    /* renamed from: hasFieldNumber */
    public boolean m22574x6e095e9(int i17) {
        return this.f10330xcb94b041[i17];
    }

    /* renamed from: hasProductId */
    public boolean m22575x809130f0() {
        return m22574x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f m22576x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f10330xcb94b041[1]) {
                fVar.e(1, this.f10331x687cca6b);
            }
            java.lang.String str = this.f10326x180aba4;
            if (str != null && this.f10330xcb94b041[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f10327x1fb03e0f;
            if (str2 != null && this.f10330xcb94b041[3]) {
                fVar.j(3, str2);
            }
            if (this.f10330xcb94b041[4]) {
                fVar.e(4, this.f10325x36c658c8);
            }
            if (this.f10330xcb94b041[5]) {
                fVar.e(5, this.f10329x541982a8);
            }
            if (this.f10330xcb94b041[6]) {
                fVar.e(6, this.f10328xaeb5ae6);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f10330xcb94b041[1] ? 0 + b36.f.e(1, this.f10331x687cca6b) : 0;
            java.lang.String str3 = this.f10326x180aba4;
            if (str3 != null && this.f10330xcb94b041[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f10327x1fb03e0f;
            if (str4 != null && this.f10330xcb94b041[3]) {
                e17 += b36.f.j(3, str4);
            }
            if (this.f10330xcb94b041[4]) {
                e17 += b36.f.e(4, this.f10325x36c658c8);
            }
            if (this.f10330xcb94b041[5]) {
                e17 += b36.f.e(5, this.f10329x541982a8);
            }
            return this.f10330xcb94b041[6] ? e17 + b36.f.e(6, this.f10328xaeb5ae6) : e17;
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
                this.f10331x687cca6b = aVar2.g(intValue);
                this.f10330xcb94b041[1] = true;
                return 0;
            case 2:
                this.f10326x180aba4 = aVar2.k(intValue);
                this.f10330xcb94b041[2] = true;
                return 0;
            case 3:
                this.f10327x1fb03e0f = aVar2.k(intValue);
                this.f10330xcb94b041[3] = true;
                return 0;
            case 4:
                this.f10325x36c658c8 = aVar2.g(intValue);
                this.f10330xcb94b041[4] = true;
                return 0;
            case 5:
                this.f10329x541982a8 = aVar2.g(intValue);
                this.f10330xcb94b041[5] = true;
                return 0;
            case 6:
                this.f10328xaeb5ae6 = aVar2.g(intValue);
                this.f10330xcb94b041[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setDeviceAuthType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f m22578xf931ce7a(int i17) {
        this.f10325x36c658c8 = i17;
        this.f10330xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setDeviceId */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f m22579xb8af8893(java.lang.String str) {
        this.f10326x180aba4 = str;
        this.f10330xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setDeviceSignature */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f m22580x168ac640(java.lang.String str) {
        this.f10327x1fb03e0f = str;
        this.f10330xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setDeviceSignatureTimestamp */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f m22581xff4b8ab6(int i17) {
        this.f10328xaeb5ae6 = i17;
        this.f10330xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setDeviceSignatureVersion */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f m22582xf3636678(int i17) {
        this.f10329x541982a8 = i17;
        this.f10330xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setProductId */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f m22583x1d0f8828(int i17) {
        this.f10331x687cca6b = i17;
        this.f10330xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f m22577x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2984x1a50997f) super.mo11468x92b714fd(bArr);
    }
}

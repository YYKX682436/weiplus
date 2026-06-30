package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkFaceRecognizeConfigRequest */
/* loaded from: classes8.dex */
public class C2990x46dbe7df extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df f10356xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df();

    /* renamed from: env_data */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10357x8589abbc;

    /* renamed from: hasSetFields */
    private final boolean[] f10358xcb94b041 = new boolean[5];

    /* renamed from: reco_type */
    private com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2976x2508ad6b f10359x3a34419a;

    /* renamed from: retry_count */
    private int f10360xc8af38b8;

    /* renamed from: timeout_ms */
    private int f10361x5f1f1d44;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df m22667xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df m22668x7c90cfc0() {
        return f10356xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df m22669x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df m22670x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df c2990x46dbe7df = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f10361x5f1f1d44), java.lang.Integer.valueOf(c2990x46dbe7df.f10361x5f1f1d44)) && n51.f.a(this.f10359x3a34419a, c2990x46dbe7df.f10359x3a34419a) && n51.f.a(this.f10357x8589abbc, c2990x46dbe7df.f10357x8589abbc) && n51.f.a(java.lang.Integer.valueOf(this.f10360xc8af38b8), java.lang.Integer.valueOf(c2990x46dbe7df.f10360xc8af38b8));
    }

    /* renamed from: getEnvData */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22671xdef6ea01() {
        return this.f10358xcb94b041[3] ? this.f10357x8589abbc : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getRecoType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2976x2508ad6b m22672x4c29932f() {
        return this.f10358xcb94b041[2] ? this.f10359x3a34419a : com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2976x2508ad6b.kFaceRecognizeType_WxPayOnly;
    }

    /* renamed from: getRetryCount */
    public int m22673xa8e25f3d() {
        return this.f10360xc8af38b8;
    }

    /* renamed from: getTimeoutMs */
    public int m22674x27ef431() {
        return this.f10361x5f1f1d44;
    }

    /* renamed from: hasEnvData */
    public boolean m22675x1a4d723d() {
        return m22676x6e095e9(3);
    }

    /* renamed from: hasFieldNumber */
    public boolean m22676x6e095e9(int i17) {
        return this.f10358xcb94b041[i17];
    }

    /* renamed from: hasRecoType */
    public boolean m22677x7ba41273() {
        return m22676x6e095e9(2);
    }

    /* renamed from: hasRetryCount */
    public boolean m22678xe3ba1d81() {
        return m22676x6e095e9(4);
    }

    /* renamed from: hasTimeoutMs */
    public boolean m22679xc2545d6d() {
        return m22676x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df m22680x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f10358xcb94b041[1]) {
                fVar.e(1, this.f10361x5f1f1d44);
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2976x2508ad6b enumC2976x2508ad6b = this.f10359x3a34419a;
            if (enumC2976x2508ad6b != null && this.f10358xcb94b041[2]) {
                fVar.e(2, enumC2976x2508ad6b.f10251x6ac9171);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10357x8589abbc;
            if (gVar != null && this.f10358xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            if (this.f10358xcb94b041[4]) {
                fVar.e(4, this.f10360xc8af38b8);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f10358xcb94b041[1] ? 0 + b36.f.e(1, this.f10361x5f1f1d44) : 0;
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2976x2508ad6b enumC2976x2508ad6b2 = this.f10359x3a34419a;
            if (enumC2976x2508ad6b2 != null && this.f10358xcb94b041[2]) {
                e17 += b36.f.e(2, enumC2976x2508ad6b2.f10251x6ac9171);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10357x8589abbc;
            if (gVar2 != null && this.f10358xcb94b041[3]) {
                e17 += b36.f.b(3, gVar2);
            }
            return this.f10358xcb94b041[4] ? e17 + b36.f.e(4, this.f10360xc8af38b8) : e17;
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
            this.f10361x5f1f1d44 = aVar2.g(intValue);
            this.f10358xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f10359x3a34419a = com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2976x2508ad6b.m22453x382ad972(aVar2.g(intValue));
            this.f10358xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f10357x8589abbc = aVar2.d(intValue);
            this.f10358xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f10360xc8af38b8 = aVar2.g(intValue);
        this.f10358xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setEnvData */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df m22682x52683775(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10357x8589abbc = gVar;
        this.f10358xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setRecoType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df m22683x46e1f43b(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2976x2508ad6b enumC2976x2508ad6b) {
        this.f10359x3a34419a = enumC2976x2508ad6b;
        this.f10358xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setRetryCount */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df m22684xd706ad49(int i17) {
        this.f10360xc8af38b8 = i17;
        this.f10358xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setTimeoutMs */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df m22685x5ed2b4a5(int i17) {
        this.f10361x5f1f1d44 = i17;
        this.f10358xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df m22681x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2990x46dbe7df) super.mo11468x92b714fd(bArr);
    }
}

package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.TwoDConfig */
/* loaded from: classes4.dex */
public class C3010xa45758fa extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3010xa45758fa f10525xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3010xa45758fa();

    /* renamed from: encrypt */
    private com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 f10526xa0333265;

    /* renamed from: hasSetFields */
    private final boolean[] f10527xcb94b041 = new boolean[2];

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3010xa45758fa m23001xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3010xa45758fa();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3010xa45758fa m23002x7c90cfc0() {
        return f10525xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3010xa45758fa m23003x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3010xa45758fa();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3010xa45758fa m23004x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3010xa45758fa) && n51.f.a(this.f10526xa0333265, ((com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3010xa45758fa) fVar).f10526xa0333265);
    }

    /* renamed from: getEncrypt */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 m23005xde006e2f() {
        return this.f10527xcb94b041[1] ? this.f10526xa0333265 : com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893.m22388xaf65a0fc();
    }

    /* renamed from: hasEncrypt */
    public boolean m23006x1956f66b() {
        return m23007x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m23007x6e095e9(int i17) {
        return this.f10527xcb94b041[i17];
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3010xa45758fa m23008x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3010xa45758fa();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 c2971x7865f893 = this.f10526xa0333265;
            if (c2971x7865f893 != null && this.f10527xcb94b041[1]) {
                fVar.i(1, c2971x7865f893.mo75928xcd1e8d8());
                this.f10526xa0333265.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 c2971x7865f8932 = this.f10526xa0333265;
            if (c2971x7865f8932 == null || !this.f10527xcb94b041[1]) {
                return 0;
            }
            return 0 + b36.f.i(1, c2971x7865f8932.mo75928xcd1e8d8());
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
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 c2971x7865f8933 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893();
            if (bArr != null && bArr.length > 0) {
                c2971x7865f8933.mo11468x92b714fd(bArr);
            }
            this.f10526xa0333265 = c2971x7865f8933;
        }
        this.f10527xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setEncrypt */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3010xa45758fa m23010x5171bba3(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2971x7865f893 c2971x7865f893) {
        this.f10526xa0333265 = c2971x7865f893;
        this.f10527xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3010xa45758fa m23009x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3010xa45758fa mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3010xa45758fa) super.mo11468x92b714fd(bArr);
    }
}

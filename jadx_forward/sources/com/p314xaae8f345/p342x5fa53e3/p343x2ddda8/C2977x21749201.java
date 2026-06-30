package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.FaceRect */
/* loaded from: classes4.dex */
public class C2977x21749201 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 f10252xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201();

    /* renamed from: face_height */
    private int f10253x8de94549;

    /* renamed from: face_width */
    private int f10254x36f56d64;

    /* renamed from: face_x */
    private int f10255xb393bf16;

    /* renamed from: face_y */
    private int f10256xb393bf17;

    /* renamed from: hasSetFields */
    private final boolean[] f10257xcb94b041 = new boolean[5];

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 m22458xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 m22459x7c90cfc0() {
        return f10252xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 m22460x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 m22461x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 c2977x21749201 = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f10255xb393bf16), java.lang.Integer.valueOf(c2977x21749201.f10255xb393bf16)) && n51.f.a(java.lang.Integer.valueOf(this.f10256xb393bf17), java.lang.Integer.valueOf(c2977x21749201.f10256xb393bf17)) && n51.f.a(java.lang.Integer.valueOf(this.f10254x36f56d64), java.lang.Integer.valueOf(c2977x21749201.f10254x36f56d64)) && n51.f.a(java.lang.Integer.valueOf(this.f10253x8de94549), java.lang.Integer.valueOf(c2977x21749201.f10253x8de94549));
    }

    /* renamed from: getFaceHeight */
    public int m22462xfcf911da() {
        return this.f10253x8de94549;
    }

    /* renamed from: getFaceWidth */
    public int m22463x95614ab3() {
        return this.f10254x36f56d64;
    }

    /* renamed from: getFaceX */
    public int m22464x74689be5() {
        return this.f10255xb393bf16;
    }

    /* renamed from: getFaceY */
    public int m22465x74689be6() {
        return this.f10256xb393bf17;
    }

    /* renamed from: hasFaceHeight */
    public boolean m22466x37d0d01e() {
        return m22470x6e095e9(4);
    }

    /* renamed from: hasFaceWidth */
    public boolean m22467x5536b3ef() {
        return m22470x6e095e9(3);
    }

    /* renamed from: hasFaceX */
    public boolean m22468x6fc0321() {
        return m22470x6e095e9(1);
    }

    /* renamed from: hasFaceY */
    public boolean m22469x6fc0322() {
        return m22470x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m22470x6e095e9(int i17) {
        return this.f10257xcb94b041[i17];
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 m22471x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f10257xcb94b041[1]) {
                fVar.e(1, this.f10255xb393bf16);
            }
            if (this.f10257xcb94b041[2]) {
                fVar.e(2, this.f10256xb393bf17);
            }
            if (this.f10257xcb94b041[3]) {
                fVar.e(3, this.f10254x36f56d64);
            }
            if (this.f10257xcb94b041[4]) {
                fVar.e(4, this.f10253x8de94549);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f10257xcb94b041[1] ? 0 + b36.f.e(1, this.f10255xb393bf16) : 0;
            if (this.f10257xcb94b041[2]) {
                e17 += b36.f.e(2, this.f10256xb393bf17);
            }
            if (this.f10257xcb94b041[3]) {
                e17 += b36.f.e(3, this.f10254x36f56d64);
            }
            return this.f10257xcb94b041[4] ? e17 + b36.f.e(4, this.f10253x8de94549) : e17;
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
            this.f10255xb393bf16 = aVar2.g(intValue);
            this.f10257xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f10256xb393bf17 = aVar2.g(intValue);
            this.f10257xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f10254x36f56d64 = aVar2.g(intValue);
            this.f10257xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f10253x8de94549 = aVar2.g(intValue);
        this.f10257xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setFaceHeight */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 m22473x2b1d5fe6(int i17) {
        this.f10253x8de94549 = i17;
        this.f10257xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setFaceWidth */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 m22474xf1b50b27(int i17) {
        this.f10254x36f56d64 = i17;
        this.f10257xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setFaceX */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 m22475x52f6b659(int i17) {
        this.f10255xb393bf16 = i17;
        this.f10257xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setFaceY */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 m22476x52f6b65a(int i17) {
        this.f10256xb393bf17 = i17;
        this.f10257xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 m22472x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201) super.mo11468x92b714fd(bArr);
    }
}

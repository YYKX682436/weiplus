package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.FaceVideo */
/* loaded from: classes4.dex */
public class C2978xd57dffe extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe f10258xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe();

    /* renamed from: action */
    private com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc f10259xab2f7e36;

    /* renamed from: frames */
    private java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0> f10260xb48284a6 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f10261xcb94b041 = new boolean[3];

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe m22478xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe m22479x7c90cfc0() {
        return f10258xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe m22480x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe();
    }

    /* renamed from: addAllElementFrames */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe m22481x92cee162(java.util.Collection<com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0> collection) {
        this.f10260xb48284a6.addAll(collection);
        this.f10261xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addElementFrames */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe m22482xae5ae7a1(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 c2974xc7a74f0) {
        this.f10260xb48284a6.add(c2974xc7a74f0);
        this.f10261xcb94b041[1] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe m22483x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe c2978xd57dffe = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe) fVar;
        return n51.f.a(this.f10260xb48284a6, c2978xd57dffe.f10260xb48284a6) && n51.f.a(this.f10259xab2f7e36, c2978xd57dffe.f10259xab2f7e36);
    }

    /* renamed from: getAction */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc m22484x1046a12c() {
        return this.f10261xcb94b041[2] ? this.f10259xab2f7e36 : com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc.ENUM_EYE_BLINK;
    }

    /* renamed from: getFrames */
    public java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0> m22485x1999a79c() {
        return this.f10260xb48284a6;
    }

    /* renamed from: hasAction */
    public boolean m22486xd0202170() {
        return m22487x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m22487x6e095e9(int i17) {
        return this.f10261xcb94b041[i17];
    }

    /* renamed from: hasFrames */
    public boolean m22488xd97327e0() {
        return m22487x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe m22489x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f10260xb48284a6);
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc enumC3007x10e598bc = this.f10259xab2f7e36;
            if (enumC3007x10e598bc != null && this.f10261xcb94b041[2]) {
                fVar.e(2, enumC3007x10e598bc.f10507x6ac9171);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f10260xb48284a6) + 0;
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc enumC3007x10e598bc2 = this.f10259xab2f7e36;
            return (enumC3007x10e598bc2 == null || !this.f10261xcb94b041[2]) ? g17 : g17 + b36.f.e(2, enumC3007x10e598bc2.f10507x6ac9171);
        }
        if (i17 == 2) {
            this.f10260xb48284a6.clear();
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
            if (intValue != 2) {
                return -1;
            }
            this.f10259xab2f7e36 = com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc.m22941x382ad972(aVar2.g(intValue));
            this.f10261xcb94b041[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 c2974xc7a74f0 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0();
            if (bArr != null && bArr.length > 0) {
                c2974xc7a74f0.mo11468x92b714fd(bArr);
            }
            this.f10260xb48284a6.add(c2974xc7a74f0);
        }
        this.f10261xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setAction */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe m22491x37bd538(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc enumC3007x10e598bc) {
        this.f10259xab2f7e36 = enumC3007x10e598bc;
        this.f10261xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setFrames */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe m22492xccedba8(java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0> linkedList) {
        this.f10260xb48284a6 = linkedList;
        this.f10261xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe m22490x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2978xd57dffe) super.mo11468x92b714fd(bArr);
    }
}

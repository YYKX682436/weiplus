package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.ThreeDFaceData */
/* loaded from: classes4.dex */
public class C3009x11ec3c4d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d f10518xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d();

    /* renamed from: color_image */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10519x4e67e57f;

    /* renamed from: depth_image */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10520x9fe778df;

    /* renamed from: face_rect */
    private com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 f10521x9668ae86;

    /* renamed from: hasSetFields */
    private final boolean[] f10522xcb94b041 = new boolean[6];

    /* renamed from: infrared_image */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10523x630e2c5d;

    /* renamed from: key_points */
    private com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3006xfb868402 f10524x19fca2c3;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d m22978xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d m22979x7c90cfc0() {
        return f10518xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d m22980x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d m22981x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d c3009x11ec3c4d = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d) fVar;
        return n51.f.a(this.f10519x4e67e57f, c3009x11ec3c4d.f10519x4e67e57f) && n51.f.a(this.f10520x9fe778df, c3009x11ec3c4d.f10520x9fe778df) && n51.f.a(this.f10523x630e2c5d, c3009x11ec3c4d.f10523x630e2c5d) && n51.f.a(this.f10524x19fca2c3, c3009x11ec3c4d.f10524x19fca2c3) && n51.f.a(this.f10521x9668ae86, c3009x11ec3c4d.f10521x9668ae86);
    }

    /* renamed from: getColorImage */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22982x39e667ae() {
        return this.f10522xcb94b041[1] ? this.f10519x4e67e57f : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getDepthImage */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22983xfa76e84e() {
        return this.f10522xcb94b041[2] ? this.f10520x9fe778df : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getFaceRect */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 m22984x99746b57() {
        return this.f10522xcb94b041[5] ? this.f10521x9668ae86 : com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201.m22458xaf65a0fc();
    }

    /* renamed from: getInfraredImage */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22985xf92bd164() {
        return this.f10522xcb94b041[3] ? this.f10523x630e2c5d : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getKeyPoints */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3006xfb868402 m22986x8381d56c() {
        return this.f10522xcb94b041[4] ? this.f10524x19fca2c3 : com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3006xfb868402.m22902xaf65a0fc();
    }

    /* renamed from: hasColorImage */
    public boolean m22987x74be25f2() {
        return m22990x6e095e9(1);
    }

    /* renamed from: hasDepthImage */
    public boolean m22988x354ea692() {
        return m22990x6e095e9(2);
    }

    /* renamed from: hasFaceRect */
    public boolean m22989xc8eeea9b() {
        return m22990x6e095e9(5);
    }

    /* renamed from: hasFieldNumber */
    public boolean m22990x6e095e9(int i17) {
        return this.f10522xcb94b041[i17];
    }

    /* renamed from: hasInfraredImage */
    public boolean m22991x91723ca0() {
        return m22990x6e095e9(3);
    }

    /* renamed from: hasKeyPoints */
    public boolean m22992x43573ea8() {
        return m22990x6e095e9(4);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d m22993x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10519x4e67e57f;
            if (gVar != null && this.f10522xcb94b041[1]) {
                fVar.b(1, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10520x9fe778df;
            if (gVar2 != null && this.f10522xcb94b041[2]) {
                fVar.b(2, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f10523x630e2c5d;
            if (gVar3 != null && this.f10522xcb94b041[3]) {
                fVar.b(3, gVar3);
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3006xfb868402 c3006xfb868402 = this.f10524x19fca2c3;
            if (c3006xfb868402 != null && this.f10522xcb94b041[4]) {
                fVar.i(4, c3006xfb868402.mo75928xcd1e8d8());
                this.f10524x19fca2c3.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 c2977x21749201 = this.f10521x9668ae86;
            if (c2977x21749201 != null && this.f10522xcb94b041[5]) {
                fVar.i(5, c2977x21749201.mo75928xcd1e8d8());
                this.f10521x9668ae86.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f10519x4e67e57f;
            if (gVar4 != null && this.f10522xcb94b041[1]) {
                i18 = 0 + b36.f.b(1, gVar4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f10520x9fe778df;
            if (gVar5 != null && this.f10522xcb94b041[2]) {
                i18 += b36.f.b(2, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f10523x630e2c5d;
            if (gVar6 != null && this.f10522xcb94b041[3]) {
                i18 += b36.f.b(3, gVar6);
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3006xfb868402 c3006xfb8684022 = this.f10524x19fca2c3;
            if (c3006xfb8684022 != null && this.f10522xcb94b041[4]) {
                i18 += b36.f.i(4, c3006xfb8684022.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 c2977x217492012 = this.f10521x9668ae86;
            return (c2977x217492012 == null || !this.f10522xcb94b041[5]) ? i18 : i18 + b36.f.i(5, c2977x217492012.mo75928xcd1e8d8());
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
            this.f10519x4e67e57f = aVar2.d(intValue);
            this.f10522xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f10520x9fe778df = aVar2.d(intValue);
            this.f10522xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f10523x630e2c5d = aVar2.d(intValue);
            this.f10522xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3006xfb868402 c3006xfb8684023 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3006xfb868402();
                if (bArr != null && bArr.length > 0) {
                    c3006xfb8684023.mo11468x92b714fd(bArr);
                }
                this.f10524x19fca2c3 = c3006xfb8684023;
            }
            this.f10522xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 c2977x217492013 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201();
            if (bArr2 != null && bArr2.length > 0) {
                c2977x217492013.mo11468x92b714fd(bArr2);
            }
            this.f10521x9668ae86 = c2977x217492013;
        }
        this.f10522xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setColorImage */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d m22995x680ab5ba(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10519x4e67e57f = gVar;
        this.f10522xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setDepthImage */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d m22996x289b365a(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10520x9fe778df = gVar;
        this.f10522xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setFaceRect */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d m22997x942ccc63(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2977x21749201 c2977x21749201) {
        this.f10521x9668ae86 = c2977x21749201;
        this.f10522xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setInfraredImage */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d m22998x8c0237d8(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10523x630e2c5d = gVar;
        this.f10522xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setKeyPoints */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d m22999xdfd595e0(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3006xfb868402 c3006xfb868402) {
        this.f10524x19fca2c3 = c3006xfb868402;
        this.f10522xcb94b041[4] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d m22994x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3009x11ec3c4d) super.mo11468x92b714fd(bArr);
    }
}

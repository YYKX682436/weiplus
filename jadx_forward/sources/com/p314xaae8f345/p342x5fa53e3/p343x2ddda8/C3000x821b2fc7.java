package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkLoginResponse */
/* loaded from: classes4.dex */
public class C3000x821b2fc7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7 f10415xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7();

    /* renamed from: detail_ret */
    private int f10416xc2406fb3;

    /* renamed from: hasSetFields */
    private final boolean[] f10417xcb94b041 = new boolean[4];

    /* renamed from: login_type */
    private int f10418x97d59250;

    /* renamed from: verify_buffer */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10419xf5703ec6;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7 m22832xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7 m22833x7c90cfc0() {
        return f10415xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7 m22834x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7 m22835x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7 c3000x821b2fc7 = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f10418x97d59250), java.lang.Integer.valueOf(c3000x821b2fc7.f10418x97d59250)) && n51.f.a(this.f10419xf5703ec6, c3000x821b2fc7.f10419xf5703ec6) && n51.f.a(java.lang.Integer.valueOf(this.f10416xc2406fb3), java.lang.Integer.valueOf(c3000x821b2fc7.f10416xc2406fb3));
    }

    /* renamed from: getDetailRet */
    public int m22836x89d26bda() {
        return this.f10416xc2406fb3;
    }

    /* renamed from: getLoginType */
    public int m22837x98f3878d() {
        return this.f10418x97d59250;
    }

    /* renamed from: getVerifyBuffer */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22838x1f9f9c8f() {
        return this.f10417xcb94b041[2] ? this.f10419xf5703ec6 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: hasDetailRet */
    public boolean m22839x49a7d516() {
        return m22840x6e095e9(3);
    }

    /* renamed from: hasFieldNumber */
    public boolean m22840x6e095e9(int i17) {
        return this.f10417xcb94b041[i17];
    }

    /* renamed from: hasLoginType */
    public boolean m22841x58c8f0c9() {
        return m22840x6e095e9(1);
    }

    /* renamed from: hasVerifyBuffer */
    public boolean m22842x380d9d3() {
        return m22840x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7 m22843x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f10417xcb94b041[1]) {
                fVar.e(1, this.f10418x97d59250);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10419xf5703ec6;
            if (gVar != null && this.f10417xcb94b041[2]) {
                fVar.b(2, gVar);
            }
            if (this.f10417xcb94b041[3]) {
                fVar.e(3, this.f10416xc2406fb3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f10417xcb94b041[1] ? 0 + b36.f.e(1, this.f10418x97d59250) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10419xf5703ec6;
            if (gVar2 != null && this.f10417xcb94b041[2]) {
                e17 += b36.f.b(2, gVar2);
            }
            return this.f10417xcb94b041[3] ? e17 + b36.f.e(3, this.f10416xc2406fb3) : e17;
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
            this.f10418x97d59250 = aVar2.g(intValue);
            this.f10417xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f10419xf5703ec6 = aVar2.d(intValue);
            this.f10417xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f10416xc2406fb3 = aVar2.g(intValue);
        this.f10417xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setDetailRet */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7 m22845xe6262c4e(int i17) {
        this.f10416xc2406fb3 = i17;
        this.f10417xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setLoginType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7 m22846xf5474801(int i17) {
        this.f10418x97d59250 = i17;
        this.f10417xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setVerifyBuffer */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7 m22847x55e8979b(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10419xf5703ec6 = gVar;
        this.f10417xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7 m22844x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3000x821b2fc7) super.mo11468x92b714fd(bArr);
    }
}

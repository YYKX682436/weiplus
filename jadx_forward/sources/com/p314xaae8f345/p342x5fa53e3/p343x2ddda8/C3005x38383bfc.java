package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkUserInfo */
/* loaded from: classes8.dex */
public class C3005x38383bfc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc f10480xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc();

    /* renamed from: hasSetFields */
    private final boolean[] f10481xcb94b041 = new boolean[8];

    /* renamed from: ilink_network_buffer */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10482x35007f4d;

    /* renamed from: login_scene */
    private com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3001x54c21ac6 f10483x62c47836;

    /* renamed from: login_status */
    private com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3002x446f14f8 f10484xf6b86588;

    /* renamed from: login_type */
    private int f10485x97d59250;
    private long uin;

    /* renamed from: username */
    private java.lang.String f10486xf02988d6;

    /* renamed from: wss_token */
    private java.lang.String f10487x2167cd1;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc m22873xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc m22874x7c90cfc0() {
        return f10480xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc m22875x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc m22876x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc c3005x38383bfc = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc) fVar;
        return n51.f.a(this.f10484xf6b86588, c3005x38383bfc.f10484xf6b86588) && n51.f.a(java.lang.Integer.valueOf(this.f10485x97d59250), java.lang.Integer.valueOf(c3005x38383bfc.f10485x97d59250)) && n51.f.a(java.lang.Long.valueOf(this.uin), java.lang.Long.valueOf(c3005x38383bfc.uin)) && n51.f.a(this.f10486xf02988d6, c3005x38383bfc.f10486xf02988d6) && n51.f.a(this.f10483x62c47836, c3005x38383bfc.f10483x62c47836) && n51.f.a(this.f10487x2167cd1, c3005x38383bfc.f10487x2167cd1) && n51.f.a(this.f10482x35007f4d, c3005x38383bfc.f10482x35007f4d);
    }

    /* renamed from: getIlinkNetworkBuffer */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22877x1ddee6e1() {
        return this.f10481xcb94b041[7] ? this.f10482x35007f4d : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getLoginScene */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3001x54c21ac6 m22878x85652a99() {
        return this.f10481xcb94b041[5] ? this.f10483x62c47836 : com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3001x54c21ac6.kIlinkLoginSceneNone;
    }

    /* renamed from: getLoginStatus */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3002x446f14f8 m22879x282dff85() {
        return this.f10481xcb94b041[1] ? this.f10484xf6b86588 : com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3002x446f14f8.kIlinkLoginUnknown;
    }

    /* renamed from: getLoginType */
    public int m22880x98f3878d() {
        return this.f10485x97d59250;
    }

    /* renamed from: getUin */
    public long m22881xb5887524() {
        return this.uin;
    }

    /* renamed from: getUsername */
    public java.lang.String m22882x6c03c64c() {
        return this.f10481xcb94b041[4] ? this.f10486xf02988d6 : "";
    }

    /* renamed from: getWssToken */
    public java.lang.String m22883x5203d098() {
        return this.f10481xcb94b041[6] ? this.f10487x2167cd1 : "";
    }

    /* renamed from: hasFieldNumber */
    public boolean m22884x6e095e9(int i17) {
        return this.f10481xcb94b041[i17];
    }

    /* renamed from: hasIlinkNetworkBuffer */
    public boolean m22885xbe462125() {
        return m22884x6e095e9(7);
    }

    /* renamed from: hasLoginScene */
    public boolean m22886xc03ce8dd() {
        return m22884x6e095e9(5);
    }

    /* renamed from: hasLoginStatus */
    public boolean m22887x484e09c1() {
        return m22884x6e095e9(1);
    }

    /* renamed from: hasLoginType */
    public boolean m22888x58c8f0c9() {
        return m22884x6e095e9(2);
    }

    /* renamed from: hasUin */
    public boolean m22889xb7047b60() {
        return m22884x6e095e9(3);
    }

    /* renamed from: hasUsername */
    public boolean m22890x9b7e4590() {
        return m22884x6e095e9(4);
    }

    /* renamed from: hasWssToken */
    public boolean m22891x817e4fdc() {
        return m22884x6e095e9(6);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc m22892x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3002x446f14f8 enumC3002x446f14f8 = this.f10484xf6b86588;
            if (enumC3002x446f14f8 != null && this.f10481xcb94b041[1]) {
                fVar.e(1, enumC3002x446f14f8.f10443x6ac9171);
            }
            if (this.f10481xcb94b041[2]) {
                fVar.e(2, this.f10485x97d59250);
            }
            if (this.f10481xcb94b041[3]) {
                fVar.h(3, this.uin);
            }
            java.lang.String str = this.f10486xf02988d6;
            if (str != null && this.f10481xcb94b041[4]) {
                fVar.j(4, str);
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3001x54c21ac6 enumC3001x54c21ac6 = this.f10483x62c47836;
            if (enumC3001x54c21ac6 != null && this.f10481xcb94b041[5]) {
                fVar.e(5, enumC3001x54c21ac6.f10433x6ac9171);
            }
            java.lang.String str2 = this.f10487x2167cd1;
            if (str2 != null && this.f10481xcb94b041[6]) {
                fVar.j(6, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10482x35007f4d;
            if (gVar != null && this.f10481xcb94b041[7]) {
                fVar.b(7, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3002x446f14f8 enumC3002x446f14f82 = this.f10484xf6b86588;
            if (enumC3002x446f14f82 != null && this.f10481xcb94b041[1]) {
                i18 = 0 + b36.f.e(1, enumC3002x446f14f82.f10443x6ac9171);
            }
            if (this.f10481xcb94b041[2]) {
                i18 += b36.f.e(2, this.f10485x97d59250);
            }
            if (this.f10481xcb94b041[3]) {
                i18 += b36.f.h(3, this.uin);
            }
            java.lang.String str3 = this.f10486xf02988d6;
            if (str3 != null && this.f10481xcb94b041[4]) {
                i18 += b36.f.j(4, str3);
            }
            com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3001x54c21ac6 enumC3001x54c21ac62 = this.f10483x62c47836;
            if (enumC3001x54c21ac62 != null && this.f10481xcb94b041[5]) {
                i18 += b36.f.e(5, enumC3001x54c21ac62.f10433x6ac9171);
            }
            java.lang.String str4 = this.f10487x2167cd1;
            if (str4 != null && this.f10481xcb94b041[6]) {
                i18 += b36.f.j(6, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10482x35007f4d;
            return (gVar2 == null || !this.f10481xcb94b041[7]) ? i18 : i18 + b36.f.b(7, gVar2);
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
                this.f10484xf6b86588 = com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3002x446f14f8.m22856x382ad972(aVar2.g(intValue));
                this.f10481xcb94b041[1] = true;
                return 0;
            case 2:
                this.f10485x97d59250 = aVar2.g(intValue);
                this.f10481xcb94b041[2] = true;
                return 0;
            case 3:
                this.uin = aVar2.i(intValue);
                this.f10481xcb94b041[3] = true;
                return 0;
            case 4:
                this.f10486xf02988d6 = aVar2.k(intValue);
                this.f10481xcb94b041[4] = true;
                return 0;
            case 5:
                this.f10483x62c47836 = com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3001x54c21ac6.m22850x382ad972(aVar2.g(intValue));
                this.f10481xcb94b041[5] = true;
                return 0;
            case 6:
                this.f10487x2167cd1 = aVar2.k(intValue);
                this.f10481xcb94b041[6] = true;
                return 0;
            case 7:
                this.f10482x35007f4d = aVar2.d(intValue);
                this.f10481xcb94b041[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setIlinkNetworkBuffer */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc m22894xb50a68ed(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10482x35007f4d = gVar;
        this.f10481xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setLoginScene */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc m22895xb38978a5(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3001x54c21ac6 enumC3001x54c21ac6) {
        this.f10483x62c47836 = enumC3001x54c21ac6;
        this.f10481xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setLoginStatus */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc m22896xbe9372f9(com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3002x446f14f8 enumC3002x446f14f8) {
        this.f10484xf6b86588 = enumC3002x446f14f8;
        this.f10481xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setLoginType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc m22897xf5474801(int i17) {
        this.f10485x97d59250 = i17;
        this.f10481xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setUin */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc m22898xca029c98(long j17) {
        this.uin = j17;
        this.f10481xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setUsername */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc m22899x66bc2758(java.lang.String str) {
        this.f10486xf02988d6 = str;
        this.f10481xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setWssToken */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc m22900x4cbc31a4(java.lang.String str) {
        this.f10487x2167cd1 = str;
        this.f10481xcb94b041[6] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc m22893x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3005x38383bfc) super.mo11468x92b714fd(bArr);
    }
}

package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.TdiInitParameter */
/* loaded from: classes8.dex */
public class C3008xc2415120 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 f10508xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120();

    /* renamed from: app_dir */
    private java.lang.String f10509xd0b2356f;

    /* renamed from: hasSetFields */
    private final boolean[] f10510xcb94b041 = new boolean[9];

    /* renamed from: ilink_id */
    private java.lang.String f10511xa5e96ef7;

    /* renamed from: ilink_product_id */
    private int f10512x6e449047;

    /* renamed from: ilink_sn */
    private java.lang.String f10513xa5e97037;

    /* renamed from: ilink_token */
    private java.lang.String f10514x5889ba9d;

    /* renamed from: ios_idfa */
    private java.lang.String f10515x54d86008;

    /* renamed from: session_module_type */
    private int f10516x5c187504;

    /* renamed from: session_type */
    private int f10517xd718f343;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 m22946xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 m22947x7c90cfc0() {
        return f10508xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 m22948x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 m22949x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 c3008xc2415120 = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120) fVar;
        return n51.f.a(this.f10509xd0b2356f, c3008xc2415120.f10509xd0b2356f) && n51.f.a(java.lang.Integer.valueOf(this.f10512x6e449047), java.lang.Integer.valueOf(c3008xc2415120.f10512x6e449047)) && n51.f.a(this.f10513xa5e97037, c3008xc2415120.f10513xa5e97037) && n51.f.a(this.f10511xa5e96ef7, c3008xc2415120.f10511xa5e96ef7) && n51.f.a(this.f10514x5889ba9d, c3008xc2415120.f10514x5889ba9d) && n51.f.a(this.f10515x54d86008, c3008xc2415120.f10515x54d86008) && n51.f.a(java.lang.Integer.valueOf(this.f10517xd718f343), java.lang.Integer.valueOf(c3008xc2415120.f10517xd718f343)) && n51.f.a(java.lang.Integer.valueOf(this.f10516x5c187504), java.lang.Integer.valueOf(c3008xc2415120.f10516x5c187504));
    }

    /* renamed from: getAppDir */
    public java.lang.String m22950x10fb75a2() {
        return this.f10510xcb94b041[1] ? this.f10509xd0b2356f : "";
    }

    /* renamed from: getIlinkId */
    public java.lang.String m22951xae822c28() {
        return this.f10510xcb94b041[4] ? this.f10511xa5e96ef7 : "";
    }

    /* renamed from: getIlinkProductId */
    public int m22952xa76a9ebd() {
        return this.f10512x6e449047;
    }

    /* renamed from: getIlinkSn */
    public java.lang.String m22953xae822d68() {
        return this.f10510xcb94b041[3] ? this.f10513xa5e97037 : "";
    }

    /* renamed from: getIlinkToken */
    public java.lang.String m22954xbef223cc() {
        return this.f10510xcb94b041[5] ? this.f10514x5889ba9d : "";
    }

    /* renamed from: getIosIdfa */
    public java.lang.String m22955xb41cb88d() {
        return this.f10510xcb94b041[6] ? this.f10515x54d86008 : "";
    }

    /* renamed from: getSessionModuleType */
    public int m22956xc93fb646() {
        return this.f10516x5c187504;
    }

    /* renamed from: getSessionType */
    public int m22957xd87f91ba() {
        return this.f10517xd718f343;
    }

    /* renamed from: hasAppDir */
    public boolean m22958xd0d4f5e6() {
        return m22959x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m22959x6e095e9(int i17) {
        return this.f10510xcb94b041[i17];
    }

    /* renamed from: hasIlinkId */
    public boolean m22960xe9d8b464() {
        return m22959x6e095e9(4);
    }

    /* renamed from: hasIlinkProductId */
    public boolean m22961x17f19b01() {
        return m22959x6e095e9(2);
    }

    /* renamed from: hasIlinkSn */
    public boolean m22962xe9d8b5a4() {
        return m22959x6e095e9(3);
    }

    /* renamed from: hasIlinkToken */
    public boolean m22963xf9c9e210() {
        return m22959x6e095e9(5);
    }

    /* renamed from: hasIosIdfa */
    public boolean m22964xef7340c9() {
        return m22959x6e095e9(6);
    }

    /* renamed from: hasSessionModuleType */
    public boolean m22965xb5a62382() {
        return m22959x6e095e9(8);
    }

    /* renamed from: hasSessionType */
    public boolean m22966xf89f9bf6() {
        return m22959x6e095e9(7);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 m22967x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f10509xd0b2356f;
            if (str != null && this.f10510xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f10510xcb94b041[2]) {
                fVar.e(2, this.f10512x6e449047);
            }
            java.lang.String str2 = this.f10513xa5e97037;
            if (str2 != null && this.f10510xcb94b041[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f10511xa5e96ef7;
            if (str3 != null && this.f10510xcb94b041[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f10514x5889ba9d;
            if (str4 != null && this.f10510xcb94b041[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f10515x54d86008;
            if (str5 != null && this.f10510xcb94b041[6]) {
                fVar.j(6, str5);
            }
            if (this.f10510xcb94b041[7]) {
                fVar.e(7, this.f10517xd718f343);
            }
            if (this.f10510xcb94b041[8]) {
                fVar.e(8, this.f10516x5c187504);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f10509xd0b2356f;
            if (str6 != null && this.f10510xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            if (this.f10510xcb94b041[2]) {
                i18 += b36.f.e(2, this.f10512x6e449047);
            }
            java.lang.String str7 = this.f10513xa5e97037;
            if (str7 != null && this.f10510xcb94b041[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f10511xa5e96ef7;
            if (str8 != null && this.f10510xcb94b041[4]) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f10514x5889ba9d;
            if (str9 != null && this.f10510xcb94b041[5]) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f10515x54d86008;
            if (str10 != null && this.f10510xcb94b041[6]) {
                i18 += b36.f.j(6, str10);
            }
            if (this.f10510xcb94b041[7]) {
                i18 += b36.f.e(7, this.f10517xd718f343);
            }
            return this.f10510xcb94b041[8] ? i18 + b36.f.e(8, this.f10516x5c187504) : i18;
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
                this.f10509xd0b2356f = aVar2.k(intValue);
                this.f10510xcb94b041[1] = true;
                return 0;
            case 2:
                this.f10512x6e449047 = aVar2.g(intValue);
                this.f10510xcb94b041[2] = true;
                return 0;
            case 3:
                this.f10513xa5e97037 = aVar2.k(intValue);
                this.f10510xcb94b041[3] = true;
                return 0;
            case 4:
                this.f10511xa5e96ef7 = aVar2.k(intValue);
                this.f10510xcb94b041[4] = true;
                return 0;
            case 5:
                this.f10514x5889ba9d = aVar2.k(intValue);
                this.f10510xcb94b041[5] = true;
                return 0;
            case 6:
                this.f10515x54d86008 = aVar2.k(intValue);
                this.f10510xcb94b041[6] = true;
                return 0;
            case 7:
                this.f10517xd718f343 = aVar2.g(intValue);
                this.f10510xcb94b041[7] = true;
                return 0;
            case 8:
                this.f10516x5c187504 = aVar2.g(intValue);
                this.f10510xcb94b041[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAppDir */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 m22969x430a9ae(java.lang.String str) {
        this.f10509xd0b2356f = str;
        this.f10510xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setIlinkId */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 m22970x21f3799c(java.lang.String str) {
        this.f10511xa5e96ef7 = str;
        this.f10510xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setIlinkProductId */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 m22971x6f6106c9(int i17) {
        this.f10512x6e449047 = i17;
        this.f10510xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setIlinkSn */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 m22972x21f37adc(java.lang.String str) {
        this.f10513xa5e97037 = str;
        this.f10510xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setIlinkToken */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 m22973xed1671d8(java.lang.String str) {
        this.f10514x5889ba9d = str;
        this.f10510xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setIosIdfa */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 m22974x278e0601(java.lang.String str) {
        this.f10515x54d86008 = str;
        this.f10510xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setSessionModuleType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 m22975xa4d5c2ba(int i17) {
        this.f10516x5c187504 = i17;
        this.f10510xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setSessionType */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 m22976x6ee5052e(int i17) {
        this.f10517xd718f343 = i17;
        this.f10510xcb94b041[7] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 m22968x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C3008xc2415120) super.mo11468x92b714fd(bArr);
    }
}

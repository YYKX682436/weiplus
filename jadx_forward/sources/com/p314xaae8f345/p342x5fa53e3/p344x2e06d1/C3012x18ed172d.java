package com.p314xaae8f345.p342x5fa53e3.p344x2e06d1;

/* renamed from: com.tencent.ilink.base.IlinkAuthConfig */
/* loaded from: classes8.dex */
public class C3012x18ed172d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d f10531xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d();

    /* renamed from: hasSetFields */
    private final boolean[] f10532xcb94b041 = new boolean[7];

    /* renamed from: ilink_id */
    private java.lang.String f10533xa5e96ef7;

    /* renamed from: ilink_sn */
    private java.lang.String f10534xa5e97037;

    /* renamed from: ilink_token */
    private java.lang.String f10535x5889ba9d;

    /* renamed from: ios_idfa */
    private java.lang.String f10536x54d86008;

    /* renamed from: session_module_type */
    private int f10537x5c187504;

    /* renamed from: session_type */
    private int f10538xd718f343;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d m23028xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d m23029x7c90cfc0() {
        return f10531xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d m23030x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d m23031x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d c3012x18ed172d = (com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d) fVar;
        return n51.f.a(this.f10534xa5e97037, c3012x18ed172d.f10534xa5e97037) && n51.f.a(this.f10533xa5e96ef7, c3012x18ed172d.f10533xa5e96ef7) && n51.f.a(this.f10535x5889ba9d, c3012x18ed172d.f10535x5889ba9d) && n51.f.a(java.lang.Integer.valueOf(this.f10538xd718f343), java.lang.Integer.valueOf(c3012x18ed172d.f10538xd718f343)) && n51.f.a(java.lang.Integer.valueOf(this.f10537x5c187504), java.lang.Integer.valueOf(c3012x18ed172d.f10537x5c187504)) && n51.f.a(this.f10536x54d86008, c3012x18ed172d.f10536x54d86008);
    }

    /* renamed from: getIlinkId */
    public java.lang.String m23032xae822c28() {
        return this.f10532xcb94b041[2] ? this.f10533xa5e96ef7 : "";
    }

    /* renamed from: getIlinkSn */
    public java.lang.String m23033xae822d68() {
        return this.f10532xcb94b041[1] ? this.f10534xa5e97037 : "";
    }

    /* renamed from: getIlinkToken */
    public java.lang.String m23034xbef223cc() {
        return this.f10532xcb94b041[3] ? this.f10535x5889ba9d : "";
    }

    /* renamed from: getIosIdfa */
    public java.lang.String m23035xb41cb88d() {
        return this.f10532xcb94b041[6] ? this.f10536x54d86008 : "";
    }

    /* renamed from: getSessionModuleType */
    public int m23036xc93fb646() {
        return this.f10537x5c187504;
    }

    /* renamed from: getSessionType */
    public int m23037xd87f91ba() {
        return this.f10538xd718f343;
    }

    /* renamed from: hasFieldNumber */
    public boolean m23038x6e095e9(int i17) {
        return this.f10532xcb94b041[i17];
    }

    /* renamed from: hasIlinkId */
    public boolean m23039xe9d8b464() {
        return m23038x6e095e9(2);
    }

    /* renamed from: hasIlinkSn */
    public boolean m23040xe9d8b5a4() {
        return m23038x6e095e9(1);
    }

    /* renamed from: hasIlinkToken */
    public boolean m23041xf9c9e210() {
        return m23038x6e095e9(3);
    }

    /* renamed from: hasIosIdfa */
    public boolean m23042xef7340c9() {
        return m23038x6e095e9(6);
    }

    /* renamed from: hasSessionModuleType */
    public boolean m23043xb5a62382() {
        return m23038x6e095e9(5);
    }

    /* renamed from: hasSessionType */
    public boolean m23044xf89f9bf6() {
        return m23038x6e095e9(4);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d m23045x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f10534xa5e97037;
            if (str != null && this.f10532xcb94b041[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f10533xa5e96ef7;
            if (str2 != null && this.f10532xcb94b041[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f10535x5889ba9d;
            if (str3 != null && this.f10532xcb94b041[3]) {
                fVar.j(3, str3);
            }
            if (this.f10532xcb94b041[4]) {
                fVar.e(4, this.f10538xd718f343);
            }
            if (this.f10532xcb94b041[5]) {
                fVar.e(5, this.f10537x5c187504);
            }
            java.lang.String str4 = this.f10536x54d86008;
            if (str4 != null && this.f10532xcb94b041[6]) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f10534xa5e97037;
            if (str5 != null && this.f10532xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f10533xa5e96ef7;
            if (str6 != null && this.f10532xcb94b041[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f10535x5889ba9d;
            if (str7 != null && this.f10532xcb94b041[3]) {
                i18 += b36.f.j(3, str7);
            }
            if (this.f10532xcb94b041[4]) {
                i18 += b36.f.e(4, this.f10538xd718f343);
            }
            if (this.f10532xcb94b041[5]) {
                i18 += b36.f.e(5, this.f10537x5c187504);
            }
            java.lang.String str8 = this.f10536x54d86008;
            return (str8 == null || !this.f10532xcb94b041[6]) ? i18 : i18 + b36.f.j(6, str8);
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
                this.f10534xa5e97037 = aVar2.k(intValue);
                this.f10532xcb94b041[1] = true;
                return 0;
            case 2:
                this.f10533xa5e96ef7 = aVar2.k(intValue);
                this.f10532xcb94b041[2] = true;
                return 0;
            case 3:
                this.f10535x5889ba9d = aVar2.k(intValue);
                this.f10532xcb94b041[3] = true;
                return 0;
            case 4:
                this.f10538xd718f343 = aVar2.g(intValue);
                this.f10532xcb94b041[4] = true;
                return 0;
            case 5:
                this.f10537x5c187504 = aVar2.g(intValue);
                this.f10532xcb94b041[5] = true;
                return 0;
            case 6:
                this.f10536x54d86008 = aVar2.k(intValue);
                this.f10532xcb94b041[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setIlinkId */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d m23047x21f3799c(java.lang.String str) {
        this.f10533xa5e96ef7 = str;
        this.f10532xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setIlinkSn */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d m23048x21f37adc(java.lang.String str) {
        this.f10534xa5e97037 = str;
        this.f10532xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setIlinkToken */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d m23049xed1671d8(java.lang.String str) {
        this.f10535x5889ba9d = str;
        this.f10532xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setIosIdfa */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d m23050x278e0601(java.lang.String str) {
        this.f10536x54d86008 = str;
        this.f10532xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setSessionModuleType */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d m23051xa4d5c2ba(int i17) {
        this.f10537x5c187504 = i17;
        this.f10532xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setSessionType */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d m23052x6ee5052e(int i17) {
        this.f10538xd718f343 = i17;
        this.f10532xcb94b041[4] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d m23046x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3012x18ed172d) super.mo11468x92b714fd(bArr);
    }
}

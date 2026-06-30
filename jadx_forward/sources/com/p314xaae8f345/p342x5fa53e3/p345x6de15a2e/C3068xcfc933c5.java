package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkSmcBaseInfo */
/* loaded from: classes15.dex */
public class C3068xcfc933c5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5 f11137xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5();

    /* renamed from: device_brand */
    private java.lang.String f11138xdc2b345e;

    /* renamed from: device_model */
    private java.lang.String f11139xdcc4e400;

    /* renamed from: hasSetFields */
    private final boolean[] f11140xcb94b041 = new boolean[6];

    /* renamed from: language_ver */
    private java.lang.String f11141x83561e3c;

    /* renamed from: osname */
    private java.lang.String f11142xc3f1f66f;

    /* renamed from: osversion */
    private java.lang.String f11143x8c86674;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5 m24506xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5 m24507x7c90cfc0() {
        return f11137xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5 m24508x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5 m24509x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5 c3068xcfc933c5 = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5) fVar;
        return n51.f.a(this.f11139xdcc4e400, c3068xcfc933c5.f11139xdcc4e400) && n51.f.a(this.f11138xdc2b345e, c3068xcfc933c5.f11138xdc2b345e) && n51.f.a(this.f11142xc3f1f66f, c3068xcfc933c5.f11142xc3f1f66f) && n51.f.a(this.f11143x8c86674, c3068xcfc933c5.f11143x8c86674) && n51.f.a(this.f11141x83561e3c, c3068xcfc933c5.f11141x83561e3c);
    }

    /* renamed from: getDeviceBrand */
    public java.lang.String m24510x7c46099b() {
        return this.f11140xcb94b041[2] ? this.f11138xdc2b345e : "";
    }

    /* renamed from: getDeviceModel */
    public java.lang.String m24511x7cdfb93d() {
        return this.f11140xcb94b041[1] ? this.f11139xdcc4e400 : "";
    }

    /* renamed from: getLanguageVer */
    public java.lang.String m24512x93c023f5() {
        return this.f11140xcb94b041[5] ? this.f11141x83561e3c : "";
    }

    /* renamed from: getOsname */
    public java.lang.String m24513x29091965() {
        return this.f11140xcb94b041[3] ? this.f11142xc3f1f66f : "";
    }

    /* renamed from: getOsversion */
    public java.lang.String m24514x835d7be() {
        return this.f11140xcb94b041[4] ? this.f11143x8c86674 : "";
    }

    /* renamed from: hasDeviceBrand */
    public boolean m24515x9c6613d7() {
        return m24517x6e095e9(2);
    }

    /* renamed from: hasDeviceModel */
    public boolean m24516x9cffc379() {
        return m24517x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m24517x6e095e9(int i17) {
        return this.f11140xcb94b041[i17];
    }

    /* renamed from: hasLanguageVer */
    public boolean m24518xb3e02e31() {
        return m24517x6e095e9(5);
    }

    /* renamed from: hasOsname */
    public boolean m24519xe8e299a9() {
        return m24517x6e095e9(3);
    }

    /* renamed from: hasOsversion */
    public boolean m24520xc80b40fa() {
        return m24517x6e095e9(4);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5 m24521x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f11139xdcc4e400;
            if (str != null && this.f11140xcb94b041[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f11138xdc2b345e;
            if (str2 != null && this.f11140xcb94b041[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f11142xc3f1f66f;
            if (str3 != null && this.f11140xcb94b041[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f11143x8c86674;
            if (str4 != null && this.f11140xcb94b041[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f11141x83561e3c;
            if (str5 != null && this.f11140xcb94b041[5]) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f11139xdcc4e400;
            if (str6 != null && this.f11140xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f11138xdc2b345e;
            if (str7 != null && this.f11140xcb94b041[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f11142xc3f1f66f;
            if (str8 != null && this.f11140xcb94b041[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f11143x8c86674;
            if (str9 != null && this.f11140xcb94b041[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f11141x83561e3c;
            return (str10 == null || !this.f11140xcb94b041[5]) ? i18 : i18 + b36.f.j(5, str10);
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
            this.f11139xdcc4e400 = aVar2.k(intValue);
            this.f11140xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f11138xdc2b345e = aVar2.k(intValue);
            this.f11140xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f11142xc3f1f66f = aVar2.k(intValue);
            this.f11140xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f11143x8c86674 = aVar2.k(intValue);
            this.f11140xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f11141x83561e3c = aVar2.k(intValue);
        this.f11140xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setDeviceBrand */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5 m24523x12ab7d0f(java.lang.String str) {
        this.f11138xdc2b345e = str;
        this.f11140xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setDeviceModel */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5 m24524x13452cb1(java.lang.String str) {
        this.f11139xdcc4e400 = str;
        this.f11140xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setLanguageVer */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5 m24525x2a259769(java.lang.String str) {
        this.f11141x83561e3c = str;
        this.f11140xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setOsname */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5 m24526x1c3e4d71(java.lang.String str) {
        this.f11142xc3f1f66f = str;
        this.f11140xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setOsversion */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5 m24527x64899832(java.lang.String str) {
        this.f11143x8c86674 = str;
        this.f11140xcb94b041[4] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5 m24522x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3068xcfc933c5) super.mo11468x92b714fd(bArr);
    }
}

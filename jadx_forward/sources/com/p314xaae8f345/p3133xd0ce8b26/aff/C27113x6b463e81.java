package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkStartConfig */
/* loaded from: classes15.dex */
public class C27113x6b463e81 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81 f59224xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81();

    /* renamed from: app_version */
    private int f59225xca3e8cba;

    /* renamed from: debug_ip */
    private java.lang.String f59226x20a6d693;

    /* renamed from: debug_net */
    private int f59227xf4340db1;

    /* renamed from: file_dir */
    private java.lang.String f59228xd42d8b4a;

    /* renamed from: hasSetFields */
    private final boolean[] f59229xcb94b041 = new boolean[8];

    /* renamed from: running_mode */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27110xb59c283f f59230x32119c23;

    /* renamed from: select_domain */
    private int f59231x1a4a4967;

    /* renamed from: wechat_devicetype */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f59232x4b180949;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81 m110505xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81 m110506x7c90cfc0() {
        return f59224xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81 m110507x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81 m110508x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81 c27113x6b463e81 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81) fVar;
        return n51.f.a(this.f59228xd42d8b4a, c27113x6b463e81.f59228xd42d8b4a) && n51.f.a(java.lang.Integer.valueOf(this.f59227xf4340db1), java.lang.Integer.valueOf(c27113x6b463e81.f59227xf4340db1)) && n51.f.a(this.f59226x20a6d693, c27113x6b463e81.f59226x20a6d693) && n51.f.a(java.lang.Integer.valueOf(this.f59231x1a4a4967), java.lang.Integer.valueOf(c27113x6b463e81.f59231x1a4a4967)) && n51.f.a(this.f59230x32119c23, c27113x6b463e81.f59230x32119c23) && n51.f.a(java.lang.Integer.valueOf(this.f59225xca3e8cba), java.lang.Integer.valueOf(c27113x6b463e81.f59225xca3e8cba)) && n51.f.a(this.f59232x4b180949, c27113x6b463e81.f59232x4b180949);
    }

    /* renamed from: getAppVersion */
    public int m110509x46b67b6d() {
        return this.f59225xca3e8cba;
    }

    /* renamed from: getDebugIp */
    public java.lang.String m110510x99b192a4() {
        return this.f59229xcb94b041[3] ? this.f59226x20a6d693 : "";
    }

    /* renamed from: getDebugNet */
    public int m110511x9c80d3c0() {
        return this.f59227xf4340db1;
    }

    /* renamed from: getFileDir */
    public java.lang.String m110512xad6913b() {
        return this.f59229xcb94b041[1] ? this.f59228xd42d8b4a : "";
    }

    /* renamed from: getRunningMode */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27110xb59c283f m110513x995b12cc() {
        return this.f59229xcb94b041[5] ? this.f59230x32119c23 : com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27110xb59c283f.kIlinkDeviceMode;
    }

    /* renamed from: getSelectDomain */
    public int m110514xc0b5db56() {
        return this.f59231x1a4a4967;
    }

    /* renamed from: getWechatDevicetype */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m110515x3b9829cc() {
        return this.f59229xcb94b041[7] ? this.f59232x4b180949 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: hasAppVersion */
    public boolean m110516x818e39b1() {
        return m110519x6e095e9(6);
    }

    /* renamed from: hasDebugIp */
    public boolean m110517xd5081ae0() {
        return m110519x6e095e9(3);
    }

    /* renamed from: hasDebugNet */
    public boolean m110518xcbfb5304() {
        return m110519x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m110519x6e095e9(int i17) {
        return this.f59229xcb94b041[i17];
    }

    /* renamed from: hasFileDir */
    public boolean m110520x462d1977() {
        return m110519x6e095e9(1);
    }

    /* renamed from: hasRunningMode */
    public boolean m110521xb97b1d08() {
        return m110519x6e095e9(5);
    }

    /* renamed from: hasSelectDomain */
    public boolean m110522xa497189a() {
        return m110519x6e095e9(4);
    }

    /* renamed from: hasWechatDevicetype */
    public boolean m110523xa6512510() {
        return m110519x6e095e9(7);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81 m110524x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f59228xd42d8b4a;
            if (str != null && this.f59229xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f59229xcb94b041[2]) {
                fVar.e(2, this.f59227xf4340db1);
            }
            java.lang.String str2 = this.f59226x20a6d693;
            if (str2 != null && this.f59229xcb94b041[3]) {
                fVar.j(3, str2);
            }
            if (this.f59229xcb94b041[4]) {
                fVar.e(4, this.f59231x1a4a4967);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27110xb59c283f enumC27110xb59c283f = this.f59230x32119c23;
            if (enumC27110xb59c283f != null && this.f59229xcb94b041[5]) {
                fVar.e(5, enumC27110xb59c283f.f59213x6ac9171);
            }
            if (this.f59229xcb94b041[6]) {
                fVar.e(6, this.f59225xca3e8cba);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f59232x4b180949;
            if (gVar != null && this.f59229xcb94b041[7]) {
                fVar.b(7, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f59228xd42d8b4a;
            if (str3 != null && this.f59229xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (this.f59229xcb94b041[2]) {
                i18 += b36.f.e(2, this.f59227xf4340db1);
            }
            java.lang.String str4 = this.f59226x20a6d693;
            if (str4 != null && this.f59229xcb94b041[3]) {
                i18 += b36.f.j(3, str4);
            }
            if (this.f59229xcb94b041[4]) {
                i18 += b36.f.e(4, this.f59231x1a4a4967);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27110xb59c283f enumC27110xb59c283f2 = this.f59230x32119c23;
            if (enumC27110xb59c283f2 != null && this.f59229xcb94b041[5]) {
                i18 += b36.f.e(5, enumC27110xb59c283f2.f59213x6ac9171);
            }
            if (this.f59229xcb94b041[6]) {
                i18 += b36.f.e(6, this.f59225xca3e8cba);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f59232x4b180949;
            return (gVar2 == null || !this.f59229xcb94b041[7]) ? i18 : i18 + b36.f.b(7, gVar2);
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
                this.f59228xd42d8b4a = aVar2.k(intValue);
                this.f59229xcb94b041[1] = true;
                return 0;
            case 2:
                this.f59227xf4340db1 = aVar2.g(intValue);
                this.f59229xcb94b041[2] = true;
                return 0;
            case 3:
                this.f59226x20a6d693 = aVar2.k(intValue);
                this.f59229xcb94b041[3] = true;
                return 0;
            case 4:
                this.f59231x1a4a4967 = aVar2.g(intValue);
                this.f59229xcb94b041[4] = true;
                return 0;
            case 5:
                this.f59230x32119c23 = com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27110xb59c283f.m110464x382ad972(aVar2.g(intValue));
                this.f59229xcb94b041[5] = true;
                return 0;
            case 6:
                this.f59225xca3e8cba = aVar2.g(intValue);
                this.f59229xcb94b041[6] = true;
                return 0;
            case 7:
                this.f59232x4b180949 = aVar2.d(intValue);
                this.f59229xcb94b041[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAppVersion */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81 m110526x74dac979(int i17) {
        this.f59225xca3e8cba = i17;
        this.f59229xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setDebugIp */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81 m110527xd22e018(java.lang.String str) {
        this.f59226x20a6d693 = str;
        this.f59229xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setDebugNet */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81 m110528x973934cc(int i17) {
        this.f59227xf4340db1 = i17;
        this.f59229xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setFileDir */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81 m110529x7e47deaf(java.lang.String str) {
        this.f59228xd42d8b4a = str;
        this.f59229xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setRunningMode */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81 m110530x2fc08640(com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27110xb59c283f enumC27110xb59c283f) {
        this.f59230x32119c23 = enumC27110xb59c283f;
        this.f59229xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setSelectDomain */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81 m110531xf6fed662(int i17) {
        this.f59231x1a4a4967 = i17;
        this.f59229xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setWechatDevicetype */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81 m110532xdf94bed8(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59232x4b180949 = gVar;
        this.f59229xcb94b041[7] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81 m110525x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27113x6b463e81) super.mo11468x92b714fd(bArr);
    }
}

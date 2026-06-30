package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkStartConfig */
/* loaded from: classes15.dex */
public class C3069x6b463e81 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 f11144xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81();

    /* renamed from: app_version */
    private int f11145xca3e8cba;

    /* renamed from: debug_ip */
    private java.lang.String f11146x20a6d693;

    /* renamed from: debug_net */
    private int f11147xf4340db1;

    /* renamed from: enable_cdn_dns_limit */
    private boolean f11148x65846dd7;

    /* renamed from: file_dir */
    private java.lang.String f11149xd42d8b4a;

    /* renamed from: group_key */
    private int f11150xa7a06c9f;

    /* renamed from: hasSetFields */
    private final boolean[] f11151xcb94b041 = new boolean[12];

    /* renamed from: running_mode */
    private com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3066xb59c283f f11152x32119c23;

    /* renamed from: select_domain */
    private int f11153x1a4a4967;

    /* renamed from: short_debug_ip */
    private java.lang.String f11154xd70dcef6;

    /* renamed from: short_debug_ip_port */
    private int f11155xb89a6c2a;

    /* renamed from: wechat_devicetype */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f11156x4b180949;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24529xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24530x7c90cfc0() {
        return f11144xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24531x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24532x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 c3069x6b463e81 = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81) fVar;
        return n51.f.a(this.f11149xd42d8b4a, c3069x6b463e81.f11149xd42d8b4a) && n51.f.a(java.lang.Integer.valueOf(this.f11147xf4340db1), java.lang.Integer.valueOf(c3069x6b463e81.f11147xf4340db1)) && n51.f.a(this.f11146x20a6d693, c3069x6b463e81.f11146x20a6d693) && n51.f.a(java.lang.Integer.valueOf(this.f11153x1a4a4967), java.lang.Integer.valueOf(c3069x6b463e81.f11153x1a4a4967)) && n51.f.a(this.f11152x32119c23, c3069x6b463e81.f11152x32119c23) && n51.f.a(java.lang.Integer.valueOf(this.f11145xca3e8cba), java.lang.Integer.valueOf(c3069x6b463e81.f11145xca3e8cba)) && n51.f.a(this.f11156x4b180949, c3069x6b463e81.f11156x4b180949) && n51.f.a(java.lang.Boolean.valueOf(this.f11148x65846dd7), java.lang.Boolean.valueOf(c3069x6b463e81.f11148x65846dd7)) && n51.f.a(java.lang.Integer.valueOf(this.f11150xa7a06c9f), java.lang.Integer.valueOf(c3069x6b463e81.f11150xa7a06c9f)) && n51.f.a(this.f11154xd70dcef6, c3069x6b463e81.f11154xd70dcef6) && n51.f.a(java.lang.Integer.valueOf(this.f11155xb89a6c2a), java.lang.Integer.valueOf(c3069x6b463e81.f11155xb89a6c2a));
    }

    /* renamed from: getAppVersion */
    public int m24533x46b67b6d() {
        return this.f11145xca3e8cba;
    }

    /* renamed from: getDebugIp */
    public java.lang.String m24534x99b192a4() {
        return this.f11151xcb94b041[3] ? this.f11146x20a6d693 : "";
    }

    /* renamed from: getDebugNet */
    public int m24535x9c80d3c0() {
        return this.f11147xf4340db1;
    }

    /* renamed from: getEnableCdnDnsLimit */
    public boolean m24536x739b9926() {
        return this.f11148x65846dd7;
    }

    /* renamed from: getFileDir */
    public java.lang.String m24537xad6913b() {
        return this.f11151xcb94b041[1] ? this.f11149xd42d8b4a : "";
    }

    /* renamed from: getGroupKey */
    public int m24538x9a0868d6() {
        return this.f11150xa7a06c9f;
    }

    /* renamed from: getRunningMode */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3066xb59c283f m24539x995b12cc() {
        return this.f11151xcb94b041[5] ? this.f11152x32119c23 : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3066xb59c283f.kIlinkDeviceMode;
    }

    /* renamed from: getSelectDomain */
    public int m24540xc0b5db56() {
        return this.f11153x1a4a4967;
    }

    /* renamed from: getShortDebugIp */
    public java.lang.String m24541x161f3934() {
        return this.f11151xcb94b041[10] ? this.f11154xd70dcef6 : "";
    }

    /* renamed from: getShortDebugIpPort */
    public int m24542x14dd8bd5() {
        return this.f11155xb89a6c2a;
    }

    /* renamed from: getWechatDevicetype */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m24543x3b9829cc() {
        return this.f11151xcb94b041[7] ? this.f11156x4b180949 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: hasAppVersion */
    public boolean m24544x818e39b1() {
        return m24548x6e095e9(6);
    }

    /* renamed from: hasDebugIp */
    public boolean m24545xd5081ae0() {
        return m24548x6e095e9(3);
    }

    /* renamed from: hasDebugNet */
    public boolean m24546xcbfb5304() {
        return m24548x6e095e9(2);
    }

    /* renamed from: hasEnableCdnDnsLimit */
    public boolean m24547x60020662() {
        return m24548x6e095e9(8);
    }

    /* renamed from: hasFieldNumber */
    public boolean m24548x6e095e9(int i17) {
        return this.f11151xcb94b041[i17];
    }

    /* renamed from: hasFileDir */
    public boolean m24549x462d1977() {
        return m24548x6e095e9(1);
    }

    /* renamed from: hasGroupKey */
    public boolean m24550xc982e81a() {
        return m24548x6e095e9(9);
    }

    /* renamed from: hasRunningMode */
    public boolean m24551xb97b1d08() {
        return m24548x6e095e9(5);
    }

    /* renamed from: hasSelectDomain */
    public boolean m24552xa497189a() {
        return m24548x6e095e9(4);
    }

    /* renamed from: hasShortDebugIp */
    public boolean m24553xfa007678() {
        return m24548x6e095e9(10);
    }

    /* renamed from: hasShortDebugIpPort */
    public boolean m24554x7f968719() {
        return m24548x6e095e9(11);
    }

    /* renamed from: hasWechatDevicetype */
    public boolean m24555xa6512510() {
        return m24548x6e095e9(7);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24556x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f11149xd42d8b4a;
            if (str != null && this.f11151xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f11151xcb94b041[2]) {
                fVar.e(2, this.f11147xf4340db1);
            }
            java.lang.String str2 = this.f11146x20a6d693;
            if (str2 != null && this.f11151xcb94b041[3]) {
                fVar.j(3, str2);
            }
            if (this.f11151xcb94b041[4]) {
                fVar.e(4, this.f11153x1a4a4967);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3066xb59c283f enumC3066xb59c283f = this.f11152x32119c23;
            if (enumC3066xb59c283f != null && this.f11151xcb94b041[5]) {
                fVar.e(5, enumC3066xb59c283f.f11133x6ac9171);
            }
            if (this.f11151xcb94b041[6]) {
                fVar.e(6, this.f11145xca3e8cba);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f11156x4b180949;
            if (gVar != null && this.f11151xcb94b041[7]) {
                fVar.b(7, gVar);
            }
            if (this.f11151xcb94b041[8]) {
                fVar.a(8, this.f11148x65846dd7);
            }
            if (this.f11151xcb94b041[9]) {
                fVar.e(9, this.f11150xa7a06c9f);
            }
            java.lang.String str3 = this.f11154xd70dcef6;
            if (str3 != null && this.f11151xcb94b041[10]) {
                fVar.j(10, str3);
            }
            if (this.f11151xcb94b041[11]) {
                fVar.e(11, this.f11155xb89a6c2a);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f11149xd42d8b4a;
            if (str4 != null && this.f11151xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (this.f11151xcb94b041[2]) {
                i18 += b36.f.e(2, this.f11147xf4340db1);
            }
            java.lang.String str5 = this.f11146x20a6d693;
            if (str5 != null && this.f11151xcb94b041[3]) {
                i18 += b36.f.j(3, str5);
            }
            if (this.f11151xcb94b041[4]) {
                i18 += b36.f.e(4, this.f11153x1a4a4967);
            }
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3066xb59c283f enumC3066xb59c283f2 = this.f11152x32119c23;
            if (enumC3066xb59c283f2 != null && this.f11151xcb94b041[5]) {
                i18 += b36.f.e(5, enumC3066xb59c283f2.f11133x6ac9171);
            }
            if (this.f11151xcb94b041[6]) {
                i18 += b36.f.e(6, this.f11145xca3e8cba);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f11156x4b180949;
            if (gVar2 != null && this.f11151xcb94b041[7]) {
                i18 += b36.f.b(7, gVar2);
            }
            if (this.f11151xcb94b041[8]) {
                i18 += b36.f.a(8, this.f11148x65846dd7);
            }
            if (this.f11151xcb94b041[9]) {
                i18 += b36.f.e(9, this.f11150xa7a06c9f);
            }
            java.lang.String str6 = this.f11154xd70dcef6;
            if (str6 != null && this.f11151xcb94b041[10]) {
                i18 += b36.f.j(10, str6);
            }
            return this.f11151xcb94b041[11] ? i18 + b36.f.e(11, this.f11155xb89a6c2a) : i18;
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
                this.f11149xd42d8b4a = aVar2.k(intValue);
                this.f11151xcb94b041[1] = true;
                return 0;
            case 2:
                this.f11147xf4340db1 = aVar2.g(intValue);
                this.f11151xcb94b041[2] = true;
                return 0;
            case 3:
                this.f11146x20a6d693 = aVar2.k(intValue);
                this.f11151xcb94b041[3] = true;
                return 0;
            case 4:
                this.f11153x1a4a4967 = aVar2.g(intValue);
                this.f11151xcb94b041[4] = true;
                return 0;
            case 5:
                this.f11152x32119c23 = com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3066xb59c283f.m24488x382ad972(aVar2.g(intValue));
                this.f11151xcb94b041[5] = true;
                return 0;
            case 6:
                this.f11145xca3e8cba = aVar2.g(intValue);
                this.f11151xcb94b041[6] = true;
                return 0;
            case 7:
                this.f11156x4b180949 = aVar2.d(intValue);
                this.f11151xcb94b041[7] = true;
                return 0;
            case 8:
                this.f11148x65846dd7 = aVar2.c(intValue);
                this.f11151xcb94b041[8] = true;
                return 0;
            case 9:
                this.f11150xa7a06c9f = aVar2.g(intValue);
                this.f11151xcb94b041[9] = true;
                return 0;
            case 10:
                this.f11154xd70dcef6 = aVar2.k(intValue);
                this.f11151xcb94b041[10] = true;
                return 0;
            case 11:
                this.f11155xb89a6c2a = aVar2.g(intValue);
                this.f11151xcb94b041[11] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAppVersion */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24558x74dac979(int i17) {
        this.f11145xca3e8cba = i17;
        this.f11151xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setDebugIp */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24559xd22e018(java.lang.String str) {
        this.f11146x20a6d693 = str;
        this.f11151xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setDebugNet */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24560x973934cc(int i17) {
        this.f11147xf4340db1 = i17;
        this.f11151xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setEnableCdnDnsLimit */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24561x4f31a59a(boolean z17) {
        this.f11148x65846dd7 = z17;
        this.f11151xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setFileDir */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24562x7e47deaf(java.lang.String str) {
        this.f11149xd42d8b4a = str;
        this.f11151xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setGroupKey */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24563x94c0c9e2(int i17) {
        this.f11150xa7a06c9f = i17;
        this.f11151xcb94b041[9] = true;
        return this;
    }

    /* renamed from: setRunningMode */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24564x2fc08640(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3066xb59c283f enumC3066xb59c283f) {
        this.f11152x32119c23 = enumC3066xb59c283f;
        this.f11151xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setSelectDomain */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24565xf6fed662(int i17) {
        this.f11153x1a4a4967 = i17;
        this.f11151xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setShortDebugIp */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24566x4c683440(java.lang.String str) {
        this.f11154xd70dcef6 = str;
        this.f11151xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setShortDebugIpPort */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24567xb8da20e1(int i17) {
        this.f11155xb89a6c2a = i17;
        this.f11151xcb94b041[11] = true;
        return this;
    }

    /* renamed from: setWechatDevicetype */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24568xdf94bed8(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f11156x4b180949 = gVar;
        this.f11151xcb94b041[7] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 m24557x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3069x6b463e81) super.mo11468x92b714fd(bArr);
    }
}

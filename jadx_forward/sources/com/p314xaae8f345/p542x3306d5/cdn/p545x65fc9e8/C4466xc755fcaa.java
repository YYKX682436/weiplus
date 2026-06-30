package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.CDNDnsInfo */
/* loaded from: classes8.dex */
public class C4466xc755fcaa extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa f18503xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa();

    /* renamed from: AuthKey */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 f18504x3caf1f77;

    /* renamed from: ExpireTime */
    private int f18505x4510f8ac;

    /* renamed from: FakeUin */
    private int f18506x228d50a5;

    /* renamed from: FrontID */
    private int f18507x3fcc98e4;

    /* renamed from: FrontIPCount */
    private int f18508xbdc1ddff;

    /* renamed from: FrontIPPortCount */
    private int f18510x1e1a85fe;

    /* renamed from: NewAuthKey */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 f18512x73bb3df7;
    private int Uin;
    private int Ver;

    /* renamed from: ZoneDomain */
    private java.lang.String f18513x276d4fb0;

    /* renamed from: ZoneID */
    private int f18514x9fe3dde7;

    /* renamed from: ZoneIPCount */
    private int f18515x978c42dc;

    /* renamed from: ZoneIPPortCount */
    private int f18517x903d345b;

    /* renamed from: FrontIPList */
    private java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91> f18509xe51ac5ae = new java.util.LinkedList<>();

    /* renamed from: ZoneIPList */
    private java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91> f18516x2e31d131 = new java.util.LinkedList<>();

    /* renamed from: FrontIPPortList */
    private java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb> f18511x851da1cf = new java.util.LinkedList<>();

    /* renamed from: ZoneIPPortList */
    private java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb> f18518xced33d2 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f18519xcb94b041 = new boolean[18];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38321xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38322x7c90cfc0() {
        return f18503xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38323x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa();
    }

    /* renamed from: addAllElementFrontIPList */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38324xf18d5692(java.util.Collection<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91> collection) {
        this.f18509xe51ac5ae.addAll(collection);
        this.f18519xcb94b041[6] = true;
        return this;
    }

    /* renamed from: addAllElementFrontIPPortList */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38325x25520b3(java.util.Collection<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb> collection) {
        this.f18511x851da1cf.addAll(collection);
        this.f18519xcb94b041[12] = true;
        return this;
    }

    /* renamed from: addAllElementZoneIPList */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38326xaa7793cd(java.util.Collection<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91> collection) {
        this.f18516x2e31d131.addAll(collection);
        this.f18519xcb94b041[11] = true;
        return this;
    }

    /* renamed from: addAllElementZoneIPPortList */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38327x9518486e(java.util.Collection<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb> collection) {
        this.f18518xced33d2.addAll(collection);
        this.f18519xcb94b041[13] = true;
        return this;
    }

    /* renamed from: addElementFrontIPList */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38328xd6165fb3(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91 c4520x826d1b91) {
        this.f18509xe51ac5ae.add(c4520x826d1b91);
        this.f18519xcb94b041[6] = true;
        return this;
    }

    /* renamed from: addElementFrontIPPortList */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38329xfb02b154(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb c4467x1e4582cb) {
        this.f18511x851da1cf.add(c4467x1e4582cb);
        this.f18519xcb94b041[12] = true;
        return this;
    }

    /* renamed from: addElementZoneIPList */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38330x7808628c(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91 c4520x826d1b91) {
        this.f18516x2e31d131.add(c4520x826d1b91);
        this.f18519xcb94b041[11] = true;
        return this;
    }

    /* renamed from: addElementZoneIPPortList */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38331x7c159fad(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb c4467x1e4582cb) {
        this.f18518xced33d2.add(c4467x1e4582cb);
        this.f18519xcb94b041[13] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38332x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa c4466xc755fcaa = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.Ver), java.lang.Integer.valueOf(c4466xc755fcaa.Ver)) && n51.f.a(java.lang.Integer.valueOf(this.Uin), java.lang.Integer.valueOf(c4466xc755fcaa.Uin)) && n51.f.a(java.lang.Integer.valueOf(this.f18505x4510f8ac), java.lang.Integer.valueOf(c4466xc755fcaa.f18505x4510f8ac)) && n51.f.a(java.lang.Integer.valueOf(this.f18507x3fcc98e4), java.lang.Integer.valueOf(c4466xc755fcaa.f18507x3fcc98e4)) && n51.f.a(java.lang.Integer.valueOf(this.f18508xbdc1ddff), java.lang.Integer.valueOf(c4466xc755fcaa.f18508xbdc1ddff)) && n51.f.a(this.f18509xe51ac5ae, c4466xc755fcaa.f18509xe51ac5ae) && n51.f.a(this.f18513x276d4fb0, c4466xc755fcaa.f18513x276d4fb0) && n51.f.a(this.f18504x3caf1f77, c4466xc755fcaa.f18504x3caf1f77) && n51.f.a(java.lang.Integer.valueOf(this.f18514x9fe3dde7), java.lang.Integer.valueOf(c4466xc755fcaa.f18514x9fe3dde7)) && n51.f.a(java.lang.Integer.valueOf(this.f18515x978c42dc), java.lang.Integer.valueOf(c4466xc755fcaa.f18515x978c42dc)) && n51.f.a(this.f18516x2e31d131, c4466xc755fcaa.f18516x2e31d131) && n51.f.a(this.f18511x851da1cf, c4466xc755fcaa.f18511x851da1cf) && n51.f.a(this.f18518xced33d2, c4466xc755fcaa.f18518xced33d2) && n51.f.a(java.lang.Integer.valueOf(this.f18510x1e1a85fe), java.lang.Integer.valueOf(c4466xc755fcaa.f18510x1e1a85fe)) && n51.f.a(java.lang.Integer.valueOf(this.f18517x903d345b), java.lang.Integer.valueOf(c4466xc755fcaa.f18517x903d345b)) && n51.f.a(java.lang.Integer.valueOf(this.f18506x228d50a5), java.lang.Integer.valueOf(c4466xc755fcaa.f18506x228d50a5)) && n51.f.a(this.f18512x73bb3df7, c4466xc755fcaa.f18512x73bb3df7);
    }

    /* renamed from: getAuthKey */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 m38333x1743c361() {
        return this.f18519xcb94b041[8] ? this.f18504x3caf1f77 : new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000();
    }

    /* renamed from: getExpireTime */
    public int m38334xbc7fd482() {
        return this.f18505x4510f8ac;
    }

    /* renamed from: getFakeUin */
    public int m38335xfd21f48f() {
        return this.f18506x228d50a5;
    }

    /* renamed from: getFrontID */
    public int m38336x1a613cce() {
        return this.f18507x3fcc98e4;
    }

    /* renamed from: getFrontIPCount */
    public int m38337x14e91c55() {
        return this.f18508xbdc1ddff;
    }

    /* renamed from: getFrontIPList */
    public java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91> m38338x5b876498() {
        return this.f18509xe51ac5ae;
    }

    /* renamed from: getFrontIPPortCount */
    public int m38339xf82ea954() {
        return this.f18510x1e1a85fe;
    }

    /* renamed from: getFrontIPPortList */
    public java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb> m38340xa4ecbbb9() {
        return this.f18511x851da1cf;
    }

    /* renamed from: getNewAuthKey */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 m38341xeb2a19cd() {
        return this.f18519xcb94b041[17] ? this.f18512x73bb3df7 : new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000();
    }

    /* renamed from: getUin */
    public int m38342xb5887524() {
        return this.Uin;
    }

    /* renamed from: getVer */
    public int m38343xb588786d() {
        return this.Ver;
    }

    /* renamed from: getZoneDomain */
    public java.lang.String m38344x9edc2b86() {
        return this.f18519xcb94b041[7] ? this.f18513x276d4fb0 : "";
    }

    /* renamed from: getZoneID */
    public int m38345x3b9614bd() {
        return this.f18514x9fe3dde7;
    }

    /* renamed from: getZoneIPCount */
    public int m38346xdf8e1c6() {
        return this.f18515x978c42dc;
    }

    /* renamed from: getZoneIPList */
    public java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91> m38347xa5a0ad07() {
        return this.f18516x2e31d131;
    }

    /* renamed from: getZoneIPPortCount */
    public int m38348xb00c4e45() {
        return this.f18517x903d345b;
    }

    /* renamed from: getZoneIPPortList */
    public java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb> m38349x373e34a8() {
        return this.f18518xced33d2;
    }

    /* renamed from: hasAuthKey */
    public boolean m38350x529a4b9d() {
        return m38353x6e095e9(8);
    }

    /* renamed from: hasExpireTime */
    public boolean m38351xf75792c6() {
        return m38353x6e095e9(3);
    }

    /* renamed from: hasFakeUin */
    public boolean m38352x38787ccb() {
        return m38353x6e095e9(16);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38353x6e095e9(int i17) {
        return this.f18519xcb94b041[i17];
    }

    /* renamed from: hasFrontID */
    public boolean m38354x55b7c50a() {
        return m38353x6e095e9(4);
    }

    /* renamed from: hasFrontIPCount */
    public boolean m38355xf8ca5999() {
        return m38353x6e095e9(5);
    }

    /* renamed from: hasFrontIPList */
    public boolean m38356x7ba76ed4() {
        return m38353x6e095e9(6);
    }

    /* renamed from: hasFrontIPPortCount */
    public boolean m38357x62e7a498() {
        return m38353x6e095e9(14);
    }

    /* renamed from: hasFrontIPPortList */
    public boolean m38358x454547f5() {
        return m38353x6e095e9(12);
    }

    /* renamed from: hasNewAuthKey */
    public boolean m38359x2601d811() {
        return m38353x6e095e9(17);
    }

    /* renamed from: hasUin */
    public boolean m38360xb7047b60() {
        return m38353x6e095e9(2);
    }

    /* renamed from: hasVer */
    public boolean m38361xb7047ea9() {
        return m38353x6e095e9(1);
    }

    /* renamed from: hasZoneDomain */
    public boolean m38362xd9b3e9ca() {
        return m38353x6e095e9(7);
    }

    /* renamed from: hasZoneID */
    public boolean m38363xfb6f9501() {
        return m38353x6e095e9(9);
    }

    /* renamed from: hasZoneIPCount */
    public boolean m38364x2e18ec02() {
        return m38353x6e095e9(10);
    }

    /* renamed from: hasZoneIPList */
    public boolean m38365xe0786b4b() {
        return m38353x6e095e9(11);
    }

    /* renamed from: hasZoneIPPortCount */
    public boolean m38366x5064da81() {
        return m38353x6e095e9(15);
    }

    /* renamed from: hasZoneIPPortList */
    public boolean m38367xa7c530ec() {
        return m38353x6e095e9(13);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38368x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18519xcb94b041[1]) {
                fVar.e(1, this.Ver);
            }
            if (this.f18519xcb94b041[2]) {
                fVar.e(2, this.Uin);
            }
            if (this.f18519xcb94b041[3]) {
                fVar.e(3, this.f18505x4510f8ac);
            }
            if (this.f18519xcb94b041[4]) {
                fVar.e(4, this.f18507x3fcc98e4);
            }
            if (this.f18519xcb94b041[5]) {
                fVar.e(5, this.f18508xbdc1ddff);
            }
            fVar.g(6, 8, this.f18509xe51ac5ae);
            java.lang.String str = this.f18513x276d4fb0;
            if (str != null && this.f18519xcb94b041[7]) {
                fVar.j(7, str);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb70000 = this.f18504x3caf1f77;
            if (c4519xbcb70000 != null && this.f18519xcb94b041[8]) {
                fVar.i(8, c4519xbcb70000.mo75928xcd1e8d8());
                this.f18504x3caf1f77.mo75956x3d5d1f78(fVar);
            }
            if (this.f18519xcb94b041[9]) {
                fVar.e(9, this.f18514x9fe3dde7);
            }
            if (this.f18519xcb94b041[10]) {
                fVar.e(10, this.f18515x978c42dc);
            }
            fVar.g(11, 8, this.f18516x2e31d131);
            fVar.g(12, 8, this.f18511x851da1cf);
            fVar.g(13, 8, this.f18518xced33d2);
            if (this.f18519xcb94b041[14]) {
                fVar.e(14, this.f18510x1e1a85fe);
            }
            if (this.f18519xcb94b041[15]) {
                fVar.e(15, this.f18517x903d345b);
            }
            if (this.f18519xcb94b041[16]) {
                fVar.e(16, this.f18506x228d50a5);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb700002 = this.f18512x73bb3df7;
            if (c4519xbcb700002 != null && this.f18519xcb94b041[17]) {
                fVar.i(17, c4519xbcb700002.mo75928xcd1e8d8());
                this.f18512x73bb3df7.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f18519xcb94b041[1] ? b36.f.e(1, this.Ver) + 0 : 0;
            if (this.f18519xcb94b041[2]) {
                e17 += b36.f.e(2, this.Uin);
            }
            if (this.f18519xcb94b041[3]) {
                e17 += b36.f.e(3, this.f18505x4510f8ac);
            }
            if (this.f18519xcb94b041[4]) {
                e17 += b36.f.e(4, this.f18507x3fcc98e4);
            }
            if (this.f18519xcb94b041[5]) {
                e17 += b36.f.e(5, this.f18508xbdc1ddff);
            }
            int g17 = e17 + b36.f.g(6, 8, this.f18509xe51ac5ae);
            java.lang.String str2 = this.f18513x276d4fb0;
            if (str2 != null && this.f18519xcb94b041[7]) {
                g17 += b36.f.j(7, str2);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb700003 = this.f18504x3caf1f77;
            if (c4519xbcb700003 != null && this.f18519xcb94b041[8]) {
                g17 += b36.f.i(8, c4519xbcb700003.mo75928xcd1e8d8());
            }
            if (this.f18519xcb94b041[9]) {
                g17 += b36.f.e(9, this.f18514x9fe3dde7);
            }
            if (this.f18519xcb94b041[10]) {
                g17 += b36.f.e(10, this.f18515x978c42dc);
            }
            int g18 = g17 + b36.f.g(11, 8, this.f18516x2e31d131) + b36.f.g(12, 8, this.f18511x851da1cf) + b36.f.g(13, 8, this.f18518xced33d2);
            if (this.f18519xcb94b041[14]) {
                g18 += b36.f.e(14, this.f18510x1e1a85fe);
            }
            if (this.f18519xcb94b041[15]) {
                g18 += b36.f.e(15, this.f18517x903d345b);
            }
            if (this.f18519xcb94b041[16]) {
                g18 += b36.f.e(16, this.f18506x228d50a5);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb700004 = this.f18512x73bb3df7;
            return (c4519xbcb700004 == null || !this.f18519xcb94b041[17]) ? g18 : g18 + b36.f.i(17, c4519xbcb700004.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f18509xe51ac5ae.clear();
            this.f18516x2e31d131.clear();
            this.f18511x851da1cf.clear();
            this.f18518xced33d2.clear();
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
                this.Ver = aVar2.g(intValue);
                this.f18519xcb94b041[1] = true;
                return 0;
            case 2:
                this.Uin = aVar2.g(intValue);
                this.f18519xcb94b041[2] = true;
                return 0;
            case 3:
                this.f18505x4510f8ac = aVar2.g(intValue);
                this.f18519xcb94b041[3] = true;
                return 0;
            case 4:
                this.f18507x3fcc98e4 = aVar2.g(intValue);
                this.f18519xcb94b041[4] = true;
                return 0;
            case 5:
                this.f18508xbdc1ddff = aVar2.g(intValue);
                this.f18519xcb94b041[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91 c4520x826d1b91 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91();
                    if (bArr != null && bArr.length > 0) {
                        c4520x826d1b91.mo11468x92b714fd(bArr);
                    }
                    this.f18509xe51ac5ae.add(c4520x826d1b91);
                }
                this.f18519xcb94b041[6] = true;
                return 0;
            case 7:
                this.f18513x276d4fb0 = aVar2.k(intValue);
                this.f18519xcb94b041[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb700005 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000();
                    if (bArr2 != null && bArr2.length > 0) {
                        c4519xbcb700005.mo11468x92b714fd(bArr2);
                    }
                    this.f18504x3caf1f77 = c4519xbcb700005;
                }
                this.f18519xcb94b041[8] = true;
                return 0;
            case 9:
                this.f18514x9fe3dde7 = aVar2.g(intValue);
                this.f18519xcb94b041[9] = true;
                return 0;
            case 10:
                this.f18515x978c42dc = aVar2.g(intValue);
                this.f18519xcb94b041[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91 c4520x826d1b912 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91();
                    if (bArr3 != null && bArr3.length > 0) {
                        c4520x826d1b912.mo11468x92b714fd(bArr3);
                    }
                    this.f18516x2e31d131.add(c4520x826d1b912);
                }
                this.f18519xcb94b041[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb c4467x1e4582cb = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb();
                    if (bArr4 != null && bArr4.length > 0) {
                        c4467x1e4582cb.mo11468x92b714fd(bArr4);
                    }
                    this.f18511x851da1cf.add(c4467x1e4582cb);
                }
                this.f18519xcb94b041[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb c4467x1e4582cb2 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb();
                    if (bArr5 != null && bArr5.length > 0) {
                        c4467x1e4582cb2.mo11468x92b714fd(bArr5);
                    }
                    this.f18518xced33d2.add(c4467x1e4582cb2);
                }
                this.f18519xcb94b041[13] = true;
                return 0;
            case 14:
                this.f18510x1e1a85fe = aVar2.g(intValue);
                this.f18519xcb94b041[14] = true;
                return 0;
            case 15:
                this.f18517x903d345b = aVar2.g(intValue);
                this.f18519xcb94b041[15] = true;
                return 0;
            case 16:
                this.f18506x228d50a5 = aVar2.g(intValue);
                this.f18519xcb94b041[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb700006 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000();
                    if (bArr6 != null && bArr6.length > 0) {
                        c4519xbcb700006.mo11468x92b714fd(bArr6);
                    }
                    this.f18512x73bb3df7 = c4519xbcb700006;
                }
                this.f18519xcb94b041[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setAuthKey */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38370x8ab510d5(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb70000) {
        this.f18504x3caf1f77 = c4519xbcb70000;
        this.f18519xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setExpireTime */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38371xeaa4228e(int i17) {
        this.f18505x4510f8ac = i17;
        this.f18519xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setFakeUin */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38372x70934203(int i17) {
        this.f18506x228d50a5 = i17;
        this.f18519xcb94b041[16] = true;
        return this;
    }

    /* renamed from: setFrontID */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38373x8dd28a42(int i17) {
        this.f18507x3fcc98e4 = i17;
        this.f18519xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setFrontIPCount */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38374x4b321761(int i17) {
        this.f18508xbdc1ddff = i17;
        this.f18519xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setFrontIPList */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38375xf1ecd80c(java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91> linkedList) {
        this.f18509xe51ac5ae = linkedList;
        this.f18519xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setFrontIPPortCount */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38376x9c2b3e60(int i17) {
        this.f18510x1e1a85fe = i17;
        this.f18519xcb94b041[14] = true;
        return this;
    }

    /* renamed from: setFrontIPPortList */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38377xdbc3552d(java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb> linkedList) {
        this.f18511x851da1cf = linkedList;
        this.f18519xcb94b041[12] = true;
        return this;
    }

    /* renamed from: setNewAuthKey */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38378x194e67d9(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb70000) {
        this.f18512x73bb3df7 = c4519xbcb70000;
        this.f18519xcb94b041[17] = true;
        return this;
    }

    /* renamed from: setUin */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38379xca029c98(int i17) {
        this.Uin = i17;
        this.f18519xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setVer */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38380xca029fe1(int i17) {
        this.Ver = i17;
        this.f18519xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setZoneDomain */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38381xcd007992(java.lang.String str) {
        this.f18513x276d4fb0 = str;
        this.f18519xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setZoneID */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38382x2ecb48c9(int i17) {
        this.f18514x9fe3dde7 = i17;
        this.f18519xcb94b041[9] = true;
        return this;
    }

    /* renamed from: setZoneIPCount */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38383xa45e553a(int i17) {
        this.f18515x978c42dc = i17;
        this.f18519xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setZoneIPList */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38384xd3c4fb13(java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4520x826d1b91> linkedList) {
        this.f18516x2e31d131 = linkedList;
        this.f18519xcb94b041[11] = true;
        return this;
    }

    /* renamed from: setZoneIPPortCount */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38385xe6e2e7b9(int i17) {
        this.f18517x903d345b = i17;
        this.f18519xcb94b041[15] = true;
        return this;
    }

    /* renamed from: setZoneIPPortList */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38386xff349cb4(java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4467x1e4582cb> linkedList) {
        this.f18518xced33d2 = linkedList;
        this.f18519xcb94b041[13] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa m38369x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4466xc755fcaa) super.mo11468x92b714fd(bArr);
    }
}

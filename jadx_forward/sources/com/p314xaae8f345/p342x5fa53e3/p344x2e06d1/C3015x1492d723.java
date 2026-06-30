package com.p314xaae8f345.p342x5fa53e3.p344x2e06d1;

/* renamed from: com.tencent.ilink.base.IlinkLogConfig */
/* loaded from: classes15.dex */
public class C3015x1492d723 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 f10599xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723();

    /* renamed from: config_xlog */
    private boolean f10600x10d1ea9;

    /* renamed from: custom_log */
    private boolean f10601xa1be3d76;

    /* renamed from: enable_console */
    private boolean f10602xd5eb7e9b;

    /* renamed from: enable_filter */
    private boolean f10603x34f9f9b4;

    /* renamed from: enable_xlog */
    private boolean f10604xaad7bd08;

    /* renamed from: hasSetFields */
    private final boolean[] f10605xcb94b041 = new boolean[9];

    /* renamed from: level */
    private com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783 f10606x6219b84;

    /* renamed from: log_mode */
    private com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.EnumC3016xcc5c11c4 f10607x7803b9be;

    /* renamed from: xlog_so_name */
    private java.lang.String f10608x11f6091b;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 m23066xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 m23067x7c90cfc0() {
        return f10599xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 m23068x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 m23069x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 c3015x1492d723 = (com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723) fVar;
        return n51.f.a(this.f10606x6219b84, c3015x1492d723.f10606x6219b84) && n51.f.a(java.lang.Boolean.valueOf(this.f10601xa1be3d76), java.lang.Boolean.valueOf(c3015x1492d723.f10601xa1be3d76)) && n51.f.a(java.lang.Boolean.valueOf(this.f10602xd5eb7e9b), java.lang.Boolean.valueOf(c3015x1492d723.f10602xd5eb7e9b)) && n51.f.a(java.lang.Boolean.valueOf(this.f10603x34f9f9b4), java.lang.Boolean.valueOf(c3015x1492d723.f10603x34f9f9b4)) && n51.f.a(java.lang.Boolean.valueOf(this.f10604xaad7bd08), java.lang.Boolean.valueOf(c3015x1492d723.f10604xaad7bd08)) && n51.f.a(this.f10608x11f6091b, c3015x1492d723.f10608x11f6091b) && n51.f.a(java.lang.Boolean.valueOf(this.f10600x10d1ea9), java.lang.Boolean.valueOf(c3015x1492d723.f10600x10d1ea9)) && n51.f.a(this.f10607x7803b9be, c3015x1492d723.f10607x7803b9be);
    }

    /* renamed from: getConfigXlog */
    public boolean m23070x1fd26e24() {
        return this.f10600x10d1ea9;
    }

    /* renamed from: getCustomLog */
    public boolean m23071x5f7b8f5d() {
        return this.f10601xa1be3d76;
    }

    /* renamed from: getEnableConsole */
    public boolean m23072x38d06a9e() {
        return this.f10602xd5eb7e9b;
    }

    /* renamed from: getEnableFilter */
    public boolean m23073xe5960151() {
        return this.f10603x34f9f9b4;
    }

    /* renamed from: getEnableXlog */
    public boolean m23074x5f1b07e5() {
        return this.f10604xaad7bd08;
    }

    /* renamed from: getLevel */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783 m23075x74bf41ce() {
        return this.f10605xcb94b041[1] ? this.f10606x6219b84 : com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783.kIlinkLogLevelVerbose;
    }

    /* renamed from: getLogMode */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.EnumC3016xcc5c11c4 m23076x52284ad1() {
        return this.f10605xcb94b041[8] ? this.f10607x7803b9be : com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.EnumC3016xcc5c11c4.kIlinkLogModeSync;
    }

    /* renamed from: getXlogSoName */
    public java.lang.String m23077xe4b439e9() {
        return this.f10605xcb94b041[6] ? this.f10608x11f6091b : "";
    }

    /* renamed from: hasConfigXlog */
    public boolean m23078x5aaa2c68() {
        return m23083x6e095e9(7);
    }

    /* renamed from: hasCustomLog */
    public boolean m23079x1f50f899() {
        return m23083x6e095e9(2);
    }

    /* renamed from: hasEnableConsole */
    public boolean m23080xd116d5da() {
        return m23083x6e095e9(3);
    }

    /* renamed from: hasEnableFilter */
    public boolean m23081xc9773e95() {
        return m23083x6e095e9(4);
    }

    /* renamed from: hasEnableXlog */
    public boolean m23082x99f2c629() {
        return m23083x6e095e9(5);
    }

    /* renamed from: hasFieldNumber */
    public boolean m23083x6e095e9(int i17) {
        return this.f10605xcb94b041[i17];
    }

    /* renamed from: hasLevel */
    public boolean m23084x752a90a() {
        return m23083x6e095e9(1);
    }

    /* renamed from: hasLogMode */
    public boolean m23085x8d7ed30d() {
        return m23083x6e095e9(8);
    }

    /* renamed from: hasXlogSoName */
    public boolean m23086x1f8bf82d() {
        return m23083x6e095e9(6);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 m23087x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783 enumC3057xbf13c783 = this.f10606x6219b84;
            if (enumC3057xbf13c783 != null && this.f10605xcb94b041[1]) {
                fVar.e(1, enumC3057xbf13c783.f11063x6ac9171);
            }
            if (this.f10605xcb94b041[2]) {
                fVar.a(2, this.f10601xa1be3d76);
            }
            if (this.f10605xcb94b041[3]) {
                fVar.a(3, this.f10602xd5eb7e9b);
            }
            if (this.f10605xcb94b041[4]) {
                fVar.a(4, this.f10603x34f9f9b4);
            }
            if (this.f10605xcb94b041[5]) {
                fVar.a(5, this.f10604xaad7bd08);
            }
            java.lang.String str = this.f10608x11f6091b;
            if (str != null && this.f10605xcb94b041[6]) {
                fVar.j(6, str);
            }
            if (this.f10605xcb94b041[7]) {
                fVar.a(7, this.f10600x10d1ea9);
            }
            com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.EnumC3016xcc5c11c4 enumC3016xcc5c11c4 = this.f10607x7803b9be;
            if (enumC3016xcc5c11c4 != null && this.f10605xcb94b041[8]) {
                fVar.e(8, enumC3016xcc5c11c4.f10614x6ac9171);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783 enumC3057xbf13c7832 = this.f10606x6219b84;
            if (enumC3057xbf13c7832 != null && this.f10605xcb94b041[1]) {
                i18 = 0 + b36.f.e(1, enumC3057xbf13c7832.f11063x6ac9171);
            }
            if (this.f10605xcb94b041[2]) {
                i18 += b36.f.a(2, this.f10601xa1be3d76);
            }
            if (this.f10605xcb94b041[3]) {
                i18 += b36.f.a(3, this.f10602xd5eb7e9b);
            }
            if (this.f10605xcb94b041[4]) {
                i18 += b36.f.a(4, this.f10603x34f9f9b4);
            }
            if (this.f10605xcb94b041[5]) {
                i18 += b36.f.a(5, this.f10604xaad7bd08);
            }
            java.lang.String str2 = this.f10608x11f6091b;
            if (str2 != null && this.f10605xcb94b041[6]) {
                i18 += b36.f.j(6, str2);
            }
            if (this.f10605xcb94b041[7]) {
                i18 += b36.f.a(7, this.f10600x10d1ea9);
            }
            com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.EnumC3016xcc5c11c4 enumC3016xcc5c11c42 = this.f10607x7803b9be;
            return (enumC3016xcc5c11c42 == null || !this.f10605xcb94b041[8]) ? i18 : i18 + b36.f.e(8, enumC3016xcc5c11c42.f10614x6ac9171);
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
                this.f10606x6219b84 = com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783.m24315x382ad972(aVar2.g(intValue));
                this.f10605xcb94b041[1] = true;
                return 0;
            case 2:
                this.f10601xa1be3d76 = aVar2.c(intValue);
                this.f10605xcb94b041[2] = true;
                return 0;
            case 3:
                this.f10602xd5eb7e9b = aVar2.c(intValue);
                this.f10605xcb94b041[3] = true;
                return 0;
            case 4:
                this.f10603x34f9f9b4 = aVar2.c(intValue);
                this.f10605xcb94b041[4] = true;
                return 0;
            case 5:
                this.f10604xaad7bd08 = aVar2.c(intValue);
                this.f10605xcb94b041[5] = true;
                return 0;
            case 6:
                this.f10608x11f6091b = aVar2.k(intValue);
                this.f10605xcb94b041[6] = true;
                return 0;
            case 7:
                this.f10600x10d1ea9 = aVar2.c(intValue);
                this.f10605xcb94b041[7] = true;
                return 0;
            case 8:
                this.f10607x7803b9be = com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.EnumC3016xcc5c11c4.m23099x382ad972(aVar2.g(intValue));
                this.f10605xcb94b041[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setConfigXlog */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 m23089x4df6bc30(boolean z17) {
        this.f10600x10d1ea9 = z17;
        this.f10605xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setCustomLog */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 m23090xbbcf4fd1(boolean z17) {
        this.f10601xa1be3d76 = z17;
        this.f10605xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setEnableConsole */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 m23091xcba6d112(boolean z17) {
        this.f10602xd5eb7e9b = z17;
        this.f10605xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setEnableFilter */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 m23092x1bdefc5d(boolean z17) {
        this.f10603x34f9f9b4 = z17;
        this.f10605xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setEnableXlog */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 m23093x8d3f55f1(boolean z17) {
        this.f10604xaad7bd08 = z17;
        this.f10605xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setLevel */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 m23094x534d5c42(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783 enumC3057xbf13c783) {
        this.f10606x6219b84 = enumC3057xbf13c783;
        this.f10605xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setLogMode */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 m23095xc5999845(com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.EnumC3016xcc5c11c4 enumC3016xcc5c11c4) {
        this.f10607x7803b9be = enumC3016xcc5c11c4;
        this.f10605xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setXlogSoName */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 m23096x12d887f5(java.lang.String str) {
        this.f10608x11f6091b = str;
        this.f10605xcb94b041[6] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 m23088x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.C3015x1492d723) super.mo11468x92b714fd(bArr);
    }
}

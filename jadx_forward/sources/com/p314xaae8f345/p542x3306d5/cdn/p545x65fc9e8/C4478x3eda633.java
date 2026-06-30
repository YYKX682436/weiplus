package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.Debug */
/* loaded from: classes8.dex */
public class C4478x3eda633 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 f18586xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633();

    /* renamed from: authkey */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f18587xd976ffb7;

    /* renamed from: groupkey */
    private java.lang.String f18588x1e2ea380;

    /* renamed from: hasSetFields */
    private final boolean[] f18589xcb94b041 = new boolean[4];

    /* renamed from: svrip */
    private java.lang.String f18590x68bebd6;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 m38591xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 m38592x7c90cfc0() {
        return f18586xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 m38593x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 m38594x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 c4478x3eda633 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633) fVar;
        return n51.f.a(this.f18590x68bebd6, c4478x3eda633.f18590x68bebd6) && n51.f.a(this.f18587xd976ffb7, c4478x3eda633.f18587xd976ffb7) && n51.f.a(this.f18588x1e2ea380, c4478x3eda633.f18588x1e2ea380);
    }

    /* renamed from: getAuthkey */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m38595x17443b81() {
        return this.f18589xcb94b041[2] ? this.f18587xd976ffb7 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getGroupkey */
    public java.lang.String m38596x9a08e0f6() {
        return this.f18589xcb94b041[3] ? this.f18588x1e2ea380 : "";
    }

    /* renamed from: getSvrip */
    public java.lang.String m38597x75299220() {
        return this.f18589xcb94b041[1] ? this.f18590x68bebd6 : "";
    }

    /* renamed from: hasAuthkey */
    public boolean m38598x529ac3bd() {
        return m38599x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38599x6e095e9(int i17) {
        return this.f18589xcb94b041[i17];
    }

    /* renamed from: hasGroupkey */
    public boolean m38600xc983603a() {
        return m38599x6e095e9(3);
    }

    /* renamed from: hasSvrip */
    public boolean m38601x7bcf95c() {
        return m38599x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 m38602x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f18590x68bebd6;
            if (str != null && this.f18589xcb94b041[1]) {
                fVar.j(1, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f18587xd976ffb7;
            if (gVar != null && this.f18589xcb94b041[2]) {
                fVar.b(2, gVar);
            }
            java.lang.String str2 = this.f18588x1e2ea380;
            if (str2 != null && this.f18589xcb94b041[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f18590x68bebd6;
            if (str3 != null && this.f18589xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f18587xd976ffb7;
            if (gVar2 != null && this.f18589xcb94b041[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            java.lang.String str4 = this.f18588x1e2ea380;
            return (str4 == null || !this.f18589xcb94b041[3]) ? i18 : i18 + b36.f.j(3, str4);
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
            this.f18590x68bebd6 = aVar2.k(intValue);
            this.f18589xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f18587xd976ffb7 = aVar2.d(intValue);
            this.f18589xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f18588x1e2ea380 = aVar2.k(intValue);
        this.f18589xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setAuthkey */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 m38604x8ab588f5(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f18587xd976ffb7 = gVar;
        this.f18589xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setGroupkey */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 m38605x94c14202(java.lang.String str) {
        this.f18588x1e2ea380 = str;
        this.f18589xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setSvrip */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 m38606x53b7ac94(java.lang.String str) {
        this.f18590x68bebd6 = str;
        this.f18589xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 m38603x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633) super.mo11468x92b714fd(bArr);
    }
}

package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.HlsOptions */
/* loaded from: classes8.dex */
public class C4501x46cebcf extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf f18861xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf();

    /* renamed from: aeskey */
    private java.lang.String f18862xab4b3f30;

    /* renamed from: hasSetFields */
    private final boolean[] f18863xcb94b041 = new boolean[4];

    /* renamed from: iv, reason: collision with root package name */
    private java.lang.String f134063iv;

    /* renamed from: videoflag */
    private java.lang.String f18864x4f7b5e67;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf m39116xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf m39117x7c90cfc0() {
        return f18861xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf m39118x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf m39119x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf c4501x46cebcf = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf) fVar;
        return n51.f.a(this.f18864x4f7b5e67, c4501x46cebcf.f18864x4f7b5e67) && n51.f.a(this.f18862xab4b3f30, c4501x46cebcf.f18862xab4b3f30) && n51.f.a(this.f134063iv, c4501x46cebcf.f134063iv);
    }

    /* renamed from: getAeskey */
    public java.lang.String m39120x10626226() {
        return this.f18863xcb94b041[2] ? this.f18862xab4b3f30 : "";
    }

    /* renamed from: getIv */
    public java.lang.String m39121x5db1b23() {
        return this.f18863xcb94b041[3] ? this.f134063iv : "";
    }

    /* renamed from: getVideoflag */
    public java.lang.String m39122x4ee8cfb1() {
        return this.f18863xcb94b041[1] ? this.f18864x4f7b5e67 : "";
    }

    /* renamed from: hasAeskey */
    public boolean m39123xd03be26a() {
        return m39124x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39124x6e095e9(int i17) {
        return this.f18863xcb94b041[i17];
    }

    /* renamed from: hasIv */
    public boolean m39125x5e75d67() {
        return m39124x6e095e9(3);
    }

    /* renamed from: hasVideoflag */
    public boolean m39126xebe38ed() {
        return m39124x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf m39127x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f18864x4f7b5e67;
            if (str != null && this.f18863xcb94b041[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f18862xab4b3f30;
            if (str2 != null && this.f18863xcb94b041[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f134063iv;
            if (str3 != null && this.f18863xcb94b041[3]) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f18864x4f7b5e67;
            if (str4 != null && this.f18863xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f18862xab4b3f30;
            if (str5 != null && this.f18863xcb94b041[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f134063iv;
            return (str6 == null || !this.f18863xcb94b041[3]) ? i18 : i18 + b36.f.j(3, str6);
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
            this.f18864x4f7b5e67 = aVar2.k(intValue);
            this.f18863xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f18862xab4b3f30 = aVar2.k(intValue);
            this.f18863xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f134063iv = aVar2.k(intValue);
        this.f18863xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setAeskey */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf m39129x3979632(java.lang.String str) {
        this.f18862xab4b3f30 = str;
        this.f18863xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setIv */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf m39130x684352f(java.lang.String str) {
        this.f134063iv = str;
        this.f18863xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setVideoflag */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf m39131xab3c9025(java.lang.String str) {
        this.f18864x4f7b5e67 = str;
        this.f18863xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf m39128x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4501x46cebcf) super.mo11468x92b714fd(bArr);
    }
}

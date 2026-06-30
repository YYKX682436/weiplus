package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.CipherContext */
/* loaded from: classes8.dex */
public class C4472x53414504 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 f18545xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504();

    /* renamed from: hasSetFields */
    private final boolean[] f18546xcb94b041 = new boolean[4];

    /* renamed from: iv, reason: collision with root package name */
    private java.lang.String f134058iv;
    private java.lang.String key;

    /* renamed from: method */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4473x44c202ec f18547xbfc5d0e1;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 m38475xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 m38476x7c90cfc0() {
        return f18545xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 m38477x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 m38478x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 c4472x53414504 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504) fVar;
        return n51.f.a(this.f18547xbfc5d0e1, c4472x53414504.f18547xbfc5d0e1) && n51.f.a(this.key, c4472x53414504.key) && n51.f.a(this.f134058iv, c4472x53414504.f134058iv);
    }

    /* renamed from: getIv */
    public java.lang.String m38479x5db1b23() {
        return this.f18546xcb94b041[3] ? this.f134058iv : "";
    }

    /* renamed from: getKey */
    public java.lang.String m38480xb5884f29() {
        return this.f18546xcb94b041[2] ? this.key : "";
    }

    /* renamed from: getMethod */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4473x44c202ec m38481x24dcf3d7() {
        return this.f18546xcb94b041[1] ? this.f18547xbfc5d0e1 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4473x44c202ec.CIPHER_METHOD_NONE;
    }

    /* renamed from: hasFieldNumber */
    public boolean m38482x6e095e9(int i17) {
        return this.f18546xcb94b041[i17];
    }

    /* renamed from: hasIv */
    public boolean m38483x5e75d67() {
        return m38482x6e095e9(3);
    }

    /* renamed from: hasKey */
    public boolean m38484xb7045565() {
        return m38482x6e095e9(2);
    }

    /* renamed from: hasMethod */
    public boolean m38485xe4b6741b() {
        return m38482x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 m38486x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4473x44c202ec enumC4473x44c202ec = this.f18547xbfc5d0e1;
            if (enumC4473x44c202ec != null && this.f18546xcb94b041[1]) {
                fVar.e(1, enumC4473x44c202ec.f18559x6ac9171);
            }
            java.lang.String str = this.key;
            if (str != null && this.f18546xcb94b041[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f134058iv;
            if (str2 != null && this.f18546xcb94b041[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4473x44c202ec enumC4473x44c202ec2 = this.f18547xbfc5d0e1;
            if (enumC4473x44c202ec2 != null && this.f18546xcb94b041[1]) {
                i18 = 0 + b36.f.e(1, enumC4473x44c202ec2.f18559x6ac9171);
            }
            java.lang.String str3 = this.key;
            if (str3 != null && this.f18546xcb94b041[2]) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f134058iv;
            return (str4 == null || !this.f18546xcb94b041[3]) ? i18 : i18 + b36.f.j(3, str4);
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
            this.f18547xbfc5d0e1 = com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4473x44c202ec.m38493x382ad972(aVar2.g(intValue));
            this.f18546xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.key = aVar2.k(intValue);
            this.f18546xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f134058iv = aVar2.k(intValue);
        this.f18546xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setIv */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 m38488x684352f(java.lang.String str) {
        this.f134058iv = str;
        this.f18546xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setKey */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 m38489xca02769d(java.lang.String str) {
        this.key = str;
        this.f18546xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setMethod */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 m38490x181227e3(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4473x44c202ec enumC4473x44c202ec) {
        this.f18547xbfc5d0e1 = enumC4473x44c202ec;
        this.f18546xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 m38487x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504) super.mo11468x92b714fd(bArr);
    }
}

package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderContactExtInfo */
/* loaded from: classes10.dex */
public class C27405x7ec3815 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 f59909xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815();

    /* renamed from: country */
    public java.lang.String f59914x39175796 = "";

    /* renamed from: province */
    public java.lang.String f59915xc5242b30 = "";

    /* renamed from: city */
    public java.lang.String f59913x2e996b = "";
    public int sex = 0;

    /* renamed from: birth_year */
    public int f59912x45b2ebbd = 0;

    /* renamed from: birth_month */
    public int f59911x70062f00 = 0;

    /* renamed from: birth_day */
    public int f59910xb7ecb01c = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 m114681xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 m114682x7c90cfc0() {
        return f59909xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 m114683x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 m114684x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 c27405x7ec3815 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815) fVar;
        return n51.f.a(this.f59914x39175796, c27405x7ec3815.f59914x39175796) && n51.f.a(this.f59915xc5242b30, c27405x7ec3815.f59915xc5242b30) && n51.f.a(this.f59913x2e996b, c27405x7ec3815.f59913x2e996b) && n51.f.a(java.lang.Integer.valueOf(this.sex), java.lang.Integer.valueOf(c27405x7ec3815.sex)) && n51.f.a(java.lang.Integer.valueOf(this.f59912x45b2ebbd), java.lang.Integer.valueOf(c27405x7ec3815.f59912x45b2ebbd)) && n51.f.a(java.lang.Integer.valueOf(this.f59911x70062f00), java.lang.Integer.valueOf(c27405x7ec3815.f59911x70062f00)) && n51.f.a(java.lang.Integer.valueOf(this.f59910xb7ecb01c), java.lang.Integer.valueOf(c27405x7ec3815.f59910xb7ecb01c));
    }

    /* renamed from: getBirthDay */
    public int m114685xbb9727d3() {
        return this.f59910xb7ecb01c;
    }

    /* renamed from: getBirthMonth */
    public int m114686x32f194f7() {
        return this.f59911x70062f00;
    }

    /* renamed from: getBirthYear */
    public int m114687xb7576ae6() {
        return this.f59912x45b2ebbd;
    }

    /* renamed from: getBirth_day */
    public int m114688xb75a2166() {
        return this.f59910xb7ecb01c;
    }

    /* renamed from: getBirth_month */
    public int m114689x49dc75ca() {
        return this.f59911x70062f00;
    }

    /* renamed from: getBirth_year */
    public int m114690x33f3a3b3() {
        return this.f59912x45b2ebbd;
    }

    /* renamed from: getCity */
    public java.lang.String m114691xfb7e01e1() {
        return this.f59913x2e996b;
    }

    /* renamed from: getCountry */
    public java.lang.String m114692x76e49360() {
        return this.f59914x39175796;
    }

    /* renamed from: getProvince */
    public java.lang.String m114693x40fe68a6() {
        return this.f59915xc5242b30;
    }

    /* renamed from: getSex */
    public int m114694xb5886d30() {
        return this.sex;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 m114695x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f59914x39175796;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f59915xc5242b30;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f59913x2e996b;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.sex);
            fVar.e(5, this.f59912x45b2ebbd);
            fVar.e(6, this.f59911x70062f00);
            fVar.e(7, this.f59910xb7ecb01c);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f59914x39175796;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f59915xc5242b30;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f59913x2e996b;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.sex) + b36.f.e(5, this.f59912x45b2ebbd) + b36.f.e(6, this.f59911x70062f00) + b36.f.e(7, this.f59910xb7ecb01c);
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
                this.f59914x39175796 = aVar2.k(intValue);
                return 0;
            case 2:
                this.f59915xc5242b30 = aVar2.k(intValue);
                return 0;
            case 3:
                this.f59913x2e996b = aVar2.k(intValue);
                return 0;
            case 4:
                this.sex = aVar2.g(intValue);
                return 0;
            case 5:
                this.f59912x45b2ebbd = aVar2.g(intValue);
                return 0;
            case 6:
                this.f59911x70062f00 = aVar2.g(intValue);
                return 0;
            case 7:
                this.f59910xb7ecb01c = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setBirthDay */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 m114697xb64f88df(int i17) {
        this.f59910xb7ecb01c = i17;
        return this;
    }

    /* renamed from: setBirthMonth */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 m114698x6115e303(int i17) {
        this.f59911x70062f00 = i17;
        return this;
    }

    /* renamed from: setBirthYear */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 m114699x13ab2b5a(int i17) {
        this.f59912x45b2ebbd = i17;
        return this;
    }

    /* renamed from: setBirth_day */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 m114700x13ade1da(int i17) {
        this.f59910xb7ecb01c = i17;
        return this;
    }

    /* renamed from: setBirth_month */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 m114701xe041e93e(int i17) {
        this.f59911x70062f00 = i17;
        return this;
    }

    /* renamed from: setBirth_year */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 m114702x6217f1bf(int i17) {
        this.f59912x45b2ebbd = i17;
        return this;
    }

    /* renamed from: setCity */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 m114703x7648c8ed(java.lang.String str) {
        this.f59913x2e996b = str;
        return this;
    }

    /* renamed from: setCountry */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 m114704xea55e0d4(java.lang.String str) {
        this.f59914x39175796 = str;
        return this;
    }

    /* renamed from: setProvince */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 m114705x3bb6c9b2(java.lang.String str) {
        this.f59915xc5242b30 = str;
        return this;
    }

    /* renamed from: setSex */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 m114706xca0294a4(int i17) {
        this.sex = i17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 m114696x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27405x7ec3815) super.mo11468x92b714fd(bArr);
    }
}

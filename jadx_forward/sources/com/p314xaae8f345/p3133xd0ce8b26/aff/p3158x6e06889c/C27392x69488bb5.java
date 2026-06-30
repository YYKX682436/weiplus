package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderAdBaseRequest */
/* loaded from: classes2.dex */
public class C27392x69488bb5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 f59772xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5();

    /* renamed from: device_info */
    public java.lang.String f59775xa40484f7 = "";

    /* renamed from: user_agent */
    public java.lang.String f59777x724f4d91 = "";

    /* renamed from: connect_type */
    public int f59774x7215d16f = 0;

    /* renamed from: carrier */
    public int f59773x210adef8 = 0;

    /* renamed from: support_flag */
    public int f59776xa3eac1dc = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114105xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114106x7c90cfc0() {
        return f59772xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114107x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114108x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 c27392x69488bb5 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5) fVar;
        return n51.f.a(this.f59775xa40484f7, c27392x69488bb5.f59775xa40484f7) && n51.f.a(this.f59777x724f4d91, c27392x69488bb5.f59777x724f4d91) && n51.f.a(java.lang.Integer.valueOf(this.f59774x7215d16f), java.lang.Integer.valueOf(c27392x69488bb5.f59774x7215d16f)) && n51.f.a(java.lang.Integer.valueOf(this.f59773x210adef8), java.lang.Integer.valueOf(c27392x69488bb5.f59773x210adef8)) && n51.f.a(java.lang.Integer.valueOf(this.f59776xa3eac1dc), java.lang.Integer.valueOf(c27392x69488bb5.f59776xa3eac1dc));
    }

    /* renamed from: getCarrier */
    public int m114109x5ed81ac2() {
        return this.f59773x210adef8;
    }

    /* renamed from: getConnectType */
    public int m114110x40983e0e() {
        return this.f59774x7215d16f;
    }

    /* renamed from: getConnect_type */
    public int m114111xd30863e5() {
        return this.f59774x7215d16f;
    }

    /* renamed from: getDeviceInfo */
    public java.lang.String m114112x1ccb941a() {
        return this.f59775xa40484f7;
    }

    /* renamed from: getDevice_info */
    public java.lang.String m114113x7ddacbc1() {
        return this.f59775xa40484f7;
    }

    /* renamed from: getSupportFlag */
    public int m114114x6b77baa5() {
        return this.f59776xa3eac1dc;
    }

    /* renamed from: getSupport_flag */
    public int m114115x4dd5452() {
        return this.f59776xa3eac1dc;
    }

    /* renamed from: getUserAgent */
    public java.lang.String m114116x11fd7f44() {
        return this.f59777x724f4d91;
    }

    /* renamed from: getUser_agent */
    public java.lang.String m114117x60900587() {
        return this.f59777x724f4d91;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114118x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f59775xa40484f7;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f59777x724f4d91;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f59774x7215d16f);
            fVar.e(4, this.f59773x210adef8);
            fVar.e(5, this.f59776xa3eac1dc);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f59775xa40484f7;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f59777x724f4d91;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f59774x7215d16f) + b36.f.e(4, this.f59773x210adef8) + b36.f.e(5, this.f59776xa3eac1dc);
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
            this.f59775xa40484f7 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f59777x724f4d91 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f59774x7215d16f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f59773x210adef8 = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f59776xa3eac1dc = aVar2.g(intValue);
        return 0;
    }

    /* renamed from: setCarrier */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114120xd2496836(int i17) {
        this.f59773x210adef8 = i17;
        return this;
    }

    /* renamed from: setConnectType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114121xd6fdb182(int i17) {
        this.f59774x7215d16f = i17;
        return this;
    }

    /* renamed from: setConnect_type */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114122x9515ef1(int i17) {
        this.f59774x7215d16f = i17;
        return this;
    }

    /* renamed from: setDeviceInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114123x4aefe226(java.lang.String str) {
        this.f59775xa40484f7 = str;
        return this;
    }

    /* renamed from: setDevice_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114124x14403f35(java.lang.String str) {
        this.f59775xa40484f7 = str;
        return this;
    }

    /* renamed from: setSupportFlag */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114125x1dd2e19(int i17) {
        this.f59776xa3eac1dc = i17;
        return this;
    }

    /* renamed from: setSupport_flag */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114126x3b264f5e(int i17) {
        this.f59776xa3eac1dc = i17;
        return this;
    }

    /* renamed from: setUserAgent */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114127x6e513fb8(java.lang.String str) {
        this.f59777x724f4d91 = str;
        return this;
    }

    /* renamed from: setUser_agent */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114128x8eb45393(java.lang.String str) {
        this.f59777x724f4d91 = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 m114119x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27392x69488bb5) super.mo11468x92b714fd(bArr);
    }
}

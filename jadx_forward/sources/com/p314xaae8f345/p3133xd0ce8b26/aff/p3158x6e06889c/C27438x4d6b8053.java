package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.NewLifeActionResponse */
/* loaded from: classes15.dex */
public class C27438x4d6b8053 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053 f60157xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053();

    /* renamed from: cmdId */
    public java.lang.String f60158x5a623f5 = "";

    /* renamed from: errCode */
    public int f60159xa7c470f2 = 0;

    /* renamed from: errMsg */
    public java.lang.String f60160xb2d4efdc = "";

    /* renamed from: proto */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063 f60161x65fc9e8 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063.m115697x7c90cfc0();

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053 m115716xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053 m115717x7c90cfc0() {
        return f60157xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053 m115718x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053 m115719x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053 c27438x4d6b8053 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053) fVar;
        return n51.f.a(this.f60158x5a623f5, c27438x4d6b8053.f60158x5a623f5) && n51.f.a(java.lang.Integer.valueOf(this.f60159xa7c470f2), java.lang.Integer.valueOf(c27438x4d6b8053.f60159xa7c470f2)) && n51.f.a(this.f60160xb2d4efdc, c27438x4d6b8053.f60160xb2d4efdc) && n51.f.a(this.f60161x65fc9e8, c27438x4d6b8053.f60161x65fc9e8);
    }

    /* renamed from: getCmdId */
    public java.lang.String m115720x7443ca3f() {
        return this.f60158x5a623f5;
    }

    /* renamed from: getErrCode */
    public int m115721xe591acbc() {
        return this.f60159xa7c470f2;
    }

    /* renamed from: getErrMsg */
    public java.lang.String m115722x17ec12d2() {
        return this.f60160xb2d4efdc;
    }

    /* renamed from: getProto */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063 m115723x74fd7032() {
        return this.f60161x65fc9e8;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053 m115724x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f60158x5a623f5;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f60159xa7c470f2);
            java.lang.String str2 = this.f60160xb2d4efdc;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063 c27436x18241063 = this.f60161x65fc9e8;
            if (c27436x18241063 != null) {
                fVar.i(4, c27436x18241063.mo75928xcd1e8d8());
                this.f60161x65fc9e8.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f60158x5a623f5;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f60159xa7c470f2);
            java.lang.String str4 = this.f60160xb2d4efdc;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063 c27436x182410632 = this.f60161x65fc9e8;
            return c27436x182410632 != null ? j17 + b36.f.i(4, c27436x182410632.mo75928xcd1e8d8()) : j17;
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
            this.f60158x5a623f5 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f60159xa7c470f2 = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f60160xb2d4efdc = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063 c27436x182410633 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063();
            if (bArr != null && bArr.length > 0) {
                c27436x182410633.mo11468x92b714fd(bArr);
            }
            this.f60161x65fc9e8 = c27436x182410633;
        }
        return 0;
    }

    /* renamed from: setCmdId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053 m115726x52d1e4b3(java.lang.String str) {
        this.f60158x5a623f5 = str;
        return this;
    }

    /* renamed from: setErrCode */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053 m115727x5902fa30(int i17) {
        this.f60159xa7c470f2 = i17;
        return this;
    }

    /* renamed from: setErrMsg */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053 m115728xb2146de(java.lang.String str) {
        this.f60160xb2d4efdc = str;
        return this;
    }

    /* renamed from: setProto */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053 m115729x538b8aa6(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063 c27436x18241063) {
        this.f60161x65fc9e8 = c27436x18241063;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053 m115725x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27438x4d6b8053) super.mo11468x92b714fd(bArr);
    }
}

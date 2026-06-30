package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo */
/* loaded from: classes2.dex */
public class C27432x87ac5835 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835 f60141xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835();

    /* renamed from: jumpPriority */
    public int f60142xdbacc3f2 = 0;

    /* renamed from: show_ext_info */
    public java.lang.String f60143xfada230e = "";

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835 m115642xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835 m115643x7c90cfc0() {
        return f60141xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835 m115644x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835 m115645x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835 c27432x87ac5835 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f60142xdbacc3f2), java.lang.Integer.valueOf(c27432x87ac5835.f60142xdbacc3f2)) && n51.f.a(this.f60143xfada230e, c27432x87ac5835.f60143xfada230e);
    }

    /* renamed from: getJumpPriority */
    public int m115646x3c9f5668() {
        return this.f60142xdbacc3f2;
    }

    /* renamed from: getShowExtInfo */
    public java.lang.String m115647xa319877c() {
        return this.f60143xfada230e;
    }

    /* renamed from: getShow_ext_info */
    public java.lang.String m115648xb839df58() {
        return this.f60143xfada230e;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835 m115649x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f60142xdbacc3f2);
            java.lang.String str = this.f60143xfada230e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f60142xdbacc3f2) + 0;
            java.lang.String str2 = this.f60143xfada230e;
            return str2 != null ? e17 + b36.f.j(2, str2) : e17;
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
            this.f60142xdbacc3f2 = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f60143xfada230e = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setJumpPriority */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835 m115651x72e85174(int i17) {
        this.f60142xdbacc3f2 = i17;
        return this;
    }

    /* renamed from: setShowExtInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835 m115652x397efaf0(java.lang.String str) {
        this.f60143xfada230e = str;
        return this;
    }

    /* renamed from: setShow_ext_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835 m115653x4b1045cc(java.lang.String str) {
        this.f60143xfada230e = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835 m115650x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27432x87ac5835) super.mo11468x92b714fd(bArr);
    }
}

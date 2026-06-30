package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderMemberSetting */
/* loaded from: classes8.dex */
public class C27410xf59347b0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0 f59943xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0();

    /* renamed from: member_level */
    public int f59944xfcf0ad9f = 0;

    /* renamed from: price */
    public int f59945x65fb149 = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0 m114807xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0 m114808x7c90cfc0() {
        return f59943xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0 m114809x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0 m114810x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0 c27410xf59347b0 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f59944xfcf0ad9f), java.lang.Integer.valueOf(c27410xf59347b0.f59944xfcf0ad9f)) && n51.f.a(java.lang.Integer.valueOf(this.f59945x65fb149), java.lang.Integer.valueOf(c27410xf59347b0.f59945x65fb149));
    }

    /* renamed from: getMemberLevel */
    public int m114811x2b42f7d4() {
        return this.f59944xfcf0ad9f;
    }

    /* renamed from: getMember_level */
    public int m114812x5de34015() {
        return this.f59944xfcf0ad9f;
    }

    /* renamed from: getPrice */
    public int m114813x74fd5793() {
        return this.f59945x65fb149;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0 m114814x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f59944xfcf0ad9f);
            fVar.e(2, this.f59945x65fb149);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f59944xfcf0ad9f) + 0 + b36.f.e(2, this.f59945x65fb149);
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
            this.f59944xfcf0ad9f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f59945x65fb149 = aVar2.g(intValue);
        return 0;
    }

    /* renamed from: setMemberLevel */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0 m114816xc1a86b48(int i17) {
        this.f59944xfcf0ad9f = i17;
        return this;
    }

    /* renamed from: setMember_level */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0 m114817x942c3b21(int i17) {
        this.f59944xfcf0ad9f = i17;
        return this;
    }

    /* renamed from: setPrice */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0 m114818x538b7207(int i17) {
        this.f59945x65fb149 = i17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0 m114815x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0) super.mo11468x92b714fd(bArr);
    }
}

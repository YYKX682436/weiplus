package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.SKBuiltinInt32_t */
/* loaded from: classes2.dex */
public class C27460xa6ebe9d8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27460xa6ebe9d8 f60302xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27460xa6ebe9d8();

    /* renamed from: iVal */
    public int f60303x3109f8 = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27460xa6ebe9d8 m116314xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27460xa6ebe9d8();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27460xa6ebe9d8 m116315x7c90cfc0() {
        return f60302xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27460xa6ebe9d8 m116316x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27460xa6ebe9d8();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27460xa6ebe9d8 m116317x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27460xa6ebe9d8) && n51.f.a(java.lang.Integer.valueOf(this.f60303x3109f8), java.lang.Integer.valueOf(((com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27460xa6ebe9d8) fVar).f60303x3109f8));
    }

    /* renamed from: getIVal */
    public int m116318xfb80726e() {
        return this.f60303x3109f8;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27460xa6ebe9d8 m116319x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27460xa6ebe9d8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).e(1, this.f60303x3109f8);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f60303x3109f8) + 0;
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
        if (intValue != 1) {
            return -1;
        }
        this.f60303x3109f8 = aVar2.g(intValue);
        return 0;
    }

    /* renamed from: setIVal */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27460xa6ebe9d8 m116321x764b397a(int i17) {
        this.f60303x3109f8 = i17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27460xa6ebe9d8 m116320x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27460xa6ebe9d8 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27460xa6ebe9d8) super.mo11468x92b714fd(bArr);
    }
}

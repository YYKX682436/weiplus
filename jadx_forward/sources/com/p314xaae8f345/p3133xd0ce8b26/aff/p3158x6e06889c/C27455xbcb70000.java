package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.SKBuiltinBuffer_t */
/* loaded from: classes8.dex */
public class C27455xbcb70000 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 f60291xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000();

    /* renamed from: iLen */
    public int f60293x30e4ec = 0;

    /* renamed from: Buffer */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f60292x77408060 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 m116267xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 m116268x7c90cfc0() {
        return f60291xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 m116269x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 m116270x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 c27455xbcb70000 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f60293x30e4ec), java.lang.Integer.valueOf(c27455xbcb70000.f60293x30e4ec)) && n51.f.a(this.f60292x77408060, c27455xbcb70000.f60292x77408060);
    }

    /* renamed from: getBuffer */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m116271x12f2b736() {
        return this.f60292x77408060;
    }

    /* renamed from: getILen */
    public int m116272xfb804d62() {
        return this.f60293x30e4ec;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 m116273x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f60293x30e4ec);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f60292x77408060;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f60293x30e4ec) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f60292x77408060;
            return gVar2 != null ? e17 + b36.f.b(2, gVar2) : e17;
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
            this.f60293x30e4ec = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f60292x77408060 = aVar2.d(intValue);
        return 0;
    }

    /* renamed from: setBuffer */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 m116275x627eb42(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f60292x77408060 = gVar;
        return this;
    }

    /* renamed from: setILen */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 m116276x764b146e(int i17) {
        this.f60293x30e4ec = i17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 m116274x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000) super.mo11468x92b714fd(bArr);
    }
}

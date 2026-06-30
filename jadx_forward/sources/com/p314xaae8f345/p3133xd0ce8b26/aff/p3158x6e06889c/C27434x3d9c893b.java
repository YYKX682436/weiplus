package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.IconConfig */
/* loaded from: classes8.dex */
public class C27434x3d9c893b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b f60148xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b();

    /* renamed from: id, reason: collision with root package name */
    public int f298935id = 0;

    /* renamed from: positionFlag */
    public int f60149x2015035 = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b m115674xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b m115675x7c90cfc0() {
        return f60148xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b m115676x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b m115677x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b c27434x3d9c893b = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f298935id), java.lang.Integer.valueOf(c27434x3d9c893b.f298935id)) && n51.f.a(java.lang.Integer.valueOf(this.f60149x2015035), java.lang.Integer.valueOf(c27434x3d9c893b.f60149x2015035));
    }

    /* renamed from: getId */
    public int m115678x5db1b11() {
        return this.f298935id;
    }

    /* renamed from: getPositionFlag */
    public int m115679x62f3e2ab() {
        return this.f60149x2015035;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b m115680x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f298935id);
            fVar.e(2, this.f60149x2015035);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f298935id) + 0 + b36.f.e(2, this.f60149x2015035);
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
            this.f298935id = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f60149x2015035 = aVar2.g(intValue);
        return 0;
    }

    /* renamed from: setId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b m115682x684351d(int i17) {
        this.f298935id = i17;
        return this;
    }

    /* renamed from: setPositionFlag */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b m115683x993cddb7(int i17) {
        this.f60149x2015035 = i17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b m115681x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27434x3d9c893b) super.mo11468x92b714fd(bArr);
    }
}

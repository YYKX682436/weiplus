package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.StatusCgiError */
/* loaded from: classes4.dex */
public class C27526x2045dab5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5 f60492xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5();
    public int ret = 0;

    /* renamed from: type */
    public int f60494x368f3a = 0;

    /* renamed from: code */
    public int f60493x2eaded = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5 m117267xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5 m117268x7c90cfc0() {
        return f60492xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5 m117269x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5 m117270x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5 c27526x2045dab5 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.ret), java.lang.Integer.valueOf(c27526x2045dab5.ret)) && n51.f.a(java.lang.Integer.valueOf(this.f60494x368f3a), java.lang.Integer.valueOf(c27526x2045dab5.f60494x368f3a)) && n51.f.a(java.lang.Integer.valueOf(this.f60493x2eaded), java.lang.Integer.valueOf(c27526x2045dab5.f60493x2eaded));
    }

    /* renamed from: getCode */
    public int m117271xfb7e1663() {
        return this.f60493x2eaded;
    }

    /* renamed from: getRet */
    public int m117272xb588696b() {
        return this.ret;
    }

    /* renamed from: getType */
    public int m117273xfb85f7b0() {
        return this.f60494x368f3a;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5 m117274x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.ret);
            fVar.e(2, this.f60494x368f3a);
            fVar.e(3, this.f60493x2eaded);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.ret) + 0 + b36.f.e(2, this.f60494x368f3a) + b36.f.e(3, this.f60493x2eaded);
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
            this.ret = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f60494x368f3a = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f60493x2eaded = aVar2.g(intValue);
        return 0;
    }

    /* renamed from: setCode */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5 m117276x7648dd6f(int i17) {
        this.f60493x2eaded = i17;
        return this;
    }

    /* renamed from: setRet */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5 m117277xca0290df(int i17) {
        this.ret = i17;
        return this;
    }

    /* renamed from: setType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5 m117278x7650bebc(int i17) {
        this.f60494x368f3a = i17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5 m117275x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27526x2045dab5) super.mo11468x92b714fd(bArr);
    }
}

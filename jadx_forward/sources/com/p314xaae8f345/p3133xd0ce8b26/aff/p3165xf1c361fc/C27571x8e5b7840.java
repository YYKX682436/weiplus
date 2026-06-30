package com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc;

/* renamed from: com.tencent.wechat.aff.websearch.RequestContext */
/* loaded from: classes10.dex */
public class C27571x8e5b7840 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 f60553xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840();

    /* renamed from: force_remote */
    private boolean f60554x24ae5c1a;

    /* renamed from: hasSetFields */
    private final boolean[] f60555xcb94b041 = new boolean[3];

    /* renamed from: pre_request_context */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 f60556x67653263;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 m117697xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 m117698x7c90cfc0() {
        return f60553xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 m117699x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 m117700x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 c27571x8e5b7840 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f60554x24ae5c1a), java.lang.Boolean.valueOf(c27571x8e5b7840.f60554x24ae5c1a)) && n51.f.a(this.f60556x67653263, c27571x8e5b7840.f60556x67653263);
    }

    /* renamed from: getForceRemote */
    public boolean m117701xbbe099db() {
        return this.f60554x24ae5c1a;
    }

    /* renamed from: getPreRequestContext */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 m117702x1266d8ed() {
        return this.f60555xcb94b041[2] ? this.f60556x67653263 : com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183.m117677xaf65a0fc();
    }

    /* renamed from: hasFieldNumber */
    public boolean m117703x6e095e9(int i17) {
        return this.f60555xcb94b041[i17];
    }

    /* renamed from: hasForceRemote */
    public boolean m117704xdc00a417() {
        return m117703x6e095e9(1);
    }

    /* renamed from: hasPreRequestContext */
    public boolean m117705xfecd4629() {
        return m117703x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 m117706x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f60555xcb94b041[1]) {
                fVar.a(1, this.f60554x24ae5c1a);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 c27570xa9f69183 = this.f60556x67653263;
            if (c27570xa9f69183 != null && this.f60555xcb94b041[2]) {
                fVar.i(2, c27570xa9f69183.mo75928xcd1e8d8());
                this.f60556x67653263.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = this.f60555xcb94b041[1] ? 0 + b36.f.a(1, this.f60554x24ae5c1a) : 0;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 c27570xa9f691832 = this.f60556x67653263;
            return (c27570xa9f691832 == null || !this.f60555xcb94b041[2]) ? a17 : a17 + b36.f.i(2, c27570xa9f691832.mo75928xcd1e8d8());
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
            this.f60554x24ae5c1a = aVar2.c(intValue);
            this.f60555xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 c27570xa9f691833 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183();
            if (bArr != null && bArr.length > 0) {
                c27570xa9f691833.mo11468x92b714fd(bArr);
            }
            this.f60556x67653263 = c27570xa9f691833;
        }
        this.f60555xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setForceRemote */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 m117708x52460d4f(boolean z17) {
        this.f60554x24ae5c1a = z17;
        this.f60555xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setPreRequestContext */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 m117709xedfce561(com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27570xa9f69183 c27570xa9f69183) {
        this.f60556x67653263 = c27570xa9f69183;
        this.f60555xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 m117707x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840) super.mo11468x92b714fd(bArr);
    }
}

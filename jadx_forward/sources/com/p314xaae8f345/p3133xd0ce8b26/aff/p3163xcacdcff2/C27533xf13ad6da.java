package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.StatusGetSelfHistoryReq */
/* loaded from: classes2.dex */
public class C27533xf13ad6da extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da f60501xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da();

    /* renamed from: BaseRequest */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27509x2de60e5e f60502x2de60e5e = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27509x2de60e5e.m116812x7c90cfc0();

    /* renamed from: context */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f60503x38b735af = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;

    /* renamed from: op, reason: collision with root package name */
    public long f299053op = 0;

    /* renamed from: start_key */
    public long f60505x811a9102 = 0;

    /* renamed from: limit */
    public long f60504x6234bbb = 0;

    /* renamed from: statusIds */
    public java.util.LinkedList<java.lang.String> f60506x849af166 = new java.util.LinkedList<>();

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da m117297xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da m117298x7c90cfc0() {
        return f60501xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da m117299x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da();
    }

    /* renamed from: addAllElementStatusIds */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da m117300x9cf68b2a(java.util.Collection<java.lang.String> collection) {
        this.f60506x849af166.addAll(collection);
        return this;
    }

    /* renamed from: addElementStatusIds */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da m117301x48c1688b(java.lang.String str) {
        this.f60506x849af166.add(str);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da m117302x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da c27533xf13ad6da = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da) fVar;
        return n51.f.a(this.f60502x2de60e5e, c27533xf13ad6da.f60502x2de60e5e) && n51.f.a(this.f60503x38b735af, c27533xf13ad6da.f60503x38b735af) && n51.f.a(java.lang.Long.valueOf(this.f299053op), java.lang.Long.valueOf(c27533xf13ad6da.f299053op)) && n51.f.a(java.lang.Long.valueOf(this.f60505x811a9102), java.lang.Long.valueOf(c27533xf13ad6da.f60505x811a9102)) && n51.f.a(java.lang.Long.valueOf(this.f60504x6234bbb), java.lang.Long.valueOf(c27533xf13ad6da.f60504x6234bbb)) && n51.f.a(this.f60506x849af166, c27533xf13ad6da.f60506x849af166);
    }

    /* renamed from: getBaseRequest */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27509x2de60e5e m117303xa452ad48() {
        return this.f60502x2de60e5e;
    }

    /* renamed from: getContext */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m117304x76847179() {
        return this.f60503x38b735af;
    }

    /* renamed from: getLimit */
    public long m117305x74c0f205() {
        return this.f60504x6234bbb;
    }

    /* renamed from: getOp */
    public long m117306x5db1bd7() {
        return this.f299053op;
    }

    /* renamed from: getStartKey */
    public long m117307xca56ac13() {
        return this.f60505x811a9102;
    }

    /* renamed from: getStart_key */
    public long m117308x8088024c() {
        return this.f60505x811a9102;
    }

    /* renamed from: getStatusIds */
    public java.util.LinkedList<java.lang.String> m117309x840862b0() {
        return this.f60506x849af166;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da m117310x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27509x2de60e5e c27509x2de60e5e = this.f60502x2de60e5e;
            if (c27509x2de60e5e != null) {
                fVar.i(1, c27509x2de60e5e.mo75928xcd1e8d8());
                this.f60502x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f60503x38b735af;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.h(3, this.f299053op);
            fVar.h(4, this.f60505x811a9102);
            fVar.h(5, this.f60504x6234bbb);
            fVar.g(6, 1, this.f60506x849af166);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27509x2de60e5e c27509x2de60e5e2 = this.f60502x2de60e5e;
            int i18 = c27509x2de60e5e2 != null ? 0 + b36.f.i(1, c27509x2de60e5e2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f60503x38b735af;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            return i18 + b36.f.h(3, this.f299053op) + b36.f.h(4, this.f60505x811a9102) + b36.f.h(5, this.f60504x6234bbb) + b36.f.g(6, 1, this.f60506x849af166);
        }
        if (i17 == 2) {
            this.f60506x849af166.clear();
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27509x2de60e5e c27509x2de60e5e3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27509x2de60e5e();
                    if (bArr != null && bArr.length > 0) {
                        c27509x2de60e5e3.mo11468x92b714fd(bArr);
                    }
                    this.f60502x2de60e5e = c27509x2de60e5e3;
                }
                return 0;
            case 2:
                this.f60503x38b735af = aVar2.d(intValue);
                return 0;
            case 3:
                this.f299053op = aVar2.i(intValue);
                return 0;
            case 4:
                this.f60505x811a9102 = aVar2.i(intValue);
                return 0;
            case 5:
                this.f60504x6234bbb = aVar2.i(intValue);
                return 0;
            case 6:
                this.f60506x849af166.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setBaseRequest */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da m117312x3ab820bc(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27509x2de60e5e c27509x2de60e5e) {
        this.f60502x2de60e5e = c27509x2de60e5e;
        return this;
    }

    /* renamed from: setContext */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da m117313xe9f5beed(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f60503x38b735af = gVar;
        return this;
    }

    /* renamed from: setLimit */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da m117314x534f0c79(long j17) {
        this.f60504x6234bbb = j17;
        return this;
    }

    /* renamed from: setOp */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da m117315x68435e3(long j17) {
        this.f299053op = j17;
        return this;
    }

    /* renamed from: setStartKey */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da m117316xc50f0d1f(long j17) {
        this.f60505x811a9102 = j17;
        return this;
    }

    /* renamed from: setStart_key */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da m117317xdcdbc2c0(long j17) {
        this.f60505x811a9102 = j17;
        return this;
    }

    /* renamed from: setStatusIds */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da m117318xe05c2324(java.util.LinkedList<java.lang.String> linkedList) {
        this.f60506x849af166 = linkedList;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da m117311x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27533xf13ad6da) super.mo11468x92b714fd(bArr);
    }
}

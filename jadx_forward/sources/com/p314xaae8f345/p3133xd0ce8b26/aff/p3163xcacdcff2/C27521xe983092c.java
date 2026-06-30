package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.PStatusJumpElement */
/* loaded from: classes8.dex */
public class C27521xe983092c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c f60457xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c();

    /* renamed from: elementType */
    public int f60459x282b4456 = 0;

    /* renamed from: elementKey */
    public java.lang.String f60458x2253d5c3 = "";

    /* renamed from: jumpInfos */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e> f60460x279db9f7 = new java.util.LinkedList<>();

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c m117146xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c m117147x7c90cfc0() {
        return f60457xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c m117148x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c();
    }

    /* renamed from: addAllElementJumpInfos */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c m117149x3ff953bb(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e> collection) {
        this.f60460x279db9f7.addAll(collection);
        return this;
    }

    /* renamed from: addElementJumpInfos */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c m117150xebc4311c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e c27522xf9b5287e) {
        this.f60460x279db9f7.add(c27522xf9b5287e);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c m117151x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c c27521xe983092c = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f60459x282b4456), java.lang.Integer.valueOf(c27521xe983092c.f60459x282b4456)) && n51.f.a(this.f60458x2253d5c3, c27521xe983092c.f60458x2253d5c3) && n51.f.a(this.f60460x279db9f7, c27521xe983092c.f60460x279db9f7);
    }

    /* renamed from: getElementKey */
    public java.lang.String m117152x10948db9() {
        return this.f60458x2253d5c3;
    }

    /* renamed from: getElementType */
    public int m117153x2018b20() {
        return this.f60459x282b4456;
    }

    /* renamed from: getJumpInfos */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e> m117154x270b2b41() {
        return this.f60460x279db9f7;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c m117155x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f60459x282b4456);
            java.lang.String str = this.f60458x2253d5c3;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f60460x279db9f7);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f60459x282b4456) + 0;
            java.lang.String str2 = this.f60458x2253d5c3;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.g(3, 8, this.f60460x279db9f7);
        }
        if (i17 == 2) {
            this.f60460x279db9f7.clear();
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
            this.f60459x282b4456 = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f60458x2253d5c3 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e c27522xf9b5287e = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e();
            if (bArr != null && bArr.length > 0) {
                c27522xf9b5287e.mo11468x92b714fd(bArr);
            }
            this.f60460x279db9f7.add(c27522xf9b5287e);
        }
        return 0;
    }

    /* renamed from: setElementKey */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c m117157x3eb8dbc5(java.lang.String str) {
        this.f60458x2253d5c3 = str;
        return this;
    }

    /* renamed from: setElementType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c m117158x9866fe94(int i17) {
        this.f60459x282b4456 = i17;
        return this;
    }

    /* renamed from: setJumpInfos */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c m117159x835eebb5(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e> linkedList) {
        this.f60460x279db9f7 = linkedList;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c m117156x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27521xe983092c) super.mo11468x92b714fd(bArr);
    }
}

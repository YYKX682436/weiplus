package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.StatusGetSelfHistoryResp */
/* loaded from: classes2.dex */
public class C27534x36200514 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 f60507xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514();

    /* renamed from: BaseResponse */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27510x92037252 f60508x92037252 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27510x92037252.m116831x7c90cfc0();

    /* renamed from: histories */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822> f60511x66d8e032 = new java.util.LinkedList<>();

    /* renamed from: context */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f60509x38b735af = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;

    /* renamed from: continue_flag */
    public boolean f60510x900e5c04 = false;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 m117320xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 m117321x7c90cfc0() {
        return f60507xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 m117322x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514();
    }

    /* renamed from: addAllElementHistories */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 m117323x7f3479f6(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822> collection) {
        this.f60511x66d8e032.addAll(collection);
        return this;
    }

    /* renamed from: addElementHistories */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 m117324x2aff5757(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 c27535xf4cf6822) {
        this.f60511x66d8e032.add(c27535xf4cf6822);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 m117325x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 c27534x36200514 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514) fVar;
        return n51.f.a(this.f60508x92037252, c27534x36200514.f60508x92037252) && n51.f.a(this.f60511x66d8e032, c27534x36200514.f60511x66d8e032) && n51.f.a(this.f60509x38b735af, c27534x36200514.f60509x38b735af) && n51.f.a(java.lang.Boolean.valueOf(this.f60510x900e5c04), java.lang.Boolean.valueOf(c27534x36200514.f60510x900e5c04));
    }

    /* renamed from: getBaseResponse */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27510x92037252 m117326xe92ab0a8() {
        return this.f60508x92037252;
    }

    /* renamed from: getContext */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m117327x76847179() {
        return this.f60509x38b735af;
    }

    /* renamed from: getContinueFlag */
    public boolean m117328x34008729() {
        return this.f60510x900e5c04;
    }

    /* renamed from: getContinue_flag */
    public boolean m117329x4d6e184e() {
        return this.f60510x900e5c04;
    }

    /* renamed from: getHistories */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822> m117330x6646517c() {
        return this.f60511x66d8e032;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 m117331x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27510x92037252 c27510x92037252 = this.f60508x92037252;
            if (c27510x92037252 != null) {
                fVar.i(1, c27510x92037252.mo75928xcd1e8d8());
                this.f60508x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, this.f60511x66d8e032);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f60509x38b735af;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.a(4, this.f60510x900e5c04);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27510x92037252 c27510x920372522 = this.f60508x92037252;
            int i18 = (c27510x920372522 != null ? 0 + b36.f.i(1, c27510x920372522.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, this.f60511x66d8e032);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f60509x38b735af;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            return i18 + b36.f.a(4, this.f60510x900e5c04);
        }
        if (i17 == 2) {
            this.f60511x66d8e032.clear();
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27510x92037252 c27510x920372523 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27510x92037252();
                if (bArr != null && bArr.length > 0) {
                    c27510x920372523.mo11468x92b714fd(bArr);
                }
                this.f60508x92037252 = c27510x920372523;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f60509x38b735af = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f60510x900e5c04 = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822 c27535xf4cf6822 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822();
            if (bArr2 != null && bArr2.length > 0) {
                c27535xf4cf6822.mo11468x92b714fd(bArr2);
            }
            this.f60511x66d8e032.add(c27535xf4cf6822);
        }
        return 0;
    }

    /* renamed from: setBaseResponse */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 m117333x1f73abb4(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27510x92037252 c27510x92037252) {
        this.f60508x92037252 = c27510x92037252;
        return this;
    }

    /* renamed from: setContext */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 m117334xe9f5beed(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f60509x38b735af = gVar;
        return this;
    }

    /* renamed from: setContinueFlag */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 m117335x6a498235(boolean z17) {
        this.f60510x900e5c04 = z17;
        return this;
    }

    /* renamed from: setContinue_flag */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 m117336xe0447ec2(boolean z17) {
        this.f60510x900e5c04 = z17;
        return this;
    }

    /* renamed from: setHistories */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 m117337xc29a11f0(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27535xf4cf6822> linkedList) {
        this.f60511x66d8e032 = linkedList;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 m117332x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27534x36200514) super.mo11468x92b714fd(bArr);
    }
}

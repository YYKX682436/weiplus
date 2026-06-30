package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomRequest */
/* loaded from: classes4.dex */
public class C15778x36493c32 extends r45.mr5 {

    /* renamed from: chatroom_name */
    public java.lang.String f36733x3923b317;

    /* renamed from: extern_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62 f36734xbb2821ed;

    /* renamed from: lbs_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs f36735xdccb09f0;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15778x36493c32 m64135xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15778x36493c32();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15778x36493c32)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15778x36493c32 c15778x36493c32 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15778x36493c32) fVar;
        return n51.f.a(this.f76494x2de60e5e, c15778x36493c32.f76494x2de60e5e) && n51.f.a(this.f36733x3923b317, c15778x36493c32.f36733x3923b317) && n51.f.a(this.f36735xdccb09f0, c15778x36493c32.f36735xdccb09f0) && n51.f.a(this.f36734xbb2821ed, c15778x36493c32.f36734xbb2821ed);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f36733x3923b317;
            if (str != null) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs lbs = this.f36735xdccb09f0;
            if (lbs != null) {
                fVar.i(3, lbs.mo75928xcd1e8d8());
                this.f36735xdccb09f0.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62 c15754x1d35eb62 = this.f36734xbb2821ed;
            if (c15754x1d35eb62 != null) {
                fVar.i(4, c15754x1d35eb62.mo75928xcd1e8d8());
                this.f36734xbb2821ed.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f36733x3923b317;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs lbs2 = this.f36735xdccb09f0;
            if (lbs2 != null) {
                i18 += b36.f.i(3, lbs2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62 c15754x1d35eb622 = this.f36734xbb2821ed;
            return c15754x1d35eb622 != null ? i18 + b36.f.i(4, c15754x1d35eb622.mo75928xcd1e8d8()) : i18;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15778x36493c32 c15778x36493c32 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15778x36493c32) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                c15778x36493c32.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            c15778x36493c32.f36733x3923b317 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs lbs3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs();
                if (bArr2 != null && bArr2.length > 0) {
                    lbs3.mo11468x92b714fd(bArr2);
                }
                c15778x36493c32.f36735xdccb09f0 = lbs3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62 c15754x1d35eb623 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62();
            if (bArr3 != null && bArr3.length > 0) {
                c15754x1d35eb623.mo11468x92b714fd(bArr3);
            }
            c15778x36493c32.f36734xbb2821ed = c15754x1d35eb623;
        }
        return 0;
    }

    /* renamed from: setChatroom_name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15778x36493c32 m64136x8959d5d5(java.lang.String str) {
        this.f36733x3923b317 = str;
        return this;
    }

    /* renamed from: setExtern_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15778x36493c32 m64137x2b63dc2b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62 c15754x1d35eb62) {
        this.f36734xbb2821ed = c15754x1d35eb62;
        return this;
    }

    /* renamed from: setLbs_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15778x36493c32 m64138x535da872(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs lbs) {
        this.f36735xdccb09f0 = lbs;
        return this;
    }
}

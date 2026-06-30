package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo */
/* loaded from: classes4.dex */
public class C15708xdab31aec extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: img_url */
    public java.lang.String f36456x7246f2f3;

    /* renamed from: need_gaussian_blur */
    public boolean f36457xe0421c42;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15708xdab31aec m63778xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15708xdab31aec();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15708xdab31aec)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15708xdab31aec c15708xdab31aec = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15708xdab31aec) fVar;
        return n51.f.a(this.f36456x7246f2f3, c15708xdab31aec.f36456x7246f2f3) && n51.f.a(java.lang.Boolean.valueOf(this.f36457xe0421c42), java.lang.Boolean.valueOf(c15708xdab31aec.f36457xe0421c42));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36456x7246f2f3;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f36457xe0421c42);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f36456x7246f2f3;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.a(2, this.f36457xe0421c42);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15708xdab31aec c15708xdab31aec = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15708xdab31aec) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15708xdab31aec.f36456x7246f2f3 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        c15708xdab31aec.f36457xe0421c42 = aVar2.c(intValue);
        return 0;
    }

    /* renamed from: setImg_url */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15708xdab31aec m63779x23857c31(java.lang.String str) {
        this.f36456x7246f2f3 = str;
        return this;
    }

    /* renamed from: setNeed_gaussian_blur */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15708xdab31aec m63780x8aca0044(boolean z17) {
        this.f36457xe0421c42 = z17;
        return this;
    }
}

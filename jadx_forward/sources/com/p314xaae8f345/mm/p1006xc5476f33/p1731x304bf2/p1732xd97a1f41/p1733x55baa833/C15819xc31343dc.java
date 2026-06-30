package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.SlotList */
/* loaded from: classes4.dex */
public class C15819xc31343dc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: head_desc */
    public java.lang.String f36864xf2ee9590;

    /* renamed from: slot_list */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15818x275e1e> f36865x28f00e3f = new java.util.LinkedList<>();

    /* renamed from: version */
    public java.lang.String f36866x14f51cd8;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15819xc31343dc m64313xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15819xc31343dc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15819xc31343dc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15819xc31343dc c15819xc31343dc = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15819xc31343dc) fVar;
        return n51.f.a(this.f36865x28f00e3f, c15819xc31343dc.f36865x28f00e3f) && n51.f.a(this.f36866x14f51cd8, c15819xc31343dc.f36866x14f51cd8) && n51.f.a(this.f36864xf2ee9590, c15819xc31343dc.f36864xf2ee9590);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f36865x28f00e3f);
            java.lang.String str = this.f36866x14f51cd8;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f36864xf2ee9590;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f36865x28f00e3f) + 0;
            java.lang.String str3 = this.f36866x14f51cd8;
            if (str3 != null) {
                g17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f36864xf2ee9590;
            return str4 != null ? g17 + b36.f.j(3, str4) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f36865x28f00e3f.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15819xc31343dc c15819xc31343dc = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15819xc31343dc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                c15819xc31343dc.f36866x14f51cd8 = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            c15819xc31343dc.f36864xf2ee9590 = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15818x275e1e c15818x275e1e = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15818x275e1e();
            if (bArr2 != null && bArr2.length > 0) {
                c15818x275e1e.mo11468x92b714fd(bArr2);
            }
            c15819xc31343dc.f36865x28f00e3f.add(c15818x275e1e);
        }
        return 0;
    }

    /* renamed from: setHead_desc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15819xc31343dc m64314x4eafc74e(java.lang.String str) {
        this.f36864xf2ee9590 = str;
        return this;
    }

    /* renamed from: setSlot_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15819xc31343dc m64315x84b13ffd(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15818x275e1e> linkedList) {
        this.f36865x28f00e3f = linkedList;
        return this;
    }

    /* renamed from: setVersion */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15819xc31343dc m64316xc633a616(java.lang.String str) {
        this.f36866x14f51cd8 = str;
        return this;
    }
}

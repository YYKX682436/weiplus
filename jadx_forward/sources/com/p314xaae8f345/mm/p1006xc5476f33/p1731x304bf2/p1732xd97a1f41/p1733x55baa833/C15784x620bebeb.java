package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo */
/* loaded from: classes4.dex */
public class C15784x620bebeb extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: location_desc */
    public java.lang.String f36752x94e2a0db;

    /* renamed from: location_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15756x171a88ff f36753x94e506f8;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15784x620bebeb m64161xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15784x620bebeb();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15784x620bebeb)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15784x620bebeb c15784x620bebeb = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15784x620bebeb) fVar;
        return n51.f.a(this.f36753x94e506f8, c15784x620bebeb.f36753x94e506f8) && n51.f.a(this.f36752x94e2a0db, c15784x620bebeb.f36752x94e2a0db);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15756x171a88ff c15756x171a88ff = this.f36753x94e506f8;
            if (c15756x171a88ff != null) {
                fVar.i(1, c15756x171a88ff.mo75928xcd1e8d8());
                this.f36753x94e506f8.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f36752x94e2a0db;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15756x171a88ff c15756x171a88ff2 = this.f36753x94e506f8;
            int i18 = c15756x171a88ff2 != null ? 0 + b36.f.i(1, c15756x171a88ff2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f36752x94e2a0db;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15784x620bebeb c15784x620bebeb = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15784x620bebeb) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            c15784x620bebeb.f36752x94e2a0db = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15756x171a88ff c15756x171a88ff3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15756x171a88ff();
            if (bArr != null && bArr.length > 0) {
                c15756x171a88ff3.mo11468x92b714fd(bArr);
            }
            c15784x620bebeb.f36753x94e506f8 = c15756x171a88ff3;
        }
        return 0;
    }

    /* renamed from: setLocation_desc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15784x620bebeb m64162xe518c399(java.lang.String str) {
        this.f36752x94e2a0db = str;
        return this;
    }

    /* renamed from: setLocation_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15784x620bebeb m64163xe51b29b6(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15756x171a88ff c15756x171a88ff) {
        this.f36753x94e506f8 = c15756x171a88ff;
        return this;
    }
}

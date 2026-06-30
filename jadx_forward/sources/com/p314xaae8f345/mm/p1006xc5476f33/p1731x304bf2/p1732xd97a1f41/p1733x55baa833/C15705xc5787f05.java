package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.BanAction */
/* loaded from: classes4.dex */
public class C15705xc5787f05 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: desc */
    public java.lang.String f36452x2efe91;

    /* renamed from: type */
    public int f36453x368f3a;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05 m63771xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05 c15705xc5787f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f36453x368f3a), java.lang.Integer.valueOf(c15705xc5787f05.f36453x368f3a)) && n51.f.a(this.f36452x2efe91, c15705xc5787f05.f36452x2efe91);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f36453x368f3a);
            java.lang.String str = this.f36452x2efe91;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f36453x368f3a) + 0;
            java.lang.String str2 = this.f36452x2efe91;
            return str2 != null ? e17 + b36.f.j(2, str2) : e17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05 c15705xc5787f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15705xc5787f05.f36453x368f3a = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        c15705xc5787f05.f36452x2efe91 = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setDesc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05 m63772x76492e13(java.lang.String str) {
        this.f36452x2efe91 = str;
        return this;
    }

    /* renamed from: setType */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05 m63773x7650bebc(int i17) {
        this.f36453x368f3a = i17;
        return this;
    }
}

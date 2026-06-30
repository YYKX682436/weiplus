package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.Panel */
/* loaded from: classes4.dex */
public class C15799x49519e4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: desc */
    public java.lang.String f36815x2efe91;

    /* renamed from: icon */
    public java.lang.String f36816x313c79;

    /* renamed from: jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f36817x28d1961f;

    /* renamed from: type */
    public int f36818x368f3a;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4 m64241xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4 c15799x49519e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f36818x368f3a), java.lang.Integer.valueOf(c15799x49519e4.f36818x368f3a)) && n51.f.a(this.f36816x313c79, c15799x49519e4.f36816x313c79) && n51.f.a(this.f36815x2efe91, c15799x49519e4.f36815x2efe91) && n51.f.a(this.f36817x28d1961f, c15799x49519e4.f36817x28d1961f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f36818x368f3a);
            java.lang.String str = this.f36816x313c79;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f36815x2efe91;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = this.f36817x28d1961f;
            if (c15780xf49d6a1c != null) {
                fVar.i(4, c15780xf49d6a1c.mo75928xcd1e8d8());
                this.f36817x28d1961f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f36818x368f3a) + 0;
            java.lang.String str3 = this.f36816x313c79;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f36815x2efe91;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c2 = this.f36817x28d1961f;
            return c15780xf49d6a1c2 != null ? e17 + b36.f.i(4, c15780xf49d6a1c2.mo75928xcd1e8d8()) : e17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4 c15799x49519e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15799x49519e4.f36818x368f3a = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            c15799x49519e4.f36816x313c79 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            c15799x49519e4.f36815x2efe91 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
            if (bArr != null && bArr.length > 0) {
                c15780xf49d6a1c3.mo11468x92b714fd(bArr);
            }
            c15799x49519e4.f36817x28d1961f = c15780xf49d6a1c3;
        }
        return 0;
    }

    /* renamed from: setDesc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4 m64242x76492e13(java.lang.String str) {
        this.f36815x2efe91 = str;
        return this;
    }

    /* renamed from: setIcon */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4 m64243x764b6bfb(java.lang.String str) {
        this.f36816x313c79 = str;
        return this;
    }

    /* renamed from: setJump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4 m64244x8492c7dd(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        this.f36817x28d1961f = c15780xf49d6a1c;
        return this;
    }

    /* renamed from: setType */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4 m64245x7650bebc(int i17) {
        this.f36818x368f3a = i17;
        return this;
    }
}

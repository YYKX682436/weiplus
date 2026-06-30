package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink */
/* loaded from: classes4.dex */
public class C15733xb0b841eb extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: desc */
    public java.lang.String f36579x2efe91;

    /* renamed from: jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f36580x28d1961f;

    /* renamed from: pic_url */
    public java.lang.String f36581xdd86d13a;

    /* renamed from: title */
    public java.lang.String f36582x6942258;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15733xb0b841eb m63934xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15733xb0b841eb();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15733xb0b841eb)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15733xb0b841eb c15733xb0b841eb = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15733xb0b841eb) fVar;
        return n51.f.a(this.f36581xdd86d13a, c15733xb0b841eb.f36581xdd86d13a) && n51.f.a(this.f36582x6942258, c15733xb0b841eb.f36582x6942258) && n51.f.a(this.f36579x2efe91, c15733xb0b841eb.f36579x2efe91) && n51.f.a(this.f36580x28d1961f, c15733xb0b841eb.f36580x28d1961f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36581xdd86d13a;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f36582x6942258;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f36579x2efe91;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = this.f36580x28d1961f;
            if (c15780xf49d6a1c != null) {
                fVar.i(4, c15780xf49d6a1c.mo75928xcd1e8d8());
                this.f36580x28d1961f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f36581xdd86d13a;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f36582x6942258;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f36579x2efe91;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c2 = this.f36580x28d1961f;
            return c15780xf49d6a1c2 != null ? j17 + b36.f.i(4, c15780xf49d6a1c2.mo75928xcd1e8d8()) : j17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15733xb0b841eb c15733xb0b841eb = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15733xb0b841eb) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15733xb0b841eb.f36581xdd86d13a = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            c15733xb0b841eb.f36582x6942258 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            c15733xb0b841eb.f36579x2efe91 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
            if (bArr != null && bArr.length > 0) {
                c15780xf49d6a1c3.mo11468x92b714fd(bArr);
            }
            c15733xb0b841eb.f36580x28d1961f = c15780xf49d6a1c3;
        }
        return 0;
    }

    /* renamed from: setDesc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15733xb0b841eb m63935x76492e13(java.lang.String str) {
        this.f36579x2efe91 = str;
        return this;
    }

    /* renamed from: setJump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15733xb0b841eb m63936x8492c7dd(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        this.f36580x28d1961f = c15780xf49d6a1c;
        return this;
    }

    /* renamed from: setPic_url */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15733xb0b841eb m63937x8ec55a78(java.lang.String str) {
        this.f36581xdd86d13a = str;
        return this;
    }

    /* renamed from: setTitle */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15733xb0b841eb m63938x53bfe316(java.lang.String str) {
        this.f36582x6942258 = str;
        return this;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail */
/* loaded from: classes4.dex */
public class C15723x5bc67ad2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: desc */
    public java.lang.String f36511x2efe91;

    /* renamed from: jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f36512x28d1961f;

    /* renamed from: show_icon */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15817xefa32936 f36513x8e88707b;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 m63850xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 c15723x5bc67ad2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2) fVar;
        return n51.f.a(this.f36512x28d1961f, c15723x5bc67ad2.f36512x28d1961f) && n51.f.a(this.f36513x8e88707b, c15723x5bc67ad2.f36513x8e88707b) && n51.f.a(this.f36511x2efe91, c15723x5bc67ad2.f36511x2efe91);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = this.f36512x28d1961f;
            if (c15780xf49d6a1c != null) {
                fVar.i(1, c15780xf49d6a1c.mo75928xcd1e8d8());
                this.f36512x28d1961f.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15817xefa32936 c15817xefa32936 = this.f36513x8e88707b;
            if (c15817xefa32936 != null) {
                fVar.i(2, c15817xefa32936.mo75928xcd1e8d8());
                this.f36513x8e88707b.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f36511x2efe91;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c2 = this.f36512x28d1961f;
            int i18 = c15780xf49d6a1c2 != null ? 0 + b36.f.i(1, c15780xf49d6a1c2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15817xefa32936 c15817xefa329362 = this.f36513x8e88707b;
            if (c15817xefa329362 != null) {
                i18 += b36.f.i(2, c15817xefa329362.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f36511x2efe91;
            return str2 != null ? i18 + b36.f.j(3, str2) : i18;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 c15723x5bc67ad2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
                if (bArr != null && bArr.length > 0) {
                    c15780xf49d6a1c3.mo11468x92b714fd(bArr);
                }
                c15723x5bc67ad2.f36512x28d1961f = c15780xf49d6a1c3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            c15723x5bc67ad2.f36511x2efe91 = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15817xefa32936 c15817xefa329363 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15817xefa32936();
            if (bArr2 != null && bArr2.length > 0) {
                c15817xefa329363.mo11468x92b714fd(bArr2);
            }
            c15723x5bc67ad2.f36513x8e88707b = c15817xefa329363;
        }
        return 0;
    }

    /* renamed from: setDesc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 m63851x76492e13(java.lang.String str) {
        this.f36511x2efe91 = str;
        return this;
    }

    /* renamed from: setJump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 m63852x8492c7dd(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        this.f36512x28d1961f = c15780xf49d6a1c;
        return this;
    }

    /* renamed from: setShow_icon */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 m63853xea49a239(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15817xefa32936 c15817xefa32936) {
        this.f36513x8e88707b = c15817xefa32936;
        return this;
    }
}

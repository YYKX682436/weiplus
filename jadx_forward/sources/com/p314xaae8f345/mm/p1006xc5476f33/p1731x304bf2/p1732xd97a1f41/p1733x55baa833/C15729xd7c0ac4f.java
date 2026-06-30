package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink */
/* loaded from: classes4.dex */
public class C15729xd7c0ac4f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f36561x28d1961f;

    /* renamed from: pic_height */
    public int f36562x34efed7c;

    /* renamed from: pic_url */
    public java.lang.String f36563xdd86d13a;

    /* renamed from: pic_width */
    public int f36564x972f72d1;

    /* renamed from: playtime */
    public int f36565x700a2401;

    /* renamed from: type */
    public int f36566x368f3a;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15729xd7c0ac4f m63911xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15729xd7c0ac4f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15729xd7c0ac4f)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15729xd7c0ac4f c15729xd7c0ac4f = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15729xd7c0ac4f) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f36566x368f3a), java.lang.Integer.valueOf(c15729xd7c0ac4f.f36566x368f3a)) && n51.f.a(this.f36563xdd86d13a, c15729xd7c0ac4f.f36563xdd86d13a) && n51.f.a(java.lang.Integer.valueOf(this.f36565x700a2401), java.lang.Integer.valueOf(c15729xd7c0ac4f.f36565x700a2401)) && n51.f.a(this.f36561x28d1961f, c15729xd7c0ac4f.f36561x28d1961f) && n51.f.a(java.lang.Integer.valueOf(this.f36564x972f72d1), java.lang.Integer.valueOf(c15729xd7c0ac4f.f36564x972f72d1)) && n51.f.a(java.lang.Integer.valueOf(this.f36562x34efed7c), java.lang.Integer.valueOf(c15729xd7c0ac4f.f36562x34efed7c));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f36566x368f3a);
            java.lang.String str = this.f36563xdd86d13a;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f36565x700a2401);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = this.f36561x28d1961f;
            if (c15780xf49d6a1c != null) {
                fVar.i(4, c15780xf49d6a1c.mo75928xcd1e8d8());
                this.f36561x28d1961f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f36564x972f72d1);
            fVar.e(6, this.f36562x34efed7c);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f36566x368f3a) + 0;
            java.lang.String str2 = this.f36563xdd86d13a;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            int e18 = e17 + b36.f.e(3, this.f36565x700a2401);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c2 = this.f36561x28d1961f;
            if (c15780xf49d6a1c2 != null) {
                e18 += b36.f.i(4, c15780xf49d6a1c2.mo75928xcd1e8d8());
            }
            return e18 + b36.f.e(5, this.f36564x972f72d1) + b36.f.e(6, this.f36562x34efed7c);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15729xd7c0ac4f c15729xd7c0ac4f = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15729xd7c0ac4f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c15729xd7c0ac4f.f36566x368f3a = aVar2.g(intValue);
                return 0;
            case 2:
                c15729xd7c0ac4f.f36563xdd86d13a = aVar2.k(intValue);
                return 0;
            case 3:
                c15729xd7c0ac4f.f36565x700a2401 = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
                    if (bArr != null && bArr.length > 0) {
                        c15780xf49d6a1c3.mo11468x92b714fd(bArr);
                    }
                    c15729xd7c0ac4f.f36561x28d1961f = c15780xf49d6a1c3;
                }
                return 0;
            case 5:
                c15729xd7c0ac4f.f36564x972f72d1 = aVar2.g(intValue);
                return 0;
            case 6:
                c15729xd7c0ac4f.f36562x34efed7c = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setJump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15729xd7c0ac4f m63912x8492c7dd(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        this.f36561x28d1961f = c15780xf49d6a1c;
        return this;
    }

    /* renamed from: setPic_height */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15729xd7c0ac4f m63913x5154f37e(int i17) {
        this.f36562x34efed7c = i17;
        return this;
    }

    /* renamed from: setPic_url */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15729xd7c0ac4f m63914x8ec55a78(java.lang.String str) {
        this.f36563xdd86d13a = str;
        return this;
    }

    /* renamed from: setPic_width */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15729xd7c0ac4f m63915xf2f0a48f(int i17) {
        this.f36564x972f72d1 = i17;
        return this;
    }

    /* renamed from: setPlaytime */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15729xd7c0ac4f m63916xe69cc283(int i17) {
        this.f36565x700a2401 = i17;
        return this;
    }

    /* renamed from: setType */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15729xd7c0ac4f m63917x7650bebc(int i17) {
        this.f36566x368f3a = i17;
        return this;
    }
}

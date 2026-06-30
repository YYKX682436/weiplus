package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo */
/* loaded from: classes8.dex */
public class C15780xf49d6a1c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: chatroom_seq */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c f36740x2b224253;

    /* renamed from: half_screen */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15777x5c9b169f f36741x68a8edf8;

    /* renamed from: jump_type */
    public int f36742x28d6c0ab;

    /* renamed from: jump_url */
    public java.lang.String f36743xf0cd21de;

    /* renamed from: preload_id */
    public java.lang.String f36744xf6825b11;

    /* renamed from: weapp_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15838x34f4a78f f36745x92fd8573;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c m64144xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f36742x28d6c0ab), java.lang.Integer.valueOf(c15780xf49d6a1c.f36742x28d6c0ab)) && n51.f.a(this.f36743xf0cd21de, c15780xf49d6a1c.f36743xf0cd21de) && n51.f.a(this.f36745x92fd8573, c15780xf49d6a1c.f36745x92fd8573) && n51.f.a(this.f36741x68a8edf8, c15780xf49d6a1c.f36741x68a8edf8) && n51.f.a(this.f36740x2b224253, c15780xf49d6a1c.f36740x2b224253) && n51.f.a(this.f36744xf6825b11, c15780xf49d6a1c.f36744xf6825b11);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f36742x28d6c0ab);
            java.lang.String str = this.f36743xf0cd21de;
            if (str != null) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15838x34f4a78f c15838x34f4a78f = this.f36745x92fd8573;
            if (c15838x34f4a78f != null) {
                fVar.i(3, c15838x34f4a78f.mo75928xcd1e8d8());
                this.f36745x92fd8573.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15777x5c9b169f c15777x5c9b169f = this.f36741x68a8edf8;
            if (c15777x5c9b169f != null) {
                fVar.i(4, c15777x5c9b169f.mo75928xcd1e8d8());
                this.f36741x68a8edf8.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c c15742xc7e6730c = this.f36740x2b224253;
            if (c15742xc7e6730c != null) {
                fVar.i(5, c15742xc7e6730c.mo75928xcd1e8d8());
                this.f36740x2b224253.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f36744xf6825b11;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f36742x28d6c0ab) + 0;
            java.lang.String str3 = this.f36743xf0cd21de;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15838x34f4a78f c15838x34f4a78f2 = this.f36745x92fd8573;
            if (c15838x34f4a78f2 != null) {
                e17 += b36.f.i(3, c15838x34f4a78f2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15777x5c9b169f c15777x5c9b169f2 = this.f36741x68a8edf8;
            if (c15777x5c9b169f2 != null) {
                e17 += b36.f.i(4, c15777x5c9b169f2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c c15742xc7e6730c2 = this.f36740x2b224253;
            if (c15742xc7e6730c2 != null) {
                e17 += b36.f.i(5, c15742xc7e6730c2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f36744xf6825b11;
            return str4 != null ? e17 + b36.f.j(6, str4) : e17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c15780xf49d6a1c.f36742x28d6c0ab = aVar2.g(intValue);
                return 0;
            case 2:
                c15780xf49d6a1c.f36743xf0cd21de = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15838x34f4a78f c15838x34f4a78f3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15838x34f4a78f();
                    if (bArr != null && bArr.length > 0) {
                        c15838x34f4a78f3.mo11468x92b714fd(bArr);
                    }
                    c15780xf49d6a1c.f36745x92fd8573 = c15838x34f4a78f3;
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15777x5c9b169f c15777x5c9b169f3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15777x5c9b169f();
                    if (bArr2 != null && bArr2.length > 0) {
                        c15777x5c9b169f3.mo11468x92b714fd(bArr2);
                    }
                    c15780xf49d6a1c.f36741x68a8edf8 = c15777x5c9b169f3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c c15742xc7e6730c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c();
                    if (bArr3 != null && bArr3.length > 0) {
                        c15742xc7e6730c3.mo11468x92b714fd(bArr3);
                    }
                    c15780xf49d6a1c.f36740x2b224253 = c15742xc7e6730c3;
                }
                return 0;
            case 6:
                c15780xf49d6a1c.f36744xf6825b11 = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setChatroom_seq */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c m64145xc25dcfd5(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c c15742xc7e6730c) {
        this.f36740x2b224253 = c15742xc7e6730c;
        return this;
    }

    /* renamed from: setHalf_screen */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c m64146xd8e4a836(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15777x5c9b169f c15777x5c9b169f) {
        this.f36741x68a8edf8 = c15777x5c9b169f;
        return this;
    }

    /* renamed from: setJump_type */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c m64147x8497f269(int i17) {
        this.f36742x28d6c0ab = i17;
        return this;
    }

    /* renamed from: setJump_url */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c m64148x675fc060(java.lang.String str) {
        this.f36743xf0cd21de = str;
        return this;
    }

    /* renamed from: setPreload_id */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c m64149x12e76113(java.lang.String str) {
        this.f36744xf6825b11 = str;
        return this;
    }

    /* renamed from: setWeapp_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c m64150xae35f0b1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15838x34f4a78f c15838x34f4a78f) {
        this.f36745x92fd8573 = c15838x34f4a78f;
        return this;
    }
}

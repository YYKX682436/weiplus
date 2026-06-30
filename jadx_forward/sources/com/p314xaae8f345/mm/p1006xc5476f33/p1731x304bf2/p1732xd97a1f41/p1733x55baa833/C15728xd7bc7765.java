package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard */
/* loaded from: classes4.dex */
public class C15728xd7bc7765 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: desc */
    public java.lang.String f36557x2efe91;

    /* renamed from: img_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f36558xd27790a3;

    /* renamed from: pic_url */
    public java.lang.String f36559xdd86d13a;

    /* renamed from: show_video_play */
    public boolean f36560xfe7c6efa;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15728xd7bc7765 m63906xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15728xd7bc7765();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15728xd7bc7765)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15728xd7bc7765 c15728xd7bc7765 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15728xd7bc7765) fVar;
        return n51.f.a(this.f36559xdd86d13a, c15728xd7bc7765.f36559xdd86d13a) && n51.f.a(this.f36557x2efe91, c15728xd7bc7765.f36557x2efe91) && n51.f.a(this.f36558xd27790a3, c15728xd7bc7765.f36558xd27790a3) && n51.f.a(java.lang.Boolean.valueOf(this.f36560xfe7c6efa), java.lang.Boolean.valueOf(c15728xd7bc7765.f36560xfe7c6efa));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36559xdd86d13a;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f36557x2efe91;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = this.f36558xd27790a3;
            if (c15780xf49d6a1c != null) {
                fVar.i(3, c15780xf49d6a1c.mo75928xcd1e8d8());
                this.f36558xd27790a3.mo75956x3d5d1f78(fVar);
            }
            fVar.a(4, this.f36560xfe7c6efa);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f36559xdd86d13a;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f36557x2efe91;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c2 = this.f36558xd27790a3;
            if (c15780xf49d6a1c2 != null) {
                j17 += b36.f.i(3, c15780xf49d6a1c2.mo75928xcd1e8d8());
            }
            return j17 + b36.f.a(4, this.f36560xfe7c6efa);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15728xd7bc7765 c15728xd7bc7765 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15728xd7bc7765) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15728xd7bc7765.f36559xdd86d13a = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            c15728xd7bc7765.f36557x2efe91 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            c15728xd7bc7765.f36560xfe7c6efa = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
            if (bArr != null && bArr.length > 0) {
                c15780xf49d6a1c3.mo11468x92b714fd(bArr);
            }
            c15728xd7bc7765.f36558xd27790a3 = c15780xf49d6a1c3;
        }
        return 0;
    }

    /* renamed from: setDesc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15728xd7bc7765 m63907x76492e13(java.lang.String str) {
        this.f36557x2efe91 = str;
        return this;
    }

    /* renamed from: setImg_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15728xd7bc7765 m63908x22adb361(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        this.f36558xd27790a3 = c15780xf49d6a1c;
        return this;
    }

    /* renamed from: setPic_url */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15728xd7bc7765 m63909x8ec55a78(java.lang.String str) {
        this.f36559xdd86d13a = str;
        return this;
    }

    /* renamed from: setShow_video_play */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15728xd7bc7765 m63910x19b4da38(boolean z17) {
        this.f36560xfe7c6efa = z17;
        return this;
    }
}

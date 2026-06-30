package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo */
/* loaded from: classes4.dex */
public class C15793xe0873b6d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: abstract_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15699xdc9f3c10 f36785x88dcf2ab;

    /* renamed from: at_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1 f36786xd69ab93a;

    /* renamed from: chatroom_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b f36787x39219d3a;

    /* renamed from: last_msg_desc */
    public java.lang.String f36788xd678c018;

    /* renamed from: unread_msg_count */
    public long f36789xd8fdd641;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d m64203xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d c15793xe0873b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d) fVar;
        return n51.f.a(this.f36787x39219d3a, c15793xe0873b6d.f36787x39219d3a) && n51.f.a(this.f36786xd69ab93a, c15793xe0873b6d.f36786xd69ab93a) && n51.f.a(java.lang.Long.valueOf(this.f36789xd8fdd641), java.lang.Long.valueOf(c15793xe0873b6d.f36789xd8fdd641)) && n51.f.a(this.f36785x88dcf2ab, c15793xe0873b6d.f36785x88dcf2ab) && n51.f.a(this.f36788xd678c018, c15793xe0873b6d.f36788xd678c018);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b c15741x8495618b = this.f36787x39219d3a;
            if (c15741x8495618b != null) {
                fVar.i(1, c15741x8495618b.mo75928xcd1e8d8());
                this.f36787x39219d3a.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1 c15702x75707fa1 = this.f36786xd69ab93a;
            if (c15702x75707fa1 != null) {
                fVar.i(2, c15702x75707fa1.mo75928xcd1e8d8());
                this.f36786xd69ab93a.mo75956x3d5d1f78(fVar);
            }
            fVar.h(3, this.f36789xd8fdd641);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15699xdc9f3c10 c15699xdc9f3c10 = this.f36785x88dcf2ab;
            if (c15699xdc9f3c10 != null) {
                fVar.i(4, c15699xdc9f3c10.mo75928xcd1e8d8());
                this.f36785x88dcf2ab.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f36788xd678c018;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b c15741x8495618b2 = this.f36787x39219d3a;
            int i18 = c15741x8495618b2 != null ? 0 + b36.f.i(1, c15741x8495618b2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1 c15702x75707fa12 = this.f36786xd69ab93a;
            if (c15702x75707fa12 != null) {
                i18 += b36.f.i(2, c15702x75707fa12.mo75928xcd1e8d8());
            }
            int h17 = i18 + b36.f.h(3, this.f36789xd8fdd641);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15699xdc9f3c10 c15699xdc9f3c102 = this.f36785x88dcf2ab;
            if (c15699xdc9f3c102 != null) {
                h17 += b36.f.i(4, c15699xdc9f3c102.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f36788xd678c018;
            return str2 != null ? h17 + b36.f.j(5, str2) : h17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d c15793xe0873b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b c15741x8495618b3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b();
                if (bArr != null && bArr.length > 0) {
                    c15741x8495618b3.mo11468x92b714fd(bArr);
                }
                c15793xe0873b6d.f36787x39219d3a = c15741x8495618b3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1 c15702x75707fa13 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1();
                if (bArr2 != null && bArr2.length > 0) {
                    c15702x75707fa13.mo11468x92b714fd(bArr2);
                }
                c15793xe0873b6d.f36786xd69ab93a = c15702x75707fa13;
            }
            return 0;
        }
        if (intValue == 3) {
            c15793xe0873b6d.f36789xd8fdd641 = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            c15793xe0873b6d.f36788xd678c018 = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15699xdc9f3c10 c15699xdc9f3c103 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15699xdc9f3c10();
            if (bArr3 != null && bArr3.length > 0) {
                c15699xdc9f3c103.mo11468x92b714fd(bArr3);
            }
            c15793xe0873b6d.f36785x88dcf2ab = c15699xdc9f3c103;
        }
        return 0;
    }

    /* renamed from: setAbstract_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d m64204xd9131569(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15699xdc9f3c10 c15699xdc9f3c10) {
        this.f36785x88dcf2ab = c15699xdc9f3c10;
        return this;
    }

    /* renamed from: setAt_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d m64205x87d94278(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1 c15702x75707fa1) {
        this.f36786xd69ab93a = c15702x75707fa1;
        return this;
    }

    /* renamed from: setChatroom_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d m64206x8957bff8(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b c15741x8495618b) {
        this.f36787x39219d3a = c15741x8495618b;
        return this;
    }

    /* renamed from: setLast_msg_desc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d m64207x26aee2d6(java.lang.String str) {
        this.f36788xd678c018 = str;
        return this;
    }

    /* renamed from: setUnread_msg_count */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d m64208x24d2d2c3(long j17) {
        this.f36789xd8fdd641 = j17;
        return this;
    }
}

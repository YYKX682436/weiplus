package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse */
/* loaded from: classes4.dex */
public class C15758x3e6f7ab8 extends r45.js5 {

    /* renamed from: chatroom_rank_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 f36670x8f838f58;

    /* renamed from: create_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f36671xc610269c;

    /* renamed from: find_more_chatroom_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 f36672x28d2cdb7;

    /* renamed from: find_more_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f36673x41c494fb;

    /* renamed from: show_entrance */
    public boolean f36674xeae3edb8;

    /* renamed from: chatroom_info_list */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b> f36669xa4bf0083 = new java.util.LinkedList<>();

    /* renamed from: ban_action_list */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05> f36668xb0a398d7 = new java.util.LinkedList<>();

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8 m64050xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8 c15758x3e6f7ab8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8) fVar;
        return n51.f.a(this.f76492x92037252, c15758x3e6f7ab8.f76492x92037252) && n51.f.a(this.f36669xa4bf0083, c15758x3e6f7ab8.f36669xa4bf0083) && n51.f.a(this.f36671xc610269c, c15758x3e6f7ab8.f36671xc610269c) && n51.f.a(this.f36668xb0a398d7, c15758x3e6f7ab8.f36668xb0a398d7) && n51.f.a(java.lang.Boolean.valueOf(this.f36674xeae3edb8), java.lang.Boolean.valueOf(c15758x3e6f7ab8.f36674xeae3edb8)) && n51.f.a(this.f36673x41c494fb, c15758x3e6f7ab8.f36673x41c494fb) && n51.f.a(this.f36672x28d2cdb7, c15758x3e6f7ab8.f36672x28d2cdb7) && n51.f.a(this.f36670x8f838f58, c15758x3e6f7ab8.f36670x8f838f58);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, this.f36669xa4bf0083);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = this.f36671xc610269c;
            if (c15780xf49d6a1c != null) {
                fVar.i(3, c15780xf49d6a1c.mo75928xcd1e8d8());
                this.f36671xc610269c.mo75956x3d5d1f78(fVar);
            }
            fVar.g(4, 8, this.f36668xb0a398d7);
            fVar.a(5, this.f36674xeae3edb8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c2 = this.f36673x41c494fb;
            if (c15780xf49d6a1c2 != null) {
                fVar.i(6, c15780xf49d6a1c2.mo75928xcd1e8d8());
                this.f36673x41c494fb.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 c15723x5bc67ad2 = this.f36672x28d2cdb7;
            if (c15723x5bc67ad2 != null) {
                fVar.i(7, c15723x5bc67ad2.mo75928xcd1e8d8());
                this.f36672x28d2cdb7.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 c15723x5bc67ad22 = this.f36670x8f838f58;
            if (c15723x5bc67ad22 != null) {
                fVar.i(8, c15723x5bc67ad22.mo75928xcd1e8d8());
                this.f36670x8f838f58.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, this.f36669xa4bf0083);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c3 = this.f36671xc610269c;
            if (c15780xf49d6a1c3 != null) {
                i18 += b36.f.i(3, c15780xf49d6a1c3.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(4, 8, this.f36668xb0a398d7) + b36.f.a(5, this.f36674xeae3edb8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c4 = this.f36673x41c494fb;
            if (c15780xf49d6a1c4 != null) {
                g17 += b36.f.i(6, c15780xf49d6a1c4.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 c15723x5bc67ad23 = this.f36672x28d2cdb7;
            if (c15723x5bc67ad23 != null) {
                g17 += b36.f.i(7, c15723x5bc67ad23.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 c15723x5bc67ad24 = this.f36670x8f838f58;
            return c15723x5bc67ad24 != null ? g17 + b36.f.i(8, c15723x5bc67ad24.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f36669xa4bf0083.clear();
            this.f36668xb0a398d7.clear();
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8 c15758x3e6f7ab8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    c15758x3e6f7ab8.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b c15741x8495618b = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b();
                    if (bArr3 != null && bArr3.length > 0) {
                        c15741x8495618b.mo11468x92b714fd(bArr3);
                    }
                    c15758x3e6f7ab8.f36669xa4bf0083.add(c15741x8495618b);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
                    if (bArr4 != null && bArr4.length > 0) {
                        c15780xf49d6a1c5.mo11468x92b714fd(bArr4);
                    }
                    c15758x3e6f7ab8.f36671xc610269c = c15780xf49d6a1c5;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05 c15705xc5787f05 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05();
                    if (bArr5 != null && bArr5.length > 0) {
                        c15705xc5787f05.mo11468x92b714fd(bArr5);
                    }
                    c15758x3e6f7ab8.f36668xb0a398d7.add(c15705xc5787f05);
                }
                return 0;
            case 5:
                c15758x3e6f7ab8.f36674xeae3edb8 = aVar2.c(intValue);
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
                    if (bArr6 != null && bArr6.length > 0) {
                        c15780xf49d6a1c6.mo11468x92b714fd(bArr6);
                    }
                    c15758x3e6f7ab8.f36673x41c494fb = c15780xf49d6a1c6;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 c15723x5bc67ad25 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2();
                    if (bArr7 != null && bArr7.length > 0) {
                        c15723x5bc67ad25.mo11468x92b714fd(bArr7);
                    }
                    c15758x3e6f7ab8.f36672x28d2cdb7 = c15723x5bc67ad25;
                }
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 c15723x5bc67ad26 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2();
                    if (bArr8 != null && bArr8.length > 0) {
                        c15723x5bc67ad26.mo11468x92b714fd(bArr8);
                    }
                    c15758x3e6f7ab8.f36670x8f838f58 = c15723x5bc67ad26;
                }
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setBan_action_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8 m64051xcbdc0415(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05> linkedList) {
        this.f36668xb0a398d7 = linkedList;
        return this;
    }

    /* renamed from: setChatroom_info_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8 m64052x4f46e485(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b> linkedList) {
        this.f36669xa4bf0083 = linkedList;
        return this;
    }

    /* renamed from: setChatroom_rank_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8 m64053x75b3dc96(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 c15723x5bc67ad2) {
        this.f36670x8f838f58 = c15723x5bc67ad2;
        return this;
    }

    /* renamed from: setCreate_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8 m64054x11e5231e(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        this.f36671xc610269c = c15780xf49d6a1c;
        return this;
    }

    /* renamed from: setFind_more_chatroom_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8 m64055x6f971739(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15723x5bc67ad2 c15723x5bc67ad2) {
        this.f36672x28d2cdb7 = c15723x5bc67ad2;
        return this;
    }

    /* renamed from: setFind_more_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8 m64056xe8393139(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        this.f36673x41c494fb = c15780xf49d6a1c;
        return this;
    }

    /* renamed from: setShow_entrance */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15758x3e6f7ab8 m64057x3b1a1076(boolean z17) {
        this.f36674xeae3edb8 = z17;
        return this;
    }
}

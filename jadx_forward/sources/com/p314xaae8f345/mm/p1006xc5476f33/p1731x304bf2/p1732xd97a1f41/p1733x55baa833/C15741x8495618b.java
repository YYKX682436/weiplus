package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo */
/* loaded from: classes4.dex */
public class C15741x8495618b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: basic_update_time */
    public long f36601x503e45f2;

    /* renamed from: chating_des */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434 f36603x863903dd;

    /* renamed from: chatroom_data */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d f36604x391f2836;

    /* renamed from: last_chatroom_msg */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 f36606xe3c0687e;

    /* renamed from: user_chatting_count */
    public int f36607x9f3cf4ca;

    /* renamed from: chosen_chatroom_msg */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61> f36605xe0f4bd22 = new java.util.LinkedList<>();

    /* renamed from: bullet_msg_list */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61> f36602xa6f89939 = new java.util.LinkedList<>();

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b m63964xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b c15741x8495618b = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b) fVar;
        return n51.f.a(this.f36604x391f2836, c15741x8495618b.f36604x391f2836) && n51.f.a(java.lang.Long.valueOf(this.f36601x503e45f2), java.lang.Long.valueOf(c15741x8495618b.f36601x503e45f2)) && n51.f.a(this.f36603x863903dd, c15741x8495618b.f36603x863903dd) && n51.f.a(java.lang.Integer.valueOf(this.f36607x9f3cf4ca), java.lang.Integer.valueOf(c15741x8495618b.f36607x9f3cf4ca)) && n51.f.a(this.f36606xe3c0687e, c15741x8495618b.f36606xe3c0687e) && n51.f.a(this.f36605xe0f4bd22, c15741x8495618b.f36605xe0f4bd22) && n51.f.a(this.f36602xa6f89939, c15741x8495618b.f36602xa6f89939);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d c15720x34e10e9d = this.f36604x391f2836;
            if (c15720x34e10e9d != null) {
                fVar.i(1, c15720x34e10e9d.mo75928xcd1e8d8());
                this.f36604x391f2836.mo75956x3d5d1f78(fVar);
            }
            fVar.h(2, this.f36601x503e45f2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434 c15746xc5371434 = this.f36603x863903dd;
            if (c15746xc5371434 != null) {
                fVar.i(3, c15746xc5371434.mo75928xcd1e8d8());
                this.f36603x863903dd.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f36607x9f3cf4ca);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = this.f36606xe3c0687e;
            if (c15731x94356d67 != null) {
                fVar.i(5, c15731x94356d67.mo75928xcd1e8d8());
                this.f36606xe3c0687e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 8, this.f36605xe0f4bd22);
            fVar.g(7, 8, this.f36602xa6f89939);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d c15720x34e10e9d2 = this.f36604x391f2836;
            int i18 = (c15720x34e10e9d2 != null ? 0 + b36.f.i(1, c15720x34e10e9d2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f36601x503e45f2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434 c15746xc53714342 = this.f36603x863903dd;
            if (c15746xc53714342 != null) {
                i18 += b36.f.i(3, c15746xc53714342.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(4, this.f36607x9f3cf4ca);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d672 = this.f36606xe3c0687e;
            if (c15731x94356d672 != null) {
                e17 += b36.f.i(5, c15731x94356d672.mo75928xcd1e8d8());
            }
            return e17 + b36.f.g(6, 8, this.f36605xe0f4bd22) + b36.f.g(7, 8, this.f36602xa6f89939);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f36605xe0f4bd22.clear();
            this.f36602xa6f89939.clear();
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b c15741x8495618b = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d c15720x34e10e9d3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d();
                    if (bArr2 != null && bArr2.length > 0) {
                        c15720x34e10e9d3.mo11468x92b714fd(bArr2);
                    }
                    c15741x8495618b.f36604x391f2836 = c15720x34e10e9d3;
                }
                return 0;
            case 2:
                c15741x8495618b.f36601x503e45f2 = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434 c15746xc53714343 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434();
                    if (bArr3 != null && bArr3.length > 0) {
                        c15746xc53714343.mo11468x92b714fd(bArr3);
                    }
                    c15741x8495618b.f36603x863903dd = c15746xc53714343;
                }
                return 0;
            case 4:
                c15741x8495618b.f36607x9f3cf4ca = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d673 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67();
                    if (bArr4 != null && bArr4.length > 0) {
                        c15731x94356d673.mo11468x92b714fd(bArr4);
                    }
                    c15741x8495618b.f36606xe3c0687e = c15731x94356d673;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61 c15732xa4e12f61 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61();
                    if (bArr5 != null && bArr5.length > 0) {
                        c15732xa4e12f61.mo11468x92b714fd(bArr5);
                    }
                    c15741x8495618b.f36605xe0f4bd22.add(c15732xa4e12f61);
                }
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61 c15732xa4e12f612 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61();
                    if (bArr6 != null && bArr6.length > 0) {
                        c15732xa4e12f612.mo11468x92b714fd(bArr6);
                    }
                    c15741x8495618b.f36602xa6f89939.add(c15732xa4e12f612);
                }
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setBasic_update_time */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b m63965x7f08d9b0(long j17) {
        this.f36601x503e45f2 = j17;
        return this;
    }

    /* renamed from: setBullet_msg_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b m63966xc2310477(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61> linkedList) {
        this.f36602xa6f89939 = linkedList;
        return this;
    }

    /* renamed from: setChating_des */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b m63967xf674be1b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434 c15746xc5371434) {
        this.f36603x863903dd = c15746xc5371434;
        return this;
    }

    /* renamed from: setChatroom_data */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b m63968x89554af4(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15720x34e10e9d c15720x34e10e9d) {
        this.f36604x391f2836 = c15720x34e10e9d;
        return this;
    }

    /* renamed from: setChosen_chatroom_msg */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b m63969x87695960(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15732xa4e12f61> linkedList) {
        this.f36605xe0f4bd22 = linkedList;
        return this;
    }

    /* renamed from: setLast_chatroom_msg */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b m63970x128afc3c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67) {
        this.f36606xe3c0687e = c15731x94356d67;
        return this;
    }

    /* renamed from: setUser_chatting_count */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b m63971x45b19108(int i17) {
        this.f36607x9f3cf4ca = i17;
        return this;
    }
}

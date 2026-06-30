package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo */
/* loaded from: classes4.dex */
public class C15804x17740920 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: chatroom_ban_action */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15718x8a0a012 f36825xb13abff2;

    /* renamed from: disable_emoji */
    public boolean f36826xe181382f;

    /* renamed from: enable_custom_emoji */
    public boolean f36827x378de734;

    /* renamed from: kick_out_card_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15781x35a94f06 f36828xd9540693;

    /* renamed from: kick_out_wording */
    public java.lang.String f36829x529c842e;

    /* renamed from: premade_card_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15801x63595e16 f36830x142b4f36;

    /* renamed from: update_user_data_list */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88> f36831x163802d5 = new java.util.LinkedList<>();

    /* renamed from: user_ban_action */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15830xf2b5d77a f36832xf100cd5a;

    /* renamed from: user_chatroom_relation */
    public int f36833x4b6da514;

    /* renamed from: version */
    public java.lang.String f36834x14f51cd8;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920 m64257xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920 c15804x17740920 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f36833x4b6da514), java.lang.Integer.valueOf(c15804x17740920.f36833x4b6da514)) && n51.f.a(this.f36832xf100cd5a, c15804x17740920.f36832xf100cd5a) && n51.f.a(this.f36825xb13abff2, c15804x17740920.f36825xb13abff2) && n51.f.a(this.f36834x14f51cd8, c15804x17740920.f36834x14f51cd8) && n51.f.a(this.f36829x529c842e, c15804x17740920.f36829x529c842e) && n51.f.a(this.f36831x163802d5, c15804x17740920.f36831x163802d5) && n51.f.a(java.lang.Boolean.valueOf(this.f36826xe181382f), java.lang.Boolean.valueOf(c15804x17740920.f36826xe181382f)) && n51.f.a(this.f36830x142b4f36, c15804x17740920.f36830x142b4f36) && n51.f.a(java.lang.Boolean.valueOf(this.f36827x378de734), java.lang.Boolean.valueOf(c15804x17740920.f36827x378de734)) && n51.f.a(this.f36828xd9540693, c15804x17740920.f36828xd9540693);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f36833x4b6da514);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15830xf2b5d77a c15830xf2b5d77a = this.f36832xf100cd5a;
            if (c15830xf2b5d77a != null) {
                fVar.i(2, c15830xf2b5d77a.mo75928xcd1e8d8());
                this.f36832xf100cd5a.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15718x8a0a012 c15718x8a0a012 = this.f36825xb13abff2;
            if (c15718x8a0a012 != null) {
                fVar.i(3, c15718x8a0a012.mo75928xcd1e8d8());
                this.f36825xb13abff2.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f36834x14f51cd8;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f36829x529c842e;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.g(6, 8, this.f36831x163802d5);
            fVar.a(7, this.f36826xe181382f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15801x63595e16 c15801x63595e16 = this.f36830x142b4f36;
            if (c15801x63595e16 != null) {
                fVar.i(8, c15801x63595e16.mo75928xcd1e8d8());
                this.f36830x142b4f36.mo75956x3d5d1f78(fVar);
            }
            fVar.a(9, this.f36827x378de734);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15781x35a94f06 c15781x35a94f06 = this.f36828xd9540693;
            if (c15781x35a94f06 != null) {
                fVar.i(10, c15781x35a94f06.mo75928xcd1e8d8());
                this.f36828xd9540693.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f36833x4b6da514) + 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15830xf2b5d77a c15830xf2b5d77a2 = this.f36832xf100cd5a;
            if (c15830xf2b5d77a2 != null) {
                e17 += b36.f.i(2, c15830xf2b5d77a2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15718x8a0a012 c15718x8a0a0122 = this.f36825xb13abff2;
            if (c15718x8a0a0122 != null) {
                e17 += b36.f.i(3, c15718x8a0a0122.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f36834x14f51cd8;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f36829x529c842e;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            int g17 = e17 + b36.f.g(6, 8, this.f36831x163802d5) + b36.f.a(7, this.f36826xe181382f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15801x63595e16 c15801x63595e162 = this.f36830x142b4f36;
            if (c15801x63595e162 != null) {
                g17 += b36.f.i(8, c15801x63595e162.mo75928xcd1e8d8());
            }
            int a17 = g17 + b36.f.a(9, this.f36827x378de734);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15781x35a94f06 c15781x35a94f062 = this.f36828xd9540693;
            return c15781x35a94f062 != null ? a17 + b36.f.i(10, c15781x35a94f062.mo75928xcd1e8d8()) : a17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f36831x163802d5.clear();
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920 c15804x17740920 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c15804x17740920.f36833x4b6da514 = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15830xf2b5d77a c15830xf2b5d77a3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15830xf2b5d77a();
                    if (bArr2 != null && bArr2.length > 0) {
                        c15830xf2b5d77a3.mo11468x92b714fd(bArr2);
                    }
                    c15804x17740920.f36832xf100cd5a = c15830xf2b5d77a3;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15718x8a0a012 c15718x8a0a0123 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15718x8a0a012();
                    if (bArr3 != null && bArr3.length > 0) {
                        c15718x8a0a0123.mo11468x92b714fd(bArr3);
                    }
                    c15804x17740920.f36825xb13abff2 = c15718x8a0a0123;
                }
                return 0;
            case 4:
                c15804x17740920.f36834x14f51cd8 = aVar2.k(intValue);
                return 0;
            case 5:
                c15804x17740920.f36829x529c842e = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 c15744x2fe9df88 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88();
                    if (bArr4 != null && bArr4.length > 0) {
                        c15744x2fe9df88.mo11468x92b714fd(bArr4);
                    }
                    c15804x17740920.f36831x163802d5.add(c15744x2fe9df88);
                }
                return 0;
            case 7:
                c15804x17740920.f36826xe181382f = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15801x63595e16 c15801x63595e163 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15801x63595e16();
                    if (bArr5 != null && bArr5.length > 0) {
                        c15801x63595e163.mo11468x92b714fd(bArr5);
                    }
                    c15804x17740920.f36830x142b4f36 = c15801x63595e163;
                }
                return 0;
            case 9:
                c15804x17740920.f36827x378de734 = aVar2.c(intValue);
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15781x35a94f06 c15781x35a94f063 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15781x35a94f06();
                    if (bArr6 != null && bArr6.length > 0) {
                        c15781x35a94f063.mo11468x92b714fd(bArr6);
                    }
                    c15804x17740920.f36828xd9540693 = c15781x35a94f063;
                }
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setChatroom_ban_action */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920 m64258x57af5c30(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15718x8a0a012 c15718x8a0a012) {
        this.f36825xb13abff2 = c15718x8a0a012;
        return this;
    }

    /* renamed from: setDisable_emoji */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920 m64259x31b75aed(boolean z17) {
        this.f36826xe181382f = z17;
        return this;
    }

    /* renamed from: setEnable_custom_emoji */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920 m64260xde028372(boolean z17) {
        this.f36827x378de734 = z17;
        return this;
    }

    /* renamed from: setKick_out_card_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920 m64261x83dbea95(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15781x35a94f06 c15781x35a94f06) {
        this.f36828xd9540693 = c15781x35a94f06;
        return this;
    }

    /* renamed from: setKick_out_wording */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920 m64262x9e7180b0(java.lang.String str) {
        this.f36829x529c842e = str;
        return this;
    }

    /* renamed from: setPremade_card_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920 m64263x42f5e2f4(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15801x63595e16 c15801x63595e16) {
        this.f36830x142b4f36 = c15801x63595e16;
        return this;
    }

    /* renamed from: setUpdate_user_data_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920 m64264xf1f68793(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88> linkedList) {
        this.f36831x163802d5 = linkedList;
        return this;
    }

    /* renamed from: setUser_ban_action */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920 m64265xc393898(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15830xf2b5d77a c15830xf2b5d77a) {
        this.f36832xf100cd5a = c15830xf2b5d77a;
        return this;
    }

    /* renamed from: setUser_chatroom_relation */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920 m64266xe77fb816(int i17) {
        this.f36833x4b6da514 = i17;
        return this;
    }

    /* renamed from: setVersion */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15804x17740920 m64267xc633a616(java.lang.String str) {
        this.f36834x14f51cd8 = str;
        return this;
    }
}

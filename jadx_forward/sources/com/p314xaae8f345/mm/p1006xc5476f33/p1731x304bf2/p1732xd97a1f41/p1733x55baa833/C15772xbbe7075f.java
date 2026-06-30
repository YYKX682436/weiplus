package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GetMoreChatroomResponse */
/* loaded from: classes4.dex */
public class C15772xbbe7075f extends r45.js5 {

    /* renamed from: chatroom_filter */
    public java.lang.String f36718x71cd1104;

    /* renamed from: has_next */
    public boolean f36720x8624178;

    /* renamed from: chatroom_info_list */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b> f36719xa4bf0083 = new java.util.LinkedList<>();

    /* renamed from: ban_action_list */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05> f36717xb0a398d7 = new java.util.LinkedList<>();

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15772xbbe7075f m64113xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15772xbbe7075f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15772xbbe7075f)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15772xbbe7075f c15772xbbe7075f = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15772xbbe7075f) fVar;
        return n51.f.a(this.f76492x92037252, c15772xbbe7075f.f76492x92037252) && n51.f.a(this.f36719xa4bf0083, c15772xbbe7075f.f36719xa4bf0083) && n51.f.a(java.lang.Boolean.valueOf(this.f36720x8624178), java.lang.Boolean.valueOf(c15772xbbe7075f.f36720x8624178)) && n51.f.a(this.f36718x71cd1104, c15772xbbe7075f.f36718x71cd1104) && n51.f.a(this.f36717xb0a398d7, c15772xbbe7075f.f36717xb0a398d7);
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
            fVar.g(2, 8, this.f36719xa4bf0083);
            fVar.a(3, this.f36720x8624178);
            java.lang.String str = this.f36718x71cd1104;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.g(5, 8, this.f36717xb0a398d7);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, this.f36719xa4bf0083) + b36.f.a(3, this.f36720x8624178);
            java.lang.String str2 = this.f36718x71cd1104;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.g(5, 8, this.f36717xb0a398d7);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f36719xa4bf0083.clear();
            this.f36717xb0a398d7.clear();
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15772xbbe7075f c15772xbbe7075f = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15772xbbe7075f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                c15772xbbe7075f.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b c15741x8495618b = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b();
                if (bArr3 != null && bArr3.length > 0) {
                    c15741x8495618b.mo11468x92b714fd(bArr3);
                }
                c15772xbbe7075f.f36719xa4bf0083.add(c15741x8495618b);
            }
            return 0;
        }
        if (intValue == 3) {
            c15772xbbe7075f.f36720x8624178 = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            c15772xbbe7075f.f36718x71cd1104 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05 c15705xc5787f05 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05();
            if (bArr4 != null && bArr4.length > 0) {
                c15705xc5787f05.mo11468x92b714fd(bArr4);
            }
            c15772xbbe7075f.f36717xb0a398d7.add(c15705xc5787f05);
        }
        return 0;
    }

    /* renamed from: setBan_action_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15772xbbe7075f m64114xcbdc0415(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15705xc5787f05> linkedList) {
        this.f36717xb0a398d7 = linkedList;
        return this;
    }

    /* renamed from: setChatroom_filter */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15772xbbe7075f m64115x8d057c42(java.lang.String str) {
        this.f36718x71cd1104 = str;
        return this;
    }

    /* renamed from: setChatroom_info_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15772xbbe7075f m64116x4f46e485(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15741x8495618b> linkedList) {
        this.f36719xa4bf0083 = linkedList;
        return this;
    }

    /* renamed from: setHas_next */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15772xbbe7075f m64117x7ef4dffa(boolean z17) {
        this.f36720x8624178 = z17;
        return this;
    }
}

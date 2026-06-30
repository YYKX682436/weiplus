package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomResponse */
/* loaded from: classes4.dex */
public class C15779x9605fefe extends r45.js5 {

    /* renamed from: chatroom_full_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f36736x20dc05fb;

    /* renamed from: create_account_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f36737x75cdca0a;

    /* renamed from: errmsg */
    public java.lang.String f36738xb2d567fc;

    /* renamed from: need_jump_create_account */
    public boolean f36739x5b1ddcf2;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15779x9605fefe m64139xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15779x9605fefe();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15779x9605fefe)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15779x9605fefe c15779x9605fefe = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15779x9605fefe) fVar;
        return n51.f.a(this.f76492x92037252, c15779x9605fefe.f76492x92037252) && n51.f.a(this.f36738xb2d567fc, c15779x9605fefe.f36738xb2d567fc) && n51.f.a(java.lang.Boolean.valueOf(this.f36739x5b1ddcf2), java.lang.Boolean.valueOf(c15779x9605fefe.f36739x5b1ddcf2)) && n51.f.a(this.f36737x75cdca0a, c15779x9605fefe.f36737x75cdca0a) && n51.f.a(this.f36736x20dc05fb, c15779x9605fefe.f36736x20dc05fb);
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
            java.lang.String str = this.f36738xb2d567fc;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f36739x5b1ddcf2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = this.f36737x75cdca0a;
            if (c15780xf49d6a1c != null) {
                fVar.i(4, c15780xf49d6a1c.mo75928xcd1e8d8());
                this.f36737x75cdca0a.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c2 = this.f36736x20dc05fb;
            if (c15780xf49d6a1c2 != null) {
                fVar.i(5, c15780xf49d6a1c2.mo75928xcd1e8d8());
                this.f36736x20dc05fb.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f36738xb2d567fc;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int a17 = i18 + b36.f.a(3, this.f36739x5b1ddcf2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c3 = this.f36737x75cdca0a;
            if (c15780xf49d6a1c3 != null) {
                a17 += b36.f.i(4, c15780xf49d6a1c3.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c4 = this.f36736x20dc05fb;
            return c15780xf49d6a1c4 != null ? a17 + b36.f.i(5, c15780xf49d6a1c4.mo75928xcd1e8d8()) : a17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15779x9605fefe c15779x9605fefe = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15779x9605fefe) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                c15779x9605fefe.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            c15779x9605fefe.f36738xb2d567fc = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            c15779x9605fefe.f36739x5b1ddcf2 = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
                if (bArr2 != null && bArr2.length > 0) {
                    c15780xf49d6a1c5.mo11468x92b714fd(bArr2);
                }
                c15779x9605fefe.f36737x75cdca0a = c15780xf49d6a1c5;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
            if (bArr3 != null && bArr3.length > 0) {
                c15780xf49d6a1c6.mo11468x92b714fd(bArr3);
            }
            c15779x9605fefe.f36736x20dc05fb = c15780xf49d6a1c6;
        }
        return 0;
    }

    /* renamed from: setChatroom_full_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15779x9605fefe m64140x70c5339(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        this.f36736x20dc05fb = c15780xf49d6a1c;
        return this;
    }

    /* renamed from: setCreate_account_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15779x9605fefe m64141x55a7248c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        this.f36737x75cdca0a = c15780xf49d6a1c;
        return this;
    }

    /* renamed from: setErrmsg */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15779x9605fefe m64142xb21befe(java.lang.String str) {
        this.f36738xb2d567fc = str;
        return this;
    }

    /* renamed from: setNeed_jump_create_account */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15779x9605fefe m64143x3af73774(boolean z17) {
        this.f36739x5b1ddcf2 = z17;
        return this;
    }
}

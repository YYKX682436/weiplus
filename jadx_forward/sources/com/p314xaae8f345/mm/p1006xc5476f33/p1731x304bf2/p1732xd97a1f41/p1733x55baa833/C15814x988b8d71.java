package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.SetChatroomMsgChosenRequest */
/* loaded from: classes2.dex */
public class C15814x988b8d71 extends r45.mr5 {

    /* renamed from: chatroom_name */
    public java.lang.String f36856x3923b317;

    /* renamed from: is_chosen */
    public boolean f36857xca863027;
    public long seq;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15814x988b8d71 m64299xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15814x988b8d71();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15814x988b8d71)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15814x988b8d71 c15814x988b8d71 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15814x988b8d71) fVar;
        return n51.f.a(this.f76494x2de60e5e, c15814x988b8d71.f76494x2de60e5e) && n51.f.a(this.f36856x3923b317, c15814x988b8d71.f36856x3923b317) && n51.f.a(java.lang.Long.valueOf(this.seq), java.lang.Long.valueOf(c15814x988b8d71.seq)) && n51.f.a(java.lang.Boolean.valueOf(this.f36857xca863027), java.lang.Boolean.valueOf(c15814x988b8d71.f36857xca863027));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f36856x3923b317;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.seq);
            fVar.a(4, this.f36857xca863027);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f36856x3923b317;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.h(3, this.seq) + b36.f.a(4, this.f36857xca863027);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15814x988b8d71 c15814x988b8d71 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15814x988b8d71) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                c15814x988b8d71.f36856x3923b317 = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                c15814x988b8d71.seq = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            c15814x988b8d71.f36857xca863027 = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.mo11468x92b714fd(bArr);
            }
            c15814x988b8d71.f76494x2de60e5e = heVar3;
        }
        return 0;
    }

    /* renamed from: setChatroom_name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15814x988b8d71 m64300x8959d5d5(java.lang.String str) {
        this.f36856x3923b317 = str;
        return this;
    }

    /* renamed from: setIs_chosen */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15814x988b8d71 m64301x264761e5(boolean z17) {
        this.f36857xca863027 = z17;
        return this;
    }

    /* renamed from: setSeq */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15814x988b8d71 m64302xca02949d(long j17) {
        this.seq = j17;
        return this;
    }
}

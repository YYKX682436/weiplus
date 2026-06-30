package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo */
/* loaded from: classes4.dex */
public class C15753xa1266bcc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: disappear_second */
    public int f36656x8c9fc490;

    /* renamed from: jump_wording */
    public java.lang.String f36657x4be8987;

    /* renamed from: lead_speak_wording */
    public java.lang.String f36658xd48a1188;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15753xa1266bcc m64033xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15753xa1266bcc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15753xa1266bcc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15753xa1266bcc c15753xa1266bcc = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15753xa1266bcc) fVar;
        return n51.f.a(this.f36657x4be8987, c15753xa1266bcc.f36657x4be8987) && n51.f.a(this.f36658xd48a1188, c15753xa1266bcc.f36658xd48a1188) && n51.f.a(java.lang.Integer.valueOf(this.f36656x8c9fc490), java.lang.Integer.valueOf(c15753xa1266bcc.f36656x8c9fc490));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36657x4be8987;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f36658xd48a1188;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f36656x8c9fc490);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f36657x4be8987;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f36658xd48a1188;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f36656x8c9fc490);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15753xa1266bcc c15753xa1266bcc = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15753xa1266bcc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15753xa1266bcc.f36657x4be8987 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            c15753xa1266bcc.f36658xd48a1188 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        c15753xa1266bcc.f36656x8c9fc490 = aVar2.g(intValue);
        return 0;
    }

    /* renamed from: setDisappear_second */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15753xa1266bcc m64034xd874c112(int i17) {
        this.f36656x8c9fc490 = i17;
        return this;
    }

    /* renamed from: setJump_wording */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15753xa1266bcc m64035x9bfa1709(java.lang.String str) {
        this.f36657x4be8987 = str;
        return this;
    }

    /* renamed from: setLead_speak_wording */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15753xa1266bcc m64036x7f11f58a(java.lang.String str) {
        this.f36658xd48a1188 = str;
        return this;
    }
}

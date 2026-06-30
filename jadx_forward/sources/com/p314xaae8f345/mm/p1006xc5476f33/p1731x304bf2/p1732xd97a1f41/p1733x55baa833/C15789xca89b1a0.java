package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo */
/* loaded from: classes4.dex */
public class C15789xca89b1a0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: chatroom_first_seq */
    public long f36759x634c2544;

    /* renamed from: enter_lead_speak_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15753xa1266bcc f36760xe469a257;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15789xca89b1a0 m64173xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15789xca89b1a0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15789xca89b1a0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15789xca89b1a0 c15789xca89b1a0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15789xca89b1a0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f36759x634c2544), java.lang.Long.valueOf(c15789xca89b1a0.f36759x634c2544)) && n51.f.a(this.f36760xe469a257, c15789xca89b1a0.f36760xe469a257);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f36759x634c2544);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15753xa1266bcc c15753xa1266bcc = this.f36760xe469a257;
            if (c15753xa1266bcc != null) {
                fVar.i(2, c15753xa1266bcc.mo75928xcd1e8d8());
                this.f36760xe469a257.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f36759x634c2544) + 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15753xa1266bcc c15753xa1266bcc2 = this.f36760xe469a257;
            return c15753xa1266bcc2 != null ? h17 + b36.f.i(2, c15753xa1266bcc2.mo75928xcd1e8d8()) : h17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15789xca89b1a0 c15789xca89b1a0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15789xca89b1a0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15789xca89b1a0.f36759x634c2544 = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15753xa1266bcc c15753xa1266bcc3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15753xa1266bcc();
            if (bArr != null && bArr.length > 0) {
                c15753xa1266bcc3.mo11468x92b714fd(bArr);
            }
            c15789xca89b1a0.f36760xe469a257 = c15753xa1266bcc3;
        }
        return 0;
    }

    /* renamed from: setChatroom_first_seq */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15789xca89b1a0 m64174xdd40946(long j17) {
        this.f36759x634c2544 = j17;
        return this;
    }

    /* renamed from: setEnter_lead_speak_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15789xca89b1a0 m64175xc0282715(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15753xa1266bcc c15753xa1266bcc) {
        this.f36760xe469a257 = c15753xa1266bcc;
        return this;
    }
}

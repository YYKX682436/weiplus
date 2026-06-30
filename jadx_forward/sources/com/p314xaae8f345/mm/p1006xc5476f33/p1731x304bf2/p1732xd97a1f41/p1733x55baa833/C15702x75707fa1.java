package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.AtInfo */
/* loaded from: classes2.dex */
public class C15702x75707fa1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: seq_list */
    public java.util.LinkedList<java.lang.Long> f36446x4f3d907e = new java.util.LinkedList<>();

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1 m63762xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1) && n51.f.a(this.f36446x4f3d907e, ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1) fVar).f36446x4f3d907e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 3, this.f36446x4f3d907e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 3, this.f36446x4f3d907e) + 0;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f36446x4f3d907e.clear();
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1 c15702x75707fa1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        c15702x75707fa1.f36446x4f3d907e.add(java.lang.Long.valueOf(aVar2.i(intValue)));
        return 0;
    }

    /* renamed from: setSeq_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15702x75707fa1 m63763xc5d02f00(java.util.LinkedList<java.lang.Long> linkedList) {
        this.f36446x4f3d907e = linkedList;
        return this;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq */
/* loaded from: classes4.dex */
public class C15742xc7e6730c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: channel_id */
    public int f36608x8cea31d7;

    /* renamed from: chatroom_name */
    public java.lang.String f36609x3923b317;
    public long seq;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c m63972xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c c15742xc7e6730c = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c) fVar;
        return n51.f.a(this.f36609x3923b317, c15742xc7e6730c.f36609x3923b317) && n51.f.a(java.lang.Integer.valueOf(this.f36608x8cea31d7), java.lang.Integer.valueOf(c15742xc7e6730c.f36608x8cea31d7)) && n51.f.a(java.lang.Long.valueOf(this.seq), java.lang.Long.valueOf(c15742xc7e6730c.seq));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36609x3923b317;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f36608x8cea31d7);
            fVar.h(3, this.seq);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f36609x3923b317;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f36608x8cea31d7) + b36.f.h(3, this.seq);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c c15742xc7e6730c = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15742xc7e6730c.f36609x3923b317 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            c15742xc7e6730c.f36608x8cea31d7 = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        c15742xc7e6730c.seq = aVar2.i(intValue);
        return 0;
    }

    /* renamed from: setChannel_id */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c m63973xa94f37d9(int i17) {
        this.f36608x8cea31d7 = i17;
        return this;
    }

    /* renamed from: setChatroom_name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c m63974x8959d5d5(java.lang.String str) {
        this.f36609x3923b317 = str;
        return this;
    }

    /* renamed from: setSeq */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15742xc7e6730c m63975xca02949d(long j17) {
        this.seq = j17;
        return this;
    }
}

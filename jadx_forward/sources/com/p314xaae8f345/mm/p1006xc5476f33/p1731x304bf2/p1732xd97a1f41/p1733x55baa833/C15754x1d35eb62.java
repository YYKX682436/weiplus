package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo */
/* loaded from: classes4.dex */
public class C15754x1d35eb62 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: sourceid */
    public long f36659x6816da76;

    /* renamed from: ssid */
    public long f36660x36037b;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62 m64037xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62 c15754x1d35eb62 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f36659x6816da76), java.lang.Long.valueOf(c15754x1d35eb62.f36659x6816da76)) && n51.f.a(java.lang.Long.valueOf(this.f36660x36037b), java.lang.Long.valueOf(c15754x1d35eb62.f36660x36037b));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f36659x6816da76);
            fVar.h(2, this.f36660x36037b);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f36659x6816da76) + 0 + b36.f.h(2, this.f36660x36037b);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62 c15754x1d35eb62 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15754x1d35eb62.f36659x6816da76 = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        c15754x1d35eb62.f36660x36037b = aVar2.i(intValue);
        return 0;
    }

    /* renamed from: setSourceid */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62 m64038xdea978f8(long j17) {
        this.f36659x6816da76 = j17;
        return this;
    }

    /* renamed from: setSsid */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62 m64039x765032fd(long j17) {
        this.f36660x36037b = j17;
        return this;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.Channel */
/* loaded from: classes4.dex */
public class C15716x8f4414e3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: cant_send_reason */
    public java.lang.String f36469x39ecb9c0;

    /* renamed from: channel_id */
    public int f36470x8cea31d7;

    /* renamed from: desc */
    public java.lang.String f36471x2efe91;

    /* renamed from: name */
    public java.lang.String f36472x337a8b;

    /* renamed from: read_only */
    public boolean f36473xbda00cb5;

    /* renamed from: unread_msg_count */
    public long f36474xd8fdd641;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 m63801xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 c15716x8f4414e3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f36470x8cea31d7), java.lang.Integer.valueOf(c15716x8f4414e3.f36470x8cea31d7)) && n51.f.a(this.f36472x337a8b, c15716x8f4414e3.f36472x337a8b) && n51.f.a(java.lang.Boolean.valueOf(this.f36473xbda00cb5), java.lang.Boolean.valueOf(c15716x8f4414e3.f36473xbda00cb5)) && n51.f.a(this.f36469x39ecb9c0, c15716x8f4414e3.f36469x39ecb9c0) && n51.f.a(this.f36471x2efe91, c15716x8f4414e3.f36471x2efe91) && n51.f.a(java.lang.Long.valueOf(this.f36474xd8fdd641), java.lang.Long.valueOf(c15716x8f4414e3.f36474xd8fdd641));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f36470x8cea31d7);
            java.lang.String str = this.f36472x337a8b;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f36473xbda00cb5);
            java.lang.String str2 = this.f36469x39ecb9c0;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f36471x2efe91;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.h(6, this.f36474xd8fdd641);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f36470x8cea31d7) + 0;
            java.lang.String str4 = this.f36472x337a8b;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int a17 = e17 + b36.f.a(3, this.f36473xbda00cb5);
            java.lang.String str5 = this.f36469x39ecb9c0;
            if (str5 != null) {
                a17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f36471x2efe91;
            if (str6 != null) {
                a17 += b36.f.j(5, str6);
            }
            return a17 + b36.f.h(6, this.f36474xd8fdd641);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 c15716x8f4414e3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c15716x8f4414e3.f36470x8cea31d7 = aVar2.g(intValue);
                return 0;
            case 2:
                c15716x8f4414e3.f36472x337a8b = aVar2.k(intValue);
                return 0;
            case 3:
                c15716x8f4414e3.f36473xbda00cb5 = aVar2.c(intValue);
                return 0;
            case 4:
                c15716x8f4414e3.f36469x39ecb9c0 = aVar2.k(intValue);
                return 0;
            case 5:
                c15716x8f4414e3.f36471x2efe91 = aVar2.k(intValue);
                return 0;
            case 6:
                c15716x8f4414e3.f36474xd8fdd641 = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setCant_send_reason */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 m63802x85c1b642(java.lang.String str) {
        this.f36469x39ecb9c0 = str;
        return this;
    }

    /* renamed from: setChannel_id */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 m63803xa94f37d9(int i17) {
        this.f36470x8cea31d7 = i17;
        return this;
    }

    /* renamed from: setDesc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 m63804x76492e13(java.lang.String str) {
        this.f36471x2efe91 = str;
        return this;
    }

    /* renamed from: setName */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 m63805x764daa0d(java.lang.String str) {
        this.f36472x337a8b = str;
        return this;
    }

    /* renamed from: setRead_only */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 m63806x19613e73(boolean z17) {
        this.f36473xbda00cb5 = z17;
        return this;
    }

    /* renamed from: setUnread_msg_count */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 m63807x24d2d2c3(long j17) {
        this.f36474xd8fdd641 = j17;
        return this;
    }
}

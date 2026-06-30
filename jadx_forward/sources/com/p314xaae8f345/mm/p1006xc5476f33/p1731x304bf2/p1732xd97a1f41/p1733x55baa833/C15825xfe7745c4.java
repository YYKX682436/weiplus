package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo */
/* loaded from: classes4.dex */
public class C15825xfe7745c4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: is_tickle */
    public boolean f36880xe791188b;

    /* renamed from: to_username */
    public java.lang.String f36881x5907c61a;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15825xfe7745c4 m64335xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15825xfe7745c4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15825xfe7745c4)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15825xfe7745c4 c15825xfe7745c4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15825xfe7745c4) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f36880xe791188b), java.lang.Boolean.valueOf(c15825xfe7745c4.f36880xe791188b)) && n51.f.a(this.f36881x5907c61a, c15825xfe7745c4.f36881x5907c61a);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f36880xe791188b);
            java.lang.String str = this.f36881x5907c61a;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f36880xe791188b) + 0;
            java.lang.String str2 = this.f36881x5907c61a;
            return str2 != null ? a17 + b36.f.j(2, str2) : a17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15825xfe7745c4 c15825xfe7745c4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15825xfe7745c4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15825xfe7745c4.f36880xe791188b = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        c15825xfe7745c4.f36881x5907c61a = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setIs_tickle */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15825xfe7745c4 m64336x43524a49(boolean z17) {
        this.f36880xe791188b = z17;
        return this;
    }

    /* renamed from: setTo_username */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15825xfe7745c4 m64337xc9438058(java.lang.String str) {
        this.f36881x5907c61a = str;
        return this;
    }
}

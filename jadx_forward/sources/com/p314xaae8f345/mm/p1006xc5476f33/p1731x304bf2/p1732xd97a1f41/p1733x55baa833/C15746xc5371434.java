package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo */
/* loaded from: classes4.dex */
public class C15746xc5371434 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: avator */
    public java.lang.String f36641xac32c30b;

    /* renamed from: chating_type */
    public int f36642x40ef08cf;

    /* renamed from: desc */
    public java.lang.String f36643x2efe91;

    /* renamed from: version */
    public int f36644x14f51cd8;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434 m64011xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434 c15746xc5371434 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434) fVar;
        return n51.f.a(this.f36643x2efe91, c15746xc5371434.f36643x2efe91) && n51.f.a(java.lang.Integer.valueOf(this.f36642x40ef08cf), java.lang.Integer.valueOf(c15746xc5371434.f36642x40ef08cf)) && n51.f.a(this.f36641xac32c30b, c15746xc5371434.f36641xac32c30b) && n51.f.a(java.lang.Integer.valueOf(this.f36644x14f51cd8), java.lang.Integer.valueOf(c15746xc5371434.f36644x14f51cd8));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36643x2efe91;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f36642x40ef08cf);
            java.lang.String str2 = this.f36641xac32c30b;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f36644x14f51cd8);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f36643x2efe91;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f36642x40ef08cf);
            java.lang.String str4 = this.f36641xac32c30b;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f36644x14f51cd8);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434 c15746xc5371434 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15746xc5371434.f36643x2efe91 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            c15746xc5371434.f36642x40ef08cf = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            c15746xc5371434.f36641xac32c30b = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        c15746xc5371434.f36644x14f51cd8 = aVar2.g(intValue);
        return 0;
    }

    /* renamed from: setAvator */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434 m64012x47f1a0d(java.lang.String str) {
        this.f36641xac32c30b = str;
        return this;
    }

    /* renamed from: setChating_type */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434 m64013xd82a9651(int i17) {
        this.f36642x40ef08cf = i17;
        return this;
    }

    /* renamed from: setDesc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434 m64014x76492e13(java.lang.String str) {
        this.f36643x2efe91 = str;
        return this;
    }

    /* renamed from: setVersion */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15746xc5371434 m64015xc633a616(int i17) {
        this.f36644x14f51cd8 = i17;
        return this;
    }
}

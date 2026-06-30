package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo */
/* loaded from: classes2.dex */
public class C15700x71248539 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: auth_desc */
    public java.lang.String f36441x570c22c8;

    /* renamed from: auth_icon_type */
    public int f36442xe4b3d569;

    /* renamed from: auth_type */
    public int f36443x5713b371;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15700x71248539 m63755xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15700x71248539();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15700x71248539)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15700x71248539 c15700x71248539 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15700x71248539) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f36443x5713b371), java.lang.Integer.valueOf(c15700x71248539.f36443x5713b371)) && n51.f.a(this.f36441x570c22c8, c15700x71248539.f36441x570c22c8) && n51.f.a(java.lang.Integer.valueOf(this.f36442xe4b3d569), java.lang.Integer.valueOf(c15700x71248539.f36442xe4b3d569));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f36443x5713b371);
            java.lang.String str = this.f36441x570c22c8;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f36442xe4b3d569);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f36443x5713b371) + 0;
            java.lang.String str2 = this.f36441x570c22c8;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f36442xe4b3d569);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15700x71248539 c15700x71248539 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15700x71248539) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15700x71248539.f36443x5713b371 = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            c15700x71248539.f36441x570c22c8 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        c15700x71248539.f36442xe4b3d569 = aVar2.g(intValue);
        return 0;
    }

    /* renamed from: setAuth_desc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15700x71248539 m63756xb2cd5486(java.lang.String str) {
        this.f36441x570c22c8 = str;
        return this;
    }

    /* renamed from: setAuth_icon_type */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15700x71248539 m63757x9b420a6b(int i17) {
        this.f36442xe4b3d569 = i17;
        return this;
    }

    /* renamed from: setAuth_type */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15700x71248539 m63758xb2d4e52f(int i17) {
        this.f36443x5713b371 = i17;
        return this;
    }
}

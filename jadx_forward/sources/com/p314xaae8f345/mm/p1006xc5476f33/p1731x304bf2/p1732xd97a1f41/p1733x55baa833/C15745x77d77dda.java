package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserSimpleData */
/* loaded from: classes2.dex */
public class C15745x77d77dda extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: avatar */
    public java.lang.String f36638xac32c159;

    /* renamed from: nickname */
    public java.lang.String f36639x436a86e;

    /* renamed from: username */
    public java.lang.String f36640xf02988d6;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15745x77d77dda m64007xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15745x77d77dda();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15745x77d77dda)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15745x77d77dda c15745x77d77dda = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15745x77d77dda) fVar;
        return n51.f.a(this.f36640xf02988d6, c15745x77d77dda.f36640xf02988d6) && n51.f.a(this.f36639x436a86e, c15745x77d77dda.f36639x436a86e) && n51.f.a(this.f36638xac32c159, c15745x77d77dda.f36638xac32c159);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36640xf02988d6;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f36639x436a86e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f36638xac32c159;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f36640xf02988d6;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f36639x436a86e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f36638xac32c159;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15745x77d77dda c15745x77d77dda = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15745x77d77dda) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15745x77d77dda.f36640xf02988d6 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            c15745x77d77dda.f36639x436a86e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        c15745x77d77dda.f36638xac32c159 = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setAvatar */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15745x77d77dda m64008x47f185b(java.lang.String str) {
        this.f36638xac32c159 = str;
        return this;
    }

    /* renamed from: setNickname */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15745x77d77dda m64009x7ac946f0(java.lang.String str) {
        this.f36639x436a86e = str;
        return this;
    }

    /* renamed from: setUsername */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15745x77d77dda m64010x66bc2758(java.lang.String str) {
        this.f36640xf02988d6 = str;
        return this;
    }
}

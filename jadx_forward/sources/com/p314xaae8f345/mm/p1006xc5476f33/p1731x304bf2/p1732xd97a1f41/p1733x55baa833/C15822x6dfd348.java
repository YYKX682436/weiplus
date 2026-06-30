package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.TagInfo */
/* loaded from: classes4.dex */
public class C15822x6dfd348 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: appid */
    public java.lang.String f36871x58b82fc;

    /* renamed from: color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 f36872x5a72f63;

    /* renamed from: desc */
    public java.lang.String f36873x2efe91;

    /* renamed from: score */
    public int f36874x6833e92;

    /* renamed from: type */
    public int f36875x368f3a;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15822x6dfd348 m64323xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15822x6dfd348();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15822x6dfd348)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15822x6dfd348 c15822x6dfd348 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15822x6dfd348) fVar;
        return n51.f.a(this.f36873x2efe91, c15822x6dfd348.f36873x2efe91) && n51.f.a(java.lang.Integer.valueOf(this.f36875x368f3a), java.lang.Integer.valueOf(c15822x6dfd348.f36875x368f3a)) && n51.f.a(java.lang.Integer.valueOf(this.f36874x6833e92), java.lang.Integer.valueOf(c15822x6dfd348.f36874x6833e92)) && n51.f.a(this.f36871x58b82fc, c15822x6dfd348.f36871x58b82fc) && n51.f.a(this.f36872x5a72f63, c15822x6dfd348.f36872x5a72f63);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36873x2efe91;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f36875x368f3a);
            fVar.e(3, this.f36874x6833e92);
            java.lang.String str2 = this.f36871x58b82fc;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43 = this.f36872x5a72f63;
            if (c15748x3e43f43 != null) {
                fVar.i(5, c15748x3e43f43.mo75928xcd1e8d8());
                this.f36872x5a72f63.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f36873x2efe91;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f36875x368f3a) + b36.f.e(3, this.f36874x6833e92);
            java.lang.String str4 = this.f36871x58b82fc;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f432 = this.f36872x5a72f63;
            return c15748x3e43f432 != null ? j17 + b36.f.i(5, c15748x3e43f432.mo75928xcd1e8d8()) : j17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15822x6dfd348 c15822x6dfd348 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15822x6dfd348) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15822x6dfd348.f36873x2efe91 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            c15822x6dfd348.f36875x368f3a = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            c15822x6dfd348.f36874x6833e92 = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            c15822x6dfd348.f36871x58b82fc = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f433 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43();
            if (bArr != null && bArr.length > 0) {
                c15748x3e43f433.mo11468x92b714fd(bArr);
            }
            c15822x6dfd348.f36872x5a72f63 = c15748x3e43f433;
        }
        return 0;
    }

    /* renamed from: setAppid */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15822x6dfd348 m64324x52b743ba(java.lang.String str) {
        this.f36871x58b82fc = str;
        return this;
    }

    /* renamed from: setColor */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15822x6dfd348 m64325x52d2f021(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43) {
        this.f36872x5a72f63 = c15748x3e43f43;
        return this;
    }

    /* renamed from: setDesc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15822x6dfd348 m64326x76492e13(java.lang.String str) {
        this.f36873x2efe91 = str;
        return this;
    }

    /* renamed from: setScore */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15822x6dfd348 m64327x53aeff50(int i17) {
        this.f36874x6833e92 = i17;
        return this;
    }

    /* renamed from: setType */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15822x6dfd348 m64328x7650bebc(int i17) {
        this.f36875x368f3a = i17;
        return this;
    }
}

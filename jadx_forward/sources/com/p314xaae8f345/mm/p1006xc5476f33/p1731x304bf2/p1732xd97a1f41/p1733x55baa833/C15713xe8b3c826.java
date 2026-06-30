package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage */
/* loaded from: classes4.dex */
public class C15713xe8b3c826 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 f36463x5a72f63;

    /* renamed from: disappear_second */
    public int f36464x8c9fc490;

    /* renamed from: type */
    public int f36465x368f3a;

    /* renamed from: username_list */
    public java.util.LinkedList<java.lang.String> f36466x4725f667 = new java.util.LinkedList<>();

    /* renamed from: wording */
    public java.lang.String f36467x5ae4fc98;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15713xe8b3c826 m63791xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15713xe8b3c826();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15713xe8b3c826)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15713xe8b3c826 c15713xe8b3c826 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15713xe8b3c826) fVar;
        return n51.f.a(this.f36467x5ae4fc98, c15713xe8b3c826.f36467x5ae4fc98) && n51.f.a(this.f36466x4725f667, c15713xe8b3c826.f36466x4725f667) && n51.f.a(java.lang.Integer.valueOf(this.f36465x368f3a), java.lang.Integer.valueOf(c15713xe8b3c826.f36465x368f3a)) && n51.f.a(this.f36463x5a72f63, c15713xe8b3c826.f36463x5a72f63) && n51.f.a(java.lang.Integer.valueOf(this.f36464x8c9fc490), java.lang.Integer.valueOf(c15713xe8b3c826.f36464x8c9fc490));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36467x5ae4fc98;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, this.f36466x4725f667);
            fVar.e(3, this.f36465x368f3a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43 = this.f36463x5a72f63;
            if (c15748x3e43f43 != null) {
                fVar.i(4, c15748x3e43f43.mo75928xcd1e8d8());
                this.f36463x5a72f63.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f36464x8c9fc490);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f36467x5ae4fc98;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 1, this.f36466x4725f667) + b36.f.e(3, this.f36465x368f3a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f432 = this.f36463x5a72f63;
            if (c15748x3e43f432 != null) {
                j17 += b36.f.i(4, c15748x3e43f432.mo75928xcd1e8d8());
            }
            return j17 + b36.f.e(5, this.f36464x8c9fc490);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f36466x4725f667.clear();
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15713xe8b3c826 c15713xe8b3c826 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15713xe8b3c826) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15713xe8b3c826.f36467x5ae4fc98 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            c15713xe8b3c826.f36466x4725f667.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            c15713xe8b3c826.f36465x368f3a = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            c15713xe8b3c826.f36464x8c9fc490 = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f433 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43();
            if (bArr2 != null && bArr2.length > 0) {
                c15748x3e43f433.mo11468x92b714fd(bArr2);
            }
            c15713xe8b3c826.f36463x5a72f63 = c15748x3e43f433;
        }
        return 0;
    }

    /* renamed from: setColor */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15713xe8b3c826 m63792x52d2f021(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43) {
        this.f36463x5a72f63 = c15748x3e43f43;
        return this;
    }

    /* renamed from: setDisappear_second */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15713xe8b3c826 m63793xd874c112(int i17) {
        this.f36464x8c9fc490 = i17;
        return this;
    }

    /* renamed from: setType */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15713xe8b3c826 m63794x7650bebc(int i17) {
        this.f36465x368f3a = i17;
        return this;
    }

    /* renamed from: setUsername_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15713xe8b3c826 m63795x975c1925(java.util.LinkedList<java.lang.String> linkedList) {
        this.f36466x4725f667 = linkedList;
        return this;
    }

    /* renamed from: setWording */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15713xe8b3c826 m63796xc2385d6(java.lang.String str) {
        this.f36467x5ae4fc98 = str;
        return this;
    }
}

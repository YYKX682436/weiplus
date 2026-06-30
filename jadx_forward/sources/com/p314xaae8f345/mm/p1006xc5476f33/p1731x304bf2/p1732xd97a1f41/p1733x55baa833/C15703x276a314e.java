package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.Background */
/* loaded from: classes4.dex */
public class C15703x276a314e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: img_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15708xdab31aec f36447xd691e7aa;

    /* renamed from: pag_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15709x3884923f f36448x32ef5ab7;

    /* renamed from: type */
    public int f36449x368f3a;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15703x276a314e m63764xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15703x276a314e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15703x276a314e)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15703x276a314e c15703x276a314e = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15703x276a314e) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f36449x368f3a), java.lang.Integer.valueOf(c15703x276a314e.f36449x368f3a)) && n51.f.a(this.f36448x32ef5ab7, c15703x276a314e.f36448x32ef5ab7) && n51.f.a(this.f36447xd691e7aa, c15703x276a314e.f36447xd691e7aa);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f36449x368f3a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15709x3884923f c15709x3884923f = this.f36448x32ef5ab7;
            if (c15709x3884923f != null) {
                fVar.i(2, c15709x3884923f.mo75928xcd1e8d8());
                this.f36448x32ef5ab7.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15708xdab31aec c15708xdab31aec = this.f36447xd691e7aa;
            if (c15708xdab31aec != null) {
                fVar.i(3, c15708xdab31aec.mo75928xcd1e8d8());
                this.f36447xd691e7aa.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f36449x368f3a) + 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15709x3884923f c15709x3884923f2 = this.f36448x32ef5ab7;
            if (c15709x3884923f2 != null) {
                e17 += b36.f.i(2, c15709x3884923f2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15708xdab31aec c15708xdab31aec2 = this.f36447xd691e7aa;
            return c15708xdab31aec2 != null ? e17 + b36.f.i(3, c15708xdab31aec2.mo75928xcd1e8d8()) : e17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15703x276a314e c15703x276a314e = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15703x276a314e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15703x276a314e.f36449x368f3a = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15709x3884923f c15709x3884923f3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15709x3884923f();
                if (bArr != null && bArr.length > 0) {
                    c15709x3884923f3.mo11468x92b714fd(bArr);
                }
                c15703x276a314e.f36448x32ef5ab7 = c15709x3884923f3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15708xdab31aec c15708xdab31aec3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15708xdab31aec();
            if (bArr2 != null && bArr2.length > 0) {
                c15708xdab31aec3.mo11468x92b714fd(bArr2);
            }
            c15703x276a314e.f36447xd691e7aa = c15708xdab31aec3;
        }
        return 0;
    }

    /* renamed from: setImg_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15703x276a314e m63765x4d24862c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15708xdab31aec c15708xdab31aec) {
        this.f36447xd691e7aa = c15708xdab31aec;
        return this;
    }

    /* renamed from: setPag_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15703x276a314e m63766xa981f939(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15709x3884923f c15709x3884923f) {
        this.f36448x32ef5ab7 = c15709x3884923f;
        return this;
    }

    /* renamed from: setType */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15703x276a314e m63767x7650bebc(int i17) {
        this.f36449x368f3a = i17;
        return this;
    }
}

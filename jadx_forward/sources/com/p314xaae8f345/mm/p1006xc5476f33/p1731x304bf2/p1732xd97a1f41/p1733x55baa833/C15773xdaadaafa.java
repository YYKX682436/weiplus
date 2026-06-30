package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest */
/* loaded from: classes4.dex */
public class C15773xdaadaafa extends r45.mr5 {

    /* renamed from: chatroom_name_list */
    public java.util.LinkedList<java.lang.String> f36721xa4e10cc6 = new java.util.LinkedList<>();

    /* renamed from: first_chatroom_name */
    public java.lang.String f36722x93c1e3c8;

    /* renamed from: scene_type */
    public int f36723x7c03a70d;

    /* renamed from: version */
    public java.lang.String f36724x14f51cd8;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa m64118xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa c15773xdaadaafa = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa) fVar;
        return n51.f.a(this.f76494x2de60e5e, c15773xdaadaafa.f76494x2de60e5e) && n51.f.a(this.f36724x14f51cd8, c15773xdaadaafa.f36724x14f51cd8) && n51.f.a(this.f36721xa4e10cc6, c15773xdaadaafa.f36721xa4e10cc6) && n51.f.a(this.f36722x93c1e3c8, c15773xdaadaafa.f36722x93c1e3c8) && n51.f.a(java.lang.Integer.valueOf(this.f36723x7c03a70d), java.lang.Integer.valueOf(c15773xdaadaafa.f36723x7c03a70d));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f36724x14f51cd8;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f36721xa4e10cc6);
            java.lang.String str2 = this.f36722x93c1e3c8;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f36723x7c03a70d);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f36724x14f51cd8;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int g17 = i18 + b36.f.g(3, 1, this.f36721xa4e10cc6);
            java.lang.String str4 = this.f36722x93c1e3c8;
            if (str4 != null) {
                g17 += b36.f.j(4, str4);
            }
            return g17 + b36.f.e(5, this.f36723x7c03a70d);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f36721xa4e10cc6.clear();
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa c15773xdaadaafa = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                c15773xdaadaafa.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            c15773xdaadaafa.f36724x14f51cd8 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            c15773xdaadaafa.f36721xa4e10cc6.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 4) {
            c15773xdaadaafa.f36722x93c1e3c8 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        c15773xdaadaafa.f36723x7c03a70d = aVar2.g(intValue);
        return 0;
    }

    /* renamed from: setChatroom_name_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa m64119x4f68f0c8(java.util.LinkedList<java.lang.String> linkedList) {
        this.f36721xa4e10cc6 = linkedList;
        return this;
    }

    /* renamed from: setFirst_chatroom_name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa m64120x3a368006(java.lang.String str) {
        this.f36722x93c1e3c8 = str;
        return this;
    }

    /* renamed from: setScene_type */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa m64121x9868ad0f(int i17) {
        this.f36723x7c03a70d = i17;
        return this;
    }

    /* renamed from: setVersion */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa m64122xc633a616(java.lang.String str) {
        this.f36724x14f51cd8 = str;
        return this;
    }
}

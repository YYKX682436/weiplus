package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse */
/* loaded from: classes4.dex */
public class C15774x7e2f6936 extends r45.js5 {

    /* renamed from: my_chatroom_info_list */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d> f36725xcf9821f6 = new java.util.LinkedList<>();

    /* renamed from: my_chatroom_notice */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15794xe442b9d7 f36726x75467d1;

    /* renamed from: next_version */
    public java.lang.String f36727x5f83ab8c;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15774x7e2f6936 m64123xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15774x7e2f6936();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15774x7e2f6936)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15774x7e2f6936 c15774x7e2f6936 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15774x7e2f6936) fVar;
        return n51.f.a(this.f76492x92037252, c15774x7e2f6936.f76492x92037252) && n51.f.a(this.f36727x5f83ab8c, c15774x7e2f6936.f36727x5f83ab8c) && n51.f.a(this.f36725xcf9821f6, c15774x7e2f6936.f36725xcf9821f6) && n51.f.a(this.f36726x75467d1, c15774x7e2f6936.f36726x75467d1);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f36727x5f83ab8c;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f36725xcf9821f6);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15794xe442b9d7 c15794xe442b9d7 = this.f36726x75467d1;
            if (c15794xe442b9d7 != null) {
                fVar.i(4, c15794xe442b9d7.mo75928xcd1e8d8());
                this.f36726x75467d1.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f36727x5f83ab8c;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int g17 = i18 + b36.f.g(3, 8, this.f36725xcf9821f6);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15794xe442b9d7 c15794xe442b9d72 = this.f36726x75467d1;
            return c15794xe442b9d72 != null ? g17 + b36.f.i(4, c15794xe442b9d72.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f36725xcf9821f6.clear();
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15774x7e2f6936 c15774x7e2f6936 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15774x7e2f6936) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                c15774x7e2f6936.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            c15774x7e2f6936.f36727x5f83ab8c = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d c15793xe0873b6d = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d();
                if (bArr3 != null && bArr3.length > 0) {
                    c15793xe0873b6d.mo11468x92b714fd(bArr3);
                }
                c15774x7e2f6936.f36725xcf9821f6.add(c15793xe0873b6d);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15794xe442b9d7 c15794xe442b9d73 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15794xe442b9d7();
            if (bArr4 != null && bArr4.length > 0) {
                c15794xe442b9d73.mo11468x92b714fd(bArr4);
            }
            c15774x7e2f6936.f36726x75467d1 = c15794xe442b9d73;
        }
        return 0;
    }

    /* renamed from: setMy_chatroom_info_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15774x7e2f6936 m64124xab56a6b4(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d> linkedList) {
        this.f36725xcf9821f6 = linkedList;
        return this;
    }

    /* renamed from: setMy_chatroom_notice */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15774x7e2f6936 m64125xb1dc4bd3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15794xe442b9d7 c15794xe442b9d7) {
        this.f36726x75467d1 = c15794xe442b9d7;
        return this;
    }

    /* renamed from: setNext_version */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15774x7e2f6936 m64126xf6bf390e(java.lang.String str) {
        this.f36727x5f83ab8c = str;
        return this;
    }
}

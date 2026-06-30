package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel */
/* loaded from: classes2.dex */
public class C15739x67e9c971 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: panel_icon */
    public java.lang.String f36595x4d5d8dd4;

    /* renamed from: panel_list */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4> f36596x4d5f01f9 = new java.util.LinkedList<>();

    /* renamed from: panel_text */
    public java.lang.String f36597x4d629688;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15739x67e9c971 m63956xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15739x67e9c971();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15739x67e9c971)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15739x67e9c971 c15739x67e9c971 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15739x67e9c971) fVar;
        return n51.f.a(this.f36596x4d5f01f9, c15739x67e9c971.f36596x4d5f01f9) && n51.f.a(this.f36595x4d5d8dd4, c15739x67e9c971.f36595x4d5d8dd4) && n51.f.a(this.f36597x4d629688, c15739x67e9c971.f36597x4d629688);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f36596x4d5f01f9);
            java.lang.String str = this.f36595x4d5d8dd4;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f36597x4d629688;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f36596x4d5f01f9) + 0;
            java.lang.String str3 = this.f36595x4d5d8dd4;
            if (str3 != null) {
                g17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f36597x4d629688;
            return str4 != null ? g17 + b36.f.j(3, str4) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f36596x4d5f01f9.clear();
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15739x67e9c971 c15739x67e9c971 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15739x67e9c971) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                c15739x67e9c971.f36595x4d5d8dd4 = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            c15739x67e9c971.f36597x4d629688 = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4 c15799x49519e4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4();
            if (bArr2 != null && bArr2.length > 0) {
                c15799x49519e4.mo11468x92b714fd(bArr2);
            }
            c15739x67e9c971.f36596x4d5f01f9.add(c15799x49519e4);
        }
        return 0;
    }

    /* renamed from: setPanel_icon */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15739x67e9c971 m63957x69c293d6(java.lang.String str) {
        this.f36595x4d5d8dd4 = str;
        return this;
    }

    /* renamed from: setPanel_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15739x67e9c971 m63958x69c407fb(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4> linkedList) {
        this.f36596x4d5f01f9 = linkedList;
        return this;
    }

    /* renamed from: setPanel_text */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15739x67e9c971 m63959x69c79c8a(java.lang.String str) {
        this.f36597x4d629688 = str;
        return this;
    }
}

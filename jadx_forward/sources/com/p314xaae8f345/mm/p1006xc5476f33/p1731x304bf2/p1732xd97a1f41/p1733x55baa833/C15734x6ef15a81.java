package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard */
/* loaded from: classes4.dex */
public class C15734x6ef15a81 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: bg_pic_url */
    public java.lang.String f36583x95bc6f40;

    /* renamed from: jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f36584x28d1961f;

    /* renamed from: pic_url */
    public java.lang.String f36585xdd86d13a;

    /* renamed from: sheet_row_list */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15816xdda8581b> f36586xdc7136c3 = new java.util.LinkedList<>();

    /* renamed from: title */
    public java.lang.String f36587x6942258;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15734x6ef15a81 m63939xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15734x6ef15a81();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15734x6ef15a81)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15734x6ef15a81 c15734x6ef15a81 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15734x6ef15a81) fVar;
        return n51.f.a(this.f36587x6942258, c15734x6ef15a81.f36587x6942258) && n51.f.a(this.f36585xdd86d13a, c15734x6ef15a81.f36585xdd86d13a) && n51.f.a(this.f36584x28d1961f, c15734x6ef15a81.f36584x28d1961f) && n51.f.a(this.f36586xdc7136c3, c15734x6ef15a81.f36586xdc7136c3) && n51.f.a(this.f36583x95bc6f40, c15734x6ef15a81.f36583x95bc6f40);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36587x6942258;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f36585xdd86d13a;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = this.f36584x28d1961f;
            if (c15780xf49d6a1c != null) {
                fVar.i(3, c15780xf49d6a1c.mo75928xcd1e8d8());
                this.f36584x28d1961f.mo75956x3d5d1f78(fVar);
            }
            fVar.g(4, 8, this.f36586xdc7136c3);
            java.lang.String str3 = this.f36583x95bc6f40;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f36587x6942258;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f36585xdd86d13a;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c2 = this.f36584x28d1961f;
            if (c15780xf49d6a1c2 != null) {
                j17 += b36.f.i(3, c15780xf49d6a1c2.mo75928xcd1e8d8());
            }
            int g17 = j17 + b36.f.g(4, 8, this.f36586xdc7136c3);
            java.lang.String str6 = this.f36583x95bc6f40;
            return str6 != null ? g17 + b36.f.j(5, str6) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f36586xdc7136c3.clear();
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15734x6ef15a81 c15734x6ef15a81 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15734x6ef15a81) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15734x6ef15a81.f36587x6942258 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            c15734x6ef15a81.f36585xdd86d13a = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
                if (bArr2 != null && bArr2.length > 0) {
                    c15780xf49d6a1c3.mo11468x92b714fd(bArr2);
                }
                c15734x6ef15a81.f36584x28d1961f = c15780xf49d6a1c3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            c15734x6ef15a81.f36583x95bc6f40 = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15816xdda8581b c15816xdda8581b = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15816xdda8581b();
            if (bArr3 != null && bArr3.length > 0) {
                c15816xdda8581b.mo11468x92b714fd(bArr3);
            }
            c15734x6ef15a81.f36586xdc7136c3.add(c15816xdda8581b);
        }
        return 0;
    }

    /* renamed from: setBg_pic_url */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15734x6ef15a81 m63940xb2217542(java.lang.String str) {
        this.f36583x95bc6f40 = str;
        return this;
    }

    /* renamed from: setJump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15734x6ef15a81 m63941x8492c7dd(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        this.f36584x28d1961f = c15780xf49d6a1c;
        return this;
    }

    /* renamed from: setPic_url */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15734x6ef15a81 m63942x8ec55a78(java.lang.String str) {
        this.f36585xdd86d13a = str;
        return this;
    }

    /* renamed from: setSheet_row_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15734x6ef15a81 m63943x92ff6bc5(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15816xdda8581b> linkedList) {
        this.f36586xdc7136c3 = linkedList;
        return this;
    }

    /* renamed from: setTitle */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15734x6ef15a81 m63944x53bfe316(java.lang.String str) {
        this.f36587x6942258 = str;
        return this;
    }
}

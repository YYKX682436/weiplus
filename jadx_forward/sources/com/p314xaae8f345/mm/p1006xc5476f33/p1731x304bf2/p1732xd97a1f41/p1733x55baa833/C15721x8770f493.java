package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo */
/* loaded from: classes4.dex */
public class C15721x8770f493 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: background_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15704x1957b31c f36504x4e3fd51f;

    /* renamed from: buttom_desc */
    public java.lang.String f36505x956566df;

    /* renamed from: content_list */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15749x39c3d7b4> f36506x319118a4 = new java.util.LinkedList<>();

    /* renamed from: report_str */
    public java.lang.String f36507x732388a6;

    /* renamed from: title */
    public java.lang.String f36508x6942258;

    /* renamed from: user_enter_option */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15833x330ab082 f36509x983fdbb0;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15721x8770f493 m63841xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15721x8770f493();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15721x8770f493)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15721x8770f493 c15721x8770f493 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15721x8770f493) fVar;
        return n51.f.a(this.f36508x6942258, c15721x8770f493.f36508x6942258) && n51.f.a(this.f36506x319118a4, c15721x8770f493.f36506x319118a4) && n51.f.a(this.f36509x983fdbb0, c15721x8770f493.f36509x983fdbb0) && n51.f.a(this.f36505x956566df, c15721x8770f493.f36505x956566df) && n51.f.a(this.f36504x4e3fd51f, c15721x8770f493.f36504x4e3fd51f) && n51.f.a(this.f36507x732388a6, c15721x8770f493.f36507x732388a6);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36508x6942258;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f36506x319118a4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15833x330ab082 c15833x330ab082 = this.f36509x983fdbb0;
            if (c15833x330ab082 != null) {
                fVar.i(3, c15833x330ab082.mo75928xcd1e8d8());
                this.f36509x983fdbb0.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f36505x956566df;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15704x1957b31c c15704x1957b31c = this.f36504x4e3fd51f;
            if (c15704x1957b31c != null) {
                fVar.i(5, c15704x1957b31c.mo75928xcd1e8d8());
                this.f36504x4e3fd51f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f36507x732388a6;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f36508x6942258;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.g(2, 8, this.f36506x319118a4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15833x330ab082 c15833x330ab0822 = this.f36509x983fdbb0;
            if (c15833x330ab0822 != null) {
                j17 += b36.f.i(3, c15833x330ab0822.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f36505x956566df;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15704x1957b31c c15704x1957b31c2 = this.f36504x4e3fd51f;
            if (c15704x1957b31c2 != null) {
                j17 += b36.f.i(5, c15704x1957b31c2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f36507x732388a6;
            return str6 != null ? j17 + b36.f.j(6, str6) : j17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f36506x319118a4.clear();
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15721x8770f493 c15721x8770f493 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15721x8770f493) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c15721x8770f493.f36508x6942258 = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15749x39c3d7b4 c15749x39c3d7b4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15749x39c3d7b4();
                    if (bArr2 != null && bArr2.length > 0) {
                        c15749x39c3d7b4.mo11468x92b714fd(bArr2);
                    }
                    c15721x8770f493.f36506x319118a4.add(c15749x39c3d7b4);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15833x330ab082 c15833x330ab0823 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15833x330ab082();
                    if (bArr3 != null && bArr3.length > 0) {
                        c15833x330ab0823.mo11468x92b714fd(bArr3);
                    }
                    c15721x8770f493.f36509x983fdbb0 = c15833x330ab0823;
                }
                return 0;
            case 4:
                c15721x8770f493.f36505x956566df = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15704x1957b31c c15704x1957b31c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15704x1957b31c();
                    if (bArr4 != null && bArr4.length > 0) {
                        c15704x1957b31c3.mo11468x92b714fd(bArr4);
                    }
                    c15721x8770f493.f36504x4e3fd51f = c15704x1957b31c3;
                }
                return 0;
            case 6:
                c15721x8770f493.f36507x732388a6 = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setBackground_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15721x8770f493 m63842x6978405d(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15704x1957b31c c15704x1957b31c) {
        this.f36504x4e3fd51f = c15704x1957b31c;
        return this;
    }

    /* renamed from: setButtom_desc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15721x8770f493 m63843x5a1211d(java.lang.String str) {
        this.f36505x956566df = str;
        return this;
    }

    /* renamed from: setContent_list */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15721x8770f493 m63844xc8cca626(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15749x39c3d7b4> linkedList) {
        this.f36506x319118a4 = linkedList;
        return this;
    }

    /* renamed from: setReport_str */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15721x8770f493 m63845x8f888ea8(java.lang.String str) {
        this.f36507x732388a6 = str;
        return this;
    }

    /* renamed from: setTitle */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15721x8770f493 m63846x53bfe316(java.lang.String str) {
        this.f36508x6942258 = str;
        return this;
    }

    /* renamed from: setUser_enter_option */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15721x8770f493 m63847xc70a6f6e(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15833x330ab082 c15833x330ab082) {
        this.f36509x983fdbb0 = c15833x330ab082;
        return this;
    }
}

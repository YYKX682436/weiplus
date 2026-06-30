package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp */
/* loaded from: classes4.dex */
public class C15725x912acd13 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: bg_pic_url */
    public java.lang.String f36515x95bc6f40;

    /* renamed from: button_bg_color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 f36516x70ef9956;

    /* renamed from: button_des */
    public java.lang.String f36517x1563f185;
    public java.lang.String des;

    /* renamed from: jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f36518x28d1961f;

    /* renamed from: second_des */
    public java.lang.String f36519x19489dc7;

    /* renamed from: title */
    public java.lang.String f36520x6942258;

    /* renamed from: type */
    public int f36521x368f3a;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13 m63856xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13 c15725x912acd13 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13) fVar;
        return n51.f.a(this.f36520x6942258, c15725x912acd13.f36520x6942258) && n51.f.a(this.des, c15725x912acd13.des) && n51.f.a(this.f36517x1563f185, c15725x912acd13.f36517x1563f185) && n51.f.a(this.f36515x95bc6f40, c15725x912acd13.f36515x95bc6f40) && n51.f.a(java.lang.Integer.valueOf(this.f36521x368f3a), java.lang.Integer.valueOf(c15725x912acd13.f36521x368f3a)) && n51.f.a(this.f36519x19489dc7, c15725x912acd13.f36519x19489dc7) && n51.f.a(this.f36516x70ef9956, c15725x912acd13.f36516x70ef9956) && n51.f.a(this.f36518x28d1961f, c15725x912acd13.f36518x28d1961f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36520x6942258;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.des;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f36517x1563f185;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f36515x95bc6f40;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f36521x368f3a);
            java.lang.String str5 = this.f36519x19489dc7;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43 = this.f36516x70ef9956;
            if (c15748x3e43f43 != null) {
                fVar.i(8, c15748x3e43f43.mo75928xcd1e8d8());
                this.f36516x70ef9956.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = this.f36518x28d1961f;
            if (c15780xf49d6a1c != null) {
                fVar.i(7, c15780xf49d6a1c.mo75928xcd1e8d8());
                this.f36518x28d1961f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f36520x6942258;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.des;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f36517x1563f185;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f36515x95bc6f40;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f36521x368f3a);
            java.lang.String str10 = this.f36519x19489dc7;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f432 = this.f36516x70ef9956;
            if (c15748x3e43f432 != null) {
                e17 += b36.f.i(8, c15748x3e43f432.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c2 = this.f36518x28d1961f;
            return c15780xf49d6a1c2 != null ? e17 + b36.f.i(7, c15780xf49d6a1c2.mo75928xcd1e8d8()) : e17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13 c15725x912acd13 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c15725x912acd13.f36520x6942258 = aVar2.k(intValue);
                return 0;
            case 2:
                c15725x912acd13.des = aVar2.k(intValue);
                return 0;
            case 3:
                c15725x912acd13.f36517x1563f185 = aVar2.k(intValue);
                return 0;
            case 4:
                c15725x912acd13.f36515x95bc6f40 = aVar2.k(intValue);
                return 0;
            case 5:
                c15725x912acd13.f36521x368f3a = aVar2.g(intValue);
                return 0;
            case 6:
                c15725x912acd13.f36519x19489dc7 = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
                    if (bArr != null && bArr.length > 0) {
                        c15780xf49d6a1c3.mo11468x92b714fd(bArr);
                    }
                    c15725x912acd13.f36518x28d1961f = c15780xf49d6a1c3;
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f433 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43();
                    if (bArr2 != null && bArr2.length > 0) {
                        c15748x3e43f433.mo11468x92b714fd(bArr2);
                    }
                    c15725x912acd13.f36516x70ef9956 = c15748x3e43f433;
                }
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setBg_pic_url */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13 m63857xb2217542(java.lang.String str) {
        this.f36515x95bc6f40 = str;
        return this;
    }

    /* renamed from: setButton_bg_color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13 m63858x8c280494(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43) {
        this.f36516x70ef9956 = c15748x3e43f43;
        return this;
    }

    /* renamed from: setButton_des */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13 m63859x31c8f787(java.lang.String str) {
        this.f36517x1563f185 = str;
        return this;
    }

    /* renamed from: setDes */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13 m63860xca025c50(java.lang.String str) {
        this.des = str;
        return this;
    }

    /* renamed from: setJump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13 m63861x8492c7dd(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        this.f36518x28d1961f = c15780xf49d6a1c;
        return this;
    }

    /* renamed from: setSecond_des */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13 m63862x35ada3c9(java.lang.String str) {
        this.f36519x19489dc7 = str;
        return this;
    }

    /* renamed from: setTitle */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13 m63863x53bfe316(java.lang.String str) {
        this.f36520x6942258 = str;
        return this;
    }

    /* renamed from: setType */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13 m63864x7650bebc(int i17) {
        this.f36521x368f3a = i17;
        return this;
    }
}

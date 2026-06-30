package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.UserRole */
/* loaded from: classes4.dex */
public class C15834xf3f76701 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: background_color */
    public java.lang.String f36900x7966cd12;

    /* renamed from: bg_color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 f36901xb49896e9;

    /* renamed from: color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 f36902x5a72f63;

    /* renamed from: desc */
    public java.lang.String f36903x2efe91;

    /* renamed from: role */
    public int f36904x358076;

    /* renamed from: role_icon */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15811xf3f16a2f f36905x14024ea2;

    /* renamed from: word_color */
    public java.lang.String f36906x6bc869ee;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701 m64364xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701 c15834xf3f76701 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f36904x358076), java.lang.Integer.valueOf(c15834xf3f76701.f36904x358076)) && n51.f.a(this.f36900x7966cd12, c15834xf3f76701.f36900x7966cd12) && n51.f.a(this.f36906x6bc869ee, c15834xf3f76701.f36906x6bc869ee) && n51.f.a(this.f36903x2efe91, c15834xf3f76701.f36903x2efe91) && n51.f.a(this.f36902x5a72f63, c15834xf3f76701.f36902x5a72f63) && n51.f.a(this.f36901xb49896e9, c15834xf3f76701.f36901xb49896e9) && n51.f.a(this.f36905x14024ea2, c15834xf3f76701.f36905x14024ea2);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f36904x358076);
            java.lang.String str = this.f36900x7966cd12;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f36906x6bc869ee;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f36903x2efe91;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43 = this.f36902x5a72f63;
            if (c15748x3e43f43 != null) {
                fVar.i(5, c15748x3e43f43.mo75928xcd1e8d8());
                this.f36902x5a72f63.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f432 = this.f36901xb49896e9;
            if (c15748x3e43f432 != null) {
                fVar.i(6, c15748x3e43f432.mo75928xcd1e8d8());
                this.f36901xb49896e9.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15811xf3f16a2f c15811xf3f16a2f = this.f36905x14024ea2;
            if (c15811xf3f16a2f != null) {
                fVar.i(7, c15811xf3f16a2f.mo75928xcd1e8d8());
                this.f36905x14024ea2.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f36904x358076) + 0;
            java.lang.String str4 = this.f36900x7966cd12;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f36906x6bc869ee;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f36903x2efe91;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f433 = this.f36902x5a72f63;
            if (c15748x3e43f433 != null) {
                e17 += b36.f.i(5, c15748x3e43f433.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f434 = this.f36901xb49896e9;
            if (c15748x3e43f434 != null) {
                e17 += b36.f.i(6, c15748x3e43f434.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15811xf3f16a2f c15811xf3f16a2f2 = this.f36905x14024ea2;
            return c15811xf3f16a2f2 != null ? e17 + b36.f.i(7, c15811xf3f16a2f2.mo75928xcd1e8d8()) : e17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701 c15834xf3f76701 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c15834xf3f76701.f36904x358076 = aVar2.g(intValue);
                return 0;
            case 2:
                c15834xf3f76701.f36900x7966cd12 = aVar2.k(intValue);
                return 0;
            case 3:
                c15834xf3f76701.f36906x6bc869ee = aVar2.k(intValue);
                return 0;
            case 4:
                c15834xf3f76701.f36903x2efe91 = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f435 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43();
                    if (bArr != null && bArr.length > 0) {
                        c15748x3e43f435.mo11468x92b714fd(bArr);
                    }
                    c15834xf3f76701.f36902x5a72f63 = c15748x3e43f435;
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f436 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43();
                    if (bArr2 != null && bArr2.length > 0) {
                        c15748x3e43f436.mo11468x92b714fd(bArr2);
                    }
                    c15834xf3f76701.f36901xb49896e9 = c15748x3e43f436;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15811xf3f16a2f c15811xf3f16a2f3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15811xf3f16a2f();
                    if (bArr3 != null && bArr3.length > 0) {
                        c15811xf3f16a2f3.mo11468x92b714fd(bArr3);
                    }
                    c15834xf3f76701.f36905x14024ea2 = c15811xf3f16a2f3;
                }
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setBackground_color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701 m64365xc53bc994(java.lang.String str) {
        this.f36900x7966cd12 = str;
        return this;
    }

    /* renamed from: setBg_color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701 m64366x2b2b356b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43) {
        this.f36901xb49896e9 = c15748x3e43f43;
        return this;
    }

    /* renamed from: setColor */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701 m64367x52d2f021(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43) {
        this.f36902x5a72f63 = c15748x3e43f43;
        return this;
    }

    /* renamed from: setDesc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701 m64368x76492e13(java.lang.String str) {
        this.f36903x2efe91 = str;
        return this;
    }

    /* renamed from: setRole */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701 m64369x764faff8(int i17) {
        this.f36904x358076 = i17;
        return this;
    }

    /* renamed from: setRole_icon */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701 m64370x6fc38060(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15811xf3f16a2f c15811xf3f16a2f) {
        this.f36905x14024ea2 = c15811xf3f16a2f;
        return this;
    }

    /* renamed from: setWord_color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15834xf3f76701 m64371x882d6ff0(java.lang.String str) {
        this.f36906x6bc869ee = str;
        return this;
    }
}

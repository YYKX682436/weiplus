package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule */
/* loaded from: classes4.dex */
public class C15809xc54f5bf8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: can_pass */
    public boolean f36846xf874ff20;

    /* renamed from: color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 f36847x5a72f63;

    /* renamed from: rule_desc */
    public java.lang.String f36848x83471df4;

    /* renamed from: show_icon */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15817xefa32936 f36849x8e88707b;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15809xc54f5bf8 m64284xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15809xc54f5bf8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15809xc54f5bf8)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15809xc54f5bf8 c15809xc54f5bf8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15809xc54f5bf8) fVar;
        return n51.f.a(this.f36848x83471df4, c15809xc54f5bf8.f36848x83471df4) && n51.f.a(java.lang.Boolean.valueOf(this.f36846xf874ff20), java.lang.Boolean.valueOf(c15809xc54f5bf8.f36846xf874ff20)) && n51.f.a(this.f36847x5a72f63, c15809xc54f5bf8.f36847x5a72f63) && n51.f.a(this.f36849x8e88707b, c15809xc54f5bf8.f36849x8e88707b);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36848x83471df4;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f36846xf874ff20);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43 = this.f36847x5a72f63;
            if (c15748x3e43f43 != null) {
                fVar.i(3, c15748x3e43f43.mo75928xcd1e8d8());
                this.f36847x5a72f63.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15817xefa32936 c15817xefa32936 = this.f36849x8e88707b;
            if (c15817xefa32936 != null) {
                fVar.i(4, c15817xefa32936.mo75928xcd1e8d8());
                this.f36849x8e88707b.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f36848x83471df4;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.a(2, this.f36846xf874ff20);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f432 = this.f36847x5a72f63;
            if (c15748x3e43f432 != null) {
                j17 += b36.f.i(3, c15748x3e43f432.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15817xefa32936 c15817xefa329362 = this.f36849x8e88707b;
            return c15817xefa329362 != null ? j17 + b36.f.i(4, c15817xefa329362.mo75928xcd1e8d8()) : j17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15809xc54f5bf8 c15809xc54f5bf8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15809xc54f5bf8) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15809xc54f5bf8.f36848x83471df4 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            c15809xc54f5bf8.f36846xf874ff20 = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f433 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43();
                if (bArr != null && bArr.length > 0) {
                    c15748x3e43f433.mo11468x92b714fd(bArr);
                }
                c15809xc54f5bf8.f36847x5a72f63 = c15748x3e43f433;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15817xefa32936 c15817xefa329363 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15817xefa32936();
            if (bArr2 != null && bArr2.length > 0) {
                c15817xefa329363.mo11468x92b714fd(bArr2);
            }
            c15809xc54f5bf8.f36849x8e88707b = c15817xefa329363;
        }
        return 0;
    }

    /* renamed from: setCan_pass */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15809xc54f5bf8 m64285x6f079da2(boolean z17) {
        this.f36846xf874ff20 = z17;
        return this;
    }

    /* renamed from: setColor */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15809xc54f5bf8 m64286x52d2f021(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43) {
        this.f36847x5a72f63 = c15748x3e43f43;
        return this;
    }

    /* renamed from: setRule_desc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15809xc54f5bf8 m64287xdf084fb2(java.lang.String str) {
        this.f36848x83471df4 = str;
        return this;
    }

    /* renamed from: setShow_icon */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15809xc54f5bf8 m64288xea49a239(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15817xefa32936 c15817xefa32936) {
        this.f36849x8e88707b = c15817xefa32936;
        return this;
    }
}

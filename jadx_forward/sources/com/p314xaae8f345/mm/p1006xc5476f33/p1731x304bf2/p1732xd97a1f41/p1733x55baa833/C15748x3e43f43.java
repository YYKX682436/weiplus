package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.Color */
/* loaded from: classes4.dex */
public class C15748x3e43f43 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: dark_color */
    public java.lang.String f36646xa0e2915a;

    /* renamed from: h5_dark_color */
    public java.lang.String f36647x5ec2c80c;

    /* renamed from: h5_light_color */
    public java.lang.String f36648x7bdabe88;

    /* renamed from: light_color */
    public java.lang.String f36649x7db41efa;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 m64018xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43) fVar;
        return n51.f.a(this.f36649x7db41efa, c15748x3e43f43.f36649x7db41efa) && n51.f.a(this.f36646xa0e2915a, c15748x3e43f43.f36646xa0e2915a) && n51.f.a(this.f36648x7bdabe88, c15748x3e43f43.f36648x7bdabe88) && n51.f.a(this.f36647x5ec2c80c, c15748x3e43f43.f36647x5ec2c80c);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36649x7db41efa;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f36646xa0e2915a;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f36648x7bdabe88;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f36647x5ec2c80c;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f36649x7db41efa;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f36646xa0e2915a;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f36648x7bdabe88;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f36647x5ec2c80c;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15748x3e43f43.f36649x7db41efa = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            c15748x3e43f43.f36646xa0e2915a = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            c15748x3e43f43.f36648x7bdabe88 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        c15748x3e43f43.f36647x5ec2c80c = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setDark_color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 m64019xbd47975c(java.lang.String str) {
        this.f36646xa0e2915a = str;
        return this;
    }

    /* renamed from: setH5_dark_color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 m64020xaef8eaca(java.lang.String str) {
        this.f36647x5ec2c80c = str;
        return this;
    }

    /* renamed from: setH5_light_color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 m64021x3268f38a(java.lang.String str) {
        this.f36648x7bdabe88 = str;
        return this;
    }

    /* renamed from: setLight_color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 m64022xedefd938(java.lang.String str) {
        this.f36649x7db41efa = str;
        return this;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag */
/* loaded from: classes4.dex */
public class C15743xc7e67647 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: background_color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 f36610x7966cd12;

    /* renamed from: bold */
    public boolean f36611x2e3a85;

    /* renamed from: color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 f36612x5a72f63;

    /* renamed from: desc */
    public java.lang.String f36613x2efe91;

    /* renamed from: icon */
    public java.lang.String f36614x313c79;

    /* renamed from: tag_id */
    public long f36615xcb7953e0;

    /* renamed from: tag_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f36616xb5c517ba;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15743xc7e67647 m63976xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15743xc7e67647();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15743xc7e67647)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15743xc7e67647 c15743xc7e67647 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15743xc7e67647) fVar;
        return n51.f.a(this.f36613x2efe91, c15743xc7e67647.f36613x2efe91) && n51.f.a(this.f36614x313c79, c15743xc7e67647.f36614x313c79) && n51.f.a(this.f36610x7966cd12, c15743xc7e67647.f36610x7966cd12) && n51.f.a(this.f36612x5a72f63, c15743xc7e67647.f36612x5a72f63) && n51.f.a(this.f36616xb5c517ba, c15743xc7e67647.f36616xb5c517ba) && n51.f.a(java.lang.Long.valueOf(this.f36615xcb7953e0), java.lang.Long.valueOf(c15743xc7e67647.f36615xcb7953e0)) && n51.f.a(java.lang.Boolean.valueOf(this.f36611x2e3a85), java.lang.Boolean.valueOf(c15743xc7e67647.f36611x2e3a85));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36613x2efe91;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f36614x313c79;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43 = this.f36610x7966cd12;
            if (c15748x3e43f43 != null) {
                fVar.i(3, c15748x3e43f43.mo75928xcd1e8d8());
                this.f36610x7966cd12.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f432 = this.f36612x5a72f63;
            if (c15748x3e43f432 != null) {
                fVar.i(4, c15748x3e43f432.mo75928xcd1e8d8());
                this.f36612x5a72f63.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = this.f36616xb5c517ba;
            if (c15780xf49d6a1c != null) {
                fVar.i(5, c15780xf49d6a1c.mo75928xcd1e8d8());
                this.f36616xb5c517ba.mo75956x3d5d1f78(fVar);
            }
            fVar.h(6, this.f36615xcb7953e0);
            fVar.a(7, this.f36611x2e3a85);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f36613x2efe91;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f36614x313c79;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f433 = this.f36610x7966cd12;
            if (c15748x3e43f433 != null) {
                j17 += b36.f.i(3, c15748x3e43f433.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f434 = this.f36612x5a72f63;
            if (c15748x3e43f434 != null) {
                j17 += b36.f.i(4, c15748x3e43f434.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c2 = this.f36616xb5c517ba;
            if (c15780xf49d6a1c2 != null) {
                j17 += b36.f.i(5, c15780xf49d6a1c2.mo75928xcd1e8d8());
            }
            return j17 + b36.f.h(6, this.f36615xcb7953e0) + b36.f.a(7, this.f36611x2e3a85);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15743xc7e67647 c15743xc7e67647 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15743xc7e67647) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c15743xc7e67647.f36613x2efe91 = aVar2.k(intValue);
                return 0;
            case 2:
                c15743xc7e67647.f36614x313c79 = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f435 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43();
                    if (bArr != null && bArr.length > 0) {
                        c15748x3e43f435.mo11468x92b714fd(bArr);
                    }
                    c15743xc7e67647.f36610x7966cd12 = c15748x3e43f435;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f436 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43();
                    if (bArr2 != null && bArr2.length > 0) {
                        c15748x3e43f436.mo11468x92b714fd(bArr2);
                    }
                    c15743xc7e67647.f36612x5a72f63 = c15748x3e43f436;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
                    if (bArr3 != null && bArr3.length > 0) {
                        c15780xf49d6a1c3.mo11468x92b714fd(bArr3);
                    }
                    c15743xc7e67647.f36616xb5c517ba = c15780xf49d6a1c3;
                }
                return 0;
            case 6:
                c15743xc7e67647.f36615xcb7953e0 = aVar2.i(intValue);
                return 0;
            case 7:
                c15743xc7e67647.f36611x2e3a85 = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setBackground_color */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15743xc7e67647 m63977xc53bc994(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43) {
        this.f36610x7966cd12 = c15748x3e43f43;
        return this;
    }

    /* renamed from: setBold */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15743xc7e67647 m63978x76486a07(boolean z17) {
        this.f36611x2e3a85 = z17;
        return this;
    }

    /* renamed from: setColor */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15743xc7e67647 m63979x52d2f021(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43) {
        this.f36612x5a72f63 = c15748x3e43f43;
        return this;
    }

    /* renamed from: setDesc */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15743xc7e67647 m63980x76492e13(java.lang.String str) {
        this.f36613x2efe91 = str;
        return this;
    }

    /* renamed from: setIcon */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15743xc7e67647 m63981x764b6bfb(java.lang.String str) {
        this.f36614x313c79 = str;
        return this;
    }

    /* renamed from: setTag_id */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15743xc7e67647 m63982x23c5aae2(long j17) {
        this.f36615xcb7953e0 = j17;
        return this;
    }

    /* renamed from: setTag_jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15743xc7e67647 m63983x5fb3a78(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        this.f36616xb5c517ba = c15780xf49d6a1c;
        return this;
    }
}

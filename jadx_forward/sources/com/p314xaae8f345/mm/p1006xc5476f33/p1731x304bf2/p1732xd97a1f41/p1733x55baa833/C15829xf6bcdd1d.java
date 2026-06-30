package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833;

/* renamed from: com.tencent.mm.plugin.game.autogen.chatroom.TplBlock */
/* loaded from: classes4.dex */
public class C15829xf6bcdd1d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: can_be_at */
    public boolean f36889x15672080;

    /* renamed from: content */
    public java.lang.String f36890x38b73479;

    /* renamed from: jump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f36891x28d1961f;

    /* renamed from: type */
    public int f36892x368f3a;

    /* renamed from: username */
    public java.lang.String f36893xf02988d6;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15829xf6bcdd1d m64348xaf65a0fc() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15829xf6bcdd1d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15829xf6bcdd1d)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15829xf6bcdd1d c15829xf6bcdd1d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15829xf6bcdd1d) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f36892x368f3a), java.lang.Integer.valueOf(c15829xf6bcdd1d.f36892x368f3a)) && n51.f.a(this.f36890x38b73479, c15829xf6bcdd1d.f36890x38b73479) && n51.f.a(this.f36891x28d1961f, c15829xf6bcdd1d.f36891x28d1961f) && n51.f.a(this.f36893xf02988d6, c15829xf6bcdd1d.f36893xf02988d6) && n51.f.a(java.lang.Boolean.valueOf(this.f36889x15672080), java.lang.Boolean.valueOf(c15829xf6bcdd1d.f36889x15672080));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f36892x368f3a);
            java.lang.String str = this.f36890x38b73479;
            if (str != null) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = this.f36891x28d1961f;
            if (c15780xf49d6a1c != null) {
                fVar.i(3, c15780xf49d6a1c.mo75928xcd1e8d8());
                this.f36891x28d1961f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f36893xf02988d6;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.f36889x15672080);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f36892x368f3a) + 0;
            java.lang.String str3 = this.f36890x38b73479;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c2 = this.f36891x28d1961f;
            if (c15780xf49d6a1c2 != null) {
                e17 += b36.f.i(3, c15780xf49d6a1c2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f36893xf02988d6;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            return e17 + b36.f.a(5, this.f36889x15672080);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15829xf6bcdd1d c15829xf6bcdd1d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15829xf6bcdd1d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c15829xf6bcdd1d.f36892x368f3a = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            c15829xf6bcdd1d.f36890x38b73479 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                c15829xf6bcdd1d.f36893xf02988d6 = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            c15829xf6bcdd1d.f36889x15672080 = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c();
            if (bArr != null && bArr.length > 0) {
                c15780xf49d6a1c3.mo11468x92b714fd(bArr);
            }
            c15829xf6bcdd1d.f36891x28d1961f = c15780xf49d6a1c3;
        }
        return 0;
    }

    /* renamed from: setCan_be_at */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15829xf6bcdd1d m64349x7128523e(boolean z17) {
        this.f36889x15672080 = z17;
        return this;
    }

    /* renamed from: setContent */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15829xf6bcdd1d m64350xe9f5bdb7(java.lang.String str) {
        this.f36890x38b73479 = str;
        return this;
    }

    /* renamed from: setJump_info */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15829xf6bcdd1d m64351x8492c7dd(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        this.f36891x28d1961f = c15780xf49d6a1c;
        return this;
    }

    /* renamed from: setType */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15829xf6bcdd1d m64352x7650bebc(int i17) {
        this.f36892x368f3a = i17;
        return this;
    }

    /* renamed from: setUsername */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15829xf6bcdd1d m64353x66bc2758(java.lang.String str) {
        this.f36893xf02988d6 = str;
        return this;
    }
}

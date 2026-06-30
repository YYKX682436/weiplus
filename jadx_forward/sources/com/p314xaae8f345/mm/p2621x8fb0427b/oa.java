package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes9.dex */
public class oa extends dm.da implements com.p314xaae8f345.mm.p2621x8fb0427b.o5 {
    public static final l75.e0 D = new l75.e0();
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 C;

    public oa() {
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a9
    public boolean U(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2621x8fb0427b.oa oaVar = (com.p314xaae8f345.mm.p2621x8fb0427b.oa) obj;
        com.p314xaae8f345.mm.p2621x8fb0427b.a9 a9Var = this.C;
        if (a9Var != null) {
            return a9Var.U(oaVar != null ? oaVar.C : null);
        }
        return oaVar != null && this.f66277x297eb4f7 == oaVar.f66277x297eb4f7 && this.f66275xb82ed889 == oaVar.f66275xb82ed889 && this.f66278xe7ccd9b4 == oaVar.f66278xe7ccd9b4 && (((str = this.f66279x29dd02d3) != null && str.equals(oaVar.f66279x29dd02d3)) || (this.f66279x29dd02d3 == null && oaVar.f66279x29dd02d3 == null));
    }

    @Override // dm.da, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return D;
    }

    public oa(long j17) {
        this.f66277x297eb4f7 = j17;
    }
}

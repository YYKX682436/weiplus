package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public class l2 implements com.p314xaae8f345.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11705xe078a6dd f157795a;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11705xe078a6dd c11705xe078a6dd) {
        this.f157795a = c11705xe078a6dd;
    }

    @Override // com.p314xaae8f345.mm.vfs.t6
    /* renamed from: accept */
    public boolean mo40607xab27b508(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(this.f157795a.f());
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(r6Var.r());
        java.lang.String str2 = a18.f294812f;
        if (str2 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        return a17.m82497xb2c87fbf(a18) && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11705xe078a6dd.g(r6Var, "tmp_", true);
    }
}

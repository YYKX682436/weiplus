package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class b0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 f168961a;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var) {
        this.f168961a = o0Var;
    }

    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.b0 b0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.NAVIGATE_TO == wdVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = b0Var.f168961a;
            if (!o0Var.f169065o && (w2Var = o0Var.f169064n) != null && w2Var.mo14683xad58292c().equals(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var.f169051a, "onCreatePage, reuse " + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0.k(o0Var.f169064n));
                return true;
            }
        } else {
            b0Var.getClass();
        }
        return false;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd;

/* loaded from: classes7.dex */
public abstract class f {
    public static final boolean a(sf.f fVar) {
        u81.h hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = fVar.m();
        u81.b bVar = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = m17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) m17 : null;
        if (v5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandInvokeContextExt", "isPageInForeground, pageView is null");
            return false;
        }
        boolean l27 = v5Var.l2();
        u81.b bVar2 = u81.b.FOREGROUND;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = v5Var.mo32091x9a3f0ba2();
        if (mo32091x9a3f0ba2 != null && (hVar = mo32091x9a3f0ba2.N) != null) {
            bVar = hVar.b();
        }
        boolean z17 = bVar2 == bVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandInvokeContextExt", "isPageInForeground, isPageInForeground: " + l27 + ", isRuntimeInForeground: " + z17);
        return l27 && z17;
    }
}

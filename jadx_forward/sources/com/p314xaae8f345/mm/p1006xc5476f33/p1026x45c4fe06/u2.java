package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class u2 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f170795d;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f170795d = c11510xdd90c2f2;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e3 e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e3) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e3 e3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e3) obj2;
        if (e3Var == e3Var2) {
            return 0;
        }
        return e3Var.hashCode() - e3Var2.hashCode();
    }
}

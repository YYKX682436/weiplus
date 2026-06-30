package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class v2 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f172174d;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f172174d = c11510xdd90c2f2;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.xc xcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.xc) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.xc xcVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.xc) obj2;
        if (xcVar == xcVar2) {
            return 0;
        }
        return xcVar.hashCode() - xcVar2.hashCode();
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class be implements java.util.Comparator {
    public be(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ge geVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.he heVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.he) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.he heVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.he) obj2;
        if (heVar == heVar2) {
            return 0;
        }
        return heVar.hashCode() - heVar2.hashCode();
    }
}

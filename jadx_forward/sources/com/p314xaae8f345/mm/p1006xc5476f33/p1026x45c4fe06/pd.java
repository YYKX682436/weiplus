package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class pd implements java.util.Comparator {
    public pd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.qd qdVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sc scVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sc) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sc scVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sc) obj2;
        if (scVar == scVar2) {
            return 0;
        }
        return scVar.hashCode() - scVar2.hashCode();
    }
}

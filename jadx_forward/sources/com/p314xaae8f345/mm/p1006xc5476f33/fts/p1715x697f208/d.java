package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208;

/* loaded from: classes12.dex */
public class d implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.e) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.e eVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.e) obj2;
        double d17 = eVar.f219347c;
        double d18 = eVar2.f219347c;
        if (d17 > d18) {
            return -1;
        }
        if (d17 < d18) {
            return 1;
        }
        return java.lang.Integer.compare(eVar.f219345a, eVar2.f219345a);
    }
}

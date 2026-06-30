package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public class l implements java.util.Comparator {
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.j jVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
        if (entry2.getValue() == null || entry.getValue() == null) {
            return 0;
        }
        return ((java.lang.Integer) entry2.getValue()).intValue() - ((java.lang.Integer) entry.getValue()).intValue();
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes5.dex */
public class j5 implements java.util.Comparator {
    public j5(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.n5 n5Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        y63.b bVar = (y63.b) ((y63.a) obj).N.get(1);
        y63.b bVar2 = (y63.b) ((y63.a) obj2).N.get(1);
        if (bVar == null || bVar2 == null) {
            return 0;
        }
        return java.lang.Long.compare(bVar2.f541188d, bVar.f541188d);
    }
}

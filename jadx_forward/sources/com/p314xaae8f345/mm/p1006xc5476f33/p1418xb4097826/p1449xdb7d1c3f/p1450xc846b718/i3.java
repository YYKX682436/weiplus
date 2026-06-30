package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i3 f187119a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i3();

    public final void a(java.lang.String tag, zy2.ba storage, java.util.LinkedList mergeList, boolean z17) {
        zy2.ba baVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mergeList, "mergeList");
        if (z17) {
            baVar = ((c61.l7) i95.n0.c(c61.l7.class)).lk();
        } else {
            c61.l7 l7Var = (c61.l7) i95.n0.c(c61.l7.class);
            l7Var.getClass();
            gm0.j1.b().c();
            baVar = (cu2.i0) ((jz5.n) l7Var.E).mo141623x754a37bb();
        }
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb> a17 = baVar != null ? baVar.a() : null;
        if (baVar != null) {
            baVar.d(a17);
        }
        if (a17 == null || a17.isEmpty()) {
            return;
        }
        if (mergeList.isEmpty()) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar : a17) {
                jbVar.n1(storage, false);
                mergeList.add(jbVar);
            }
            return;
        }
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        mergeList.addAll(a17);
        java.util.Iterator it = mergeList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) it.next();
            int m55856xfb85f7b0 = jbVar2.m55856xfb85f7b0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) sparseArray.get(m55856xfb85f7b0);
            if (jbVar3 == null) {
                sparseArray.put(m55856xfb85f7b0, jbVar2);
            } else if (jbVar2.f65879x2261f6f2 > jbVar3.f65879x2261f6f2 && !jbVar2.h1()) {
                sparseArray.put(m55856xfb85f7b0, jbVar2);
            }
        }
        mergeList.clear();
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) sparseArray.get(sparseArray.keyAt(i17));
            if (jbVar4 != null) {
                jbVar4.n1(storage, false);
                mergeList.add(jbVar4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "mergeRedDotCtrInfoList insert " + jbVar4);
            }
        }
    }
}

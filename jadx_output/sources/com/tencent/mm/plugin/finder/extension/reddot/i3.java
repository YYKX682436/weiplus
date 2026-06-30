package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.i3 f105586a = new com.tencent.mm.plugin.finder.extension.reddot.i3();

    public final void a(java.lang.String tag, zy2.ba storage, java.util.LinkedList mergeList, boolean z17) {
        zy2.ba baVar;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(storage, "storage");
        kotlin.jvm.internal.o.g(mergeList, "mergeList");
        if (z17) {
            baVar = ((c61.l7) i95.n0.c(c61.l7.class)).lk();
        } else {
            c61.l7 l7Var = (c61.l7) i95.n0.c(c61.l7.class);
            l7Var.getClass();
            gm0.j1.b().c();
            baVar = (cu2.i0) ((jz5.n) l7Var.E).getValue();
        }
        java.util.LinkedList<com.tencent.mm.plugin.finder.extension.reddot.jb> a17 = baVar != null ? baVar.a() : null;
        if (baVar != null) {
            baVar.d(a17);
        }
        if (a17 == null || a17.isEmpty()) {
            return;
        }
        if (mergeList.isEmpty()) {
            for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : a17) {
                jbVar.n1(storage, false);
                mergeList.add(jbVar);
            }
            return;
        }
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        mergeList.addAll(a17);
        java.util.Iterator it = mergeList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = (com.tencent.mm.plugin.finder.extension.reddot.jb) it.next();
            int type = jbVar2.getType();
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar3 = (com.tencent.mm.plugin.finder.extension.reddot.jb) sparseArray.get(type);
            if (jbVar3 == null) {
                sparseArray.put(type, jbVar2);
            } else if (jbVar2.field_time > jbVar3.field_time && !jbVar2.h1()) {
                sparseArray.put(type, jbVar2);
            }
        }
        mergeList.clear();
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar4 = (com.tencent.mm.plugin.finder.extension.reddot.jb) sparseArray.get(sparseArray.keyAt(i17));
            if (jbVar4 != null) {
                jbVar4.n1(storage, false);
                mergeList.add(jbVar4);
                com.tencent.mars.xlog.Log.i(tag, "mergeRedDotCtrInfoList insert " + jbVar4);
            }
        }
    }
}

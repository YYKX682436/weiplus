package mz4;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final mz4.j f414822a = new mz4.j();

    public final boolean a(mz4.d dataManager, com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a, java.lang.String inputText, java.util.List insertItems) {
        int m74971xef703fb1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataManager, "dataManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputText, "inputText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insertItems, "insertItems");
        boolean z17 = false;
        if (c19515x154ec45a == null || (m74971xef703fb1 = c19515x154ec45a.m74971xef703fb1()) >= dataManager.D()) {
            return false;
        }
        iz4.c l17 = dataManager.l(m74971xef703fb1);
        iz4.p pVar = null;
        iz4.p pVar2 = l17 instanceof iz4.p ? (iz4.p) l17 : null;
        if (pVar2 == null) {
            return false;
        }
        int i17 = c19515x154ec45a.f269647l1;
        int j17 = pVar2.j();
        if (i17 > 0 && i17 < j17) {
            pVar = new iz4.p();
            java.util.Iterator it = pVar2.f377669t.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            int i18 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                iz4.c cVar = (iz4.c) next;
                if (i18 >= i17) {
                    it.remove();
                    pVar.f377669t.addLast(cVar);
                }
                i18++;
            }
        }
        if (pVar != null) {
            pVar2.f377637b = false;
            z17 = true;
            pVar.f377637b = true;
            pVar.f377643h = true;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(inputText, "<br/>")) {
                dataManager.a(m74971xef703fb1 + 1, pVar, true);
            } else {
                int i19 = m74971xef703fb1 + 1;
                dataManager.a(i19, pVar, true);
                java.util.Iterator it6 = insertItems.iterator();
                while (it6.hasNext()) {
                    dataManager.a(i19, (iz4.c) it6.next(), true);
                    i19++;
                }
            }
        }
        return z17;
    }

    public final boolean b(int i17, java.util.List oriData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oriData, "oriData");
        java.lang.Object obj = oriData.get(i17);
        iz4.p pVar = obj instanceof iz4.p ? (iz4.p) obj : null;
        if (pVar == null) {
            return false;
        }
        if (!(pVar.j() > 3)) {
            return false;
        }
        java.lang.Object removeLast = pVar.f377669t.removeLast();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(removeLast, "removeLast(...)");
        iz4.c cVar = (iz4.c) removeLast;
        int i18 = i17 + 1;
        iz4.c cVar2 = oriData.size() > i18 ? (iz4.c) oriData.get(i18) : null;
        if (cVar2 instanceof iz4.p) {
            iz4.p pVar2 = (iz4.p) cVar2;
            pVar2.getClass();
            pVar2.f377669t.addFirst(cVar);
            b(i18, oriData);
        } else {
            iz4.p pVar3 = new iz4.p();
            pVar3.g(cVar);
            oriData.add(i18, pVar3);
        }
        return true;
    }

    public final java.util.List c(java.util.List oriDataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oriDataList, "oriDataList");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!oriDataList.isEmpty()) {
            java.util.Iterator it = oriDataList.iterator();
            while (it.hasNext()) {
                iz4.c cVar = (iz4.c) it.next();
                if (cVar instanceof iz4.p) {
                    java.util.Iterator it6 = ((iz4.p) cVar).f377669t.iterator();
                    while (it6.hasNext()) {
                        linkedList.add((iz4.c) it6.next());
                    }
                } else {
                    linkedList.add(cVar);
                }
            }
        }
        return linkedList;
    }

    public final boolean d(int i17, boolean z17, java.util.List oriData, nz4.h hVar, mz4.d noteDataManager) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oriData, "oriData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noteDataManager, "noteDataManager");
        iz4.c cVar = (iz4.c) oriData.get(i17);
        if (!(cVar instanceof iz4.p) || hVar == null || (i18 = hVar.f423152a) != hVar.f423154c || i18 != i17) {
            return false;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i19 = hVar.f423153b;
        int i27 = hVar.f423155d;
        iz4.p pVar = (iz4.p) cVar;
        java.util.Iterator it = pVar.f377669t.iterator();
        int i28 = 0;
        while (true) {
            if (!it.hasNext()) {
                pVar.getClass();
                java.util.LinkedList linkedList2 = pVar.f377669t;
                linkedList2.clear();
                linkedList2.addAll(linkedList);
                if (pVar.j() == 0) {
                    noteDataManager.z(i17, false, null);
                }
                return true;
            }
            java.lang.Object next = it.next();
            int i29 = i28 + 1;
            if (i28 < 0) {
                kz5.c0.p();
                throw null;
            }
            iz4.c cVar2 = (iz4.c) next;
            if (!(i19 <= i28 && i28 < i27)) {
                linkedList.add(cVar2);
            }
            i28 = i29;
        }
    }
}

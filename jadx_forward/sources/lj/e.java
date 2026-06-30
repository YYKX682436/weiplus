package lj;

/* loaded from: classes12.dex */
public abstract class e {
    public static int a(java.util.LinkedList linkedList, ij.a aVar) {
        if (com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.f20031x5fcf68b) {
            java.util.Objects.toString(aVar);
        }
        ij.a aVar2 = !linkedList.isEmpty() ? (ij.a) linkedList.peek() : null;
        if (aVar2 != null && aVar2.f373197a == aVar.f373197a) {
            int i17 = aVar2.f373199c;
            int i18 = aVar.f373199c;
            if (i17 == i18 && i18 != 0) {
                int i19 = aVar.f373198b;
                if (i19 == 5000) {
                    i19 = aVar2.f373198b;
                }
                aVar.f373198b = i19;
                aVar2.f373200d++;
                int i27 = (int) (aVar2.f373198b + i19);
                aVar2.f373198b = i27;
                return i27;
            }
        }
        linkedList.push(aVar);
        return aVar.f373198b;
    }

    public static java.lang.String b(java.util.List list, long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long j18 = ((float) j17) * 0.3f;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ij.a aVar = (ij.a) it.next();
            if (aVar.f373198b >= j18) {
                linkedList.add(aVar);
            }
        }
        java.util.Collections.sort(linkedList, new lj.b());
        if (linkedList.isEmpty() && !list.isEmpty()) {
            linkedList.add((ij.a) list.get(0));
        } else if (linkedList.size() > 1 && ((ij.a) linkedList.peek()).f373197a == 1048574) {
            linkedList.removeFirst();
        }
        java.util.Iterator it6 = linkedList.iterator();
        if (it6.hasNext()) {
            sb6.append(((ij.a) it6.next()).f373197a + "|");
        }
        return sb6.toString();
    }

    public static long c(java.util.LinkedList linkedList, java.lang.StringBuilder sb6, java.lang.StringBuilder sb7) {
        sb7.append("|*\t\tTraceStack:");
        sb7.append("\n");
        sb7.append("|*\t\t[id count cost]");
        sb7.append("\n");
        java.util.Iterator it = linkedList.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            ij.a aVar = (ij.a) it.next();
            sb6.append(aVar.m136650x9616526c());
            sb6.append('\n');
            sb7.append("|*\t\t");
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            for (int i17 = 0; i17 < aVar.f373199c; i17++) {
                stringBuffer.append('.');
            }
            sb7.append(stringBuffer.toString() + aVar.f373197a + " " + aVar.f373200d + " " + aVar.f373198b);
            sb7.append('\n');
            int i18 = aVar.f373198b;
            if (j17 < i18) {
                j17 = i18;
            }
        }
        return j17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r3 == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(long[] r26, java.util.LinkedList r27, boolean r28, long r29) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lj.e.d(long[], java.util.LinkedList, boolean, long):void");
    }

    public static void e(lj.d dVar, java.util.LinkedList linkedList) {
        for (int i17 = 0; i17 < dVar.f400331c.size(); i17++) {
            lj.d dVar2 = (lj.d) dVar.f400331c.get(i17);
            if (dVar2 != null) {
                ij.a aVar = dVar2.f400329a;
                if (aVar != null) {
                    linkedList.add(aVar);
                }
                if (!dVar2.f400331c.isEmpty()) {
                    e(dVar2, linkedList);
                }
            }
        }
    }

    public static void f(java.util.List list, int i17, lj.c cVar) {
        if (i17 < 0) {
            list.clear();
            return;
        }
        int size = list.size();
        int i18 = 1;
        while (size > i17) {
            java.util.ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (cVar.b(((ij.a) listIterator.previous()).f373198b, i18)) {
                    listIterator.remove();
                    size--;
                    if (size <= i17) {
                        return;
                    }
                }
            }
            size = list.size();
            i18++;
            if (cVar.a() < i18) {
                break;
            }
        }
        int size2 = list.size();
        if (size2 > i17) {
            cVar.c(list, size2);
        }
    }
}

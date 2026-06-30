package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes15.dex */
public abstract class n0 {
    public static java.util.LinkedList a(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.util.LinkedList linkedList2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.b) list.get(i17)).f240349f;
            for (int i18 = 0; i18 < linkedList2.size(); i18++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a) linkedList2.get(i18);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f240333t)) {
                    linkedList.add(aVar.f240333t);
                }
            }
        }
        return linkedList;
    }

    public static boolean b(java.util.List list, java.util.Map map) {
        if (map == null || map.size() <= 0 || list == null) {
            return false;
        }
        boolean z17 = false;
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (list.get(i17) != null) {
                java.util.LinkedList linkedList = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.b) list.get(i17)).f240349f;
                boolean z18 = false;
                for (int i18 = 0; i18 < linkedList.size(); i18++) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a) linkedList.get(i18);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f240333t)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a aVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a) map.get(aVar.f240333t);
                        if (aVar2 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProductUpdateLogic", "Updating action , info: key=" + aVar.f240333t);
                            linkedList.remove(i18);
                            linkedList.add(i18, aVar2);
                            z17 = true;
                            z18 = true;
                        }
                    } else {
                        z18 = true;
                    }
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.b) list.get(i17)).f240348e = z18;
            }
        }
        return z17;
    }
}

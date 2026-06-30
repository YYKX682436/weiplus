package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* loaded from: classes11.dex */
public class i0 extends com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.a {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.e0 f145032a;

    public i0() {
        this.f145032a = new com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.e0();
    }

    public void b() {
        java.util.LinkedList linkedList;
        z2.n1 n1Var = new z2.n1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        pm.g gVar = pm.f.f438285a;
        gVar.getClass();
        java.util.LinkedList<java.lang.Integer> linkedList3 = new java.util.LinkedList();
        for (int i17 = 4097; i17 < 4102; i17++) {
            linkedList3.add(java.lang.Integer.valueOf(i17));
        }
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        java.util.LinkedList<com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe> linkedList5 = new java.util.LinkedList();
        pm.d dVar = gVar.f438287e;
        if (dVar.f438284a == null) {
            dVar.a();
        }
        linkedList5.addAll(dVar.f438284a);
        for (com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe c10313x2dcd4ebe : linkedList5) {
            if (c10313x2dcd4ebe.f144998n) {
                linkedList4.add(java.lang.Integer.valueOf(c10313x2dcd4ebe.f144991d));
            }
        }
        linkedList5.clear();
        java.util.LinkedList<pm.a> linkedList6 = new java.util.LinkedList();
        pm.b bVar = gVar.f438288f;
        synchronized (bVar) {
            if (bVar.f438283d == null) {
                bVar.g();
            }
            linkedList = bVar.f438283d;
        }
        linkedList6.addAll(linkedList);
        for (pm.a aVar : linkedList6) {
            if (aVar.f438281h) {
                linkedList4.add(java.lang.Integer.valueOf(aVar.f438277d));
            }
        }
        linkedList6.clear();
        linkedList3.addAll(linkedList4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.Integer num : linkedList3) {
            sb6.append(num + ";");
            if (!linkedList2.contains(num)) {
                pm.f.f438285a.d(n1Var, num.intValue());
                linkedList2.add(num);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Handle", "needRemoveNotificationId:%s", sb6);
    }
}

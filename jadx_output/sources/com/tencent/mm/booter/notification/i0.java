package com.tencent.mm.booter.notification;

/* loaded from: classes11.dex */
public class i0 extends com.tencent.mm.booter.notification.a {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.booter.notification.e0 f63499a;

    public i0() {
        this.f63499a = new com.tencent.mm.booter.notification.e0();
    }

    public void b() {
        java.util.LinkedList linkedList;
        z2.n1 n1Var = new z2.n1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        pm.g gVar = pm.f.f356752a;
        gVar.getClass();
        java.util.LinkedList<java.lang.Integer> linkedList3 = new java.util.LinkedList();
        for (int i17 = 4097; i17 < 4102; i17++) {
            linkedList3.add(java.lang.Integer.valueOf(i17));
        }
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        java.util.LinkedList<com.tencent.mm.booter.notification.NotificationItem> linkedList5 = new java.util.LinkedList();
        pm.d dVar = gVar.f356754e;
        if (dVar.f356751a == null) {
            dVar.a();
        }
        linkedList5.addAll(dVar.f356751a);
        for (com.tencent.mm.booter.notification.NotificationItem notificationItem : linkedList5) {
            if (notificationItem.f63465n) {
                linkedList4.add(java.lang.Integer.valueOf(notificationItem.f63458d));
            }
        }
        linkedList5.clear();
        java.util.LinkedList<pm.a> linkedList6 = new java.util.LinkedList();
        pm.b bVar = gVar.f356755f;
        synchronized (bVar) {
            if (bVar.f356750d == null) {
                bVar.g();
            }
            linkedList = bVar.f356750d;
        }
        linkedList6.addAll(linkedList);
        for (pm.a aVar : linkedList6) {
            if (aVar.f356748h) {
                linkedList4.add(java.lang.Integer.valueOf(aVar.f356744d));
            }
        }
        linkedList6.clear();
        linkedList3.addAll(linkedList4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.Integer num : linkedList3) {
            sb6.append(num + ";");
            if (!linkedList2.contains(num)) {
                pm.f.f356752a.d(n1Var, num.intValue());
                linkedList2.add(num);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Handle", "needRemoveNotificationId:%s", sb6);
    }
}

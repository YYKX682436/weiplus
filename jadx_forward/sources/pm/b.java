package pm;

/* loaded from: classes9.dex */
public class b implements java.io.Serializable, java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f438283d;

    public synchronized boolean d(int i17) {
        if (i17 == -1) {
            return false;
        }
        if (this.f438283d == null) {
            g();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = this.f438283d.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            pm.a aVar = (pm.a) it.next();
            if (aVar.f438277d != i17) {
                linkedList.add(aVar);
            } else {
                z17 = true;
            }
        }
        if (!z17) {
            return false;
        }
        this.f438283d = linkedList;
        h();
        return true;
    }

    public void e() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p971x6de15a2e.x2.j();
        o4Var.getClass();
        o4Var.putString("com.tencent.preference.notification.key.queue", "").apply();
        java.util.LinkedList linkedList = this.f438283d;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(linkedList == null ? 0 : linkedList.size());
        objArr[1] = m158697x9616526c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationAppMsgQueue", "reset size:%d, %s", objArr);
    }

    /* JADX WARN: Finally extract failed */
    public synchronized void g() {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        try {
            try {
                linkedList2 = (java.util.LinkedList) pm.h.a(((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p971x6de15a2e.x2.j()).getString("com.tencent.preference.notification.key.queue", ""));
                this.f438283d = linkedList2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NotificationAppMsgQueue", e17, "", new java.lang.Object[0]);
                if (this.f438283d == null) {
                    linkedList = new java.util.LinkedList();
                }
            }
            if (linkedList2 == null) {
                linkedList = new java.util.LinkedList();
                this.f438283d = linkedList;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationAppMsgQueue", "restore size:%d, %s", java.lang.Integer.valueOf(this.f438283d.size()), m158697x9616526c());
        } catch (java.lang.Throwable th6) {
            if (this.f438283d == null) {
                this.f438283d = new java.util.LinkedList();
            }
            throw th6;
        }
    }

    public synchronized void h() {
        java.util.LinkedList linkedList = this.f438283d;
        if (linkedList == null) {
            return;
        }
        linkedList.size();
        if (this.f438283d.isEmpty()) {
            e();
            return;
        }
        try {
            java.util.LinkedList linkedList2 = new java.util.LinkedList(this.f438283d);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p971x6de15a2e.x2.j();
            o4Var.getClass();
            o4Var.putString("com.tencent.preference.notification.key.queue", pm.h.b(linkedList2)).apply();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NotificationAppMsgQueue", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationAppMsgQueue", "save size:%d, %s", java.lang.Integer.valueOf(this.f438283d.size()), m158697x9616526c());
    }

    @Override // java.lang.Iterable
    public synchronized java.util.Iterator iterator() {
        if (this.f438283d == null) {
            g();
        }
        return this.f438283d.iterator();
    }

    /* renamed from: toString */
    public java.lang.String m158697x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.LinkedList linkedList = this.f438283d;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb6.append(((pm.a) it.next()).m158696x9616526c());
                sb6.append(";  ");
            }
        }
        return sb6.toString();
    }
}

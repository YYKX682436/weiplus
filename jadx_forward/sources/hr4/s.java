package hr4;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final hr4.q f365803a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f365804b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f365805c;

    public s(hr4.q onGetContact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onGetContact, "onGetContact");
        this.f365803a = onGetContact;
        this.f365804b = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f365805c = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final boolean a(java.lang.String str, java.lang.Boolean bool) {
        if (str == null) {
            return false;
        }
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f365804b;
        if (concurrentLinkedQueue.contains(str)) {
            return false;
        }
        concurrentLinkedQueue.add(str);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            return true;
        }
        b();
        return true;
    }

    public final void b() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f365805c;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f365804b;
        if (concurrentLinkedQueue.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1wPersonalMsg.W1wPersonalMsgContactLooper", "queue empty");
            atomicBoolean.set(false);
            this.f365803a.b();
            return;
        }
        int size = concurrentLinkedQueue.size();
        if (20 <= size) {
            size = 20;
        }
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.String str = (java.lang.String) concurrentLinkedQueue.poll();
            if (str != null) {
                linkedList.add(str);
            }
        }
        r45.cj3 cj3Var = new r45.cj3();
        for (java.lang.String str2 : linkedList) {
            r45.dj3 dj3Var = new r45.dj3();
            dj3Var.f454062d = str2;
            cj3Var.f453127d.add(dj3Var);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 29919;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/zhuge/get_personal_msg_contact_list";
        lVar.f152197a = cj3Var;
        lVar.f152198b = new r45.ej3();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1wPersonalMsg.W1wPersonalMsgContactLooper", "need get profile contact list: " + linkedList);
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new hr4.r(linkedList, this));
    }
}

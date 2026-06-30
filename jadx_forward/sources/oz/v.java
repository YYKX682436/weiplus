package oz;

/* loaded from: classes12.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f431729c;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.x9 f431727a = new com.p314xaae8f345.mm.p2621x8fb0427b.x9();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f431728b = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f431730d = "tasks";

    public final void a(long j17, java.lang.String talker, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        java.util.LinkedList taskList = this.f431727a.f277869d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(taskList, "taskList");
        boolean z18 = false;
        if (!taskList.isEmpty()) {
            java.util.Iterator it = taskList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.y9 y9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.y9) it.next();
                if (y9Var.f277917d == j17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y9Var.f277920g, talker)) {
                    z18 = true;
                    break;
                }
            }
        }
        if (z18) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(j17, talker);
        java.util.LinkedHashMap linkedHashMap = this.f431728b;
        if (linkedHashMap.containsKey(c16564xb55e1d5)) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.y9 y9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.y9();
        y9Var2.f277917d = j17;
        y9Var2.f277920g = talker;
        y9Var2.f277919f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        if (z17) {
            this.f431727a.f277869d.add(y9Var2);
            d();
        } else {
            linkedHashMap.put(c16564xb55e1d5, y9Var2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoDownloadTaskQueue", "add: done, msgId=" + j17 + ", talker=" + talker + ", isPersistent=" + z17 + ", persistentCount=" + this.f431727a.f277869d.size() + ", nonPersistentCount=" + linkedHashMap.size());
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 idTalker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(idTalker, "idTalker");
        java.util.Iterator it = this.f431727a.f277869d.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (true) {
            boolean hasNext = it.hasNext();
            long j17 = idTalker.f231013d;
            if (!hasNext) {
                java.util.LinkedHashMap linkedHashMap = this.f431728b;
                if (linkedHashMap.remove(idTalker) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoDownloadTaskQueue", "remove: done (non-persistent), msgId=" + j17 + ", talker=" + idTalker.a() + ", nonPersistentCount=" + linkedHashMap.size());
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.y9 y9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.y9) it.next();
            if (y9Var.f277917d == j17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y9Var.f277920g, idTalker.a())) {
                it.remove();
                d();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoDownloadTaskQueue", "remove: done (persistent), msgId=" + y9Var.f277917d + ", talker=" + y9Var.f277920g + ", persistentCount=" + this.f431727a.f277869d.size());
                return;
            }
        }
    }

    public final void c(com.p314xaae8f345.mm.p2621x8fb0427b.y9 task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (this.f431727a.f277869d.remove(task)) {
            d();
        } else {
            this.f431728b.remove(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(task.f277917d, task.f277920g));
        }
    }

    public final void d() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f431729c;
        if (o4Var == null) {
            return;
        }
        try {
            if (o4Var.H(this.f431730d, this.f431727a.mo14344x5f01b1f6())) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AutoDownloadTaskQueue", "save: mmkvEncodeFailed, key=" + this.f431730d + ", taskCount=" + this.f431727a.f277869d.size());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AutoDownloadTaskQueue", "save: failed, key=" + this.f431730d + ", error=" + e17);
        }
    }
}

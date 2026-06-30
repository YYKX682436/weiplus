package b95;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final b95.d f18632b = new b95.d(null);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f18633c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f18634d;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.storage.fa f18635a;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String k17 = gm0.j1.b().k();
        kotlin.jvm.internal.o.f(k17, "getUserName(...)");
        byte[] bytes = k17.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        sb6.append("_MMKV_KEY_RECENT_FORWARD_INFO_LIST");
        f18633c = sb6.toString();
        f18634d = jz5.h.b(b95.c.f18629d);
    }

    public j() {
        if (!b95.l.f18636a) {
            java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue(10, new b95.k());
            java.util.LinkedList linkedList = new java.util.LinkedList();
            b95.l.a(com.tencent.mm.storage.u3.USERINFO_RECENT_FORWARD_CONVERSATION_STRING_SYNC, priorityQueue);
            b95.l.a(com.tencent.mm.storage.u3.USERINFO_RECENT_FORWARD_CONVERSATION_GROUP_STRING_SYNC, priorityQueue);
            while (priorityQueue.peek() != null) {
                linkedList.add((com.tencent.mm.storage.ea) priorityQueue.poll());
            }
            com.tencent.mm.storage.fa b17 = b();
            b17.f193938d.addAll(0, linkedList);
            f(b17);
            b95.l.f18636a = true;
            com.tencent.mars.xlog.Log.i("RecentForwardStorage", "dataTransfer: infoList.size:" + linkedList.size());
        }
        com.tencent.mm.storage.fa b18 = b();
        if (b18.f193938d.size() == 0) {
            return;
        }
        if (b18.f193939e == 0) {
            java.util.LinkedList<com.tencent.mm.storage.ea> info_list = b18.f193938d;
            kotlin.jvm.internal.o.f(info_list, "info_list");
            for (com.tencent.mm.storage.ea eaVar : info_list) {
                eaVar.f193888g = 1;
                java.util.LinkedList linkedList2 = eaVar.f193889h;
                com.tencent.mm.storage.t7 t7Var = new com.tencent.mm.storage.t7();
                t7Var.f195328d = 1;
                long j17 = eaVar.f193886e;
                t7Var.f195329e = j17 - (j17 % 86400000);
                linkedList2.add(t7Var);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RecentForwardInfoStorage", "initForwardDataList, size:" + b18.f193938d.size());
            f(b18);
        }
        i();
    }

    public final boolean a(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.storage.fa b17 = b();
        java.util.LinkedList<com.tencent.mm.storage.ea> info_list = b17.f193938d;
        kotlin.jvm.internal.o.f(info_list, "info_list");
        for (com.tencent.mm.storage.ea eaVar : info_list) {
            if (kotlin.jvm.internal.o.b(eaVar.f193885d, userName)) {
                b17.f193938d.remove(eaVar);
                f(b17);
                com.tencent.mars.xlog.Log.i("MicroMsg.RecentForwardInfoStorage", "deleteShareInfo: " + userName + ' ');
                return true;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.RecentForwardInfoStorage", "deleteShareInfo: " + userName + " is fail");
        return false;
    }

    public final com.tencent.mm.storage.fa b() {
        com.tencent.mm.storage.fa faVar = this.f18635a;
        if (faVar != null) {
            return faVar;
        }
        com.tencent.mm.storage.fa faVar2 = new com.tencent.mm.storage.fa();
        b95.d dVar = f18632b;
        com.tencent.mm.sdk.platformtools.o4 a17 = b95.d.a(dVar);
        java.lang.String str = f18633c;
        if (a17.f(str)) {
            byte[] j17 = b95.d.a(dVar).j(str);
            if (j17 != null) {
                faVar2.parseFrom(j17);
            }
        } else {
            byte[] j18 = b95.d.a(dVar).j("MMKV_KEY_RECENT_FORWARD_INFO_LIST");
            if (j18 != null) {
                faVar2.parseFrom(j18);
            }
            f(faVar2);
        }
        this.f18635a = faVar2;
        return faVar2;
    }

    public final void c(java.util.LinkedList linkedList, java.util.LinkedList linkedList2, int i17, int i18) {
        java.util.Iterator it = linkedList.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext() && linkedList2.size() < i17) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            com.tencent.mm.storage.ea eaVar = (com.tencent.mm.storage.ea) next;
            java.lang.String str = eaVar.f193885d;
            kotlin.jvm.internal.o.d(str);
            boolean z17 = false;
            if (!r26.n0.D(str, ",", false, 2, null)) {
                com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(str);
                com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str);
                if (q17 != null && !q17.o2() && p17 != null && !r26.i0.p("hidden_conv_parent", p17.W0(), true)) {
                    z17 = true;
                }
            }
            if (!z17) {
                it.remove();
                a(str);
            } else if (i18 == -1) {
                linkedList2.add(str);
                it.remove();
            } else if (i18 != 1) {
                if (i18 == 2 && eaVar.f193887f == 2) {
                    linkedList2.add(str);
                    it.remove();
                }
            } else if (eaVar.f193887f != 2) {
                linkedList2.add(str);
                it.remove();
            }
        }
    }

    public final java.util.List d(int i17, int i18, int i19) {
        i();
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentForwardInfoStorage", "start query frequentCount:" + i17 + ", recentCount:" + i18 + ", type:" + i19);
        if (i17 <= 0 && i18 <= 0) {
            return d(5, 5, i19);
        }
        java.lang.Object clone = b().f193938d.clone();
        kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.storage.RecentForwardInfo>");
        java.util.LinkedList linkedList = (java.util.LinkedList) clone;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        c(linkedList, linkedList2, i17, i19);
        if (linkedList.size() > 1) {
            kz5.g0.t(linkedList, new b95.e());
        }
        c(linkedList, linkedList2, i17 + i18, i19);
        return linkedList2;
    }

    public final java.util.List e() {
        java.util.List d17 = d(b95.b.a(), j62.e.g().c(new com.tencent.mm.repairer.config.forward.RepairerConfigRecentForwardCount()), -1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : d17) {
            if (!com.tencent.mm.storage.z3.L4((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentForwardInfoStorage", "[query] list size=" + arrayList.size());
        return arrayList;
    }

    public final void f(com.tencent.mm.storage.fa faVar) {
        b95.d.a(f18632b).H(f18633c, faVar.toByteArray());
        this.f18635a = faVar;
    }

    public final void g(java.lang.String str) {
        boolean z17 = false;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        if (z17) {
            h(kz5.b0.c(str));
        }
    }

    public final void h(java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateForwardInfo :");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentForwardInfoStorage", sb6.toString());
        if (list != null && (list.isEmpty() ^ true)) {
            com.tencent.mm.storage.fa b17 = b();
            long c17 = c01.id.c();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = b17.f193938d.iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                com.tencent.mm.storage.ea eaVar = (com.tencent.mm.storage.ea) it.next();
                if (list.contains(eaVar.f193885d)) {
                    eaVar.f193886e = c17;
                    eaVar.f193888g++;
                    long j17 = c17 - (c17 % 86400000);
                    java.util.LinkedList count_list = eaVar.f193889h;
                    kotlin.jvm.internal.o.f(count_list, "count_list");
                    com.tencent.mm.storage.t7 t7Var = (com.tencent.mm.storage.t7) kz5.n0.k0(count_list);
                    if (t7Var != null && t7Var.f195329e == j17) {
                        ((com.tencent.mm.storage.t7) kz5.n0.i0(count_list)).f195328d++;
                    } else {
                        com.tencent.mm.storage.t7 t7Var2 = new com.tencent.mm.storage.t7();
                        t7Var2.f195328d = 1;
                        t7Var2.f195329e = j17;
                        count_list.add(t7Var2);
                    }
                    arrayList.add(eaVar.f193885d);
                    if (arrayList.size() == list.size()) {
                        break;
                    }
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!arrayList.contains((java.lang.String) obj)) {
                    arrayList2.add(obj);
                }
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                java.lang.String str = (java.lang.String) it6.next();
                java.util.LinkedList linkedList = b17.f193938d;
                com.tencent.mm.storage.ea eaVar2 = new com.tencent.mm.storage.ea();
                eaVar2.f193885d = str;
                eaVar2.f193886e = c17;
                eaVar2.f193887f = f18632b.b(str);
                eaVar2.f193888g = 1;
                java.util.LinkedList linkedList2 = eaVar2.f193889h;
                com.tencent.mm.storage.t7 t7Var3 = new com.tencent.mm.storage.t7();
                t7Var3.f195328d = 1;
                t7Var3.f195329e = c17 - (c17 % 86400000);
                linkedList2.add(t7Var3);
                linkedList.add(eaVar2);
            }
            java.util.LinkedList info_list = b17.f193938d;
            kotlin.jvm.internal.o.f(info_list, "info_list");
            b17.f193938d = new java.util.LinkedList(kz5.n0.F0(info_list, new b95.g(new b95.f())));
            f(b17);
        }
    }

    public final void i() {
        int i17;
        com.tencent.mm.storage.fa b17 = b();
        long j17 = b17.f193939e;
        long c17 = c01.id.c();
        if (c17 - (c17 % 86400000) > j17) {
            long c18 = c01.id.c() - 2592000000L;
            long j18 = c18 - (c18 % 86400000);
            com.tencent.mars.xlog.Log.i("MicroMsg.RecentForwardInfoStorage", "start updateInfoListForTime " + b17.f193939e + ", " + j18);
            b17.f193939e = c01.id.c();
            java.util.Iterator it = b17.f193938d.iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                com.tencent.mm.storage.ea eaVar = (com.tencent.mm.storage.ea) it.next();
                long j19 = eaVar.f193886e;
                java.util.LinkedList linkedList = eaVar.f193889h;
                if (j19 < j18) {
                    eaVar.f193888g = 0;
                    linkedList.clear();
                } else {
                    java.util.Iterator it6 = linkedList.iterator();
                    kotlin.jvm.internal.o.f(it6, "iterator(...)");
                    while (it6.hasNext()) {
                        com.tencent.mm.storage.t7 t7Var = (com.tencent.mm.storage.t7) it6.next();
                        if (t7Var.f195329e < j18) {
                            eaVar.f193888g -= t7Var.f195328d;
                            it6.remove();
                        }
                    }
                }
            }
            java.util.LinkedList info_list = b17.f193938d;
            kotlin.jvm.internal.o.f(info_list, "info_list");
            java.util.LinkedList linkedList2 = new java.util.LinkedList(kz5.n0.F0(info_list, new b95.i(new b95.h())));
            b17.f193938d = linkedList2;
            java.util.Iterator it7 = linkedList2.iterator();
            int i18 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    i18 = -1;
                    break;
                } else {
                    if (((com.tencent.mm.storage.ea) it7.next()).f193888g == 0) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            if (i18 != -1 && (i17 = i18 + 20) < b17.f193938d.size()) {
                java.util.List subList = b17.f193938d.subList(0, i17);
                kotlin.jvm.internal.o.f(subList, "subList(...)");
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                linkedList3.addAll(subList);
                b17.f193938d = linkedList3;
            }
            f(b17);
        }
    }
}

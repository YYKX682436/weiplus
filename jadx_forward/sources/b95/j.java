package b95;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final b95.d f100165b = new b95.d(null);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f100166c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f100167d;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.fa f100168a;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String k17 = gm0.j1.b().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getUserName(...)");
        byte[] bytes = k17.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        sb6.append("_MMKV_KEY_RECENT_FORWARD_INFO_LIST");
        f100166c = sb6.toString();
        f100167d = jz5.h.b(b95.c.f100162d);
    }

    public j() {
        if (!b95.l.f100169a) {
            java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue(10, new b95.k());
            java.util.LinkedList linkedList = new java.util.LinkedList();
            b95.l.a(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_RECENT_FORWARD_CONVERSATION_STRING_SYNC, priorityQueue);
            b95.l.a(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_RECENT_FORWARD_CONVERSATION_GROUP_STRING_SYNC, priorityQueue);
            while (priorityQueue.peek() != null) {
                linkedList.add((com.p314xaae8f345.mm.p2621x8fb0427b.ea) priorityQueue.poll());
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.fa b17 = b();
            b17.f275471d.addAll(0, linkedList);
            f(b17);
            b95.l.f100169a = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecentForwardStorage", "dataTransfer: infoList.size:" + linkedList.size());
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.fa b18 = b();
        if (b18.f275471d.size() == 0) {
            return;
        }
        if (b18.f275472e == 0) {
            java.util.LinkedList<com.p314xaae8f345.mm.p2621x8fb0427b.ea> info_list = b18.f275471d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info_list, "info_list");
            for (com.p314xaae8f345.mm.p2621x8fb0427b.ea eaVar : info_list) {
                eaVar.f275421g = 1;
                java.util.LinkedList linkedList2 = eaVar.f275422h;
                com.p314xaae8f345.mm.p2621x8fb0427b.t7 t7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.t7();
                t7Var.f276861d = 1;
                long j17 = eaVar.f275419e;
                t7Var.f276862e = j17 - (j17 % 86400000);
                linkedList2.add(t7Var);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentForwardInfoStorage", "initForwardDataList, size:" + b18.f275471d.size());
            f(b18);
        }
        i();
    }

    public final boolean a(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.mm.p2621x8fb0427b.fa b17 = b();
        java.util.LinkedList<com.p314xaae8f345.mm.p2621x8fb0427b.ea> info_list = b17.f275471d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info_list, "info_list");
        for (com.p314xaae8f345.mm.p2621x8fb0427b.ea eaVar : info_list) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eaVar.f275418d, userName)) {
                b17.f275471d.remove(eaVar);
                f(b17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentForwardInfoStorage", "deleteShareInfo: " + userName + ' ');
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecentForwardInfoStorage", "deleteShareInfo: " + userName + " is fail");
        return false;
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.fa b() {
        com.p314xaae8f345.mm.p2621x8fb0427b.fa faVar = this.f100168a;
        if (faVar != null) {
            return faVar;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.fa faVar2 = new com.p314xaae8f345.mm.p2621x8fb0427b.fa();
        b95.d dVar = f100165b;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = b95.d.a(dVar);
        java.lang.String str = f100166c;
        if (a17.f(str)) {
            byte[] j17 = b95.d.a(dVar).j(str);
            if (j17 != null) {
                faVar2.mo11468x92b714fd(j17);
            }
        } else {
            byte[] j18 = b95.d.a(dVar).j("MMKV_KEY_RECENT_FORWARD_INFO_LIST");
            if (j18 != null) {
                faVar2.mo11468x92b714fd(j18);
            }
            f(faVar2);
        }
        this.f100168a = faVar2;
        return faVar2;
    }

    public final void c(java.util.LinkedList linkedList, java.util.LinkedList linkedList2, int i17, int i18) {
        java.util.Iterator it = linkedList.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext() && linkedList2.size() < i17) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            com.p314xaae8f345.mm.p2621x8fb0427b.ea eaVar = (com.p314xaae8f345.mm.p2621x8fb0427b.ea) next;
            java.lang.String str = eaVar.f275418d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            boolean z17 = false;
            if (!r26.n0.D(str, ",", false, 2, null)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(str);
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str);
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
                if (i18 == 2 && eaVar.f275420f == 2) {
                    linkedList2.add(str);
                    it.remove();
                }
            } else if (eaVar.f275420f != 2) {
                linkedList2.add(str);
                it.remove();
            }
        }
    }

    public final java.util.List d(int i17, int i18, int i19) {
        i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentForwardInfoStorage", "start query frequentCount:" + i17 + ", recentCount:" + i18 + ", type:" + i19);
        if (i17 <= 0 && i18 <= 0) {
            return d(5, 5, i19);
        }
        java.lang.Object clone = b().f275471d.clone();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(clone, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.storage.RecentForwardInfo>");
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
        java.util.List d17 = d(b95.b.a(), j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2532xd7a392c5.C20197xfa783561()), -1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : d17) {
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentForwardInfoStorage", "[query] list size=" + arrayList.size());
        return arrayList;
    }

    public final void f(com.p314xaae8f345.mm.p2621x8fb0427b.fa faVar) {
        b95.d.a(f100165b).H(f100166c, faVar.mo14344x5f01b1f6());
        this.f100168a = faVar;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentForwardInfoStorage", sb6.toString());
        if (list != null && (list.isEmpty() ^ true)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.fa b17 = b();
            long c17 = c01.id.c();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = b17.f275471d.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.ea eaVar = (com.p314xaae8f345.mm.p2621x8fb0427b.ea) it.next();
                if (list.contains(eaVar.f275418d)) {
                    eaVar.f275419e = c17;
                    eaVar.f275421g++;
                    long j17 = c17 - (c17 % 86400000);
                    java.util.LinkedList count_list = eaVar.f275422h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(count_list, "count_list");
                    com.p314xaae8f345.mm.p2621x8fb0427b.t7 t7Var = (com.p314xaae8f345.mm.p2621x8fb0427b.t7) kz5.n0.k0(count_list);
                    if (t7Var != null && t7Var.f276862e == j17) {
                        ((com.p314xaae8f345.mm.p2621x8fb0427b.t7) kz5.n0.i0(count_list)).f276861d++;
                    } else {
                        com.p314xaae8f345.mm.p2621x8fb0427b.t7 t7Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.t7();
                        t7Var2.f276861d = 1;
                        t7Var2.f276862e = j17;
                        count_list.add(t7Var2);
                    }
                    arrayList.add(eaVar.f275418d);
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
                java.util.LinkedList linkedList = b17.f275471d;
                com.p314xaae8f345.mm.p2621x8fb0427b.ea eaVar2 = new com.p314xaae8f345.mm.p2621x8fb0427b.ea();
                eaVar2.f275418d = str;
                eaVar2.f275419e = c17;
                eaVar2.f275420f = f100165b.b(str);
                eaVar2.f275421g = 1;
                java.util.LinkedList linkedList2 = eaVar2.f275422h;
                com.p314xaae8f345.mm.p2621x8fb0427b.t7 t7Var3 = new com.p314xaae8f345.mm.p2621x8fb0427b.t7();
                t7Var3.f276861d = 1;
                t7Var3.f276862e = c17 - (c17 % 86400000);
                linkedList2.add(t7Var3);
                linkedList.add(eaVar2);
            }
            java.util.LinkedList info_list = b17.f275471d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info_list, "info_list");
            b17.f275471d = new java.util.LinkedList(kz5.n0.F0(info_list, new b95.g(new b95.f())));
            f(b17);
        }
    }

    public final void i() {
        int i17;
        com.p314xaae8f345.mm.p2621x8fb0427b.fa b17 = b();
        long j17 = b17.f275472e;
        long c17 = c01.id.c();
        if (c17 - (c17 % 86400000) > j17) {
            long c18 = c01.id.c() - 2592000000L;
            long j18 = c18 - (c18 % 86400000);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentForwardInfoStorage", "start updateInfoListForTime " + b17.f275472e + ", " + j18);
            b17.f275472e = c01.id.c();
            java.util.Iterator it = b17.f275471d.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.ea eaVar = (com.p314xaae8f345.mm.p2621x8fb0427b.ea) it.next();
                long j19 = eaVar.f275419e;
                java.util.LinkedList linkedList = eaVar.f275422h;
                if (j19 < j18) {
                    eaVar.f275421g = 0;
                    linkedList.clear();
                } else {
                    java.util.Iterator it6 = linkedList.iterator();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it6, "iterator(...)");
                    while (it6.hasNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.t7 t7Var = (com.p314xaae8f345.mm.p2621x8fb0427b.t7) it6.next();
                        if (t7Var.f276862e < j18) {
                            eaVar.f275421g -= t7Var.f276861d;
                            it6.remove();
                        }
                    }
                }
            }
            java.util.LinkedList info_list = b17.f275471d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info_list, "info_list");
            java.util.LinkedList linkedList2 = new java.util.LinkedList(kz5.n0.F0(info_list, new b95.i(new b95.h())));
            b17.f275471d = linkedList2;
            java.util.Iterator it7 = linkedList2.iterator();
            int i18 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    i18 = -1;
                    break;
                } else {
                    if (((com.p314xaae8f345.mm.p2621x8fb0427b.ea) it7.next()).f275421g == 0) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            if (i18 != -1 && (i17 = i18 + 20) < b17.f275471d.size()) {
                java.util.List subList = b17.f275471d.subList(0, i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList, "subList(...)");
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                linkedList3.addAll(subList);
                b17.f275471d = linkedList3;
            }
            f(b17);
        }
    }
}

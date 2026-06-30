package g95;

/* loaded from: classes.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a() {
        boolean a17 = com.p314xaae8f345.mm.p670x38b72420.d.f146388g.a();
        p75.d dVar = dm.e2.T1;
        l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
        p75.m g17 = dVar.g(8, 0);
        g17.c(a17 ? dm.e2.Y1.i(2L) : dm.e2.P1.p("'@chatroom'"));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.e2.P1);
        p75.i0 g18 = dm.e2.N1.g(linkedList);
        g18.f434190d = g17;
        g18.d(linkedList2);
        g18.b(linkedList3);
        return g18.a().h(gm0.j1.u().f354686f);
    }

    public final java.util.List b(java.util.List usernameList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernameList, "usernameList");
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.util.List list : d75.b.c(usernameList, 100)) {
            p75.n0 n0Var = dm.e2.N1;
            p75.d dVar = dm.e2.P1;
            p75.i0 g17 = n0Var.g(kz5.b0.c(dVar));
            g17.f434190d = dVar.l(list).c(dm.e2.U1.g(8, 0));
            hashSet.addAll(kz5.n0.X0(g17.a().l(gm0.j1.u().f354686f)));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = usernameList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (hashSet.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final long c(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p75.n0 n0Var = dm.e2.N1;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.e2.Z1);
        p75.m d17 = dm.e2.P1.j(username).d(dm.e2.V1.j(username));
        p75.i0 g17 = dm.e2.N1.g(linkedList);
        g17.f434190d = d17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        return g17.a().n(gm0.j1.u().f354686f);
    }

    public final java.util.List d(java.util.List usernameList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernameList, "usernameList");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.List list : d75.b.c(usernameList, 100)) {
            p75.n0 n0Var = dm.e2.N1;
            p75.d dVar = dm.e2.P1;
            p75.i0 g17 = n0Var.g(kz5.c0.i(dVar, dm.e2.S1, dm.e2.R1, dm.e2.Q1));
            g17.f434190d = dVar.l(list);
            for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var : g17.a().k(gm0.j1.u().f354686f, com.p314xaae8f345.mm.p2621x8fb0427b.z3.class)) {
                java.lang.String d17 = z3Var.d1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                hashMap.put(d17, z3Var);
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) hashMap.get((java.lang.String) it.next());
                if (z3Var2 != null) {
                    arrayList.add(z3Var2);
                }
            }
        }
        return arrayList;
    }

    public final java.util.List e(java.util.List usernameList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernameList, "usernameList");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.List list : d75.b.c(usernameList, 100)) {
            p75.i0 i17 = dm.e2.N1.i();
            i17.f434190d = dm.e2.P1.l(list);
            for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var : i17.a().k(gm0.j1.u().f354686f, com.p314xaae8f345.mm.p2621x8fb0427b.z3.class)) {
                java.lang.String d17 = z3Var.d1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                hashMap.put(d17, z3Var);
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) hashMap.get((java.lang.String) it.next());
                if (z3Var2 != null) {
                    arrayList.add(z3Var2);
                }
            }
        }
        return arrayList;
    }

    public final java.util.List f(java.util.List usernameList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernameList, "usernameList");
        p75.i0 i17 = dm.e2.N1.i();
        i17.f434190d = dm.e2.P1.l(usernameList);
        p75.l0 a17 = i17.a();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var : a17.k(gm0.j1.u().f354686f, com.p314xaae8f345.mm.p2621x8fb0427b.z3.class)) {
            java.lang.String d17 = z3Var.d1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
            hashMap.put(d17, z3Var);
        }
        java.util.Iterator it = usernameList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) hashMap.get((java.lang.String) it.next());
            if (z3Var2 != null) {
                arrayList.add(z3Var2);
            }
        }
        return arrayList;
    }

    public final p75.m g() {
        p75.d dVar = dm.e2.T1;
        l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
        p75.m c17 = dVar.g(1, 1).c(new p75.o0("type", 32, 0)).c(new p75.o0("type", 8, 0));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
        return c17.c(new p75.o0("verifyFlag", 8, 0));
    }

    public final java.util.List h() {
        return kz5.c0.i(new p75.g("showHead", true), new g95.c());
    }
}

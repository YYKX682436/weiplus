package bu2;

/* loaded from: classes2.dex */
public final class d0 {
    public d0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static /* synthetic */ java.util.List i(bu2.d0 d0Var, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            str = "";
        }
        return d0Var.h(i17, str);
    }

    public final void a(int i17, java.lang.String username, java.util.LinkedList list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        if (!kz5.z.G(bu2.e0.f106032b, java.lang.Integer.valueOf(i17))) {
            return;
        }
        try {
            r45.y31 y31Var = new r45.y31();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((bu2.l0) it.next()).f106081a);
            }
            linkedList.addAll(arrayList);
            y31Var.set(0, linkedList);
            y31Var.set(1, username);
            y31Var.set(2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            bu2.a a17 = bu2.e0.f106035e.a(i17);
            r45.i31 i31Var = a17.f106026c;
            java.util.LinkedList m75941xfb821914 = i31Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getInfoList(...)");
            pm0.v.d0(m75941xfb821914, new bu2.c0(username));
            while (true) {
                int size = i31Var.m75941xfb821914(0).size();
                bu2.d0 d0Var = bu2.e0.f106031a;
                if (size <= 20) {
                    i31Var.m75941xfb821914(0).add(y31Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPage", "total cache username " + username + " type:" + i17 + " list " + list.size() + " totalCount: " + i31Var.m75941xfb821914(0).size());
                    b(a17);
                    return;
                }
                java.util.LinkedList m75941xfb8219142 = i31Var.m75941xfb821914(0);
                java.util.LinkedList m75941xfb8219143 = i31Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getInfoList(...)");
                m75941xfb8219142.remove(kz5.n0.a0(m75941xfb8219143, 0));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderPage", e17, "", new java.lang.Object[0]);
        }
    }

    public final void b(bu2.a aVar) {
        try {
            r45.i31 i31Var = aVar.f106026c;
            java.lang.String str = aVar.f106025b;
            byte[] mo14344x5f01b1f6 = i31Var.mo14344x5f01b1f6();
            pm0.c cVar = new pm0.c("cache2File");
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(((cq.k) i95.n0.c(cq.k.class)).Di(2));
            if (!r6Var.y()) {
                r6Var.l();
            }
            if (!r6Var.m()) {
                r6Var.J();
            }
            java.lang.String str2 = r6Var.o() + '/' + str + ".ext";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPage", "cache2File(result=" + com.p314xaae8f345.mm.vfs.w6.R(str2, mo14344x5f01b1f6) + ") " + str + ' ' + mo14344x5f01b1f6.length + ' ' + str2 + ' ' + cVar);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderPage", e17, "", new java.lang.Object[0]);
        }
    }

    public final void c(boolean z17) {
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        cq.e eVar = cq.k.f302754n;
        java.lang.String Di = ((cq.k) c17).Di(0);
        if (z17 && com.p314xaae8f345.mm.vfs.w6.j(Di)) {
            com.p314xaae8f345.mm.vfs.w6.f(Di);
            com.p314xaae8f345.mm.vfs.w6.u(Di);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPage", "del " + Di + " and ret " + com.p314xaae8f345.mm.vfs.w6.j(Di));
        }
        bu2.i0 i0Var = bu2.e0.f106034d;
        bu2.e0.f106035e = i0Var;
        for (bu2.a aVar : i0Var.f106066a) {
            aVar.f106027d = false;
            aVar.f106026c = new r45.i31();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPage", "clearAll " + bu2.e0.f106035e + ' ' + bu2.e0.f106035e.f106066a.length);
    }

    public final void d(int i17, java.lang.String username, yz5.l filter, boolean z17) {
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "filter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPage", "deleteData typeFlag: " + i17 + ", username: " + username + " isFlush: " + z17);
        l(i17);
        r45.y31 g17 = g(bu2.e0.f106035e.a(i17), username);
        if (g17 == null || (m75941xfb821914 = g17.m75941xfb821914(0)) == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        pm0.v.d0(m75941xfb821914, new bu2.v(filter, c0Var));
        if (c0Var.f391645d && z17) {
            bu2.e0.f106031a.b(bu2.e0.f106035e.a(i17));
        }
    }

    public final void e(long j17, int i17) {
        r45.y31 y31Var;
        java.util.LinkedList m75941xfb821914;
        l(i17);
        java.util.LinkedList m75941xfb8219142 = bu2.e0.f106035e.a(i17).f106026c.m75941xfb821914(0);
        if (m75941xfb8219142 == null || (y31Var = (r45.y31) kz5.n0.a0(m75941xfb8219142, 0)) == null || (m75941xfb821914 = y31Var.m75941xfb821914(0)) == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        pm0.v.d0(m75941xfb821914, new bu2.t(j17, c0Var));
        if (c0Var.f391645d) {
            bu2.e0.f106031a.b(bu2.e0.f106035e.a(i17));
        }
    }

    public final void f(java.lang.String str, r45.y31 y31Var) {
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        r45.nw1 m76794xd0557130;
        r45.nw1 m76794xd05571302;
        if (java.lang.System.currentTimeMillis() - (y31Var != null ? y31Var.m75942xfb822ef2(2) : 0L) > ((long) (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85354n2).mo141623x754a37bb()).r()).intValue() * com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8))) {
            java.util.ArrayList arrayList = null;
            if (y31Var != null && (m75941xfb821914 = y31Var.m75941xfb821914(0)) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : m75941xfb821914) {
                    r45.p21 p21Var = (r45.p21) obj;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) p21Var.m75936x14adae67(2);
                    boolean z17 = ((c19792x256d2725 == null || (m76794xd05571302 = c19792x256d2725.m76794xd0557130()) == null) ? null : java.lang.Long.valueOf(m76794xd05571302.m75942xfb822ef2(0))) != null;
                    if (z17) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(str);
                        sb6.append(" filter live:");
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) p21Var.m75936x14adae67(2);
                        sb6.append((c19792x256d27252 == null || (m76794xd0557130 = c19792x256d27252.m76794xd0557130()) == null) ? null : java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0)));
                        sb6.append(',');
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) p21Var.m75936x14adae67(2);
                        sb6.append((c19792x256d27253 == null || (m76802x2dd01666 = c19792x256d27253.m76802x2dd01666()) == null) ? null : m76802x2dd01666.m76944x730bcac6());
                        sb6.append(',');
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27254 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) p21Var.m75936x14adae67(2);
                        sb6.append((c19792x256d27254 == null || (m76760x76845fea = c19792x256d27254.m76760x76845fea()) == null) ? null : m76760x76845fea.m76184x8010e5e4());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPage", sb6.toString());
                    }
                    if (!z17) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            }
            if (y31Var == null) {
                return;
            }
            y31Var.set(0, new java.util.LinkedList(arrayList));
        }
    }

    public final r45.y31 g(bu2.a aVar, java.lang.String str) {
        r45.i31 i31Var;
        java.util.LinkedList m75941xfb821914;
        r45.i31 i31Var2;
        java.util.LinkedList m75941xfb8219142;
        java.lang.Object obj = null;
        if ((str.length() == 0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, g92.b.f351302e.T0())) {
            if (aVar == null || (i31Var = aVar.f106026c) == null || (m75941xfb821914 = i31Var.m75941xfb821914(0)) == null) {
                return null;
            }
            return (r45.y31) kz5.n0.a0(m75941xfb821914, 0);
        }
        if (aVar == null || (i31Var2 = aVar.f106026c) == null || (m75941xfb8219142 = i31Var2.m75941xfb821914(0)) == null) {
            return null;
        }
        java.util.Iterator it = m75941xfb8219142.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.y31) next).m75945x2fec8307(1), str)) {
                obj = next;
                break;
            }
        }
        return (r45.y31) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    public final java.util.List h(int i17, java.lang.String username) {
        r45.y31 y31Var;
        r45.y31 y31Var2;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList<r45.p21> m75941xfb8219142;
        so2.j5 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        l(i17);
        r45.i31 i31Var = bu2.e0.f106035e.a(i17).f106026c;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.Integer num = null;
        if (username.length() == 0) {
            java.util.LinkedList m75941xfb8219143 = i31Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getInfoList(...)");
            y31Var2 = (r45.y31) kz5.n0.a0(m75941xfb8219143, 0);
        } else {
            java.util.LinkedList m75941xfb8219144 = i31Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getInfoList(...)");
            java.util.Iterator it = m75941xfb8219144.iterator();
            while (true) {
                if (!it.hasNext()) {
                    y31Var = 0;
                    break;
                }
                y31Var = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.y31) y31Var).m75945x2fec8307(1), username)) {
                    break;
                }
            }
            y31Var2 = y31Var;
        }
        f("cacheToRVFeedList", y31Var2);
        if (y31Var2 != null && (m75941xfb8219142 = y31Var2.m75941xfb821914(0)) != null) {
            for (r45.p21 p21Var : m75941xfb8219142) {
                int m75939xb282bd08 = p21Var.m75939xb282bd08(5);
                bu2.l0 k0Var = m75939xb282bd08 == 0 ? new bu2.k0(p21Var) : m75939xb282bd08 == 1 ? new bu2.m0(p21Var) : m75939xb282bd08 == 3 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.e0(p21Var) : m75939xb282bd08 == 4 ? new bu2.n0(p21Var) : m75939xb282bd08 == 6 ? new bu2.j0(p21Var) : m75939xb282bd08 == 7 ? new bu2.o0(p21Var) : null;
                if (k0Var != null && (a17 = k0Var.a()) != null) {
                    linkedList.add(a17);
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("read cache type:");
        sb6.append(i17);
        sb6.append(" username:");
        sb6.append(username);
        sb6.append(" size:");
        if (y31Var2 != null && (m75941xfb821914 = y31Var2.m75941xfb821914(0)) != null) {
            num = java.lang.Integer.valueOf(m75941xfb821914.size());
        }
        sb6.append(num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPage", sb6.toString());
        bu2.d0 d0Var = bu2.e0.f106031a;
        return linkedList;
    }

    public final java.util.List j(java.lang.String username, int i17) {
        r45.y31 y31Var;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList<r45.p21> m75941xfb8219142;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        l(i17);
        r45.i31 i31Var = bu2.e0.f106035e.a(i17).f106026c;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.Integer num = null;
        if ((username.length() == 0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(username, g92.b.f351302e.T0())) {
            java.util.LinkedList m75941xfb8219143 = i31Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getInfoList(...)");
            y31Var = (r45.y31) kz5.n0.a0(m75941xfb8219143, 0);
        } else {
            y31Var = null;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y31Var != null ? y31Var.m75945x2fec8307(1) : null, username)) {
            java.util.LinkedList m75941xfb8219144 = i31Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getInfoList(...)");
            java.util.Iterator it = m75941xfb8219144.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.y31) obj).m75945x2fec8307(1), username)) {
                    break;
                }
            }
            y31Var = (r45.y31) obj;
        }
        f("cacheToFinderItemList", y31Var);
        if (y31Var != null && (m75941xfb8219142 = y31Var.m75941xfb821914(0)) != null) {
            for (r45.p21 p21Var : m75941xfb8219142) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p21Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = bu2.y.f106110a.a(p21Var);
                if (a17 != null) {
                    linkedList.add(a17);
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("read cache username:");
        sb6.append(username);
        sb6.append(" size:");
        if (y31Var != null && (m75941xfb821914 = y31Var.m75941xfb821914(0)) != null) {
            num = java.lang.Integer.valueOf(m75941xfb821914.size());
        }
        sb6.append(num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPage", sb6.toString());
        bu2.d0 d0Var = bu2.e0.f106031a;
        return linkedList;
    }

    public final java.util.List k(int i17) {
        r45.y31 y31Var;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList<r45.p21> m75941xfb8219142;
        r45.gk2 gk2Var;
        java.lang.Object obj;
        l(i17);
        r45.i31 i31Var = bu2.e0.f106035e.a(i17).f106026c;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.Integer num = null;
        if (("".length() == 0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("", g92.b.f351302e.T0())) {
            java.util.LinkedList m75941xfb8219143 = i31Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getInfoList(...)");
            y31Var = (r45.y31) kz5.n0.a0(m75941xfb8219143, 0);
        } else {
            java.util.LinkedList m75941xfb8219144 = i31Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getInfoList(...)");
            java.util.Iterator it = m75941xfb8219144.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.y31) obj).m75945x2fec8307(1), "")) {
                    break;
                }
            }
            y31Var = (r45.y31) obj;
        }
        if (y31Var != null && (m75941xfb8219142 = y31Var.m75941xfb821914(0)) != null) {
            for (r45.p21 p21Var : m75941xfb8219142) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p21Var);
                so2.k a17 = (!(p21Var.m75939xb282bd08(5) == 1) || (gk2Var = (r45.gk2) p21Var.m75936x14adae67(4)) == null) ? null : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.im.f188579a.a(gk2Var);
                if (a17 != null) {
                    linkedList.add(a17);
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("read cache username: size:");
        if (y31Var != null && (m75941xfb821914 = y31Var.m75941xfb821914(0)) != null) {
            num = java.lang.Integer.valueOf(m75941xfb821914.size());
        }
        sb6.append(num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPage", sb6.toString());
        bu2.d0 d0Var = bu2.e0.f106031a;
        return linkedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:8:0x001a, B:12:0x006c, B:14:0x007b, B:15:0x0080, B:17:0x00a0, B:18:0x00a5, B:35:0x0062, B:32:0x005d), top: B:7:0x001a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0 A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:8:0x001a, B:12:0x006c, B:14:0x007b, B:15:0x0080, B:17:0x00a0, B:18:0x00a5, B:35:0x0062, B:32:0x005d), top: B:7:0x001a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bu2.a l(int r12) {
        /*
            r11 = this;
            bu2.i0 r0 = bu2.e0.f106035e
            bu2.a r0 = r0.a(r12)
            boolean r0 = r0.f106027d
            if (r0 == 0) goto L11
            bu2.i0 r0 = bu2.e0.f106035e
            bu2.a r12 = r0.a(r12)
            return r12
        L11:
            bu2.i0 r0 = bu2.e0.f106035e
            java.lang.String r1 = ""
            java.lang.String r2 = "Finder.FinderPage"
            java.lang.String r3 = "file2Cache "
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La8
            r5.<init>()     // Catch: java.lang.Exception -> La8
            java.lang.Class<cq.k> r6 = cq.k.class
            i95.m r6 = i95.n0.c(r6)     // Catch: java.lang.Exception -> La8
            cq.k r6 = (cq.k) r6     // Catch: java.lang.Exception -> La8
            r7 = 2
            java.lang.String r6 = r6.Di(r7)     // Catch: java.lang.Exception -> La8
            r5.append(r6)     // Catch: java.lang.Exception -> La8
            r6 = 47
            r5.append(r6)     // Catch: java.lang.Exception -> La8
            bu2.i0 r6 = bu2.e0.f106035e     // Catch: java.lang.Exception -> La8
            bu2.a r6 = r6.a(r12)     // Catch: java.lang.Exception -> La8
            java.lang.String r6 = r6.f106025b     // Catch: java.lang.Exception -> La8
            r5.append(r6)     // Catch: java.lang.Exception -> La8
            java.lang.String r6 = ".ext"
            r5.append(r6)     // Catch: java.lang.Exception -> La8
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> La8
            pm0.c r6 = new pm0.c     // Catch: java.lang.Exception -> La8
            java.lang.String r7 = "file2Cache"
            r6.<init>(r7)     // Catch: java.lang.Exception -> La8
            r7 = -1
            byte[] r7 = com.p314xaae8f345.mm.vfs.w6.N(r5, r4, r7)     // Catch: java.lang.Exception -> La8
            r45.i31 r8 = new r45.i31     // Catch: java.lang.Exception -> La8
            r8.<init>()     // Catch: java.lang.Exception -> La8
            r9 = 0
            if (r7 != 0) goto L5d
            goto L6b
        L5d:
            r8.mo11468x92b714fd(r7)     // Catch: java.lang.Exception -> L61
            goto L6c
        L61:
            r8 = move-exception
            java.lang.String r10 = "safeParser"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Exception -> La8
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r10, r1, r8)     // Catch: java.lang.Exception -> La8
        L6b:
            r8 = r9
        L6c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La8
            r10.<init>(r3)     // Catch: java.lang.Exception -> La8
            r10.append(r12)     // Catch: java.lang.Exception -> La8
            java.lang.String r3 = "  "
            r10.append(r3)     // Catch: java.lang.Exception -> La8
            if (r7 == 0) goto L80
            int r3 = r7.length     // Catch: java.lang.Exception -> La8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> La8
        L80:
            r10.append(r9)     // Catch: java.lang.Exception -> La8
            r3 = 32
            r10.append(r3)     // Catch: java.lang.Exception -> La8
            r10.append(r5)     // Catch: java.lang.Exception -> La8
            r10.append(r3)     // Catch: java.lang.Exception -> La8
            r10.append(r6)     // Catch: java.lang.Exception -> La8
            java.lang.String r3 = r10.toString()     // Catch: java.lang.Exception -> La8
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3)     // Catch: java.lang.Exception -> La8
            bu2.i0 r3 = bu2.e0.f106035e     // Catch: java.lang.Exception -> La8
            bu2.a r3 = r3.a(r12)     // Catch: java.lang.Exception -> La8
            if (r8 != 0) goto La5
            r45.i31 r8 = new r45.i31     // Catch: java.lang.Exception -> La8
            r8.<init>()     // Catch: java.lang.Exception -> La8
        La5:
            r3.f106026c = r8     // Catch: java.lang.Exception -> La8
            goto Lae
        La8:
            r3 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r3, r1, r5)
        Lae:
            bu2.i0 r1 = bu2.e0.f106035e
            bu2.a r1 = r1.a(r12)
            r2 = 1
            r1.f106027d = r2
            bu2.i0 r1 = bu2.e0.f106035e
            bu2.a r1 = r1.a(r12)
            r0.getClass()
            bu2.a[] r0 = r0.f106066a
            int r2 = r0.length
            r3 = r4
        Lc4:
            if (r4 >= r2) goto Ld4
            r5 = r0[r4]
            int r6 = r3 + 1
            int r5 = r5.f106024a
            if (r12 != r5) goto Ld0
            r0[r3] = r1
        Ld0:
            int r4 = r4 + 1
            r3 = r6
            goto Lc4
        Ld4:
            bu2.i0 r0 = bu2.e0.f106035e
            bu2.a r12 = r0.a(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: bu2.d0.l(int):bu2.a");
    }

    public final void m(long j17, int i17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 item) {
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPage", "updatePageData pageName:" + i17 + ", svrId:" + j17);
        if (i17 < 0) {
            return;
        }
        try {
            l(i17);
            r45.y31 g17 = g(bu2.e0.f106035e.a(i17), "");
            if (g17 == null || (m75941xfb821914 = g17.m75941xfb821914(0)) == null || !bu2.y.f106110a.b(j17, item, m75941xfb821914)) {
                return;
            }
            bu2.e0.f106031a.b(bu2.e0.f106035e.a(i17));
        } catch (java.lang.Throwable th6) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderPage", th6, "updatePageData " + i17, new java.lang.Object[0]);
        }
    }
}

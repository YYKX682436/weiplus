package ir;

/* loaded from: classes15.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir.o f375412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ir.o oVar) {
        super(0);
        this.f375412d = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        java.lang.Object i1Var;
        ir.o oVar = this.f375412d;
        oVar.f375416d.f375424b.clear();
        oVar.f375416d.f375425c.clear();
        ir.h hVar = oVar.f375413a;
        if (hVar.f375376b) {
            oVar.f375416d.f375425c.add(new ir.y0(new ir.s(3), -1));
            oVar.f375416d.f375426d = 1;
        }
        if (hVar.f375377c) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247();
            c21051xbc71d247.f68396x5bec8145 = "smiley";
            c21051xbc71d247.f68391x4a7ba5e9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572638bx5);
            oVar.a(new ir.t(1, c21051xbc71d247));
        }
        if (hVar.f375378d) {
            oVar.a(ir.v0.b());
        }
        if (hVar.f375381g) {
            boolean z17 = hVar.f375382h;
            ir.i0 i0Var = new ir.i0(ir.v0.a());
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4> b17 = gr.t.g().b(true);
            b17.size();
            if (!b17.isEmpty()) {
                linkedList.add(i0Var);
                if (z17) {
                    linkedList.add(new ir.z(1));
                }
                pr.z zVar = pr.k0.f439256q;
                int a17 = zVar.a(false).a();
                int g17 = zVar.a(false).g();
                int i17 = 0;
                for (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 : b17) {
                    if (i17 >= g17) {
                        break;
                    }
                    if (i17 >= a17) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21053xdbf1e5f4);
                        linkedList.add(new ir.g(c21053xdbf1e5f4, 3, null, 0, 12, null));
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21053xdbf1e5f4);
                        linkedList.add(new ir.g(c21053xdbf1e5f4, 1, null, 0, 12, null));
                    }
                    i17++;
                }
                if (pr.k0.f439256q.a(false).c()) {
                    linkedList.add(new ir.e0(1));
                }
            } else if (z17) {
                linkedList.add(new ir.b());
            }
            if (!linkedList.isEmpty()) {
                oVar.a(ir.v0.a());
            }
        }
        boolean Di = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6.class))).Di();
        hVar.f375386l = false;
        if (hVar.f375383i) {
            if (!Di) {
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247> d17 = gr.t.g().d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getEmojiGroupInfoList(...)");
                for (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d2472 : d17) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21051xbc71d2472);
                    linkedList2.add(new ir.t(0, c21051xbc71d2472));
                }
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    oVar.a((ir.r) it.next());
                }
            } else if (hVar.f375385k) {
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                gr.t g18 = gr.t.g();
                java.util.concurrent.locks.ReentrantLock reentrantLock = g18.f356223i;
                try {
                    reentrantLock.lock();
                    java.util.ArrayList d18 = g18.d();
                    if (g18.f356222h == null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        g18.f356222h = arrayList;
                        arrayList.addAll(gr.p.f356206c.a(d18));
                    }
                    java.util.ArrayList arrayList2 = g18.f356222h;
                    reentrantLock.unlock();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList2);
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        gr.p pVar = (gr.p) it6.next();
                        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 c21052x34cf13a3 = pVar.f356207a;
                        java.util.LinkedList linkedList4 = pVar.f356208b;
                        if (linkedList4.size() == 1) {
                            java.lang.Object obj2 = linkedList4.get(0);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                            linkedList3.add(new ir.t(0, (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247) obj2));
                        } else if (c21052x34cf13a3 != null) {
                            ir.u uVar = new ir.u(c21052x34cf13a3);
                            uVar.f375438c.addAll(linkedList4);
                            uVar.f375439d = hVar.f375389o;
                            linkedList3.add(uVar);
                            hVar.f375386l = true;
                        }
                    }
                    java.util.Iterator it7 = linkedList3.iterator();
                    while (it7.hasNext()) {
                        oVar.a((ir.r) it7.next());
                    }
                } catch (java.lang.Throwable th6) {
                    reentrantLock.unlock();
                    throw th6;
                }
            } else {
                java.util.LinkedList<ir.r> linkedList5 = new java.util.LinkedList();
                java.util.HashMap hashMap = new java.util.HashMap();
                s25.b Bi = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi();
                java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247> d19 = gr.t.g().d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d19, "getEmojiGroupInfoList(...)");
                for (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d2473 : d19) {
                    java.lang.String str = c21051xbc71d2473.f68380x29449433;
                    com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 k17 = Bi.k(str);
                    if (k17 == null) {
                        linkedList5.add(new ir.t(0, c21051xbc71d2473));
                    } else {
                        ir.u uVar2 = (ir.u) hashMap.get(str);
                        if (uVar2 == null) {
                            uVar2 = new ir.u(k17);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                            hashMap.put(str, uVar2);
                        }
                        uVar2.f375438c.add(c21051xbc71d2473);
                        ir.t tVar = new ir.t(0, c21051xbc71d2473);
                        if (hVar.f375384j) {
                            linkedList5.add(new ir.v(tVar, uVar2));
                        } else {
                            linkedList5.add(new ir.t(0, c21051xbc71d2473));
                        }
                    }
                }
                for (ir.r rVar : linkedList5) {
                    if (rVar instanceof ir.v) {
                        ir.v vVar = (ir.v) rVar;
                        if (vVar.f375442c.f375438c.size() == 1) {
                            oVar.a(vVar.f375441b);
                        }
                    }
                    oVar.a(rVar);
                }
            }
        }
        java.util.Iterator it8 = oVar.f375416d.f375424b.iterator();
        while (it8.hasNext()) {
            ir.r group = (ir.r) it8.next();
            java.util.Iterator it9 = oVar.f375415c.f375423a.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it9.next();
                if (((ir.t0) obj).b().p().b(group)) {
                    break;
                }
            }
            ir.t0 t0Var = (ir.t0) obj;
            if (t0Var != null) {
                t0Var.e();
                if ((t0Var instanceof ir.g1) && (group instanceof ir.t)) {
                    ir.t tVar2 = (ir.t) group;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tVar2, "<set-?>");
                    ((ir.g1) t0Var).f375373d = tVar2;
                }
                oVar.f375416d.f375423a.add(t0Var);
            } else {
                java.util.ArrayList arrayList3 = oVar.f375416d.f375423a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(group, "group");
                java.lang.String c17 = group.c();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, "smiley")) {
                    i1Var = new ir.c1(hVar);
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, "custom")) {
                    i1Var = new ir.f(hVar);
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, "capture")) {
                    i1Var = new ir.d(hVar);
                } else {
                    i1Var = group instanceof ir.u ? new ir.i1((ir.u) group) : group instanceof ir.v ? new ir.h1((ir.v) group) : new ir.g1((ir.t) group);
                }
                arrayList3.add(i1Var);
            }
        }
        oVar.f375417e = p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new ir.i(oVar), false);
        oVar.f375418f = p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new ir.j(oVar), false);
        oVar.f375415c = oVar.f375416d;
        oVar.f375416d = new ir.q();
        pm0.v.X(new ir.m(oVar, oVar.f375415c));
        return jz5.f0.f384359a;
    }
}

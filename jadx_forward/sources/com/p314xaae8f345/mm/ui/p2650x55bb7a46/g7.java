package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public final class g7 {
    public g7(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(android.content.Context context, java.util.List msgInfoList, java.lang.String fromTalker, ot0.f3 f3Var) {
        android.content.Context context2;
        java.lang.Class<pt.k0> cls;
        java.lang.String string;
        gu.h hVar;
        java.lang.String m157696xfb865c31;
        l15.c cVar;
        s15.w wVar;
        if (msgInfoList == null || msgInfoList.isEmpty()) {
            return false;
        }
        if (fromTalker == null || r26.n0.N(fromTalker)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.a();
        android.content.Context context3 = context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
        java.lang.Class<pt.k0> cls2 = pt.k0.class;
        ot.q qVar = (ot.q) ((pt.k0) i95.n0.c(cls2));
        qVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromTalker, "fromTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfoList, "msgInfoList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgRecordFeatureService", "buildRecordXml fromTalker:" + fromTalker + " msgSize:" + msgInfoList.size());
        if (msgInfoList.isEmpty()) {
            hVar = new gu.h(gu.i.f357137e);
            context2 = context3;
            cls = cls2;
        } else {
            java.util.List F0 = kz5.n0.F0(msgInfoList, new ot.o());
            l15.c cVar2 = new l15.c();
            s15.w wVar2 = new s15.w();
            java.util.Iterator it = F0.iterator();
            int i17 = 0;
            while (true) {
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    jz5.f0 f0Var = null;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) next;
                    s15.h hVar2 = new s15.h();
                    p15.e eVar = new p15.e();
                    java.lang.String str = f9Var.G;
                    if (str == null) {
                        str = "";
                    }
                    eVar.m126728xdc93280d(str);
                    oi3.e qj6 = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(f9Var);
                    java.lang.String h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h17);
                    java.util.Iterator it6 = it;
                    hVar2.set(hVar2.f384955d + 3, h17);
                    int i19 = qj6.f427150d;
                    int i27 = i19 + 2;
                    long j17 = 1000;
                    context2 = context3;
                    cls = cls2;
                    l15.c cVar3 = cVar2;
                    java.lang.String d17 = k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, qj6.m75942xfb822ef2(i27) / j17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "formatTime(...)");
                    hVar2.T0(d17);
                    hVar2.W0(qj6.m75942xfb822ef2(i27) / j17);
                    java.lang.String r17 = c01.z1.r();
                    if (qj6.m75939xb282bd08(i19 + 9) == 0) {
                        int i28 = i19 + 3;
                        r17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(qj6.m75945x2fec8307(i28)) ? qj6.m75945x2fec8307(i19 + 11) : qj6.m75945x2fec8307(i28);
                    }
                    hVar2.m0(new s15.i());
                    s15.i p17 = hVar2.p();
                    if (p17 != null) {
                        p17.n(qj6.m75945x2fec8307(i19 + 3));
                    }
                    s15.i p18 = hVar2.p();
                    if (p18 != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
                        p18.p(r17);
                    }
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(r17);
                    if (n07 != null) {
                        java.lang.String d18 = n07.d();
                        if (d18 == null) {
                            d18 = "";
                        }
                        hVar2.R0(d18);
                    }
                    java.lang.String Ai = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).Ai(r17, 3);
                    if (Ai == null) {
                        Ai = "";
                    }
                    s15.i p19 = hVar2.p();
                    if (p19 != null) {
                        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(r17)) {
                            Ai = Ai.concat("@weclaw");
                        }
                        p19.o(Ai);
                    }
                    java.lang.String Ni = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Ni(r17);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ni)) {
                        Ni = com.p314xaae8f345.mm.p670x38b72420.u.a();
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Ni);
                    }
                    hVar2.S0(Ni);
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(r17)) {
                        java.lang.String a17 = t41.g.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(r17, true));
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                            if (a17 == null) {
                                a17 = "";
                            }
                            hVar2.Q0(a17);
                        }
                    }
                    if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(r17)) {
                        java.lang.String Vi = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Vi(r17);
                        java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(Vi, ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Ui(r17));
                        if (fj6 == null) {
                            fj6 = "";
                        }
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("3552365301", Vi)) {
                            fj6 = "@".concat(fj6);
                        }
                        hVar2.Q0(fj6);
                    }
                    p15.s q17 = eVar.q();
                    hVar2.I0((q17 == null || (m157696xfb865c31 = q17.m157696xfb865c31()) == null) ? "" : m157696xfb865c31);
                    hVar2.C0(qj6.m75942xfb822ef2(i19 + 1));
                    if (c01.ja.f118803a.a(f9Var)) {
                        int i29 = i19 + 4;
                        java.lang.Class cls3 = (java.lang.Class) ((java.util.HashMap) ((jz5.n) qVar.f429861m).mo141623x754a37bb()).get(java.lang.Integer.valueOf(qj6.m75939xb282bd08(i29)));
                        if (cls3 != null) {
                            java.lang.Object newInstance = cls3.getConstructors()[0].newInstance(new java.lang.Object[0]);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.feature.appmsg.record.IAppMsgRecordBuildXmlApi");
                            if (!((gu.e) newInstance).a(qj6, hVar2)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgRecordFeatureService", "buildRecordXml beforeInsertDB error type:" + qj6.m75939xb282bd08(i29) + " msgId:" + qj6.m75942xfb822ef2(i19 + 0));
                                hVar = new gu.h(gu.i.f357138f);
                                break;
                            }
                            f0Var = jz5.f0.f384359a;
                        }
                        if (f0Var == null) {
                            new ku.j().a(qj6, hVar2);
                        }
                    } else {
                        new ku.j().a(qj6, hVar2);
                    }
                    wVar2.j().add(hVar2);
                    it = it6;
                    cVar2 = cVar3;
                    i17 = i18;
                    context3 = context2;
                    cls2 = cls;
                } else {
                    context2 = context3;
                    cls = cls2;
                    l15.c cVar4 = cVar2;
                    wVar2.k(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(fromTalker) ? 1 : 0);
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(fromTalker)) {
                        string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hsy);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    } else {
                        java.lang.String l17 = c01.z1.l();
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
                            l17 = com.p314xaae8f345.mm.p670x38b72420.u.a();
                        }
                        java.lang.String Ni2 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Ni(fromTalker);
                        java.lang.String str2 = Ni2 == null ? "" : Ni2;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l17, str2)) {
                            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cc6, l17);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        } else {
                            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572741cc5, l17, str2);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        }
                    }
                    int i37 = wVar2.f384956d;
                    int i38 = i37 + 0;
                    wVar2.set(i38, string);
                    int i39 = i37 + 1;
                    wVar2.set(i39, qVar.bj(wVar2));
                    v05.b bVar = new v05.b();
                    java.lang.String m75945x2fec8307 = wVar2.m75945x2fec8307(i38);
                    int i47 = bVar.f449898d;
                    bVar.set(i47 + 2, m75945x2fec8307);
                    bVar.set(i47 + 5, "view");
                    bVar.set(i47 + 3, wVar2.m75945x2fec8307(i39));
                    bVar.set(i47 + 6, 19);
                    bVar.set(i47 + 9, "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/favorite_record__w_unsupport&from=singlemessage&isappinstalled=0");
                    bVar.set(bVar.f513848e + 44, wVar2.m126747x696739c());
                    cVar4.q(bVar);
                    hVar = new gu.h(gu.i.f357136d);
                    hVar.f357134b = cVar4;
                    hVar.f357135c = wVar2;
                }
            }
        }
        if (hVar.f357133a != gu.i.f357136d || (cVar = hVar.f357134b) == null || (wVar = hVar.f357135c) == null) {
            return false;
        }
        long Ai2 = ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).Ai();
        long i48 = ip.c.i();
        java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong();
        ((ot.q) ((pt.k0) i95.n0.c(cls))).fj(wVar, atomicLong2, atomicLong);
        if (atomicLong2.get() > Ai2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            java.lang.Object[] objArr = {com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(Ai2)};
            android.content.Context context4 = context2;
            aVar.f293262s = context4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cf8, objArr);
            aVar.f293265v = context4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context4, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            j0Var.show();
            return false;
        }
        android.content.Context context5 = context2;
        if (atomicLong.get() > i48) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar2.f293262s = context5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572767cf2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(i48));
            aVar2.f293265v = context5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context5, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var2.e(aVar2);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var2 = aVar2.f293256m;
            if (d0Var2 != null) {
                d0Var2.a(j0Var2.f293370r);
            }
            j0Var2.show();
            return false;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it7 = msgInfoList.iterator();
        while (it7.hasNext()) {
            linkedList.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it7.next()).m124847x74d37ac6()));
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.f287761a.f287736c = new java.lang.ref.WeakReference(f3Var);
        ld5.a aVar3 = new ld5.a();
        aVar3.set(aVar3.f125235d + 1, fromTalker);
        aVar3.l(linkedList);
        aVar3.n(cVar);
        n13.r rVar = new n13.r();
        rVar.f415650a = true;
        rVar.f415653d.f415672a = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.b(fromTalker);
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(context5, aVar3, rVar);
        return true;
    }
}

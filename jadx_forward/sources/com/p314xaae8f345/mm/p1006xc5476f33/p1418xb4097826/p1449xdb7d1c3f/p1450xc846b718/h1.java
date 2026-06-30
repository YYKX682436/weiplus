package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.h1 f187077a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.h1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f187078b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f187079c;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(2);
        hashSet.add(29);
        hashSet.add(1006);
        hashSet.add(15);
        f187078b = hashSet;
        f187079c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g1.f187068d);
    }

    public final void a(java.util.LinkedList redDotList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotList, "redDotList");
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_REDDOT_MULTI_USERNAME_UPDATE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MultiUserChecker", "check isUpdate:" + ((java.lang.Boolean) m17).booleanValue() + " username: " + g92.b.f351302e.T0());
        java.util.Iterator it = redDotList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) it.next();
            if (f187078b.contains(java.lang.Integer.valueOf(jbVar.m55856xfb85f7b0())) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jbVar.f65874xb5f7102a.f470029q)) {
                jbVar.f65874xb5f7102a.f470029q = g92.b.f351302e.T0();
            }
        }
        g92.b bVar = g92.b.f351302e;
        m92.h h66 = bVar.h6();
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = h66.f406518h;
        jz5.g gVar = f187079c;
        if (!copyOnWriteArraySet.contains((l92.c) ((jz5.n) gVar).mo141623x754a37bb())) {
            h66.f406518h.add((l92.c) ((jz5.n) gVar).mo141623x754a37bb());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MultiUserChecker", "add accountChangeListener");
        }
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_MSG_SYSTEM_INT_SYNC, 0);
        java.lang.String T0 = bVar.T0();
        if (T0 == null) {
            T0 = "";
        }
        m92.c cVar = new m92.c(T0);
        cVar.f68721x6e5f342 = r17;
        bVar.C(cVar, m92.j.f406541z);
    }
}

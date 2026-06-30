package kr2;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: h, reason: collision with root package name */
    public static final kr2.m f392850h = new kr2.m(null);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f392851i = jz5.h.b(kr2.l.f392846d);

    /* renamed from: b, reason: collision with root package name */
    public boolean f392853b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f392852a = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f392854c = kz5.c0.i(1, 2);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f392855d = kz5.c0.i(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f392856e = kz5.c0.i(1, 2);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f392857f = kz5.b0.c(1);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f392858g = jz5.h.b(new kr2.p(this));

    public static final int a(kr2.q qVar, java.util.List list) {
        qVar.getClass();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 |= ((java.lang.Number) it.next()).intValue();
        }
        return i17;
    }

    public final void b() {
        java.util.List list = this.f392852a;
        try {
            if (this.f392853b) {
                return;
            }
            list.clear();
            java.util.Iterator it = e().iterator();
            while (it.hasNext()) {
                kr2.w d17 = d((kr2.x) it.next());
                r45.al2 al2Var = d17.f392866a;
                if ((c01.id.c() / 1000) - al2Var.m75942xfb822ef2(4) > 2592000) {
                    f(al2Var.m75942xfb822ef2(0));
                } else {
                    list.add(d17);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NpsSurveyConfMgr", "checkLoadFromDb load config from db, size = " + list.size());
            this.f392853b = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.NpsSurveyConfMgr", "checkLoadFromDb failed, message = " + e17.getMessage());
        }
    }

    public final void c(r45.al2 config, boolean z17, long j17) {
        java.lang.Object obj;
        boolean add;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        kr2.w wVar = new kr2.w(config, z17, j17);
        r45.al2 al2Var = wVar.f392866a;
        g(al2Var.m75942xfb822ef2(0));
        b();
        java.util.List list = this.f392852a;
        int size = list.size();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((kr2.w) obj).f392866a.m75942xfb822ef2(4) > al2Var.m75942xfb822ef2(4)) {
                    break;
                }
            }
        }
        kr2.w wVar2 = (kr2.w) obj;
        if (wVar2 != null) {
            size = list.indexOf(wVar2);
        }
        if (size < 0 || size > list.size()) {
            add = list.add(wVar);
        } else {
            list.add(size, wVar);
            add = true;
        }
        kr2.x xVar = new kr2.x();
        xVar.f67697x11522065 = al2Var.m75942xfb822ef2(0);
        xVar.f67687x81ab6b1d = al2Var.m75939xb282bd08(1);
        java.util.LinkedList m75941xfb821914 = al2Var.m75941xfb821914(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFeed_pos(...)");
        xVar.f67693x3a65b591 = kz5.n0.g0(m75941xfb821914, ",", null, null, 0, null, kr2.n.f392847d, 30, null);
        xVar.f67689x2556f467 = al2Var.m75939xb282bd08(3);
        xVar.f67696x1bb3b54a = al2Var.m75942xfb822ef2(4);
        xVar.f67691x876650f1 = al2Var.m75942xfb822ef2(5);
        xVar.f67690xb36a1d8c = al2Var.m75939xb282bd08(6);
        xVar.f67695x65185639 = al2Var.m75933x41a8a7f2(7);
        xVar.f67688x515b52a0 = al2Var.m75938x746dc8a6(8);
        xVar.f67685xd503b39c = al2Var.m75938x746dc8a6(9);
        xVar.f67692xe4519518 = al2Var.m75942xfb822ef2(10);
        xVar.f67694xfee77594 = wVar.f392867b;
        xVar.f67686xd738625b = wVar.f392868c;
        boolean mo880xb970c2b9 = ((kr2.r) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).f120669y).mo141623x754a37bb()).mo880xb970c2b9(xVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NpsSurveyConfMgr", "insert conf = " + xVar + " success = " + mo880xb970c2b9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NpsSurveyConfMgr", "insertConfig taskId = " + al2Var.m75942xfb822ef2(0) + " memoryAdded = " + add + " dbAdded = " + mo880xb970c2b9);
    }

    public final kr2.w d(kr2.x xVar) {
        java.util.LinkedList linkedList;
        r45.al2 al2Var = new r45.al2();
        al2Var.set(0, java.lang.Long.valueOf(xVar.f67697x11522065));
        al2Var.set(1, java.lang.Integer.valueOf(xVar.f67687x81ab6b1d));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xVar.f67693x3a65b591)) {
            linkedList = new java.util.LinkedList();
        } else {
            java.lang.String field_feedPos = xVar.f67693x3a65b591;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_feedPos, "field_feedPos");
            java.util.List f07 = r26.n0.f0(field_feedPos, new java.lang.String[]{","}, false, 0, 6, null);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(f07, 10));
            java.util.Iterator it = f07.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) it.next(), -1)));
            }
            linkedList = new java.util.LinkedList(arrayList);
        }
        al2Var.set(2, linkedList);
        al2Var.set(3, java.lang.Integer.valueOf(xVar.f67689x2556f467));
        al2Var.set(4, java.lang.Long.valueOf(xVar.f67696x1bb3b54a));
        al2Var.set(5, java.lang.Long.valueOf(xVar.f67691x876650f1));
        al2Var.set(6, java.lang.Integer.valueOf(xVar.f67690xb36a1d8c));
        al2Var.set(7, java.lang.Boolean.valueOf(xVar.f67695x65185639));
        al2Var.set(8, java.lang.Float.valueOf(xVar.f67688x515b52a0));
        al2Var.set(9, java.lang.Float.valueOf(xVar.f67685xd503b39c));
        al2Var.set(10, java.lang.Long.valueOf(xVar.f67692xe4519518));
        return new kr2.w(al2Var, xVar.f67694xfee77594, xVar.f67686xd738625b);
    }

    public final java.util.List e() {
        java.util.LinkedList linkedList;
        kr2.r rVar = (kr2.r) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).f120669y).mo141623x754a37bb();
        java.lang.String str = "SELECT * FROM " + rVar.mo145255x88e404c3() + " ORDER BY startTime ASC";
        android.database.Cursor m145256x1d3f4980 = rVar.m145256x1d3f4980(str, new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            linkedList = new java.util.LinkedList();
            while (m145256x1d3f4980.moveToNext()) {
                try {
                    l75.f0 f0Var = (l75.f0) kr2.x.class.newInstance();
                    f0Var.mo9015xbf5d97fd(m145256x1d3f4980);
                    linkedList.add(f0Var);
                } finally {
                }
            }
            vz5.b.a(m145256x1d3f4980, null);
        } else {
            linkedList = new java.util.LinkedList();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NpsSurveyConfMgr", "queryAll sql: " + str + ", size: " + linkedList.size());
        return linkedList;
    }

    public final boolean f(long j17) {
        kr2.r rVar = (kr2.r) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).f120669y).mo141623x754a37bb();
        java.lang.String str = "DELETE FROM " + rVar.mo145255x88e404c3() + " WHERE taskId = " + j17;
        boolean m145253xb158737d = rVar.m145253xb158737d(rVar.mo145255x88e404c3(), str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NpsSurveyConfMgr", "removeById sql: " + str + ", success: " + m145253xb158737d);
        return m145253xb158737d;
    }

    public final void g(long j17) {
        boolean f17 = f(j17);
        b();
        java.util.List configList = this.f392852a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(configList, "configList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NpsSurveyConfMgr", "removeConfig taskId = " + j17 + " memoryRemoved = " + kz5.h0.B(configList, new kr2.o(j17)) + " dbRemoved = " + f17);
    }
}

package rl2;

/* loaded from: classes8.dex */
public final class v extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final rl2.n f478745e = new rl2.n(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f478746f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Vector f478747g;

    /* renamed from: h, reason: collision with root package name */
    public static d95.b0 f478748h;

    /* renamed from: i, reason: collision with root package name */
    public static rl2.v f478749i;

    /* renamed from: d, reason: collision with root package name */
    public final d95.b0 f478750d;

    static {
        java.lang.String m145250x3fdc6f77 = l75.n0.m145250x3fdc6f77(dm.s4.D, "FinderLiveTipsBar");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m145250x3fdc6f77, "getCreateSQLs(...)");
        f478746f = new java.lang.String[]{m145250x3fdc6f77};
        f478747g = new java.util.Vector();
    }

    public v(d95.b0 b0Var, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(b0Var, dm.s4.D, "FinderLiveTipsBar", null);
        this.f478750d = b0Var;
    }

    public static final java.util.List y0(rl2.v vVar) {
        vVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarStorage", "getAllData:SELECT * FROM FinderLiveTipsBar");
        android.database.Cursor f17 = vVar.f478750d.f("SELECT * FROM FinderLiveTipsBar", null, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "rawQuery(...)");
        while (f17.moveToNext()) {
            dm.s4 s4Var = new dm.s4();
            s4Var.mo9015xbf5d97fd(f17);
            linkedList.add(s4Var);
        }
        f17.close();
        return linkedList;
    }

    public int D0(java.lang.String hostRoomId) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hostRoomId, "hostRoomId");
        java.util.Vector vector = f478747g;
        synchronized (vector) {
            java.util.Iterator it = vector.iterator();
            int i18 = 0;
            while (true) {
                i17 = -1;
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((dm.s4) it.next()).f68257x7560f783, hostRoomId)) {
                    break;
                }
                i18++;
            }
            if (!(i18 >= 0)) {
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarStorage", "getLiveIconState " + hostRoomId);
            java.util.Iterator it6 = f478747g.iterator();
            int i19 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                dm.s4 s4Var = (dm.s4) it6.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s4Var.f68257x7560f783, hostRoomId) && !s4Var.f68259x2c72afa8) {
                    i17 = i19;
                    break;
                }
                i19++;
            }
            return i17 >= 0 ? 2 : 1;
        }
    }

    public final void J0(java.lang.String chatRoomId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatRoomId, "chatRoomId");
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        if (!(Di instanceof l75.a1)) {
            Di = null;
        }
        if (Di != null) {
            pm0.v.X(new rl2.u(chatRoomId, Di));
        }
    }

    public final void z0(long j17, boolean z17) {
        java.lang.String str = "SELECT * FROM FinderLiveTipsBar WHERE liveId = '" + j17 + '\'';
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarStorage", "deleteByLiveId, liveId:" + pm0.v.u(j17) + ", sql:" + str);
        java.lang.String str2 = null;
        android.database.Cursor f17 = this.f478750d.f(str, null, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "rawQuery(...)");
        if (f17.moveToFirst()) {
            dm.s4 s4Var = new dm.s4();
            s4Var.mo9015xbf5d97fd(f17);
            str2 = s4Var.f68257x7560f783;
        }
        f17.close();
        int mo70514xb06685ab = this.f478750d.mo70514xb06685ab("FinderLiveTipsBar", "liveId= ? ", new java.lang.String[]{"" + j17});
        if (mo70514xb06685ab < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveTipsBarStorage", "deleteByLiveId failed, result:" + mo70514xb06685ab);
        } else {
            java.util.Vector vector = f478747g;
            synchronized (vector) {
                pm0.v.c0(vector, new rl2.p(j17));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveTipsBarStorage", "deleteByLiveId success, liveId::" + pm0.v.u(j17) + ", hostRoomId:" + str2);
        }
        if (str2 != null) {
            if (z17) {
                for (fs.q qVar : ((fs.c) fs.g.f(ps5.f.class)).all()) {
                    if (fs.g.d(fs.g.f347619c, qVar)) {
                        ((yj5.w) ((ps5.f) ((fs.n) qVar.get()))).b(str2);
                    }
                }
            }
            J0(str2);
        }
    }
}

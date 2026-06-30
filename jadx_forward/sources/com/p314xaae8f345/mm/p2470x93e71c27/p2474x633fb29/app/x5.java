package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public class x5 {

    /* renamed from: i, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x5 f270675i;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f270678c;

    /* renamed from: e, reason: collision with root package name */
    public long f270680e;

    /* renamed from: h, reason: collision with root package name */
    public long f270683h;

    /* renamed from: a, reason: collision with root package name */
    public boolean f270676a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f270677b = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f270679d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f270681f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f270682g = false;

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x5 c() {
        if (f270675i == null) {
            f270675i = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x5();
        }
        return f270675i;
    }

    public final void a(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, r45.qe4 qe4Var) {
        mVar.f67372x453d1e07 = qe4Var.f465430i;
        mVar.f67373x634ac1e1 = qe4Var.f465426e;
        mVar.f67375x634ac3bb = qe4Var.f465427f;
        mVar.f67374x634ac23b = qe4Var.f465439u;
        mVar.f319926y0 = qe4Var.f465428g;
        mVar.f319908l1 = qe4Var.f465429h;
        mVar.f319914p1 = qe4Var.f465433o;
        mVar.f67387x8aa40beb = qe4Var.f465432n;
        mVar.f67388x728ca6b = qe4Var.f465431m;
        mVar.f319924x1 = qe4Var.f465434p;
        mVar.A = true;
        mVar.f67389x84b4f099 = qe4Var.f465435q;
    }

    public final void b(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SuggestionAppListLogic", "get service app, offset = %d, lang = %s", java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y3 y3Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y3(i17, 20, str);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(y3Var);
    }

    public void d(android.content.Context context) {
        if (!gm0.j1.a() || context == null || this.f270677b) {
            return;
        }
        this.f270677b = true;
        if (java.lang.System.currentTimeMillis() - this.f270683h < 43200000) {
            this.f270677b = false;
            return;
        }
        gm0.j1.i();
        this.f270683h = gm0.j1.u().c().s(352276, 0L);
        if (java.lang.System.currentTimeMillis() - this.f270683h < 43200000) {
            this.f270677b = false;
            return;
        }
        if (this.f270678c == null) {
            this.f270678c = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), context);
        }
        b(this.f270678c, this.f270681f);
    }

    public void e(android.content.Context context) {
        if (!gm0.j1.a() || context == null || this.f270677b) {
            return;
        }
        this.f270677b = true;
        if (this.f270678c == null) {
            this.f270678c = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), context);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SuggestionAppListLogic", "getServiceAppListImmediately");
        b(this.f270678c, this.f270681f);
    }

    public final void f(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z zVar, java.util.List list) {
        boolean z17;
        if (zVar == null || list == null || list.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (ap3.e.a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoLogic", "getAllServices, getISubCorePluginBase() == null");
        } else {
            ((kt.a) ap3.e.a()).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z Ri = zo3.p.Ri();
            Ri.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
            sb6.append("select * from AppInfo where serviceAppType > 0");
            android.database.Cursor m145256x1d3f4980 = Ri.m145256x1d3f4980(sb6.toString(), new java.lang.String[0]);
            if (m145256x1d3f4980 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoStorage", "getAllServices : cursor is null");
                m145256x1d3f4980 = null;
            } else {
                m145256x1d3f4980.getCount();
            }
            if (m145256x1d3f4980 != null) {
                while (m145256x1d3f4980.moveToNext()) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
                    mVar.mo9015xbf5d97fd(m145256x1d3f4980);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67384x996f3ea)) {
                        arrayList.add(mVar);
                    }
                }
                m145256x1d3f4980.close();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SuggestionAppListLogic", "oldList %d", java.lang.Integer.valueOf(arrayList.size()));
        if (arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar2 = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) it.next();
                if (mVar2.f67370x28d45f97 != null) {
                    java.util.Iterator it6 = list.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z17 = false;
                            break;
                        }
                        if (mVar2.f67370x28d45f97.equals((java.lang.String) it6.next())) {
                            z17 = true;
                            break;
                        }
                    }
                    if (!z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SuggestionAppListLogic", "delete old service : %s, %s", mVar2.f67370x28d45f97, java.lang.Boolean.valueOf(zVar.mo9951xb06685ab(mVar2, new java.lang.String[0])));
                    }
                }
            }
        }
    }
}

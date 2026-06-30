package a03;

/* loaded from: classes11.dex */
public final class m implements pi0.m0 {
    @Override // pi0.m0
    public boolean a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return com.p314xaae8f345.mm.ui.bk.k(context);
    }

    @Override // pi0.m0
    public void b(pi0.u0 engine) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engine, "engine");
        b03.u uVar = b03.u.f98397a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        fp.d0.n("dart2cpp");
        android.os.SystemClock.elapsedRealtime();
        b03.m mVar = b03.m.f98382a;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = engine.f436264b;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0 m137439x2173b36a = c28580x69eec95e.m137439x2173b36a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137439x2173b36a, "getPlugins(...)");
        mVar.a(m137439x2173b36a);
        c28580x69eec95e.m137439x2173b36a().add(new c61.v9(engine.f436265c, engine.f436266d));
        c61.db dbVar = new c61.db();
        dbVar.f120478e = engine.f436267e;
        dbVar.f120479f = engine.f436265c;
        c28580x69eec95e.m137439x2173b36a().add(dbVar);
        c28580x69eec95e.m137459x1de78823(b03.r.f98395d, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_flutter_enable_surface_background_executor, false));
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28582x3d2c20c4 m137465x9cf0d20b = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28582x3d2c20c4.m137465x9cf0d20b();
        java.lang.String str = engine.f436263a;
        m137465x9cf0d20b.put(str, c28580x69eec95e);
        c28580x69eec95e.m137415x4aac123b(new b03.s(str));
    }

    @Override // pi0.m0
    public boolean c() {
        boolean z17 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.ActivityC22413xb8aa5962.f290332g;
        return com.p314xaae8f345.mm.ui.p2710x1c644e5f.ActivityC22413xb8aa5962.f290332g;
    }

    @Override // pi0.m0
    public void d(pi0.m1 routeInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(routeInfo, "routeInfo");
        java.util.HashMap hashMap = new java.util.HashMap();
        k12.t tVar = (k12.t) i95.n0.c(k12.t.class);
        hashMap.put("SystemEmojiResPath", tVar == null ? "" : ((h12.g) tVar).Di());
        k12.t tVar2 = (k12.t) i95.n0.c(k12.t.class);
        hashMap.put("QQSmileyDirPath", tVar2 == null ? "" : ((h12.g) tVar2).Bi());
        k12.t tVar3 = (k12.t) i95.n0.c(k12.t.class);
        hashMap.put("NewSmileyDirPath", tVar3 == null ? "" : ((h12.g) tVar3).Ai());
        k12.t tVar4 = (k12.t) i95.n0.c(k12.t.class);
        hashMap.put("EmojiPanelConfigPath", tVar4 != null ? ((h12.g) tVar4).wi() : "");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        hashMap.put("IsEnableInitOnIsolate", bool);
        hashMap.put("IsEnableSupportEmoji", bool);
        routeInfo.f436204g = hashMap;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(routeInfo.f436200c, "root")) {
            java.util.HashMap initParams = routeInfo.f436204g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(initParams, "initParams");
            initParams.put("densityScale", java.lang.Float.valueOf((j65.f.g() * 1.0f) / 400));
        }
    }

    @Override // pi0.m0
    public java.lang.Class e() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950.class;
    }

    @Override // pi0.m0
    public void f(pi0.l0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.Set set = a03.l.f81973a;
        java.util.HashSet hashSet = (java.util.HashSet) a03.l.f81973a;
        if (hashSet.isEmpty()) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40963x40b15f2e(a03.l.f81974b);
        }
        hashSet.add(callback);
    }

    @Override // pi0.m0
    public void g(pi0.l0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.Set set = a03.l.f81973a;
        java.util.HashSet hashSet = (java.util.HashSet) a03.l.f81973a;
        hashSet.remove(callback);
        if (hashSet.isEmpty()) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40968xa01141ab(a03.l.f81974b);
        }
    }

    @Override // pi0.m0
    /* renamed from: getDisplayRealSize */
    public android.graphics.Point mo222x69e01b6b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return com.p314xaae8f345.mm.ui.bk.h(context);
    }

    @Override // pi0.m0
    public pi0.q h() {
        return ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui();
    }

    @Override // pi0.m0
    public int i() {
        return e50.j1.f331041a.d() && android.os.Build.VERSION.SDK_INT >= 29 ? 1 : -1;
    }

    @Override // pi0.m0
    public android.os.HandlerThread j(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        int i17 = pu5.i.f440006b;
        return pu5.f.a(name, -2);
    }

    @Override // pi0.m0
    public android.app.Activity k() {
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        if (k17 != null) {
            return (android.app.Activity) k17.get();
        }
        return null;
    }
}

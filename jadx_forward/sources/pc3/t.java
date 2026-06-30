package pc3;

/* loaded from: classes7.dex */
public final class t extends com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m4 implements zg.a {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f434932e;

    /* renamed from: f, reason: collision with root package name */
    public final jc3.c0 f434933f;

    /* renamed from: g, reason: collision with root package name */
    public final jc3.y f434934g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f434935h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f434936i;

    public t(android.content.Context context, jc3.c0 publicServiceMgr, jc3.y pluginMgr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(publicServiceMgr, "publicServiceMgr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginMgr, "pluginMgr");
        this.f434932e = context;
        this.f434933f = publicServiceMgr;
        this.f434934g = pluginMgr;
        this.f434935h = new java.util.concurrent.ConcurrentHashMap();
        this.f434936i = com.p314xaae8f345.mm.ui.bk.C();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ue3.b.f508424a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushJsApiMMKVUtil", "init mmkv");
        ue3.b.f508424a.d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.n4
    public synchronized qc3.f B5(java.lang.String instanceName, qc3.c client) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(client, "client");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushServerMgr", "biz connect for ".concat(instanceName));
        sc3.k1 k1Var = (sc3.k1) this.f434935h.get(instanceName);
        if (k1Var != null) {
            return k1Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushServerMgr", "create biz server for ".concat(instanceName));
        sc3.k1 k1Var2 = new sc3.k1(this.f434932e, instanceName, new com.p314xaae8f345.p485x5dc4f1ad.biz.C4210x94b68e8f(this, instanceName), new pc3.n(this), new pc3.o(this));
        k1Var2.m1(client);
        this.f434935h.put(instanceName, k1Var2);
        return k1Var2;
    }

    public final synchronized void d(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushServerMgr", "onAppForegroundStateChange: isForeground = " + z17);
        e(z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n2.f35136x24728b : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m2.f35134x24728b, "");
    }

    public final void e(java.lang.String eventName, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.Set<java.lang.String> keySet = this.f434935h.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        for (java.lang.String str : keySet) {
            bf3.g0 g0Var = bf3.g0.f101160a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            g0Var.b(str, new pc3.s(this, str, eventName, data));
        }
    }
}

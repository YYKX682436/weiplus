package pc3;

/* loaded from: classes7.dex */
public final class l implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pc3.m f434914d;

    public l(pc3.m mVar) {
        this.f434914d = mVar;
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(android.content.ComponentName name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushClientMgr", "onBindingDied " + name);
        je3.i.t8(je3.k.f380831e, "magicbrush", "onBindingDied", "", null, 0.0f, 24, null);
        pc3.m.a(this.f434914d, true);
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(android.content.ComponentName name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushClientMgr", "onNullBinding " + name);
        je3.i.t8(je3.k.f380831e, "magicbrush", "onNullBinding", "", null, 0.0f, 24, null);
        pc3.m.a(this.f434914d, true);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName name, android.os.IBinder binder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binder, "binder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushClientMgr", "onServiceConnected " + name);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m4.f229606d;
        android.os.IInterface queryLocalInterface = binder.queryLocalInterface("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.n4 l4Var = (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.n4)) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.l4(binder) : (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.n4) queryLocalInterface;
        pc3.m mVar = this.f434914d;
        mVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushClientMgr", "onServerMgrReady");
        je3.k.f380831e.t6("", "magicbrush", com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16456x617fbd72.f37614x6f308893, java.lang.System.currentTimeMillis() - mVar.f434917c, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mVar.f434919e, java.lang.Boolean.TRUE) ? "1" : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mVar.f434919e, java.lang.Boolean.FALSE) ? "2" : "0", 1.0E-5f);
        mVar.f434917c = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229371c = true;
        mVar.f434918d = l4Var;
        java.util.Collection<rc3.w0> values = mVar.f434916b.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (rc3.w0 w0Var : values) {
            w0Var.getClass();
            w0Var.T(new rc3.f0(w0Var, l4Var));
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        pc3.k kVar = new pc3.k(mVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(kVar, 60000L, false);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushClientMgr", "onServiceDisconnected " + name);
        je3.i.t8(je3.k.f380831e, "magicbrush", "onServiceDisconnected", "", null, 0.001f, 8, null);
        pc3.m.a(this.f434914d, true);
    }
}

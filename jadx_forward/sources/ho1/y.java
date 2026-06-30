package ho1;

/* loaded from: classes5.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f364386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f364387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f364388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f364389g;

    public y(android.net.Uri uri, po1.d dVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, yz5.l lVar) {
        this.f364386d = uri;
        this.f364387e = dVar;
        this.f364388f = u3Var;
        this.f364389g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        po1.d dVar = this.f364387e;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        try {
            boolean f17 = to1.g.f502444a.f(this.f364386d, dVar);
            c0Var.f391645d = f17;
            if (f17) {
                oo1.o.f428684a.a(dVar.f438828a);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RoamBackup.FlutterBackupPlugin", th6, "", new java.lang.Object[0]);
        }
        pm0.v.X(new ho1.x(this.f364388f, c0Var, this.f364389g, dVar));
    }
}

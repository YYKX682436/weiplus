package yo1;

/* loaded from: classes5.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f545662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f545663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12865x8f6cd034 f545664f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f545665g;

    public k(android.net.Uri uri, po1.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12865x8f6cd034 activityC12865x8f6cd034, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f545662d = uri;
        this.f545663e = dVar;
        this.f545664f = activityC12865x8f6cd034;
        this.f545665g = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12865x8f6cd034 activityC12865x8f6cd034 = this.f545664f;
        po1.d dVar = this.f545663e;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        try {
            boolean f17 = to1.g.f502444a.f(this.f545662d, dVar);
            c0Var.f391645d = f17;
            if (f17) {
                oo1.o.f428684a.a(dVar.f438828a);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(activityC12865x8f6cd034.f174316d, th6, "", new java.lang.Object[0]);
        }
        pm0.v.X(new yo1.j(this.f545665g, activityC12865x8f6cd034, c0Var, dVar));
    }
}

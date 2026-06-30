package iq;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iq.d f375157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f375158e;

    public c(iq.d dVar, android.content.Context context) {
        this.f375157d = dVar;
        this.f375158e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iq.d dVar = this.f375157d;
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6389xb3a5f5ae c6389xb3a5f5ae = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6389xb3a5f5ae();
            c6389xb3a5f5ae.f137347u = c6389xb3a5f5ae.b("BuildTag", com.p314xaae8f345.mm.sdk.p2603x2137b148.y.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a, lp0.a.f401785f) + '|' + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, true);
            iq.d.Ui(dVar, c6389xb3a5f5ae);
            iq.d.wi(dVar, c6389xb3a5f5ae);
            iq.d.Ai(dVar, c6389xb3a5f5ae);
            iq.d.Di(dVar, c6389xb3a5f5ae);
            iq.d.Ri(dVar, c6389xb3a5f5ae);
            iq.d.Ni(dVar, c6389xb3a5f5ae, this.f375158e);
            iq.d.Bi(dVar, c6389xb3a5f5ae);
            c6389xb3a5f5ae.f137351y = c6389xb3a5f5ae.b("Idc", ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ri(32) ? "cdn" : "http", true);
            c6389xb3a5f5ae.k();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DeviceSupportTask", e17, "print device support error", new java.lang.Object[0]);
        }
    }
}

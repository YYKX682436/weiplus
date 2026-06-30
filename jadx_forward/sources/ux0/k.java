package ux0;

/* loaded from: classes14.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f513350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ux0.o f513351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xr0.j f513352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f513353g;

    public k(java.util.concurrent.CountDownLatch countDownLatch, ux0.o oVar, xr0.j jVar, pp0.p0 p0Var) {
        this.f513350d = countDownLatch;
        this.f513351e = oVar;
        this.f513352f = jVar;
        this.f513353g = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m143895xf1229813;
        ux0.o oVar = this.f513351e;
        pp0.p0 p0Var = this.f513353g;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            rs0.h hVar = oVar.f513361g;
            xr0.j jVar = this.f513352f;
            if (hVar != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jVar, oVar.f513369r)) {
                ux0.o.e(oVar);
            }
            oVar.f513369r = jVar;
            oVar.f513360f = p0Var;
            if (oVar.f513361g == null) {
                ux0.o.f(oVar, p0Var, jVar);
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextureVideoFrameSender", "Failed to init: " + m143898xd4a2fc34);
            ux0.o.e(oVar);
        }
        this.f513350d.countDown();
    }
}

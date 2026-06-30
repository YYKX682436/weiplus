package dr4;

/* loaded from: classes14.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.p f324294a;

    /* renamed from: b, reason: collision with root package name */
    public dr4.c0 f324295b;

    /* renamed from: c, reason: collision with root package name */
    public dr4.d2 f324296c;

    /* renamed from: d, reason: collision with root package name */
    public dr4.n0 f324297d;

    /* renamed from: e, reason: collision with root package name */
    public dr4.h f324298e;

    public x1(yz5.p queueScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(queueScope, "queueScope");
        this.f324294a = queueScope;
    }

    public final void a(dr4.q qVar, int i17) {
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoipWindowsSurfaceRenderer", "add a null surface");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VoipWindowsSurfaceRenderer", "add render surface renderSide " + i17 + " and :" + qVar, new java.lang.Object[0]);
        dr4.d2 d2Var = this.f324296c;
        if (d2Var != null) {
            d2Var.a(qVar, i17);
        }
        dr4.n0 n0Var = this.f324297d;
        if (n0Var != null) {
            n0Var.a(qVar, i17);
        }
    }

    public final boolean b(dr4.q glSurface) {
        boolean z17;
        java.lang.Object obj;
        rs0.h hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(glSurface, "glSurface");
        dr4.c0 c0Var = this.f324295b;
        if (c0Var == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PboSurfaceRender", "createSurface:" + glSurface);
        if (!glSurface.b()) {
            return false;
        }
        synchronized (glSurface.f324266f) {
            z17 = glSurface.f324265e;
        }
        if (z17 || (obj = glSurface.f324262b) == null || (hVar = c0Var.f324134d) == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PboSurfaceRender", "start createEGLSurface:" + obj.hashCode());
        glSurface.f324263c = rs0.i.f480829a.k(hVar.f480825a, obj);
        glSurface.c(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PboSurfaceRender", "createSurface finished:" + obj.hashCode() + ", " + glSurface.a().hashCode());
        return true;
    }

    public final void c(dr4.q qVar, int i17) {
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoipWindowsSurfaceRenderer", "remove a null surface");
            return;
        }
        dr4.d2 d2Var = this.f324296c;
        if (d2Var != null) {
            d2Var.g(qVar, i17);
        }
        dr4.n0 n0Var = this.f324297d;
        if (n0Var != null) {
            n0Var.g(qVar, i17);
        }
    }

    public final void d() {
        dr4.d2 d2Var = this.f324296c;
        if (d2Var != null) {
            d2Var.j();
        }
        dr4.n0 n0Var = this.f324297d;
        if (n0Var != null) {
            n0Var.j();
        }
    }
}

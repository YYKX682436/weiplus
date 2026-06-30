package tn0;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f502264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f502265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f502266f;

    public p(tn0.w0 w0Var, android.graphics.SurfaceTexture surfaceTexture, int i17) {
        this.f502264d = w0Var;
        this.f502265e = surfaceTexture;
        this.f502266f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ft0.d dVar;
        ms0.c cVar;
        kn0.f fVar;
        tn0.w0 w0Var = this.f502264d;
        int r17 = tn0.w0.r(w0Var);
        ts0.r rVar = w0Var.f502308v;
        if (rVar != null) {
            kn0.i iVar = w0Var.C;
            rVar.p(this.f502265e, (iVar == null || (fVar = iVar.f391093d) == null) ? false : fVar.f391064c, r17);
        }
        ts0.r rVar2 = w0Var.f502308v;
        if (!(rVar2 != null && ((ts0.b) rVar2).G())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "start preview fail");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start preview success, mirrorMode:");
        go0.f0 f0Var = w0Var.f502304r;
        go0.f1 f1Var = f0Var.f355300p;
        sb6.append(f1Var != null ? f1Var.Q : 0);
        sb6.append(" resolution:");
        sb6.append(r17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", sb6.toString());
        xn0.b b17 = vn0.b.f519707a.b();
        ts0.r rVar3 = w0Var.f502308v;
        b17.f536943a = rVar3 != null ? rVar3.e() : 0;
        ts0.r rVar4 = w0Var.f502308v;
        ts0.c z17 = rVar4 != null ? rVar4.z() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z17);
        int i17 = this.f502266f;
        ts0.c.f503078e = i17;
        f0Var.w(z17);
        ts0.r rVar5 = w0Var.f502308v;
        if ((rVar5 != null && rVar5.b() == 2) && i17 == 90 && (dVar = f0Var.f355297m) != null && (cVar = dVar.f347995c) != null) {
            cVar.r(0);
        }
        w0Var.f502310x = true;
        f0Var.mo8988x4ac79299(new tn0.o(w0Var));
    }
}

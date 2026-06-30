package dr4;

/* loaded from: classes14.dex */
public final class t1 implements com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dr4.x1 f324279a;

    public t1(dr4.x1 x1Var) {
        this.f324279a = x1Var;
    }

    public void a(android.view.Surface encoderSurface) {
        dr4.q qVar;
        java.lang.Object obj;
        dr4.c0 c0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encoderSurface, "encoderSurface");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipWindowsSurfaceRenderer", "onEncoderSurfaceRelease:" + encoderSurface.hashCode());
        dr4.x1 x1Var = this.f324279a;
        dr4.h hVar = x1Var.f324298e;
        if (hVar == null || (qVar = hVar.f324216i) == null || (obj = qVar.f324262b) == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, encoderSurface) || (c0Var = x1Var.f324295b) == null) {
            return;
        }
        dr4.c0.c(c0Var, qVar, null, 2, null);
    }
}

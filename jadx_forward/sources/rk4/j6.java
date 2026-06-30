package rk4;

/* loaded from: classes11.dex */
public final class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f478286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ar0 f478287e;

    public j6(bw5.o50 o50Var, bw5.ar0 ar0Var) {
        this.f478286d = o50Var;
        this.f478287e = ar0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
        if (Zi != null) {
            bw5.ar0 scene = this.f478287e;
            rk4.i6 i6Var = new rk4.i6(scene);
            jm4.k4 k4Var = (jm4.k4) Zi;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
            bw5.o50 o50Var = this.f478286d;
            byte[] mo14344x5f01b1f6 = o50Var != null ? o50Var.mo14344x5f01b1f6() : null;
            int i17 = scene.f106955d;
            jm4.x1 x1Var = new jm4.x1();
            x1Var.f381974d = i6Var;
            p3380x6a61f93.p3381xf512d0a5.C30432x21b2b547.m168844x21ba7523(k4Var.m105978x2737f10(), mo14344x5f01b1f6, i17, 0, x1Var);
        }
    }
}

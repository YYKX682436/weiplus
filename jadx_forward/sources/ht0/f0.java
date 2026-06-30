package ht0;

/* loaded from: classes10.dex */
public class f0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f366226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht0.o0 f366227e;

    public f0(ht0.o0 o0Var, java.lang.Runnable runnable) {
        this.f366227e = o0Var;
        this.f366226d = runnable;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MMSightFFMpegRecorder_stop";
    }

    @Override // java.lang.Runnable
    public void run() {
        ht0.n0 n0Var;
        ht0.n0 n0Var2;
        ht0.o0 o0Var = this.f366227e;
        java.lang.Runnable runnable = this.f366226d;
        o0Var.f366258c.a(ei3.l.WaitStop);
        ei3.y0 y0Var = o0Var.f366257b;
        if (y0Var != null) {
            int i17 = y0Var.f334724a;
            float a17 = (y0Var.f334725b * 1000.0f) / ((float) o0Var.f366257b.a());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "stop, bufID %d, frameCount %d, duration %dms, %.6ffps", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(o0Var.f366257b.f334725b), java.lang.Long.valueOf(o0Var.f366257b.a()), java.lang.Float.valueOf(a17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264YUVMP4MuxRecorder", "stop, accumulatePauseTime:%s", java.lang.Long.valueOf(o0Var.K));
            int a18 = (int) o0Var.f366257b.a();
            o0Var.f366263h = a18;
            long j17 = o0Var.K;
            if (j17 > 0) {
                o0Var.f366263h = (int) (a18 - j17);
            }
            o0Var.f366264i = a17;
            o0Var.f366257b.b();
            ht0.n0 n0Var3 = o0Var.f366259d;
            if (n0Var3 != null) {
                n0Var3.f366245g = a17;
                n0Var3.f366246h = o0Var.f366263h;
                n0Var3.f366252q = runnable;
                n0Var3.f366247i = true;
                n0Var3.b();
            }
        }
        ht0.a aVar = o0Var.f366256a;
        if (aVar != null && !o0Var.f366255J) {
            aVar.f(new ht0.g0(o0Var));
        } else if (o0Var.M && (n0Var = o0Var.f366259d) != null) {
            n0Var.f366248m = true;
        }
        o0Var.f366258c.a(ei3.l.Stop);
        o0Var.F = uk.k.b(o0Var.f366262g);
        if (o0Var.f366259d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.X264YUVMP4MuxRecorder", "encodeRunnable is null!, directly call stopcallback");
            o0Var.mo127748x6761d4f();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        }
        if (!o0Var.f366255J || (n0Var2 = o0Var.f366259d) == null) {
            return;
        }
        n0Var2.f366248m = true;
    }
}

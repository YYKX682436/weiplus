package ht0;

/* loaded from: classes10.dex */
public class x implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.c0 f366313d;

    public x(ht0.c0 c0Var) {
        this.f366313d = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        synchronized (this.f366313d.f366196a) {
            if (this.f366313d.f366204i != null) {
                android.opengl.GLES20.glFinish();
                ht0.c0 c0Var = this.f366313d;
                gs0.w wVar = c0Var.f366204i;
                long j17 = c0Var.f366205j;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                wVar.b((android.os.SystemClock.elapsedRealtime() - j17) * 1000000);
            }
            ht0.c0 c0Var2 = this.f366313d;
            gs0.w wVar2 = c0Var2.f366204i;
            if (wVar2 != null && c0Var2.f366211p.f334572a == ei3.l.WaitStop) {
                wVar2.d();
                ht0.a aVar = this.f366313d.f366203h;
                if (aVar != null) {
                    aVar.f(new ht0.w(this));
                }
                this.f366313d.F.e();
                ht0.c0 c0Var3 = this.f366313d;
                c0Var3.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Media.X264MP4MuxRecorder", "stopImpl", new java.lang.Object[0]);
                s75.d.b(new ht0.a0(c0Var3), "X264MP4MuxRecorder_stop");
                ei3.e1 e1Var = this.f366313d.f366211p;
                if (e1Var != null) {
                    e1Var.a(ei3.l.Stop);
                }
            }
        }
        return null;
    }
}

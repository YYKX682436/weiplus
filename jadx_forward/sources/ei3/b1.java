package ei3;

/* loaded from: classes10.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei3.c1 f334530d;

    public b1(ei3.c1 c1Var) {
        this.f334530d = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.c1 c1Var = this.f334530d;
        c1Var.b();
        ei3.o oVar = c1Var.f334556y;
        if (oVar != null) {
            ei3.w0 w0Var = ((ei3.p0) oVar).f334649a;
            w0Var.getClass();
            s75.d.b(new ei3.s0(w0Var), "MMSightMediaCodecMP4MuxRecorder_stop");
            c1Var.f334556y = null;
        }
    }
}

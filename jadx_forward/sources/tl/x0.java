package tl;

/* loaded from: classes12.dex */
public class x0 implements tl.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl.y0 f501710a;

    public x0(tl.y0 y0Var) {
        this.f501710a = y0Var;
    }

    @Override // tl.a
    public void a() {
        tl.y0 y0Var = this.f501710a;
        y0Var.f501721a.a();
        cv.a1 a1Var = y0Var.f501724d;
        if (a1Var != null) {
            a1Var.a();
        }
        try {
            y0Var.f501722b.d();
            y0Var.f501725e = -1;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SimpleVoiceRecorder", "setErrorListener File[" + y0Var.f501723c + "] ErrMsg[" + e17.getStackTrace() + "]");
        }
    }
}

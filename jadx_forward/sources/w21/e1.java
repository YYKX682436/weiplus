package w21;

/* loaded from: classes12.dex */
public class e1 implements tl.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w21.f1 f523895a;

    public e1(w21.f1 f1Var) {
        this.f523895a = f1Var;
    }

    @Override // tl.a
    public void a() {
        w21.f1 f1Var = this.f523895a;
        com.p314xaae8f345.mm.p944x882e457a.e1 e1Var = f1Var.f523900c;
        if (e1Var != null) {
            e1Var.a();
        }
        try {
            f1Var.f523898a.d();
            f1Var.f523901d = -1;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VoiceRecorder", "setErrorListener File[" + f1Var.f523899b + "] ErrMsg[" + e17.getStackTrace() + "]");
        }
    }
}

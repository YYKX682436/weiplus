package md1;

/* loaded from: classes7.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md1.j1 f407279d;

    public i1(md1.j1 j1Var) {
        this.f407279d = j1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        md1.j1 j1Var = this.f407279d;
        j1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCapsuleBarBlinkManager", "_hide");
        j1Var.f407287d = false;
        mi1.w0 w0Var = j1Var.f407286c;
        if (w0Var != null) {
            w0Var.mo147359x63a3b28a();
            j1Var.f407286c = null;
        }
        j1Var.f407284a = null;
        j1Var.f407285b = 2;
    }
}

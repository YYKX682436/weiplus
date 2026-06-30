package v24;

/* loaded from: classes15.dex */
public class b0 implements k14.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd0.p1 f514435a;

    public b0(wd0.p1 p1Var) {
        this.f514435a = p1Var;
    }

    @Override // k14.u
    public void a(android.content.Context context, boolean z17, r45.en0 en0Var) {
        wd0.p1 p1Var = this.f514435a;
        if (en0Var == null || !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SafeSwitchTipDialog", "doSave. response = success");
            p1Var.a();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SafeSwitchTipDialog", "doSave. response = fail");
            p1Var.mo977xe05b4124();
        }
    }
}

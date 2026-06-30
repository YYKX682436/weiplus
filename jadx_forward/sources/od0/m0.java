package od0;

/* loaded from: classes13.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ od0.v f426093e;

    public m0(od0.v vVar, java.lang.String str) {
        this.f426093e = vVar;
        this.f426092d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            byte[] Ed = fo3.s.INSTANCE.Ed(this.f426092d);
            if (Ed != null && Ed.length != 0) {
                r45.k57 k57Var = new r45.k57();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(Ed);
                k57Var.B = cu5Var;
                this.f426093e.Ai(540999751, k57Var.mo14344x5f01b1f6(), false);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecInfoReporterImpl", "ciuissi is null");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecInfoReporterImpl", "[+] report ciuissi error: " + th6);
        }
    }
}

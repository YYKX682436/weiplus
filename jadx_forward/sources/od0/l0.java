package od0;

/* loaded from: classes13.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ od0.v f426090e;

    public l0(od0.v vVar, java.lang.String str) {
        this.f426090e = vVar;
        this.f426089d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            byte[] a27 = fo3.s.INSTANCE.a2(this.f426089d);
            if (a27 != null && a27.length != 0) {
                r45.k57 k57Var = new r45.k57();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(a27);
                k57Var.A = cu5Var;
                this.f426090e.Ai(540999717, k57Var.mo14344x5f01b1f6(), false);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecInfoReporterImpl", "pouissi is null");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecInfoReporterImpl", "[+] report pouissi error: " + th6);
        }
    }
}

package od0;

/* loaded from: classes13.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ od0.v f426124d;

    public w(od0.v vVar) {
        this.f426124d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f459929f = cu5Var;
            this.f426124d.Ai(540999718, k57Var.mo14344x5f01b1f6(), false);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecInfoReporterImpl", "[+] report posi error: " + th6);
        }
    }
}

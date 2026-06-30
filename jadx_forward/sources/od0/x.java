package od0;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f426126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f426127f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ od0.v f426128g;

    public x(od0.v vVar, java.lang.String str, boolean z17, int i17) {
        this.f426128g = vVar;
        this.f426125d = str;
        this.f426126e = z17;
        this.f426127f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            fo3.s sVar = fo3.s.INSTANCE;
            byte[] Ci = sVar.Ci(this.f426125d);
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(Ci);
            k57Var.f459928e = cu5Var;
            if (this.f426126e) {
                r45.cu5 cu5Var2 = new r45.cu5();
                cu5Var2.d(sVar.h());
                k57Var.f459929f = cu5Var2;
            }
            this.f426128g.Ai(this.f426127f, k57Var.mo14344x5f01b1f6(), false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report ci suc");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report ci error, msg:" + th6);
        }
    }
}

package od0;

/* loaded from: classes13.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f426086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ od0.v f426087e;

    public k0(od0.v vVar, byte[] bArr) {
        this.f426087e = vVar;
        this.f426086d = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af;
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.g1 c17 = com.p314xaae8f345.mm.p971x6de15a2e.x2.c();
            if (c17 != null && (binderC11173x1cfac0af = c17.f153526n) != null && binderC11173x1cfac0af.mo9865x7b0e9c5f()) {
                byte[] bArr = this.f426086d;
                if (bArr == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecInfoReporterImpl", "ari is null");
                    return;
                }
                byte[] u37 = fo3.s.INSTANCE.u3(bArr);
                if (u37 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecInfoReporterImpl", "niarifo is null");
                    return;
                }
                r45.k57 k57Var = new r45.k57();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(u37);
                k57Var.f459944x = cu5Var;
                this.f426087e.Ai(540999714, k57Var.mo14344x5f01b1f6(), false);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecInfoReporterImpl", "[+] report niarifo error: " + th6);
        }
    }
}

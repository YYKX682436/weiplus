package bw1;

/* loaded from: classes12.dex */
public class q extends bw1.n {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw1.u f106371f;

    public q(bw1.u uVar) {
        this.f106371f = uVar;
    }

    @Override // bw1.n
    public java.lang.Object b(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, boolean z17) {
        java.lang.System.currentTimeMillis();
        this.f106371f.getClass();
        bw1.s sVar = new bw1.s();
        d95.f.q();
        try {
            try {
                mt1.b0 b0Var = mt1.b0.f412724a;
                b0Var.B(true, c26987xeef691ab);
                b0Var.t(new bw1.p(this, sVar), c26987xeef691ab);
            } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26950xbda0b8a9 e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreClean", "doCalcResult, DB CorruptException: " + e17.getMessage());
            }
            return sVar;
        } finally {
            d95.f.w();
        }
    }
}

package te4;

/* loaded from: classes15.dex */
public class m extends xt5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.security.Signature f500139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ te4.n f500140b;

    public m(te4.n nVar, java.security.Signature signature) {
        this.f500140b = nVar;
        this.f500139a = signature;
    }

    @Override // xt5.c
    public void a() {
    }

    @Override // xt5.c
    public void b(int i17, java.lang.CharSequence charSequence) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterTestUI", "hy: onAuthenticationError");
    }

    @Override // xt5.c
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterTestUI", "hy: onAuthenticationFailed");
    }

    @Override // xt5.c
    public void d(int i17, java.lang.CharSequence charSequence) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterTestUI", "hy: onAuthenticationHelp");
    }

    @Override // xt5.c
    public void e(xt5.d dVar) {
        java.security.Signature signature = this.f500139a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterTestUI", "hy: onAuthenticationSucceeded");
        try {
            signature.update("challenge".getBytes());
            zt5.s a17 = wt5.a.a(signature.sign());
            this.f500140b.f500141d.f253299o.setText(a17 == null ? "not pass: exception occurs" : a17.m179465x9616526c());
        } catch (java.security.SignatureException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterTestUI", "hy: occurred exception when sign: " + e17.toString());
        }
    }
}

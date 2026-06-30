package nz2;

/* loaded from: classes9.dex */
public class s implements nz2.b {

    /* renamed from: a, reason: collision with root package name */
    public int f423103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nz2.d f423104b;

    public s(nz2.x xVar, nz2.d dVar) {
        this.f423104b = dVar;
    }

    @Override // nz2.b
    public void a(nz2.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "authorize pay result: %s, %s", java.lang.Integer.valueOf(cVar.f423076a), null);
        nz2.e a17 = nz2.e.a(cVar);
        boolean z17 = a17.f423082a == 0;
        nz2.d dVar = this.f423104b;
        if (z17) {
            a17.f423083b++;
            dVar.mo14633xe05b4124(a17);
            return;
        }
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        int i17 = currentTimeMillis - this.f423103a;
        if (i17 >= 1) {
            a17.f423083b++;
            this.f423103a = currentTimeMillis;
        }
        int i18 = a17.f423082a;
        if ((i18 == 1) && i17 >= 1) {
            dVar.mo14632xb03bf809(a17);
            return;
        }
        if (i18 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterBiometricPayManager", "do fast, do nothing");
        } else {
            dVar.mo14631xc399519d(a17);
        }
    }
}

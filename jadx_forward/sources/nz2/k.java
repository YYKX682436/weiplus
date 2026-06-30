package nz2;

/* loaded from: classes9.dex */
public class k implements nz2.b {

    /* renamed from: a, reason: collision with root package name */
    public int f423094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nz2.d f423095b;

    public k(nz2.n nVar, nz2.d dVar) {
        this.f423095b = dVar;
    }

    @Override // nz2.b
    public void a(nz2.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HuaweiBiometricPayManagerImpl", "authorize pay result: %s, %s", java.lang.Integer.valueOf(cVar.f423076a), null);
        nz2.e a17 = nz2.e.a(cVar);
        boolean z17 = a17.f423082a == 0;
        nz2.d dVar = this.f423095b;
        if (z17) {
            a17.f423083b++;
            dVar.mo14633xe05b4124(a17);
            return;
        }
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        int i17 = currentTimeMillis - this.f423094a;
        if (i17 >= 1) {
            a17.f423083b++;
            this.f423094a = currentTimeMillis;
        }
        if (!(a17.f423082a == 1) || a17.f423083b >= 3 || i17 < 1) {
            dVar.mo14631xc399519d(a17);
        } else {
            dVar.mo14632xb03bf809(a17);
        }
    }
}

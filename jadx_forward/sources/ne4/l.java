package ne4;

/* loaded from: classes9.dex */
public class l implements du5.d {

    /* renamed from: a, reason: collision with root package name */
    public d50.o f418097a;

    /* renamed from: b, reason: collision with root package name */
    public final int f418098b;

    public l(d50.o oVar, int i17) {
        this.f418097a = oVar;
        this.f418098b = i17;
    }

    @Override // du5.d
    public void a() {
    }

    @Override // du5.d
    public void b() {
        d50.o oVar = this.f418097a;
        if (oVar != null) {
            oVar.a();
        }
    }

    @Override // du5.d
    public void c(int i17, java.lang.CharSequence charSequence) {
    }

    @Override // du5.d
    public void d() {
    }

    @Override // du5.d
    public void e(int i17, java.lang.CharSequence charSequence) {
    }

    @Override // du5.d
    public void f() {
        d50.o oVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterManager", "request authorize failed");
        if (this.f418098b != 1 || (oVar = this.f418097a) == null) {
            return;
        }
        oVar.c(1, new eu5.a());
    }
}

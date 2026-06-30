package of1;

/* loaded from: classes7.dex */
public class q implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of1.v f426522a;

    public q(of1.v vVar) {
        this.f426522a = vVar;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        of1.v vVar = this.f426522a;
        android.app.Activity v17 = ((of1.w1) vVar.f426547e).m151232xaf156f4a() != null ? ((of1.w1) vVar.f426547e).m151232xaf156f4a().v1() : null;
        if (v17 == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.n nVar = vVar.f426550h;
        if (nVar.f264860f == null) {
            if (i17 != 201) {
                return false;
            }
            nVar.f(v17, i17, i18, intent);
        }
        return true;
    }
}

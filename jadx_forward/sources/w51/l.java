package w51;

/* loaded from: classes15.dex */
public class l implements q51.b {

    /* renamed from: a, reason: collision with root package name */
    public int f524519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w51.n f524520b;

    public l(w51.n nVar) {
        this.f524520b = nVar;
    }

    @Override // q51.b
    /* renamed from: onItemSelected */
    public void mo26551xe1bd9a4d(int i17) {
        w51.n nVar = this.f524520b;
        int intValue = ((java.lang.Integer) nVar.f524526e.m48588xf939df19().mo145523xfb80e389(i17)).intValue();
        this.f524519a = ((java.lang.Integer) nVar.f524527f.m48588xf939df19().mo145523xfb80e389(nVar.f524527f.m48589xfda78ef6())).intValue();
        if (intValue == nVar.f524540s) {
            nVar.f524527f.m48595x6cab2c8d(new o51.d(0, nVar.f524541t));
            int i18 = this.f524519a;
            int i19 = nVar.f524541t;
            if (i18 >= i19) {
                nVar.f524527f.m48596x940d026a(i19);
            } else {
                nVar.f524527f.m48596x940d026a(i18);
            }
        } else if (intValue == nVar.f524538q) {
            nVar.f524527f.m48595x6cab2c8d(new o51.d(nVar.f524539r, 59));
            int i27 = this.f524519a;
            int i28 = nVar.f524539r;
            if (i27 < i28) {
                nVar.f524527f.m48596x940d026a(0);
            } else {
                nVar.f524527f.m48596x940d026a(i27 - i28);
            }
        } else {
            nVar.f524527f.m48595x6cab2c8d(new o51.d(0, 59));
            nVar.f524527f.m48596x940d026a(this.f524519a);
        }
        v51.a aVar = nVar.f524545x;
        if (aVar != null) {
            ((w51.f) aVar).a();
        }
    }
}

package w51;

/* loaded from: classes15.dex */
public class j implements q51.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w51.n f524517a;

    public j(w51.n nVar) {
        this.f524517a = nVar;
    }

    @Override // q51.b
    /* renamed from: onItemSelected */
    public void mo26551xe1bd9a4d(int i17) {
        int i18 = i17 + 1;
        w51.n nVar = this.f524517a;
        int i19 = nVar.f524532k;
        int i27 = nVar.f524533l;
        w51.n nVar2 = this.f524517a;
        if (i19 == i27) {
            int i28 = nVar.f524534m;
            int i29 = (i18 + i28) - 1;
            int i37 = nVar.f524535n;
            if (i28 == i37) {
                w51.n.a(nVar, nVar.f524542u, i29, nVar.f524536o, nVar.f524537p, nVar.f524546y, nVar.f524547z);
            } else if (i28 == i29) {
                w51.n.a(nVar, nVar.f524542u, i29, nVar.f524536o, 31, nVar.f524546y, nVar.f524547z);
            } else if (i37 == i29) {
                w51.n.a(nVar, nVar.f524542u, i29, 1, nVar.f524537p, nVar.f524546y, nVar.f524547z);
            } else {
                w51.n.a(nVar, nVar.f524542u, i29, 1, 31, nVar.f524546y, nVar.f524547z);
            }
        } else {
            int i38 = nVar.f524542u;
            if (i38 == i19) {
                int i39 = nVar.f524534m;
                int i47 = (i18 + i39) - 1;
                if (i47 == i39) {
                    w51.n.a(nVar, i38, i47, nVar.f524536o, 31, nVar.f524546y, nVar.f524547z);
                } else {
                    w51.n.a(nVar, i38, i47, 1, 31, nVar.f524546y, nVar.f524547z);
                }
            } else if (i38 != i27) {
                w51.n.a(nVar, i38, i18, 1, 31, nVar.f524546y, nVar.f524547z);
            } else if (i18 == nVar.f524535n) {
                w51.n.a(nVar, i38, nVar.f524524c.m48589xfda78ef6() + 1, 1, nVar2.f524537p, nVar2.f524546y, nVar2.f524547z);
            } else {
                w51.n.a(nVar, i38, nVar.f524524c.m48589xfda78ef6() + 1, 1, 31, nVar2.f524546y, nVar2.f524547z);
            }
        }
        v51.a aVar = nVar2.f524545x;
        if (aVar != null) {
            ((w51.f) aVar).a();
        }
    }
}

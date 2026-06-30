package w51;

/* loaded from: classes15.dex */
public class k implements q51.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w51.n f524518a;

    public k(w51.n nVar) {
        this.f524518a = nVar;
    }

    @Override // q51.b
    /* renamed from: onItemSelected */
    public void mo26551xe1bd9a4d(int i17) {
        int i18;
        w51.n nVar = this.f524518a;
        int i19 = nVar.f524532k + i17;
        if (nVar.f524544w) {
            i19--;
        }
        int i27 = i19;
        int intValue = ((java.lang.Integer) nVar.f524524c.m48588xf939df19().mo145523xfb80e389(nVar.f524524c.m48589xfda78ef6())).intValue();
        nVar.f524542u = i27;
        if (nVar.f524544w && i17 == -1) {
            nVar.f524524c.e(0);
            nVar.f524525d.e(0);
            nVar.f524524c.invalidate();
            nVar.f524525d.invalidate();
        } else {
            if (nVar.B) {
                nVar.f524524c.e(b3.l.m9702x7444d5ad(nVar.A, com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
                nVar.f524525d.e(b3.l.m9702x7444d5ad(nVar.A, com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
                nVar.f524524c.invalidate();
                nVar.f524525d.invalidate();
            }
            int m48589xfda78ef6 = nVar.f524524c.m48589xfda78ef6();
            int i28 = nVar.f524532k;
            int i29 = nVar.f524533l;
            if (i28 == i29) {
                nVar.f524524c.m48595x6cab2c8d(new o51.d(nVar.f524534m, nVar.f524535n, new o51.b(nVar.A)));
                if (m48589xfda78ef6 > nVar.f524524c.m48588xf939df19().mo145524x99620925() - 1) {
                    m48589xfda78ef6 = nVar.f524524c.m48588xf939df19().mo145524x99620925() - 1;
                    nVar.f524524c.m48596x940d026a(m48589xfda78ef6);
                }
                w51.n nVar2 = this.f524518a;
                int i37 = nVar2.f524534m;
                int i38 = m48589xfda78ef6 + i37;
                int i39 = nVar2.f524535n;
                if (i37 == i39) {
                    w51.n.a(nVar2, i27, i38, nVar2.f524536o, nVar2.f524537p, nVar2.f524546y, nVar2.f524547z);
                } else if (i38 == i37) {
                    w51.n.a(nVar2, i27, i38, nVar2.f524536o, 31, nVar2.f524546y, nVar2.f524547z);
                } else if (i38 == i39) {
                    w51.n.a(nVar2, i27, i38, 1, nVar2.f524537p, nVar2.f524546y, nVar2.f524547z);
                } else {
                    w51.n.a(nVar2, i27, i38, 1, 31, nVar2.f524546y, nVar2.f524547z);
                }
            } else if (i27 == i28) {
                nVar.f524524c.m48595x6cab2c8d(new o51.d(nVar.f524534m, 12, new o51.b(nVar.A)));
                int i47 = nVar.f524534m;
                if (intValue <= i47) {
                    nVar.f524524c.m48596x940d026a(0);
                    i18 = nVar.f524534m;
                } else {
                    nVar.f524524c.m48596x940d026a(intValue - i47);
                    i18 = intValue;
                }
                w51.n nVar3 = this.f524518a;
                if (i18 == nVar3.f524534m) {
                    w51.n.a(nVar3, i27, i18, nVar3.f524536o, 31, nVar3.f524546y, nVar3.f524547z);
                } else {
                    w51.n.a(nVar3, i27, i18, 1, 31, nVar3.f524546y, nVar3.f524547z);
                }
            } else if (i27 == i29) {
                nVar.f524524c.m48595x6cab2c8d(new o51.d(1, nVar.f524535n, new o51.b(nVar.A)));
                if (m48589xfda78ef6 > nVar.f524524c.m48588xf939df19().mo145524x99620925() - 1) {
                    m48589xfda78ef6 = nVar.f524524c.m48588xf939df19().mo145524x99620925() - 1;
                    nVar.f524524c.m48596x940d026a(m48589xfda78ef6);
                }
                int i48 = nVar.f524535n;
                if (intValue >= i48) {
                    nVar.f524524c.m48596x940d026a(i48 - 1);
                } else {
                    nVar.f524524c.m48596x940d026a(intValue - 1);
                }
                int i49 = m48589xfda78ef6 + 1;
                w51.n nVar4 = this.f524518a;
                if (i49 == nVar4.f524535n) {
                    w51.n.a(nVar4, i27, i49, 1, nVar4.f524537p, nVar4.f524546y, nVar4.f524547z);
                } else {
                    w51.n.a(nVar4, i27, i49, 1, 31, nVar4.f524546y, nVar4.f524547z);
                }
            } else {
                nVar.f524524c.m48595x6cab2c8d(new o51.d(1, 12, new o51.b(nVar.A)));
                nVar.f524524c.m48596x940d026a(intValue - 1);
                w51.n nVar5 = this.f524518a;
                w51.n.a(nVar5, i27, nVar5.f524524c.m48589xfda78ef6() + 1, 1, 31, nVar.f524546y, nVar.f524547z);
            }
        }
        v51.a aVar = nVar.f524545x;
        if (aVar != null) {
            ((w51.f) aVar).a();
        }
    }
}

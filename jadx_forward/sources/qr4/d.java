package qr4;

/* loaded from: classes9.dex */
public class d extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr4.h f447661c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qr4.h hVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f447661c = hVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71) objArr[0];
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) objArr[1];
        qr4.h hVar = this.f447661c;
        int i17 = hVar.f295334c.getInt("key_pay_flag", 0);
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    return false;
                }
                if (hVar.r()) {
                    c19090x75920c71.f261075d = 6;
                } else {
                    c19090x75920c71.f261075d = 3;
                }
            } else if (hVar.r()) {
                c19090x75920c71.f261075d = 5;
            } else {
                c19090x75920c71.f261075d = 2;
            }
        } else if (hVar.r()) {
            c19090x75920c71.f261075d = 4;
        } else {
            c19090x75920c71.f261075d = 1;
        }
        hVar.f295334c.putParcelable("key_authen", c19090x75920c71);
        this.f420367b.d(new as4.b(c19090x75920c71, c19099x8d444f05, false), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof as4.b;
        qr4.h hVar = this.f447661c;
        if (z17) {
            as4.b bVar = (as4.b) m1Var;
            hVar.f295334c.putString("kreq_token", bVar.C);
            if (bVar.f39883x9cd69705) {
                hVar.f295334c.putParcelable("key_orders", bVar.A);
            }
        }
        hVar.getClass();
        hVar.o(this.f420366a, 0, hVar.f295334c);
        return true;
    }
}

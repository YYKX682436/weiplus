package qr4;

/* loaded from: classes9.dex */
public class e extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr4.h f447662c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qr4.h hVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f447662c = hVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56;
        at4.z0 z0Var = (at4.z0) objArr[1];
        if (z0Var != null && (c19760x34448d56 = z0Var.f95568n) != null) {
            c19760x34448d56.f273642e = 21;
        }
        qr4.h hVar = this.f447662c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) hVar.f295334c.getParcelable("key_orders");
        int i17 = hVar.f295334c.getInt("key_pay_flag", 0);
        if (i17 == 1) {
            z0Var.f95555a = "1";
        } else if (i17 != 2) {
            if (i17 != 3) {
                return false;
            }
            if (hVar.r()) {
                z0Var.f95555a = "6";
            } else {
                z0Var.f95555a = "3";
            }
        } else if (hVar.r()) {
            z0Var.f95555a = "5";
        } else {
            z0Var.f95555a = "2";
        }
        this.f420367b.d(new ds4.g(z0Var, c19099x8d444f05), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof ds4.g;
        qr4.h hVar = this.f447662c;
        if (z17) {
            ds4.g gVar = (ds4.g) m1Var;
            if (gVar.f39883x9cd69705) {
                hVar.f295334c.putParcelable("key_orders", gVar.f324459x);
            }
            com.p314xaae8f345.mm.p2802xd031a825.a.d(this.f420366a, hVar.f295334c);
            return true;
        }
        if (!(m1Var instanceof as4.b)) {
            return false;
        }
        as4.b bVar = (as4.b) m1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = bVar.f295594s;
        if (c19088xa4b300c1 != null) {
            hVar.f295334c.putParcelable("key_realname_guide_helper", c19088xa4b300c1);
        }
        hVar.f295334c.putString("kreq_token", bVar.C);
        return true;
    }

    @Override // np5.g
    public boolean f(java.lang.Object... objArr) {
        qr4.h hVar = this.f447662c;
        this.f420367b.d(new as4.b((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71) hVar.f295334c.getParcelable("key_authen"), (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) hVar.f295334c.getParcelable("key_orders"), false), true);
        return true;
    }
}

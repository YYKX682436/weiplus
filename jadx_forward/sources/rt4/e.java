package rt4;

/* loaded from: classes9.dex */
public class e extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rt4.f f481076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rt4.f fVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f481076c = fVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        rt4.f fVar = this.f481076c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.p2381x633fb29.C19178xda56ba87 c19178xda56ba87 = (com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.p2381x633fb29.C19178xda56ba87) fVar.f295334c.getParcelable("key_card_element");
        this.f420367b.a(new rt4.a(c19178xda56ba87.f262762e, c19178xda56ba87.f262763f, fVar.f295334c.getString("key_bank_username"), fVar.f295334c.getString("key_card_id"), fVar.f295334c.getString("key_expire_data"), c19178xda56ba87.f262764g, fVar.f295334c.getString("key_cvv"), fVar.f295334c.getString("key_pwd1")), true);
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17 = m1Var instanceof rt4.a;
        rt4.f fVar = this.f481076c;
        if (z17 && i17 == 0 && i18 == 0) {
            fVar.f295334c.putInt("key_errcode_payu", 0);
            fVar.f(this.f420366a, fVar.f295334c);
        }
        if (m1Var instanceof rt4.b) {
            if (i17 == 0 && i18 == 0) {
                rt4.b bVar = (rt4.b) m1Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.p2381x633fb29.C19178xda56ba87 c19178xda56ba87 = bVar.f481075e;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19178xda56ba87.f262761d)) {
                    c19178xda56ba87.f262763f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575129kw2);
                }
                fVar.f295334c.putParcelable("key_card_element", bVar.f481075e);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.p2381x633fb29.C19178xda56ba87 c19178xda56ba872 = new com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.p2381x633fb29.C19178xda56ba87();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = "err card element";
                }
                c19178xda56ba872.f262763f = str;
                fVar.f295334c.putParcelable("key_card_element", c19178xda56ba872);
            }
        }
        return false;
    }
}

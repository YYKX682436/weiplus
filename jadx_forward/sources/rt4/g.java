package rt4;

/* loaded from: classes9.dex */
public class g extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rt4.h f481077c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(rt4.h hVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f481077c = hVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        if (i17 == 0) {
            return this.f420366a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kk8);
        }
        return null;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        rt4.h hVar = this.f481077c;
        hVar.f295334c.putString("key_pwd1", (java.lang.String) objArr[0]);
        this.f420367b.a(new yt4.c(hVar.f295334c.getString("key_pwd1")), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17 = m1Var instanceof yt4.c;
        rt4.h hVar = this.f481077c;
        if (z17) {
            if (i18 == 0 && i17 == 0) {
                yt4.c cVar = (yt4.c) m1Var;
                hVar.f295334c.putString("payu_reference", cVar.f547282d);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f547282d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PayUUnbindProcess", "hy: check pwd failed");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) hVar.f295334c.getParcelable("key_bankcard");
                    if (c19091x9511676c != null) {
                        this.f420367b.a(new rt4.c(c19091x9511676c.f69225xed6d60f6, hVar.f295334c.getString("payu_reference")), true);
                    }
                }
            }
        } else if ((m1Var instanceof rt4.c) && i17 == 0 && i18 == 0) {
            hVar.f295334c.putInt("key_errcode_payu", 0);
            hVar.f(this.f420366a, hVar.f295334c);
        }
        return false;
    }
}

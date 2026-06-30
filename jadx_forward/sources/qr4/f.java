package qr4;

/* loaded from: classes9.dex */
public class f extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr4.h f447663c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(qr4.h hVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f447663c = hVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        if (i17 == 0) {
            return abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kfc);
        }
        qr4.h hVar = this.f447663c;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f052 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) hVar.f295334c.getParcelable("key_orders");
            return (c19099x8d444f052 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19099x8d444f052.F)) ? abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kfb) : c19099x8d444f052.F;
        }
        if (i17 == 2 && (c19099x8d444f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) hVar.f295334c.getParcelable("key_orders")) != null && c19099x8d444f05.E > 0) {
            return new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f).format(new java.util.Date(c19099x8d444f05.E));
        }
        return null;
    }

    @Override // np5.g
    public boolean c(java.lang.Object... objArr) {
        qr4.h hVar = this.f447663c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) hVar.f295334c.getParcelable("key_orders");
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95532h.O2 -= c19099x8d444f05.f261211h;
        hVar.f295334c.putInt("key_balance_result_logo", com.p314xaae8f345.mm.R.raw.f80970xf648b976);
        return false;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}

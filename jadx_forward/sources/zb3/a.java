package zb3;

/* loaded from: classes9.dex */
public class a extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zb3.b f552798c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zb3.b bVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f552798c = bVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        this.f420367b.d(new ac3.a(1, (java.lang.String) objArr[0], ""), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof ac3.a)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "OpenSnsPayProcess onSceneEnd, errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        zb3.b bVar = this.f552798c;
        if (i17 == 0 && i18 == 0) {
            db5.e1.T(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gml));
            bVar.getClass();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6075x544e5a12 c6075x544e5a12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6075x544e5a12();
            c6075x544e5a12.f136357g.f88328a = 121;
            c6075x544e5a12.e();
            bVar.f295334c.putBoolean("is_open_sns_pay", true);
            bVar.f(abstractActivityC21394xb3d2c0cf, bVar.f295334c);
        } else {
            db5.e1.T(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gmk));
            bVar.getClass();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6075x544e5a12 c6075x544e5a122 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6075x544e5a12();
            c6075x544e5a122.f136357g.f88328a = 122;
            c6075x544e5a122.e();
            bVar.f(abstractActivityC21394xb3d2c0cf, null);
        }
        return true;
    }
}

package cr3;

/* loaded from: classes11.dex */
public class s extends np.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f303496d;

    public s(cr3.d0 d0Var) {
        this.f303496d = d0Var;
    }

    @Override // c01.g1
    public void a(int i17, int i18, java.lang.String str, c01.g1 g1Var) {
        np.c cVar = (np.c) g1Var;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[2] = str == null ? "" : str;
        objArr[3] = cVar != null ? java.lang.Integer.valueOf(cVar.f420313a) : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMenuManager", "moveInBlackList errType:%s errCode:%s errMsg:%s ret:%s", objArr);
        vg3.n3 a17 = vg3.n3.f518269n1.a();
        vg3.d dVar = vg3.d.f518216i;
        vg3.b bVar = vg3.b.f518179f;
        vg3.c cVar2 = vg3.c.f518190i;
        int i19 = this.f420313a;
        cr3.d0 d0Var = this.f303496d;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) a17).wi(new vg3.e(dVar, bVar, cVar2, i19, new java.util.ArrayList(java.util.Collections.singletonList(d0Var.f303465e.d1()))));
        int i27 = this.f420313a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = d0Var.f303464d;
        if (i27 == 0) {
            d0Var.f303465e.E2();
            np.b.a(d0Var.f303465e);
            db5.t7.m123882x26a183b(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30867xcad56011.hmn, 1).show();
            return;
        }
        d0Var.f303465e.r3();
        np.b.b(d0Var.f303465e);
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f420314b) ? "" : this.f420314b;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f420315c)) {
            str = this.f420315c;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hmm);
        }
        db5.e1.y(abstractActivityC21394xb3d2c0cf, str, str2, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), new cr3.r(this));
        cr3.d0.a(d0Var);
    }
}

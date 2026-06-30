package yr4;

/* loaded from: classes9.dex */
public class q extends yr4.t {
    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        if (i17 == 0) {
            return abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kff);
        }
        if (i17 != 1) {
            return null;
        }
        return abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kfe);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) objArr[0];
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = vr4.f1.wi().Ai().f95532h;
        if (c19091x9511676c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "balance == null");
            return false;
        }
        c19091x9511676c.O2 += c19099x8d444f05.f261211h;
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}

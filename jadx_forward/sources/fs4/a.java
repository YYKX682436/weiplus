package fs4;

/* loaded from: classes9.dex */
public class a extends np5.g {
    public a(fs4.h hVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0 && (m1Var instanceof ss4.e0)) {
            at4.v1 y07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "hy: reset_pwd_flag: %s, find_pwd_url: %s", y07.f67063x4856f578, y07.f67043xcbe8ad4f);
            at4.v1 v1Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95530f;
            java.lang.String str2 = v1Var != null ? v1Var.f67044xaf3d15db : "";
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "jump to forget url: %s", str2);
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this.f420366a, str2, false);
                return true;
            }
        }
        return false;
    }
}

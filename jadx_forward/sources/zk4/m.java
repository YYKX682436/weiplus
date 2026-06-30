package zk4;

/* loaded from: classes11.dex */
public final class m extends gp1.e0 {
    @Override // gp1.x
    public void G0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
    }

    @Override // gp1.e0, gp1.x
    public void R2(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        jm4.h2 h2Var;
        jm4.n5 n5Var;
        jm4.i3 i3Var;
        if (c12886x91aa2b6d == null || c12886x91aa2b6d.f174578J || zk4.f.f555064a) {
            return;
        }
        android.os.Bundle bundle = c12886x91aa2b6d.G;
        if (bundle == null ? false : bundle.getBoolean("key_state_float_ball_need_persist")) {
            byte[] byteArray = c12886x91aa2b6d.G.getByteArray("key_state_float_ball_context_data");
            if (byteArray == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingMusicFloatBallEventListener", "onFloatBallInfoExposed contextData is null");
                return;
            }
            try {
                if (((ef0.c3) ((qk.q8) i95.n0.c(qk.q8.class))).wi()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMusicFloatBallEventListener", "onFloatBallInfoRestore");
                    bw5.fr0 mo11468x92b714fd = new bw5.fr0().mo11468x92b714fd(byteArray);
                    qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
                    if (g9Var != null && (n5Var = (jm4.n5) ((jz5.n) ((rk4.z8) g9Var).f478672m).mo141623x754a37bb()) != null && (i3Var = (jm4.i3) p3380x6a61f93.p3381xf512d0a5.C30490x21b8a710.m169313x21b3d6af(((jm4.p5) n5Var).m105978x2737f10())) != null) {
                        p3380x6a61f93.p3381xf512d0a5.C30397x21b06598.m168536x21b330b7(((jm4.j3) i3Var).m105978x2737f10(), true);
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6169x1d2189d9 c6169x1d2189d9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6169x1d2189d9();
                    c6169x1d2189d9.f136429g.f87826a = true;
                    c6169x1d2189d9.e();
                    bw5.jq0 jq0Var = new bw5.jq0();
                    boolean[] zArr = jq0Var.f110648m;
                    jq0Var.f110642d = mo11468x92b714fd.c();
                    zArr[1] = true;
                    jq0Var.f110644f = mo11468x92b714fd.b();
                    zArr[3] = true;
                    jq0Var.f110645g = mo11468x92b714fd.f109032n[6] ? mo11468x92b714fd.f109030i : bw5.eq0.Basic;
                    zArr[4] = true;
                    jq0Var.f110647i = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(byteArray);
                    zArr[6] = true;
                    jm4.u2 a17 = jm4.w2.f381968d.a();
                    jm4.n2 a18 = a17 != null ? ((jm4.w2) a17).a(bw5.eq0.TingMusic) : null;
                    if (a18 == null || (h2Var = (jm4.h2) p3380x6a61f93.p3381xf512d0a5.C30463x21b415b4.m169149x21b82042(((jm4.p2) a18).m105978x2737f10())) == null) {
                        return;
                    }
                    pm0.v.X(new sl4.j((sl4.l) h2Var, jq0Var));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingMusicFloatBallEventListener", "onFloatBallInfoExposed " + e17.getMessage());
            }
        }
    }

    @Override // gp1.x
    public void r0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
    }
}

package we0;

/* loaded from: classes11.dex */
public final class t1 implements gm0.e2, gm0.i2, com.p314xaae8f345.mm.p944x882e457a.j1 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f526701d;

    @Override // gm0.e2
    public java.util.HashMap U5() {
        return kz5.c1.i(new jz5.l(1719732168, we0.r1.f526689a));
    }

    @Override // gm0.i2
    public void kh(int i17) {
        if (i17 != com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h) {
            java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f102626a;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_text_state_input_level, 1) == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusStaticCallbacks", "onClientUpgraded: " + i17 + ", " + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h);
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_text_status_permission_check_enable, false)) {
                    gm0.j1.d().g(new ej4.i());
                }
                this.f526701d = true;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.dw6 dw6Var;
        pj4.e1 e1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusStaticCallbacks", "onSceneEnd: errType：" + i17 + " errCode:" + i18 + " errMsg:" + str + " scene:" + m1Var);
        if (m1Var instanceof ej4.e) {
            if (i17 == 0 && i18 == 0 && (e1Var = ((ej4.e) m1Var).f334876g) != null) {
                pm0.v.O("TextStatusThread", new we0.s1(e1Var, m1Var));
                return;
            }
            return;
        }
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p957x53236a1b.p0 p0Var = m1Var instanceof com.p314xaae8f345.mm.p957x53236a1b.p0 ? (com.p314xaae8f345.mm.p957x53236a1b.p0) m1Var : null;
            com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = p0Var != null ? p0Var.mo47948x7f0c4558() : null;
            com.p314xaae8f345.mm.p944x882e457a.o oVar = mo47948x7f0c4558 instanceof com.p314xaae8f345.mm.p944x882e457a.o ? (com.p314xaae8f345.mm.p944x882e457a.o) mo47948x7f0c4558 : null;
            java.lang.Object obj = oVar != null ? oVar.f152244b.f152233a : null;
            r45.tl3 tl3Var = obj instanceof r45.tl3 ? (r45.tl3) obj : null;
            if (tl3Var != null && (dw6Var = tl3Var.f468077e) != null) {
                if (di4.i.f314315a.e()) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("statusData is empty ");
                    java.lang.String str2 = dw6Var.P;
                    sb6.append(str2 == null || str2.length() == 0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusStaticCallbacks", sb6.toString());
                    ((zh4.k) i95.n0.c(zh4.k.class)).Ai(dw6Var.P, bk4.k1.a());
                } else {
                    java.lang.String str3 = dw6Var.X;
                    java.lang.String str4 = dw6Var.Y;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusStaticCallbacks", "statusID: " + str3 + ", extInfo: " + str4);
                    xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    ((we0.j1) l0Var).uj(str3, str4, bool, bool);
                }
            }
        }
        if (this.f526701d) {
            return;
        }
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f102626a;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_text_state_input_level, 1) == 1) {
            gm0.j1.d().g(new ej4.i());
        }
    }
}

package r01;

@j95.b
/* loaded from: classes9.dex */
public class s1 extends i95.w implements r01.x2, vg3.s3 {

    /* renamed from: d, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2621x8fb0427b.v f449771d;

    /* renamed from: e, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2621x8fb0427b.w f449772e;

    public com.p314xaae8f345.mm.p2621x8fb0427b.w Ai() {
        if (this.f449772e == null) {
            synchronized (this) {
                this.f449772e = new com.p314xaae8f345.mm.p2621x8fb0427b.w(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di());
            }
        }
        return this.f449772e;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.v Bi(xg3.m0 m0Var) {
        if (this.f449771d == null) {
            synchronized (this) {
                if (this.f449771d == null) {
                    if (m0Var == null) {
                        m0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
                    }
                    this.f449771d = new com.p314xaae8f345.mm.p2621x8fb0427b.v(m0Var);
                }
            }
        }
        return this.f449771d;
    }

    public void Di(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        if (l4Var == null || f9Var == null || f9Var.t0() == -1 || !l4Var.d2(8388608)) {
            return;
        }
        s01.h z07 = r01.q3.Ui().z0(f9Var.t0());
        java.lang.String y07 = l4Var.y0();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.u0())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizConversationStorage", "BizChatUserId is null:%s %s", z07.f69169xf75e5c37, z07.f69171x736d1fa8);
            return;
        }
        s01.a0 y08 = r01.q3.Vi().y0(f9Var.u0());
        java.lang.String str = y08 != null ? y08.f65841xdde069b : null;
        boolean equals = f9Var.u0().equals(r01.q3.Vi().z0(f9Var.Q0()));
        if (y08 != null && equals) {
            l4Var.o1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572005w1) + ":" + y07);
        } else if (y08 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y08.f65841xdde069b)) {
            l4Var.o1(y08.f65841xdde069b + ":" + y07);
        }
        if (z07.y0()) {
            return;
        }
        if (!equals && str != null && str.length() > 0 && !str.equals(z07.f69171x736d1fa8)) {
            z07.f69171x736d1fa8 = str;
            r01.q3.Ui().P0(z07);
            return;
        }
        s01.a0 y09 = r01.q3.Vi().y0(z07.f69169xf75e5c37);
        java.lang.String str2 = y09 != null ? y09.f65841xdde069b : null;
        if (str2 == null || str2.length() <= 0 || str2.equals(z07.f69171x736d1fa8)) {
            return;
        }
        z07.f69171x736d1fa8 = str2;
        r01.q3.Ui().P0(z07);
    }

    public java.lang.String wi() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("brandicon/");
        return sb6.toString();
    }
}

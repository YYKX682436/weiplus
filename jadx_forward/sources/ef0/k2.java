package ef0;

@j95.b
/* loaded from: classes8.dex */
public final class k2 extends i95.w implements qk.n8 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.lp0 f333785d;

    /* renamed from: e, reason: collision with root package name */
    public qk.m8 f333786e = qk.m8.f445783d;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f333787f = jz5.h.b(ef0.i2.f333764d);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f333788g = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f333789h = jz5.h.b(ef0.h2.f333756d);

    public k2() {
        bw5.v70 d17;
        ef0.j2 j2Var = new ef0.j2(this);
        if (Bi()) {
            ((ef0.j3) ((qk.u8) i95.n0.c(qk.u8.class))).wi(j2Var);
            qk.ia Ri = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Ri();
            bw5.lp0 uj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).uj();
            this.f333785d = uj6;
            boolean z17 = false;
            if (uj6 != null) {
                boolean ij6 = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).ij(uj6.d().f115722e);
                if (ij6 && Ri.h()) {
                    Ri(qk.m8.f445785f, false, this.f333785d);
                }
                z17 = ij6;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init enableTingEntryWithPlayState: ");
            sb6.append(Bi());
            sb6.append(", isTypeShowPlayStateView: ");
            sb6.append(z17);
            sb6.append(", playState: ");
            sb6.append(Ri);
            sb6.append(", mCurrentShowMode: ");
            sb6.append(this.f333786e);
            sb6.append(", listenType: ");
            bw5.lp0 lp0Var = this.f333785d;
            sb6.append((lp0Var == null || (d17 = lp0Var.d()) == null) ? null : java.lang.Integer.valueOf(d17.f115722e));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingDiscoverEntryService", sb6.toString());
        }
    }

    public static final void wi(ef0.k2 k2Var, qk.m8 m8Var, bw5.lp0 lp0Var) {
        bw5.v70 d17;
        bw5.v70 d18;
        bw5.v70 d19;
        bw5.v70 d27;
        k2Var.getClass();
        boolean z17 = false;
        boolean ij6 = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).ij((lp0Var == null || (d27 = lp0Var.d()) == null) ? 0 : d27.f115722e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingDiscoverEntryService", "switchPlayShowMode mode: " + m8Var + ", isTypeShowPlayStateView: " + ij6);
        java.lang.String str = null;
        if (!ij6) {
            k2Var.Ri(qk.m8.f445783d, false, null);
            k2Var.f333785d = null;
            return;
        }
        bw5.lp0 lp0Var2 = k2Var.f333785d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((lp0Var2 == null || (d19 = lp0Var2.d()) == null) ? null : d19.m13170xcc16feb8(), (lp0Var == null || (d18 = lp0Var.d()) == null) ? null : d18.m13170xcc16feb8())) {
            if (lp0Var != null && (d17 = lp0Var.d()) != null) {
                str = d17.m13170xcc16feb8();
            }
            if (!(str == null || str.length() == 0)) {
                z17 = true;
            }
        }
        k2Var.Ri(m8Var, z17, lp0Var);
        k2Var.f333785d = lp0Var;
    }

    public void Ai(java.util.Map data) {
        bw5.lp0 lp0Var;
        bw5.v70 d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        boolean Di = Di();
        bw5.lp0 lp0Var2 = this.f333785d;
        if (lp0Var2 != null && (d17 = lp0Var2.d()) != null) {
            d17.m13170xcc16feb8();
        }
        data.put("tde_play_status", java.lang.Integer.valueOf(Di ? 1 : 0));
        if (!Di || (lp0Var = this.f333785d) == null) {
            return;
        }
        bw5.v70 d18 = lp0Var.d();
        java.lang.String str = d18.m13172x6e095e9(9) ? d18.f115729o : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getBaseListenId(...)");
        data.put("tde_play_base_listenid", str);
        java.lang.String m13170xcc16feb8 = lp0Var.d().m13170xcc16feb8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m13170xcc16feb8, "getListenId(...)");
        data.put("tde_play_listenid", m13170xcc16feb8);
        data.put("tde_play_listenid_type", java.lang.Integer.valueOf(lp0Var.d().f115722e));
    }

    public final boolean Bi() {
        return ((java.lang.Boolean) this.f333789h.mo141623x754a37bb()).booleanValue();
    }

    public boolean Di() {
        qk.m8 m8Var = this.f333786e;
        return m8Var == qk.m8.f445784e || m8Var == qk.m8.f445785f;
    }

    public final void Ni(qk.m8 mode, bw5.lp0 lp0Var, qk.ia iaVar) {
        java.util.Iterator it = this.f333788g.iterator();
        while (it.hasNext()) {
            rg5.u uVar = (rg5.u) ((qk.l8) it.next());
            uVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
            rg5.x xVar = uVar.f476815a;
            xVar.f476825g = lp0Var;
            xVar.e(mode, iaVar);
        }
    }

    public final void Ri(qk.m8 m8Var, boolean z17, bw5.lp0 lp0Var) {
        java.util.Objects.toString(m8Var);
        java.util.Objects.toString(this.f333786e);
        if (this.f333786e != m8Var || z17) {
            if (m8Var == qk.m8.f445783d) {
                this.f333786e = m8Var;
                Ni(m8Var, lp0Var, null);
            } else if (Bi()) {
                if (m8Var == qk.m8.f445784e || m8Var == qk.m8.f445785f) {
                    this.f333786e = m8Var;
                    Ni(m8Var, lp0Var, ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Ri());
                }
            }
        }
    }
}

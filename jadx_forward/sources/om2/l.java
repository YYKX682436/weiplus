package om2;

/* loaded from: classes3.dex */
public final class l extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public boolean f427874f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f427875g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f427876h;

    /* renamed from: i, reason: collision with root package name */
    public r45.gw1 f427877i;

    /* renamed from: m, reason: collision with root package name */
    public r45.xw1 f427878m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f427879n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f427875g = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 1, null, 5, null);
        this.f427879n = jz5.h.b(om2.j.f427871d);
    }

    public final int N6() {
        ae2.in inVar = ae2.in.f85221a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85292h0).mo141623x754a37bb()).r()).intValue();
    }

    public final int O6() {
        r45.xw1 xw1Var = this.f427878m;
        if (xw1Var == null) {
            return 1;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(xw1Var.m75939xb282bd08(1));
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 1;
    }

    public final int P6() {
        r45.xw1 xw1Var = this.f427878m;
        if (xw1Var == null) {
            return 1;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(xw1Var.m75939xb282bd08(0));
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 1;
    }

    public final int Q6() {
        r45.xw1 xw1Var = this.f427878m;
        if (xw1Var != null) {
            return xw1Var.m75939xb282bd08(2);
        }
        return 1;
    }

    public final boolean R6() {
        kn0.g gVar;
        kn0.i iVar = ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410523t;
        return (((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).b7() && (iVar != null && (gVar = iVar.f391091b) != null && gVar.f391069c == 1) && ((java.lang.Boolean) ((jz5.n) this.f427879n).mo141623x754a37bb()).booleanValue()) && !this.f427874f;
    }

    public final boolean S6() {
        java.lang.Boolean bool = ((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).f410380n2;
        if (!(bool != null ? bool.booleanValue() : false)) {
            return false;
        }
        r45.xw1 xw1Var = this.f427878m;
        return (xw1Var != null ? xw1Var.m75939xb282bd08(4) : 0) == 1;
    }

    public final void T6(r45.gw1 gw1Var) {
        this.f427877i = gw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set guide data: ");
        sb6.append(gw1Var != null ? gw1Var.m75945x2fec8307(2) : null);
        sb6.append(" limitation: ");
        sb6.append(gw1Var != null ? java.lang.Integer.valueOf(gw1Var.m75939xb282bd08(4)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveKTVSlice", sb6.toString());
    }

    public final void U6(r45.xw1 xw1Var) {
        this.f427878m = xw1Var;
        zl2.q4 q4Var = zl2.q4.f555466a;
        if (q4Var.E()) {
            ae2.in inVar = ae2.in.f85221a;
            jz5.g gVar = ae2.in.f85222a0;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() > 0) {
                if (this.f427878m == null) {
                    this.f427878m = new r45.xw1();
                }
                r45.xw1 xw1Var2 = this.f427878m;
                if (xw1Var2 != null) {
                    xw1Var2.set(0, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue()));
                }
            }
        }
        if (q4Var.E()) {
            ae2.in inVar2 = ae2.in.f85221a;
            jz5.g gVar2 = ae2.in.f85252d0;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).mo141623x754a37bb()).r()).intValue() > 0) {
                if (this.f427878m == null) {
                    this.f427878m = new r45.xw1();
                }
                r45.xw1 xw1Var3 = this.f427878m;
                if (xw1Var3 != null) {
                    xw1Var3.set(1, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).mo141623x754a37bb()).r()).intValue()));
                }
            }
        }
        if (q4Var.E()) {
            ae2.in inVar3 = ae2.in.f85221a;
            jz5.g gVar3 = ae2.in.f85232b0;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).mo141623x754a37bb()).r()).intValue() > 0) {
                if (this.f427878m == null) {
                    this.f427878m = new r45.xw1();
                }
                r45.xw1 xw1Var4 = this.f427878m;
                if (xw1Var4 != null) {
                    xw1Var4.set(2, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).mo141623x754a37bb()).r()).intValue()));
                }
            }
        }
        if (q4Var.E()) {
            ae2.in inVar4 = ae2.in.f85221a;
            jz5.g gVar4 = ae2.in.f85242c0;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).mo141623x754a37bb()).r()).intValue() > 0) {
                if (this.f427878m == null) {
                    this.f427878m = new r45.xw1();
                }
                r45.xw1 xw1Var5 = this.f427878m;
                if (xw1Var5 != null) {
                    xw1Var5.set(3, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).mo141623x754a37bb()).r()).intValue()));
                }
            }
        }
        if (q4Var.E()) {
            if (this.f427878m == null) {
                this.f427878m = new r45.xw1();
            }
            r45.xw1 xw1Var6 = this.f427878m;
            if (xw1Var6 != null) {
                xw1Var6.set(4, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.V).mo141623x754a37bb()).r()).intValue() > 0 ? 1 : 0));
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateFinderLiveKtvExtInfo scoreFlag: ");
        r45.xw1 xw1Var7 = this.f427878m;
        sb6.append(xw1Var7 != null ? java.lang.Integer.valueOf(xw1Var7.m75939xb282bd08(0)) : null);
        sb6.append(" reverbFlag: ");
        r45.xw1 xw1Var8 = this.f427878m;
        sb6.append(xw1Var8 != null ? java.lang.Integer.valueOf(xw1Var8.m75939xb282bd08(1)) : null);
        sb6.append(" ktv_volume_strategy_flag: ");
        r45.xw1 xw1Var9 = this.f427878m;
        sb6.append(xw1Var9 != null ? java.lang.Integer.valueOf(xw1Var9.m75939xb282bd08(2)) : null);
        sb6.append(" bluetoothFlag: ");
        r45.xw1 xw1Var10 = this.f427878m;
        sb6.append(xw1Var10 != null ? java.lang.Integer.valueOf(xw1Var10.m75939xb282bd08(3)) : null);
        sb6.append(" singingStrategyFlag: ");
        r45.xw1 xw1Var11 = this.f427878m;
        sb6.append(xw1Var11 != null ? java.lang.Integer.valueOf(xw1Var11.m75939xb282bd08(4)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveKTVSlice", sb6.toString());
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        T6(null);
    }
}

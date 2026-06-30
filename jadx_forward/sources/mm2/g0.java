package mm2;

/* loaded from: classes3.dex */
public final class g0 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public int f410595f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f410596g;

    /* renamed from: h, reason: collision with root package name */
    public mm2.f0 f410597h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f410598i;

    /* renamed from: m, reason: collision with root package name */
    public r45.td2 f410599m;

    /* renamed from: n, reason: collision with root package name */
    public int f410600n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f410598i = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(java.lang.Boolean.FALSE);
    }

    public static boolean Q6(mm2.g0 g0Var, r45.o52 o52Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            o52Var = g0Var.P6();
        }
        g0Var.getClass();
        if (o52Var != null && o52Var.m75939xb282bd08(0) == 2) {
            return true;
        }
        if (o52Var != null && o52Var.m75939xb282bd08(0) == 8) {
            return true;
        }
        return o52Var != null && o52Var.m75939xb282bd08(0) == 16;
    }

    public static boolean R6(mm2.g0 g0Var, r45.o52 o52Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            o52Var = g0Var.P6();
        }
        g0Var.getClass();
        return o52Var != null && o52Var.m75939xb282bd08(0) == 8;
    }

    public final int N6(int i17) {
        if (i17 == 1) {
            r45.td2 td2Var = this.f410599m;
            if (td2Var != null) {
                return td2Var.m75939xb282bd08(1);
            }
            return 0;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anchorPreviewDuration type:");
        sb6.append(i17);
        sb6.append(",startTime:");
        sb6.append(((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410521r.m75939xb282bd08(4));
        sb6.append(",end_time:");
        r45.td2 td2Var2 = this.f410599m;
        sb6.append(td2Var2 != null ? java.lang.Integer.valueOf(td2Var2.m75939xb282bd08(3)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveChargeSlice", sb6.toString());
        r45.td2 td2Var3 = this.f410599m;
        int m75939xb282bd08 = (td2Var3 != null ? td2Var3.m75939xb282bd08(3) : 0) - ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410521r.m75939xb282bd08(4);
        if (m75939xb282bd08 < 0) {
            return 0;
        }
        return m75939xb282bd08;
    }

    public final boolean O6() {
        if (zl2.q4.f555466a.E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveChargeSlice", "freeTimeWatchChargeLive " + this.f410600n);
        }
        return this.f410600n > 0;
    }

    public final r45.o52 P6() {
        return (r45.o52) ((mm2.e1) m147920xbba4bfc0(mm2.e1.class)).f410521r.m75936x14adae67(28);
    }

    public final boolean S6() {
        r45.o52 P6 = P6();
        return P6 != null && P6.m75933x41a8a7f2(1);
    }

    public final boolean T6() {
        return Q6(this, null, 1, null) && !S6();
    }

    public final boolean U6() {
        return !((mm2.c1) m147920xbba4bfc0(mm2.c1.class)).e8() || ((mm2.g0) m147920xbba4bfc0(mm2.g0.class)).O6();
    }

    public final void V6(java.lang.String source, r45.td2 td2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        r45.td2 td2Var2 = this.f410599m;
        boolean z17 = false;
        if (td2Var2 != null && td2Var != null && ((td2Var2.m75939xb282bd08(1) > 0 && td2Var.m75939xb282bd08(1) > td2Var2.m75939xb282bd08(1)) || (td2Var2.m75939xb282bd08(3) > 0 && td2Var.m75939xb282bd08(3) > td2Var2.m75939xb282bd08(3)))) {
            z17 = true;
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = this.f410598i;
        if (td2Var != null) {
            this.f410599m = td2Var;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(source);
            sb6.append(" update trialInfo to:");
            sb6.append("FinderLiveUrlOption:[" + td2Var.m75939xb282bd08(1) + ',' + td2Var.m75939xb282bd08(3) + ']');
            sb6.append(",increaseChargeFreeTimeDuration:");
            sb6.append(((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()).booleanValue());
            sb6.append(",notify:");
            sb6.append(z17);
            sb6.append('!');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveChargeSlice", sb6.toString());
        }
        mm2.f0 f0Var = this.f410597h;
        if (f0Var != null) {
            df2.j0 j0Var = ((df2.c0) f0Var).f311370a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j0Var.f311973m, "increaseChargeFreeTimeDuration:" + z17 + '!');
            if (z17) {
                pm0.v.X(new df2.b0(j0Var));
            }
        }
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(java.lang.Boolean.valueOf(z17));
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        this.f410600n = 0;
        this.f410597h = null;
    }
}

package ey2;

/* loaded from: classes2.dex */
public final class z1 extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public ey2.d3 f339125e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ym5 f339126f;

    /* renamed from: g, reason: collision with root package name */
    public r45.um5 f339127g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f339128h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f339129i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f339130m;

    public z1() {
        this.f339128h = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SYNC_RED_DOT_SESSION_REPORT_SWITCH_INT, 0) > 0;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495.mo40973x40b15f2e(new ey2.s1(this));
    }

    public final ey2.d3 N6() {
        if (this.f339125e == null) {
            ey2.d3 d3Var = new ey2.d3(null, 1, null);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            d3Var.f338875a.set(1, b52.b.b());
            this.f339125e = d3Var;
        }
        ey2.d3 d3Var2 = this.f339125e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d3Var2);
        return d3Var2;
    }

    public final r45.um5 O6(r45.um5 um5Var) {
        if (um5Var == null) {
            return null;
        }
        r45.um5 um5Var2 = new r45.um5();
        um5Var2.set(2, um5Var.m75934xbce7f2f(2));
        um5Var2.set(1, java.lang.Integer.valueOf(um5Var.m75939xb282bd08(1)));
        um5Var2.set(3, java.lang.Long.valueOf(um5Var.m75942xfb822ef2(3)));
        um5Var2.set(0, java.lang.Long.valueOf(um5Var.m75942xfb822ef2(0)));
        return um5Var2;
    }

    public final ey2.d3 P6(int i17) {
        r45.ym5 ym5Var;
        r45.ym5 ym5Var2;
        if (!this.f339128h) {
            return null;
        }
        ey2.d3 d3Var = this.f339125e;
        if (d3Var != null && (ym5Var2 = d3Var.f338875a) != null) {
            ym5Var2.set(0, java.lang.Integer.valueOf(i17));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[consumeRedDotSession] ");
        sb6.append((d3Var == null || (ym5Var = d3Var.f338875a) == null) ? null : ey2.a2.b(ym5Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotSessionVM", sb6.toString());
        this.f339125e = null;
        return d3Var;
    }

    public final void Q6() {
        r45.vs2 vs2Var;
        ey2.d3 N6 = N6();
        if (N6.f338881g) {
            java.util.LinkedList m75941xfb821914 = N6.f338875a.m75941xfb821914(6);
            r45.um5 um5Var = new r45.um5();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = N6.f338883i;
            um5Var.set(2, (jbVar == null || (vs2Var = jbVar.f65874xb5f7102a) == null) ? null : vs2Var.f470035w);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2 = N6.f338883i;
            um5Var.set(1, java.lang.Integer.valueOf(jbVar2 != null ? jbVar2.f65875xb5fc3ab6 : 0));
            um5Var.set(3, java.lang.Long.valueOf(N6.f338884j));
            um5Var.set(0, java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - N6.f338882h) / 1000));
            m75941xfb821914.add(um5Var);
            N6.f338881g = false;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dismissLeft] tipsId=");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar3 = N6.f338883i;
            sb6.append(jbVar3 != null ? jbVar3.f65880x11c19d58 : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotSessionVM", sb6.toString());
        }
    }

    public final void R6(int i17) {
        r45.vs2 vs2Var;
        ey2.d3 N6 = N6();
        if (N6.f338877c) {
            N6.f338877c = false;
            r45.um5 um5Var = new r45.um5();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = N6.f338879e;
            um5Var.set(2, (jbVar == null || (vs2Var = jbVar.f65874xb5f7102a) == null) ? null : vs2Var.f470035w);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2 = N6.f338879e;
            um5Var.set(1, java.lang.Integer.valueOf(jbVar2 != null ? jbVar2.f65875xb5fc3ab6 : 0));
            um5Var.set(0, java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - N6.f338878d) / 1000));
            N6.f338875a.m75941xfb821914(7).add(um5Var);
            if (i17 == 2) {
                V6(O6(um5Var));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dismissRight] scene=");
            sb6.append(i17);
            sb6.append(", tipsId=");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar3 = N6.f338879e;
            sb6.append(jbVar3 != null ? jbVar3.f65880x11c19d58 : null);
            sb6.append('}');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotSessionVM", sb6.toString());
        }
    }

    public final void S6(ey2.d3 d3Var) {
        r45.ym5 ym5Var;
        r45.ym5 ym5Var2;
        if (this.f339128h) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doSync] pendingClickSceneRedDot=");
            r45.um5 um5Var = this.f339127g;
            boolean z17 = false;
            sb6.append(um5Var != null ? um5Var.hashCode() : 0);
            sb6.append(' ');
            sb6.append((d3Var == null || (ym5Var2 = d3Var.f338875a) == null) ? null : ey2.a2.b(ym5Var2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotSessionVM", sb6.toString());
            if (d3Var != null && (ym5Var = d3Var.f338875a) != null && ym5Var.m75939xb282bd08(0) == 3) {
                z17 = true;
            }
            if (z17) {
                r45.um5 um5Var2 = this.f339127g;
                if (um5Var2 != null) {
                    d3Var.f338875a.m75941xfb821914(7).add(O6(um5Var2));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotSessionVM", "[FinderReddotDoSync] insert right_reddot_info=" + ey2.a2.a(um5Var2));
                }
                V6(null);
            }
            r45.ym5 ym5Var3 = d3Var != null ? d3Var.f338875a : null;
            this.f339126f = ym5Var3;
            if (ym5Var3 != null) {
                ((ku5.t0) ku5.t0.f394148d).B(ey2.y1.f339115d);
            }
        }
    }

    public final void T6(int i17) {
        if (this.f339128h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotSessionVM", "[fallback] scene=" + i17);
            if (i17 != 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.U.mo3195x754a37bb();
                if (z9Var != null && z9Var.f186862c != null && z9Var.f186860a) {
                    W6(z9Var);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186892d.mo3195x754a37bb();
                if (z9Var2 != null && z9Var2.f186862c != null && z9Var2.f186860a) {
                    X6("[fallback] scene=" + i17, z9Var2);
                }
            }
            R6(i17);
            Q6();
        }
    }

    public final r45.ym5 U6(int i17) {
        if (!this.f339128h) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getRedDotSession] syncLocalScene=");
        sb6.append(i17);
        sb6.append(' ');
        r45.ym5 ym5Var = this.f339126f;
        sb6.append(ym5Var != null ? ey2.a2.b(ym5Var) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotSessionVM", sb6.toString());
        r45.ym5 ym5Var2 = this.f339126f;
        this.f339126f = null;
        return ym5Var2;
    }

    public final void V6(r45.um5 um5Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderReddotDoSync] save clickScenePendingRedDot=");
        sb6.append(um5Var != null ? ey2.a2.a(um5Var) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotSessionVM", sb6.toString());
        this.f339127g = um5Var;
    }

    public final void W6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var) {
        ey2.d3 N6 = N6();
        if (N6.f338881g) {
            return;
        }
        N6.f338881g = true;
        N6.f338882h = java.lang.System.currentTimeMillis();
        N6.f338883i = z9Var.f186862c;
        r45.f03 f03Var = z9Var.f186861b;
        N6.f338884j = f03Var != null ? f03Var.f455421e : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[showLeft] tipsId=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = N6.f338883i;
        sb6.append(jbVar != null ? jbVar.f65880x11c19d58 : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotSessionVM", sb6.toString());
    }

    public final void X6(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotSessionVM", str + " showRight (" + z9Var.hashCode() + ") " + z9Var + ",pendingRedDotSessionEx=" + this.f339125e);
        ey2.d3 N6 = N6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = N6.f338879e;
        java.lang.String str2 = jbVar != null ? jbVar.f65880x11c19d58 : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2 = z9Var.f186862c;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, jbVar2 != null ? jbVar2.f65880x11c19d58 : null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[showLeft] change ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar3 = N6.f338879e;
            sb6.append(jbVar3 != null ? jbVar3.f65880x11c19d58 : null);
            sb6.append(" -> ");
            sb6.append(jbVar2 != null ? jbVar2.f65880x11c19d58 : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotSessionVM", sb6.toString());
            R6(-1);
        }
        if (N6.f338877c) {
            return;
        }
        N6.f338877c = true;
        N6.f338878d = java.lang.System.currentTimeMillis();
        N6.f338879e = jbVar2;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[showRight] tipsId=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar4 = N6.f338879e;
        sb7.append(jbVar4 != null ? jbVar4.f65880x11c19d58 : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotSessionVM", sb7.toString());
    }
}

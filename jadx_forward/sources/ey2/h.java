package ey2;

/* loaded from: classes2.dex */
public final class h extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public int f338915e;

    /* renamed from: f, reason: collision with root package name */
    public int f338916f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f338917g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f338918h;

    public h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186892d.mo7807xc74540ab(ey2.g.f338907d);
    }

    public final void N6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlternateRedDotVM", "[doSync] needScene=" + this.f338916f);
        try {
            ya2.t1 t1Var = new ya2.t1(null, null, null, null, null, 31, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = this.f338918h;
            if (jbVar != null) {
                ya2.w1.a(t1Var.f542075e, jbVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2 = this.f338917g;
            if (jbVar2 != null) {
                java.lang.String str = jbVar2.f65874xb5f7102a.f470023h;
                if (str == null) {
                    str = "";
                }
                t1Var.f542071a = str;
                ya2.w1.a(t1Var.f542072b, jbVar2);
                this.f338915e = this.f338916f;
            }
            ((c61.l7) i95.n0.c(c61.l7.class)).P.f(826259965, this.f338916f, null, t1Var);
        } finally {
            this.f338916f = 0;
            this.f338918h = null;
            this.f338917g = null;
        }
    }

    public final void O6() {
        if (this.f338915e > 0) {
            r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("FinderEntrance");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[exposeFindMoreUI] hasEntranceRedDot=");
            sb6.append(I0 != null);
            sb6.append(" scene=");
            sb6.append(this.f338915e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlternateRedDotVM", sb6.toString());
            if (I0 == null) {
                if (this.f338915e == 22) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(2017L, 0L, 1L);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(2017L, 1L, 1L);
                }
            }
            this.f338915e = 0;
        }
        if (this.f338916f != 0) {
            N6();
        }
    }

    public final void P6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        jz5.f0 f0Var;
        java.util.LinkedList linkedList;
        r45.vs2 vs2Var = jbVar != null ? jbVar.f65874xb5f7102a : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[markEntranceCtrlInfo] ctrlInfo=");
        sb6.append(vs2Var != null ? vs2Var.f470023h : null);
        sb6.append(" show_infos=");
        sb6.append((vs2Var == null || (linkedList = vs2Var.f470022g) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
        sb6.append(", localCtrlInfo=");
        sb6.append(jbVar != null ? jbVar.f65880x11c19d58 : null);
        sb6.append('_');
        sb6.append(jbVar != null ? jbVar.f65882x5364c75d : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlternateRedDotVM", sb6.toString());
        if (vs2Var != null) {
            this.f338917g = jbVar;
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f338917g = null;
        }
    }
}

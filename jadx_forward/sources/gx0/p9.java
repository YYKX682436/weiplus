package gx0;

/* loaded from: classes5.dex */
public final class p9 extends du0.p1 {

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f358366u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f358367v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f358368w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f358369x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f358370y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f358366u = kz5.c0.i(ug.m.MovieClip, ug.m.VideoClip, ug.m.ImageClip);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
        this.f358368w = InvalidTime;
        this.f358369x = jz5.h.b(new gx0.m9(this));
        this.f358370y = jz5.h.b(new gx0.o9(this));
        jz5.h.b(new gx0.n9(this));
    }

    @Override // du0.p1
    public void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        java.lang.String str;
        q7(c16997xb0aa383a);
        ex0.a0 a0Var = u7().f358175r;
        if (a0Var == null || c16997xb0aa383a == null || (str = c16997xb0aa383a.f237248i) == null) {
            return;
        }
        java.lang.String str2 = Q6().f324975f.f129757b;
        if (a0Var.L(c16997xb0aa383a, str, 1.0f, false)) {
            ex0.o o17 = a0Var.o();
            if (o17 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                o17.I(str2);
            }
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e m17 = a0Var.f338625b.f129947a.m();
            if (m17 != null) {
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = m17.f130065a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
                k7(c3971x241f78);
            }
        }
    }

    @Override // du0.p1
    public void W6(float f17) {
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.d9(this, f17, null), 3, null);
    }

    @Override // du0.p1
    public void X6(float f17) {
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.f9(this, f17, null), 3, null);
    }

    @Override // du0.p1
    public boolean Y6(boolean z17) {
        ex0.a0 a0Var = u7().f358175r;
        boolean z18 = false;
        if (a0Var != null && a0Var.F()) {
            z18 = true;
        }
        if (z18 && z17) {
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.g9(this, null), 3, null);
        }
        return z18;
    }

    @Override // du0.p1
    public float a7() {
        ex0.o o17;
        java.lang.Float f17;
        ev0.c cVar = this.f324947q;
        if (cVar != null && (f17 = cVar.f303886c.f338416f) != null) {
            return f17.floatValue();
        }
        ex0.a0 a0Var = u7().f358175r;
        if (a0Var == null || (o17 = a0Var.o()) == null) {
            return 0.5f;
        }
        return o17.C();
    }

    @Override // du0.p1
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a b7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o76 = u7().o7();
        if (o76 != null) {
            return o76.l();
        }
        return null;
    }

    @Override // du0.p1
    public ex0.o d7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        return u7().m7(segmentID);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    @Override // du0.p1
    public float e7() {
        ex0.c cVar;
        ex0.a0 a0Var = u7().f358175r;
        if (a0Var == null) {
            return 0.5f;
        }
        java.util.Iterator it = a0Var.f338630g.f338710e.iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = 0;
                break;
            }
            cVar = it.next();
            if (((ex0.r) cVar) instanceof ex0.c) {
                break;
            }
        }
        ex0.c cVar2 = cVar instanceof ex0.c ? cVar : null;
        if (cVar2 == null) {
            return 1.0f;
        }
        return cVar2.C();
    }

    @Override // du0.p1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f7() {
        ex0.a0 a0Var = u7().f358175r;
        if (a0Var != null) {
            return a0Var.E;
        }
        return null;
    }

    @Override // du0.p1
    public int g7() {
        ex0.a0 a0Var = u7().f358175r;
        if (a0Var != null) {
            return a0Var.F;
        }
        return 0;
    }

    @Override // du0.p1
    public boolean h7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4160xdd704649 c4160xdd704649;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e m17;
        ex0.a0 a0Var = u7().f358175r;
        if (a0Var == null || (c4167x88133861 = a0Var.f338625b) == null || (c4160xdd704649 = c4167x88133861.f129947a) == null || (m17 = c4160xdd704649.m()) == null) {
            return false;
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = m17.D();
        if (D != null) {
            bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e.E1(m17, D);
        }
        return bool.booleanValue();
    }

    @Override // du0.p1
    public boolean i7() {
        ex0.a0 a0Var = u7().f358175r;
        if (a0Var != null) {
            return a0Var.y();
        }
        return false;
    }

    @Override // du0.p1
    public rv0.n1 l7() {
        return (rv0.n1) T6(rv0.n1.class);
    }

    @Override // du0.p1
    public yt0.c m7() {
        return (yt0.c) T6(gx0.w8.class);
    }

    @Override // du0.p1, du0.g, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieMusicTipUIC", "onViewCreated: 开始监听Timeline变更");
        u7().f358176s.mo7806x9d92d11c(m158354x19263085(), new gx0.i9(this));
    }

    @Override // du0.p1
    public void p7(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, boolean z17, boolean z18) {
        boolean z19;
        rv0.j jVar;
        jz5.o oVar;
        ex0.a0 a0Var = u7().f358175r;
        if (a0Var == null) {
            return;
        }
        if (c16997xb0aa383a != null) {
            du0.v0 R6 = R6();
            java.lang.String musicID = c16997xb0aa383a.C;
            boolean z27 = a7() > 0.0f;
            boolean z28 = !i7();
            int h76 = u7().h7();
            int k76 = u7().k7();
            R6.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicID, "musicID");
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 timeline = a0Var.f338625b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeline, "timeline");
            yy0.m7 m7Var = (yy0.m7) R6.O6();
            m7Var.getClass();
            z19 = false;
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.h1(m7Var, musicID, z27, z17, z28, timeline, h76, k76, null), 3, null);
        } else {
            z19 = false;
        }
        java.lang.String i17 = c16997xb0aa383a != null ? com.p314xaae8f345.mm.vfs.w6.i(c16997xb0aa383a.f237248i, z19) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        if (i17 == null) {
            if (a0Var.E != null) {
                c0Var.f391645d = true;
            }
            a0Var.F();
        }
        boolean z29 = z17 != h7() ? true : z19;
        if ((!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a0Var.E != null ? java.lang.Integer.valueOf(r5.f237244e) : null, c16997xb0aa383a != null ? java.lang.Integer.valueOf(c16997xb0aa383a.f237244e) : null)) && i17 != null && c16997xb0aa383a != null) {
            boolean z37 = a0Var.E != null ? true : z19;
            ex0.o o17 = a0Var.o();
            if (o17 != null) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 c4183xefcb50b7 = o17.f338663f;
                android.graphics.PointF m07 = c4183xefcb50b7.m0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m07, "getLayerPosition(...)");
                java.lang.Float valueOf = java.lang.Float.valueOf(c4183xefcb50b7.n0());
                android.graphics.PointF o07 = c4183xefcb50b7.o0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o07, "getLayerScale(...)");
                oVar = new jz5.o(m07, valueOf, o07);
            } else {
                oVar = null;
            }
            if (a0Var.L(c16997xb0aa383a, i17, a7(), z17)) {
                c0Var.f391645d = true;
                java.lang.String str = Q6().f324975f.f129757b;
                ex0.o o18 = a0Var.o();
                if (o18 == null) {
                    return;
                }
                du0.t0 Q6 = Q6();
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e c4188xeef5596e = o18.f338687q;
                c4188xeef5596e.getClass();
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4188xeef5596e.D();
                if (!Q6.Q6(D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e.D1(c4188xeef5596e, D) : "")) {
                    p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.j9(this, o18, str, null), 3, null);
                }
                k7(o18.f338701b);
                ou0.e0.a(o18, t7(), u7(), c7().J1());
                if (z37) {
                    jz5.o oVar2 = new jz5.o(new android.graphics.PointF(0.0f, 0.0f), java.lang.Float.valueOf(0.0f), new android.graphics.PointF(1.0f, 1.0f));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieMusicTipUIC", "onMusicSelected: isChangeMusic == true");
                    if (oVar != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oVar, oVar2)) {
                        java.lang.Object obj = oVar.f384374d;
                        java.util.Objects.toString(obj);
                        java.lang.Number number = (java.lang.Number) oVar.f384375e;
                        number.floatValue();
                        java.lang.Object obj2 = oVar.f384376f;
                        java.util.Objects.toString(obj2);
                        o18.r((android.graphics.PointF) obj);
                        o18.s(number.floatValue());
                        o18.t((android.graphics.PointF) obj2);
                    }
                    gx0.kh u76 = u7();
                    java.lang.String string = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lme);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    u76.r7(string, null);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieMusicTipUIC", "onMusicSelected: isChangeMusic == false");
                    gx0.kh u77 = u7();
                    java.lang.String string2 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.llw);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                    u77.r7(string2, null);
                }
            }
        } else if (c16997xb0aa383a == null || i17 == null || !c16997xb0aa383a.g()) {
            if (z29) {
                p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.e9(this, z17, true, null), 3, null);
                c0Var.f391645d = true;
            }
        } else if (a0Var.L(c16997xb0aa383a, i17, a7(), z17)) {
            c0Var.f391645d = true;
        }
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.k9(c0Var, this, null), 3, null);
        ex0.a0 a0Var2 = u7().f358175r;
        if (a0Var2 == null) {
            return;
        }
        a0Var2.f(z18);
        t7().c7();
        rv0.n1 n1Var = (rv0.n1) ((jz5.n) this.f324949s).mo141623x754a37bb();
        if (n1Var == null || (jVar = (rv0.j) n1Var.f150773i) == null) {
            return;
        }
        jVar.J(z18);
    }

    @Override // du0.p1
    public void q7(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        super.q7(c16997xb0aa383a);
        ex0.a0 a0Var = u7().f358175r;
        ev0.c cVar = this.f324947q;
        int f17 = cVar != null ? cVar.f() : 0;
        if (a0Var == null) {
            return;
        }
        a0Var.F = f17;
    }

    @Override // du0.p1
    public void r7(zw0.b entrance) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entrance, "entrance");
        if (u7().f358175r == null) {
            return;
        }
        du0.v0 R6 = R6();
        R6.getClass();
        java.lang.String entryType = entrance.f558092d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entryType, "entryType");
        yy0.m7 m7Var = (yy0.m7) R6.O6();
        m7Var.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.p1(m7Var, entryType, null), 3, null);
        this.f358367v = t7().m132411xc00617a4();
        this.f358368w = t7().h7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieMusicTipUIC", "openMusicPanel: wasPlaying=" + this.f358367v + ", time=" + this.f358368w.m33987xd22e7c2d() + "ms");
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.l9(this, null), 3, null);
        super.r7(entrance);
    }

    public final gx0.bf t7() {
        return (gx0.bf) ((jz5.n) this.f358369x).mo141623x754a37bb();
    }

    public final gx0.kh u7() {
        return (gx0.kh) ((jz5.n) this.f358370y).mo141623x754a37bb();
    }
}

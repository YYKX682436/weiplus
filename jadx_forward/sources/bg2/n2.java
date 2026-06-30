package bg2;

/* loaded from: classes3.dex */
public final class n2 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f101855e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f101856f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f101857g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f101858h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f101859i;

    /* renamed from: m, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f101860m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f101855e = "Finder.LiveConvertPromoteDataController";
    }

    @Override // tc2.h
    public void H0(r45.r71 resp) {
        java.util.ArrayList arrayList;
        bg2.g2 g2Var;
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        cm2.t tVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(14);
        boolean z17 = false;
        if (m75941xfb821914 != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : m75941xfb821914) {
                if (((r45.ch1) obj).m75939xb282bd08(1) == 20051) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        r45.ch1 ch1Var = arrayList != null ? (r45.ch1) kz5.n0.k0(arrayList) : null;
        r45.f52 f52Var = new r45.f52();
        if (ch1Var != null) {
            if (!(ch1Var.m75934xbce7f2f(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
                f52Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
            }
        }
        if ((f52Var.m75939xb282bd08(3) == 1 || ((f52Var.m75934xbce7f2f(2) != null || f52Var.m75933x41a8a7f2(12)) && f52Var.m75939xb282bd08(3) == 0) ? f52Var : null) != null) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            byte[] mo14344x5f01b1f6 = f52Var.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            cm2.t I2 = r4Var.I2(mo14344x5f01b1f6);
            if (f52Var.m75939xb282bd08(3) == 1) {
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = this.f101856f;
                if ((j2Var != null ? (cm2.t) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb() : null) != null && I2 != null) {
                    p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var2 = this.f101856f;
                    if (j2Var2 != null && (tVar = (cm2.t) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var2).mo144003x754a37bb()) != null && tVar.f124918d == I2.f124918d) {
                        z17 = true;
                    }
                    if (!z17) {
                        return;
                    }
                }
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var3 = this.f101856f;
                if (j2Var3 != null) {
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var3).k(null);
                }
            } else if (f52Var.m75933x41a8a7f2(12)) {
                long j17 = f52Var.m75933x41a8a7f2(11) ? e06.p.j(new e06.k(1, f52Var.m75939xb282bd08(9)), c06.e.f119249d) : 0L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101855e, "[notifyBubble] delay = " + j17);
                in5.s0 s0Var = this.f498674d.f498682i;
                if (s0Var != null && (y0Var = s0Var.f374653d) != null) {
                    p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new bg2.j2(j17, this, f52Var, null), 2, null);
                }
            } else {
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var4 = this.f101856f;
                if (j2Var4 != null) {
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var4).k(I2);
                }
            }
        }
        if (f52Var.m75939xb282bd08(8) <= 0 || (g2Var = (bg2.g2) N6(bg2.g2.class)) == null) {
            return;
        }
        int m75939xb282bd08 = f52Var.m75939xb282bd08(8);
        int m75939xb282bd082 = f52Var.m75939xb282bd08(9);
        bg2.j7 j7Var = g2Var.f101637f;
        if (j7Var != null) {
            j7Var.d().mo50293x3498a0(new bg2.i7(m75939xb282bd08, j7Var, m75939xb282bd082));
        }
    }

    @Override // tc2.c
    public void Q6() {
        this.f101856f = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
    }

    @Override // tc2.c
    public void U6() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f101859i;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        a7();
        this.f101856f = null;
        this.f101857g = null;
        this.f101858h = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f101860m;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        this.f101860m = null;
    }

    public final r45.qc2 Y6(r45.f52 f52Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        java.lang.String str;
        r45.qc2 qc2Var = new r45.qc2();
        qc2Var.set(0, java.lang.Long.valueOf(f52Var != null ? f52Var.m75942xfb822ef2(4) : 0L));
        if (f52Var == null || (gVar = f52Var.m75934xbce7f2f(6)) == null) {
            gVar = this.f101858h;
        }
        qc2Var.set(1, gVar);
        qc2Var.set(2, f52Var != null ? f52Var.m75934xbce7f2f(2) : null);
        qc2Var.set(3, java.lang.Boolean.FALSE);
        if (f52Var == null || (str = f52Var.m75945x2fec8307(13)) == null) {
            str = "";
        }
        qc2Var.set(4, str);
        qc2Var.set(5, this.f101857g);
        return qc2Var;
    }

    public final void Z6(r45.f52 f52Var) {
        cm2.t tVar;
        if (f52Var == null) {
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = this.f101856f;
            f52Var = (j2Var == null || (tVar = (cm2.t) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()) == null) ? null : zl2.r4.f555483a.J2(tVar);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f101859i;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        a7();
        r45.qc2 Y6 = Y6(f52Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101855e, "[startPollingPromoteInfo] req:" + pm0.b0.g(Y6));
        bg2.g2 g2Var = (bg2.g2) N6(bg2.g2.class);
        if (g2Var != null) {
            g2Var.Y6(10, Y6, false, new bg2.k2(this, r45.rc2.class));
        }
        in5.s0 s0Var = this.f498674d.f498682i;
        android.content.Context context = s0Var != null ? s0Var.f374654e : null;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        this.f101859i = abstractActivityC21394xb3d2c0cf != null ? p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(abstractActivityC21394xb3d2c0cf), null, null, new bg2.m2(this, null), 3, null) : null;
    }

    public final void a7() {
        bg2.g2 g2Var = (bg2.g2) N6(bg2.g2.class);
        if (g2Var != null) {
            g2Var.Z6(10);
        }
    }

    @Override // tc2.h
    public void d4(r45.hc1 resp) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        byte[] mo14344x5f01b1f6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        boolean z17 = false;
        if (d2Var != null && (d2Var.f101544g || d2Var.f101545h || d2Var.f101547m || d2Var.f101551q)) {
            z17 = true;
        }
        if (z17) {
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = this.f101856f;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = null;
            if (j2Var != null) {
                r45.f52 f52Var = (r45.f52) resp.m75936x14adae67(40);
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k((f52Var == null || (mo14344x5f01b1f6 = f52Var.mo14344x5f01b1f6()) == null) ? null : zl2.r4.f555483a.I2(mo14344x5f01b1f6));
            }
            Z6(null);
            in5.s0 s0Var = this.f498674d.f498682i;
            if (s0Var != null && (y0Var = s0Var.f374653d) != null) {
                r2Var = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.i2(this, null), 3, null);
            }
            this.f101860m = r2Var;
        }
    }

    @Override // tc2.h
    /* renamed from: onLiveEnd */
    public void mo10394x5aa1a970() {
        a7();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f101860m;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f101860m = null;
    }
}

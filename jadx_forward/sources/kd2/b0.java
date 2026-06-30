package kd2;

/* loaded from: classes10.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final kd2.p1 f388242a;

    public b0(kd2.p1 instance) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instance, "instance");
        this.f388242a = instance;
    }

    public final void a(cl0.g gVar, java.lang.String str, int i17) {
        java.lang.String str2;
        java.lang.String str3;
        kd2.p0 p0Var;
        kd2.p0 p0Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        r45.qt2 qt2Var;
        r45.qt2 qt2Var2;
        r45.qt2 qt2Var3;
        gVar.h("float_frame_id", str);
        gVar.o("float_frame_create_type", i17);
        kd2.p1 p1Var = this.f388242a;
        kd2.q0 q0Var = p1Var.f388320x;
        java.lang.Object obj = "";
        if (q0Var == null || (qt2Var3 = q0Var.f388336d) == null || (str2 = qt2Var3.m75945x2fec8307(2)) == null) {
            str2 = "";
        }
        gVar.h("source_tabcontextid", str2);
        kd2.q0 q0Var2 = p1Var.f388320x;
        if (q0Var2 == null || (qt2Var2 = q0Var2.f388336d) == null || (str3 = qt2Var2.m75945x2fec8307(1)) == null) {
            str3 = "";
        }
        gVar.h("source_contextid", str3);
        kd2.q0 q0Var3 = p1Var.f388320x;
        if (q0Var3 != null && (qt2Var = q0Var3.f388336d) != null) {
            obj = java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5));
        }
        gVar.h("source_commentscene", obj);
        kd2.q0 q0Var4 = p1Var.f388320x;
        long j17 = 0;
        gVar.h("feed_id", pm0.v.u((q0Var4 == null || (c14989xf862ae88 = q0Var4.f388339g) == null) ? 0L : c14989xf862ae88.getFeedId()));
        kd2.q0 q0Var5 = p1Var.f388320x;
        gVar.p("real_play_time", (q0Var5 == null || (p0Var2 = q0Var5.f388342j) == null) ? 0L : p0Var2.a());
        kd2.q0 q0Var6 = p1Var.f388320x;
        if (q0Var6 != null && (p0Var = q0Var6.f388342j) != null) {
            j17 = p0Var.b();
        }
        gVar.p("stay_time_ms", j17);
    }

    public final void b() {
        r45.qt2 qt2Var;
        r45.qt2 qt2Var2;
        r45.qt2 qt2Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
        r45.qt2 qt2Var4 = new r45.qt2();
        kd2.p1 p1Var = this.f388242a;
        kd2.q0 q0Var = p1Var.f388320x;
        java.lang.String str = null;
        qt2Var4.set(1, (q0Var == null || (qt2Var3 = q0Var.f388336d) == null) ? null : qt2Var3.m75945x2fec8307(1));
        kd2.q0 q0Var2 = p1Var.f388320x;
        if (q0Var2 != null && (qt2Var2 = q0Var2.f388336d) != null) {
            str = qt2Var2.m75945x2fec8307(2);
        }
        qt2Var4.set(2, str);
        kd2.q0 q0Var3 = p1Var.f388320x;
        qt2Var4.set(5, java.lang.Integer.valueOf((q0Var3 == null || (qt2Var = q0Var3.f388336d) == null) ? 0 : qt2Var.m75939xb282bd08(5)));
        cl0.g gVar = new cl0.g();
        java.lang.String str2 = p1Var.D;
        if (str2 == null) {
            str2 = "";
        }
        a(gVar, str2, p1Var.E);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, qt2Var4, "button_close_float_frame", 1, gVar, false, null, 48, null);
    }

    public final void c() {
        java.lang.String str;
        kd2.p0 p0Var;
        kd2.p0 p0Var2;
        r45.qt2 qt2Var;
        java.lang.String m75945x2fec8307;
        r45.qt2 qt2Var2;
        r45.qt2 qt2Var3;
        kd2.p0 p0Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        kd2.p1 p1Var = this.f388242a;
        kd2.q0 q0Var = p1Var.I;
        long j17 = 0;
        long feedId = (q0Var == null || (c14989xf862ae88 = q0Var.f388339g) == null) ? 0L : c14989xf862ae88.getFeedId();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[9];
        java.lang.String str2 = p1Var.D;
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("float_frame_id", str2);
        lVarArr[1] = new jz5.l("float_frame_create_type", java.lang.String.valueOf(p1Var.E));
        kd2.q0 q0Var2 = p1Var.I;
        lVarArr[2] = new jz5.l("finder_float_frame_stay_time", java.lang.Long.valueOf((q0Var2 == null || (p0Var3 = q0Var2.f388342j) == null) ? 0L : p0Var3.b()));
        kd2.q0 q0Var3 = p1Var.I;
        if (q0Var3 == null || (qt2Var3 = q0Var3.f388336d) == null || (str = qt2Var3.m75945x2fec8307(1)) == null) {
            str = "";
        }
        lVarArr[3] = new jz5.l("source_contextid", str);
        kd2.q0 q0Var4 = p1Var.I;
        lVarArr[4] = new jz5.l("source_commentscene", (q0Var4 == null || (qt2Var2 = q0Var4.f388336d) == null) ? "" : java.lang.Integer.valueOf(qt2Var2.m75939xb282bd08(5)));
        kd2.q0 q0Var5 = p1Var.I;
        if (q0Var5 != null && (qt2Var = q0Var5.f388336d) != null && (m75945x2fec8307 = qt2Var.m75945x2fec8307(2)) != null) {
            str3 = m75945x2fec8307;
        }
        lVarArr[5] = new jz5.l("source_tabcontextid", str3);
        lVarArr[6] = new jz5.l("feedid", pm0.v.u(feedId));
        kd2.q0 q0Var6 = p1Var.I;
        lVarArr[7] = new jz5.l("real_play_time", java.lang.Long.valueOf((q0Var6 == null || (p0Var2 = q0Var6.f388342j) == null) ? 0L : p0Var2.a()));
        kd2.q0 q0Var7 = p1Var.I;
        if (q0Var7 != null && (p0Var = q0Var7.f388342j) != null) {
            j17 = p0Var.b();
        }
        lVarArr[8] = new jz5.l("stay_time_ms", java.lang.Long.valueOf(j17));
        ((cy1.a) rVar).Cj("finder_float_frame_disappear", null, kz5.c1.k(lVarArr), 25496);
    }

    public final void d() {
        java.lang.String str;
        r45.qt2 qt2Var;
        java.lang.String m75945x2fec8307;
        r45.qt2 qt2Var2;
        r45.qt2 qt2Var3;
        kd2.p0 p0Var;
        kd2.p0 p0Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        kd2.p1 p1Var = this.f388242a;
        kd2.q0 q0Var = p1Var.f388320x;
        if (q0Var == null || q0Var.f388344l || p1Var.f388321y == null) {
            return;
        }
        long j17 = 0;
        long feedId = (q0Var == null || (c14989xf862ae88 = q0Var.f388339g) == null) ? 0L : c14989xf862ae88.getFeedId();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[8];
        java.lang.String str2 = p1Var.D;
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("float_frame_id", str2);
        lVarArr[1] = new jz5.l("float_frame_create_type", java.lang.String.valueOf(p1Var.E));
        kd2.q0 q0Var2 = p1Var.f388320x;
        lVarArr[2] = new jz5.l("real_play_time", java.lang.Long.valueOf((q0Var2 == null || (p0Var2 = q0Var2.f388342j) == null) ? 0L : p0Var2.a()));
        kd2.q0 q0Var3 = p1Var.f388320x;
        if (q0Var3 != null && (p0Var = q0Var3.f388342j) != null) {
            j17 = p0Var.b();
        }
        lVarArr[3] = new jz5.l("stay_time_ms", java.lang.Long.valueOf(j17));
        kd2.q0 q0Var4 = p1Var.f388320x;
        if (q0Var4 == null || (qt2Var3 = q0Var4.f388336d) == null || (str = qt2Var3.m75945x2fec8307(1)) == null) {
            str = "";
        }
        lVarArr[4] = new jz5.l("source_contextid", str);
        kd2.q0 q0Var5 = p1Var.f388320x;
        lVarArr[5] = new jz5.l("source_commentscene", (q0Var5 == null || (qt2Var2 = q0Var5.f388336d) == null) ? "" : java.lang.Integer.valueOf(qt2Var2.m75939xb282bd08(5)));
        kd2.q0 q0Var6 = p1Var.f388320x;
        if (q0Var6 != null && (qt2Var = q0Var6.f388336d) != null && (m75945x2fec8307 = qt2Var.m75945x2fec8307(2)) != null) {
            str3 = m75945x2fec8307;
        }
        lVarArr[6] = new jz5.l("source_tabcontextid", str3);
        lVarArr[7] = new jz5.l("feedid", pm0.v.u(feedId));
        ((cy1.a) rVar).Cj("finder_float_frame_end_play", null, kz5.c1.k(lVarArr), 25496);
        q0Var.f388344l = true;
    }
}

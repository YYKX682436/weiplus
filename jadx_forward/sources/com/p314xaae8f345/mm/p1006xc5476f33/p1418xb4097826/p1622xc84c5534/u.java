package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes10.dex */
public final class u extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f206905d;

    /* renamed from: e, reason: collision with root package name */
    public int f206906e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f206907f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f206908g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f206905d = new java.util.HashMap();
        this.f206907f = true;
        kz5.c0.i(".ui.AppBrandPluginUI", ".launching.AppBrandLaunchProxyUI", ".ui.SnsAdNativeLandingPagesPreviewUI");
    }

    public final void O6(in5.s0 holder, r45.qt2 qt2Var, so2.y0 comment, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        r45.ky0 m76052x34c6289e = comment.f492236d.u0().m76052x34c6289e();
        if (m76052x34c6289e == null || (str = m76052x34c6289e.m75945x2fec8307(3)) == null) {
            str = "";
        }
        zy2.qa qaVar = (zy2.qa) i95.n0.c(zy2.qa.class);
        java.lang.String m75945x2fec8307 = qt2Var != null ? qt2Var.m75945x2fec8307(0) : null;
        java.lang.String m75945x2fec83072 = qt2Var != null ? qt2Var.m75945x2fec8307(1) : null;
        java.lang.String m75945x2fec83073 = qt2Var != null ? qt2Var.m75945x2fec8307(2) : null;
        int m75939xb282bd08 = qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0;
        long j17 = comment.f492236d.f68959xf9a02e3e;
        int i18 = this.f206906e;
        int m8183xf806b362 = holder.m8183xf806b362();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) qaVar;
        o3Var.getClass();
        java.lang.String m76097xcb1fb7dd = comment.f492236d.u0().m76097xcb1fb7dd();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6379x5541962b c6379x5541962b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6379x5541962b();
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        c6379x5541962b.f137257d = c6379x5541962b.b("SessionId", m75945x2fec8307, true);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        c6379x5541962b.f137258e = c6379x5541962b.b("ContextId", m75945x2fec83072, true);
        if (m75945x2fec83073 == null) {
            m75945x2fec83073 = "";
        }
        c6379x5541962b.f137259f = c6379x5541962b.b("ClickTabContextId", m75945x2fec83073, true);
        c6379x5541962b.f137260g = m75939xb282bd08;
        c6379x5541962b.f137261h = c6379x5541962b.b("feedid", pm0.v.u(j17), true);
        c6379x5541962b.f137264k = o3Var.tk(i18);
        c6379x5541962b.f137265l = c6379x5541962b.b("reportJson", m76097xcb1fb7dd != null ? r26.i0.t(m76097xcb1fb7dd, ",", ";", false) : null, true);
        long j18 = m8183xf806b362 - 1;
        if (j18 < 0) {
            j18 = 0;
        }
        c6379x5541962b.f137266m = j18;
        c6379x5541962b.f137267n = i17;
        c6379x5541962b.f137268o = c6379x5541962b.b("ad_report_data", r26.i0.t(str, ",", ";", false), true);
        int h17 = comment.h();
        if (h17 == 1 || h17 == 5) {
            c6379x5541962b.f137262i = c6379x5541962b.b("rootCommentid", pm0.v.u(comment.f492236d.t0()), true);
            c6379x5541962b.f137263j = c6379x5541962b.b("subCommentid", "", true);
        } else {
            if (h17 != 2) {
                return;
            }
            c6379x5541962b.f137262i = c6379x5541962b.b("rootCommentid", pm0.v.u(comment.f492236d.Y0()), true);
            c6379x5541962b.f137263j = c6379x5541962b.b("subCommentid", pm0.v.u(comment.f492236d.t0()), true);
        }
        c6379x5541962b.k();
        o3Var.Zk(c6379x5541962b);
    }

    public final cl0.g P6(so2.y0 y0Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        r45.ky0 m76052x34c6289e = y0Var.f492236d.u0().m76052x34c6289e();
        java.lang.String m76489xefafd82 = (m76052x34c6289e == null || (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) m76052x34c6289e.m75936x14adae67(0)) == null) ? null : c19786x6a1e2862.m76489xefafd82();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m76489xefafd82) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("{}", m76489xefafd82)) {
            return new cl0.g();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m76489xefafd82);
        return new cl0.g(m76489xefafd82);
    }

    public final void Q6(in5.s0 holder, so2.y0 comment, boolean z17, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        if (comment.f492236d.a1()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = comment.f492236d;
            long j17 = yj0Var.f68959xf9a02e3e;
            java.lang.String str2 = yj0Var.f68957xec748fc6;
            long t07 = yj0Var.t0();
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6();
            int m75939xb282bd08 = V6.m75939xb282bd08(5);
            r45.ky0 m76052x34c6289e = comment.f492236d.u0().m76052x34c6289e();
            if (m76052x34c6289e == null || (str = m76052x34c6289e.m75945x2fec8307(4)) == null) {
                str = "";
            }
            java.lang.String str3 = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CommentAdReportMgr", "onClick commentId=" + t07);
            i95.m c17 = i95.n0.c(zy2.qa.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.qa.r3((zy2.qa) c17, j17, str2, m75939xb282bd08, t07, false, true, i17, P6(comment), str3, 0, 0, 0, 0, z17, 7680, null);
            O6(holder, V6, comment, 3);
        }
    }

    public final void R6(long j17, so2.y0 comment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        if (comment.f492236d.a1()) {
            long t07 = comment.f492236d.t0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t W6 = W6(j17, t07);
            W6.f206886c++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CommentAdReportMgr", "onReplay commentId=" + t07 + " playCount=" + W6.f206886c);
        }
    }

    public final void S6(android.content.Context context, so2.y0 comment, boolean z17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        if (comment.f492236d.a1()) {
            if (this.f206908g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CommentAdReportMgr", "onStartExpose return because starting half screen activity");
                this.f206908g = false;
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = comment.f492236d;
            long j17 = yj0Var.f68959xf9a02e3e;
            java.lang.String str2 = yj0Var.f68957xec748fc6;
            long t07 = yj0Var.t0();
            r45.ky0 m76052x34c6289e = comment.f492236d.u0().m76052x34c6289e();
            if (m76052x34c6289e == null || (str = m76052x34c6289e.m75945x2fec8307(4)) == null) {
                str = "";
            }
            java.lang.String str3 = str;
            W6(j17, t07).f206884a = java.lang.System.currentTimeMillis();
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            int m75939xb282bd08 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6().m75939xb282bd08(5);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStartExpose commentId=");
            sb6.append(t07);
            sb6.append(", aid=");
            r45.ky0 m76052x34c6289e2 = comment.f492236d.u0().m76052x34c6289e();
            sb6.append(m76052x34c6289e2 != null ? java.lang.Long.valueOf(m76052x34c6289e2.m75942xfb822ef2(1)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CommentAdReportMgr", sb6.toString());
            i95.m c17 = i95.n0.c(zy2.qa.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.qa.r3((zy2.qa) c17, j17, str2, m75939xb282bd08, t07, false, false, 0, P6(comment), str3, 0, 0, 0, 0, z17, 7680, null);
        }
    }

    public final void T6(long j17, so2.y0 comment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        if (comment.f492236d.a1()) {
            long t07 = comment.f492236d.t0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t W6 = W6(j17, t07);
            W6.f206885b = java.lang.System.currentTimeMillis();
            W6.f206886c++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CommentAdReportMgr", "onStartPlay commentId=" + t07 + " startPlayTimeMs=" + W6.f206885b + " playCount=" + W6.f206886c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d8, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((r4 == null || (r4 = r4.m75941xfb821914(5)) == null || (r4 = (r45.c60) kz5.n0.Z(r4)) == null || (r4 = r4.m75941xfb821914(2)) == null || (r4 = (r45.s60) kz5.n0.Z(r4)) == null) ? null : r4.m75945x2fec8307(0)) == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(android.content.Context r22, so2.y0 r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u.U6(android.content.Context, so2.y0, boolean):void");
    }

    public final void V6(long j17, so2.y0 comment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        if (comment.f492236d.a1()) {
            long t07 = comment.f492236d.t0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t W6 = W6(j17, t07);
            if (W6.f206885b > 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - W6.f206885b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CommentAdReportMgr", "onStopPlay stats.historyPlayTimeMs=" + W6.f206888e + " timeDiff=" + currentTimeMillis);
                W6.f206888e = W6.f206888e + currentTimeMillis;
                W6.f206885b = 0L;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CommentAdReportMgr", "onStopPlay commentId=" + t07);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t W6(long j17, long j18) {
        java.util.HashMap hashMap = this.f206905d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('#');
        sb6.append(j18);
        java.lang.String sb7 = sb6.toString();
        java.lang.Object obj = hashMap.get(sb7);
        if (obj == null) {
            obj = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t(0L, 0L, 0, 0L, 0L, 31, null);
            hashMap.put(sb7, obj);
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t) obj;
    }

    public final void X6(long j17, so2.y0 comment, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        if (comment.f492236d.a1()) {
            long t07 = comment.f492236d.t0();
            W6(j17, t07).f206887d = j18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CommentAdReportMgr", "updateVideoDuration commentId=" + t07 + " duration=" + j18);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        this.f206907f = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        this.f206907f = true;
    }
}

package gd4;

/* loaded from: classes4.dex */
public final class c2 extends gd4.b {

    /* renamed from: w, reason: collision with root package name */
    public static final gd4.y0 f352183w = new gd4.y0(null);

    /* renamed from: m, reason: collision with root package name */
    public final u74.d f352184m;

    /* renamed from: n, reason: collision with root package name */
    public long f352185n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f352186o;

    /* renamed from: p, reason: collision with root package name */
    public int f352187p;

    /* renamed from: q, reason: collision with root package name */
    public int f352188q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f352189r;

    /* renamed from: s, reason: collision with root package name */
    public long f352190s;

    /* renamed from: t, reason: collision with root package name */
    public int f352191t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f352192u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 f352193v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(gd4.x0 x0Var, gd4.w0 w0Var, gd4.x0 x0Var2, p3325xe03a0797.p3326xc267989b.y0 y0Var, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 restartPlayFlow, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 playCommandFlow, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, yz5.p setClickArea, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a1 a1Var, r45.jj4 jj4Var, i64.b1 b1Var, u74.d dVar, java.lang.Object obj) {
        super(x0Var, w0Var, x0Var2, y0Var, restartPlayFlow, playCommandFlow, c17933xe8d1b226, setClickArea, a1Var, jj4Var, b1Var, obj);
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(restartPlayFlow, "restartPlayFlow");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playCommandFlow, "playCommandFlow");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setClickArea, "setClickArea");
        this.f352184m = dVar;
        int i17 = 0;
        this.f352187p = 0;
        this.f352188q = 0;
        boolean z17 = obj instanceof gd4.z0;
        gd4.z0 z0Var = z17 ? (gd4.z0) obj : null;
        if (z0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$IpInteractPlayReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$IpInteractPlayReportInfo");
            j17 = z0Var.f352411a;
        } else {
            j17 = 0;
        }
        this.f352190s = j17;
        gd4.z0 z0Var2 = z17 ? (gd4.z0) obj : null;
        if (z0Var2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoPlayCount", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$IpInteractPlayReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoPlayCount", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$IpInteractPlayReportInfo");
            i17 = z0Var2.f352412b;
        }
        this.f352191t = i17;
    }

    public static final /* synthetic */ int m(gd4.c2 c2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getCurrentState$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        int i17 = c2Var.f352187p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getCurrentState$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        return i17;
    }

    public static final /* synthetic */ android.widget.ImageView n(gd4.c2 c2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTagIconView$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        android.widget.ImageView imageView = c2Var.f352192u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTagIconView$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        return imageView;
    }

    public static final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 o(gd4.c2 c2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTagTextView$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 c17790xf59c6992 = c2Var.f352193v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTagTextView$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        return c17790xf59c6992;
    }

    public static final /* synthetic */ void p(gd4.c2 c2Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setCurrentState$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        c2Var.f352187p = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setCurrentState$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
    }

    public static final p3325xe03a0797.p3326xc267989b.r2 q(p3325xe03a0797.p3326xc267989b.y0 y0Var, gd4.c2 c2Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s1 s1Var, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        p3325xe03a0797.p3326xc267989b.r2 d17 = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new gd4.f1(r(c2Var, s1Var), c2Var, c2Var.f352187p, i2Var, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        return d17;
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r1 r(gd4.c2 c2Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s1 s1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startProcessCommandFlow$getPlayState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        int i17 = c2Var.f352187p;
        if (i17 == 4) {
            a17 = s1Var.b();
        } else if (i17 == 3) {
            s1Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
            a17 = s1Var.f247664e;
        } else if (i17 == 2) {
            s1Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLikeState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikeState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
            a17 = s1Var.f247663d;
        } else {
            a17 = i17 == 0 ? s1Var.a() : s1Var.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startProcessCommandFlow$getPlayState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        return a17;
    }

    @Override // gd4.b
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a1 a1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addCurrentVideoTotalTimes", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        android.os.SystemClock.elapsedRealtime();
        if (this.f352185n > 0) {
            this.f352190s += android.os.SystemClock.elapsedRealtime() - this.f352185n;
        }
        if (this.f352186o) {
            this.f352185n = android.os.SystemClock.elapsedRealtime();
        } else {
            this.f352185n = 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addCurrentVideoTotalTimes", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
    }

    @Override // gd4.b
    public void j() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        android.widget.ImageView imageView = this.f352192u;
        if (imageView != null) {
            imageView.setImageDrawable(null);
            kk.j jVar = a84.m.f83862a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            imageView.setTag(com.p314xaae8f345.mm.R.id.n1z, "");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 c17790xf59c6992 = this.f352193v;
        if (c17790xf59c6992 != null) {
            c17790xf59c6992.setText("");
        }
        u74.d dVar = this.f352184m;
        if (dVar != null && (view = dVar.P) != null) {
            view.setOnClickListener(null);
        }
        gd4.z0 z0Var = new gd4.z0(this.f352190s, this.f352191t);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStoredData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        this.f352150l = z0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStoredData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
    }

    @Override // gd4.b
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b0 b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d0 d0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a1 a17;
        float mo71216x37a7fa50;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d0 d0Var2 = c17933xe8d1b226.m70354x74235b3e().f38152x29dcd87f;
            b17 = d0Var2 != null ? d0Var2.b() : null;
            d0Var = c17933xe8d1b226.m70354x74235b3e().f38152x29dcd87f;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("IpInteractScheduleVideoController", "sns_ad_ip_interact_report, exp=" + e17);
        }
        if (d0Var != null && (a17 = d0Var.a()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentBreakVideoMedia", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentBreakVideoMedia", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
            r45.jj4 jj4Var = this.f352148j;
            if (jj4Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                return;
            }
            a(a17);
            a17.b().a();
            float f17 = jj4Var.R;
            long j17 = 0;
            if (f17 > 0.0f) {
                mo71216x37a7fa50 = f17 * 1000.0f;
            } else {
                gd4.x0 f18 = f();
                mo71216x37a7fa50 = (float) (f18 != null ? f18.mo71216x37a7fa50() : 0L);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o1 b18 = a17.b();
            b18.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLoopEndTime", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLoopEndTime", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            float f19 = b18.f247618d;
            if (f19 > 0.0f) {
                java.lang.Math.min(f19, mo71216x37a7fa50);
            }
            i64.b1 h17 = h();
            int i17 = (h17 != null ? h17.f370628j : 0) == 0 ? 1 : 2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
            jSONObject.put("uxinfo", c17933xe8d1b226.m70375x338a8cc7());
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
            java.lang.String str = c17933xe8d1b226.m70354x74235b3e().f38172xd73c98cc;
            if (str == null) {
                str = "";
            }
            jSONObject.put("adExtInfo", str);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject.put("extInfo", jSONObject2);
            jSONObject2.put("videoDuration", java.lang.Float.valueOf(mo71216x37a7fa50));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a1 d17 = d();
            jSONObject2.put("videoCompositeType", d17 != null ? d17.c() : 0);
            if (b17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickStartTime", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickStartTime", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
                obj = java.lang.Float.valueOf(b17.f247468e);
            } else {
                obj = 0;
            }
            jSONObject2.put("clickAreaStartTime", obj);
            long j18 = this.f352190s;
            if (j18 >= 0) {
                j17 = j18;
            }
            jSONObject2.put("videoPlayTotalTime", j17);
            jSONObject2.put("videoSeekCount", this.f352191t + 1);
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            ca4.m0.a("sns_ad_ip_interact_report", jSONObject3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
    }

    @Override // gd4.b
    public void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s1 b17;
        java.lang.String str;
        java.lang.String b18;
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startProcessCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i17 = i();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d0 d0Var = (i17 == null || (m70354x74235b3e = i17.m70354x74235b3e()) == null) ? null : m70354x74235b3e.f38152x29dcd87f;
        if (d0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("IpInteractScheduleVideoController", "adBreakFrameInfo is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startProcessCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a1 a17 = d0Var.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o1 b19 = a17 != null ? a17.b() : null;
        if (b19 == null || (b17 = b19.b()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("IpInteractScheduleVideoController", "playStateInfo is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startProcessCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            return;
        }
        u74.d dVar = this.f352184m;
        this.f352192u = (dVar == null || (view3 = dVar.P) == null) ? null : (android.widget.ImageView) view3.findViewById(com.p314xaae8f345.mm.R.id.n48);
        this.f352193v = (dVar == null || (view2 = dVar.P) == null) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992) view2.findViewById(com.p314xaae8f345.mm.R.id.n4_);
        if (dVar != null && (view = dVar.P) != null) {
            view.setOnClickListener(new gd4.a1(this));
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b27 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.y2 y2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.y2) kz5.n0.w0(b17.a().a(), c06.e.f119249d);
        java.lang.String str2 = "";
        if (y2Var == null || (str = y2Var.a()) == null) {
            str = "";
        }
        a84.m.a(str, this.f352192u);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 c17790xf59c6992 = this.f352193v;
        if (c17790xf59c6992 != null) {
            if (y2Var != null && (b18 = y2Var.b()) != null) {
                str2 = b18;
            }
            c17790xf59c6992.setText(str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 c17790xf59c69922 = this.f352193v;
        if (c17790xf59c69922 != null) {
            android.content.Context context = c17790xf59c69922.getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dp2Pix", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
            int round = java.lang.Math.round(i65.a.g(context) * 14);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dp2Pix", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion");
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.b(c17790xf59c69922, 1, round, 1, 0);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3325xe03a0797.p3326xc267989b.y0 e17 = e();
        if (e17 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(e17, null, null, new gd4.h1(this, b17, null), 3, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 e18 = e();
        if (e18 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(e18, null, null, new gd4.a2(b27, this, b17, h0Var, b19, h0Var2, y2Var, null), 3, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 e19 = e();
        if (e19 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(e19, null, null, new gd4.d1(this, d0Var, h0Var, b17, b27, null), 3, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startProcessCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
    }
}

package gd4;

/* loaded from: classes4.dex */
public final class v0 extends gd4.b {

    /* renamed from: s, reason: collision with root package name */
    public static final gd4.a0 f352392s = new gd4.a0(null);

    /* renamed from: m, reason: collision with root package name */
    public boolean f352393m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f352394n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f352395o;

    /* renamed from: p, reason: collision with root package name */
    public int f352396p;

    /* renamed from: q, reason: collision with root package name */
    public int f352397q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f352398r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(gd4.x0 x0Var, gd4.w0 w0Var, gd4.x0 x0Var2, p3325xe03a0797.p3326xc267989b.y0 y0Var, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 restartPlayFlow, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 playCommandFlow, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, yz5.p setClickArea, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a1 a1Var, r45.jj4 jj4Var, i64.b1 b1Var, java.lang.Object obj) {
        super(x0Var, w0Var, x0Var2, y0Var, restartPlayFlow, playCommandFlow, c17933xe8d1b226, setClickArea, a1Var, jj4Var, b1Var, obj);
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(restartPlayFlow, "restartPlayFlow");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playCommandFlow, "playCommandFlow");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setClickArea, "setClickArea");
        boolean z17 = obj instanceof gd4.b0;
        gd4.b0 b0Var = z17 ? (gd4.b0) obj : null;
        int i18 = 0;
        if (b0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$PlayReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoPlayTotalTimeMs", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$PlayReportInfo");
            i17 = (int) b0Var.f352151a;
        } else {
            i17 = 0;
        }
        this.f352396p = i17;
        gd4.b0 b0Var2 = z17 ? (gd4.b0) obj : null;
        if (b0Var2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoPlayCount", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$PlayReportInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoPlayCount", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$PlayReportInfo");
            i18 = b0Var2.f352152b;
        }
        this.f352397q = i18;
    }

    public static final /* synthetic */ int m(gd4.v0 v0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getVideoPlayTotalTimeMs$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        int i17 = v0Var.f352396p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getVideoPlayTotalTimeMs$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        return i17;
    }

    public static final /* synthetic */ boolean n(gd4.v0 v0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isFirstPlayed$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        boolean z17 = v0Var.f352393m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isFirstPlayed$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        return z17;
    }

    public static final /* synthetic */ void o(gd4.v0 v0Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setVideoPlayTotalTimeMs$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        v0Var.f352396p = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setVideoPlayTotalTimeMs$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
    }

    public static final p3325xe03a0797.p3326xc267989b.r2 p(p3325xe03a0797.p3326xc267989b.y0 y0Var, gd4.v0 v0Var, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, float f17, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        p3325xe03a0797.p3326xc267989b.r2 d17 = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new gd4.i0(v0Var, e0Var, f17, i2Var, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$startProcessCommandFlow$reseekBreakVideo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        return d17;
    }

    @Override // gd4.b
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a1 a1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o1 b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addCurrentVideoTotalTimes", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        if (this.f352395o) {
            if (this.f352393m) {
                java.lang.Number valueOf = (a1Var == null || (b17 = a1Var.b()) == null) ? 0 : java.lang.Float.valueOf(b17.a());
                int i17 = this.f352396p;
                gd4.x0 f17 = f();
                this.f352396p = i17 + (((int) (f17 != null ? f17.mo71213x35418e61() : 0L)) - valueOf.intValue());
            } else {
                int i18 = this.f352396p;
                gd4.x0 f18 = f();
                this.f352396p = i18 + ((int) (f18 != null ? f18.mo71213x35418e61() : 0L));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addCurrentVideoTotalTimes", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
    }

    @Override // gd4.b
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        this.f352393m = false;
        this.f352394n = false;
        this.f352395o = false;
        gd4.b0 b0Var = new gd4.b0(this.f352396p, this.f352397q);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStoredData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        this.f352150l = b0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStoredData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClear", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
    }

    @Override // gd4.b
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b0 b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d0 d0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a1 a17;
        float mo71216x37a7fa50;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d0 d0Var2 = c17933xe8d1b226.m70354x74235b3e().f38152x29dcd87f;
            b17 = d0Var2 != null ? d0Var2.b() : null;
            d0Var = c17933xe8d1b226.m70354x74235b3e().f38152x29dcd87f;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CycleScheduleVideoController", "sns_ad_break_frame_report, exp=" + e17);
        }
        if (d0Var != null && (a17 = d0Var.a()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentBreakVideoMedia", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentBreakVideoMedia", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
            r45.jj4 jj4Var = this.f352148j;
            if (jj4Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
                return;
            }
            a(a17);
            float a18 = a17.b().a();
            float f17 = jj4Var.R;
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
            float min = f19 > 0.0f ? java.lang.Math.min(f19, mo71216x37a7fa50) : mo71216x37a7fa50;
            i64.b1 h17 = h();
            int i17 = 0;
            int i18 = (h17 != null ? h17.f370628j : 0) == 0 ? 1 : 2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
            jSONObject.put("uxinfo", c17933xe8d1b226.m70375x338a8cc7());
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i18);
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
            jSONObject2.put("loopStartTime", java.lang.Float.valueOf(a18));
            jSONObject2.put("loopEndTime", java.lang.Float.valueOf(min));
            int i19 = this.f352396p;
            if (i19 >= 0) {
                i17 = i19;
            }
            jSONObject2.put("videoPlayTotalTime", i17);
            jSONObject2.put("videoPlayCount", this.f352397q);
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            ca4.m0.a("sns_ad_break_frame_report", jSONObject3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportBreakFrameInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
    }

    @Override // gd4.b
    public void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d0 d0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startProcessCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i17 = i();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o1 b17 = (i17 == null || (m70354x74235b3e2 = i17.m70354x74235b3e()) == null || (d0Var = m70354x74235b3e2.f38152x29dcd87f) == null || (a17 = d0Var.a()) == null) ? null : a17.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i18 = i();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d0 d0Var2 = (i18 == null || (m70354x74235b3e = i18.m70354x74235b3e()) == null) ? null : m70354x74235b3e.f38152x29dcd87f;
        float f17 = 0.0f;
        float a18 = b17 != null ? b17.a() : 0.0f;
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.e0();
        if (b17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStartOffset", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStartOffset", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
            f17 = b17.f247616b;
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b18 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3325xe03a0797.p3326xc267989b.y0 e17 = e();
        if (e17 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(e17, null, null, new gd4.k0(this, a18, null), 3, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 e18 = e();
        if (e18 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(e18, null, null, new gd4.u0(this, b18, a18, h0Var, e0Var, null), 3, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 e19 = e();
        if (e19 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(e19, null, null, new gd4.g0(this, d0Var2, h0Var, b17, e0Var, f17, a18, b18, null), 3, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startProcessCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
    }
}

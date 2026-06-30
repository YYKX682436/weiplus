package tc4;

/* loaded from: classes4.dex */
public final class k extends in5.v {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f498920a = new android.graphics.Rect();

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f498921b = new android.graphics.Rect();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f498922c;

    public k(tc4.a0 a0Var) {
        this.f498922c = a0Var;
    }

    @Override // in5.v
    public boolean a(android.view.View target) {
        android.view.View findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdditionalCondition", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        android.content.Context context = this.f498922c.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (findViewById = activity.findViewById(com.p314xaae8f345.mm.R.id.f564056gp)) != null) {
            android.graphics.Rect rect = this.f498920a;
            boolean globalVisibleRect = findViewById.getGlobalVisibleRect(rect);
            android.graphics.Rect rect2 = this.f498921b;
            boolean globalVisibleRect2 = target.getGlobalVisibleRect(rect2);
            if (globalVisibleRect && globalVisibleRect2 && rect.bottom > rect2.top) {
                float width = (target.getMeasuredWidth() <= 0 || target.getMeasuredHeight() <= 0) ? 0.0f : (rect2.width() * (rect2.height() - (rect.bottom - rect2.top))) / (target.getMeasuredWidth() * target.getMeasuredHeight());
                b(target);
                boolean z17 = 0.5f <= width;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdditionalCondition", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2");
                return z17;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdditionalCondition", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2");
        return true;
    }

    @Override // in5.v
    public float b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExposePercent", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExposePercent", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2");
        return 0.5f;
    }

    @Override // in5.v
    public void d(android.view.View view, long j17, long j18, boolean z17, long j19) {
        java.lang.String str;
        java.lang.String str2;
        xc4.p n17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17;
        r45.a90 a90Var;
        r45.g92 g92Var;
        java.lang.String str3;
        xc4.p n18;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h18;
        r45.a90 a90Var2;
        r45.g92 g92Var2;
        long j27;
        xc4.p n19;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h19;
        java.lang.String jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        tc4.a0 a0Var = this.f498922c;
        zc4.b m166188xfb7e5820 = a0Var.m166188xfb7e5820();
        if (m166188xfb7e5820 == null || (n17 = m166188xfb7e5820.n()) == null || (h17 = n17.h1()) == null || (a90Var = h17.f39014x86965dde) == null || (g92Var = a90Var.f451381s) == null) {
            str = "onViewExposed";
            str2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2";
        } else {
            if (z17) {
                long c17 = c01.id.c();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setStartExposeTimestamp$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                a0Var.I1 = c17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setStartExposeTimestamp$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                str = "onViewExposed";
                str2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2";
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getStartExposeTimestamp$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                long j28 = a0Var.I1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getStartExposeTimestamp$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$reportExtReport", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportExtReport", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                zc4.b m166188xfb7e58202 = a0Var.m166188xfb7e5820();
                if (m166188xfb7e58202 == null || (n18 = m166188xfb7e58202.n()) == null || (h18 = n18.h1()) == null || (a90Var2 = h18.f39014x86965dde) == null || (g92Var2 = a90Var2.f451381s) == null) {
                    str2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2";
                    str3 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem";
                    str = "onViewExposed";
                } else {
                    str3 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem";
                    r45.l71 Hj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Hj(pm0.v.Z(g92Var2.m75945x2fec8307(0)));
                    if (Hj != null && Hj.m75933x41a8a7f2(26)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.FinderLiveTimelineItem", "reportExtReport: server close expose ext report, feedId=" + g92Var2.m75945x2fec8307(2) + ", liveId=" + g92Var2.m75945x2fec8307(0));
                        str = "onViewExposed";
                        str2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2";
                    } else {
                        if (a0Var.J1 > 0) {
                            str = "onViewExposed";
                            str2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2";
                            j27 = (a0Var.K1 + android.os.SystemClock.elapsedRealtime()) - a0Var.J1;
                        } else {
                            str = "onViewExposed";
                            str2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2";
                            j27 = a0Var.K1;
                        }
                        r45.jn0 jn0Var = new r45.jn0();
                        jn0Var.set(0, java.lang.Long.valueOf(pm0.v.Z(g92Var2.m75945x2fec8307(2))));
                        jn0Var.set(1, g92Var2.m75945x2fec8307(1));
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("feedActionType", 117);
                        jSONObject2.put("value", j28);
                        jSONObject2.put("duration", j19);
                        jSONObject2.put("AutoPlayDuration", j27);
                        jSONObject2.put("EntranceScene", 4);
                        zc4.b m166188xfb7e58203 = a0Var.m166188xfb7e5820();
                        java.lang.String str4 = (m166188xfb7e58203 == null || (n19 = m166188xfb7e58203.n()) == null || (h19 = n19.h1()) == null) ? null : h19.f39018xf3f56116;
                        if (str4 == null) {
                            str4 = "";
                        }
                        jSONObject2.put("share_username", str4);
                        jn0Var.set(3, jSONObject2.toString());
                        ((j40.m) ((m40.h0) i95.n0.c(m40.h0.class))).wi(null, 18054, jn0Var);
                    }
                }
                a0Var.K1 = 0L;
                a0Var.J1 = 0L;
                java.lang.String str5 = str3;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportExtReport", str5);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$reportExtReport", str5);
            }
            i95.m c18 = i95.n0.c(zy2.pa.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.pa paVar = (zy2.pa) c18;
            long Z = pm0.v.Z(g92Var.m75945x2fec8307(2));
            long Z2 = pm0.v.Z(g92Var.m75945x2fec8307(0));
            java.lang.String m75945x2fec8307 = g92Var.m75945x2fec8307(1);
            java.lang.String m75945x2fec83072 = g92Var.m75945x2fec8307(3);
            java.lang.String str6 = m75945x2fec83072 == null ? "" : m75945x2fec83072;
            long j29 = z17 ? 16L : 17L;
            p52.e[] eVarArr = p52.e.f433541d;
            if (z17) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("share_scene", g92Var.m75939xb282bd08(44));
                jSONObject = jSONObject3.toString();
            } else {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("exp_time", (int) j19);
                jSONObject4.put("share_scene", g92Var.m75939xb282bd08(44));
                jSONObject = jSONObject4.toString();
            }
            java.lang.String str7 = jSONObject;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str7);
            zy2.pa.Gc(paVar, Z, Z2, m75945x2fec8307, str6, j29, "temp_6", 3, str7, null, 256, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }
}

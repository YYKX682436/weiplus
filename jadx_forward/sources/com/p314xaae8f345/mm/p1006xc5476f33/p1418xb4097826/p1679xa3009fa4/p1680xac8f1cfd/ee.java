package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public abstract class ee extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f215798m;

    /* renamed from: f, reason: collision with root package name */
    public boolean f215799f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f215800g;

    /* renamed from: h, reason: collision with root package name */
    public int f215801h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f215802i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f215800g = "";
        this.f215802i = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.de.f215672d);
    }

    public static final boolean f7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5 y5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5.f184249a;
        g92.b bVar = g92.b.f351302e;
        r45.yt2 yt2Var = (r45.yt2) bVar.k2().d().m75936x14adae67(18);
        int m75939xb282bd08 = yt2Var != null ? yt2Var.m75939xb282bd08(4) : 3;
        r45.yt2 yt2Var2 = (r45.yt2) bVar.k2().d().m75936x14adae67(18);
        int m75939xb282bd082 = yt2Var2 != null ? yt2Var2.m75939xb282bd08(5) : 1;
        boolean z17 = !y5Var.c() ? y5Var.a() >= m75939xb282bd082 : y5Var.a() >= m75939xb282bd08;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isCanFreqCtrl limit:");
        sb6.append(m75939xb282bd08);
        sb6.append(" isSetIn90:");
        sb6.append(y5Var.c());
        sb6.append(" limit90:");
        sb6.append(m75939xb282bd082);
        sb6.append(" today:");
        sb6.append(y5Var.a());
        sb6.append(" ctrl:");
        sb6.append(z17);
        sb6.append(" RING_TONE_LIMIT:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.E9;
        sb6.append(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderRingToneManager", sb6.toString());
        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() == 1) {
            return true;
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void P6(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 animationType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationType, "animationType");
        U6(holder);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void Q6(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 animationType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationType, "animationType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedRingtoneUIC", "showRingtoneInfo");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LAST_REMIND_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5.f184249a.a() + 1;
        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd").format((java.lang.Object) new java.util.Date());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
        long parseLong = (java.lang.Long.parseLong(format) * 1000) + a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedRingtoneUIC", "increaseTodayRemindCount todayCount:" + a17 + " formatCount:" + parseLong);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TODAY_REMIND_COUNT_LONG_SYNC, java.lang.Long.valueOf(parseLong));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public boolean X6(in5.s0 holder, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return d7(holder, z17) && R6(holder) != null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void c7(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.c7(holder);
        U6(holder);
    }

    public final boolean d7(in5.s0 holder, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.E9).mo141623x754a37bb()).r()).intValue() == 1) {
            return true;
        }
        java.lang.Object obj = holder.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 != null) {
            int l17 = nv2.n1.f422084h.l(abstractC14490x69736cb5.getFeedObject().getFeedObject());
            int m76826xb1bffb28 = abstractC14490x69736cb5.getFeedObject().f66937x27cd822a.m76826xb1bffb28();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76802x2dd01666();
            r45.u25 m76973xacff4065 = m76802x2dd01666 != null ? m76802x2dd01666.m76973xacff4065() : null;
            g92.b bVar = g92.b.f351302e;
            r45.yt2 yt2Var = (r45.yt2) bVar.k2().d().m75936x14adae67(18);
            boolean m75933x41a8a7f2 = yt2Var != null ? yt2Var.m75933x41a8a7f2(6) : false;
            if (z17 && m75933x41a8a7f2 && m76826xb1bffb28 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedRingtoneUIC", "isShowRingtoneInfo self show ringtoneCount:" + m76826xb1bffb28 + '.');
                return true;
            }
            r45.yt2 yt2Var2 = (r45.yt2) bVar.k2().d().m75936x14adae67(18);
            int m75939xb282bd08 = yt2Var2 != null ? yt2Var2.m75939xb282bd08(0) : 30;
            r45.yt2 yt2Var3 = (r45.yt2) bVar.k2().d().m75936x14adae67(18);
            int m75939xb282bd082 = yt2Var3 != null ? yt2Var3.m75939xb282bd08(1) : 10;
            if (!android.text.TextUtils.isEmpty(m76973xacff4065 != null ? m76973xacff4065.m75945x2fec8307(1) : null)) {
                m75939xb282bd08 = m75939xb282bd082;
            }
            boolean z18 = l17 >= 10000 ? ((float) m76826xb1bffb28) > ((((float) l17) * 1.0f) / ((float) 10000)) * ((float) m75939xb282bd08) : m76826xb1bffb28 > m75939xb282bd08;
            if (!hc2.b0.a(abstractC14490x69736cb5)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedRingtoneUIC", "isShowRingtoneInfo return for canShareRingTone");
            } else if (abstractC14490x69736cb5.getFeedObject().m59305xd158fcf3()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedRingtoneUIC", "isShowRingtoneInfo return for isDisableShowSetRingtoneBtn");
            } else {
                if (abstractC14490x69736cb5.getFeedObject().m59345x69eb04bf()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedRingtoneUIC", "isShowRingtoneInfo return for isShowSetRingtoneBtn");
                    return true;
                }
                if (abstractC14490x69736cb5.getFeedObject().m59306x9e49ec22()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedRingtoneUIC", "isShowRingtoneInfo return for isEnableShowSetRingtoneBtn");
                    return f7();
                }
                if (f7() && z18) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int e7(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        int width = view.getWidth();
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (width > 0 || view2 == null) {
            return width;
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(view2.getWidth(), 0), android.view.View.MeasureSpec.makeMeasureSpec(view2.getHeight(), 0));
        return new android.graphics.Point(view.getMeasuredWidth(), view.getMeasuredHeight()).x;
    }

    public void g7(in5.s0 holder) {
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.content.Context context = holder.f374654e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        boolean z17 = false;
        if (activity != null && (intent = activity.getIntent()) != null) {
            z17 = intent.getBooleanExtra("key_enable_ringtone_bubble", false);
        }
        f215798m = z17;
    }

    public final void h7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("feedid", pm0.v.u(feed.mo2128x1ed62e84()));
            boolean z17 = true;
            if (f215798m) {
                jSONObject.put("feed_source", 1);
            } else {
                jSONObject.put("feed_source", 0);
            }
            if (str == null) {
                str = "";
            }
            jSONObject.put("songid", str);
            if (this.f215800g.length() <= 0) {
                z17 = false;
            }
            if (z17) {
                jSONObject.put("bell_info", this.f215800g);
            }
            if (f215798m) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("intab", this.f215801h);
                jSONObject.put("video_pos_info", jSONObject2.toString());
            }
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "set_song_tips", 1, jSONObject, false, null, 48, null);
    }

    public final void i7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("feedid", pm0.v.u(feed.mo2128x1ed62e84()));
            boolean z17 = true;
            if (f215798m) {
                jSONObject.put("feed_source", 1);
            } else {
                jSONObject.put("feed_source", 0);
            }
            if (str == null) {
                str = "";
            }
            jSONObject.put("songid", str);
            if (this.f215800g.length() <= 0) {
                z17 = false;
            }
            if (z17) {
                jSONObject.put("bell_info", this.f215800g);
            }
            if (f215798m) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("intab", this.f215801h);
                jSONObject.put("video_pos_info", jSONObject2.toString());
            }
        } catch (org.json.JSONException unused) {
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a, V6, "set_song_tips", 0, jSONObject, false, null, 48, null);
        if (V6 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a.b(V6, feed, 43);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        r45.yt2 yt2Var = (r45.yt2) g92.b.f351302e.k2().d().m75936x14adae67(18);
        int m75939xb282bd08 = yt2Var != null ? yt2Var.m75939xb282bd08(2) : 14;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((dd0.q0) ((ed0.w0) i95.n0.c(ed0.w0.class))).getClass();
        vx3.i i17 = mx3.i0.i("");
        long j17 = i17 != null ? i17.f522835s : 0L;
        if (j17 == 0) {
            this.f215799f = true;
            return;
        }
        long j18 = currentTimeMillis - j17;
        if (m75939xb282bd08 == 0 || j18 >= m75939xb282bd08 * 86400000) {
            this.f215799f = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedRingtoneUIC", "setRingtoneFrequencyLimit = " + m75939xb282bd08 + " diffMs = " + j18 + " isSetRingtoneMeetCondition = " + this.f215799f);
    }
}

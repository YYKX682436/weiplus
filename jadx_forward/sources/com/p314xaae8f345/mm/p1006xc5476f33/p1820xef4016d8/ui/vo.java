package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class vo extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f229119d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f229120e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f229121f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f229122g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f229123h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f229124i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f229125m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f229126n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.vo voVar, r45.wd3 wd3Var) {
        voVar.getClass();
        r45.p90 p90Var = wd3Var.f470609d;
        if (p90Var == null) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p90Var.f464403g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] reddot version is null, return");
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = voVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
        r45.lm5 h76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x19263085).h7();
        if (h76 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] local reddot is null, save reddot info");
            voVar.T6(wd3Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] version, local: " + h76.f461156e + "、svr:" + p90Var.f464403g);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h76.f461156e) && h76.f461155d == 2 && p90Var.f464404h == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] old data is update_value、new data is new_value ： update old data to not show");
            h76.f461158g = false;
            h76.f461161m = false;
            voVar.R6(h76);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.a(h76.f461156e);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = voVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x192630852).f228091l2 = false;
            voVar.X6();
            return;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_PREPARE_UI_ENVELOPE_ENTRANCE_CLICKED_LAST_TIME_LONG_SYNC, 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((java.lang.Long) m17).longValue();
        long h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.h();
        boolean z17 = longValue > 0 && h17 - longValue < 43200000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] inSaveProtectTimeExternal: " + z17 + "， curTime：" + h17 + " , lastClickEntranceTime: " + longValue);
        if (p90Var.f464400d && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] inSaveProtectTimeExternal, ignore");
            return;
        }
        long h18 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.h() / 1000;
        java.lang.Boolean c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.c(p90Var.f464403g);
        boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h76.f461156e) && r26.i0.q(h76.f461156e, p90Var.f464403g, false, 2, null) && h18 > h76.f461160i;
        if (p90Var.f464400d) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
            if (c17.booleanValue() || z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] ReDot is expired or clicked. Don't show Red Dot");
                return;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h76.f461156e) || !r26.i0.q(h76.f461156e, p90Var.f464403g, false, 2, null)) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.c(p90Var.f464403g).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] version exist, ignore save svr reddot info, version is " + p90Var.f464403g);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] version not exists, new reddot version is " + p90Var.f464403g + ", is_show is " + p90Var.f464400d);
                voVar.T6(wd3Var);
                return;
            }
        }
        if (c17.booleanValue() || h18 >= h76.f461160i) {
            if (p90Var.f464400d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] do nothing ");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] update local reddot is_show to false ");
            h76.f461158g = false;
            h76.f461161m = false;
            voVar.R6(h76);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = voVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630853, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x192630853).f228091l2 = false;
            voVar.X6();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] update local reddot.is_show to: " + p90Var.f464400d);
        boolean z19 = p90Var.f464400d;
        h76.f461158g = z19;
        h76.f461161m = z19;
        voVar.R6(h76);
        if (!p90Var.f464400d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[handleSelectSkinEntryRedDotInfo] refresh local reddot show flag to false");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630854 = voVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630854, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x192630854).f228091l2 = false;
        }
        voVar.X6();
    }

    public final void P6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 activityC16391xf093c1e3 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x19263085 : null;
        if (activityC16391xf093c1e3 != null ? activityC16391xf093c1e3.f228093m2 : false) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[doNormalTextStyle] mSourceDisableStatus is true， set gone");
            android.widget.TextView textView = this.f229126n;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 activityC16391xf093c1e32 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x192630852 : null;
        if (!(activityC16391xf093c1e32 != null ? activityC16391xf093c1e32.k7() : false)) {
            android.widget.TextView textView2 = this.f229126n;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        android.widget.TextView textView3 = this.f229126n;
        if (textView3 != null) {
            textView3.setTextColor(android.graphics.Color.parseColor("#806B48"));
        }
        android.widget.TextView textView4 = this.f229126n;
        if (textView4 == null) {
            return;
        }
        textView4.setVisibility(0);
    }

    public final void Q6(android.widget.TextView textView) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 activityC16391xf093c1e3 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x19263085 : null;
        if (activityC16391xf093c1e3 != null ? activityC16391xf093c1e3.k7() : false) {
            if (textView != null) {
                textView.setTextColor(android.graphics.Color.parseColor("#806B48"));
            }
            com.p314xaae8f345.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
        } else {
            if (textView != null) {
                textView.setTextColor(m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            }
            com.p314xaae8f345.mm.ui.bk.t0(textView != null ? textView.getPaint() : null);
        }
    }

    public final void R6(r45.lm5 lm5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[updateSelectSkinEntryRedDotLocalData]");
        if (lm5Var == null) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x19263085).f228089k2 = lm5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.e(lm5Var);
    }

    public final java.lang.String S6() {
        java.lang.Object obj;
        if (!U6()) {
            return "";
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.p Di = rn3.i.Di();
        android.util.Pair c17 = Di != null ? Di.c(new vn3.c(57)) : null;
        if ((c17 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r) c17.first : null) != com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE || (obj = c17.second) == null) {
            return "";
        }
        r45.pm6 pm6Var = (r45.pm6) obj;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pm6Var != null ? pm6Var.f464720e : null)) {
            return "";
        }
        r45.pm6 pm6Var2 = (r45.pm6) c17.second;
        if (pm6Var2 != null) {
            return pm6Var2.f464720e;
        }
        return null;
    }

    public final void T6(r45.wd3 wd3Var) {
        r45.p90 p90Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[saveSelectSkinEntryRedDotLocalDataAndRefresh]");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 activityC16391xf093c1e3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x19263085;
        r45.lm5 lm5Var = null;
        if (wd3Var != null && (p90Var = wd3Var.f470609d) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[doSaveLocalRedDotInfo] data source, is_show : " + java.lang.Boolean.valueOf(p90Var.f464400d) + "， type：" + java.lang.Integer.valueOf(p90Var.f464404h) + " , version: " + p90Var.f464403g + " , expired_time: " + java.lang.Integer.valueOf(p90Var.f464405i) + ' ');
            r45.lm5 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.n();
            if (n17 != null && n17.f461155d == 2 && p90Var.f464404h == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[doModifySelectSkinEntryLocalRedDotInfo] old and new data is update_value, add old version to hasClickRedDotVersionList");
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.a(n17.f461156e);
                n17.f461158g = false;
                n17.f461161m = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.e(n17);
            }
            lm5Var = new r45.lm5();
            boolean z17 = p90Var.f464400d;
            lm5Var.f461158g = z17;
            lm5Var.f461161m = z17;
            lm5Var.f461155d = p90Var.f464404h;
            java.lang.String str = p90Var.f464402f;
            if (str == null) {
                str = "";
            }
            lm5Var.f461164p = str;
            java.lang.String str2 = p90Var.f464403g;
            if (str2 == null) {
                str2 = "";
            }
            lm5Var.f461156e = str2;
            java.lang.String str3 = p90Var.f464406m;
            lm5Var.f461169u = str3 != null ? str3 : "";
            lm5Var.f461159h = 0L;
            lm5Var.f461162n = 0L;
            int i17 = p90Var.f464405i;
            long h17 = i17 > 0 ? i17 : (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.h() / 1000) + 604800;
            lm5Var.f461160i = h17;
            lm5Var.f461163o = h17;
            java.util.LinkedList wordings = p90Var.f464401e;
            if (wordings != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wordings, "wordings");
                if (!wordings.isEmpty()) {
                    java.util.Iterator it = wordings.iterator();
                    while (it.hasNext()) {
                        r45.fm5 fm5Var = (r45.fm5) it.next();
                        if (fm5Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fm5Var.f455985d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fm5Var.f455986e)) {
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fm5Var.f455985d, "zh_CN")) {
                                lm5Var.f461165q = fm5Var.f455986e;
                            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fm5Var.f455985d, "zh_HK")) {
                                lm5Var.f461166r = fm5Var.f455986e;
                            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fm5Var.f455985d, "zh_TW")) {
                                lm5Var.f461167s = fm5Var.f455986e;
                            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fm5Var.f455985d, "en")) {
                                lm5Var.f461168t = fm5Var.f455986e;
                            }
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.e(lm5Var);
        }
        activityC16391xf093c1e3.f228089k2 = lm5Var;
        X6();
    }

    public final boolean U6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 activityC16391xf093c1e3 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x19263085 : null;
        if (activityC16391xf093c1e3 != null ? activityC16391xf093c1e3.f228093m2 : false) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[shouldShowPersonalRedDot] mSourceDisableStatus is true, return false");
            return false;
        }
        boolean Ui = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ui();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[shouldShowPersonalRedDot] " + Ui);
        return Ui;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r0.f461158g != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        if (r0.f461158g != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean V6() {
        /*
            r9 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r9.m158354x19263085()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r1)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) r0
            boolean r0 = r0.f228093m2
            java.lang.String r2 = "MicroMsg.RedDotUIC-PrepareUI"
            r3 = 0
            if (r0 == 0) goto L18
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] mSourceDisableStatus is true, return false"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r0)
            return r3
        L18:
            boolean r0 = r9.U6()
            if (r0 == 0) goto L24
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] shouldShowPersonalRedDot, return false"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r0)
            return r3
        L24:
            long r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.h()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            androidx.appcompat.app.AppCompatActivity r0 = r9.m158354x19263085()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r1)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) r0
            r45.lm5 r0 = r0.h7()
            if (r0 != 0) goto L40
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] redDotData == null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r0)
            return r3
        L40:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "[shouldShowSelectSkinEntryPlazaNewRedDot] version： "
            r1.<init>(r6)
            java.lang.String r6 = r0.f461156e
            r1.append(r6)
            java.lang.String r6 = ", type："
            r1.append(r6)
            int r6 = r0.f461155d
            r1.append(r6)
            java.lang.String r6 = " , is_show："
            r1.append(r6)
            boolean r6 = r0.f461158g
            r1.append(r6)
            java.lang.String r6 = " , currentTime："
            r1.append(r6)
            r1.append(r4)
            java.lang.String r6 = ",  invalidateTimes："
            r1.append(r6)
            long r6 = r0.f461160i
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            int r1 = r0.f461155d
            r6 = 1
            if (r1 == r6) goto L93
            r7 = 2
            if (r1 == r7) goto L87
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] unknown type"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r0)
            goto Lc3
        L87:
            long r7 = r0.f461160i
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto Lc3
            boolean r0 = r0.f461158g
            if (r0 == 0) goto Lc3
        L91:
            r3 = r6
            goto Lc3
        L93:
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r7 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_CLICKEDSKIN_INT_SYNC
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r1.m(r7, r8)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Int"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r1, r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r6) goto Lb8
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] user has clicked select skin entry, ignore show reddot"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r0)
            return r3
        Lb8:
            long r7 = r0.f461160i
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto Lc3
            boolean r0 = r0.f461158g
            if (r0 == 0) goto Lc3
            goto L91
        Lc3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[shouldShowSelectSkinEntryPlazaNewRedDot] shouldShow："
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.vo.V6():boolean");
    }

    public final boolean W6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x19263085).f228093m2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[shouldShowSelectSkinNormalRedDot] mSourceDisableStatus is true, return false");
            return false;
        }
        if (U6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[shouldShowSelectSkinNormalRedDot] shouldShowPersonalRedDot, return false");
            return false;
        }
        if (V6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[shouldShowSelectSkinNormalRedDot] shouldShowSelectSkinEntryPlazaNewRedDot, return false");
            return false;
        }
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        return bk0.a.g().f(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_HOME_STRING_SYNC);
    }

    public final void X6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 activityC16391xf093c1e3 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x19263085 : null;
        android.widget.TextView textView = activityC16391xf093c1e3 != null ? activityC16391xf093c1e3.L : null;
        if (U6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[updateSelectSkinEntryRedDotStyle] show personal reddot");
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = this.f229126n;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout = this.f229119d;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout2 = this.f229123h;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            java.lang.String S6 = S6();
            if (S6 == null || S6.length() == 0) {
                android.widget.TextView textView3 = this.f229124i;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            } else {
                android.widget.TextView textView4 = this.f229124i;
                if (textView4 != null) {
                    textView4.setText(S6);
                }
                android.widget.TextView textView5 = this.f229124i;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
                Q6(this.f229124i);
            }
            android.widget.TextView textView6 = this.f229125m;
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
        } else if (V6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[updateSelectSkinEntryRedDotStyle] show plaza new reddot");
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.TextView textView7 = this.f229126n;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout3 = this.f229119d;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            android.widget.LinearLayout linearLayout4 = this.f229123h;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
            r45.lm5 h76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x192630852).h7();
            if (h76 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h76.f461164p)) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = this.f229120e;
                if (c19659x677e0913 != null) {
                    c19659x677e0913.setVisibility(8);
                }
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e09132 = this.f229120e;
                if (c19659x677e09132 != null) {
                    c19659x677e09132.setVisibility(0);
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e09133 = this.f229120e;
                if (c19659x677e09133 != null) {
                    c19659x677e09133.m75396xca029dad(h76.f461164p);
                }
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630853, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x192630853).k7();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630854 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630854, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
            java.lang.String g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.g(((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x192630854).h7());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                android.widget.TextView textView8 = this.f229121f;
                if (textView8 != null) {
                    textView8.setVisibility(8);
                }
            } else {
                android.widget.TextView textView9 = this.f229121f;
                if (textView9 != null) {
                    textView9.setVisibility(0);
                }
                android.widget.TextView textView10 = this.f229121f;
                if (textView10 != null) {
                    textView10.setText(g17);
                }
                Q6(this.f229121f);
            }
            android.widget.TextView textView11 = this.f229122g;
            if (textView11 != null) {
                textView11.setVisibility(0);
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630855 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630855, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x192630855).f228091l2) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630856 = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630856, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x192630856).f228091l2 = true;
            }
        } else if (W6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[updateSelectSkinEntryRedDotStyle] show normal reddot");
            if (textView != null) {
                textView.setVisibility(0);
            }
            P6();
            android.widget.LinearLayout linearLayout5 = this.f229119d;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout6 = this.f229123h;
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(8);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[updateSelectSkinEntryRedDotStyle] dont show any reddot");
            if (textView != null) {
                textView.setVisibility(8);
            }
            P6();
            android.widget.LinearLayout linearLayout7 = this.f229119d;
            if (linearLayout7 != null) {
                linearLayout7.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout8 = this.f229123h;
            if (linearLayout8 != null) {
                linearLayout8.setVisibility(8);
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630857 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 activityC16391xf093c1e32 = m158354x192630857 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x192630857 : null;
        boolean k76 = activityC16391xf093c1e32 != null ? activityC16391xf093c1e32.k7() : false;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630858 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 activityC16391xf093c1e33 = m158354x192630858 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16391xf093c1e3) m158354x192630858 : null;
        android.widget.LinearLayout linearLayout9 = activityC16391xf093c1e33 != null ? activityC16391xf093c1e33.f228095n2 : null;
        if (k76) {
            if (linearLayout9 != null) {
                linearLayout9.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.aby);
            }
        } else if (linearLayout9 != null) {
            linearLayout9.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        }
        float b17 = i65.a.b(m80379x76847179(), 8);
        if (linearLayout9 != null) {
            linearLayout9.setOutlineProvider(new zl5.a(true, true, b17));
        }
        if (linearLayout9 == null) {
            return;
        }
        linearLayout9.setClipToOutline(true);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class ld extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f228669d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f228670e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f228671f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f228672g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f228673h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f228674i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f228675m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f228676n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ld ldVar, r45.wd3 wd3Var) {
        ldVar.getClass();
        r45.p90 p90Var = wd3Var.f470609d;
        if (p90Var == null) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p90Var.f464403g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] reddot version is null, return");
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = ldVar.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
        r45.lm5 g76 = activityC16373x8a110f13 != null ? activityC16373x8a110f13.g7() : null;
        if (g76 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] local reddot is null, save reddot info");
            ldVar.V6(wd3Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] version, local: " + g76.f461156e + "、svr:" + p90Var.f464403g);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g76.f461156e) && g76.f461155d == 2 && p90Var.f464404h == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] old data is update_value、new data is new_value ： update old data to not show");
            g76.f461158g = false;
            g76.f461161m = false;
            ldVar.R6(g76);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.a(g76.f461156e);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = ldVar.m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f132 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630852 : null;
            if (activityC16373x8a110f132 != null) {
                activityC16373x8a110f132.f227785g2 = false;
            }
            ldVar.a7();
            return;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_PREPARE_UI_ENVELOPE_ENTRANCE_CLICKED_LAST_TIME_LONG_SYNC, 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((java.lang.Long) m17).longValue();
        long h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.h();
        boolean z17 = longValue > 0 && h17 - longValue < 43200000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] inSaveProtectTimeExternal: " + z17 + "， curTime：" + h17 + " , lastClickEntranceTime: " + longValue);
        if (p90Var.f464400d && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] inSaveProtectTimeExternal, ignore");
            return;
        }
        long h18 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.h() / 1000;
        java.lang.Boolean c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.c(p90Var.f464403g);
        boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g76.f461156e) && r26.i0.q(g76.f461156e, p90Var.f464403g, false, 2, null) && h18 > g76.f461160i;
        if (p90Var.f464400d) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
            if (c17.booleanValue() || z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] ReDot is expired or clicked. Don't show Red Dot");
                return;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g76.f461156e) || !r26.i0.q(g76.f461156e, p90Var.f464403g, false, 2, null)) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.c(p90Var.f464403g).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] version exist, ignore save svr reddot info, version is " + p90Var.f464403g);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] version not exists, new reddot version is " + p90Var.f464403g + ", is_show is " + p90Var.f464400d);
                ldVar.V6(wd3Var);
                return;
            }
        }
        if (c17.booleanValue() || h18 >= g76.f461160i) {
            if (p90Var.f464400d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] do nothing ");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] update local reddot is_show to false ");
            g76.f461158g = false;
            g76.f461161m = false;
            ldVar.R6(g76);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = ldVar.m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f133 = m158354x192630853 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630853 : null;
            if (activityC16373x8a110f133 != null) {
                activityC16373x8a110f133.f227785g2 = false;
            }
            ldVar.a7();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] update local reddot.is_show to: " + p90Var.f464400d);
        boolean z19 = p90Var.f464400d;
        g76.f461158g = z19;
        g76.f461161m = z19;
        ldVar.R6(g76);
        if (!p90Var.f464400d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[handleSelectSkinEntryRedDotInfo] refresh local reddot show flag to false");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630854 = ldVar.m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f134 = m158354x192630854 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630854 : null;
            if (activityC16373x8a110f134 != null) {
                activityC16373x8a110f134.f227785g2 = false;
            }
        }
        ldVar.a7();
    }

    public final void P6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
        boolean j76 = activityC16373x8a110f13 != null ? activityC16373x8a110f13.j7() : false;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f132 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630852 : null;
        boolean z17 = activityC16373x8a110f132 != null ? activityC16373x8a110f132.f227789i2 : false;
        if (!j76 || z17) {
            android.widget.TextView textView = this.f228676n;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = this.f228676n;
        if (textView2 != null) {
            textView2.setTextColor(android.graphics.Color.parseColor("#806B48"));
        }
        android.widget.TextView textView3 = this.f228676n;
        if (textView3 == null) {
            return;
        }
        textView3.setVisibility(0);
    }

    public final void Q6(android.widget.TextView textView, int i17) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
        boolean z17 = activityC16373x8a110f13 != null ? activityC16373x8a110f13.f227789i2 : false;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f132 = m158354x192630852 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x192630852 : null;
        boolean j76 = activityC16373x8a110f132 != null ? activityC16373x8a110f132.j7() : false;
        if (!j76) {
            if (textView != null) {
                textView.setTextColor(m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            }
            if (textView != null) {
                textView.setTextSize(1, 14.0f);
            }
            if (textView != null) {
                textView.setMaxLines(1);
            }
            if (textView != null) {
                textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            }
            com.p314xaae8f345.mm.ui.bk.t0(textView != null ? textView.getPaint() : null);
        } else if (z17) {
            if (textView != null) {
                textView.setTextColor(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adg));
            }
            if (textView != null) {
                textView.setTextSize(0, i65.a.a(m80379x76847179(), 14.0f) * i65.a.m(m80379x76847179()));
            }
            if (textView != null) {
                textView.setMaxLines(1);
            }
            if (textView != null) {
                textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            }
            if (textView != null) {
                textView.setLineSpacing(0.0f, 0.9f);
            }
            com.p314xaae8f345.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
        } else {
            if (textView != null) {
                textView.setTextColor(android.graphics.Color.parseColor("#806B48"));
            }
            if (textView != null) {
                textView.setTextSize(1, 14.0f);
            }
            if (textView != null) {
                textView.setMaxLines(1);
            }
            if (textView != null) {
                textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            }
            com.p314xaae8f345.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd qdVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd.class);
        qdVar.getClass();
        if (textView != null) {
            textView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nd(textView, qdVar, i17, j76));
        }
    }

    public final void R6(r45.lm5 lm5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[updateSelectSkinEntryRedDotLocalData]");
        if (lm5Var == null) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
        if (activityC16373x8a110f13 != null) {
            activityC16373x8a110f13.f227783f2 = lm5Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.e(lm5Var);
    }

    public final android.widget.LinearLayout S6() {
        return (android.widget.LinearLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f567291iy5);
    }

    public final java.lang.String T6() {
        java.lang.Object obj;
        if (!X6()) {
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

    public final boolean U6() {
        android.widget.TextView textView;
        android.widget.LinearLayout linearLayout = this.f228669d;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            return true;
        }
        android.widget.LinearLayout linearLayout2 = this.f228673h;
        if (linearLayout2 != null && linearLayout2.getVisibility() == 0) {
            return true;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
        return activityC16373x8a110f13 != null && (textView = activityC16373x8a110f13.G) != null && textView.getVisibility() == 0;
    }

    public final void V6(r45.wd3 wd3Var) {
        r45.p90 p90Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[saveSelectSkinEntryRedDotLocalDataAndRefresh]");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        r45.lm5 lm5Var = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
        if (activityC16373x8a110f13 != null) {
            if (wd3Var != null && (p90Var = wd3Var.f470609d) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[doSaveLocalRedDotInfo] data source, is_show : " + java.lang.Boolean.valueOf(p90Var.f464400d) + "， type：" + java.lang.Integer.valueOf(p90Var.f464404h) + " , version: " + p90Var.f464403g + " , expired_time: " + java.lang.Integer.valueOf(p90Var.f464405i) + ' ');
                r45.lm5 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.n();
                if (n17 != null && n17.f461155d == 2 && p90Var.f464404h == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewPrepareUIRedDotUIC", "[doModifySelectSkinEntryLocalRedDotInfo] old and new data is update_value, add old version to hasClickRedDotVersionList");
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
            activityC16373x8a110f13.f227783f2 = lm5Var;
        }
        a7();
    }

    public final void W6(boolean z17) {
        android.widget.RelativeLayout relativeLayout;
        if (z17) {
            android.widget.LinearLayout S6 = S6();
            if (S6 != null) {
                android.view.ViewParent parent = S6.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(S6);
                }
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(11);
                layoutParams.addRule(15);
                layoutParams.rightMargin = i65.a.b(m80379x76847179(), 16);
                S6.setLayoutParams(layoutParams);
                S6.setOrientation(0);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
                if (activityC16373x8a110f13 == null || (relativeLayout = activityC16373x8a110f13.f227824z) == null) {
                    return;
                }
                relativeLayout.addView(S6);
                return;
            }
            return;
        }
        android.widget.LinearLayout S62 = S6();
        if (S62 != null) {
            android.view.ViewParent parent2 = S62.getParent();
            android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(S62);
            }
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = i65.a.b(m80379x76847179(), 4);
            layoutParams2.gravity = 16;
            S62.setLayoutParams(layoutParams2);
            S62.setOrientation(0);
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd.class)).mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f567307j12);
            if (linearLayout != null) {
                linearLayout.addView(S62);
            }
        }
    }

    public final boolean X6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        if (m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) {
        }
        boolean Ui = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ui();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[shouldShowPersonalRedDot] " + Ui);
        return Ui;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if (r2.f461158g != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        if (r2.f461158g != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Y6() {
        /*
            r9 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r9.m158354x19263085()
            boolean r1 = r0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13
            r2 = 0
            if (r1 == 0) goto Lc
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            boolean r0 = r9.X6()
            r1 = 0
            java.lang.String r3 = "MicroMsg.NewPrepareUIRedDotUIC"
            if (r0 == 0) goto L1c
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] shouldShowPersonalRedDot, return false"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0)
            return r1
        L1c:
            long r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.h()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            androidx.appcompat.app.AppCompatActivity r0 = r9.m158354x19263085()
            boolean r6 = r0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13
            if (r6 == 0) goto L2e
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) r0
            goto L2f
        L2e:
            r0 = r2
        L2f:
            if (r0 == 0) goto L35
            r45.lm5 r2 = r0.g7()
        L35:
            if (r2 != 0) goto L3d
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] redDotData == null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0)
            return r1
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "[shouldShowSelectSkinEntryPlazaNewRedDot] version： "
            r0.<init>(r6)
            java.lang.String r6 = r2.f461156e
            r0.append(r6)
            java.lang.String r6 = ", type："
            r0.append(r6)
            int r6 = r2.f461155d
            r0.append(r6)
            java.lang.String r6 = " , is_show："
            r0.append(r6)
            boolean r6 = r2.f461158g
            r0.append(r6)
            java.lang.String r6 = " , currentTime："
            r0.append(r6)
            r0.append(r4)
            java.lang.String r6 = ",  invalidateTimes："
            r0.append(r6)
            long r6 = r2.f461160i
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            int r0 = r2.f461155d
            r6 = 1
            if (r0 == r6) goto L8f
            r7 = 2
            if (r0 == r7) goto L84
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] unknown type"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0)
            goto Lbf
        L84:
            long r7 = r2.f461160i
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto Lbf
            boolean r0 = r2.f461158g
            if (r0 == 0) goto Lbf
            goto Lbe
        L8f:
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r7 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_CLICKEDSKIN_INT_SYNC
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.m(r7, r8)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Int"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != r6) goto Lb4
            java.lang.String r0 = "[shouldShowSelectSkinEntryPlazaNewRedDot] user has clicked select skin entry, ignore show reddot"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0)
            return r1
        Lb4:
            long r7 = r2.f461160i
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto Lbf
            boolean r0 = r2.f461158g
            if (r0 == 0) goto Lbf
        Lbe:
            r1 = r6
        Lbf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[shouldShowSelectSkinEntryPlazaNewRedDot] shouldShow："
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ld.Y6():boolean");
    }

    public final boolean Z6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        if (m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) {
        }
        if (X6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewPrepareUIRedDotUIC", "[shouldShowSelectSkinNormalRedDot] shouldShowPersonalRedDot, return false");
            return false;
        }
        if (Y6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewPrepareUIRedDotUIC", "[shouldShowSelectSkinNormalRedDot] shouldShowSelectSkinEntryPlazaNewRedDot, return false");
            return false;
        }
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        return bk0.a.g().f(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_HOME_STRING_SYNC);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7() {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ld.a7():void");
    }
}

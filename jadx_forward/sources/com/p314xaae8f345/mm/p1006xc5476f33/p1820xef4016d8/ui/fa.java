package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class fa extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fa faVar, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        android.net.Uri.Builder buildUpon;
        android.net.Uri.Builder appendQueryParameter;
        android.net.Uri.Builder appendQueryParameter2;
        android.net.Uri.Builder buildUpon2;
        android.net.Uri.Builder appendQueryParameter3;
        android.net.Uri.Builder appendQueryParameter4;
        faVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doClickActionJumpText] action_type: " + i17);
        android.content.Intent intent = new android.content.Intent();
        gb3.m.f351559g = i17;
        if (i17 == 2) {
            intent.putExtra("Contact_User", str3);
            intent.putExtra("Contact_Scene", 238);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                android.net.Uri parse = android.net.Uri.parse(str2);
                java.lang.String valueOf = java.lang.String.valueOf((parse == null || (buildUpon = parse.buildUpon()) == null || (appendQueryParameter = buildUpon.appendQueryParameter("fromscene", "1")) == null || (appendQueryParameter2 = appendQueryParameter.appendQueryParameter("type", "1")) == null) ? null : appendQueryParameter2.build());
                intent.putExtra("biz_profile_enter_from_luck_money_spring_event_url", valueOf);
                gb3.m.f351561i = valueOf;
            }
            intent.putExtra("force_get_contact", true);
            j45.l.n(faVar.m80379x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, 2);
            gb3.m.a(86, activityC16371xf216ae6d != null ? activityC16371xf216ae6d.V2 : null);
            return;
        }
        if (i17 != 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "unknow type");
            return;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(10, 2, 32, intent);
        intent.putExtra("finder_username", str3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "same_receive_link is null");
        } else {
            android.net.Uri parse2 = android.net.Uri.parse(str2);
            java.lang.String valueOf2 = java.lang.String.valueOf((parse2 == null || (buildUpon2 = parse2.buildUpon()) == null || (appendQueryParameter3 = buildUpon2.appendQueryParameter("fromscene", "1")) == null || (appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("type", "2")) == null) ? null : appendQueryParameter4.build());
            intent.putExtra("key_same_receive_link", valueOf2);
            gb3.m.f351561i = valueOf2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "same_receive_link is ".concat(valueOf2));
        }
        intent.putExtra("key_packet_id", str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("redbag_scene", 1);
            jSONObject.put("coverid", str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "jump finder error, ", th6);
        }
        intent.putExtra("key_extra_info", jSONObject.toString());
        intent.putExtra("key_enter_profile_type", 52);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f542005a.w(faVar.m80379x76847179(), intent);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("red_cover_id", str);
            jSONObject2.put("finderusername", str3);
            jSONObject2.put("red_cover_type", 1);
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "jump finder error, ", th7);
        }
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).bj("red_cover_link", 1, jSONObject2, null);
        faVar.m80379x76847179().overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
        gb3.m.a(82, activityC16371xf216ae6d != null ? activityC16371xf216ae6d.V2 : null);
    }

    public final void P6(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        java.lang.String str5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d2;
        int i18;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doShowTopLinkArea] actionType：" + i17 + " , actionJumpText：" + str + " , appUsername：" + str2 + ", sameReceiveLink: " + str3 + " , packetId：" + str4);
        gb3.m.f351563k = i17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doShowTopLinkArea] actionJumpText is null ,return");
            android.view.View view = activityC16371xf216ae6d != null ? activityC16371xf216ae6d.mToplinkArea : null;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUIFunctionUIC", "doShowTopLinkArea", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUIFunctionUIC", "doShowTopLinkArea", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = activityC16371xf216ae6d != null ? activityC16371xf216ae6d.mToplinkArea : null;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUIFunctionUIC", "doShowTopLinkArea", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUIFunctionUIC", "doShowTopLinkArea", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            gb3.m.f351560h = 0;
            gb3.m.f351561i = "";
        } else {
            gb3.m.f351560h = 1;
        }
        if (activityC16371xf216ae6d != null && (textView4 = activityC16371xf216ae6d.B2) != null) {
            textView4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gki);
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.a0 a0Var = new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.aa(this, str4, str3, i17, str2, activityC16371xf216ae6d), true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(activityC16371xf216ae6d != null ? activityC16371xf216ae6d.f227773z2 : null, str, 0, str != null ? str.length() : 0, a0Var, m80379x76847179());
            activityC16371xf216ae6d2 = activityC16371xf216ae6d;
            str5 = "MicroMsg.LuckyMoneyNewDetailUIFunctionUIC";
            i18 = 0;
        } else {
            android.graphics.drawable.Drawable drawable = m158361x893a2f6f().getDrawable(com.p314xaae8f345.mm.R.raw.f80558xb4d9ec6d);
            if (drawable != null) {
                drawable.setColorFilter(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2z), android.graphics.PorterDuff.Mode.SRC_ATOP);
            }
            float q17 = i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (com.p314xaae8f345.mm.ui.bk.M(q17, i65.a.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) || com.p314xaae8f345.mm.ui.bk.M(q17, i65.a.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a))) {
                q17 = i65.a.t(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            }
            int a17 = (int) (com.p314xaae8f345.mm.ui.zk.a(m80379x76847179(), 16) * q17);
            if (drawable != null) {
                drawable.setBounds(0, 0, a17, a17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.k(drawable);
            java.lang.String str6 = str + "  " + m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.m4_);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str6);
            str5 = "MicroMsg.LuckyMoneyNewDetailUIFunctionUIC";
            com.p314xaae8f345.mm.p2802xd031a825.ui.a0 a0Var2 = new com.p314xaae8f345.mm.p2802xd031a825.ui.a0(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2z), m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ba(this, str4, str3, i17, str2, activityC16371xf216ae6d));
            if (str != null) {
                spannableStringBuilder.setSpan(a0Var, 0, str.length(), 17);
                spannableStringBuilder.setSpan(kVar, str.length() + 1, str.length() + 2, 17);
                spannableStringBuilder.setSpan(a0Var2, str.length() + 2, str6.length(), 18);
            }
            activityC16371xf216ae6d2 = activityC16371xf216ae6d;
            i18 = 0;
            if (activityC16371xf216ae6d2 != null && (textView3 = activityC16371xf216ae6d2.f227773z2) != null) {
                textView3.setClickable(true);
            }
            if (activityC16371xf216ae6d2 != null && (textView2 = activityC16371xf216ae6d2.f227773z2) != null) {
                textView2.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(m80379x76847179()));
            }
            if (activityC16371xf216ae6d2 != null && (textView = activityC16371xf216ae6d2.f227773z2) != null) {
                textView.setText(spannableStringBuilder);
            }
        }
        if (i17 == 2) {
            if (((activityC16371xf216ae6d2 == null || !activityC16371xf216ae6d2.f227721h) ? i18 : 1) == 0) {
                gb3.m.a(85, activityC16371xf216ae6d2 != null ? activityC16371xf216ae6d2.V2 : null);
                if (activityC16371xf216ae6d2 == null) {
                    return;
                }
                activityC16371xf216ae6d2.f227721h = true;
                return;
            }
            return;
        }
        if (i17 != 4) {
            return;
        }
        if (((activityC16371xf216ae6d2 == null || !activityC16371xf216ae6d2.f227718g) ? i18 : 1) == 0) {
            gb3.m.a(81, activityC16371xf216ae6d2 != null ? activityC16371xf216ae6d2.V2 : null);
            if (activityC16371xf216ae6d2 != null) {
                activityC16371xf216ae6d2.f227718g = true;
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("red_cover_id", str4);
            jSONObject.put("finderusername", str2);
            jSONObject.put("red_cover_type", 1);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str5, "jump finder error, ", th6);
        }
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).bj("red_cover_link", i18, jSONObject, null);
    }
}

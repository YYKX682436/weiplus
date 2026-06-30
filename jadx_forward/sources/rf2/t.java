package rf2;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a */
    public static final rf2.t f476423a = new rf2.t();

    public static void b(rf2.t tVar, java.lang.String tag, android.view.View beforePage, android.view.View afterPage, boolean z17, yz5.a aVar, yz5.a aVar2, int i17, java.lang.Object obj) {
        yz5.a aVar3 = (i17 & 16) != 0 ? null : aVar;
        yz5.a aVar4 = (i17 & 32) != 0 ? null : aVar2;
        tVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(beforePage, "beforePage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(afterPage, "afterPage");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "pageAnimate beforePage:" + beforePage + ", beforePage:" + beforePage + ", forward:" + z17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(beforePage, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryUtil", "pageAnimate", "(Ljava/lang/String;Landroid/view/View;Landroid/view/View;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        beforePage.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(beforePage, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryUtil", "pageAnimate", "(Ljava/lang/String;Landroid/view/View;Landroid/view/View;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(afterPage, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryUtil", "pageAnimate", "(Ljava/lang/String;Landroid/view/View;Landroid/view/View;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        afterPage.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(afterPage, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryUtil", "pageAnimate", "(Ljava/lang/String;Landroid/view/View;Landroid/view/View;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        float b17 = i65.a.b(afterPage.getContext(), 334);
        beforePage.animate().cancel();
        afterPage.animate().cancel();
        beforePage.animate().setListener(new rf2.r(aVar3));
        afterPage.animate().setListener(new rf2.s(aVar4));
        if (z17) {
            beforePage.setTranslationX(0.0f);
            beforePage.animate().translationX(0.0f - b17).setDuration(300L).start();
            afterPage.setTranslationX(b17);
            afterPage.animate().translationX(0.0f).setDuration(300L).start();
            return;
        }
        beforePage.setTranslationX(0.0f);
        beforePage.animate().translationX(b17).setDuration(300L).start();
        afterPage.setTranslationX(0.0f - b17);
        afterPage.animate().translationX(0.0f).setDuration(300L).start();
    }

    public static final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(str + str3 + str4);
        if (!(str3 == null || str3.length() == 0)) {
            int L = r26.n0.L(f0Var, str3, 0, false, 6, null);
            f0Var.c(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor(str2)), L, str3.length() + L, 33);
        }
        return f0Var;
    }

    public final java.lang.Integer a(r45.f02 lotteryInfo, r45.i02 i02Var, r45.i52 i52Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryInfo, "lotteryInfo");
        r45.fm4 fm4Var = lotteryInfo.f455413f;
        boolean z17 = false;
        if (fm4Var != null && fm4Var.f455981g == 1) {
            if (i02Var != null && i02Var.f458145d == 2) {
                z17 = true;
            }
            return java.lang.Integer.valueOf(z17 ? 2 : 1);
        }
        if (!(fm4Var != null && fm4Var.f455981g == 0)) {
            return null;
        }
        if (i52Var != null && i52Var.m75933x41a8a7f2(0)) {
            z17 = true;
        }
        return java.lang.Integer.valueOf(z17 ? 2 : 1);
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 c(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        try {
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(.*?)<_wc_custom_link_.+?color\\s*=\\s*[\"|']\\s*(.+?)\\s*[\"|']\\s*.*?>(.*?)</_wc_custom_link_>(.*?)").matcher(source);
            if (matcher.matches()) {
                java.lang.String group = matcher.group(1);
                java.lang.String group2 = matcher.group(2);
                java.lang.String group3 = matcher.group(3);
                java.lang.String group4 = matcher.group(4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("parseSponsorStr", "matcher2 prefix:" + group + ",color:" + group2 + ",highLightContent:" + group3 + ",postfix:" + group4 + '!');
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(group);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(group2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(group3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(group4);
                return d(group, group2, group3, group4);
            }
            java.util.regex.Matcher matcher2 = java.util.regex.Pattern.compile("(.*?)<_wc_custom_link_.+?color\\s*=\\s*[\"|']\\s*(.+?)\\s*[\"|']\\s*backgroundenabled\\s*=\\s*[\"|']\\s*(.*?)\\s*[\"|']\\s*.*?>(.*?)</_wc_custom_link_>(.*?)").matcher(source);
            if (!matcher2.matches()) {
                return new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(source);
            }
            java.lang.String group5 = matcher2.group(1);
            java.lang.String group6 = matcher2.group(2);
            java.lang.String group7 = matcher2.group(3);
            java.lang.String group8 = matcher2.group(4);
            java.lang.String group9 = matcher2.group(5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("parseSponsorStr", "matcher1 prefix:" + group5 + ",color:" + group6 + ",bgEnabled:" + group7 + ",highLightContent:" + group8 + ",postfix:" + group9 + '!');
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(group5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(group6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(group8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(group9);
            return d(group5, group6, group8, group9);
        } catch (java.lang.Exception e17) {
            java.lang.String message = e17.getMessage();
            if (message == null) {
                message = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("parseSponsorStr", message);
            return new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(source);
        }
    }

    public final void e(java.lang.String lotteryId, int i17, java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryId, "lotteryId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("lottery_id", lotteryId);
        if (str != null) {
            jSONObject.put("coupon_id", lotteryId);
        }
        if (str2 != null) {
            jSONObject.put("notice_id", str2);
        }
        if (num != null) {
            jSONObject.put("position_type", num.intValue());
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.Q1, jSONObject2, 0L, null, null, null, null, null, 252, null);
    }

    public final void g(int i17, java.lang.String productid, java.lang.String couponid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productid, "productid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(couponid, "couponid");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("commerceAction", i17);
        jSONObject.put("productid", productid);
        jSONObject.put("couponid", couponid);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f408797s, jSONObject2, 0L, null, null, null, null, null, 252, null);
    }
}

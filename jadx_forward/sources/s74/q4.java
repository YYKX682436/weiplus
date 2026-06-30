package s74;

/* loaded from: classes4.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    public static final s74.q4 f486046a = new s74.q4();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f486047b = jz5.h.b(s74.g4.f485851d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f486048c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f486049d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f486050e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f486051f;

    static {
        jz5.h.b(s74.b4.f485752d);
        f486048c = jz5.h.b(s74.c4.f485767d);
        f486049d = jz5.h.b(s74.e4.f485794d);
        f486050e = jz5.h.b(s74.d4.f485781d);
        f486051f = jz5.h.b(s74.f4.f485826d);
    }

    public final android.graphics.drawable.Drawable a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, android.content.Context context, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardBottomLogoIconResource", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        android.graphics.drawable.Drawable drawable = null;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardBottomLogoIconResource", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            return null;
        }
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardBottomLogoIconResource", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            return null;
        }
        int r17 = ca4.m0.r(c17933xe8d1b226, i17, i18);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            if (r17 == 1) {
                drawable = context.getDrawable(com.p314xaae8f345.mm.R.raw.f78387x4c84b600);
            } else if (r17 == 2) {
                drawable = context.getDrawable(com.p314xaae8f345.mm.R.raw.f81081xfe5e2f0c);
            } else if (r17 == 3) {
                drawable = context.getDrawable(com.p314xaae8f345.mm.R.raw.f78382xf93bbf8a);
            }
        } else if (r17 == 1) {
            drawable = context.getDrawable(com.p314xaae8f345.mm.R.raw.f78386xe177d375);
        } else if (r17 == 2) {
            drawable = context.getDrawable(com.p314xaae8f345.mm.R.raw.f81082x14d7d2cf);
        } else if (r17 == 3) {
            drawable = context.getDrawable(com.p314xaae8f345.mm.R.raw.f78383xd1c56b91);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardBottomLogoIconResource", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        return drawable;
    }

    public final java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, android.content.Context context, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardBottomLogoWording", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        java.lang.String str = null;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardBottomLogoWording", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            return null;
        }
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardBottomLogoWording", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = c17933xe8d1b226.m70346x10413e67();
        int r17 = ca4.m0.r(c17933xe8d1b226, i17, i18);
        if (m70346x10413e67 != null && m70346x10413e67.m70106x7ba4fd89() && !c17933xe8d1b226.m70417x6b0d56fa()) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j6j);
        } else if (r17 == 1) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j6j);
        } else if (r17 == 2) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m6o);
        } else if (r17 == 3) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.clc);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardBottomLogoWording", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        return str;
    }

    public final boolean c(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getColorEnable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.d5g);
        boolean booleanValue = tag instanceof java.lang.Boolean ? ((java.lang.Boolean) tag).booleanValue() : true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getColorEnable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        return booleanValue;
    }

    public final android.view.animation.Interpolator d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEaseIn", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        android.view.animation.Interpolator interpolator = (android.view.animation.Interpolator) ((jz5.n) f486048c).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEaseIn", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        return interpolator;
    }

    public final android.view.animation.Interpolator e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEaseInOut", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        android.view.animation.Interpolator interpolator = (android.view.animation.Interpolator) ((jz5.n) f486050e).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEaseInOut", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        return interpolator;
    }

    public final android.view.animation.Interpolator f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEaseOut", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        android.view.animation.Interpolator interpolator = (android.view.animation.Interpolator) ((jz5.n) f486049d).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEaseOut", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        return interpolator;
    }

    public final org.json.JSONObject g(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfoTag", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.d5h);
        org.json.JSONObject jSONObject = tag instanceof org.json.JSONObject ? (org.json.JSONObject) tag : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfoTag", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        return jSONObject;
    }

    public final android.view.animation.Interpolator h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLinear", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        android.view.animation.Interpolator interpolator = (android.view.animation.Interpolator) ((jz5.n) f486047b).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLinear", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        return interpolator;
    }

    public final jz5.l i(i64.q qVar, java.lang.CharSequence charSequence, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRealValueByKey", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        java.lang.String t17 = r26.i0.t(r26.i0.v(c17903x3b438f4.f38256xfef403e4 + '.' + ((java.lang.Object) charSequence), "[", "", false, 4, null), "]", "", false);
        if (c17903x3b438f4.f38257x4d212eed.containsKey(t17)) {
            jz5.l lVar = new jz5.l(java.lang.Boolean.TRUE, c17903x3b438f4.f38257x4d212eed.get(t17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealValueByKey", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            return lVar;
        }
        if (!r26.n0.j0(charSequence, "${", false, 2, null) || !r26.n0.F(charSequence, "}", false, 2, null) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(charSequence.subSequence(2, charSequence.length() - 1), "TimelineObject.contentDesc")) {
            jz5.l lVar2 = new jz5.l(java.lang.Boolean.FALSE, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealValueByKey", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            return lVar2;
        }
        java.lang.String str = qVar.f370822c.f39013x4c306a8a;
        jz5.l lVar3 = new jz5.l(java.lang.Boolean.valueOf(!r26.n0.N(r4)), str != null ? str : "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRealValueByKey", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        return lVar3;
    }

    public final int j(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScreenWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScreenWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            return 0;
        }
        java.lang.Object systemService = context.getSystemService("window");
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScreenWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            return 0;
        }
        int min = java.lang.Math.min(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScreenWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        return min;
    }

    public final boolean k(s74.a1 a1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCustomRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        boolean z17 = a1Var.a().optBoolean("repeat") && a1Var.a().optInt("repeat-interval") != 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCustomRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        return z17;
    }

    public final void l(java.util.Map alphaAnimation, s74.a1 info) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processAlphaAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alphaAnimation, "alphaAnimation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.Utils", "processAlphaAnimation, animateId=" + info.a().optString("animationId") + " info.view=" + info.c() + ", info=" + info);
        org.json.JSONObject jSONObject = (org.json.JSONObject) alphaAnimation.get("alpha");
        double optDouble = jSONObject != null ? jSONObject.optDouble("from", 0.0d) : 0.0d;
        org.json.JSONObject jSONObject2 = (org.json.JSONObject) alphaAnimation.get("alpha");
        double optDouble2 = jSONObject2 != null ? jSONObject2.optDouble("to", 0.0d) : 0.0d;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 100.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ofFloat);
        u(ofFloat, info);
        ofFloat.addUpdateListener(new s74.h4(optDouble, optDouble2, info.c()));
        if (k(info)) {
            o(ofFloat, info);
        } else {
            ((java.util.ArrayList) info.b()).add(ofFloat);
            ofFloat.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processAlphaAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
    }

    public final void m(org.json.JSONObject obj, android.graphics.drawable.StateListDrawable bg6) {
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processBgColor", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bg6, "bg");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj.optString("is-normal-style"), "true") && (context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) != null) {
            bg6.addState(new int[]{android.R.attr.state_selected}, context.getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
        }
        s74.u3 u3Var = s74.u3.f486095a;
        int u17 = u3Var.u(obj, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShapeDrawable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(u17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShapeDrawable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        org.json.JSONObject optJSONObject = obj.optJSONObject("hover");
        if (optJSONObject != null) {
            int u18 = u3Var.u(optJSONObject, u17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShapeDrawable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            android.graphics.drawable.ColorDrawable colorDrawable2 = new android.graphics.drawable.ColorDrawable(u18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShapeDrawable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            bg6.addState(new int[]{android.R.attr.state_pressed}, colorDrawable2);
        }
        org.json.JSONObject optJSONObject2 = obj.optJSONObject("disabled");
        if (optJSONObject2 != null) {
            int u19 = u3Var.u(optJSONObject2, u17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShapeDrawable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            android.graphics.drawable.ColorDrawable colorDrawable3 = new android.graphics.drawable.ColorDrawable(u19);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShapeDrawable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            bg6.addState(new int[]{-16842910}, colorDrawable3);
        }
        bg6.addState(new int[0], colorDrawable);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processBgColor", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
    }

    public final void n(java.util.Map colorAnims, s74.a1 info) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        org.json.JSONObject optJSONObject3;
        org.json.JSONObject optJSONObject4;
        org.json.JSONObject optJSONObject5;
        org.json.JSONObject optJSONObject6;
        org.json.JSONObject optJSONObject7;
        org.json.JSONObject optJSONObject8;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processColorAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colorAnims, "colorAnims");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        s74.u3 u3Var = s74.u3.f486095a;
        int y17 = u3Var.y(info.d(), -1);
        org.json.JSONObject optJSONObject9 = info.d().optJSONObject("hover");
        int y18 = optJSONObject9 != null ? u3Var.y(optJSONObject9, y17) : y17;
        org.json.JSONObject optJSONObject10 = info.d().optJSONObject("disabled");
        int y19 = optJSONObject10 != null ? u3Var.y(optJSONObject10, y17) : y17;
        int u17 = u3Var.u(info.d(), -1);
        org.json.JSONObject optJSONObject11 = info.d().optJSONObject("hover");
        int u18 = optJSONObject11 != null ? u3Var.u(optJSONObject11, u17) : u17;
        org.json.JSONObject optJSONObject12 = info.d().optJSONObject("disabled");
        int u19 = optJSONObject12 != null ? u3Var.u(optJSONObject12, u17) : u17;
        org.json.JSONObject jSONObject = (org.json.JSONObject) colorAnims.get("color");
        int v17 = (jSONObject == null || (optJSONObject8 = jSONObject.optJSONObject("from")) == null) ? y17 : u3Var.v(optJSONObject8, "color", y17);
        org.json.JSONObject jSONObject2 = (org.json.JSONObject) colorAnims.get("color");
        if (jSONObject2 != null && (optJSONObject7 = jSONObject2.optJSONObject("to")) != null) {
            y17 = u3Var.v(optJSONObject7, "color", y17);
        }
        int i17 = y17;
        org.json.JSONObject jSONObject3 = (org.json.JSONObject) colorAnims.get("hover-color");
        int v18 = (jSONObject3 == null || (optJSONObject6 = jSONObject3.optJSONObject("from")) == null) ? y18 : u3Var.v(optJSONObject6, "color", y18);
        org.json.JSONObject jSONObject4 = (org.json.JSONObject) colorAnims.get("hover-color");
        int v19 = (jSONObject4 == null || (optJSONObject5 = jSONObject4.optJSONObject("to")) == null) ? y18 : u3Var.v(optJSONObject5, "color", y18);
        org.json.JSONObject jSONObject5 = (org.json.JSONObject) colorAnims.get("background-color");
        int v27 = (jSONObject5 == null || (optJSONObject4 = jSONObject5.optJSONObject("from")) == null) ? u17 : u3Var.v(optJSONObject4, "color", u17);
        org.json.JSONObject jSONObject6 = (org.json.JSONObject) colorAnims.get("background-color");
        int v28 = (jSONObject6 == null || (optJSONObject3 = jSONObject6.optJSONObject("to")) == null) ? u17 : u3Var.v(optJSONObject3, "color", u17);
        org.json.JSONObject jSONObject7 = (org.json.JSONObject) colorAnims.get("hover-background-color");
        int v29 = (jSONObject7 == null || (optJSONObject2 = jSONObject7.optJSONObject("from")) == null) ? u18 : u3Var.v(optJSONObject2, "color", u18);
        org.json.JSONObject jSONObject8 = (org.json.JSONObject) colorAnims.get("hover-background-color");
        int v37 = (jSONObject8 == null || (optJSONObject = jSONObject8.optJSONObject("to")) == null) ? u18 : u3Var.v(optJSONObject, "color", u18);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 100.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ofFloat);
        u(ofFloat, info);
        ofFloat.addUpdateListener(new s74.i4(info.c(), y19, u19, colorAnims, v17, i17, v18, v19, v27, v28, v29, v37));
        ((java.util.ArrayList) info.b()).add(ofFloat);
        ofFloat.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processColorAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
    }

    public final void o(android.animation.Animator animator, s74.a1 a1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processCustomRepeatAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.Utils", "processCustomRepeatAnimation, animationID:" + a1Var.a().optString("animationId"));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 0.0f);
        ofFloat.setDuration(a1Var.a().optLong("common-start-delay"));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 0.0f);
        ofFloat2.setDuration(a1Var.a().optLong("repeat-interval"));
        animator.addListener(new s74.j4(a1Var));
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(animator, ofFloat2);
        animatorSet.addListener(new s74.l4(f0Var, a1Var, new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), animatorSet, animator));
        ofFloat.addListener(new s74.k4(animatorSet));
        ((java.util.ArrayList) a1Var.b()).add(ofFloat);
        ((java.util.ArrayList) a1Var.b()).add(animatorSet);
        ofFloat.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processCustomRepeatAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
    }

    public final void p(java.util.Map rotateAnimation, s74.a1 info) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processRotateAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rotateAnimation, "rotateAnimation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        org.json.JSONObject jSONObject = (org.json.JSONObject) rotateAnimation.get("rotatex");
        double optDouble = jSONObject != null ? jSONObject.optDouble("from", 0.0d) : 0.0d;
        org.json.JSONObject jSONObject2 = (org.json.JSONObject) rotateAnimation.get("rotatex");
        double optDouble2 = jSONObject2 != null ? jSONObject2.optDouble("to", 0.0d) : 0.0d;
        org.json.JSONObject jSONObject3 = (org.json.JSONObject) rotateAnimation.get("rotatey");
        double optDouble3 = jSONObject3 != null ? jSONObject3.optDouble("from", 0.0d) : 0.0d;
        org.json.JSONObject jSONObject4 = (org.json.JSONObject) rotateAnimation.get("rotatey");
        double optDouble4 = jSONObject4 != null ? jSONObject4.optDouble("to", 0.0d) : 0.0d;
        org.json.JSONObject jSONObject5 = (org.json.JSONObject) rotateAnimation.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2);
        double optDouble5 = jSONObject5 != null ? jSONObject5.optDouble("from", 0.0d) : 0.0d;
        org.json.JSONObject jSONObject6 = (org.json.JSONObject) rotateAnimation.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2);
        double optDouble6 = jSONObject6 != null ? jSONObject6.optDouble("to", 0.0d) : 0.0d;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 100.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ofFloat);
        u(ofFloat, info);
        ofFloat.addUpdateListener(new s74.m4(info.c(), optDouble, optDouble2, optDouble3, optDouble4, optDouble5, optDouble6));
        if (k(info)) {
            o(ofFloat, info);
        } else {
            ((java.util.ArrayList) info.b()).add(ofFloat);
            ofFloat.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processRotateAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
    }

    public final void q(java.util.Map scaleAnimation, s74.a1 info) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processScaleAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scaleAnimation, "scaleAnimation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        org.json.JSONObject jSONObject = (org.json.JSONObject) scaleAnimation.get("scalex");
        double optDouble = jSONObject != null ? jSONObject.optDouble("from", 1.0d) : 1.0d;
        org.json.JSONObject jSONObject2 = (org.json.JSONObject) scaleAnimation.get("scalex");
        double optDouble2 = jSONObject2 != null ? jSONObject2.optDouble("to", 1.0d) : 1.0d;
        org.json.JSONObject jSONObject3 = (org.json.JSONObject) scaleAnimation.get("scaley");
        double optDouble3 = jSONObject3 != null ? jSONObject3.optDouble("from", 1.0d) : 1.0d;
        org.json.JSONObject jSONObject4 = (org.json.JSONObject) scaleAnimation.get("scaley");
        double optDouble4 = jSONObject4 != null ? jSONObject4.optDouble("to", 1.0d) : 1.0d;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 100.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ofFloat);
        u(ofFloat, info);
        ofFloat.addUpdateListener(new s74.n4(info.c(), optDouble, optDouble2, optDouble3, optDouble4));
        if (k(info)) {
            o(ofFloat, info);
        } else {
            ((java.util.ArrayList) info.b()).add(ofFloat);
            ofFloat.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processScaleAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
    }

    public final android.content.res.ColorStateList r(org.json.JSONObject obj, int i17) {
        android.content.res.ColorStateList colorStateList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processTextColor", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        org.json.JSONObject optJSONObject = obj.optJSONObject("hover");
        org.json.JSONObject optJSONObject2 = obj.optJSONObject("disabled");
        if (optJSONObject == null || optJSONObject2 == null) {
            colorStateList = optJSONObject != null ? new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{s74.u3.f486095a.y(optJSONObject, i17), i17}) : optJSONObject2 != null ? new android.content.res.ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{s74.u3.f486095a.y(optJSONObject2, i17), i17}) : new android.content.res.ColorStateList(new int[][]{new int[0]}, new int[]{i17});
        } else {
            int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[]{-16842910}, new int[0]};
            s74.u3 u3Var = s74.u3.f486095a;
            colorStateList = new android.content.res.ColorStateList(iArr, new int[]{u3Var.y(optJSONObject, i17), u3Var.y(optJSONObject2, i17), i17});
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processTextColor", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        return colorStateList;
    }

    public final void s(java.util.Map transAnims, s74.a1 info, s74.f3 f3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processTransAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transAnims, "transAnims");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (f3Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processTransAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            return;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) transAnims.get("translatex");
        float q17 = jSONObject != null ? s74.u3.f486095a.q(jSONObject, "from", 0.0f, f3Var) : 0.0f;
        org.json.JSONObject jSONObject2 = (org.json.JSONObject) transAnims.get("translatex");
        float q18 = jSONObject2 != null ? s74.u3.f486095a.q(jSONObject2, "to", 0.0f, f3Var) : 0.0f;
        org.json.JSONObject jSONObject3 = (org.json.JSONObject) transAnims.get("translatey");
        float q19 = jSONObject3 != null ? s74.u3.f486095a.q(jSONObject3, "from", 0.0f, f3Var) : 0.0f;
        org.json.JSONObject jSONObject4 = (org.json.JSONObject) transAnims.get("translatey");
        float q27 = jSONObject4 != null ? s74.u3.f486095a.q(jSONObject4, "to", 0.0f, f3Var) : 0.0f;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 100.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ofFloat);
        u(ofFloat, info);
        ofFloat.addUpdateListener(new s74.o4(info.c(), q17, q18, q19, q27));
        if (k(info)) {
            o(ofFloat, info);
        } else {
            ((java.util.ArrayList) info.b()).add(ofFloat);
            ofFloat.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processTransAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
    }

    public final void t(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setColorEnable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        if (z17 != c(view)) {
            view.setTag(com.p314xaae8f345.mm.R.id.d5g, java.lang.Boolean.valueOf(z17));
            org.json.JSONObject g17 = g(view);
            if (g17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setColorEnable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
                return;
            }
            s74.u3 u3Var = s74.u3.f486095a;
            int y17 = u3Var.y(g17, -1);
            if (z17) {
                if (view instanceof android.widget.TextView) {
                    ((android.widget.TextView) view).setTextColor(r(g17, y17));
                }
                android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
                if (g17.has("background-color")) {
                    m(g17, stateListDrawable);
                }
                view.setBackground(stateListDrawable);
            } else {
                org.json.JSONObject optJSONObject = g17.optJSONObject("disabled");
                if (optJSONObject != null) {
                    y17 = u3Var.y(optJSONObject, y17);
                }
                int u17 = u3Var.u(g17, -1);
                org.json.JSONObject optJSONObject2 = g17.optJSONObject("disabled");
                if (optJSONObject2 != null) {
                    u17 = u3Var.u(optJSONObject2, u17);
                }
                if (view instanceof android.widget.TextView) {
                    ((android.widget.TextView) view).setTextColor(y17);
                }
                view.setBackground(new android.graphics.drawable.ColorDrawable(u17));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setColorEnable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void u(android.animation.ValueAnimator valueAnimator, s74.a1 a1Var) {
        android.view.animation.Interpolator h17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCommonAnimConfig", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        if (!k(a1Var)) {
            valueAnimator.setStartDelay(a1Var.a().optLong("common-start-delay"));
            valueAnimator.setRepeatCount(a1Var.a().optInt("common-repeat-count"));
        }
        valueAnimator.setDuration(a1Var.a().optLong("common-duration"));
        java.lang.String optString = a1Var.a().optString("common-interpolator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toCommonInterpolator", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        switch (optString.hashCode()) {
            case -1965087616:
                if (optString.equals("easeOut")) {
                    h17 = f();
                    break;
                }
                h17 = h();
                break;
            case -1310316109:
                if (optString.equals("easeIn")) {
                    h17 = d();
                    break;
                }
                h17 = h();
                break;
            case -1102672091:
                if (optString.equals("linear")) {
                    h17 = h();
                    break;
                }
                h17 = h();
                break;
            case 1330629787:
                if (optString.equals("easeInOut")) {
                    h17 = e();
                    break;
                }
                h17 = h();
                break;
            default:
                h17 = h();
                break;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toCommonInterpolator", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        valueAnimator.setInterpolator(h17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCommonAnimConfig", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
    }

    public final void v(android.view.View view, org.json.JSONObject obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInfoTag", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        view.setTag(com.p314xaae8f345.mm.R.id.d5h, obj);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInfoTag", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String w(i64.q qVar, java.lang.String value) {
        kz5.p0 p0Var;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryGetRefValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4 = qVar.f370821b;
        if (c17903x3b438f4.f38257x4d212eed == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryGetRefValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            return null;
        }
        java.lang.String obj = r26.n0.u0(value).toString();
        if (r26.i0.A(obj, "$getValue('", false, 2, null) && r26.i0.n(obj, "')", false)) {
            s74.u3 u3Var = s74.u3.f486095a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPREFIX_LENGTH_OF_GET_VALUE", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPREFIX_LENGTH_OF_GET_VALUE", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            java.lang.CharSequence subSequence = obj.subSequence(11, obj.length() - 2);
            java.util.Objects.toString(subSequence);
            java.lang.String str2 = (java.lang.String) i(qVar, subSequence, c17903x3b438f4).f384367e;
            str = str2 != null ? str2 : "";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryGetRefValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            return str;
        }
        if (!r26.i0.y(obj, "$getFirstNotBlankValue(", false) || !r26.i0.n(obj, ")", false)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryGetRefValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            return null;
        }
        java.lang.CharSequence subSequence2 = obj.subSequence(23, obj.length() - 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getParamsInString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        int i18 = 0;
        while (i17 < subSequence2.length()) {
            int i19 = i18 + 1;
            if (subSequence2.charAt(i17) == '\'') {
                arrayList.add(java.lang.Integer.valueOf(i18));
            }
            i17++;
            i18 = i19;
        }
        if (arrayList.size() % 2 == 1 || arrayList.size() < 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.Utils", "error! in read quote! " + ((java.lang.Object) subSequence2));
            kz5.p0 p0Var2 = kz5.p0.f395529d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getParamsInString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            p0Var = p0Var2;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            e06.i l17 = e06.p.l(e06.p.m(0, arrayList.size()), 2);
            int i27 = l17.f327742d;
            int i28 = l17.f327743e;
            int i29 = l17.f327744f;
            if ((i29 > 0 && i27 <= i28) || (i29 < 0 && i28 <= i27)) {
                while (true) {
                    arrayList2.add(subSequence2.subSequence(((java.lang.Number) arrayList.get(i27)).intValue() + 1, ((java.lang.Number) arrayList.get(i27 + 1)).intValue()).toString());
                    if (i27 == i28) {
                        break;
                    }
                    i27 += i29;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getParamsInString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            p0Var = arrayList2;
        }
        java.util.Iterator<E> it = p0Var.iterator();
        java.lang.Object obj2 = "";
        while (it.hasNext()) {
            jz5.l i37 = f486046a.i(qVar, (java.lang.String) it.next(), c17903x3b438f4);
            java.lang.Object obj3 = i37.f384366d;
            if (((java.lang.Boolean) obj3).booleanValue()) {
                obj2 = i37.f384367e;
            }
            if (((java.lang.Boolean) obj3).booleanValue()) {
                break;
            }
        }
        java.lang.String str3 = (java.lang.String) obj2;
        str = str3 != null ? str3 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryGetRefValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        return str;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public abstract class m5 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f226985a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static int f226986b = Integer.MAX_VALUE;

    static {
        new jt0.i(10, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.class);
    }

    public static void A(android.view.View view) {
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.4f, 0.98f, 0.4f, 0.98f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setInterpolator(new android.view.animation.OvershootInterpolator());
        scaleAnimation.setFillAfter(true);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(0.98f, 1.0f, 0.98f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(50L);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.j5());
        if (view != null) {
            view.startAnimation(scaleAnimation);
        }
    }

    public static void B(android.view.View view, android.view.animation.Animation.AnimationListener animationListener) {
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 0.96f, 0.0f, 0.96f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setInterpolator(new android.view.animation.OvershootInterpolator());
        scaleAnimation.setFillAfter(true);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(0.96f, 1.0f, 0.96f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(100L);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k5(view, scaleAnimation2));
        if (animationListener != null) {
            scaleAnimation2.setAnimationListener(animationListener);
        }
        if (view != null) {
            view.startAnimation(scaleAnimation);
        }
    }

    public static boolean C(java.lang.String str, java.lang.String str2, int i17) {
        ot0.q qVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            sb6.append(", ");
            if (str2 == null) {
                str2 = "";
            }
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyUtil", sb6.toString());
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.d1(str);
        f9Var.r1(2);
        f9Var.u1(str2);
        f9Var.e1(c01.w9.o(str2));
        f9Var.j1(1);
        if (i17 == 3) {
            f9Var.m124850x7650bebc(469762097);
        } else {
            f9Var.m124850x7650bebc(436207665);
        }
        long M9 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
        if (M9 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyUtil", fp.k.c() + "insert msg failed :" + M9);
            return false;
        }
        if (f9Var.k2()) {
            v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
            int a17 = ot0.u.a(f9Var);
            ((u90.a) vVar).getClass();
            com.p314xaae8f345.mm.p959x883644fd.e.f153038a.a(f9Var, a17);
        } else {
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
            com.p314xaae8f345.mm.p959x883644fd.e.f153038a.b(f9Var);
        }
        f9Var.m124849x5361953a(M9);
        ot0.t tVar = new ot0.t();
        tVar.f67771x4b6e9352 = f9Var.j();
        if (str != null) {
            qVar = ot0.q.v(f9Var.U1());
            if (qVar != null) {
                tVar.f67769x29dd02d3 = qVar.f430187f;
                tVar.f67764x4f4dc37 = qVar.f430191g;
            }
        } else {
            qVar = null;
        }
        tVar.f67770x2262335f = 2001;
        tVar.f67765x297eb4f7 = M9;
        tVar.f67767x436b2035 = f9Var.Q0();
        tVar.f67766xd09be28e = f9Var.I0();
        if (qVar != null && qVar.f430199i == 2001 && qVar.f430167J == 1) {
            if (android.text.TextUtils.isEmpty(qVar.f430249u1) || android.text.TextUtils.isEmpty(qVar.f430253v1) || qVar.f430257w1 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyUtil", "ljd:sendLocalMsg() this is new year msg! don't send predownload image event, because image preload data is illegal!");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyUtil", "ljd:sendLocalMsg() this is new year msg! send predownload image event!");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5222x5561c4c3 c5222x5561c4c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5222x5561c4c3();
                am.m1 m1Var = new am.m1();
                c5222x5561c4c3.f135555g = m1Var;
                m1Var.f88823b = qVar.f430253v1;
                m1Var.f88822a = qVar.f430249u1;
                m1Var.f88824c = qVar.f430257w1;
                c5222x5561c4c3.e();
            }
        }
        ot0.t y07 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).y0(str2, M9);
        if (y07 != null && y07.f67765x297eb4f7 == M9) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).L0(tVar, new java.lang.String[0]);
        } else if (!((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).D0(tVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyUtil", "PinOpenApi.getAppMessageStorage().insert msg failed id:" + M9);
        }
        if (qVar != null) {
            java.lang.String str3 = qVar.f430237r1;
            if (!(str3 == null || str3.length() == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyUtilNew", "[sendLocalMsg] add local item : %s", qVar.f430237r1);
                java.lang.String str4 = qVar.f430237r1;
                android.net.Uri parse = android.net.Uri.parse(str4 != null ? str4 : "");
                if (parse != null) {
                    try {
                        java.lang.String queryParameter = parse.getQueryParameter("sendid");
                        at4.k1 k1Var = new at4.k1();
                        k1Var.f66558xf7c5f050 = qVar.f430237r1;
                        k1Var.f66562xd3086e30 = 0;
                        k1Var.f66557x32fdc97f = qVar.M0;
                        k1Var.f66565xfd3491a = f9Var.Q0();
                        k1Var.f66564xfd345a8 = queryParameter;
                        k1Var.f66559x9a279b8a = f9Var.m124847x74d37ac6();
                        k1Var.f66556xfcd83239 = -1;
                        ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().mo11260x413cb2b4(k1Var);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyUtilNew", "[sendLocalMsg] parse url  error! %s", e17.getMessage());
                    }
                }
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyUtilNew", "[sendLocalMsg] msg、content or native is null");
        return true;
    }

    public static void D(android.widget.TextView textView) {
        textView.setShadowLayer(8.0f, 0.0f, 0.0f, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560251f9));
    }

    public static void E(android.content.Context context, android.widget.TextView textView, java.lang.String str) {
        if (textView == null) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
    }

    public static android.app.Dialog F(android.content.Context context, boolean z17) {
        return db5.e1.O(context, null, 3, com.p314xaae8f345.mm.R.C30868x68b1db1.f575789i6, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, z17, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l5());
    }

    public static void G(android.widget.ImageView imageView, int i17) {
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563037uw);
        android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) imageView.getDrawable();
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }

    public static void H(android.widget.ImageView imageView) {
        android.graphics.drawable.AnimationDrawable animationDrawable;
        if (imageView == null || !(imageView.getDrawable() instanceof android.graphics.drawable.AnimationDrawable) || (animationDrawable = (android.graphics.drawable.AnimationDrawable) imageView.getDrawable()) == null) {
            return;
        }
        animationDrawable.stop();
    }

    public static void a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_VERSIONSV2_STRING_SYNC;
        java.lang.String str2 = (java.lang.String) c17.m(u3Var, null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str = str2 + "," + str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyUtil", "add reddot version, final version is %s", str);
        gm0.j1.u().c().x(u3Var, str);
    }

    public static void b(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2) {
        if (imageView == null) {
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, str2, 0.1f);
            return;
        }
        gk0.k kVar = new gk0.k(i65.a.h(imageView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.aly), i65.a.h(imageView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.alx));
        kVar.f353967e = com.p314xaae8f345.mm.R.C30861xcebc809e.bhm;
        kVar.f353966d = 0.1f;
        ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).wi(imageView, str, kVar);
    }

    public static java.lang.Boolean c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyUtil", "target version is null");
            return java.lang.Boolean.FALSE;
        }
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_VERSIONSV2_STRING_SYNC, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.String[] split = str2.split(",");
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str3 : split) {
            hashSet.add(str3);
        }
        if (hashSet.contains(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyUtil", "target version exist %s", str);
            return java.lang.Boolean.TRUE;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyUtil", "target version not exist %s", str);
        return java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(android.app.Activity r13, int r14, java.lang.String r15, com.p314xaae8f345.mm.p944x882e457a.m1 r16, android.os.Bundle r17, boolean r18, android.content.DialogInterface.OnClickListener r19, com.p314xaae8f345.mm.p2802xd031a825.g r20, int r21) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.d(android.app.Activity, int, java.lang.String, com.tencent.mm.modelbase.m1, android.os.Bundle, boolean, android.content.DialogInterface$OnClickListener, com.tencent.mm.wallet_core.g, int):boolean");
    }

    public static void e(r45.lm5 lm5Var) {
        java.lang.String str;
        try {
            str = new java.lang.String(lm5Var.mo14344x5f01b1f6(), java.nio.charset.StandardCharsets.ISO_8859_1);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuckyMoneyUtil", e17, "[finalSaveSelectSkinEntryLocalRedDotInfo] save reddot local data fail", new java.lang.Object[0]);
            str = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_INFOV2_STRING_SYNC, str);
    }

    public static java.lang.String f(android.content.Context context, long j17) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        if (j17 < 3600000) {
            return "";
        }
        long timeInMillis = j17 - new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5)).getTimeInMillis();
        if (timeInMillis > 0 && timeInMillis <= 86400000) {
            return new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date(j17));
        }
        android.text.format.Time time = new android.text.format.Time();
        time.set(j17);
        return k35.s.a(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573671fc5, " "), time).toString();
    }

    public static java.lang.String g(r45.lm5 lm5Var) {
        java.lang.String str;
        if (lm5Var == null) {
            return "";
        }
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        f17.getClass();
        char c17 = 65535;
        switch (f17.hashCode()) {
            case 115861276:
                if (f17.equals("zh_CN")) {
                    c17 = 0;
                    break;
                }
                break;
            case 115861428:
                if (f17.equals("zh_HK")) {
                    c17 = 1;
                    break;
                }
                break;
            case 115861812:
                if (f17.equals("zh_TW")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                str = lm5Var.f461165q;
                break;
            case 1:
                str = lm5Var.f461166r;
                break;
            case 2:
                str = lm5Var.f461167s;
                break;
            default:
                str = lm5Var.f461168t;
                break;
        }
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str : "";
    }

    public static long h() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return c01.id.a();
    }

    public static int i(android.content.Context context) {
        if (f226986b == Integer.MAX_VALUE) {
            f226986b = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560873wv);
        }
        return f226986b;
    }

    public static java.lang.String j(java.lang.String str) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str);
        if (n07 != null) {
            return n07.d();
        }
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || !n17.d1().equals(str) || n17.H == 4) {
            return null;
        }
        gm0.j1.i();
        byte[] s17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().s(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(s17)) {
            return null;
        }
        try {
            return ((r45.tn4) new r45.tn4().mo11468x92b714fd(s17)).U;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyUtil", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }

    public static long k(java.lang.String str) {
        long longValue;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.class) {
            try {
                try {
                    longValue = ((java.lang.Long) f226985a.get(str)).longValue();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuckyMoneyUtil", e17, "", new java.lang.Object[0]);
                    return -1L;
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        return longValue;
    }

    public static java.lang.String l() {
        gm0.j1.i();
        return (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SELFINFO_SMALLIMGURL_STRING, null);
    }

    public static java.lang.String m(java.lang.String str) {
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || !n17.d1().equals(str)) {
            return null;
        }
        return n17.P0();
    }

    public static r45.lm5 n() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_INFOV2_STRING_SYNC, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyUtil", "config str is null");
            return null;
        }
        r45.lm5 lm5Var = new r45.lm5();
        try {
            lm5Var.mo11468x92b714fd(str.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
            return lm5Var;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuckyMoneyUtil", e17, "parse RedPacketCoverRedDotLocalData fail", new java.lang.Object[0]);
            return null;
        }
    }

    public static void o(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17, int i18, int i19, boolean z17) {
        if (i18 != 0 || i19 <= 1) {
            p(abstractActivityC21394xb3d2c0cf, i17, z17);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16408x90cd2820.class);
        intent.putExtra("key_friends_num", i19);
        if (z17) {
            intent.putExtra("scene_from", 5);
        }
        abstractActivityC21394xb3d2c0cf.startActivityForResult(intent, i17);
    }

    public static void p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17, boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("select_is_ret", true);
        intent.putExtra("Select_Conv_Type", 3);
        if (z17) {
            intent.putExtra("scene_from", 5);
        }
        j45.l.v(abstractActivityC21394xb3d2c0cf, ".ui.transmit.SelectConversationUI", intent, i17);
    }

    public static void q(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.j1(0);
        f9Var.u1(str2);
        f9Var.r1(3);
        f9Var.d1(str);
        f9Var.e1(c01.w9.m(str2, c01.id.c() / 1000));
        f9Var.m124850x7650bebc(10000);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
    }

    public static boolean r(int i17) {
        return i17 == 2;
    }

    public static boolean s() {
        return ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue() == 8;
    }

    public static boolean t(int i17) {
        java.util.Set set = c01.e2.f118650a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorageLogic", "union luckymoney logic：isOpenImIncludeAssociateRoomOrOpenIMUser sceneid :%s ", java.lang.Integer.valueOf(i17));
        if (i17 == 1005) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorageLogic", "union luckymoney logic：use union luckymoney ");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactStorageLogic", "union luckymoney logic：use normal luckymoney ");
        return false;
    }

    public static void u(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyUtil", "load url: %s", str);
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        o11.f fVar = new o11.f();
        fVar.f423616g = hb3.o.Ni().Zi();
        fVar.f423611b = true;
        fVar.f423628s = true;
        fVar.f423629t = z17;
        if (z17) {
            fVar.f423630u = 0.0f;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            fVar.f423614e = false;
        } else {
            fVar.f423617h = str2;
            fVar.f423614e = true;
        }
        n11.a.b().h(str, imageView, fVar.a());
    }

    public static boolean v() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_busi_luckymoney_normal_new_style_open_config, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyUtil", "openNewStyleConfig：%s ", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public static boolean w() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_atmosphere_dynamic_cover_close_switch, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyUtil", "needCloseLuckyMoneyAtmosphereDynamicConfigCover：%s ", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public static boolean x() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_atmosphere_dynamic_detail_close_switch, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyUtil", "needCloseLuckyMoneyAtmosphereDynamicConfigDetail：%s ", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public static boolean y() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_lucky_money_dynamic_cover_close_switch, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyUtil", "needCloseLuckyMoneyDynamicConfigCover：%s ", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public static boolean z() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_lucky_money_dynamic_prepare_close_switch, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyUtil", "needCloseLuckyMoneyDynamicConfigPrepare：%s ", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }
}

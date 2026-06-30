package ml2;

/* loaded from: classes10.dex */
public final class t5 {

    /* renamed from: a, reason: collision with root package name */
    public static final ml2.t5 f409553a = new ml2.t5();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f409554b = jz5.h.b(ml2.s5.f409460d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f409555c = kz5.z.D0(new java.lang.Integer[]{java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46346xb4fc09c3), java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46343x70084f38), java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46341xab0a58f8), -2304, java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46345x1d573c4a), java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46342xe68c82cd), java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46347x98b201af)});

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f409556d = kz5.z.D0(new java.lang.Integer[]{2101, 2102, java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46375x82913de9), java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46376xfac9e348), 2105, 2106, java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46381x45d28eac), 2108, 3001, 3002, 3003, 3005});

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f409557e = jz5.h.b(ml2.q5.f409392d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f409558f = jz5.h.b(ml2.r5.f409447d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f409559g = jz5.h.b(ml2.p5.f409343d);

    public final void a(long j17, java.lang.String nickname, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDisconnect_");
        int i18 = ml2.n5.f409298a;
        sb6.append(i17);
        e(sb6.toString(), j17, nickname);
        ml2.x5.f409768a.b(false, j17, nickname, i17);
    }

    public final void b(long j17, java.lang.String nickname, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        if (zl2.q4.f555466a.E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorPlayReporter", "firstFrameCallback source:" + i17 + ", liveRoom size:" + ((java.util.HashMap) ((jz5.n) f409557e).mo141623x754a37bb()).size() + ",nearby size:" + ((java.util.HashMap) ((jz5.n) f409558f).mo141623x754a37bb()).size() + ",liveFeed size:" + ((java.util.HashMap) ((jz5.n) f409559g).mo141623x754a37bb()).size() + '!');
        }
        e("onFirstFrame_" + i17, j17, nickname);
        ml2.x5.f409768a.b(true, j17, nickname, i17);
        d(j17, i17, 2);
    }

    public final int c(long j17, int i17) {
        if (i17 == 1) {
            java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) ((jz5.n) f409557e).mo141623x754a37bb()).get(java.lang.Long.valueOf(j17));
            return (num != null ? num : -1).intValue();
        }
        if (i17 == 2) {
            java.lang.Integer num2 = (java.lang.Integer) ((java.util.HashMap) ((jz5.n) f409558f).mo141623x754a37bb()).get(java.lang.Long.valueOf(j17));
            return (num2 != null ? num2 : -1).intValue();
        }
        if (i17 != 3) {
            return -1;
        }
        java.lang.Integer num3 = (java.lang.Integer) ((java.util.HashMap) ((jz5.n) f409559g).mo141623x754a37bb()).get(java.lang.Long.valueOf(j17));
        return (num3 != null ? num3 : -1).intValue();
    }

    public final void d(long j17, int i17, int i18) {
        jz5.g gVar = f409559g;
        jz5.g gVar2 = f409558f;
        jz5.g gVar3 = f409557e;
        if (i17 == 1) {
            ((java.util.HashMap) ((jz5.n) gVar3).mo141623x754a37bb()).put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
        } else if (i17 == 2) {
            ((java.util.HashMap) ((jz5.n) gVar2).mo141623x754a37bb()).put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
        } else if (i17 == 3) {
            ((java.util.HashMap) ((jz5.n) gVar).mo141623x754a37bb()).put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
        }
        if (zl2.q4.f555466a.E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorPlayReporter", "recordStage liveRoom size:" + ((java.util.HashMap) ((jz5.n) gVar3).mo141623x754a37bb()).size() + ",nearby size:" + ((java.util.HashMap) ((jz5.n) gVar2).mo141623x754a37bb()).size() + ",liveFeed size:" + ((java.util.HashMap) ((jz5.n) gVar).mo141623x754a37bb()).size() + '!');
        }
    }

    public final void e(java.lang.String scene, long j17, java.lang.String nickname) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6529x68078b77 c6529x68078b77 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6529x68078b77();
        c6529x68078b77.f138820i = 4L;
        c6529x68078b77.f138815d = c6529x68078b77.b(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, scene, true);
        c6529x68078b77.f138816e = 0;
        c6529x68078b77.f138818g = c6529x68078b77.b("liveId", pm0.v.u(j17), true);
        c6529x68078b77.f138819h = c6529x68078b77.b("nickname", nickname, true);
        c6529x68078b77.k();
    }

    public final void f(int i17, android.os.Bundle bundle, long j17, java.lang.String nickname, int i18) {
        java.lang.String str;
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        int c17 = c(j17, i18);
        boolean contains = f409555c.contains(java.lang.Integer.valueOf(i17));
        if (contains || f409556d.contains(java.lang.Integer.valueOf(i17))) {
            int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            java.lang.String str2 = ((bundle == null || (string = bundle.getString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46285x5018f760)) == null) ? null : r26.i0.t(string, ",", ";", false)) + ";netType:" + m40067xab9ed241;
            if (contains) {
                str = "onPlayError_stage" + c17 + '_' + i18;
            } else {
                str = "onPlayWarning_stage" + c17 + '_' + i18;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6529x68078b77 c6529x68078b77 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6529x68078b77();
            c6529x68078b77.f138820i = 4L;
            c6529x68078b77.f138815d = c6529x68078b77.b(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str, true);
            c6529x68078b77.f138816e = i17;
            c6529x68078b77.f138817f = c6529x68078b77.b("errMsg", str2, true);
            c6529x68078b77.f138818g = c6529x68078b77.b("liveId", pm0.v.u(j17), true);
            c6529x68078b77.f138819h = c6529x68078b77.b("nickname", nickname, true);
            c6529x68078b77.k();
        }
    }

    public final void g(java.lang.String msg, long j17, java.lang.String nickname, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        d(j17, i17, 1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(msg + ";netType:" + com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        if (((java.lang.Boolean) ((jz5.n) f409554b).mo141623x754a37bb()).booleanValue()) {
            sb6.append(";supportWidevine");
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6529x68078b77 c6529x68078b77 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6529x68078b77();
        c6529x68078b77.f138820i = 4L;
        c6529x68078b77.f138815d = c6529x68078b77.b(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "pluginStartPlay_" + i17, true);
        c6529x68078b77.f138816e = 0;
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        c6529x68078b77.f138817f = c6529x68078b77.b("errMsg", r26.i0.t(sb7, ",", "_", false), true);
        c6529x68078b77.f138818g = c6529x68078b77.b("liveId", pm0.v.u(j17), true);
        c6529x68078b77.f138819h = c6529x68078b77.b("nickname", nickname, true);
        c6529x68078b77.k();
    }
}

package mx3;

/* loaded from: classes10.dex */
public final class b0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f414062b;

    /* renamed from: a, reason: collision with root package name */
    public static final mx3.b0 f414061a = new mx3.b0();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f414063c = new java.util.LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f414064d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f414065e = jz5.h.b(mx3.y.f414163d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f414066f = jz5.h.b(mx3.z.f414164d);

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f414067g = new java.util.HashMap();

    public static java.util.Set b(mx3.b0 b0Var, java.lang.String str, boolean z17, java.util.Set set, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            set = null;
        }
        jz5.g gVar = f414065e;
        if (z17) {
            b0Var.getClass();
            return ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).getStringSet(str + "called", set);
        }
        b0Var.getClass();
        return ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).getStringSet(str + "calling", set);
    }

    public static final void g(java.lang.String username, java.lang.String ringtoneInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ringtoneInfo, "ringtoneInfo");
        f414067g.put(username, ringtoneInfo);
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f414066f).mo141623x754a37bb()).putString(username, ringtoneInfo);
    }

    public final java.lang.String a(java.util.Set set) {
        java.lang.String str = null;
        if (set == null) {
            return null;
        }
        java.util.Iterator it = set.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            long j18 = f414061a.f(str2).f414161b;
            if (j17 <= j18) {
                str = str2;
                j17 = j18;
            }
        }
        return str;
    }

    public final java.lang.String[] c() {
        java.lang.Character ch6;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_remind_reveicer_update_ringtone_wording, "", true);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
            try {
                cl0.g gVar = new cl0.g(Zi);
                java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QuickRingtoneHelper", "getXSettingCallingRingtoneString, langCode:%s", d17);
                java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4(d17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
                int i17 = 0;
                while (true) {
                    if (i17 >= mo15082x48bce8a4.length()) {
                        ch6 = null;
                        break;
                    }
                    char charAt = mo15082x48bce8a4.charAt(i17);
                    if (charAt == 65509) {
                        ch6 = java.lang.Character.valueOf(charAt);
                        break;
                    }
                    i17++;
                }
                if (ch6 == null) {
                    return null;
                }
                ch6.charValue();
                return new java.lang.String[]{mo15082x48bce8a4.subSequence(0, r26.n0.K(mo15082x48bce8a4, (char) 65509, 0, false, 6, null)).toString(), mo15082x48bce8a4.subSequence(r26.n0.K(mo15082x48bce8a4, (char) 65509, 0, false, 6, null) + 1, mo15082x48bce8a4.length()).toString()};
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.QuickRingtoneHelper", e17, "getMultitalkNavpopWording error", new java.lang.Object[0]);
            }
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575007kd1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575006kd0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return new java.lang.String[]{string, string2};
    }

    public final java.lang.String[] d() {
        java.lang.Character ch6;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_remind_caller_set_ringtone_wording, "", true);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
            try {
                cl0.g gVar = new cl0.g(Zi);
                java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QuickRingtoneHelper", "getXSettingCallingRingtoneString, langCode:%s", d17);
                java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4(d17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
                int i17 = 0;
                while (true) {
                    if (i17 >= mo15082x48bce8a4.length()) {
                        ch6 = null;
                        break;
                    }
                    char charAt = mo15082x48bce8a4.charAt(i17);
                    if (charAt == 65509) {
                        ch6 = java.lang.Character.valueOf(charAt);
                        break;
                    }
                    i17++;
                }
                if (ch6 == null) {
                    return null;
                }
                ch6.charValue();
                return new java.lang.String[]{mo15082x48bce8a4.subSequence(0, r26.n0.K(mo15082x48bce8a4, (char) 65509, 0, false, 6, null)).toString(), mo15082x48bce8a4.subSequence(r26.n0.K(mo15082x48bce8a4, (char) 65509, 0, false, 6, null) + 1, mo15082x48bce8a4.length()).toString()};
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.QuickRingtoneHelper", e17, "getMultitalkNavpopWording error", new java.lang.Object[0]);
            }
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575008kd2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kcz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return new java.lang.String[]{string, string2};
    }

    public final void e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, java.lang.String userName, java.lang.String feedId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        if (f414062b) {
            java.util.Set set = f414063c;
            if (set.contains(java.lang.Long.valueOf(msgInfo.m124847x74d37ac6()))) {
                return;
            }
            set.add(java.lang.Long.valueOf(msgInfo.m124847x74d37ac6()));
            ((java.util.ArrayList) f414064d).add(msgInfo);
        }
    }

    public final mx3.x f(java.lang.String str) {
        mx3.x xVar = new mx3.x();
        cl0.g gVar = new cl0.g(str);
        xVar.f414160a = gVar.mo15074x2fec8307("ringtoneId");
        xVar.f414161b = gVar.mo15073xfb822ef2("tick");
        xVar.f414162c = gVar.mo15070x41a8a7f2("linkToSetting");
        return xVar;
    }

    public final void h(java.lang.String str, boolean z17, java.util.Set set) {
        jz5.g gVar = f414065e;
        if (z17) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).putStringSet(str + "called", set);
            return;
        }
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).putStringSet(str + "calling", set);
    }
}

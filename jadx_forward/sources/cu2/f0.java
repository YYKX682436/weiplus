package cu2;

/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final cu2.f0 f303924a = new cu2.f0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f303925b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static java.util.LinkedList f303926c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public static java.util.LinkedList f303927d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public static java.util.LinkedList f303928e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f303929f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static r45.cm2 f303930g = new r45.cm2();

    static {
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_OBJECT_WORDING_CONFIG_STRING_SYNC, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        try {
            f303930g.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h((java.lang.String) m17));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
        }
        f303924a.i("ConfigStorage", f303930g, false, java.lang.Boolean.FALSE);
    }

    public final r45.rl2 a(java.lang.String key) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.Iterator it = f303926c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.rl2) obj).m75945x2fec8307(3), key)) {
                break;
            }
        }
        return (r45.rl2) obj;
    }

    public final r45.rl2 b(int i17) {
        java.lang.Object obj;
        java.util.Iterator it = f303926c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boolean z17 = false;
            if (((r45.rl2) obj).m75939xb282bd08(0) == i17) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        return (r45.rl2) obj;
    }

    public final r45.tl2 c(java.lang.String key) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.Iterator it = f303927d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.tl2) obj).m75945x2fec8307(0), key)) {
                break;
            }
        }
        return (r45.tl2) obj;
    }

    public final java.lang.String d(java.lang.String key) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.Iterator it = f303928e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.sl2) obj).m75945x2fec8307(4), key)) {
                break;
            }
        }
        r45.sl2 sl2Var = (r45.sl2) obj;
        if (sl2Var == null) {
            return null;
        }
        int m75939xb282bd08 = sl2Var.m75939xb282bd08(1);
        java.lang.String m75945x2fec8307 = m75939xb282bd08 != 1 ? m75939xb282bd08 != 2 ? null : sl2Var.m75945x2fec8307(3) : sl2Var.m75945x2fec8307(2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
            return null;
        }
        return m75945x2fec8307;
    }

    public final r45.bm2 e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.C2).mo141623x754a37bb()).r()).intValue() == 1) {
            i17 = 1;
        }
        return (r45.bm2) f303925b.get(java.lang.Integer.valueOf(i17));
    }

    public final r45.xa5 f(java.lang.String appid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        return (r45.xa5) f303929f.get(appid);
    }

    public final java.lang.String g() {
        java.lang.String d17 = f303924a.d("FinderObjectDynamicItemKey_FinderFav");
        if (d17 != null) {
            return d17;
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f5u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public final void h(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        g1Var.e().b(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.f411486d));
    }

    public final void i(java.lang.String source, r45.cm2 infoList, boolean z17, java.lang.Boolean bool) {
        java.util.LinkedList<r45.xa5> m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoList, "infoList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetConfig: source=");
        sb6.append(source);
        sb6.append(", needUpdateMemory=");
        sb6.append(z17);
        sb6.append(", needRefreshStorage=");
        sb6.append(bool);
        sb6.append(", objectExtInfoListSize=");
        int i17 = 0;
        sb6.append(infoList.m75941xfb821914(0).size());
        sb6.append(", imagesSize=");
        int i18 = 5;
        sb6.append(infoList.m75941xfb821914(5).size());
        sb6.append(", wordsSize=");
        sb6.append(infoList.m75941xfb821914(6).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderObjectWordingConfig", sb6.toString());
        java.util.HashMap hashMap = f303925b;
        hashMap.clear();
        java.util.LinkedList<r45.bm2> m75941xfb8219142 = infoList.m75941xfb821914(0);
        cu2.f0 f0Var = f303924a;
        int i19 = 7;
        if (m75941xfb8219142 != null) {
            for (r45.bm2 bm2Var : m75941xfb8219142) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("resetConfig: source=");
                sb7.append(source);
                sb7.append(", objectExtInfo=");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bm2Var);
                sb7.append(pm0.b0.g(bm2Var));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderObjectWordingConfig", sb7.toString());
                hashMap.put(java.lang.Integer.valueOf(bm2Var.m75939xb282bd08(i17)), bm2Var);
                mn2.g1 g1Var = mn2.g1.f411508a;
                vo0.d e17 = g1Var.e();
                java.lang.String m75945x2fec8307 = bm2Var.m75945x2fec8307(i19);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 y90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e;
                mn2.q3 q3Var = new mn2.q3(m75945x2fec8307, y90Var);
                mn2.f1 f1Var = mn2.f1.B;
                e17.b(q3Var, g1Var.h(f1Var));
                g1Var.e().b(new mn2.q3(bm2Var.m75945x2fec8307(8), y90Var), g1Var.h(f1Var));
                g1Var.e().b(new mn2.q3(bm2Var.m75945x2fec8307(9), y90Var), g1Var.h(f1Var));
                g1Var.e().b(new mn2.q3(bm2Var.m75945x2fec8307(10), y90Var), g1Var.h(f1Var));
                hashMap = hashMap;
                i17 = 0;
                i18 = 5;
                i19 = 7;
            }
        }
        java.util.LinkedList<r45.rl2> m75941xfb8219143 = infoList.m75941xfb821914(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getImages(...)");
        for (r45.rl2 rl2Var : m75941xfb8219143) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("resetConfig: source=");
            sb8.append(source);
            sb8.append(", image=");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rl2Var);
            sb8.append(pm0.b0.g(rl2Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderObjectWordingConfig", sb8.toString());
        }
        java.util.LinkedList<r45.sl2> m75941xfb8219144 = infoList.m75941xfb821914(6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getWords(...)");
        for (r45.sl2 sl2Var : m75941xfb8219144) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("resetConfig: source=");
            sb9.append(source);
            sb9.append(", word=");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sl2Var);
            sb9.append(pm0.b0.g(sl2Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderObjectWordingConfig", sb9.toString());
        }
        java.util.LinkedList<r45.rl2> m75941xfb8219145 = infoList.m75941xfb821914(5);
        if (m75941xfb8219145 == null) {
            m75941xfb8219145 = new java.util.LinkedList();
        }
        f303926c = m75941xfb8219145;
        for (r45.rl2 rl2Var2 : m75941xfb8219145) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                f0Var.h(rl2Var2.m75945x2fec8307(2));
            } else {
                f0Var.h(rl2Var2.m75945x2fec8307(1));
            }
        }
        java.util.LinkedList m75941xfb8219146 = infoList.m75941xfb821914(6);
        if (m75941xfb8219146 == null) {
            m75941xfb8219146 = new java.util.LinkedList();
        }
        f303928e = m75941xfb8219146;
        java.util.LinkedList m75941xfb8219147 = infoList.m75941xfb821914(7);
        if (m75941xfb8219147 == null) {
            m75941xfb8219147 = new java.util.LinkedList();
        }
        f303927d = m75941xfb8219147;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new cu2.d0(null), 2, null);
        java.util.HashMap hashMap2 = f303929f;
        hashMap2.clear();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209402p0).mo141623x754a37bb()).r()).intValue() == 1) {
            r45.xa5 xa5Var = new r45.xa5();
            xa5Var.set(8, "https://miaojian.weixin.qq.com/download/apps?channel=1104");
            xa5Var.set(9, "com.tencent.phoenix");
            xa5Var.set(7, "miaojian://createVideo?scene=channels&from=channels-samestyle&miaojianExtInfo=");
            xa5Var.set(10, "A24DC0755072F64C480DC06DCD3412BF");
            xa5Var.set(6, "https://apps.apple.com/app/apple-store/id1530922601?pt=69276&ct=channels1&mt=8");
            xa5Var.set(2, null);
            xa5Var.set(1, "http://dldir1v6.qq.com/weixin/checkresupdate/outlined_miaojian_658e3fe317814fc8a1c209e9a5937e01.png");
            xa5Var.set(0, "秒剪做同款");
            xa5Var.set(3, 0);
            xa5Var.set(5, "https://v.vuevideo.net/vfromwx/createvideo?scene=channels");
            xa5Var.set(4, "ConstantsProtocal.MAAS_APPID");
            xa5Var.set(11, "http://dldir1v6.qq.com/weixin/checkresupdate/outlined_miaojian_dark_6b87f03b481440249680c17b73dac97b.png");
            hashMap2.put("wxa5e0de08d96cc09d", xa5Var);
        }
        r45.ya5 ya5Var = (r45.ya5) infoList.m75936x14adae67(4);
        if (ya5Var != null && (m75941xfb821914 = ya5Var.m75941xfb821914(0)) != null) {
            for (r45.xa5 xa5Var2 : m75941xfb821914) {
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder("resetConfig: source=");
                sb10.append(source);
                sb10.append(", sheet=");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xa5Var2);
                sb10.append(pm0.b0.g(xa5Var2));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderObjectWordingConfig", sb10.toString());
                java.lang.String m75945x2fec83072 = xa5Var2.m75945x2fec8307(4);
                if (!(m75945x2fec83072 == null || m75945x2fec83072.length() == 0)) {
                    hashMap2.put(m75945x2fec83072, xa5Var2);
                    f0Var.h(xa5Var2.m75945x2fec8307(1));
                    f0Var.h(xa5Var2.m75945x2fec8307(11));
                }
            }
        }
        if (z17) {
            f303930g = infoList;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            pm0.v.O("FinderObjectWordingConfig", new cu2.e0(infoList));
        }
    }
}

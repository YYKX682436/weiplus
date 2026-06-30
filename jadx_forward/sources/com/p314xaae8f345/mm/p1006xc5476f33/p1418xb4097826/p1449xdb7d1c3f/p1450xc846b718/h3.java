package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes2.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.h3 f187082a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.h3();

    public final cl0.g a(r45.f03 showInfo, java.lang.String tipsID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showInfo, "showInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsID, "tipsID");
        cl0.g gVar = new cl0.g();
        gVar.o("show_type", showInfo.f455420d);
        gVar.o("count", showInfo.f455421e);
        gVar.h(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, showInfo.f455422f);
        gVar.h("icon_url", showInfo.f455423g);
        gVar.h(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, showInfo.f455425i);
        gVar.o("clear_type", showInfo.f455424h);
        gVar.h("parent", showInfo.f455426m);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tipsID)) {
            gVar.h("tips_id", tipsID);
        }
        return gVar;
    }

    public final java.lang.String b(java.util.HashSet paths, java.lang.String str) {
        java.util.Iterator it;
        jz5.f0 f0Var;
        java.lang.String businessType = str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paths, "paths");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        int i17 = 0;
        int i18 = 1;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209279i3).mo141623x754a37bb()).r()).intValue() == 1;
        cl0.g gVar = new cl0.g();
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.h3 h3Var = f187082a;
        int i19 = 3;
        int i27 = 2;
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            r45.f03 f03Var = new r45.f03();
            f03Var.f455425i = "h5_creator_auth";
            f03Var.f455426m = "";
            f03Var.f455424h = 1;
            f03Var.f455421e = 0;
            f03Var.f455422f = "";
            f03Var.f455423g = "";
            f03Var.f455420d = 1;
            arrayList.add(f03Var);
            r45.f03 f03Var2 = new r45.f03();
            f03Var2.f455425i = "h5_creator_guide";
            f03Var2.f455426m = "";
            f03Var2.f455424h = 1;
            f03Var2.f455421e = 3;
            f03Var2.f455422f = "";
            f03Var2.f455423g = "";
            f03Var2.f455420d = 2;
            arrayList.add(f03Var2);
            r45.f03 f03Var3 = new r45.f03();
            f03Var3.f455425i = "h5_creator_original";
            f03Var3.f455426m = "";
            f03Var3.f455424h = 1;
            f03Var3.f455421e = 0;
            f03Var3.f455422f = "测试";
            f03Var3.f455423g = "";
            f03Var3.f455420d = 3;
            arrayList.add(f03Var3);
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                r45.f03 f03Var4 = (r45.f03) it6.next();
                java.lang.String str2 = f03Var4.f455425i;
                if (str2 == null) {
                    str2 = "";
                }
                gVar.h(str2, h3Var.a(f03Var4, ""));
            }
        } else {
            java.util.Iterator it7 = paths.iterator();
            while (it7.hasNext()) {
                java.lang.String str3 = (java.lang.String) it7.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                if (((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(businessType, i17) == i27 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "NewLife.Entrance")) ? i18 : i17) != 0) {
                    java.lang.String str4 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LONG_VIDEO_REDOT_INFO_STRING_SYNC, null);
                    if (str4 != null) {
                        r45.vs2 vs2Var = new r45.vs2();
                        byte[] bytes = str4.getBytes(r26.c.f450400c);
                        java.lang.String str5 = "getBytes(...)";
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                        vs2Var.mo11468x92b714fd(bytes);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb();
                        jbVar.t0(vs2Var);
                        java.util.LinkedList linkedList = vs2Var.f470022g;
                        if (linkedList != null) {
                            java.util.Iterator it8 = linkedList.iterator();
                            while (it8.hasNext()) {
                                r45.f03 f03Var5 = (r45.f03) it8.next();
                                java.lang.String str6 = f03Var5.f455425i;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                int i28 = jbVar.f65873xe412923f;
                                r45.xs2 xs2Var = jbVar.N;
                                java.lang.String u17 = pm0.v.u(xs2Var.m75942xfb822ef2(i19));
                                java.lang.String m75945x2fec8307 = xs2Var.m75945x2fec8307(8);
                                java.util.Iterator it9 = it7;
                                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = xs2Var.m75934xbce7f2f(7);
                                byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
                                if (g17 == null) {
                                    g17 = "".getBytes(r26.c.f450398a);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, str5);
                                }
                                java.lang.String encodeToString = android.util.Base64.encodeToString(g17, 2);
                                java.lang.String field_tips_uuid = jbVar.f65882x5364c75d;
                                java.lang.String str7 = str5;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_tips_uuid, "field_tips_uuid");
                                int m55856xfb85f7b0 = jbVar.m55856xfb85f7b0();
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2 = jbVar;
                                cl0.g gVar2 = new cl0.g();
                                java.util.Iterator it10 = it8;
                                gVar2.o("business_type", i28);
                                gVar2.o("clear_type", f03Var5.f455424h);
                                gVar2.o("count", f03Var5.f455421e);
                                gVar2.h("icon_url", f03Var5.f455423g);
                                gVar2.h("objectId", u17);
                                if (m75945x2fec8307 == null) {
                                    m75945x2fec8307 = "";
                                }
                                gVar2.h("objectNonceId", m75945x2fec8307);
                                gVar2.h(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, f03Var5.f455425i);
                                gVar2.o("show_type", f03Var5.f455420d);
                                if (encodeToString == null) {
                                    encodeToString = "";
                                }
                                gVar2.h("tab_tips_by_pass_info", encodeToString);
                                gVar2.h("tips_uuid", field_tips_uuid);
                                gVar2.h(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, f03Var5.f455422f);
                                gVar2.h("parent", f03Var5.f455426m);
                                gVar2.o("type", m55856xfb85f7b0);
                                gVar.h(str6, gVar2);
                                it7 = it9;
                                str5 = str7;
                                jbVar = jbVar2;
                                it8 = it10;
                                i19 = 3;
                            }
                        }
                        it = it7;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotConverter", "insertLongVideoRedDot " + pm0.b0.g(vs2Var));
                        f0Var = jz5.f0.f384359a;
                    } else {
                        it = it7;
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotConverter", "insertLongVideoRedDot but long video cache reddot is empty!");
                    }
                } else {
                    it = it7;
                    r45.f03 I0 = nk6.I0(str3);
                    if (I0 != null) {
                        gVar.h(str3, h3Var.a(I0, ""));
                    }
                }
                businessType = str;
                it7 = it;
                i17 = 0;
                i18 = 1;
                i19 = 3;
                i27 = 2;
            }
        }
        java.lang.String gVar3 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar3, "toString(...)");
        return gVar3;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb c(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LONG_VIDEO_REDOT_INFO_STRING_SYNC, null);
        if (str != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb();
            r45.vs2 vs2Var = new r45.vs2();
            byte[] bytes = str.getBytes(r26.c.f450400c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            vs2Var.mo11468x92b714fd(bytes);
            jbVar.t0(vs2Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotConverter", ya.b.f77502x92235c1b + source + " getLongVideoReddot suc " + jbVar + '!');
            if (jbVar.f65882x5364c75d == null || jbVar.f65880x11c19d58 == null || jbVar.N.m75942xfb822ef2(3) == 0) {
                jbVar = null;
            }
            if (jbVar != null) {
                return jbVar;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotConverter", ya.b.f77502x92235c1b + source + " getLongVideoReddot but long video cache reddot is empty!");
        return null;
    }

    public final void d(java.lang.String source, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb c17 = c(source);
        if (c17 != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17.f65880x11c19d58, jbVar != null ? jbVar.f65880x11c19d58 : null)) {
                e(source, "NewLife.Entrance", "2");
            }
        }
    }

    public final void e(java.lang.String source, java.lang.String path, java.lang.String businessType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotConverter", ya.b.f77502x92235c1b + source + " removeLongVideoRedDot path:" + path + ",businessType:" + businessType);
        boolean z17 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(businessType, 0) == 2 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(path, "NewLife.Entrance")) {
            z17 = true;
        }
        if (z17) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LONG_VIDEO_REDOT_INFO_STRING_SYNC, "");
        }
    }
}

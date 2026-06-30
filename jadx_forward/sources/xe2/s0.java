package xe2;

/* loaded from: classes10.dex */
public final class s0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535436c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535436c = "LiveKtvInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        java.lang.String str;
        r45.ay1 ay1Var;
        java.lang.String str2;
        r45.ay1 ay1Var2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        if (ch1Var != null) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            r45.xn1 xn1Var = (r45.xn1) ch1Var.m75936x14adae67(13);
            java.lang.String str4 = "";
            if (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                str = "";
            }
            if (r4Var.k2(str)) {
                return;
            }
            int m75939xb282bd08 = ch1Var.m75939xb282bd08(1);
            gk2.e eVar = this.f526800a;
            if (m75939xb282bd08 != 20110) {
                if (m75939xb282bd08 != 20115) {
                    return;
                }
                r45.ui1 ui1Var = new r45.ui1();
                if (!(ch1Var.m75934xbce7f2f(4) != null)) {
                    ch1Var = null;
                }
                if (ch1Var != null) {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
                    byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
                    if (g17 != null) {
                        try {
                            ui1Var.mo11468x92b714fd(g17);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                        }
                    }
                }
                if (ui1Var.f468931e > 0) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    r45.yx1 yx1Var = ui1Var.f468930d;
                    if (yx1Var != null) {
                        linkedList.add(yx1Var);
                        java.lang.String str5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.d2.f197009a;
                        r45.by1 by1Var = yx1Var.f472999o;
                        if (by1Var != null) {
                            java.lang.String unique_id = yx1Var.f472992e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(unique_id, "unique_id");
                            java.lang.String song_mid = yx1Var.f472991d;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(song_mid, "song_mid");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.d2.e(by1Var, unique_id, song_mid, true);
                        }
                    }
                    r45.yx1 yx1Var2 = ui1Var.f468932f;
                    if (yx1Var2 != null) {
                        linkedList.add(yx1Var2);
                    }
                    ((om2.g) eVar.a(om2.g.class)).V6("curPlayMsg", linkedList, ui1Var.f468931e);
                    return;
                }
                return;
            }
            r45.vi1 vi1Var = new r45.vi1();
            r45.ch1 ch1Var2 = ch1Var.m75934xbce7f2f(4) != null ? ch1Var : null;
            if (ch1Var2 != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = ch1Var2.m75934xbce7f2f(4);
                byte[] g18 = m75934xbce7f2f2 != null ? m75934xbce7f2f2.g() : null;
                if (g18 != null) {
                    try {
                        vi1Var.mo11468x92b714fd(g18);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                    }
                }
            }
            ((om2.g) eVar.a(om2.g.class)).X6("listChangeMsg", vi1Var.f469814g);
            int i17 = vi1Var.f469813f;
            java.util.LinkedList<r45.yx1> song_info_list = vi1Var.f469812e;
            if (i17 > 0) {
                r45.xn1 xn1Var2 = (r45.xn1) ch1Var.m75936x14adae67(13);
                r45.yx1 yx1Var3 = vi1Var.f469816i;
                if (xn1Var2 != null && yx1Var3 != null) {
                    int i18 = vi1Var.f469811d;
                    if (i18 == 2) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76197x6c03c64c() : null, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o) && ((om2.g) eVar.a(om2.g.class)).T6(yx1Var3)) {
                            r45.by1 by1Var2 = yx1Var3.f472999o;
                            if (by1Var2 != null && (ay1Var = by1Var2.f452676d) != null && (str2 = ay1Var.f451884e) != null) {
                                java.lang.String str6 = "《" + str2 + (char) 12299;
                                if (str6 != null) {
                                    str4 = str6;
                                }
                            }
                            h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.miy) + str4);
                        }
                    } else if (i18 == 3) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa3 != null ? c19782x23db1cfa3.m76197x6c03c64c() : null, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o) && ((om2.g) eVar.a(om2.g.class)).T6(yx1Var3)) {
                            r45.by1 by1Var3 = yx1Var3.f472999o;
                            if (by1Var3 != null && (ay1Var2 = by1Var3.f452676d) != null && (str3 = ay1Var2.f451884e) != null) {
                                java.lang.String str7 = "《" + str3 + (char) 12299;
                                if (str7 != null) {
                                    str4 = str7;
                                }
                            }
                            h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573112mj2) + str4);
                        }
                    } else if (i18 == 4) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa4 != null ? c19782x23db1cfa4.m76197x6c03c64c() : null, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o)) {
                            if (((om2.g) eVar.a(om2.g.class)).T6(yx1Var3)) {
                                ((om2.g) eVar.a(om2.g.class)).O6(new om2.a(false));
                            }
                            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573110mj0);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                            h(string);
                        }
                    } else if (i18 == 5) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa5 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa5 != null ? c19782x23db1cfa5.m76197x6c03c64c() : null, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o)) {
                            if (((om2.g) eVar.a(om2.g.class)).T6(yx1Var3)) {
                                ((om2.g) eVar.a(om2.g.class)).O6(new om2.a(true));
                            }
                            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.miz);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                            h(string2);
                        }
                    } else if (i18 == 6) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa6 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa6 != null ? c19782x23db1cfa6.m76197x6c03c64c() : null, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o)) {
                            java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573111mj1);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                            h(string3);
                        } else {
                            java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mjy);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                            h(string4);
                        }
                    }
                }
                om2.g gVar = (om2.g) eVar.a(om2.g.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(song_info_list, "song_info_list");
                gVar.V6("listChangeMsg", song_info_list, vi1Var.f469813f);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("KTV appmsg: mod_type ");
            sb6.append(vi1Var.f469811d);
            sb6.append(", song list ");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(song_info_list, "song_info_list");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(song_info_list, 10));
            for (r45.yx1 yx1Var4 : song_info_list) {
                arrayList.add(yx1Var4.f472991d + ": " + yx1Var4.f472999o.f452676d.f451884e);
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535436c, sb6.toString());
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20110, 20115};
    }

    public final void h(java.lang.String str) {
        pm0.v.X(new xe2.r0(str));
    }
}

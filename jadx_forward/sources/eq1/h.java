package eq1;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final eq1.h f337345a = new eq1.h();

    /* renamed from: b, reason: collision with root package name */
    public static final kk.j f337346b = new kk.l(50);

    /* renamed from: c, reason: collision with root package name */
    public static final kk.j f337347c = new kk.l(50);

    /* renamed from: d, reason: collision with root package name */
    public static final int f337348d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f337349e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f337350f = 3;

    public final boolean a(r45.nw1 nw1Var) {
        if (nw1Var == null) {
            return false;
        }
        return nw1Var.m75939xb282bd08(31) == 1 || nw1Var.m75939xb282bd08(31) == 4 || nw1Var.m75939xb282bd08(31) == 2 || nw1Var.m75939xb282bd08(31) == 6 || nw1Var.m75939xb282bd08(31) == 5;
    }

    public final boolean b(java.lang.String msgContent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgContent, "msgContent");
        ot0.q0 e17 = e(msgContent, i17);
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.f430273f);
        boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.f430274g);
        boolean z19 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.f430283s);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "nonceIdOk = " + z17 + ", exportIdOk = " + z18 + ", coverOk = " + z19);
        return z17 && z18 && z19;
    }

    public final void c(java.lang.String str, java.lang.String str2, yz5.l lVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "exportId = " + str2 + ", nonceId = " + str);
            if (lVar != null) {
                lVar.mo146xb9724478(null);
                return;
            }
            return;
        }
        if (((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) f337347c).k(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "get finderObject in cache");
            if (lVar != null) {
                lVar.mo146xb9724478(d(str2, str));
                return;
            }
            return;
        }
        m40.h0 h0Var = (m40.h0) i95.n0.c(m40.h0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h0Var);
        m40.h0.ci(h0Var, 0L, str, 26, 2, "", false, null, null, 0L, null, false, false, str2, null, 0, null, 53216, null).l().K(new eq1.d(str2, lVar));
    }

    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 d(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "exportId = " + str + ", nonceId = " + str2);
            return null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("test_biz_finder_live");
        boolean i17 = M.i("clear", false);
        java.lang.Object obj = f337347c;
        if (i17) {
            ((kk.l) f337346b).mo143584x5a5b64d();
            ((kk.l) obj).mo143584x5a5b64d();
            M.G("clear", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "clear bizFinderObjectCache");
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) obj).get(str);
        if (c19792x256d2725 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "finder object get from cgi");
            c(str2, str, null);
        }
        return c19792x256d2725;
    }

    public final ot0.q0 e(java.lang.String msgContent, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgContent, "msgContent");
        byte[] bytes = msgContent.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        java.lang.Object obj = f337346b;
        if (((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) obj).k(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "get liveXmlObject from cache");
            java.lang.Object obj2 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) obj).get(g17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            return (ot0.q0) obj2;
        }
        java.lang.String tagPrefix = ".msg.appmsg.mmreader.category.item" + (i17 == 0 ? "" : java.lang.String.valueOf(i17)) + ".finder_live";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "get liveXmlObject from parse, prefix = " + tagPrefix);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagPrefix, "tagPrefix");
        java.util.Map x17 = ot0.q.x(msgContent);
        ot0.q0 q0Var = new ot0.q0();
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x17);
            if (!x17.isEmpty()) {
                java.lang.String str2 = (java.lang.String) x17.get(tagPrefix.concat(".category"));
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = "";
                }
                q0Var.f430271d = str2;
                java.lang.String str3 = (java.lang.String) x17.get(tagPrefix.concat(".finder_username"));
                if (str3 == null) {
                    str3 = "";
                }
                q0Var.f430272e = str3;
                java.lang.String str4 = (java.lang.String) x17.get(tagPrefix.concat(".finder_nonce_id"));
                if (str4 == null) {
                    str4 = "";
                }
                q0Var.f430273f = str4;
                java.lang.String str5 = (java.lang.String) x17.get(tagPrefix.concat(".export_id"));
                if (str5 == null) {
                    str5 = "";
                }
                q0Var.f430274g = str5;
                java.lang.String str6 = (java.lang.String) x17.get(tagPrefix.concat(".nickname"));
                if (str6 == null) {
                    str6 = "";
                }
                q0Var.f430275h = str6;
                java.lang.String str7 = (java.lang.String) x17.get(tagPrefix.concat(".head_url"));
                if (str7 == null) {
                    str7 = "";
                }
                q0Var.f430276i = str7;
                java.lang.String str8 = (java.lang.String) x17.get(tagPrefix.concat(".desc"));
                if (str8 == null) {
                    str8 = "";
                }
                q0Var.f430277m = str8;
                q0Var.f430278n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) x17.get(tagPrefix.concat(".live_status")), 0);
                java.lang.String str9 = (java.lang.String) x17.get(tagPrefix.concat(".live_source_type_str"));
                if (str9 == null) {
                    str9 = "";
                }
                q0Var.f430279o = str9;
                q0Var.f430280p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) x17.get(tagPrefix.concat(".ext_flag")), 0);
                java.lang.String str10 = (java.lang.String) x17.get(tagPrefix.concat(".auth_icon_url"));
                if (str10 == null) {
                    str10 = "";
                }
                q0Var.f430281q = str10;
                java.lang.String str11 = (java.lang.String) x17.get(tagPrefix.concat(".auth_icon_type_str"));
                if (str11 == null) {
                    str11 = "";
                }
                q0Var.f430282r = str11;
                java.lang.String str12 = (java.lang.String) x17.get(tagPrefix.concat(".media.cover_url"));
                q0Var.f430283s = str12 == null ? "" : str12;
                q0Var.f430284t = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) x17.get(tagPrefix.concat(".media.height")), 0);
                q0Var.f430285u = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) x17.get(tagPrefix.concat(".media.width")), 0);
            }
            str = "BizChatUtil";
        } catch (java.lang.Exception e17) {
            str = "BizChatUtil";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "parse error! %s", e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "parse ok, desc = " + q0Var.f430277m);
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) obj).put(g17, q0Var);
        return q0Var;
    }

    public final void f(java.lang.String str, java.lang.String str2, s40.t0 statusCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusCallback, "statusCallback");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            c(str, str2, new eq1.e(statusCallback, str2));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "exportId = " + str2 + ", nonceId = " + str);
    }

    public final void g(int i17, java.lang.String str, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        r45.nw1 m76794xd0557130;
        cl0.g gVar = new cl0.g();
        try {
            gVar.h("exportId", str);
            gVar.h("liveid", (c19792x256d2725 == null || (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) == null) ? null : java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0)));
            gVar.h("feedid", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L));
            gVar.h("finder_username", str2);
            gVar.h("wx_username", str3);
        } catch (cl0.f e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BizChatUtil", e17.getMessage());
        }
        switch (i17) {
            case 11:
                str4 = "service_card_one_big";
                break;
            case 12:
                str4 = "service_card_first";
                break;
            case 13:
                str4 = "service_card_second";
                break;
            case 14:
                str4 = "service_card_his_message";
                break;
            default:
                str4 = "";
                break;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318 c6463x6ead4318 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c6463x6ead4318.f138055d = java.lang.System.currentTimeMillis();
        c6463x6ead4318.s(str4);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        c6463x6ead4318.t(r26.i0.t(gVar2, ",", ";", false));
        c6463x6ead4318.k();
    }

    public final void h(android.widget.ImageView rightCoverIv, android.widget.ImageView blurCoverIv, java.lang.String str, o11.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rightCoverIv, "rightCoverIv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blurCoverIv, "blurCoverIv");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "coverUrl == null");
            return;
        }
        android.content.Context context = rightCoverIv.getContext();
        fq1.e.h(fq1.e.f347040a, rightCoverIv, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 4), false, false, 12, null);
        int b17 = i65.a.b(context, 220);
        int B = i65.a.B(context) - i65.a.b(context, 16);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "setCover, coverUrl = " + str + ", cardHeight = " + b17 + ", cardWidth = " + B);
        if (gVar == null) {
            o11.f fVar = new o11.f();
            fVar.f423610a = true;
            fVar.f423612c = true;
            fVar.f423624o = com.p314xaae8f345.mm.R.C30859x5a72f63.f560349i1;
            fVar.f423615f = tv.a.b(str);
            fVar.f423619j = B;
            fVar.f423620k = b17;
            gVar = fVar.a();
        }
        n11.a.b().i(str, rightCoverIv, gVar, new eq1.g(blurCoverIv, str, B, b17));
    }

    public final void i(boolean z17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e12) {
        if (z17) {
            c15315xe70278e1.setVisibility(0);
            c15315xe70278e12.setVisibility(8);
            c15315xe70278e1.m62166x765074af(str);
        } else {
            c15315xe70278e1.setVisibility(8);
            c15315xe70278e12.setVisibility(0);
            c15315xe70278e12.m62166x765074af(str);
        }
    }

    public final void j(r45.nw1 nw1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 liveOnIcon, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 liveEndIcon) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveOnIcon, "liveOnIcon");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveEndIcon, "liveEndIcon");
        java.lang.Integer valueOf = nw1Var != null ? java.lang.Integer.valueOf(nw1Var.m75939xb282bd08(2)) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setLiveStatusIcon: live status = ");
        sb6.append(valueOf);
        sb6.append(", replay = ");
        sb6.append(nw1Var != null ? java.lang.Integer.valueOf(nw1Var.m75939xb282bd08(31)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ajo), "getString(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ajn), "getString(...)");
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ajm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ajk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aji);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        if (nw1Var == null) {
            i(false, string2, liveOnIcon, liveEndIcon);
            return;
        }
        if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
            i(true, string, liveOnIcon, liveEndIcon);
            return;
        }
        if (valueOf == null || valueOf.intValue() != 2) {
            i(false, string2, liveOnIcon, liveEndIcon);
            return;
        }
        if (a(nw1Var)) {
            i(false, string3, liveOnIcon, liveEndIcon);
            return;
        }
        if (nw1Var.m75939xb282bd08(31) == 3) {
            i(false, string2, liveOnIcon, liveEndIcon);
        } else {
            i(false, string2, liveOnIcon, liveEndIcon);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        if (r2 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e5, code lost:
    
        r12 = com.p314xaae8f345.mm.R.C30861xcebc809e.f562510bx1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
    
        r12 = com.p314xaae8f345.mm.R.C30861xcebc809e.bwz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d5, code lost:
    
        if (r2 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ef, code lost:
    
        r12 = com.p314xaae8f345.mm.R.C30861xcebc809e.f562511bx2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00eb, code lost:
    
        r12 = com.p314xaae8f345.mm.R.C30861xcebc809e.f562509bx0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00de, code lost:
    
        if (r2 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e9, code lost:
    
        if (r2 != false) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(r45.nw1 r12, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq1.h.k(r45.nw1, com.tencent.mm.ui.widget.MMNeat7extView, java.lang.String):void");
    }

    public final void l(android.widget.ImageView coverIv, java.lang.String str, o11.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverIv, "coverIv");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "coverUrl == null");
            return;
        }
        if (gVar == null) {
            o11.f fVar = new o11.f();
            fVar.f423610a = true;
            fVar.f423612c = true;
            fVar.f423624o = com.p314xaae8f345.mm.R.C30859x5a72f63.f560349i1;
            fVar.f423615f = tv.a.b(str);
            gVar = fVar.a();
        }
        n11.a.b().h(str, coverIv, gVar);
    }
}

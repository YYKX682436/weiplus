package cl4;

/* loaded from: classes11.dex */
public final class v {
    public final java.lang.String a(bw5.o50 o50Var) {
        java.lang.String m12487x8010e5e4;
        bw5.mc0 b17 = o50Var.b();
        if (b17 == null || (m12487x8010e5e4 = b17.m12487x8010e5e4()) == null) {
            return o50Var.L1[7] ? o50Var.f112496m : "";
        }
        return m12487x8010e5e4;
    }

    public final void b(android.app.Activity activity, bw5.o50 item, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
        java.lang.String k17 = il4.d.k(item);
        if (k17 == null) {
            k17 = "";
        }
        ((dl4.m0) tVar).Bi(k17, new cl4.o(item, activity, i17, this));
    }

    public final void c(android.app.Activity context, bw5.lp0 tingItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItem, "tingItem");
        bw5.v70 d17 = tingItem.d();
        if (!il4.l.i(d17 != null ? d17.f115722e : 0)) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Bi(rk4.j5.d(tingItem), new cl4.r(tingItem, context, this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingShareHelper", "favLocalFile fileName: " + tingItem.d().i().b() + ", filePath: " + tingItem.d().i().m12386x5000ed37());
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        c5303xc75d2f73.f135623g.f87856i = context;
        o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
        java.lang.String m12386x5000ed37 = tingItem.d().i().m12386x5000ed37();
        java.lang.String b17 = tingItem.d().i().b();
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) c5Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.k(c5303xc75d2f73, 36, m12386x5000ed37, b17, "", "");
        pm0.v.X(new cl4.q(c5303xc75d2f73));
    }

    public final java.lang.String d(bw5.o50 o50Var) {
        java.lang.String k17;
        int i17 = o50Var.f112497n;
        boolean z17 = i17 == 45 || i17 == 46;
        o50Var.m12637xfb82e301();
        a(o50Var);
        o50Var.d();
        ot0.q qVar = new ot0.q();
        qVar.f430199i = z17 ? 133 : 93;
        qVar.f430187f = z17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.piq) : o50Var.m12637xfb82e301();
        java.lang.String str = "";
        if (z17 || (k17 = il4.d.k(o50Var)) == null) {
            k17 = "";
        }
        qVar.f430267z = k17;
        if (z17) {
            try {
                java.lang.String b17 = ((tg3.v0) i95.n0.c(tg3.v0.class)) != null ? c01.a2.b(gm0.j1.b().k()) : null;
                if (b17 != null) {
                    str = b17;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingShareHelper", e17, "getNickname Failed", new java.lang.Object[0]);
            }
            if (o50Var.f112497n == 45) {
                qVar.f430191g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pir, str);
            } else {
                qVar.f430191g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pip, str);
            }
        } else {
            qVar.f430191g = a(o50Var);
        }
        qVar.f430207k = "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/notsupport";
        il4.a aVar = new il4.a();
        aVar.f373625b = o50Var.f112497n;
        aVar.f373626c = il4.d.e(o50Var);
        qVar.f(aVar);
        return ot0.q.u(qVar, null, null);
    }

    public final java.lang.String e(android.content.Context context, bw5.o50 categoryItem, bw5.v70 v70Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categoryItem, "categoryItem");
        categoryItem.m12637xfb82e301();
        a(categoryItem);
        categoryItem.d();
        ot0.q qVar = new ot0.q();
        qVar.f430199i = 118;
        qVar.f430187f = categoryItem.m12637xfb82e301();
        java.lang.String str = "";
        qVar.f430267z = "";
        qVar.f430191g = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3s);
        qVar.f430207k = "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/notsupport";
        il4.b bVar = new il4.b();
        bVar.f373629b = categoryItem.f112497n;
        bVar.f373630c = il4.d.e(categoryItem);
        if (v70Var != null) {
            try {
                bw5.v70 v70Var2 = new bw5.v70();
                v70Var2.mo11468x92b714fd(v70Var.mo14344x5f01b1f6());
                java.lang.String encodeToString = android.util.Base64.encodeToString(v70Var2.mo14344x5f01b1f6(), 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
                str = encodeToString;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingCategoryUtils", e17, "encodeTingCategoryItem exception", new java.lang.Object[0]);
            }
        }
        bVar.f373631d = str;
        qVar.f(bVar);
        return ot0.q.u(qVar, null, null);
    }

    public final r45.xs4 f(bw5.lp0 lp0Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String m13170xcc16feb8;
        bw5.z90 j17;
        bw5.z90 j18;
        bw5.z90 j19;
        bw5.z90 j27;
        bw5.z90 j28;
        bw5.z90 j29;
        r45.xs4 xs4Var = new r45.xs4();
        xs4Var.set(4, rk4.j5.c(lp0Var));
        bw5.v70 d17 = lp0Var.d();
        java.lang.String str8 = "";
        if (d17 == null || (j29 = d17.j()) == null || (str = j29.o()) == null) {
            str = "";
        }
        xs4Var.set(14, str);
        bw5.v70 d18 = lp0Var.d();
        if (d18 == null || (j28 = d18.j()) == null || (str2 = j28.b()) == null) {
            str2 = "";
        }
        xs4Var.set(5, str2);
        bw5.v70 d19 = lp0Var.d();
        if (d19 == null || (j27 = d19.j()) == null || (str3 = j27.e()) == null) {
            str3 = "";
        }
        xs4Var.set(7, str3);
        bw5.z90 j37 = lp0Var.d().j();
        if (j37 == null || (str4 = j37.f()) == null) {
            str4 = "";
        }
        xs4Var.set(9, str4);
        bw5.z90 j38 = lp0Var.d().j();
        xs4Var.set(8, java.lang.Long.valueOf(j38 != null ? j38.f117428r : 0L));
        xs4Var.set(10, java.lang.Integer.valueOf(rk4.j5.e(lp0Var)));
        bw5.v70 d27 = lp0Var.d();
        if (d27 == null || (j19 = d27.j()) == null || (str5 = j19.j()) == null) {
            str5 = "";
        }
        xs4Var.set(11, str5);
        xs4Var.set(13, ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ni(rk4.j5.d(lp0Var)));
        bw5.v70 d28 = lp0Var.d();
        if (d28 == null || (j18 = d28.j()) == null || (str6 = j18.g()) == null) {
            str6 = "";
        }
        xs4Var.set(15, str6);
        xs4Var.set(16, rk4.j5.d(lp0Var));
        bw5.v70 d29 = lp0Var.d();
        if (d29 == null || (j17 = d29.j()) == null || (str7 = j17.d()) == null) {
            str7 = "";
        }
        xs4Var.set(6, str7);
        bw5.v70 d37 = lp0Var.d();
        xs4Var.set(18, java.lang.Integer.valueOf(d37 != null ? d37.f115722e : 0));
        xs4Var.set(19, rk4.l5.a(lp0Var));
        bw5.v70 d38 = lp0Var.d();
        if (d38 != null && (m13170xcc16feb8 = d38.m13170xcc16feb8()) != null) {
            str8 = m13170xcc16feb8;
        }
        xs4Var.set(20, str8);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getMusicShareObject listenType: ");
        sb6.append(xs4Var.m75939xb282bd08(18));
        sb6.append(", listenId: ");
        bw5.v70 d39 = lp0Var.d();
        sb6.append(d39 != null ? d39.m13170xcc16feb8() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingShareHelper", sb6.toString());
        return xs4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        if (r2 == null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g(bw5.lp0 r8) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cl4.v.g(bw5.lp0):java.lang.String");
    }

    public final void h(android.app.Activity activity, bw5.lp0 tingItem, bw5.d60 d60Var) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItem, "tingItem");
        if (d60Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingShareHelper", "setMusicToStatus commentInfo is null");
            return;
        }
        try {
            r45.wd6 wd6Var = new r45.wd6();
            bw5.v70 d17 = tingItem.d();
            wd6Var.f470611d = d17 != null ? d17.m13170xcc16feb8() : null;
            wd6Var.f470612e = d60Var.m11731x6e095e9(206) ? d60Var.W : "";
            str = android.util.Base64.encodeToString(wd6Var.mo14344x5f01b1f6(), 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingShareHelper", "getStatusFooterJumpListen exp: " + e17.getMessage());
            str = "";
        }
        if (r26.n0.N(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingShareHelper", "statusFooterJumpListen is null");
            return;
        }
        pj4.j0 j0Var = new pj4.j0();
        j0Var.f436672d = "15";
        j0Var.f436675g = str;
        java.util.List k17 = kz5.c0.k(j0Var);
        if (tingItem.d().f115722e == 1) {
            bw5.v70 d18 = tingItem.d();
            if (d18 != null && d18.m13172x6e095e9(106)) {
                bw5.v70 d19 = tingItem.d();
                if ((d19 != null ? d19.j() : null) != null) {
                    pj4.j0 j0Var2 = new pj4.j0();
                    j0Var2.f436672d = "1";
                    j0Var2.f436674f = ((nm3.e) ((qk.z8) i95.n0.c(qk.z8.class))).wi(tingItem);
                    k17.add(j0Var2);
                }
            }
        }
        pj4.j0 j0Var3 = new pj4.j0();
        j0Var3.f436672d = "3";
        j0Var3.f436674f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
        k17.add(j0Var3);
        xe0.g0 g0Var = (xe0.g0) i95.n0.c(xe0.g0.class);
        bi4.c1 c1Var = new bi4.c1();
        c1Var.b(d60Var.m11731x6e095e9(205) ? d60Var.V : "");
        java.lang.String Ni = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ni(rk4.j5.d(tingItem));
        bi4.d1 d1Var = c1Var.f102567a;
        d1Var.f436471e = Ni;
        c1Var.f("listen@inner");
        c1Var.g(d60Var.m11731x6e095e9(204) ? d60Var.U : "");
        c1Var.e(d60Var.m11731x6e095e9(203) ? d60Var.T : "");
        c1Var.h(d60Var.m11731x6e095e9(201) ? d60Var.S : "");
        c1Var.c(k17);
        d1Var.f436473g = false;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) g0Var).Ni(activity, 1003, d1Var);
    }

    public final void i(android.content.Context context, bw5.o50 item, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25176x66a813 c25176x66a813) {
        java.util.List<java.lang.String> m93112xf7c3a1a5;
        java.lang.Boolean m93108x1c728579;
        java.lang.Boolean m93107x28f59d60;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int i17 = item.f112497n;
        boolean z17 = i17 == 45 || i17 == 46;
        java.lang.String k17 = il4.d.k(item);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareAlbumToChat categoryId: ");
        sb6.append(item.c());
        sb6.append(", categoryType: ");
        sb6.append(item.f112497n);
        sb6.append(", coverUrl: %s, blockGroupChat: ");
        sb6.append((c25176x66a813 == null || (m93107x28f59d60 = c25176x66a813.m93107x28f59d60()) == null) ? false : m93107x28f59d60.booleanValue());
        sb6.append(", blockWeWork: ");
        sb6.append((c25176x66a813 == null || (m93108x1c728579 = c25176x66a813.m93108x1c728579()) == null) ? false : m93108x1c728579.booleanValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingShareHelper", sb6.toString(), k17);
        java.util.ArrayList arrayList = null;
        if (item.f112497n == 42) {
            java.lang.String k18 = gm0.j1.b().k();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(k18);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(k18);
            java.lang.String c17 = n07 != null ? n07.c() : null;
            bw5.mc0 mc0Var = new bw5.mc0();
            mc0Var.f111699e = q17.d1();
            boolean[] zArr = mc0Var.f111712u;
            zArr[2] = true;
            mc0Var.f111700f = q17.P0();
            zArr[3] = true;
            mc0Var.f111701g = c17;
            zArr[4] = true;
            item.f112515z = mc0Var;
            item.L1[20] = true;
        }
        java.lang.String d17 = d(item);
        if (d17 == null) {
            return;
        }
        java.lang.String Ri = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ri(k17 == null ? "" : k17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_content", d17);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("ForwardParams_EnableContentClick", false);
        intent.putExtra("Retr_show_success_tips", true);
        intent.putExtra("Retr_Msg_thumb_path", Ri);
        intent.putExtra("Retr_Msg_thumb_url", k17);
        if (c25176x66a813 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c25176x66a813.m93108x1c728579(), java.lang.Boolean.TRUE) : false) {
            intent.putExtra("Select_block_List", "wework");
        }
        if (c25176x66a813 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c25176x66a813.m93107x28f59d60(), java.lang.Boolean.TRUE) : false) {
            intent.putExtra("Select_Conv_Type", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(1, 2, 4));
        }
        int i18 = z17 ? 1008 : 1004;
        if (c25176x66a813 != null && (m93112xf7c3a1a5 = c25176x66a813.m93112xf7c3a1a5()) != null) {
            java.util.List V = kz5.n0.V(m93112xf7c3a1a5);
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) V).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((java.lang.String) next).length() > 0) {
                    arrayList.add(next);
                }
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            j45.l.v(context, ".ui.transmit.MsgRetransmitUI", intent, i18);
            return;
        }
        intent.putExtra("Retr_MsgQuickShare", true);
        intent.putExtra("Select_Conv_User", kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
        j45.l.v(context, ".ui.transmit.MsgRetransmitUI", intent, i18);
    }

    public final void j(android.content.Context context, bw5.o50 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Intent intent = new android.content.Intent();
        r45.km6 km6Var = new r45.km6();
        km6Var.f460371d = item.f112497n;
        km6Var.f460372e = il4.d.e(item);
        java.lang.String c17 = item.c();
        if (c17 == null) {
            c17 = "";
        }
        km6Var.f460373f = c17;
        java.lang.String m12638xb5887639 = item.m12638xb5887639();
        java.lang.String m12638xb58876392 = !(m12638xb5887639 == null || m12638xb5887639.length() == 0) ? item.m12638xb5887639() : "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/notsupport";
        java.lang.String k17 = il4.d.k(item);
        java.lang.String str = k17 != null ? k17 : "";
        if (!(str.length() == 0)) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ni(str);
        }
        intent.putExtra("Ksnsupload_ting_album_share_object_xml", cl4.g.a(km6Var));
        intent.putExtra("Ksnsupload_link", m12638xb58876392);
        intent.putExtra("Ksnsupload_title", item.m12637xfb82e301());
        intent.putExtra("Ksnsupload_type", 35);
        intent.putExtra("need_result", true);
        intent.putExtra("Ksnsupload_source", 1);
        j45.l.v(context, ".plugin.sns.ui.SnsUploadUI", intent, 1005);
    }

    public final void k(android.content.Context context, bw5.lp0 tingItem, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25176x66a813 c25176x66a813) {
        bw5.z90 j17;
        java.lang.Boolean m93108x1c728579;
        java.lang.Boolean m93107x28f59d60;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItem, "tingItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareMusicToChat listenId: %s, songName: %s, blockGroupChat: ");
        sb6.append((c25176x66a813 == null || (m93107x28f59d60 = c25176x66a813.m93107x28f59d60()) == null) ? false : m93107x28f59d60.booleanValue());
        sb6.append(", blockWeWork: ");
        sb6.append((c25176x66a813 == null || (m93108x1c728579 = c25176x66a813.m93108x1c728579()) == null) ? false : m93108x1c728579.booleanValue());
        java.lang.String sb7 = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[2];
        bw5.v70 d17 = tingItem.d();
        objArr[0] = d17 != null ? d17.m13170xcc16feb8() : null;
        bw5.v70 d18 = tingItem.d();
        objArr[1] = (d18 == null || (j17 = d18.j()) == null) ? null : j17.o();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingShareHelper", sb7, objArr);
        bw5.v70 d19 = tingItem.d();
        if (!il4.l.i(d19 != null ? d19.f115722e : 0)) {
            java.lang.String g17 = g(tingItem);
            if (g17 == null) {
                return;
            }
            java.lang.String Ri = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ri(rk4.j5.d(tingItem));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_content", g17);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("ForwardParams_EnableContentClick", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("Retr_Msg_thumb_path", Ri);
            intent.putExtra("Retr_Msg_thumb_url", rk4.j5.d(tingItem));
            if (c25176x66a813 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c25176x66a813.m93108x1c728579(), java.lang.Boolean.TRUE) : false) {
                intent.putExtra("Select_block_List", "wework");
            }
            if (c25176x66a813 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c25176x66a813.m93107x28f59d60(), java.lang.Boolean.TRUE) : false) {
                intent.putExtra("Select_Conv_Type", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(1, 2, 4));
            }
            j45.l.v(context, ".ui.transmit.MsgRetransmitUI", intent, 1001);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingShareHelper", "shareLocalFileToChat fileName: " + tingItem.d().i().b() + ", filePath: " + tingItem.d().i().m12386x5000ed37());
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c(tingItem.d().i().m12386x5000ed37()));
        c11286x34a5504.f33130x6942258 = tingItem.d().i().b();
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req();
        req.f33050x683188c = 0;
        req.f32866x7fa0d2de = null;
        req.f33049x38eb0007 = c11286x34a5504;
        android.os.Bundle bundle = new android.os.Bundle();
        req.mo48427x792022dd(bundle);
        bundle.putInt(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32808x6604d593, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a);
        bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8, "com.tencent.mm.openapi");
        bundle.putString("SendAppMessageWrapper_AppId", "");
        bundle.putBoolean("SendAppMessageWrapper_NoNeedStayInWeixin", true);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClassName(context, "com.tencent.mm.ui.transmit.SendAppMessageWrapperUI");
        intent2.putExtras(bundle);
        android.content.Intent intent3 = new android.content.Intent();
        intent3.setClassName(context, "com.tencent.mm.ui.transmit.SelectConversationUI");
        intent3.putExtra("Select_Conv_NextStep", intent2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent3);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/ting/helper/TingShareHelper", "shareLocalFileToChat", "(Landroid/content/Context;Lcom/tencent/wechat/aff/proto/TingItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/ting/helper/TingShareHelper", "shareLocalFileToChat", "(Landroid/content/Context;Lcom/tencent/wechat/aff/proto/TingItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void l(android.content.Context context, bw5.lp0 tingItem) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        bw5.z90 j17;
        java.lang.String d17;
        bw5.z90 j18;
        bw5.z90 j19;
        bw5.z90 j27;
        bw5.z90 j28;
        bw5.z90 j29;
        bw5.z90 j37;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingItem, "tingItem");
        bw5.v70 d18 = tingItem.d();
        int i17 = d18 != null ? d18.f115722e : 0;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936 c11289x4ff06936 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936();
        c11289x4ff06936.f33201x324c710a = rk4.j5.l(tingItem);
        c11289x4ff06936.f33198xc58aab80 = rk4.j5.k(tingItem);
        c11289x4ff06936.f33203x2b375427 = rk4.j5.c(tingItem);
        bw5.v70 d19 = tingItem.d();
        c11289x4ff06936.f33204x1478a44a = (d19 == null || (j37 = d19.j()) == null) ? null : j37.g();
        bw5.v70 d27 = tingItem.d();
        java.lang.String str5 = "";
        if (d27 == null || (j29 = d27.j()) == null || (str = j29.b()) == null) {
            str = "";
        }
        c11289x4ff06936.f33192xedb9d9a = str;
        bw5.v70 d28 = tingItem.d();
        if (d28 == null || (j28 = d28.j()) == null || (str2 = j28.e()) == null) {
            str2 = "";
        }
        c11289x4ff06936.f33199xd0293a5e = str2;
        bw5.v70 d29 = tingItem.d();
        c11289x4ff06936.f33197xafbf827 = (d29 == null || (j27 = d29.j()) == null) ? 0L : j27.f117428r;
        bw5.v70 d37 = tingItem.d();
        if (d37 == null || (j19 = d37.j()) == null || (str3 = j19.f()) == null) {
            str3 = "";
        }
        c11289x4ff06936.f33196x187d426e = str3;
        c11289x4ff06936.f33193x89444d94 = rk4.j5.e(tingItem);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11290x5453c607 c11290x5453c607 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11290x5453c607();
        bw5.v70 d38 = tingItem.d();
        if (d38 == null || (j18 = d38.j()) == null || (str4 = j18.j()) == null) {
            str4 = "";
        }
        c11290x5453c607.f33206x54340220 = str4;
        c11289x4ff06936.f33202x8b1eb086 = c11290x5453c607;
        java.lang.String str6 = c11289x4ff06936.f33201x324c710a;
        if (str6 == null || str6.length() == 0) {
            rk4.j jVar = rk4.m.f478367a;
            c11289x4ff06936.f33201x324c710a = rk4.m.f478368b;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
        c11286x34a5504.f33122xe4128443 = c11289x4ff06936;
        c11286x34a5504.f33130x6942258 = rk4.j5.j(tingItem);
        c11286x34a5504.f33121x993583fc = c11289x4ff06936.f33203x2b375427;
        c11286x34a5504.f33128x4f3b3aa0 = null;
        bw5.v70 d39 = tingItem.d();
        if (d39 != null && (j17 = d39.j()) != null && (d17 = j17.d()) != null) {
            str5 = d17;
        }
        c11286x34a5504.f33125x9b39409a = str5;
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        rk4.j5.d(tingItem);
        java.lang.String str7 = c11289x4ff06936.f33202x8b1eb086.f33206x54340220;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req();
        req.f33049x38eb0007 = c11286x34a5504;
        req.mo48427x792022dd(bundle);
        intent.putExtra("Ksnsupload_timeline", bundle);
        if (il4.l.k(i17)) {
            intent.putExtra("Ksnsupload_appid", rk4.j5.a(tingItem));
        }
        intent.putExtra("music_mv_cover_url", rk4.j5.d(tingItem));
        intent.putExtra("Ksnsupload_musicid", tingItem.d().m13170xcc16feb8());
        intent.putExtra("Ksnsupload_appname", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bnx));
        java.lang.String a17 = c01.n2.a("music_player");
        c01.n2.d().c(a17, true).i("prePublishId", "music_player");
        intent.putExtra("reportSessionId", a17);
        intent.putExtra("Ksnsupload_music_share_object_xml", ((m21.r) ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).wi(f(tingItem))).a());
        intent.putExtra("Ksnsupload_type", 37);
        intent.putExtra("need_result", true);
        intent.putExtra("Ksnsupload_source", 1);
        j45.l.v(context, ".plugin.sns.ui.SnsUploadUI", intent, 1002);
    }
}

package ni4;

/* loaded from: classes11.dex */
public final class x implements vg3.r4, com.p314xaae8f345.mm.p944x882e457a.j1 {

    /* renamed from: d, reason: collision with root package name */
    public static final ni4.x f419309d = new ni4.x();

    /* renamed from: e, reason: collision with root package name */
    public static final int f419310e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f419311f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f419312g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f419313h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f419314i;

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f419315m;

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f419316n;

    /* renamed from: o, reason: collision with root package name */
    public static final jz5.g f419317o;

    static {
        int dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        int dimensionPixelSize2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561224cq);
        int dimensionPixelSize3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        int dimensionPixelSize4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
        int dimensionPixelSize5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        f419310e = dimensionPixelSize5;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(1, java.lang.Integer.valueOf(dimensionPixelSize3));
        hashMap.put(2, java.lang.Integer.valueOf(dimensionPixelSize2));
        hashMap.put(3, java.lang.Integer.valueOf(dimensionPixelSize));
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put(1, java.lang.Integer.valueOf(dimensionPixelSize5));
        hashMap2.put(2, java.lang.Integer.valueOf(dimensionPixelSize4));
        hashMap2.put(3, java.lang.Integer.valueOf(dimensionPixelSize3));
        f419311f = hashMap2;
        f419312g = jz5.h.b(ni4.r.f419303d);
        f419313h = jz5.h.b(ni4.u.f419306d);
        f419314i = jz5.h.b(ni4.w.f419308d);
        jz5.h.b(ni4.t.f419305d);
        f419315m = jz5.h.b(ni4.i.f419302d);
        f419316n = jz5.h.b(ni4.v.f419307d);
        f419317o = jz5.h.b(ni4.s.f419304d);
    }

    public final void b(java.util.Map values) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        java.lang.String str = (java.lang.String) values.get(".sysmsg.modtextstatus.UserName");
        java.lang.String str2 = (java.lang.String) values.get(".sysmsg.modtextstatus.TextStatusID");
        java.lang.String str3 = (java.lang.String) values.get(".sysmsg.modtextstatus.TextStatusExtInfo");
        java.lang.String str4 = (java.lang.String) values.get(".sysmsg.modtextstatus.ProfileSeq");
        long parseLong = str4 != null ? java.lang.Long.parseLong(str4) : 0L;
        java.lang.String str5 = (java.lang.String) values.get(".sysmsg.modtextstatus.PrivateInfoVersion");
        float f17 = 0.0f;
        try {
            java.lang.String str6 = (java.lang.String) values.get(".sysmsg.modtextstatus.Scores.ContentScore");
            if (str6 != null) {
                f17 = java.lang.Float.parseFloat(str6);
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusInfoManager", "[dealModTextStatus] 0.0 parse fail, contentScore string = 0.0");
        }
        float f18 = f17;
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.TextStatusInfoManager", "dealModTextStatus: userName nil");
            return;
        }
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusInfoManager", "dealModTextStatus: delete " + str + ", " + parseLong);
            ai4.m0.f86706a.G().n(str);
            return;
        }
        long parseLong2 = str5 == null || str5.length() == 0 ? 0L : java.lang.Long.parseLong(str5);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealModTextStatus update >> privateInfoVersion:");
        sb6.append(parseLong2);
        sb6.append(", seq:");
        sb6.append(parseLong);
        sb6.append(", extInfoIsEmpty:");
        sb6.append(str3 == null || str3.length() == 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusInfoManager", sb6.toString());
        if (str3 != null && str3.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusInfoManager", "dealModTextStatus: only extinfo but empty");
            ai4.m0.f86706a.G().n(str);
        } else {
            pj4.b0 b0Var = new pj4.b0();
            b0Var.mo11468x92b714fd(android.util.Base64.decode(str3, 0));
            ai4.b.g(ai4.m0.f86706a, str, str2, b0Var, 4, null, parseLong, f18, null, null, false, sb1.a.f76732x366c91de, null);
        }
    }

    public final void c(java.util.Map values) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        if (bi4.v1.j()) {
            java.lang.String str = (java.lang.String) values.get(".sysmsg.statuscomment.from_username");
            java.lang.String str2 = (java.lang.String) values.get(".sysmsg.statuscomment.status_id");
            java.lang.String str3 = (java.lang.String) values.get(".sysmsg.statuscomment.comment_id");
            java.lang.String str4 = (java.lang.String) values.get(".sysmsg.statuscomment.root_comment_id");
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String str5 = (java.lang.String) values.get(".sysmsg.statuscomment.comment_ts_ms");
            long parseLong = str5 != null ? java.lang.Long.parseLong(str5) : 0L;
            int e17 = parseLong > 0 ? (int) (parseLong / 1000) : c01.id.e();
            java.lang.String str6 = (java.lang.String) values.get(".sysmsg.statuscomment.comment_content");
            java.lang.String str7 = (java.lang.String) values.get(".sysmsg.statuscomment.operation_type");
            int parseInt = str7 != null ? java.lang.Integer.parseInt(str7) : 0;
            java.lang.String str8 = (java.lang.String) values.get(".sysmsg.statuscomment.feed_owner_username");
            java.lang.String str9 = (java.lang.String) values.get(".sysmsg.statuscomment.comment_count");
            int parseInt2 = str9 != null ? java.lang.Integer.parseInt(str9) : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusInfoManager", "dealTextStatusComment: fromUserName:" + str + " textStatusId:" + str2 + " commentId:" + str3 + " operationType:" + parseInt + " createTime" + e17 + ' ');
            if (str3 == null || str3.length() == 0) {
                return;
            }
            if (str == null || str.length() == 0) {
                return;
            }
            mj4.h t17 = str2 != null ? qi4.p.f445309a.d(ai4.b0.f86659d).t(str2) : null;
            if (parseInt == 2) {
                if (str4.length() == 0) {
                    ai4.m0.f86706a.I(str3);
                } else {
                    ai4.m0.f86706a.I(str3);
                }
            } else if (parseInt != 2 && t17 != null) {
                mj4.e eVar = new mj4.e();
                eVar.f76558x75873205 = str;
                eVar.f76563x5493d43f = str2;
                eVar.f76555x81959a6e = e17;
                eVar.f76552xa8350b1f = str6;
                eVar.f76554xb8f426b5 = str3;
                eVar.f76562x940fbe73 = str4;
                eVar.f76564xa2260b25 = str8;
                mj4.k kVar = (mj4.k) t17;
                eVar.f76557x685e8417 = kVar.g();
                eVar.f76560xd302a37a = kVar.q();
                eVar.f76566x7b284d5e = kVar.i();
                eVar.f76565x2931c158 = null;
                eVar.f76561x225271db = 0;
                eVar.f76556x68e4d00a = 0;
                eVar.f76559xb0238158 = 0;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, en1.a.a())) {
                    ai4.m0 m0Var = ai4.m0.f86706a;
                    m0Var.q(eVar);
                    m0Var.e();
                }
            }
            if (t17 != null) {
                mj4.j jVar = new mj4.j((mj4.k) t17);
                jVar.f408599b.put("field_CommentCount", java.lang.Integer.valueOf(parseInt2));
                ai4.m0.f86706a.G().s(jVar.a());
            }
        }
    }

    public final mj4.i f(mj4.i iVar, pj4.b0 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.String str = info.f436504J;
        if (str == null) {
            str = "";
        }
        mj4.j jVar = (mj4.j) iVar;
        jVar.f408599b.put("field_Description", str);
        pj4.o0 o0Var = info.f436508g;
        java.lang.String str2 = o0Var != null ? o0Var.f436747e : null;
        if (str2 == null) {
            str2 = "";
        }
        java.util.HashMap hashMap = jVar.f408599b;
        hashMap.put("field_IconID", str2);
        pj4.o0 o0Var2 = info.f436508g;
        java.lang.String str3 = o0Var2 != null ? o0Var2.f436746d : null;
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("field_TopicId", str3);
        pj4.o0 o0Var3 = info.f436508g;
        java.lang.String str4 = o0Var3 != null ? o0Var3.f436755p : null;
        if (str4 == null) {
            str4 = "";
        }
        hashMap.put("field_ClusterId", str4);
        hashMap.put("field_MediaType", java.lang.Integer.valueOf(info.f436507f));
        java.lang.String str5 = info.f436509h;
        if (str5 == null) {
            str5 = "";
        }
        hashMap.put("field_MediaUrl", str5);
        java.lang.String str6 = info.f436510i;
        if (str6 == null) {
            str6 = "";
        }
        hashMap.put("field_MediaAESKey", str6);
        java.lang.String str7 = info.f436511m;
        if (str7 == null) {
            str7 = "";
        }
        hashMap.put("field_MediaThumbUrl", str7);
        java.lang.String str8 = info.f436512n;
        if (str8 == null) {
            str8 = "";
        }
        hashMap.put("field_MediaThumbAESKey", str8);
        java.lang.String str9 = info.f436517s;
        if (str9 == null) {
            str9 = "";
        }
        hashMap.put("field_PoiID", str9);
        java.lang.String str10 = info.f436518t;
        if (str10 == null) {
            str10 = "";
        }
        hashMap.put("field_PoiName", str10);
        hashMap.put("field_Latitude", java.lang.Double.valueOf(info.f436506e));
        hashMap.put("field_Longitude", java.lang.Double.valueOf(info.f436505d));
        hashMap.put("field_Visibility", java.lang.Integer.valueOf(info.f436513o));
        hashMap.put("field_ExpireTime", java.lang.Integer.valueOf(info.f436516r));
        hashMap.put("field_CreateTime", java.lang.Integer.valueOf(info.f436515q));
        java.lang.String str11 = info.f436522x;
        if (str11 == null) {
            str11 = "";
        }
        hashMap.put("field_backgroundId", str11);
        hashMap.put("field_option", java.lang.Long.valueOf(info.f436519u));
        hashMap.put("field_mediaWidth", java.lang.Integer.valueOf(info.f436520v));
        hashMap.put("field_mediaHeight", java.lang.Integer.valueOf(info.f436521w));
        java.lang.String str12 = info.C;
        if (str12 == null) {
            str12 = "";
        }
        hashMap.put("field_referenceUserName", str12);
        java.lang.String str13 = info.D;
        if (str13 == null) {
            str13 = "";
        }
        hashMap.put("field_referenceTextStatusId", str13);
        java.lang.String str14 = info.F;
        if (str14 == null) {
            str14 = "";
        }
        hashMap.put("field_duplicateUserName", str14);
        java.lang.String str15 = info.G;
        if (str15 == null) {
            str15 = "";
        }
        hashMap.put("field_duplicateTextStatusId", str15);
        java.lang.String str16 = info.Q;
        hashMap.put("field_City", str16 != null ? str16 : "");
        hashMap.put("field_sceneType", java.lang.Integer.valueOf(info.E));
        pj4.o0 o0Var4 = info.f436508g;
        hashMap.put("field_TopicInfo", o0Var4 != null ? o0Var4.mo14344x5f01b1f6() : null);
        pj4.z zVar = info.K;
        hashMap.put("field_EmojiInfo", zVar != null ? zVar.mo14344x5f01b1f6() : null);
        hashMap.put("field_statusExtInfoOriBytes", info.mo14344x5f01b1f6());
        hashMap.put("field_HasHb", java.lang.Integer.valueOf(info.T ? 1 : 0));
        return jVar;
    }

    public final li4.a h() {
        return (li4.a) ((jz5.n) f419315m).mo141623x754a37bb();
    }

    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        si4.a d17;
        mj4.h t17;
        if (map != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusInfoManager", "subtype:" + str + ", values:" + map);
            for (java.util.Map.Entry entry : map.entrySet()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusInfoManager", "[onNewXmlReceived] " + ((java.lang.String) entry.getKey()) + ": value:" + ((java.lang.String) entry.getValue()));
            }
            if (bi4.v1.e(str, false) == 2 || str == null) {
                return;
            }
            switch (str.hashCode()) {
                case -1813338250:
                    if (str.equals("textstatuslike")) {
                        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.textstatuslike.HashUserName");
                        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.textstatuslike.TextStatusID");
                        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.textstatuslike.LikeID");
                        if (str4 == null) {
                            str4 = "";
                        }
                        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.textstatuslike.Version");
                        int parseInt = str5 != null ? java.lang.Integer.parseInt(str5) : 0;
                        java.lang.String str6 = (java.lang.String) map.get(".sysmsg.textstatuslike.LikeCountVersion");
                        int parseInt2 = str6 != null ? java.lang.Integer.parseInt(str6) : 0;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusInfoManager", "dealTextStatusLike:textStatusId:%s version:%s likeCountVersion:%s likeId:%s hashUserName:%s", java.lang.Integer.valueOf(parseInt), java.lang.Integer.valueOf(parseInt2), str3, str4, str2);
                        if (str3 == null || str3.length() == 0) {
                            return;
                        }
                        if (str2 == null || str2.length() == 0) {
                            return;
                        }
                        si4.a d18 = qi4.p.f445309a.d(ai4.b0.f86659d);
                        java.lang.String str7 = (java.lang.String) map.get(".sysmsg.textstatuslike.DeleteFlag");
                        int parseInt3 = str7 != null ? java.lang.Integer.parseInt(str7) : 0;
                        ai4.m0 m0Var = ai4.m0.f86706a;
                        mj4.l y17 = m0Var.y(str2, str3);
                        mj4.h t18 = d18.t(str3);
                        if (parseInt3 != 1 || y17 == null) {
                            if (parseInt3 != 1 && t18 != null) {
                                if (y17 == null) {
                                    y17 = new mj4.l();
                                }
                                y17.f76605x8d8a3769 = str2;
                                y17.f76611x5493d43f = str3;
                                java.lang.String str8 = (java.lang.String) map.get(".sysmsg.textstatuslike.Type");
                                y17.f76613x2253a77f = str8 != null ? java.lang.Integer.parseInt(str8) : 0;
                                y17.f76607xcd7d4a17 = str4;
                                java.lang.String str9 = (java.lang.String) map.get(".sysmsg.textstatuslike.Notify");
                                y17.f76608xd13fb24e = str9 != null ? java.lang.Integer.parseInt(str9) : 0;
                                java.lang.String str10 = (java.lang.String) map.get(".sysmsg.textstatuslike.CreateTime");
                                y17.f76601x81959a6e = str10 != null ? java.lang.Integer.parseInt(str10) : 0;
                                y17.f76604x3554d688 = (java.lang.String) map.get(".sysmsg.textstatuslike.NickName");
                                y17.f76606x75d1dd31 = (java.lang.String) map.get(".sysmsg.textstatuslike.HeadImgUrl");
                                mj4.k kVar = (mj4.k) t18;
                                y17.f76603x685e8417 = kVar.g();
                                y17.f76615x7b284d5e = kVar.i();
                                y17.f76609xd302a37a = kVar.q();
                                y17.f76612x2931c158 = kVar.n();
                                if (((int) y17.f72763xa3c65b86) == -1) {
                                    m0Var.t(y17);
                                    if (y17.f76608xd13fb24e == 1) {
                                        m0Var.e();
                                    }
                                } else if (parseInt == 0 || parseInt > y17.f76614xecc06273) {
                                    y17.f76614xecc06273 = parseInt;
                                    m0Var.u(y17);
                                    if (y17.f76608xd13fb24e == 1) {
                                        m0Var.e();
                                    }
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.TextStatusInfoManager", "dealTextStatusLike: likeMsg update. version:%s field_Version:%s", java.lang.Integer.valueOf(parseInt), java.lang.Integer.valueOf(y17.f76614xecc06273));
                                }
                                ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                                qj4.s.l(qj4.s.f445491a, bk0.a.g().l(352280) ? 5L : 6L, null, null, 0L, null, 0L, 62, null);
                            }
                        } else if (parseInt == 0 || parseInt > y17.f76614xecc06273) {
                            y17.f76614xecc06273 = parseInt;
                            m0Var.C(y17);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.TextStatusInfoManager", "dealTextStatusLike: likeMsg delete. version:%s field_Version:%s", java.lang.Integer.valueOf(parseInt), java.lang.Integer.valueOf(y17.f76614xecc06273));
                        }
                        if (t18 != null) {
                            mj4.k kVar2 = (mj4.k) t18;
                            mj4.j jVar = new mj4.j(kVar2);
                            if (parseInt2 == 0 || parseInt2 > kVar2.f408600b.f76520x6e4d16c5) {
                                jVar.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.textstatuslike.LikeCount"), 0));
                                jVar.f408599b.put("field_LikeCountVersion", java.lang.Integer.valueOf(parseInt2));
                                m0Var.G().s(jVar.a());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case -1306850335:
                    if (str.equals("modtextstatus")) {
                        b(map);
                        return;
                    }
                    return;
                case -384935220:
                    if (str.equals("textstatusreference")) {
                        java.lang.String userName = (java.lang.String) map.get(".sysmsg.textstatusreference.UserName");
                        java.lang.String textStatusId = (java.lang.String) map.get(".sysmsg.textstatusreference.TextStatusID");
                        java.lang.String str11 = (java.lang.String) map.get(".sysmsg.textstatusreference.CreateTime");
                        int parseInt4 = str11 != null ? java.lang.Integer.parseInt(str11) : 0;
                        java.lang.String str12 = (java.lang.String) map.get(".sysmsg.textstatusreference.ReferenceCount");
                        int parseInt5 = str12 != null ? java.lang.Integer.parseInt(str12) : 0;
                        java.lang.String str13 = (java.lang.String) map.get(".sysmsg.textstatusreference.ShowType");
                        int parseInt6 = str13 != null ? java.lang.Integer.parseInt(str13) : 0;
                        if (textStatusId == null || textStatusId.length() == 0) {
                            return;
                        }
                        if ((userName == null || userName.length() == 0) || (t17 = (d17 = qi4.p.f445309a.d(ai4.b0.f86659d)).t(textStatusId)) == null) {
                            return;
                        }
                        mj4.p l17 = l();
                        l17.getClass();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textStatusId, "textStatusId");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(textStatusId);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(userName);
                        android.database.Cursor B = l17.f408612d.B("select rowid, * from TextStatusReference where TextStatusId = ? and UserName = ? ", new java.lang.String[]{textStatusId, userName});
                        mj4.o oVar = null;
                        if (B != null) {
                            if (B.moveToFirst()) {
                                oVar = new mj4.o();
                                oVar.mo9015xbf5d97fd(B);
                            }
                            B.close();
                        }
                        if (oVar == null) {
                            oVar = new mj4.o();
                        }
                        oVar.f76623x11b86abb = userName;
                        oVar.f76621x5493d43f = textStatusId;
                        oVar.f76616x81959a6e = parseInt4;
                        oVar.f76620xd6b859c = parseInt6;
                        mj4.k kVar3 = (mj4.k) t17;
                        oVar.f76624x7b284d5e = kVar3.i();
                        oVar.f76622x2931c158 = kVar3.n();
                        oVar.f76618x685e8417 = kVar3.g();
                        if (((int) oVar.f72763xa3c65b86) == -1) {
                            l().mo880xb970c2b9(oVar);
                        } else {
                            l().mo9952xce0038c9(oVar, new java.lang.String[0]);
                        }
                        long t19 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LAST_MARK_READ_TIME_LONG_SYNC, 0L);
                        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.k2.f255559d > 0;
                        if (java.lang.Math.abs(java.lang.System.currentTimeMillis() - t19) > 0 && !z17) {
                            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                            bk0.a.g().p(352280, true);
                        }
                        mj4.h t27 = d17.t(textStatusId);
                        if (t27 != null) {
                            mj4.j jVar2 = new mj4.j((mj4.k) t27);
                            jVar2.f408599b.put("field_referenceCount", java.lang.Integer.valueOf(parseInt5));
                            d17.s(jVar2.a());
                            return;
                        }
                        return;
                    }
                    return;
                case 1048566785:
                    if (str.equals("textstatusiconconfigrefresh")) {
                        bk4.i.a().P(2);
                        return;
                    }
                    return;
                case 1715205664:
                    if (str.equals("textstatuscomment")) {
                        c(map);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final d95.b0 i() {
        return (d95.b0) ((jz5.n) f419312g).mo141623x754a37bb();
    }

    public final li4.b k() {
        return (li4.b) ((jz5.n) f419317o).mo141623x754a37bb();
    }

    public final mj4.p l() {
        return (mj4.p) ((jz5.n) f419313h).mo141623x754a37bb();
    }

    public final li4.d m() {
        return (li4.d) ((jz5.n) f419316n).mo141623x754a37bb();
    }

    public final mj4.x n() {
        return (mj4.x) ((jz5.n) f419314i).mo141623x754a37bb();
    }

    public final void o() {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LASTTIME_CONV_UNREAD_INT, java.lang.Integer.valueOf(li4.a.J0(h(), 0, 1, null)));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }
}

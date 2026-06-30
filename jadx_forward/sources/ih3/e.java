package ih3;

@j95.b
/* loaded from: classes4.dex */
public class e extends i95.w implements tg3.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f373099d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f373100e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f373101f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f373102g = new java.util.LinkedList();

    public e() {
        new jt0.j(200);
        new jt0.j(500);
    }

    public java.lang.CharSequence Ai(java.lang.String str, android.os.Bundle bundle) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SysMsgTemplateImp", "hy: [digest] request translate content is null!");
            return null;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "sysmsg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SysMsgTemplateImp", "hy: [digest] not retrieved sysmsg from new xml!");
            return null;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.$type");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && "sysmsgtemplate".equals(str2)) {
            return Ri(d17, bundle, null, 1, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SysMsgTemplateImp", "hy: [digest] not acceptable sysmsg: %s", str2);
        return null;
    }

    public final boolean Bi(java.lang.String str) {
        return "link_profile".equals(str) || "link_revoke".equals(str) || "link_revoke_qrcode".equals(str) || "link_plain".equals(str) || "link_view_wxapp".equals(str) || "link_succeed_contact".equals(str) || "link_jump_chat".equals(str) || "link_admin_explain".equals(str) || "new_link_succeed_contact".equals(str) || "link_live".equals(str) || "link_url".equals(str) || "comment_link_profile".equals(str) || "link_revoke_unbindapp".equals(str) || "link_massend_url".equals(str) || "link_recommend_remark_open_image".equals(str) || "link_recommend_remark_url".equals(str) || "link_auto_translation_url".equals(str) || "link_unavailable_tips_url".equals(str) || "link_ecs_gift".equals(str) || "link_ecs_jump_info".equals(str) || "link_ecs_img".equals(str) || "link_history".equals(str);
    }

    public void Di(final java.lang.String str, final java.util.Map map, final android.os.Bundle bundle, final java.lang.ref.WeakReference weakReference, final java.lang.ref.WeakReference weakReference2) {
        try {
            java.lang.String string = bundle.getString("template_type");
            java.util.HashSet hashSet = (java.util.HashSet) ((java.util.HashMap) this.f373101f).get(string);
            if (hashSet != null) {
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((tg3.j1) it.next()).getClass();
                }
            }
            fs.g.c(tg3.i1.class, string, new fs.o() { // from class: ih3.e$$b
                @Override // fs.o
                public final boolean a(fs.n nVar) {
                    ((tg3.i1) nVar).qf(str, map, bundle, weakReference, weakReference2);
                    return false;
                }
            });
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SysMsgTemplateImp", e17, "", new java.lang.Object[0]);
        }
    }

    public final java.lang.CharSequence Ni(java.lang.String str, java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(".$hidden");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(sb6.toString()), 0) == 1) {
            return new android.text.SpannableString("");
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".plain");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str3 = str2 != null ? str2 : "";
        ((ke0.e) xVar).getClass();
        return new android.text.SpannableString(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v18, types: [android.text.SpannableString] */
    public final java.lang.CharSequence Ri(java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, int i17, java.lang.ref.WeakReference weakReference2) {
        java.lang.String str;
        java.util.ArrayList arrayList;
        int i18;
        java.util.ArrayList arrayList2;
        java.util.Iterator it;
        java.lang.String str2;
        java.lang.String str3;
        int i19;
        java.lang.String str4;
        int i27;
        java.lang.String str5;
        java.lang.CharSequence charSequence;
        java.lang.String str6;
        android.text.style.ClickableSpan[] clickableSpanArr;
        m90.z0 z0Var;
        java.lang.String str7;
        java.lang.String str8;
        java.util.Iterator it6;
        java.lang.String str9;
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc;
        java.util.Iterator it7;
        java.lang.String str10;
        boolean equals;
        java.lang.String str11;
        java.util.Iterator it8;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        int i28 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            sb6.append(i28 == 0 ? "" : java.lang.Integer.valueOf(i28));
            java.lang.String str12 = ".sysmsg.sysmsgtemplate.content_template" + sb6.toString();
            if (map.get(str12) == null) {
                if (arrayList4.size() != 0) {
                    return wi(arrayList4);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SysMsgTemplateImp", "hy: not handled");
                return new android.text.SpannableString("");
            }
            java.lang.String str13 = (java.lang.String) map.get(str12 + ".$type");
            if (!("tmpl_type_profile".equals(str13) || "tmpl_type_profilewithrevoke".equals(str13) || "tmpl_type_profilewithrevokeqrcode".equals(str13) || "tmpl_type_wxappnotifywithview".equals(str13) || "tmpl_type_succeed_contact".equals(str13) || "tmpl_type_jump_chat".equals(str13) || "tmpl_type_gamelife_link_url".equals(str13) || "tmpl_type_gamelife_plain".equals(str13) || "new_tmpl_type_succeed_contact".equals(str13) || "tmpl_type_chatroom_finder".equals(str13) || "tmpl_type_massend_newxml".equals(str13) || "tmpl_type_ecs_receive_gift".equals(str13) || "tmpl_type_ecs_jump_info".equals(str13) || "tmpl_type_profilewithrevokeandunbindapp".equals(str13))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SysMsgTemplateImp", "hy: non supported type: %s", str13);
                java.lang.CharSequence Ni = Ni(str12, map);
                arrayList4.add(Ni);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(Ni)) {
                    return wi(arrayList4);
                }
            }
            if (bundle != null) {
                bundle.putString("template_type", str13);
            }
            java.util.Iterator it9 = ((fs.e) ((fs.c) fs.g.f(tg3.d1.class)).all()).iterator();
            java.lang.String str14 = "";
            while (true) {
                str = "conv_talker_username";
                if (!it9.hasNext()) {
                    arrayList = arrayList4;
                    i18 = i28;
                    break;
                }
                fs.q qVar = (fs.q) it9.next();
                if (str13 != null && !str13.isEmpty() && qVar.mo210xb7045565(str13) && ((tg3.d1) qVar.get()) != null) {
                    if (bundle == null || (str10 = bundle.getString("conv_talker_username")) == null) {
                        str10 = "";
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str10);
                    if (z07 == null) {
                        it7 = it9;
                        equals = false;
                    } else {
                        it7 = it9;
                        equals = c01.z1.r().equals(z07.f69107x5be1edb3);
                    }
                    java.lang.String str15 = equals ? "owner" : "member";
                    java.util.Iterator it10 = m90.f1.f406396d.iterator();
                    while (true) {
                        i18 = i28;
                        str11 = "";
                        while (it10.hasNext()) {
                            it8 = it10;
                            java.lang.String str16 = (java.lang.String) it10.next();
                            arrayList3 = arrayList4;
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) map.get(str12 + ".template" + str16 + ".$type"), str15)) {
                                str11 = (java.lang.String) map.get(str12 + ".template" + str16);
                                if (str11 == null) {
                                    break;
                                }
                            }
                            arrayList4 = arrayList3;
                            it10 = it8;
                        }
                        i28 = i18;
                        arrayList4 = arrayList3;
                        it10 = it8;
                    }
                    arrayList = arrayList4;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandleFinderTemplateParseListener", "[onParse] roomId=" + str10 + " handleType=" + i17 + " targetType=" + str15 + " templateStr=" + str11);
                    str14 = str11;
                    if (!str11.isEmpty()) {
                        break;
                    }
                } else {
                    it7 = it9;
                    arrayList = arrayList4;
                    i18 = i28;
                }
                it9 = it7;
                i28 = i18;
                arrayList4 = arrayList;
            }
            java.util.Iterator it11 = ((fs.e) ((fs.c) fs.g.f(tg3.e1.class)).all()).iterator();
            while (it11.hasNext()) {
                fs.q qVar2 = (fs.q) it11.next();
                if (str13 != null && !str13.isEmpty() && qVar2.mo210xb7045565(str13) && ((tg3.e1) qVar2.get()) != null) {
                    java.lang.String str17 = (java.lang.String) map.get(str12 + ".reportextradata");
                    if (str17 != null) {
                        java.lang.String b17 = fp.s0.b(str17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                        if (weakReference2 != null && (c23001x9d3a0bdc = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) weakReference2.get()) != null) {
                            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                            str8 = str13;
                            aVar.pk(c23001x9d3a0bdc, "ecs_new_xml_jump_view");
                            it6 = it11;
                            str9 = str;
                            aVar.Tj(c23001x9d3a0bdc, 32, 12, false);
                            aVar.gk(c23001x9d3a0bdc, kz5.b1.e(new jz5.l("reportextradata", b17)));
                            str13 = str8;
                            it11 = it6;
                            str = str9;
                        }
                    }
                }
                str8 = str13;
                it6 = it11;
                str9 = str;
                str13 = str8;
                it11 = it6;
                str = str9;
            }
            java.lang.String str18 = str;
            if (str14.isEmpty()) {
                str14 = (java.lang.String) map.get(str12 + ".template");
            }
            java.util.ArrayList a17 = ih3.p.a(str14);
            if (a17 != null) {
                a17.size();
            }
            if (a17 == null || a17.size() == 0) {
                arrayList2 = arrayList;
                arrayList2.add(new android.text.SpannableString(""));
            } else {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.util.Iterator it12 = a17.iterator();
                while (it12.hasNext()) {
                    ih3.o oVar = (ih3.o) it12.next();
                    int i29 = oVar.f373129a;
                    java.lang.String str19 = oVar.f373130b;
                    if (i29 == 0) {
                        java.util.Iterator it13 = this.f373102g.iterator();
                        while (true) {
                            if (!it13.hasNext()) {
                                z0Var = null;
                                break;
                            }
                            m90.z0 z0Var2 = (m90.z0) ((tg3.f1) it13.next());
                            z0Var2.getClass();
                            if (java.lang.Boolean.valueOf(map.containsKey(".sysmsg.sysmsgtemplate.content_template.link_list.link.redpacketinfo")).booleanValue()) {
                                z0Var = z0Var2;
                                break;
                            }
                        }
                        if (z0Var == null) {
                            java.util.Iterator it14 = ((fs.e) ((fs.c) fs.g.f(tg3.h1.class)).all()).iterator();
                            while (true) {
                                if (!it14.hasNext()) {
                                    break;
                                }
                                m90.z0 z0Var3 = (m90.z0) ((tg3.h1) ((fs.q) it14.next()).get());
                                z0Var3.getClass();
                                if (java.lang.Boolean.valueOf(map.containsKey(".sysmsg.sysmsgtemplate.content_template.link_list.link.redpacketinfo")).booleanValue()) {
                                    z0Var = z0Var3;
                                    break;
                                }
                            }
                        }
                        if (z0Var != null) {
                            java.lang.String str20 = (java.lang.String) map.get(".sysmsg.sysmsgtemplate.content_template.link_list.link.redpacketinfo.objectid");
                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            if (str20 == null) {
                                str20 = "";
                            }
                            java.lang.Long valueOf = java.lang.Long.valueOf(pm0.v.Z(str20));
                            java.lang.String str21 = (java.lang.String) map.get(".sysmsg.sysmsgtemplate.content_template.link_list.link.redpacketinfo.liveid");
                            if (str21 == null) {
                                str21 = "";
                            }
                            java.lang.Long valueOf2 = java.lang.Long.valueOf(pm0.v.Z(str21));
                            java.lang.String str22 = (java.lang.String) map.get(".sysmsg.sysmsgtemplate.content_template.link_list.link.redpacketinfo.objectnonceid");
                            java.lang.String str23 = str22 == null ? "" : str22;
                            java.lang.String str24 = (java.lang.String) map.get(".sysmsg.sysmsgtemplate.content_template.link_list.link.redpacketinfo.findernickname");
                            if (str24 == null) {
                                str24 = "";
                            }
                            java.lang.String str25 = (java.lang.String) map.get(".sysmsg.sysmsgtemplate.content_template.link_list.link.redpacketinfo.redpacketsendid");
                            java.lang.String str26 = str25 == null ? "" : str25;
                            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573336ea3);
                            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573337ea4, str24, string);
                            int indexOf = string2.indexOf(string);
                            if (indexOf == -1 || string.length() + indexOf > string2.length()) {
                                it = it12;
                                str7 = str19;
                            } else {
                                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                ((ke0.e) xVar).getClass();
                                ?? i37 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, string2);
                                it = it12;
                                android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getIdentifier("systemmessages_hongbaoicon", "drawable", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName()));
                                if (drawable != null) {
                                    int dimensionPixelOffset = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561441im);
                                    drawable.setBounds(0, 0, dimensionPixelOffset, dimensionPixelOffset);
                                    al5.w wVar = new al5.w(drawable, 1);
                                    int indexOf2 = string2.indexOf(8197);
                                    if (indexOf2 >= 0 && indexOf2 < string2.length() - 1) {
                                        i37.setSpan(wVar, indexOf2, indexOf2 + 1, 18);
                                    }
                                }
                                i37.setSpan(new sg3.l(5, null, valueOf, valueOf2, str23, str26), indexOf, string.length() + indexOf, 33);
                                str7 = i37;
                            }
                            arrayList5.add(str7);
                        } else {
                            it = it12;
                            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            ((ke0.e) xVar2).getClass();
                            arrayList5.add(new android.text.SpannableString(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, str19)));
                        }
                        str2 = str18;
                    } else {
                        it = it12;
                        int i38 = 1;
                        if (i29 == 1) {
                            int i39 = 0;
                            java.lang.String str27 = str19;
                            while (true) {
                                java.lang.String str28 = i39 != 0 ? ".sysmsg.sysmsgtemplate.content_template.link_list.link" + i39 : ".sysmsg.sysmsgtemplate.content_template.link_list.link";
                                if (((java.lang.String) map.get(str28)) == null) {
                                    str2 = str18;
                                    break;
                                }
                                if (str27.equals((java.lang.String) map.get(str28 + ".$name"))) {
                                    java.lang.String str29 = (java.lang.String) map.get(str28 + ".$type");
                                    if (i17 != 0) {
                                        str3 = str27;
                                        i19 = i38;
                                        str4 = str18;
                                        i27 = i39;
                                        if (i17 != i19) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SysMsgTemplateImp", "hy: not supported digest type");
                                        } else if (Bi(str29)) {
                                            java.util.HashMap hashMap = (java.util.HashMap) this.f373100e;
                                            java.util.List list = (java.util.List) hashMap.get(str29);
                                            if (list != null && list.size() > 0) {
                                                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((java.util.LinkedList) hashMap.get(str29)).getLast());
                                            }
                                            java.util.Iterator it15 = ((fs.e) ((fs.c) fs.g.f(tg3.b1.class)).all()).iterator();
                                            java.lang.String str30 = null;
                                            while (it15.hasNext()) {
                                                fs.q qVar3 = (fs.q) it15.next();
                                                if (qVar3.mo210xb7045565(str29)) {
                                                    str30 = ((tg3.b1) qVar3.get()).Bb(map, str28, bundle);
                                                }
                                            }
                                            if (str30 != null) {
                                                int length = str30.length();
                                                java.lang.String str31 = str30;
                                                if (length == 0) {
                                                    str31 = new android.text.SpannableString("");
                                                }
                                                arrayList5.add(str31);
                                            } else {
                                                arrayList5.add(Ni(str28, map));
                                            }
                                        } else {
                                            arrayList5.add(Ni(str28, map));
                                        }
                                    } else if (Bi(str29)) {
                                        java.util.HashMap hashMap2 = (java.util.HashMap) this.f373099d;
                                        java.util.List list2 = (java.util.List) hashMap2.get(str29);
                                        if ("link_ecs_gift".equals(str29)) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SysMsgTemplateImp", "translateInternal, type is %s, node size is %d", str29, java.lang.Integer.valueOf(arrayList5.size()));
                                            arrayList5.add(0, "<img src=\"systemmessages_ecsgifticon.png\"/>");
                                        }
                                        java.lang.Object obj = (list2 == null || list2.size() <= 0) ? null : (tg3.g1) ((java.util.LinkedList) hashMap2.get(str29)).getLast();
                                        if (obj != null) {
                                            ih3.k kVar = (ih3.k) obj;
                                            java.lang.String str32 = str18;
                                            java.lang.String string3 = bundle.getString(str32, "");
                                            i27 = i39;
                                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str28)) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SysMsgTemp.SysMsgTemplateLinkHandlerBase", "hy: non header!!");
                                            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SysMsgTemp.SysMsgTemplateLinkHandlerBase", "hy: not resolved talker!!");
                                            } else {
                                                str5 = str28;
                                                str3 = str27;
                                                str4 = str32;
                                                i19 = 1;
                                                charSequence = kVar.f373125a.b(map, str28, bundle, weakReference, weakReference2);
                                            }
                                            str5 = str28;
                                            str3 = str27;
                                            str4 = str32;
                                            charSequence = null;
                                            i19 = 1;
                                        } else {
                                            str5 = str28;
                                            str3 = str27;
                                            str4 = str18;
                                            i19 = 1;
                                            i27 = i39;
                                            java.util.Iterator it16 = ((fs.e) ((fs.c) fs.g.f(tg3.c1.class)).all()).iterator();
                                            charSequence = null;
                                            while (it16.hasNext()) {
                                                fs.q qVar4 = (fs.q) it16.next();
                                                if (qVar4.mo210xb7045565(str29)) {
                                                    str6 = str29;
                                                    charSequence = ((tg3.c1) qVar4.get()).Ya(map, str5, bundle, weakReference, weakReference2);
                                                } else {
                                                    str6 = str29;
                                                }
                                                str29 = str6;
                                            }
                                        }
                                        if (charSequence != null) {
                                            if (charSequence.length() > 0 && (charSequence instanceof android.text.Spanned) && (clickableSpanArr = (android.text.style.ClickableSpan[]) ((android.text.Spanned) charSequence).getSpans(0, charSequence.length(), android.text.style.ClickableSpan.class)) != null && clickableSpanArr.length > 0) {
                                                for (android.text.style.ClickableSpan clickableSpan : clickableSpanArr) {
                                                    if (!(clickableSpan instanceof gb5.a)) {
                                                        throw new java.lang.IllegalArgumentException("hy: actively throw Exception!!! all clickable spans must be instance of com.tencent.mm.ui.base.span.IPressableSpan!");
                                                    }
                                                }
                                            }
                                            if (charSequence.length() == 0) {
                                                charSequence = new android.text.SpannableString("");
                                            }
                                            arrayList5.add(charSequence);
                                        } else {
                                            java.lang.Object[] objArr = new java.lang.Object[i19];
                                            objArr[0] = java.lang.Boolean.valueOf((boolean) (obj == null ? i19 : 0));
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SysMsgTemplateImp", "listener == null: %b", objArr);
                                            arrayList5.add(Ni(str5, map));
                                        }
                                    } else {
                                        str3 = str27;
                                        i19 = i38;
                                        str4 = str18;
                                        i27 = i39;
                                        java.lang.Object[] objArr2 = new java.lang.Object[i19];
                                        java.lang.String str33 = str29;
                                        if (str33 == null) {
                                            str33 = "";
                                        }
                                        objArr2[0] = str33;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SysMsgTemplateImp", "not support link type: %s", objArr2);
                                        arrayList5.add(Ni(str28, map));
                                    }
                                } else {
                                    str3 = str27;
                                    i19 = i38;
                                    str4 = str18;
                                    i27 = i39;
                                }
                                i39 = i27 + 1;
                                i38 = i19;
                                str18 = str4;
                                str27 = str3;
                            }
                        } else {
                            str2 = str18;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SysMsgTemplateImp", "hy: invalid! should not get here");
                        }
                    }
                    str18 = str2;
                    it12 = it;
                }
                arrayList2 = arrayList;
                arrayList2.add(wi(arrayList5));
            }
            i28 = i18 + 1;
            arrayList4 = arrayList2;
        }
    }

    public final java.lang.CharSequence wi(java.util.ArrayList arrayList) {
        java.lang.CharSequence spannableString = new android.text.SpannableString("");
        if (arrayList == null) {
            return spannableString;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            spannableString = android.text.TextUtils.concat(spannableString, (java.lang.CharSequence) it.next());
        }
        return spannableString;
    }
}

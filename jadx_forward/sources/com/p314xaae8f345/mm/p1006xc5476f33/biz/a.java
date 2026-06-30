package com.p314xaae8f345.mm.p1006xc5476f33.biz;

@j95.b
/* loaded from: classes9.dex */
public class a extends i95.w implements bq1.l {
    public java.lang.String Ai(java.lang.String str, java.lang.String str2) {
        kk.j jVar = ot0.g0.f430010a;
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgBizHelper", "getAppMsgDyeingTempTitle fail, values is null");
            return " ";
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
        java.lang.String str3 = (java.lang.String) d17.get(".msg.appmsg.title");
        if (str3 == null) {
            str3 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            str3 = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.title");
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? " " : str3;
    }

    public boolean Bi(java.lang.String str) {
        kk.j jVar = ot0.g0.f430010a;
        return k01.o.a(str);
    }

    public ot0.m0 Di(long j17, java.lang.String str) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        long j18 = 0;
        int i17 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
        java.lang.Object obj = ot0.g0.f430010a;
        if (i17 > 0) {
            ot0.r0 r0Var = (ot0.r0) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) obj).get(java.lang.Long.valueOf(j17));
            if (r0Var != null) {
                return r0Var;
            }
        }
        java.util.Map x17 = ot0.q.x(str);
        if (x17 == null) {
            x17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
        }
        if (x17 == null) {
            return new ot0.r0();
        }
        int i18 = 0;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(".msg.appmsg.mmreader.category.$type"), 0);
        java.lang.String str2 = (java.lang.String) x17.get(".msg.appmsg.mmreader.name");
        if (str2 == null) {
            str2 = "";
        }
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(".msg.appmsg.mmreader.forbid_forward"), 0);
        int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(".msg.appmsg.mmreader.category.$count"), 0);
        java.lang.String str3 = (java.lang.String) x17.get(".msg.commenturl");
        ot0.r0 r0Var2 = new ot0.r0();
        r0Var2.f430109d = P;
        r0Var2.f430110e = str2;
        r0Var2.f430113h = str3;
        r0Var2.f430115m = P2;
        int i19 = 0;
        while (i19 < P3) {
            ot0.s0 s0Var = new ot0.s0();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".msg.appmsg.mmreader.category.item");
            sb6.append(i19 == 0 ? "" : "" + i19);
            java.lang.String sb7 = sb6.toString();
            s0Var.f430294d = (java.lang.String) x17.get(sb7 + ".title");
            s0Var.f430295e = (java.lang.String) x17.get(sb7 + ".url");
            s0Var.f430296f = (java.lang.String) x17.get(sb7 + ".shorturl");
            s0Var.f430297g = (java.lang.String) x17.get(sb7 + ".longurl");
            s0Var.f430298h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) x17.get(sb7 + ".pub_time"), j18);
            s0Var.f430301m = (java.lang.String) x17.get(sb7 + ".tweetid");
            s0Var.f430302n = (java.lang.String) x17.get(sb7 + ".digest");
            s0Var.f430303o = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(sb7 + ".itemshowtype"), i18);
            s0Var.f430307q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(sb7 + ".play_length"), i18);
            s0Var.f430299i = (java.lang.String) x17.get(sb7 + ".cover");
            java.lang.String str4 = (java.lang.String) x17.get(sb7 + ".cover_235_1");
            java.lang.String str5 = (java.lang.String) x17.get(sb7 + ".cover_16_9");
            s0Var.N = str5;
            if ((s0Var.f430303o != 5 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.f430299i)) {
                s0Var.f430299i = str4;
            }
            if (s0Var.f430303o == 8 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                s0Var.f430299i = str5;
            }
            if (s0Var.f430303o == 5 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                s0Var.f430299i = str5;
            }
            int i27 = 0;
            while (true) {
                linkedList = s0Var.H;
                if (i27 >= 100) {
                    break;
                }
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(sb7);
                sb8.append(".pic_urls.pic_url");
                sb8.append(i27 == 0 ? "" : "" + i27);
                java.lang.String str6 = (java.lang.String) x17.get(sb8.toString());
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                    break;
                }
                linkedList.add(str6);
                i27++;
            }
            if (linkedList.isEmpty() && !android.text.TextUtils.isEmpty(s0Var.f430299i)) {
                linkedList.add(s0Var.f430299i);
            }
            int i28 = 0;
            while (true) {
                linkedList2 = s0Var.f430300l1;
                if (i28 >= 100) {
                    break;
                }
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(sb7);
                sb9.append(".multi_picture_cover.cover_url");
                sb9.append(i28 == 0 ? "" : "" + i28);
                java.lang.String str7 = (java.lang.String) x17.get(sb9.toString());
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                    break;
                }
                linkedList2.add(str7);
                i28++;
            }
            for (int i29 = 0; i29 < 10; i29++) {
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                sb10.append(sb7);
                sb10.append(".preload_picture_info.cdn_url");
                sb10.append(i29 == 0 ? "" : "" + i29);
                java.lang.String str8 = (java.lang.String) x17.get(sb10.toString());
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8)) {
                    break;
                }
                s0Var.Z.add(str8);
            }
            if (linkedList2.isEmpty() && !android.text.TextUtils.isEmpty(s0Var.f430299i)) {
                linkedList2.add(s0Var.f430299i);
            }
            s0Var.f430306p1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(sb7 + ".multi_picture_cover.status"), 0);
            s0Var.D = (java.lang.String) x17.get(sb7 + ".cover_1_1");
            s0Var.f430304p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(sb7 + ".del_flag"), 0);
            s0Var.f430308r = (java.lang.String) x17.get(sb7 + ".weapp_username");
            s0Var.f430309s = (java.lang.String) x17.get(sb7 + ".weapp_path");
            s0Var.f430310t = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(sb7 + ".weapp_version"), 0);
            s0Var.f430311u = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(sb7 + ".weapp_state"), 0);
            s0Var.f430312v = (java.lang.String) x17.get(sb7 + ".weapp_appid");
            s0Var.f430313w = (java.lang.String) x17.get(sb7 + ".weapp_image_url");
            s0Var.f430314x = (java.lang.String) x17.get(sb7 + ".weapp_icon");
            s0Var.f430316y = (java.lang.String) x17.get(sb7 + ".weapp_nickname");
            s0Var.f430318z = (java.lang.String) x17.get(sb7 + ".play_url");
            s0Var.A = (java.lang.String) x17.get(sb7 + ".player");
            s0Var.B = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(sb7 + ".music_source"), 1);
            s0Var.C = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(sb7 + ".pic_num"), 1);
            s0Var.E = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(sb7 + ".video_width"), 0);
            s0Var.F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(sb7 + ".video_height"), 0);
            s0Var.I = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(sb7 + ".is_pay_subscribe"), 0);
            s0Var.L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) x17.get(sb7 + ".comment_topic_id"), 0L);
            s0Var.G = (java.lang.String) x17.get(sb7 + ".vid");
            s0Var.M = str;
            s0Var.X = (java.lang.String) x17.get(sb7 + ".cover_235_1");
            s0Var.N = (java.lang.String) x17.get(sb7 + ".cover_16_9");
            s0Var.f430305p0 = (java.lang.String) x17.get(sb7 + ".cover_3_4");
            s0Var.P = (java.lang.String) x17.get(sb7 + ".voice_id");
            s0Var.Q = (java.lang.String) x17.get(sb7 + ".tid");
            s0Var.R = (java.lang.String) x17.get(sb7 + ".nonce_id");
            s0Var.S = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(sb7 + ".voice_type"), 0);
            s0Var.T = (java.lang.String) x17.get(sb7 + ".text_title");
            ot0.m3 m3Var = new ot0.m3();
            m3Var.f430123d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(sb7 + ".product_activity.activity_type"), 0);
            m3Var.f430124e = (java.lang.String) x17.get(sb7 + ".product_activity.activity_tag");
            m3Var.f430125f = (java.lang.String) x17.get(sb7 + ".product_activity.activity_content");
            s0Var.V = m3Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgBizHelper", "text_title:%s", s0Var.T);
            s0Var.U = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(sb7 + ".has_redpacket_cover"), 0);
            s0Var.W = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(sb7 + ".has_redpacket_cover_v2"), 0);
            s0Var.Y = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) x17.get(sb7 + ".has_gift_activity"), 0);
            r0Var2.f430114i.add(s0Var);
            i19++;
            i17 = i17;
            i18 = 0;
            j18 = 0;
            P3 = P3;
        }
        int i37 = i17;
        int i38 = P3;
        r01.g0.c(x17);
        java.lang.String str9 = (java.lang.String) x17.get(".msg.fromusername");
        java.lang.String str10 = str9 != null ? str9 : "";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str10)) {
            java.lang.String f27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m(str10).f2();
            r0Var2.f430111f = str10;
            r0Var2.f430112g = f27;
        }
        if (i37 > 0) {
            ((kk.l) obj).j(java.lang.Long.valueOf(j17), r0Var2);
            ot0.g0.f430011b.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i38));
        }
        return r0Var2;
    }

    public java.lang.String Ni(java.lang.String str) {
        return ot0.g0.k(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public int wi(android.content.Context context, r01.b2 contentInfo) {
        int i17;
        int i18;
        java.lang.String str;
        android.content.Intent intent;
        java.lang.String str2;
        int i19;
        int i27;
        qk.o oVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentInfo, "contentInfo");
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(contentInfo.f449561b, "msg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgBizClickHandler", "values map is null.");
        } else {
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.template_op_type"), -1);
            long j17 = contentInfo.f449562c;
            java.lang.String str3 = contentInfo.f449565f;
            if (P == -1 || P == 0) {
                java.lang.String str4 = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.url");
                java.lang.String str5 = (java.lang.String) d17.get(".msg.appmsg.template_id");
                java.lang.String str6 = (java.lang.String) d17.get(".msg.fromusername");
                java.lang.String f27 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6) ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str6, true).f2() : null;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                int i28 = (int) (currentTimeMillis / 1000);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgBizClickHandler", "WebViewClickListener onClick = %d", java.lang.Integer.valueOf(i28));
                if (str4 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, "")) {
                    return 2;
                }
                java.lang.String b17 = ot0.g0.b(str4, 0, 10000, i28, null, "");
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("rawUrl", b17);
                intent2.putExtra("shortUrl", b17);
                intent2.putExtra("KTemplateId", str5);
                android.os.Bundle bundle = new android.os.Bundle();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str3, true);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "get(...)");
                if (n17.k2()) {
                    intent2.putExtra("geta8key_scene", 7);
                    i17 = 4;
                } else {
                    i17 = 0;
                }
                intent2.putExtra("msg_id", contentInfo.f449563d);
                intent2.putExtra("msg_talker", str3);
                intent2.putExtra("KPublisherId", "msg_" + j17);
                intent2.putExtra("pre_username", str3);
                intent2.putExtra("prePublishId", "msg_" + j17);
                intent2.putExtra("preChatName", str3);
                bundle.putInt("snsWebSource", i17);
                intent2.putExtra("jsapiargs", bundle);
                intent2.putExtra("geta8key_username", str3);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                    i18 = 1;
                } else {
                    intent2.putExtra("srcUsername", str6);
                    intent2.putExtra("srcDisplayname", f27);
                    i18 = 1;
                    intent2.putExtra("mode", 1);
                }
                intent2.putExtra("from_scence", i18);
                intent2.putExtra("start_activity_time", currentTimeMillis);
                intent2.putExtra("key_enable_teen_mode_check", (boolean) i18);
                intent2.putExtra("key_enable_fts_quick", (boolean) i18);
                intent2.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(2)) {
                    str = "rawUrl";
                    intent = intent2;
                    if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(context, b17, 0, false, 0, 10000, intent)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgBizClickHandler", "jump to TmplWebview");
                        return i18;
                    }
                } else {
                    str = "rawUrl";
                    intent = intent2;
                }
                intent.putExtra(str, b17);
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                return i18;
            }
            if (P == 1) {
                java.lang.String str7 = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.weapp_username");
                java.lang.String str8 = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.weapp_path");
                int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.weapp_version"), 0);
                int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.weapp_state"), 0);
                java.lang.String str9 = (java.lang.String) d17.get(".msg.appmsg.template_id");
                if (str9 == null) {
                    str9 = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgBizClickHandler", "on app brand(%s) container click", str7);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(j17);
                sb6.append(':');
                java.lang.String str10 = contentInfo.f449564e;
                sb6.append(str10);
                sb6.append(':');
                sb6.append(str3);
                sb6.append(':');
                sb6.append(str9);
                c12559xbdae8559.f169324g = sb6.toString();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(str10)) {
                    c12559xbdae8559.f169323f = r26.i0.y(str9, "SUBSCRIPTION", false) ? 1107 : 1014;
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f398545a = str7;
                    b1Var.f398549c = P3;
                    b1Var.f398551d = P2;
                    b1Var.f398555f = str8;
                    b1Var.a(c12559xbdae8559);
                    java.lang.String str11 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.native_extra_data");
                    str2 = str11 != null ? str11 : "";
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        b1Var.f398561i = new ot0.v(str2);
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
                } else {
                    c12559xbdae8559.f169323f = 1043;
                    str2 = str10 != null ? str10 : "";
                    int length = str2.length() - 1;
                    boolean z17 = false;
                    int i29 = 0;
                    while (i29 <= length) {
                        boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(str2.charAt(!z17 ? i29 : length), 32) <= 0;
                        if (z17) {
                            if (!z18) {
                                break;
                            }
                            length--;
                        } else if (z18) {
                            i29++;
                        } else {
                            z17 = true;
                        }
                    }
                    java.lang.String obj = str2.subSequence(i29, length + 1).toString();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
                        i19 = P3;
                        i27 = P2;
                        oVar = null;
                    } else {
                        oVar = r01.z.b(obj);
                        if (oVar == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppMsgBizClickHandler", "prepare to launch weapp, but bizInfo is null, username: %s", obj);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1908L, 10, 1L, false);
                            km5.d h17 = ((km5.q) km5.u.d()).h(new ot0.y(context)).i(new ot0.a0(obj)).n(new ot0.c0(obj)).h(ot0.d0.f429973a);
                            lm5.j jVar = lm5.d.f401133a;
                            km5.q qVar = (km5.q) h17;
                            qVar.t(jVar, ot0.e0.f429981a);
                            qVar.b(jVar, new ot0.w(obj, context, str7, P3, P2, str8, c12559xbdae8559));
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1908L, 0, 1L, false);
                        } else {
                            i19 = P3;
                            i27 = P2;
                        }
                    }
                    java.lang.String str12 = oVar == null ? null : oVar.f66730x28d45f97;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgBizClickHandler", "prepare to launch weapp, from(username:%s, appId:%s), weappUsername:%s", obj, str12, str7);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Vi(context, str7, null, i19, i27, str8, c12559xbdae8559, str12);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1908L, 1, 1L, false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1908L, 0, 1L, false);
                }
                return 1;
            }
        }
        return 2;
    }
}

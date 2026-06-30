package cl4;

/* loaded from: classes11.dex */
public final class v {
    public final java.lang.String a(bw5.o50 o50Var) {
        java.lang.String nickname;
        bw5.mc0 b17 = o50Var.b();
        if (b17 == null || (nickname = b17.getNickname()) == null) {
            return o50Var.L1[7] ? o50Var.f30963m : "";
        }
        return nickname;
    }

    public final void b(android.app.Activity activity, bw5.o50 item, int i17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(item, "item");
        ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
        java.lang.String k17 = il4.d.k(item);
        if (k17 == null) {
            k17 = "";
        }
        ((dl4.m0) tVar).Bi(k17, new cl4.o(item, activity, i17, this));
    }

    public final void c(android.app.Activity context, bw5.lp0 tingItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tingItem, "tingItem");
        bw5.v70 d17 = tingItem.d();
        if (!il4.l.i(d17 != null ? d17.f34189e : 0)) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Bi(rk4.j5.d(tingItem), new cl4.r(tingItem, context, this));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingShareHelper", "favLocalFile fileName: " + tingItem.d().i().b() + ", filePath: " + tingItem.d().i().getFilePath());
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        doFavoriteEvent.f54090g.f6323i = context;
        o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
        java.lang.String filePath = tingItem.d().i().getFilePath();
        java.lang.String b17 = tingItem.d().i().b();
        ((com.tencent.mm.pluginsdk.model.b2) c5Var).getClass();
        com.tencent.mm.pluginsdk.model.a2.k(doFavoriteEvent, 36, filePath, b17, "", "");
        pm0.v.X(new cl4.q(doFavoriteEvent));
    }

    public final java.lang.String d(bw5.o50 o50Var) {
        java.lang.String k17;
        int i17 = o50Var.f30964n;
        boolean z17 = i17 == 45 || i17 == 46;
        o50Var.getName();
        a(o50Var);
        o50Var.d();
        ot0.q qVar = new ot0.q();
        qVar.f348666i = z17 ? 133 : 93;
        qVar.f348654f = z17 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.piq) : o50Var.getName();
        java.lang.String str = "";
        if (z17 || (k17 = il4.d.k(o50Var)) == null) {
            k17 = "";
        }
        qVar.f348734z = k17;
        if (z17) {
            try {
                java.lang.String b17 = ((tg3.v0) i95.n0.c(tg3.v0.class)) != null ? c01.a2.b(gm0.j1.b().k()) : null;
                if (b17 != null) {
                    str = b17;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingShareHelper", e17, "getNickname Failed", new java.lang.Object[0]);
            }
            if (o50Var.f30964n == 45) {
                qVar.f348658g = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.pir, str);
            } else {
                qVar.f348658g = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.pip, str);
            }
        } else {
            qVar.f348658g = a(o50Var);
        }
        qVar.f348674k = "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/notsupport";
        il4.a aVar = new il4.a();
        aVar.f292092b = o50Var.f30964n;
        aVar.f292093c = il4.d.e(o50Var);
        qVar.f(aVar);
        return ot0.q.u(qVar, null, null);
    }

    public final java.lang.String e(android.content.Context context, bw5.o50 categoryItem, bw5.v70 v70Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(categoryItem, "categoryItem");
        categoryItem.getName();
        a(categoryItem);
        categoryItem.d();
        ot0.q qVar = new ot0.q();
        qVar.f348666i = 118;
        qVar.f348654f = categoryItem.getName();
        java.lang.String str = "";
        qVar.f348734z = "";
        qVar.f348658g = context.getString(com.tencent.mm.R.string.n3s);
        qVar.f348674k = "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/notsupport";
        il4.b bVar = new il4.b();
        bVar.f292096b = categoryItem.f30964n;
        bVar.f292097c = il4.d.e(categoryItem);
        if (v70Var != null) {
            try {
                bw5.v70 v70Var2 = new bw5.v70();
                v70Var2.parseFrom(v70Var.toByteArray());
                java.lang.String encodeToString = android.util.Base64.encodeToString(v70Var2.toByteArray(), 2);
                kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
                str = encodeToString;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingCategoryUtils", e17, "encodeTingCategoryItem exception", new java.lang.Object[0]);
            }
        }
        bVar.f292098d = str;
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
        java.lang.String listenId;
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
        xs4Var.set(8, java.lang.Long.valueOf(j38 != null ? j38.f35895r : 0L));
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
        xs4Var.set(18, java.lang.Integer.valueOf(d37 != null ? d37.f34189e : 0));
        xs4Var.set(19, rk4.l5.a(lp0Var));
        bw5.v70 d38 = lp0Var.d();
        if (d38 != null && (listenId = d38.getListenId()) != null) {
            str8 = listenId;
        }
        xs4Var.set(20, str8);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getMusicShareObject listenType: ");
        sb6.append(xs4Var.getInteger(18));
        sb6.append(", listenId: ");
        bw5.v70 d39 = lp0Var.d();
        sb6.append(d39 != null ? d39.getListenId() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingShareHelper", sb6.toString());
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
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(tingItem, "tingItem");
        if (d60Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingShareHelper", "setMusicToStatus commentInfo is null");
            return;
        }
        try {
            r45.wd6 wd6Var = new r45.wd6();
            bw5.v70 d17 = tingItem.d();
            wd6Var.f389078d = d17 != null ? d17.getListenId() : null;
            wd6Var.f389079e = d60Var.hasFieldNumber(206) ? d60Var.W : "";
            str = android.util.Base64.encodeToString(wd6Var.toByteArray(), 2);
            kotlin.jvm.internal.o.d(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingShareHelper", "getStatusFooterJumpListen exp: " + e17.getMessage());
            str = "";
        }
        if (r26.n0.N(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingShareHelper", "statusFooterJumpListen is null");
            return;
        }
        pj4.j0 j0Var = new pj4.j0();
        j0Var.f355139d = "15";
        j0Var.f355142g = str;
        java.util.List k17 = kz5.c0.k(j0Var);
        if (tingItem.d().f34189e == 1) {
            bw5.v70 d18 = tingItem.d();
            if (d18 != null && d18.hasFieldNumber(106)) {
                bw5.v70 d19 = tingItem.d();
                if ((d19 != null ? d19.j() : null) != null) {
                    pj4.j0 j0Var2 = new pj4.j0();
                    j0Var2.f355139d = "1";
                    j0Var2.f355141f = ((nm3.e) ((qk.z8) i95.n0.c(qk.z8.class))).wi(tingItem);
                    k17.add(j0Var2);
                }
            }
        }
        pj4.j0 j0Var3 = new pj4.j0();
        j0Var3.f355139d = "3";
        j0Var3.f355141f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
        k17.add(j0Var3);
        xe0.g0 g0Var = (xe0.g0) i95.n0.c(xe0.g0.class);
        bi4.c1 c1Var = new bi4.c1();
        c1Var.b(d60Var.hasFieldNumber(205) ? d60Var.V : "");
        java.lang.String Ni = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ni(rk4.j5.d(tingItem));
        bi4.d1 d1Var = c1Var.f21034a;
        d1Var.f354938e = Ni;
        c1Var.f("listen@inner");
        c1Var.g(d60Var.hasFieldNumber(204) ? d60Var.U : "");
        c1Var.e(d60Var.hasFieldNumber(203) ? d60Var.T : "");
        c1Var.h(d60Var.hasFieldNumber(201) ? d60Var.S : "");
        c1Var.c(k17);
        d1Var.f354940g = false;
        ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) g0Var).Ni(activity, 1003, d1Var);
    }

    public final void i(android.content.Context context, bw5.o50 item, com.tencent.pigeon.ting.TingShareConfig tingShareConfig) {
        java.util.List<java.lang.String> toUsernameList;
        java.lang.Boolean blockSendToWeWork;
        java.lang.Boolean blockGroupChat;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        int i17 = item.f30964n;
        boolean z17 = i17 == 45 || i17 == 46;
        java.lang.String k17 = il4.d.k(item);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareAlbumToChat categoryId: ");
        sb6.append(item.c());
        sb6.append(", categoryType: ");
        sb6.append(item.f30964n);
        sb6.append(", coverUrl: %s, blockGroupChat: ");
        sb6.append((tingShareConfig == null || (blockGroupChat = tingShareConfig.getBlockGroupChat()) == null) ? false : blockGroupChat.booleanValue());
        sb6.append(", blockWeWork: ");
        sb6.append((tingShareConfig == null || (blockSendToWeWork = tingShareConfig.getBlockSendToWeWork()) == null) ? false : blockSendToWeWork.booleanValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.TingShareHelper", sb6.toString(), k17);
        java.util.ArrayList arrayList = null;
        if (item.f30964n == 42) {
            java.lang.String k18 = gm0.j1.b().k();
            com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(k18);
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(k18);
            java.lang.String c17 = n07 != null ? n07.c() : null;
            bw5.mc0 mc0Var = new bw5.mc0();
            mc0Var.f30166e = q17.d1();
            boolean[] zArr = mc0Var.f30179u;
            zArr[2] = true;
            mc0Var.f30167f = q17.P0();
            zArr[3] = true;
            mc0Var.f30168g = c17;
            zArr[4] = true;
            item.f30982z = mc0Var;
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
        if (tingShareConfig != null ? kotlin.jvm.internal.o.b(tingShareConfig.getBlockSendToWeWork(), java.lang.Boolean.TRUE) : false) {
            intent.putExtra("Select_block_List", "wework");
        }
        if (tingShareConfig != null ? kotlin.jvm.internal.o.b(tingShareConfig.getBlockGroupChat(), java.lang.Boolean.TRUE) : false) {
            intent.putExtra("Select_Conv_Type", com.tencent.mm.ui.contact.i5.g(1, 2, 4));
        }
        int i18 = z17 ? 1008 : 1004;
        if (tingShareConfig != null && (toUsernameList = tingShareConfig.getToUsernameList()) != null) {
            java.util.List V = kz5.n0.V(toUsernameList);
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
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Intent intent = new android.content.Intent();
        r45.km6 km6Var = new r45.km6();
        km6Var.f378838d = item.f30964n;
        km6Var.f378839e = il4.d.e(item);
        java.lang.String c17 = item.c();
        if (c17 == null) {
            c17 = "";
        }
        km6Var.f378840f = c17;
        java.lang.String url = item.getUrl();
        java.lang.String url2 = !(url == null || url.length() == 0) ? item.getUrl() : "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/notsupport";
        java.lang.String k17 = il4.d.k(item);
        java.lang.String str = k17 != null ? k17 : "";
        if (!(str.length() == 0)) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ni(str);
        }
        intent.putExtra("Ksnsupload_ting_album_share_object_xml", cl4.g.a(km6Var));
        intent.putExtra("Ksnsupload_link", url2);
        intent.putExtra("Ksnsupload_title", item.getName());
        intent.putExtra("Ksnsupload_type", 35);
        intent.putExtra("need_result", true);
        intent.putExtra("Ksnsupload_source", 1);
        j45.l.v(context, ".plugin.sns.ui.SnsUploadUI", intent, 1005);
    }

    public final void k(android.content.Context context, bw5.lp0 tingItem, com.tencent.pigeon.ting.TingShareConfig tingShareConfig) {
        bw5.z90 j17;
        java.lang.Boolean blockSendToWeWork;
        java.lang.Boolean blockGroupChat;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tingItem, "tingItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareMusicToChat listenId: %s, songName: %s, blockGroupChat: ");
        sb6.append((tingShareConfig == null || (blockGroupChat = tingShareConfig.getBlockGroupChat()) == null) ? false : blockGroupChat.booleanValue());
        sb6.append(", blockWeWork: ");
        sb6.append((tingShareConfig == null || (blockSendToWeWork = tingShareConfig.getBlockSendToWeWork()) == null) ? false : blockSendToWeWork.booleanValue());
        java.lang.String sb7 = sb6.toString();
        java.lang.Object[] objArr = new java.lang.Object[2];
        bw5.v70 d17 = tingItem.d();
        objArr[0] = d17 != null ? d17.getListenId() : null;
        bw5.v70 d18 = tingItem.d();
        objArr[1] = (d18 == null || (j17 = d18.j()) == null) ? null : j17.o();
        com.tencent.mars.xlog.Log.i("MicroMsg.TingShareHelper", sb7, objArr);
        bw5.v70 d19 = tingItem.d();
        if (!il4.l.i(d19 != null ? d19.f34189e : 0)) {
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
            if (tingShareConfig != null ? kotlin.jvm.internal.o.b(tingShareConfig.getBlockSendToWeWork(), java.lang.Boolean.TRUE) : false) {
                intent.putExtra("Select_block_List", "wework");
            }
            if (tingShareConfig != null ? kotlin.jvm.internal.o.b(tingShareConfig.getBlockGroupChat(), java.lang.Boolean.TRUE) : false) {
                intent.putExtra("Select_Conv_Type", com.tencent.mm.ui.contact.i5.g(1, 2, 4));
            }
            j45.l.v(context, ".ui.transmit.MsgRetransmitUI", intent, 1001);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingShareHelper", "shareLocalFileToChat fileName: " + tingItem.d().i().b() + ", filePath: " + tingItem.d().i().getFilePath());
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(new com.tencent.mm.opensdk.modelmsg.WXFileObject(tingItem.d().i().getFilePath()));
        wXMediaMessage.title = tingItem.d().i().b();
        com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
        req.scene = 0;
        req.transaction = null;
        req.message = wXMediaMessage;
        android.os.Bundle bundle = new android.os.Bundle();
        req.toBundle(bundle);
        bundle.putInt(com.tencent.mm.opensdk.constants.ConstantsAPI.SDK_VERSION, com.tencent.mm.opensdk.constants.Build.SDK_INT);
        bundle.putString(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE, "com.tencent.mm.openapi");
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
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tingItem, "tingItem");
        bw5.v70 d18 = tingItem.d();
        int i17 = d18 != null ? d18.f34189e : 0;
        com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject wXMusicVideoObject = new com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject();
        wXMusicVideoObject.musicUrl = rk4.j5.l(tingItem);
        wXMusicVideoObject.musicDataUrl = rk4.j5.k(tingItem);
        wXMusicVideoObject.singerName = rk4.j5.c(tingItem);
        bw5.v70 d19 = tingItem.d();
        wXMusicVideoObject.songLyric = (d19 == null || (j37 = d19.j()) == null) ? null : j37.g();
        bw5.v70 d27 = tingItem.d();
        java.lang.String str5 = "";
        if (d27 == null || (j29 = d27.j()) == null || (str = j29.b()) == null) {
            str = "";
        }
        wXMusicVideoObject.albumName = str;
        bw5.v70 d28 = tingItem.d();
        if (d28 == null || (j28 = d28.j()) == null || (str2 = j28.e()) == null) {
            str2 = "";
        }
        wXMusicVideoObject.musicGenre = str2;
        bw5.v70 d29 = tingItem.d();
        wXMusicVideoObject.issueDate = (d29 == null || (j27 = d29.j()) == null) ? 0L : j27.f35895r;
        bw5.v70 d37 = tingItem.d();
        if (d37 == null || (j19 = d37.j()) == null || (str3 = j19.f()) == null) {
            str3 = "";
        }
        wXMusicVideoObject.identification = str3;
        wXMusicVideoObject.duration = rk4.j5.e(tingItem);
        com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo wXMusicVipInfo = new com.tencent.mm.opensdk.modelmsg.WXMusicVipInfo();
        bw5.v70 d38 = tingItem.d();
        if (d38 == null || (j18 = d38.j()) == null || (str4 = j18.j()) == null) {
            str4 = "";
        }
        wXMusicVipInfo.musicId = str4;
        wXMusicVideoObject.musicVipInfo = wXMusicVipInfo;
        java.lang.String str6 = wXMusicVideoObject.musicUrl;
        if (str6 == null || str6.length() == 0) {
            rk4.j jVar = rk4.m.f396834a;
            wXMusicVideoObject.musicUrl = rk4.m.f396835b;
        }
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
        wXMediaMessage.mediaObject = wXMusicVideoObject;
        wXMediaMessage.title = rk4.j5.j(tingItem);
        wXMediaMessage.description = wXMusicVideoObject.singerName;
        wXMediaMessage.thumbData = null;
        bw5.v70 d39 = tingItem.d();
        if (d39 != null && (j17 = d39.j()) != null && (d17 = j17.d()) != null) {
            str5 = d17;
        }
        wXMediaMessage.messageExt = str5;
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        rk4.j5.d(tingItem);
        java.lang.String str7 = wXMusicVideoObject.musicVipInfo.musicId;
        com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
        req.message = wXMediaMessage;
        req.toBundle(bundle);
        intent.putExtra("Ksnsupload_timeline", bundle);
        if (il4.l.k(i17)) {
            intent.putExtra("Ksnsupload_appid", rk4.j5.a(tingItem));
        }
        intent.putExtra("music_mv_cover_url", rk4.j5.d(tingItem));
        intent.putExtra("Ksnsupload_musicid", tingItem.d().getListenId());
        intent.putExtra("Ksnsupload_appname", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bnx));
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

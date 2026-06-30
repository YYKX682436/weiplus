package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes9.dex */
public abstract class x5 {
    public static void a(android.content.Context context, java.lang.String str, r45.gp0 gp0Var) {
        r45.uf6 uf6Var;
        java.lang.Object[] objArr = new java.lang.Object[9];
        objArr[0] = gp0Var != null ? gp0Var.T : "null";
        objArr[1] = java.lang.Integer.valueOf(gp0Var != null ? gp0Var.I : -1);
        objArr[2] = gp0Var != null ? gp0Var.f375434s : "null";
        objArr[3] = gp0Var != null ? gp0Var.f375438u : "null";
        objArr[4] = gp0Var != null ? gp0Var.f375412h : "null";
        objArr[5] = gp0Var != null ? gp0Var.f375420m : "null";
        objArr[6] = java.lang.Long.valueOf(gp0Var != null ? gp0Var.R : 0L);
        objArr[7] = gp0Var != null ? gp0Var.V : "null";
        objArr[8] = gp0Var != null ? gp0Var.X : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "sendFavShortVideo: dataId=%s, dataType=%d, cdnDataUrl=%s, cdnDataKey=%s, cdnThumbUrl=%s, cdnThumbKey=%s, fullsize=%d, orgnPath=%s, orgnThumbPath=%s", objArr);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(o72.x1.x(gp0Var));
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSendLogic", "sendShortVideo, error! data not existed");
            return;
        }
        java.lang.String e17 = e(gp0Var);
        r6Var.o();
        r45.jp0 jp0Var = gp0Var.O1;
        if (jp0Var != null) {
            r45.uf6 uf6Var2 = new r45.uf6();
            uf6Var2.f387338i = jp0Var.f378003i;
            uf6Var2.f387337h = jp0Var.f378002h;
            uf6Var2.f387334e = jp0Var.f377999e;
            uf6Var2.f387333d = jp0Var.f377998d;
            uf6Var2.f387335f = jp0Var.f378000f;
            uf6Var2.f387339m = jp0Var.f378004m;
            uf6Var2.f387340n = jp0Var.f378005n;
            uf6Var2.f387336g = jp0Var.f378001g;
            uf6Var = uf6Var2;
        } else {
            uf6Var = null;
        }
        if (uf6Var != null) {
            ((dk5.s5) tg3.t1.a()).ij(context, str, r6Var.o(), e17, 62, gp0Var.f375448y, uf6Var, false, false, gp0Var.R1, gp0Var.f375431q2, null);
        } else {
            ((dk5.s5) tg3.t1.a()).nj(context, str, r6Var.o(), e17, 62, gp0Var.f375448y, false, false, gp0Var.R1, gp0Var.f375431q2);
        }
    }

    public static void b(android.content.Context context, java.lang.String toUser, r45.gp0 gp0Var) {
        boolean z17;
        java.lang.String sb6;
        r45.uf6 uf6Var;
        boolean z18;
        ot0.m1 m1Var;
        r45.qp0 qp0Var;
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = gp0Var != null ? gp0Var.T : "null";
        objArr[1] = java.lang.Integer.valueOf(gp0Var != null ? gp0Var.I : -1);
        objArr[2] = gp0Var != null ? gp0Var.f375434s : "null";
        objArr[3] = gp0Var != null ? gp0Var.f375438u : "null";
        objArr[4] = gp0Var != null ? gp0Var.f375412h : "null";
        objArr[5] = gp0Var != null ? gp0Var.f375420m : "null";
        objArr[6] = java.lang.Long.valueOf(gp0Var != null ? gp0Var.R : 0L);
        objArr[7] = gp0Var != null ? gp0Var.M : "null";
        objArr[8] = java.lang.Long.valueOf(gp0Var != null ? gp0Var.f375418l1 : 0L);
        objArr[9] = gp0Var != null ? gp0Var.V : "null";
        objArr[10] = gp0Var != null ? gp0Var.X : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "sendFavVideo: dataId=%s, dataType=%d, cdnDataUrl=%s, cdnDataKey=%s, cdnThumbUrl=%s, cdnThumbKey=%s, fullsize=%d, fullmd5=%s, thumbFullSize=%d, orgnPath=%s, orgnThumbPath=%s", objArr);
        if (gp0Var != null) {
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375434s) || com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375438u);
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375412h) || com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375420m);
            if (z19 || z27) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append("type:");
                sb7.append(gp0Var.I);
                sb7.append(";cdnDataUrl:");
                sb7.append(gp0Var.f375434s);
                sb7.append(";cdnDataKey:");
                sb7.append(gp0Var.f375438u);
                sb7.append(";cdnThumbUrl:");
                sb7.append(gp0Var.f375412h);
                sb7.append(";cdnThumbKey:");
                sb7.append(gp0Var.f375420m);
                sb7.append(";orgnPath:");
                sb7.append(gp0Var.V);
                sb7.append(";orgnThumbPath:");
                sb7.append(gp0Var.X);
                if (z19) {
                    sb7.append(";is_data_empty:true");
                }
                if (z27) {
                    sb7.append(";is_video_thumb_empty:true");
                }
                com.tencent.mm.plugin.report.service.d1.f158158b.d("fav_send_video_field_missing", true, pm0.w.f356804e, null, true, false, new com.tencent.mm.plugin.fav.ui.x5$$b(sb7));
            }
        }
        if (gp0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375434s) || com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375438u)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "sendFavVideo: FavDataItem has no valid CDN data");
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "sendFavVideo: FavDataItem has valid CDN data, cdnUrl=%s, cdnKey=%s", gp0Var.f375434s, gp0Var.f375438u);
            z17 = true;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(o72.x1.x(gp0Var));
        if (!r6Var.m() && !z17) {
            r45.hp0 hp0Var = gp0Var.J1;
            if (hp0Var == null || (qp0Var = hp0Var.f376370x) == null) {
                m1Var = null;
            } else {
                m1Var = new ot0.m1();
                m1Var.f373339d = qp0Var.f384174s;
                m1Var.f373340e = qp0Var.f384175t;
                m1Var.f373341f = qp0Var.f384168m;
                m1Var.f373342g = gp0Var.f375404d;
                m1Var.f373343h = qp0Var.f384173r;
                m1Var.f373344i = qp0Var.f384167i;
                m1Var.f373345m = qp0Var.f384164f;
                m1Var.f373346n = qp0Var.f384165g;
                m1Var.f373347o = gp0Var.A;
                m1Var.f373348p = qp0Var.f384169n;
                m1Var.f373349q = qp0Var.f384170o;
            }
            if (m1Var != null) {
                zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
                com.tencent.mm.plugin.fav.ui.c6 c6Var = new com.tencent.mm.plugin.fav.ui.c6();
                ((yq1.z) a0Var).getClass();
                kotlin.jvm.internal.o.g(toUser, "toUser");
                com.tencent.mm.plugin.webview.ui.tools.media.j0.f185786a.a(toUser, m1Var, "", c6Var);
                return;
            }
            java.lang.String str = gp0Var.A;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            com.tencent.mm.opensdk.modelmsg.WXVideoObject wXVideoObject = new com.tencent.mm.opensdk.modelmsg.WXVideoObject();
            wXVideoObject.videoUrl = str;
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXVideoObject);
            java.lang.String str2 = gp0Var.f375404d;
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.cdy);
            if (str2 == null) {
                str2 = string;
            }
            wXMediaMessage.mediaObject = wXVideoObject;
            wXMediaMessage.title = str2;
            wXMediaMessage.description = gp0Var.f375408f;
            byte[] x17 = com.tencent.mm.sdk.platformtools.t8.x1(o72.x1.X(gp0Var));
            wXMediaMessage.thumbData = x17;
            if (x17 == null) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(o72.x1.I());
                java.lang.String str3 = gp0Var.G;
                sb8.append(kk.k.g((str3 != null ? str3 : "").getBytes()));
                wXMediaMessage.thumbData = com.tencent.mm.sdk.platformtools.t8.x1(sb8.toString());
            }
            ot0.q qVar = new ot0.q();
            qVar.f348706s = 3;
            r45.jp0 jp0Var = gp0Var.O1;
            if (jp0Var != null) {
                qVar.f348657f2 = jp0Var.f378003i;
                qVar.f348645c2 = jp0Var.f378002h;
                qVar.f348641b2 = jp0Var.f377999e;
                qVar.f348637a2 = jp0Var.f377998d;
                qVar.f348649d2 = jp0Var.f378000f;
                qVar.f348661g2 = jp0Var.f378004m;
                qVar.f348665h2 = jp0Var.f378005n;
            }
            ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).getClass();
            com.tencent.mm.pluginsdk.model.app.k0.G(qVar, wXMediaMessage, toUser, null, 0, null);
            return;
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(o72.x1.X(gp0Var));
        if (r6Var2.m()) {
            sb6 = r6Var2.o();
        } else {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(o72.x1.I());
            java.lang.String str4 = gp0Var.G;
            sb9.append(kk.k.g((str4 != null ? str4 : "").getBytes()));
            sb6 = sb9.toString();
        }
        java.lang.String str5 = sb6;
        r6Var.o();
        r45.jp0 jp0Var2 = gp0Var.O1;
        if (jp0Var2 != null) {
            r45.uf6 uf6Var2 = new r45.uf6();
            uf6Var2.f387338i = jp0Var2.f378003i;
            uf6Var2.f387337h = jp0Var2.f378002h;
            uf6Var2.f387334e = jp0Var2.f377999e;
            uf6Var2.f387333d = jp0Var2.f377998d;
            uf6Var2.f387335f = jp0Var2.f378000f;
            uf6Var2.f387339m = jp0Var2.f378004m;
            uf6Var2.f387340n = jp0Var2.f378005n;
            uf6Var = uf6Var2;
        } else {
            uf6Var = null;
        }
        c01.f7 b17 = o72.l2.b(gp0Var);
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        objArr2[0] = b17 != null ? "valid" : "null";
        objArr2[1] = r6Var.o();
        objArr2[2] = str5;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "sendFavVideo fastSend: favDataItemInMsg=%s, dataPath=%s, thumbPath=%s", objArr2);
        tg3.a1 a17 = tg3.t1.a();
        java.lang.String o17 = r6Var.o();
        int i17 = gp0Var.f375448y;
        java.lang.String str6 = gp0Var.R1;
        java.lang.String str7 = gp0Var.f375431q2;
        dk5.s5 s5Var = (dk5.s5) a17;
        s5Var.getClass();
        if (b17 != null) {
            long k17 = com.tencent.mm.vfs.w6.k(o17);
            long r17 = b17.r();
            long k18 = com.tencent.mm.vfs.w6.k(str5);
            long u17 = b17.u();
            r5 = k17 < r17 || k18 < u17;
            z18 = b17.y();
            if (z18) {
                r5 = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SendMsgMgr", "send Video while has favDataItem,favPathLength[%d],fullLength[%d],thumbLength[%d],thumbFullSize[%d],has HighQualityResources[%s],useNewVideoSend[%s],showSendRaw[%s]", java.lang.Long.valueOf(k17), java.lang.Long.valueOf(r17), java.lang.Long.valueOf(k18), java.lang.Long.valueOf(u17), java.lang.Boolean.valueOf(b17.y()), java.lang.Boolean.valueOf(r5), java.lang.Boolean.valueOf(z18));
        } else {
            z18 = false;
        }
        if (!r5) {
            r5 = ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).fj(vf0.j3.f436206h);
        }
        if (!r5) {
            s5Var.ij(context, toUser, o17, str5, 1, i17, uf6Var, false, false, str6, str7, null);
            return;
        }
        ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
        com.tencent.mm.pluginsdk.ui.tools.p0.a();
        c01.h7 h7Var = new c01.h7();
        h7Var.f37231f = str7;
        c35.o oVar = (c35.o) i95.n0.c(c35.o.class);
        kk.l lVar = t21.w2.f415056c;
        ((vf0.k2) oVar).Ai(new vf0.u2(t21.c3.a(toUser), o17, str5, z18, i17, new vf0.r2(b17, uf6Var, str6, null, null, null, false, null, null, null, false, false), h7Var), toUser);
    }

    public static void c(java.lang.String str, o72.r2 r2Var, r45.gp0 gp0Var) {
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = java.lang.Integer.valueOf(r2Var != null ? r2Var.field_id : -1);
        boolean z17 = true;
        objArr[1] = gp0Var.T;
        objArr[2] = gp0Var.f375404d;
        objArr[3] = java.lang.Integer.valueOf(gp0Var.I);
        objArr[4] = gp0Var.f375434s;
        objArr[5] = gp0Var.f375438u;
        objArr[6] = gp0Var.f375412h;
        objArr[7] = gp0Var.f375420m;
        objArr[8] = java.lang.Long.valueOf(gp0Var.R);
        objArr[9] = gp0Var.M;
        objArr[10] = gp0Var.V;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "sendFavFile: favId=%d, dataId=%s, title=%s, dataType=%d, cdnDataUrl=%s, cdnDataKey=%s, cdnThumbUrl=%s, cdnThumbKey=%s, fullsize=%d, fullmd5=%s, orgnPath=%s", objArr);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375434s) && !com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375438u)) {
            z17 = false;
        }
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("type:");
            sb6.append(gp0Var.I);
            sb6.append(";cdnDataUrl:");
            sb6.append(gp0Var.f375434s);
            sb6.append(";cdnDataKey:");
            sb6.append(gp0Var.f375438u);
            sb6.append(";cdnThumbUrl:");
            sb6.append(gp0Var.f375412h);
            sb6.append(";cdnThumbKey:");
            sb6.append(gp0Var.f375420m);
            sb6.append(";orgnPath:");
            sb6.append(gp0Var.V);
            sb6.append(";orgnThumbPath:");
            sb6.append(gp0Var.X);
            sb6.append(";is_data_empty:true");
            com.tencent.mm.plugin.report.service.d1.f158158b.d("fav_send_file_field_missing", true, pm0.w.f356804e, null, true, false, new com.tencent.mm.plugin.fav.ui.x5$$b(sb6));
        }
        java.lang.String x17 = o72.x1.x(gp0Var);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375404d)) {
            java.lang.String str2 = gp0Var.G;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String mj6 = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).mj(gp0Var.f375404d, str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "copy file from:" + x17 + "to:" + mj6 + "with ret: " + com.tencent.mm.vfs.w6.d(x17, mj6, false));
            x17 = mj6;
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(x17, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "sendFavFile fastSend: filePath=%s", i17);
        ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).wi(i17, gp0Var.f375404d, str, o72.l2.b(gp0Var));
    }

    public static void d(android.content.Context context, java.lang.String str, o72.r2 r2Var, r45.gp0 gp0Var) {
        r45.km6 km6Var;
        byte[] x17 = com.tencent.mm.sdk.platformtools.t8.x1(o72.x1.X(gp0Var));
        if (x17 == null) {
            java.lang.String str2 = gp0Var.G;
            if (str2 == null) {
                str2 = "";
            }
            x17 = com.tencent.mm.sdk.platformtools.t8.x1(o72.x1.I() + kk.k.g(str2.getBytes()));
        }
        byte[] bArr = x17;
        java.lang.String str3 = r2Var.field_favProto.f370962d.f378050w;
        java.lang.String Zi = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(context, str3);
        ot0.q qVar = new ot0.q();
        qVar.f348654f = gp0Var.f375404d;
        qVar.f348658g = gp0Var.f375408f;
        qVar.f348674k = gp0Var.A;
        qVar.f348646d = str3;
        qVar.f348734z = gp0Var.G;
        qVar.f348666i = 93;
        qVar.H = Zi;
        qVar.f348706s = 3;
        r45.hp0 hp0Var = gp0Var.J1;
        if (hp0Var != null && (km6Var = hp0Var.G) != null) {
            il4.a aVar = new il4.a();
            aVar.f292092b = km6Var.f378838d;
            aVar.f292093c = km6Var.f378839e;
            aVar.f292094d = km6Var.f378840f;
            qVar.f(aVar);
        }
        ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).getClass();
        ((java.lang.Integer) com.tencent.mm.pluginsdk.model.app.k0.K(qVar, qVar.f348646d, qVar.H, str, null, bArr, null, "", null, com.tencent.mm.plugin.msg.MsgIdTalker.f149479g).first).intValue();
    }

    public static java.lang.String e(r45.gp0 gp0Var) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(o72.x1.X(gp0Var));
        if (r6Var.m()) {
            return r6Var.o();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(o72.x1.I());
        java.lang.String str = gp0Var.G;
        if (str == null) {
            str = "";
        }
        sb6.append(kk.k.g(str.getBytes()));
        return sb6.toString();
    }

    public static boolean f(r45.gp0 gp0Var) {
        if (gp0Var != null) {
            return com.tencent.mm.sdk.platformtools.t8.D0(gp0Var.P1, "WeNoteHtmlFile");
        }
        return false;
    }

    public static void g(android.content.Context context, java.lang.String str, o72.r2 r2Var, r45.gp0 gp0Var, java.lang.Runnable runnable) {
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSendLogic", "want to send fav file, but context is null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSendLogic", "want to send fav file, but to user is null");
            return;
        }
        if (r2Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSendLogic", "want to send fav file, but info is null");
        }
        if (gp0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSendLogic", "want to send fav file, but dataItem is null");
        } else {
            gm0.j1.e().j(new com.tencent.mm.plugin.fav.ui.b6(str, r2Var, gp0Var, runnable));
        }
    }

    public static void h(android.content.Context context, com.tencent.mm.plugin.fav.ui.f6 f6Var, java.lang.Runnable runnable) {
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSendLogic", "want to send fav msg, but context is null");
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(f6Var.f100848b)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSendLogic", "want to send fav msg, but to user is null");
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
            return;
        }
        java.util.List list = f6Var.f100851e;
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSendLogic", "want to send fav msg, but info is null");
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        } else {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.fav.ui.y5(f6Var, context, runnable));
        }
    }

    public static void i(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, o72.r2 r2Var, java.lang.Runnable runnable) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(r2Var);
        linkedList.forEach(new com.tencent.mm.plugin.fav.ui.x5$$a());
        com.tencent.mm.plugin.fav.ui.f6 f6Var = new com.tencent.mm.plugin.fav.ui.f6();
        f6Var.f100848b = str;
        f6Var.f100849c = str2;
        f6Var.f100851e = linkedList;
        f6Var.f100850d = z17;
        h(context, f6Var, runnable);
    }

    public static void j(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.Runnable runnable, java.lang.String str5) {
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSendLogic", "want to send fav video, but context is null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSendLogic", "want to send fav video, but to user is null");
            return;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
        java.lang.String str6 = a17.f213279f;
        if (str6 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str6, false, false);
            if (!str6.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavSendLogic", "want to send fav video, but datapath is null or is not exist ");
                return;
            }
        }
        gm0.j1.e().j(new com.tencent.mm.plugin.fav.ui.d6(context, str, str2, str3, i17, str4, str5, runnable));
    }

    public static void k(android.content.Context context, java.lang.String str, r45.gp0 gp0Var, java.lang.Runnable runnable) {
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSendLogic", "want to send fav video, but context is null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSendLogic", "want to send fav video, but to user is null");
        } else if (gp0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSendLogic", "want to send fav video, but dataItem is null");
        } else {
            gm0.j1.e().j(new com.tencent.mm.plugin.fav.ui.a6(gp0Var, context, str, runnable));
        }
    }
}

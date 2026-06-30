package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes9.dex */
public abstract class x5 {
    public static void a(android.content.Context context, java.lang.String str, r45.gp0 gp0Var) {
        r45.uf6 uf6Var;
        java.lang.Object[] objArr = new java.lang.Object[9];
        objArr[0] = gp0Var != null ? gp0Var.T : "null";
        objArr[1] = java.lang.Integer.valueOf(gp0Var != null ? gp0Var.I : -1);
        objArr[2] = gp0Var != null ? gp0Var.f456967s : "null";
        objArr[3] = gp0Var != null ? gp0Var.f456971u : "null";
        objArr[4] = gp0Var != null ? gp0Var.f456945h : "null";
        objArr[5] = gp0Var != null ? gp0Var.f456953m : "null";
        objArr[6] = java.lang.Long.valueOf(gp0Var != null ? gp0Var.R : 0L);
        objArr[7] = gp0Var != null ? gp0Var.V : "null";
        objArr[8] = gp0Var != null ? gp0Var.X : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendLogic", "sendFavShortVideo: dataId=%s, dataType=%d, cdnDataUrl=%s, cdnDataKey=%s, cdnThumbUrl=%s, cdnThumbKey=%s, fullsize=%d, orgnPath=%s, orgnThumbPath=%s", objArr);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(o72.x1.x(gp0Var));
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendLogic", "sendShortVideo, error! data not existed");
            return;
        }
        java.lang.String e17 = e(gp0Var);
        r6Var.o();
        r45.jp0 jp0Var = gp0Var.O1;
        if (jp0Var != null) {
            r45.uf6 uf6Var2 = new r45.uf6();
            uf6Var2.f468871i = jp0Var.f459536i;
            uf6Var2.f468870h = jp0Var.f459535h;
            uf6Var2.f468867e = jp0Var.f459532e;
            uf6Var2.f468866d = jp0Var.f459531d;
            uf6Var2.f468868f = jp0Var.f459533f;
            uf6Var2.f468872m = jp0Var.f459537m;
            uf6Var2.f468873n = jp0Var.f459538n;
            uf6Var2.f468869g = jp0Var.f459534g;
            uf6Var = uf6Var2;
        } else {
            uf6Var = null;
        }
        if (uf6Var != null) {
            ((dk5.s5) tg3.t1.a()).ij(context, str, r6Var.o(), e17, 62, gp0Var.f456981y, uf6Var, false, false, gp0Var.R1, gp0Var.f456964q2, null);
        } else {
            ((dk5.s5) tg3.t1.a()).nj(context, str, r6Var.o(), e17, 62, gp0Var.f456981y, false, false, gp0Var.R1, gp0Var.f456964q2);
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
        objArr[2] = gp0Var != null ? gp0Var.f456967s : "null";
        objArr[3] = gp0Var != null ? gp0Var.f456971u : "null";
        objArr[4] = gp0Var != null ? gp0Var.f456945h : "null";
        objArr[5] = gp0Var != null ? gp0Var.f456953m : "null";
        objArr[6] = java.lang.Long.valueOf(gp0Var != null ? gp0Var.R : 0L);
        objArr[7] = gp0Var != null ? gp0Var.M : "null";
        objArr[8] = java.lang.Long.valueOf(gp0Var != null ? gp0Var.f456951l1 : 0L);
        objArr[9] = gp0Var != null ? gp0Var.V : "null";
        objArr[10] = gp0Var != null ? gp0Var.X : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendLogic", "sendFavVideo: dataId=%s, dataType=%d, cdnDataUrl=%s, cdnDataKey=%s, cdnThumbUrl=%s, cdnThumbKey=%s, fullsize=%d, fullmd5=%s, thumbFullSize=%d, orgnPath=%s, orgnThumbPath=%s", objArr);
        if (gp0Var != null) {
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456967s) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456971u);
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456945h) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456953m);
            if (z19 || z27) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append("type:");
                sb7.append(gp0Var.I);
                sb7.append(";cdnDataUrl:");
                sb7.append(gp0Var.f456967s);
                sb7.append(";cdnDataKey:");
                sb7.append(gp0Var.f456971u);
                sb7.append(";cdnThumbUrl:");
                sb7.append(gp0Var.f456945h);
                sb7.append(";cdnThumbKey:");
                sb7.append(gp0Var.f456953m);
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
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.d1.f239691b.d("fav_send_video_field_missing", true, pm0.w.f438337e, null, true, false, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13628x6b3a805(sb7));
            }
        }
        if (gp0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456967s) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456971u)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendLogic", "sendFavVideo: FavDataItem has no valid CDN data");
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendLogic", "sendFavVideo: FavDataItem has valid CDN data, cdnUrl=%s, cdnKey=%s", gp0Var.f456967s, gp0Var.f456971u);
            z17 = true;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(o72.x1.x(gp0Var));
        if (!r6Var.m() && !z17) {
            r45.hp0 hp0Var = gp0Var.J1;
            if (hp0Var == null || (qp0Var = hp0Var.f457903x) == null) {
                m1Var = null;
            } else {
                m1Var = new ot0.m1();
                m1Var.f454872d = qp0Var.f465707s;
                m1Var.f454873e = qp0Var.f465708t;
                m1Var.f454874f = qp0Var.f465701m;
                m1Var.f454875g = gp0Var.f456937d;
                m1Var.f454876h = qp0Var.f465706r;
                m1Var.f454877i = qp0Var.f465700i;
                m1Var.f454878m = qp0Var.f465697f;
                m1Var.f454879n = qp0Var.f465698g;
                m1Var.f454880o = gp0Var.A;
                m1Var.f454881p = qp0Var.f465702n;
                m1Var.f454882q = qp0Var.f465703o;
            }
            if (m1Var != null) {
                zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c6 c6Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c6();
                ((yq1.z) a0Var).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.j0.f267319a.a(toUser, m1Var, "", c6Var);
                return;
            }
            java.lang.String str = gp0Var.A;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11298x4d56d1f9 c11298x4d56d1f9 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11298x4d56d1f9();
            c11298x4d56d1f9.f33238x44a0a2f4 = str;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(c11298x4d56d1f9);
            java.lang.String str2 = gp0Var.f456937d;
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdy);
            if (str2 == null) {
                str2 = string;
            }
            c11286x34a5504.f33122xe4128443 = c11298x4d56d1f9;
            c11286x34a5504.f33130x6942258 = str2;
            c11286x34a5504.f33121x993583fc = gp0Var.f456941f;
            byte[] x17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(o72.x1.X(gp0Var));
            c11286x34a5504.f33128x4f3b3aa0 = x17;
            if (x17 == null) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(o72.x1.I());
                java.lang.String str3 = gp0Var.G;
                sb8.append(kk.k.g((str3 != null ? str3 : "").getBytes()));
                c11286x34a5504.f33128x4f3b3aa0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(sb8.toString());
            }
            ot0.q qVar = new ot0.q();
            qVar.f430239s = 3;
            r45.jp0 jp0Var = gp0Var.O1;
            if (jp0Var != null) {
                qVar.f430190f2 = jp0Var.f459536i;
                qVar.f430178c2 = jp0Var.f459535h;
                qVar.f430174b2 = jp0Var.f459532e;
                qVar.f430170a2 = jp0Var.f459531d;
                qVar.f430182d2 = jp0Var.f459533f;
                qVar.f430194g2 = jp0Var.f459537m;
                qVar.f430198h2 = jp0Var.f459538n;
            }
            ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.G(qVar, c11286x34a5504, toUser, null, 0, null);
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(o72.x1.X(gp0Var));
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
            uf6Var2.f468871i = jp0Var2.f459536i;
            uf6Var2.f468870h = jp0Var2.f459535h;
            uf6Var2.f468867e = jp0Var2.f459532e;
            uf6Var2.f468866d = jp0Var2.f459531d;
            uf6Var2.f468868f = jp0Var2.f459533f;
            uf6Var2.f468872m = jp0Var2.f459537m;
            uf6Var2.f468873n = jp0Var2.f459538n;
            uf6Var = uf6Var2;
        } else {
            uf6Var = null;
        }
        c01.f7 b17 = o72.l2.b(gp0Var);
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        objArr2[0] = b17 != null ? "valid" : "null";
        objArr2[1] = r6Var.o();
        objArr2[2] = str5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendLogic", "sendFavVideo fastSend: favDataItemInMsg=%s, dataPath=%s, thumbPath=%s", objArr2);
        tg3.a1 a17 = tg3.t1.a();
        java.lang.String o17 = r6Var.o();
        int i17 = gp0Var.f456981y;
        java.lang.String str6 = gp0Var.R1;
        java.lang.String str7 = gp0Var.f456964q2;
        dk5.s5 s5Var = (dk5.s5) a17;
        s5Var.getClass();
        if (b17 != null) {
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(o17);
            long r17 = b17.r();
            long k18 = com.p314xaae8f345.mm.vfs.w6.k(str5);
            long u17 = b17.u();
            r5 = k17 < r17 || k18 < u17;
            z18 = b17.y();
            if (z18) {
                r5 = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "send Video while has favDataItem,favPathLength[%d],fullLength[%d],thumbLength[%d],thumbFullSize[%d],has HighQualityResources[%s],useNewVideoSend[%s],showSendRaw[%s]", java.lang.Long.valueOf(k17), java.lang.Long.valueOf(r17), java.lang.Long.valueOf(k18), java.lang.Long.valueOf(u17), java.lang.Boolean.valueOf(b17.y()), java.lang.Boolean.valueOf(r5), java.lang.Boolean.valueOf(z18));
        } else {
            z18 = false;
        }
        if (!r5) {
            r5 = ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).fj(vf0.j3.f517739h);
        }
        if (!r5) {
            s5Var.ij(context, toUser, o17, str5, 1, i17, uf6Var, false, false, str6, str7, null);
            return;
        }
        ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.a();
        c01.h7 h7Var = new c01.h7();
        h7Var.f118764f = str7;
        c35.o oVar = (c35.o) i95.n0.c(c35.o.class);
        kk.l lVar = t21.w2.f496589c;
        ((vf0.k2) oVar).Ai(new vf0.u2(t21.c3.a(toUser), o17, str5, z18, i17, new vf0.r2(b17, uf6Var, str6, null, null, null, false, null, null, null, false, false), h7Var), toUser);
    }

    public static void c(java.lang.String str, o72.r2 r2Var, r45.gp0 gp0Var) {
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = java.lang.Integer.valueOf(r2Var != null ? r2Var.f67643xc8a07680 : -1);
        boolean z17 = true;
        objArr[1] = gp0Var.T;
        objArr[2] = gp0Var.f456937d;
        objArr[3] = java.lang.Integer.valueOf(gp0Var.I);
        objArr[4] = gp0Var.f456967s;
        objArr[5] = gp0Var.f456971u;
        objArr[6] = gp0Var.f456945h;
        objArr[7] = gp0Var.f456953m;
        objArr[8] = java.lang.Long.valueOf(gp0Var.R);
        objArr[9] = gp0Var.M;
        objArr[10] = gp0Var.V;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendLogic", "sendFavFile: favId=%d, dataId=%s, title=%s, dataType=%d, cdnDataUrl=%s, cdnDataKey=%s, cdnThumbUrl=%s, cdnThumbKey=%s, fullsize=%d, fullmd5=%s, orgnPath=%s", objArr);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456967s) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456971u)) {
            z17 = false;
        }
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("type:");
            sb6.append(gp0Var.I);
            sb6.append(";cdnDataUrl:");
            sb6.append(gp0Var.f456967s);
            sb6.append(";cdnDataKey:");
            sb6.append(gp0Var.f456971u);
            sb6.append(";cdnThumbUrl:");
            sb6.append(gp0Var.f456945h);
            sb6.append(";cdnThumbKey:");
            sb6.append(gp0Var.f456953m);
            sb6.append(";orgnPath:");
            sb6.append(gp0Var.V);
            sb6.append(";orgnThumbPath:");
            sb6.append(gp0Var.X);
            sb6.append(";is_data_empty:true");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.d1.f239691b.d("fav_send_file_field_missing", true, pm0.w.f438337e, null, true, false, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13628x6b3a805(sb6));
        }
        java.lang.String x17 = o72.x1.x(gp0Var);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456937d)) {
            java.lang.String str2 = gp0Var.G;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String mj6 = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).mj(gp0Var.f456937d, str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendLogic", "copy file from:" + x17 + "to:" + mj6 + "with ret: " + com.p314xaae8f345.mm.vfs.w6.d(x17, mj6, false));
            x17 = mj6;
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(x17, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendLogic", "sendFavFile fastSend: filePath=%s", i17);
        ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).wi(i17, gp0Var.f456937d, str, o72.l2.b(gp0Var));
    }

    public static void d(android.content.Context context, java.lang.String str, o72.r2 r2Var, r45.gp0 gp0Var) {
        r45.km6 km6Var;
        byte[] x17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(o72.x1.X(gp0Var));
        if (x17 == null) {
            java.lang.String str2 = gp0Var.G;
            if (str2 == null) {
                str2 = "";
            }
            x17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(o72.x1.I() + kk.k.g(str2.getBytes()));
        }
        byte[] bArr = x17;
        java.lang.String str3 = r2Var.f67640x5ab01132.f452495d.f459583w;
        java.lang.String Zi = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(context, str3);
        ot0.q qVar = new ot0.q();
        qVar.f430187f = gp0Var.f456937d;
        qVar.f430191g = gp0Var.f456941f;
        qVar.f430207k = gp0Var.A;
        qVar.f430179d = str3;
        qVar.f430267z = gp0Var.G;
        qVar.f430199i = 93;
        qVar.H = Zi;
        qVar.f430239s = 3;
        r45.hp0 hp0Var = gp0Var.J1;
        if (hp0Var != null && (km6Var = hp0Var.G) != null) {
            il4.a aVar = new il4.a();
            aVar.f373625b = km6Var.f460371d;
            aVar.f373626c = km6Var.f460372e;
            aVar.f373627d = km6Var.f460373f;
            qVar.f(aVar);
        }
        ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).getClass();
        ((java.lang.Integer) com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.K(qVar, qVar.f430179d, qVar.H, str, null, bArr, null, "", null, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5.f231012g).first).intValue();
    }

    public static java.lang.String e(r45.gp0 gp0Var) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(o72.x1.X(gp0Var));
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
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(gp0Var.P1, "WeNoteHtmlFile");
        }
        return false;
    }

    public static void g(android.content.Context context, java.lang.String str, o72.r2 r2Var, r45.gp0 gp0Var, java.lang.Runnable runnable) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendLogic", "want to send fav file, but context is null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendLogic", "want to send fav file, but to user is null");
            return;
        }
        if (r2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendLogic", "want to send fav file, but info is null");
        }
        if (gp0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendLogic", "want to send fav file, but dataItem is null");
        } else {
            gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b6(str, r2Var, gp0Var, runnable));
        }
    }

    public static void h(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f6 f6Var, java.lang.Runnable runnable) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendLogic", "want to send fav msg, but context is null");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f6Var.f182381b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendLogic", "want to send fav msg, but to user is null");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
            return;
        }
        java.util.List list = f6Var.f182384e;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendLogic", "want to send fav msg, but info is null");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        } else {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y5(f6Var, context, runnable));
        }
    }

    public static void i(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, o72.r2 r2Var, java.lang.Runnable runnable) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(r2Var);
        linkedList.forEach(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13627x6b3a804());
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f6 f6Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f6();
        f6Var.f182381b = str;
        f6Var.f182382c = str2;
        f6Var.f182384e = linkedList;
        f6Var.f182383d = z17;
        h(context, f6Var, runnable);
    }

    public static void j(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.Runnable runnable, java.lang.String str5) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendLogic", "want to send fav video, but context is null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendLogic", "want to send fav video, but to user is null");
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2);
        java.lang.String str6 = a17.f294812f;
        if (str6 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str6, false, false);
            if (!str6.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendLogic", "want to send fav video, but datapath is null or is not exist ");
                return;
            }
        }
        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d6(context, str, str2, str3, i17, str4, str5, runnable));
    }

    public static void k(android.content.Context context, java.lang.String str, r45.gp0 gp0Var, java.lang.Runnable runnable) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendLogic", "want to send fav video, but context is null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendLogic", "want to send fav video, but to user is null");
        } else if (gp0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendLogic", "want to send fav video, but dataItem is null");
        } else {
            gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a6(gp0Var, context, str, runnable));
        }
    }
}

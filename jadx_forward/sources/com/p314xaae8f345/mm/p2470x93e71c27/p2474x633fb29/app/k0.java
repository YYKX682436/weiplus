package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes9.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static bt3.l0 f270487a;

    public static int A(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().J0(f9Var.m124847x74d37ac6(), f9Var.Q0());
        if (J0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "ERR:" + fp.k.c() + " getinfo failed: " + str);
            return -1;
        }
        long j17 = J0.f68112x10a0fed7;
        if (j17 != 105) {
            m(true);
            if (j17 != 101) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "ERR:" + fp.k.c() + " get status failed: " + str + " status:" + J0.f68112x10a0fed7);
                return -1;
            }
        }
        m(true);
        J0.f68112x10a0fed7 = 101;
        J0.f68103x4a777c2 = c01.id.e();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(J0, new java.lang.String[0]);
        dk5.w.f316499a.b(f9Var, "file_resend_attach");
        return 0;
    }

    public static java.lang.String B(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, byte[] bArr, boolean z17, android.graphics.Bitmap.CompressFormat compressFormat, boolean z18) {
        java.lang.String V3;
        if (z18) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            V3 = m11.b1.Di().L0(f9Var, bm5.f0.f104097i, bArr, null);
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            V3 = m11.b1.Di().V3(f9Var, bArr, z17, compressFormat, false, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "saveAppMsgDirThumb directSave:" + z18 + "  path:" + V3);
        return V3;
    }

    public static java.lang.String C(byte[] bArr) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", fp.k.c() + " attachBuf is null");
            return null;
        }
        java.lang.String str = c01.d9.b().d() + "ua_" + java.lang.System.currentTimeMillis();
        fp.k.c();
        if (com.p314xaae8f345.mm.vfs.w6.S(str, bArr, 0, bArr.length) == 0) {
            return str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", fp.k.c() + " writeFile error file:" + str);
        return null;
    }

    public static int D(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        return E(c11286x34a5504, str, str2, str3, i17, str4, null, 0, null);
    }

    public static int E(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, int i18, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a aVar) {
        return F(c11286x34a5504, str, str2, str3, i17, str4, str5, i18, aVar, null, null, null, null, null);
    }

    public static int F(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, int i18, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a aVar, java.util.Map map, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        ot0.q qVar = new ot0.q();
        qVar.f430179d = str;
        qVar.H = str2;
        qVar.f430239s = i17;
        return H(qVar, c11286x34a5504, str3, str4, str5, i18, aVar, map, str6, str7, str8, str9);
    }

    public static int G(ot0.q qVar, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a aVar) {
        return H(qVar, c11286x34a5504, str, str2, null, i17, aVar, null, null, null, null, null);
    }

    public static int H(ot0.q qVar, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a aVar, java.util.Map map, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar;
        java.lang.String str8;
        java.lang.Object obj;
        java.lang.String str9;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2;
        java.lang.Object obj2;
        java.lang.String B;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k0 k0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k0();
            k0Var.f273274b = 1;
            qVar.f(k0Var);
        }
        java.lang.String w17 = w(qVar, c11286x34a5504, str2, aVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", fp.k.c() + "summerbig content url:" + qVar.f430207k + " lowUrl:" + qVar.f430211l + " attachlen:" + qVar.f430215m + " attachid:" + qVar.f430227p + " attach file:" + w17 + " webViewReqId: " + str4 + " msgSvrId: " + str5 + " talkerUsername: " + str6 + " snsLocalId: " + str7);
        c01.h7 h7Var = new c01.h7();
        h7Var.f118762d = str6;
        h7Var.f118761c = str5;
        h7Var.f118763e = str7;
        java.lang.String str10 = "MicroMsg.AppMsgLogic";
        java.lang.String str11 = str7;
        java.lang.String str12 = str6;
        int i18 = 0;
        if (S(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s0(qVar, str, c11286x34a5504.f33128x4f3b3aa0, str3, aVar, h7Var, false, null))) {
            return 0;
        }
        java.lang.String str13 = java.lang.System.currentTimeMillis() + "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w17)) {
            dVar = null;
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d a17 = a(str13, qVar, w17);
            if (a17 == null) {
                return 0 - fp.k.a();
            }
            android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(w17);
            if (n07 != null) {
                qVar.S = n07.outWidth;
                qVar.R = n07.outHeight;
            }
            dVar = a17;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        if (dVar != null) {
            qVar.f430227p = "" + dVar.f72763xa3c65b86;
            if (ez.v0.f339310a.j(java.lang.Integer.valueOf(qVar.f430199i)) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430243t)) {
                qVar.f430243t = com.p314xaae8f345.mm.p947xba6de98f.s1.cj().e(dVar.f68099xfeae815);
            }
        }
        qVar.f430231q = str2;
        qVar.M1 = str4;
        f9Var2.d1(ot0.q.u(qVar, null, null));
        boolean z17 = true;
        f9Var2.r1(1);
        f9Var2.j1(1);
        f9Var2.m124850x7650bebc(p(qVar));
        c01.h7 n17 = n(str5, str6);
        java.util.Iterator it = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(",")).iterator();
        while (it.hasNext()) {
            java.lang.String str14 = (java.lang.String) it.next();
            f9Var2.u1(str14);
            f9Var2.e1(c01.w9.o(str14));
            java.lang.String wi6 = ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).wi(f9Var2);
            ot0.a aVar2 = (ot0.a) qVar.y(ot0.a.class);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                wi6 = ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).Bi(f9Var2, wi6, str5, str12);
                ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).wi();
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                qx.f0 f0Var = (qx.f0) i95.n0.c(qx.f0.class);
                c01.h7 h7Var2 = new c01.h7();
                h7Var2.f118763e = str11;
                wi6 = ((px.b0) f0Var).Ai(f9Var2, wi6, h7Var2);
                ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).wi();
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wi6)) {
                f9Var2.u3(wi6);
            }
            if (aVar2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar2.R)) {
                ((et.k2) ((ft.n4) i95.n0.c(ft.n4.class))).Bi(f9Var2, aVar2.R);
            }
            if (qVar.f430199i == 5 && qVar.f430167J == 0) {
                f9Var2.d1(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w0.b(i18, str14, z17, f9Var2.j()));
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(map != null ? ((java.lang.Long) map.get(str14)).longValue() : -1L);
            if (valueOf == null || valueOf.longValue() < 0) {
                str8 = str10;
                valueOf = java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).M9(f9Var2));
            } else {
                str8 = str10;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, "sendAppMsg, updateById, existMsgId:%d ", valueOf);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(valueOf.longValue(), f9Var2, z17);
            }
            if (valueOf.longValue() < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str8, fp.k.c() + " summerbig insert msg failed :" + valueOf);
                return 0 - fp.k.a();
            }
            byte[] bArr = c11286x34a5504.f33128x4f3b3aa0;
            if (bArr != null && bArr.length > 0) {
                if (bArr.length <= 65536 || c11286x34a5504.m48467xfb85f7b0() == 36 || c11286x34a5504.m48467xfb85f7b0() == 46 || c11286x34a5504.m48467xfb85f7b0() == 101) {
                    B = B(f9Var2, c11286x34a5504.f33128x4f3b3aa0, false, android.graphics.Bitmap.CompressFormat.JPEG, z17);
                } else {
                    B = B(f9Var2, c11286x34a5504.f33128x4f3b3aa0, qVar.f430199i == 2 ? z17 : false, android.graphics.Bitmap.CompressFormat.JPEG, false);
                }
                fp.k.c();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(B)) {
                    pt0.e0 e0Var = pt0.f0.f439742b1;
                    if (!e0Var.c(bm5.d1.b(f9Var2.mo78013xfb85f7b0(), null))) {
                        f9Var2.i1(B);
                        e0Var.s(f9Var2.Q0(), valueOf.longValue(), f9Var2);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, fp.k.a() + " summerbig new msg inserted to db , local id = " + valueOf);
            f9Var2.m124849x5361953a(valueOf.longValue());
            ot0.t tVar = new ot0.t();
            tVar.f67771x4b6e9352 = f9Var2.j();
            tVar.f67769x29dd02d3 = c11286x34a5504.f33130x6942258;
            tVar.f67770x2262335f = c11286x34a5504.f33122xe4128443.mo14189x368f3a();
            tVar.f67764x4f4dc37 = c11286x34a5504.f33121x993583fc;
            tVar.f67765x297eb4f7 = valueOf.longValue();
            tVar.f67768x10639700 = qVar.H;
            tVar.f67766xd09be28e = f9Var2.I0();
            tVar.f67767x436b2035 = f9Var2.Q0();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ri().mo880xb970c2b9(tVar);
            java.lang.String str15 = f9Var2.G;
            int i19 = c01.ia.f118787a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str15)) {
                obj = null;
                str9 = null;
            } else {
                obj = null;
                java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str15, "msgsource", null);
                str9 = d17 != null ? (java.lang.String) d17.get(".msgsource.alnode.fr") : null;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9)) {
                com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(str14, valueOf);
            }
            if (dVar != null) {
                dVar.f68106x315a5445 = valueOf.longValue();
                dVar.f68107xaaaa6883 = f9Var2.Q0();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilePreviewUtil", "getFileSendStatus: isSend = true, stack = " + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                dVar.f68112x10a0fed7 = (long) 101;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, "summerbig sendAppMsg update attInfo field_msgInfoId[%d], field_status[%d], systemRowid[%d], type[%d]", java.lang.Long.valueOf(dVar.f68106x315a5445), java.lang.Long.valueOf(dVar.f68112x10a0fed7), java.lang.Long.valueOf(dVar.f72763xa3c65b86), java.lang.Integer.valueOf(tVar.f67770x2262335f));
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(dVar, new java.lang.String[0]);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ni().f270602d.put(java.lang.Long.valueOf(dVar.f68106x315a5445), str3);
                }
                T(f9Var2, dVar, n17);
                f9Var = f9Var2;
                dVar2 = dVar;
                obj2 = obj;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, "summerbig sendAppMsg dosceneSendAppMsg attInfo[%s], msgId[%d], sessionId[%s], type[%d]", dVar, valueOf, str3, java.lang.Integer.valueOf(tVar.f67770x2262335f));
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s5 Ni = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ni();
                long longValue = valueOf.longValue();
                Ni.getClass();
                f9Var = f9Var2;
                dVar2 = dVar;
                obj2 = obj;
                c01.d9.e().g(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c4(str14, longValue, str3, null, i17, aVar));
            }
            str12 = str6;
            str11 = str7;
            str10 = str8;
            dVar = dVar2;
            f9Var2 = f9Var;
            i18 = 0;
            z17 = true;
        }
        return i18;
    }

    public static android.util.Pair I(ot0.q qVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr) {
        return J(qVar, str, str2, str3, str4, bArr, null);
    }

    public static android.util.Pair J(ot0.q qVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr, java.lang.String str5) {
        return K(qVar, str, str2, str3, str4, bArr, str5, "", "", com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5.f231012g);
    }

    public static android.util.Pair K(ot0.q qVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5) {
        return L(qVar, str, str2, str3, str4, bArr, str5, str6, str7, c16564xb55e1d5, c16564xb55e1d5.f231013d > 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0440  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair L(ot0.q r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, byte[] r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 r35, boolean r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 1389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.L(ot0.q, java.lang.String, java.lang.String, java.lang.String, java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.plugin.msg.MsgIdTalker, boolean, java.lang.String):android.util.Pair");
    }

    public static void M(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2) {
        try {
            if (((qx.e0) i95.n0.c(qx.e0.class)) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "sendAppMsgViaBypPipeline: ICgiBypService is null");
                f9Var.r1(5);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
                return;
            }
            g75.z zVar = new g75.z();
            zVar.l(qx.k0.class.getName(), new qx.k0(24, f9Var, str, str));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(jt1.e.class);
            g75.r rVar = new g75.r(kz5.n0.X0(arrayList), zVar, "SendBypAppMsg_WeClaw", null, false, 24, null);
            rVar.d();
            new java.lang.ref.WeakReference(rVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "sendAppMsgViaBypPipeline started for weclaw msg, msgId=%d, toUser=%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppMsgLogic", e17, "sendAppMsgViaBypPipeline error", new java.lang.Object[0]);
            f9Var.r1(5);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), f9Var, true);
        }
    }

    public static void N(long j17, bu.b bVar) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().b1(j17, 198L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "setError rowid:%s, stack:%s", java.lang.Long.valueOf(j17), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().get(j17, dVar);
        long j18 = dVar.f68106x315a5445;
        if (j18 <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(dVar.f68107xaaaa6883, j18);
        if (Li.m124847x74d37ac6() != dVar.f68106x315a5445) {
            return;
        }
        if (Li.P0() == 2 && Li.mo78013xfb85f7b0() == 1090519089 && Li.Z1() == 0) {
            ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(Li, dVar, 100, true);
            ((ku5.t0) ku5.t0.f394148d).g(new ze5.a2(null, Li, 3));
        } else {
            Li.r1(5);
        }
        if (Li.m124847x74d37ac6() > 0 && Li.A0() == 1 && bVar != null) {
            bu.a.e(Li.m124847x74d37ac6(), bVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "record err msg, %s, %s, %s", java.lang.Long.valueOf(Li.m124847x74d37ac6()), java.lang.Integer.valueOf(bVar.f106007a), bVar.f106008b);
        }
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(Li.m124847x74d37ac6(), Li, true);
    }

    public static void O(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        if (pt0.f0.f439742b1.h() || f9Var == null) {
            return;
        }
        f9Var.Q = str;
        f9Var.f317711r = true;
    }

    public static void P(final yb5.d dVar, final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18, java.util.function.Consumer consumer) {
        db5.e1.A(dVar.g(), dVar.s().getString(i17), "", dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572017wd), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.z(com.p314xaae8f345.mm.p2621x8fb0427b.f9.this);
                dVar.L(true);
            }
        }, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.DialogInterfaceOnClickListenerC11480x68132d3());
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(f9Var.Q0(), f9Var.m124847x74d37ac6());
        ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(Li, null, 101, true);
        Li.r1(5);
        bu.a.e(Li.m124847x74d37ac6(), bu.a.d(-1));
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), Li, true);
        if (consumer != null) {
            consumer.accept(Li);
        }
    }

    public static void Q(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        db5.e1.A(dVar.g(), dVar.s().getString(i17), "", dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572017wd), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.l0(f9Var), new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m0());
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(f9Var.Q0(), f9Var.m124847x74d37ac6());
        Li.r1(5);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(f9Var.m124847x74d37ac6(), Li, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean R(java.lang.String r26, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r27) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.R(java.lang.String, com.tencent.mm.storage.f9):boolean");
    }

    public static boolean S(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s0 s0Var) {
        pt.g0 g0Var = (pt.g0) i95.n0.c(pt.g0.class);
        int i17 = s0Var.f270591a.f430199i;
        c01.h7 h7Var = s0Var.f270596f;
        if (h7Var != null && h7Var.f118760b > 0 && ((px.a) ((qx.d0) i95.n0.c(qx.d0.class))).Ni(s0Var.f270592b, h7Var.f118762d, h7Var.f118760b, null) && qi3.m.b(i17)) {
            return true;
        }
        final ot.g gVar = (ot.g) g0Var;
        java.lang.String toUser = s0Var.f270592b;
        if (gVar.sj(i17, toUser)) {
            e(s0Var, gVar, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19597x5fa309c(), new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$c
                @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0
                public final qi3.b0 a(st.a aVar) {
                    av.b params = (av.b) aVar;
                    ((ot.g) pt.g0.this).getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                    return new av.a(params);
                }
            });
            return true;
        }
        if (gVar.qj(i17, toUser)) {
            e(s0Var, gVar, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19600x5fa309f(), new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$e
                @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0
                public final qi3.b0 a(st.a aVar) {
                    qt.e params = (qt.e) aVar;
                    ((ot.g) pt.g0.this).getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                    return new qt.d(params);
                }
            });
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (kz5.z.D0(new java.lang.Integer[]{51, 129, 63, 50}).contains(java.lang.Integer.valueOf(i17)) && (com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(toUser) || j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20531x982bfff2()) == 1)) {
            e(s0Var, gVar, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19602x5fa30a1(), new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$g
                @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0
                public final qi3.b0 a(st.a aVar) {
                    vt.e params = (vt.e) aVar;
                    ((ot.g) pt.g0.this).getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                    return new vt.d(params);
                }
            });
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (i17 == 68 && (com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(toUser) || j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20533xab0ddc47()) == 1)) {
            e(s0Var, gVar, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19604x5fa30a3(), new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$i
                @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0
                public final qi3.b0 a(st.a aVar) {
                    au.b params = (au.b) aVar;
                    ((ot.g) pt.g0.this).getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                    return new au.a(params);
                }
            });
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (kz5.z.D0(new java.lang.Integer[]{92, 93, 3, 76}).contains(java.lang.Integer.valueOf(i17)) && (com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(toUser) || j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20538x9ab05dba()) == 1)) {
            e(s0Var, gVar, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19606x5fa30a5(), new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$k
                @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0
                public final qi3.b0 a(st.a aVar) {
                    su.d params = (su.d) aVar;
                    ((ot.g) pt.g0.this).getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                    return new su.b(params);
                }
            });
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (i17 == 118 && (com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(toUser) || j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20538x9ab05dba()) == 1)) {
            l15.c cVar = new l15.c();
            e15.k kVar = new e15.k();
            kVar.m126728xdc93280d(ot0.q.u(s0Var.f270591a, null, null));
            cVar.q(kVar.j());
            su.c cVar2 = new su.c(toUser, cVar, s0Var.f270593c);
            cVar2.f493720i = s0Var.f270594d;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a aVar = s0Var.f270595e;
            if (aVar != null) {
                cVar2.f493719h = aVar;
            }
            if (h7Var != null) {
                cVar2.f493715d = h7Var;
            }
            if (s0Var.f270597g) {
                cVar2.f493718g = true;
                cVar2.f493721j = s0Var.f270598h;
            }
            gVar.uj(new su.a(cVar2));
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (i17 == 82 && (com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(toUser) || j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20531x982bfff2()) == 1)) {
            e(s0Var, gVar, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19608x5fa30a7(), new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$p
                @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0
                public final qi3.b0 a(st.a aVar2) {
                    vt.b params = (vt.b) aVar2;
                    ((ot.g) pt.g0.this).getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                    return new vt.a(params);
                }
            });
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (i17 == 57 && (com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(toUser) || j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20536xbb368d30()) == 1)) {
            e(s0Var, gVar, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19613x5fa30ac(), new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$r
                @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0
                public final qi3.b0 a(st.a aVar2) {
                    fu.a params = (fu.a) aVar2;
                    ((ot.g) pt.g0.this).getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                    return new fu.d(params);
                }
            });
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (i17 == 69 && (com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(toUser) || j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20532xfc24b6ee()) == 1)) {
            e(s0Var, gVar, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19615x5fa30ae(), new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$t
                @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0
                public final qi3.b0 a(st.a aVar2) {
                    xt.a params = (xt.a) aVar2;
                    ((ot.g) pt.g0.this).getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                    return new yt.a(params);
                }
            });
            return true;
        }
        if (gVar.rj(i17, toUser)) {
            e(s0Var, gVar, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19617x5fa30b0(), new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$v
                @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0
                public final qi3.b0 a(st.a aVar2) {
                    qu.c params = (qu.c) aVar2;
                    ((ot.g) pt.g0.this).getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                    return new qu.b(params);
                }
            });
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (!(i17 == 132 && (com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(toUser) || ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()))) {
            return false;
        }
        e(s0Var, gVar, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19619x5fa30b2(), new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$b
            @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0
            public final qi3.b0 a(st.a aVar2) {
                rt.c params = (rt.c) aVar2;
                ((ot.g) pt.g0.this).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                return new rt.b(params);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0241  */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.String, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void T(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r13, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d r14, c01.h7 r15) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.T(com.tencent.mm.storage.f9, com.tencent.mm.pluginsdk.model.app.d, c01.h7):void");
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d a(java.lang.String str, ot0.q qVar, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", fp.k.c() + " summerbig buildUploadAttachInfo clientAppDataId:" + str + " attach file :" + str2);
        java.lang.String replace = str2.replace("//", "/");
        if (!com.p314xaae8f345.mm.vfs.q7.e(replace) && replace.startsWith(lp0.b.X())) {
            ez.v0 v0Var = ez.v0.f339310a;
            java.lang.String o17 = ((com.p314xaae8f345.mm.vfs.r6) ((jz5.n) ez.v0.f339311b).mo141623x754a37bb()).o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            if (!r26.i0.y(replace, o17, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "summerbig Error attach path:%s", replace);
                return null;
            }
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
        dVar.f68113xeb1a61d6 = qVar.f430215m;
        dVar.f68099xfeae815 = str2;
        dVar.f68110xfc39fee = qVar.f430183e;
        dVar.f68094x28d45f97 = qVar.f430179d;
        dVar.f68095x97924316 = str;
        dVar.f68114x2262335f = qVar.f430199i;
        dVar.f68112x10a0fed7 = 200L;
        dVar.f68101x13f40970 = true;
        dVar.f68096xac3be4e = c01.id.a();
        dVar.f68103x4a777c2 = c01.id.e();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        dVar.f68105x2c1f0acb = sb6.toString();
        dVar.f68102x141a7c95 = 0;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo880xb970c2b9(dVar);
        fp.k.c();
        if (dVar.f72763xa3c65b86 >= 0) {
            return dVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", fp.k.c() + " summerbig uploadAttach insert appattach info failed :" + dVar.f72763xa3c65b86);
        return null;
    }

    public static boolean b(java.lang.String str) {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.equals("0:0")) ? false : true;
    }

    public static int c(int i17) {
        switch (i17) {
            case -2130706383:
            case -2113929167:
            case -2097151951:
            case -1879048191:
            case -1879048190:
            case -1879048189:
            case -1879048186:
            case -1879048185:
            case -1879048183:
            case -1879048176:
            case 74:
            case 83:
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.l.f34676x366c91de /* 84 */:
            case 87:
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45664xedca4d42 /* 95 */:
            case 102:
            case 103:
            case 131:
            case 132:
            case 1048625:
            case 16777265:
            case 268435505:
            case 285212721:
            case 301989937:
            case 318767153:
            case 335544369:
            case 352321585:
            case 369098801:
            case 385876017:
            case 402653233:
            case 419430449:
            case 436207665:
            case 452984881:
            case 469762097:
            case 486539313:
            case 503316529:
            case 520093745:
            case 536870961:
            case 536936497:
            case 553648177:
            case 587202609:
            case 603979825:
            case 687865905:
            case 704643121:
            case 738197553:
            case 754974769:
            case 771751985:
            case 805306417:
            case 822083633:
            case 838860849:
            case 855638065:
            case 905969713:
            case 922746929:
            case 939524145:
            case 973078577:
            case 974127153:
            case 975175729:
            case 976224305:
            case 977272881:
            case 978321457:
            case 979370033:
            case 1040187441:
            case 1077936177:
            case 1090519089:
            case 1107296305:
            case 1124073521:
            case 1140850737:
            case 1157627953:
            case 1174405169:
            case 1191182385:
            case 1207959601:
            case 1224736817:
            case 1241514033:
            case 1409286193:
            case 1426063409:
            case 1442840625:
            case 1627390001:
            case 1895825457:
                return 49;
            default:
                return i17;
        }
    }

    public static void d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.r0 r0Var) {
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "parse msgContent error, %s", f9Var.j());
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430227p) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.L)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "msgContent format error, %s", f9Var.j());
            v17.f430227p = "" + v17.L.hashCode();
        }
        java.lang.String str = v17.f430227p;
        if (u(f9Var, g(str, f9Var.m124847x74d37ac6(), f9Var.Q0())) || !R(str, f9Var)) {
            return;
        }
        f270487a = new bt3.l0(f9Var.m124847x74d37ac6(), f9Var.Q0(), str, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n0(r0Var));
        c01.d9.e().g(f270487a);
    }

    public static boolean e(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.s0 s0Var, pt.g0 g0Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u0 u0Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.t0 t0Var) {
        ot0.a aVar;
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(ot0.q.u(s0Var.f270591a, null, null));
        byte[] bArr = s0Var.f270593c;
        java.lang.String str = s0Var.f270592b;
        st.a a17 = u0Var.a(str, cVar, bArr);
        a17.f493720i = s0Var.f270594d;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a aVar2 = s0Var.f270595e;
        if (aVar2 != null) {
            a17.f493719h = aVar2;
        }
        c01.h7 h7Var = s0Var.f270596f;
        if (h7Var != null) {
            a17.f493715d = h7Var;
        }
        if (s0Var.f270597g) {
            a17.f493718g = true;
            a17.f493721j = s0Var.f270598h;
        }
        ot0.q qVar = s0Var.f270591a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e = qVar.f430258w2;
        if (c16565x9bc03d4e != null && c16565x9bc03d4e.f231022n != null) {
            p15.e eVar = new p15.e();
            eVar.m126728xdc93280d(qVar.f430258w2.f231022n);
            a17.f493716e = eVar;
        }
        if (((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).qj(qVar.f430199i, str) && (aVar = (ot0.a) qVar.y(ot0.a.class)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.R)) {
            p15.e eVar2 = a17.f493716e;
            if (eVar2 == null) {
                eVar2 = new p15.e();
            }
            eVar2.F(aVar.R);
            a17.f493716e = eVar2;
        }
        ((ot.g) g0Var).uj(t0Var.a(a17));
        return true;
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str5 = a17.f294812f;
        if (str5 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
            if (!str5.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str4 = str + "da_" + java.lang.System.currentTimeMillis();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                str4 = str4 + "." + str3;
            }
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && !str2.endsWith(str3)) {
                str2 = str2 + "." + str3;
            }
            str4 = str + str2;
            if (com.p314xaae8f345.mm.vfs.w6.j(str4)) {
                int i17 = 1;
                while (true) {
                    if (i17 >= 20) {
                        break;
                    }
                    if (!com.p314xaae8f345.mm.vfs.w6.j(str + i17 + "_" + str2)) {
                        str4 = str + i17 + "_" + str2;
                        break;
                    }
                    i17++;
                }
                if (i17 == 20) {
                    str4 = str + "da_" + java.lang.System.currentTimeMillis();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        str4 = str4 + "." + str3;
                    }
                }
            }
        }
        try {
            if (new com.p314xaae8f345.mm.vfs.r6(str4).s().o().equalsIgnoreCase(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)).o())) {
                return str4;
            }
            java.lang.String str6 = str + "da_" + java.lang.System.currentTimeMillis();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                str6 = str6 + str2;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                str6 = str6 + "." + str3;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppMsgLogic", "maybe DirTraversal attach. %s", str6);
            return str6;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppMsgLogic", e17, "", new java.lang.Object[0]);
            java.lang.String str7 = str + "da_" + java.lang.System.currentTimeMillis();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                return str7;
            }
            return str7 + "." + str3;
        }
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d g(java.lang.String str, long j17, java.lang.String str2) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d h17 = h(str);
        if (h17 == null) {
            h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().J0(j17, str2);
        }
        if (h17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo info[%s], rowid[%d], isUpload[%b], fullpath[%s], totallen[%d], offset[%d], mediaSvrId[%s], mediaid[%s], msgid[%d], type[%d], stack[%s]", h17, java.lang.Long.valueOf(h17.f72763xa3c65b86), java.lang.Boolean.valueOf(h17.f68101x13f40970), h17.f68099xfeae815, java.lang.Long.valueOf(h17.f68113xeb1a61d6), java.lang.Long.valueOf(h17.f68109x90a9378), h17.f68105x2c1f0acb, h17.f68104xaca5bdda, java.lang.Long.valueOf(h17.f68106x315a5445), java.lang.Long.valueOf(h17.f68114x2262335f), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo is null stack[%s]", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        }
        return h17;
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d h(java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s", str);
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str, -1L);
        if (V == -1) {
            dVar = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().D0(str);
            if (dVar == null || !dVar.f68105x2c1f0acb.equals(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 2");
                dVar = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", str, java.lang.Long.valueOf(V));
            return dVar;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().get(V, dVar);
        if (dVar.f72763xa3c65b86 != V && ((dVar = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().D0(str)) == null || !dVar.f68105x2c1f0acb.equals(str))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 1");
            dVar = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", str, java.lang.Long.valueOf(V));
        return dVar;
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d i(java.lang.String str, long j17, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, long j18, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
        dVar.f68099xfeae815 = str;
        dVar.f68094x28d45f97 = str3;
        dVar.f68110xfc39fee = i17;
        dVar.f68105x2c1f0acb = str4;
        dVar.f68113xeb1a61d6 = j18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = ");
        sb6.append(z17);
        sb6.append(", stack = ");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        dVar.f68112x10a0fed7 = 101;
        dVar.f68101x13f40970 = false;
        dVar.f68096xac3be4e = c01.id.a();
        dVar.f68103x4a777c2 = c01.id.e();
        dVar.f68106x315a5445 = j17;
        dVar.f68107xaaaa6883 = str2;
        dVar.f68108x6a1cf14e = 0L;
        return dVar;
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d j(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "parse msgContent error, %s", f9Var.j());
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430227p) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.L)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "msgContent format error, %s", f9Var.j());
            v17.f430227p = "" + v17.L.hashCode();
        }
        java.lang.String str = v17.f430227p;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d g17 = g(str, f9Var.m124847x74d37ac6(), f9Var.Q0());
        if (g17 != null) {
            return g17;
        }
        R(str, f9Var);
        return g(str, f9Var.m124847x74d37ac6(), f9Var.Q0());
    }

    public static java.lang.String k() {
        return com.p314xaae8f345.mm.vfs.q7.c("attachment") + '/';
    }

    public static java.lang.String l(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return "";
        }
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(f9Var.j());
        int i17 = bVar.f513848e;
        return (((l15.d) bVar.m75936x14adae67(i17 + 30)) == null || ((l15.d) bVar.m75936x14adae67(i17 + 30)).k() == null) ? "" : ((l15.d) bVar.m75936x14adae67(i17 + 30)).k().j();
    }

    public static int m(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = ");
        sb6.append(z17);
        sb6.append(", stack = ");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        return 101;
    }

    public static c01.h7 n(java.lang.String str, java.lang.String str2) {
        c01.h7 h7Var = new c01.h7();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            try {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str2, java.lang.Long.parseLong(str));
                h7Var.f118762d = o27.Q0();
                h7Var.f118760b = o27.m124847x74d37ac6();
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppMsgLogic", "parseLong error, %s", str);
            }
        }
        return h7Var;
    }

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d o(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d h17 = h(str);
        if (h17 != null) {
            return h17;
        }
        s(f9Var.m124847x74d37ac6(), f9Var.Q0(), f9Var.j(), null);
        return h(str);
    }

    public static int p(ot0.q qVar) {
        int i17;
        if (qVar == null) {
            return 49;
        }
        int i18 = qVar.f430199i;
        int i19 = qVar.f430167J;
        int i27 = qVar.f430168a0;
        int i28 = qVar.f430172b0;
        int i29 = qVar.A1;
        int i37 = qVar.G1;
        if (i18 == 76) {
            return 1040187441;
        }
        if (i18 == 92) {
            return 1409286193;
        }
        if (i18 == 93) {
            return 1426063409;
        }
        if (i18 == 118) {
            return 1442840625;
        }
        if (i18 == 133) {
            return 1476395057;
        }
        if (i18 == 3) {
            ka0.r0 r0Var = (ka0.r0) i95.n0.c(ka0.r0.class);
            java.lang.String str = qVar.f430179d;
            ((ja0.o0) r0Var).getClass();
            if (ll3.j2.i(str) || "wx485a97c844086dc9".equals(qVar.f430179d)) {
                return 1040187441;
            }
        }
        if (i18 == 116) {
            return 1191182385;
        }
        if (i18 == 41) {
            return 1124073521;
        }
        if (i27 == 4 || i28 != 0) {
            return 318767153;
        }
        if (i18 == 2001) {
            if (i19 == 1 || i37 == 1) {
                return 469762097;
            }
            return i29 == 4 ? 503316529 : 436207665;
        }
        if (i18 == 2002) {
            return 536870961;
        }
        if (i18 == 2003) {
            return 536936497;
        }
        if (i18 == 66) {
            return 905969713;
        }
        if (i19 == 1) {
            return i18 == 21 ? -1879048185 : 285212721;
        }
        if (i19 == 2) {
            return i18 == 21 ? -1879048183 : 301989937;
        }
        if (i19 == 3) {
            return i18 == 21 ? -1879048176 : -1879048189;
        }
        if (i19 == 4) {
            return i18 == 21 ? -1879048183 : -1879048190;
        }
        if (i19 == 5) {
            return -1879048191;
        }
        if (i19 == 17) {
            return -1879048186;
        }
        switch (i18) {
            case 1:
                return 16777265;
            case 2:
                return 268435505;
            case 6:
            case 74:
            case 130:
            case 131:
                return 1090519089;
            case 8:
                return 1048625;
            case 10:
                return 335544369;
            case 13:
                return 369098801;
            case 16:
                return 452984881;
            case 17:
                return -1879048186;
            case 20:
                return 402653233;
            case 33:
            case 36:
                ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
                if (aVar != null && aVar.f429879b && ((i17 = qVar.f430214l2) == 2 || i17 == 3)) {
                    return 553648177;
                }
                return (aVar == null || !((aVar.f429882e || aVar.Q) && qVar.f430214l2 == 3)) ? 49 : 587202609;
            case 34:
                return 520093745;
            case 46:
                return 687865905;
            case 47:
                return 704643121;
            case 48:
                return 738197553;
            case 50:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 771751985;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 771751985;
            case 51:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 754974769;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 754974769;
            case 52:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 788529201;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 788529201;
            case 53:
                return 805306417;
            case 54:
                ot0.f fVar = (ot0.f) qVar.y(ot0.f.class);
                return (fVar == null || fVar.f429998l == null) ? 49 : 486539313;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1.f34664x366c91de /* 57 */:
                return 822083633;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k9.f34376x366c91de /* 59 */:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 838860849;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 838860849;
            case 60:
                return 855638065;
            case 62:
                return 922746929;
            case 63:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 973078577;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 973078577;
            case 65:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 989855793;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 989855793;
            case 69:
                return 939524145;
            case 72:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 1006633009;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 1006633009;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.k.f34811x366c91de /* 73 */:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 956301361;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 956301361;
            case 75:
                int b17 = zy2.d5.b(qVar.G2, qVar.D2);
                if (b17 == 2) {
                    return 1057030193;
                }
                if (b17 == 3) {
                    return 1023541297;
                }
                if (b17 == 4 || b17 == 5) {
                    return 1023606833;
                }
                if (b17 != 6) {
                    return b17 != 100000000 ? 49 : 1023475761;
                }
                return 1023672369;
            case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51705xc4897837 /* 77 */:
                return 1074790449;
            case 80:
                return 1075839025;
            case 81:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 1076887601;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 1076887601;
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45675x92fdfc4b /* 82 */:
                return 974127153;
            case 87:
                return 1107296305;
            case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51695x8a2568b7 /* 88 */:
                return 975175729;
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45659xd352f050 /* 89 */:
                return 1078984753;
            case 94:
                return 976224305;
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45664xedca4d42 /* 95 */:
                return 1080033329;
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45665x7309a58f /* 96 */:
                return 977272881;
            case 101:
                return 1140850737;
            case 105:
                return 1157627953;
            case 106:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 1174405169;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 1174405169;
            case 109:
                return 1627390001;
            case 111:
                return 978321457;
            case 112:
                return 1081081905;
            case 113:
                return 979370033;
            case 114:
                return 1895825457;
            case 115:
                return -2130706383;
            case 119:
                return 1207959601;
            case 120:
                return 1224736817;
            case 124:
                return -2113929167;
            case 126:
                return -2097151951;
            case 128:
                return -2080374735;
            case 129:
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) == 1) {
                    return 1241514033;
                }
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1 ? 49 : 1241514033;
            case 2000:
            case com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46349x3142bb26 /* 2011 */:
                return 419430449;
            case 671088689:
                return 671088689;
            default:
                return 49;
        }
    }

    public static android.util.Pair q(java.lang.String str) {
        ot0.q v17 = ot0.q.v(str);
        if (v17 == null) {
            return new android.util.Pair(0, "");
        }
        int i17 = v17.f430199i;
        if (i17 == 2000 || i17 == 2001) {
            java.lang.String str2 = v17.f430245t1;
            if (str2 != null && !str2.isEmpty()) {
                return new android.util.Pair(java.lang.Integer.valueOf(i17), v17.f430245t1);
            }
            java.lang.String str3 = v17.L0;
            if (str3 != null && !str3.isEmpty()) {
                return new android.util.Pair(java.lang.Integer.valueOf(i17), v17.K0);
            }
            java.lang.String str4 = v17.f430269z1;
            if (str4 != null && !str4.isEmpty()) {
                return new android.util.Pair(java.lang.Integer.valueOf(i17), v17.f430269z1);
            }
        } else if (i17 == 115) {
            l15.c cVar = new l15.c();
            cVar.m126728xdc93280d(str);
            v05.b k17 = cVar.k();
            if (k17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "getMsgKey, ecsGiftAppMsg is null");
                return new android.util.Pair(0, "");
            }
            w05.d dVar = (w05.d) k17.m75936x14adae67(k17.f513848e + 66);
            if (dVar != null) {
                return new android.util.Pair(java.lang.Integer.valueOf(i17), dVar.t());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "getMsgKey, ecsGiftAppMsgInfo is null");
            return new android.util.Pair(0, "");
        }
        return new android.util.Pair(0, "");
    }

    public static int r(java.lang.String str) {
        ot0.q v17 = ot0.q.v(str);
        if (v17 == null || !b(v17.f430227p)) {
            return -1;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(v17.f430227p, -1L);
        if (V != -1) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().get(V, dVar);
            if (dVar.f72763xa3c65b86 != V && ((dVar = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().D0(v17.f430227p)) == null || !dVar.f68105x2c1f0acb.equals(v17.f430227p))) {
                return -1;
            }
        } else {
            dVar = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().D0(v17.f430227p);
            if (dVar == null || !dVar.f68105x2c1f0acb.equals(v17.f430227p)) {
                return -1;
            }
        }
        long j17 = dVar.f68113xeb1a61d6;
        if (j17 == 0) {
            return -1;
        }
        return (int) ((dVar.f68109x90a9378 * 100) / j17);
    }

    public static java.lang.String s(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach msgLocalId[%d], msgXml[%s], downloadPath[%s]", java.lang.Long.valueOf(j17), str2, str4);
        ot0.q v17 = ot0.q.v(str2);
        if (v17 == null) {
            return null;
        }
        if (str4 == null) {
            str4 = f(com.p314xaae8f345.mm.vfs.q7.c("attachment") + '/', v17.n(), v17.f430223o);
        }
        java.lang.String str5 = str4;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430227p) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.L)) {
            v17.f430227p = "" + v17.L.hashCode();
        }
        int i17 = v17.f430183e;
        java.lang.String str6 = v17.f430179d;
        java.lang.String str7 = v17.f430227p;
        t(str5, j17, str, i17, str6, str7, v17.f430215m, v17.f430199i, v17.T, v17.f430247u);
        return str7;
    }

    public static java.lang.String t(java.lang.String str, long j17, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, long j18, int i18, java.lang.String str5, int i19) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
        dVar.f68099xfeae815 = str;
        dVar.f68094x28d45f97 = str3;
        dVar.f68110xfc39fee = i17;
        dVar.f68105x2c1f0acb = str4;
        dVar.f68113xeb1a61d6 = j18;
        m(false);
        dVar.f68112x10a0fed7 = 101;
        dVar.f68101x13f40970 = false;
        dVar.f68096xac3be4e = c01.id.a();
        dVar.f68103x4a777c2 = c01.id.e();
        dVar.f68106x315a5445 = j17;
        dVar.f68107xaaaa6883 = str2;
        dVar.f68108x6a1cf14e = 0L;
        dVar.f68114x2262335f = i18;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo880xb970c2b9(dVar));
        java.lang.Long valueOf2 = java.lang.Long.valueOf(dVar.f72763xa3c65b86);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(dVar.f68113xeb1a61d6);
        java.lang.Long valueOf4 = java.lang.Long.valueOf(dVar.f68114x2262335f);
        java.lang.Integer valueOf5 = java.lang.Integer.valueOf(i19);
        java.lang.Long valueOf6 = java.lang.Long.valueOf(j17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach ret[%b], rowid[%d], field_totalLen[%d], type[%d], isLargeFile[%d], destFile[%s], msgLocalId[%s], stack[%s]", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, str, valueOf6, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return str4;
    }

    public static boolean u(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar) {
        if (dVar == null || !com.p314xaae8f345.mm.vfs.w6.j(dVar.f68099xfeae815)) {
            return false;
        }
        return dVar.t0() || (f9Var.A0() == 1 && dVar.f68101x13f40970);
    }

    public static boolean v(int i17) {
        switch (i17) {
            case -1879048191:
            case -1879048190:
            case -1879048189:
                return true;
            default:
                return false;
        }
    }

    public static java.lang.String w(ot0.q qVar, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a aVar) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0 h0Var;
        int i17;
        fp.k.c();
        int i18 = c11286x34a5504.f33127xc9f07109;
        c11286x34a5504.f33122xe4128443.mo14189x368f3a();
        qVar.f430183e = c11286x34a5504.f33127xc9f07109;
        qVar.f430187f = c11286x34a5504.f33130x6942258;
        qVar.f430191g = c11286x34a5504.f33121x993583fc;
        qVar.X = c11286x34a5504.f33123xa4d390c1;
        qVar.Y = c11286x34a5504.f33124x838b091d;
        qVar.Z = c11286x34a5504.f33125x9b39409a;
        if (aVar != null) {
            if (!android.text.TextUtils.isEmpty(aVar.f270330h)) {
                qVar.f430255w = aVar.f270330h;
            }
            if (!android.text.TextUtils.isEmpty(aVar.f270331i)) {
                qVar.f430259x = aVar.f270331i;
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject iMediaObject = c11286x34a5504.f33122xe4128443;
        qVar.f430199i = iMediaObject.mo14189x368f3a();
        if (aVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f270326d)) {
            ot0.l lVar = (ot0.l) qVar.y(ot0.l.class);
            ot0.l lVar2 = lVar != null ? lVar : new ot0.l();
            lVar2.f430102d = aVar.f270326d;
            lVar2.f430100b = c11286x34a5504.f33129x73ff1fce;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject iMediaObject2 = c11286x34a5504.f33122xe4128443;
            if (iMediaObject2 instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936) {
                lVar2.f430101c = ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936) iMediaObject2).f33194x4b2cc8d;
            }
            if (lVar == null) {
                qVar.f(lVar2);
            }
        }
        int i19 = qVar.f430199i;
        if (i19 == 7) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699 c11272xd6622699 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699) iMediaObject;
            qVar.f430235r = c11272xd6622699.f33061xb2206a6f;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(c11272xd6622699.f33062xd4213b46)) {
                fp.k.c();
                byte[] bArr = c11272xd6622699.f33062xd4213b46;
                int length = bArr.length;
                qVar.f430215m = bArr.length;
                return C(bArr);
            }
            qVar.f430215m = com.p314xaae8f345.mm.vfs.w6.k(c11272xd6622699.f33063xd426afc1);
            fp.k.c();
            java.lang.String str2 = c11272xd6622699.f33063xd426afc1;
            if (qVar.f430215m <= 0) {
                return null;
            }
            qVar.f430223o = com.p314xaae8f345.mm.vfs.w6.n(str2);
            return c11272xd6622699.f33063xd426afc1;
        }
        if (i19 == 49) {
            int i27 = ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11299x548b5c9f) iMediaObject).f33243x90a0a19a;
            qVar.f430199i = (i27 == 1 || i27 == 2) ? 19 : -1;
            return null;
        }
        if (ez.v0.f339310a.j(java.lang.Integer.valueOf(i19))) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c c11280xa65cf99c = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c) iMediaObject;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(c11280xa65cf99c.f33092xd4213b46)) {
                fp.k.c();
                byte[] bArr2 = c11280xa65cf99c.f33092xd4213b46;
                int length2 = bArr2.length;
                qVar.f430215m = bArr2.length;
                return C(bArr2);
            }
            qVar.f430215m = com.p314xaae8f345.mm.vfs.w6.k(c11280xa65cf99c.f33093xd426afc1);
            fp.k.c();
            java.lang.String str3 = c11280xa65cf99c.f33093xd426afc1;
            if (qVar.f430215m <= 0) {
                return null;
            }
            java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(str3);
            qVar.f430223o = n17;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17)) {
                qVar.f430223o = com.p314xaae8f345.mm.vfs.w6.n(c11286x34a5504.f33130x6942258);
            }
            return c11280xa65cf99c.f33093xd426afc1;
        }
        int i28 = qVar.f430199i;
        if (i28 == 2) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9 c11283x90d63ed9 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9) iMediaObject;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(c11283x90d63ed9.f33104xcba0e7a5)) {
                fp.k.c();
                byte[] bArr3 = c11283x90d63ed9.f33104xcba0e7a5;
                int length3 = bArr3.length;
                qVar.f430215m = bArr3.length;
                return C(bArr3);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11283x90d63ed9.f33105xcba65c20)) {
                return null;
            }
            qVar.f430215m = com.p314xaae8f345.mm.vfs.w6.k(c11283x90d63ed9.f33105xcba65c20);
            fp.k.c();
            java.lang.String str4 = c11283x90d63ed9.f33105xcba65c20;
            if (qVar.f430215m > 0) {
                qVar.f430223o = com.p314xaae8f345.mm.vfs.w6.n(str4);
                java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(c01.d9.b().d(), "appmsg_img_" + java.lang.System.currentTimeMillis()).o();
                android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(c11283x90d63ed9.f33105xcba65c20);
                if (n07 != null && n07.outWidth > 0 && n07.outHeight > 0) {
                    if (c01.z1.a(c11283x90d63ed9.f33105xcba65c20, "", true)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "this picture can send raw image but must copy [%s] to [%s]", c11283x90d63ed9.f33105xcba65c20, o17);
                        if (com.p314xaae8f345.mm.vfs.w6.d(c11283x90d63ed9.f33105xcba65c20, o17, false) >= 0) {
                            return o17;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppMsgLogic", "copy file error path[%s, %s]", c11283x90d63ed9.f33105xcba65c20, o17);
                        return null;
                    }
                    if (n07.outWidth > 960 || n07.outHeight > 960) {
                        android.graphics.Bitmap T = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(c11283x90d63ed9.f33105xcba65c20, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, false);
                        if (T == null) {
                            return null;
                        }
                        try {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(T, 100, android.graphics.Bitmap.CompressFormat.JPEG, o17, true);
                        } catch (java.io.IOException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppMsgLogic", e17, "", new java.lang.Object[0]);
                            return null;
                        }
                    } else if (com.p314xaae8f345.mm.vfs.w6.d(c11283x90d63ed9.f33105xcba65c20, o17, false) < 0) {
                        return null;
                    }
                    return o17;
                }
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Boolean.valueOf(n07 == null);
                objArr[1] = java.lang.Integer.valueOf(n07 == null ? -1 : n07.outWidth);
                objArr[2] = java.lang.Integer.valueOf(n07 == null ? -1 : n07.outHeight);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "options is null! %B, bitmapWidth = %d, bitmapHeight = %d", objArr);
            }
            return null;
        }
        if (i28 == 3) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423 c11288x597a4423 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423) iMediaObject;
            qVar.f430207k = c11288x597a4423.f33185x324c710a;
            qVar.f430211l = c11288x597a4423.f33184xc6370d0b;
            qVar.V = c11288x597a4423.f33182xc58aab80;
            qVar.W = c11288x597a4423.f33183xead55f01;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0 i0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0();
            i0Var.f273223b = c11288x597a4423.f33186x239f8b5;
            i0Var.f273224c = c11288x597a4423.f33187x1478a44a;
            qVar.f(i0Var);
            return null;
        }
        if (i28 == 76) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936 c11289x4ff06936 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936) iMediaObject;
            java.lang.String str5 = c11289x4ff06936.f33195x4b66fa4;
            if (com.p314xaae8f345.mm.vfs.w6.j(str5)) {
                byte[] Ai = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ai(com.p314xaae8f345.mm.vfs.w6.N(str5, 0, -1));
                if (Ai != null) {
                    c11286x34a5504.f33128x4f3b3aa0 = Ai;
                }
            }
            qVar.f430207k = c11289x4ff06936.f33201x324c710a;
            qVar.V = c11289x4ff06936.f33198xc58aab80;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0 i0Var2 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0();
            i0Var2.f273223b = aVar != null ? aVar.f270325c : "";
            i0Var2.f273229h = c11289x4ff06936.f33203x2b375427;
            i0Var2.f273230i = c11289x4ff06936.f33192xedb9d9a;
            i0Var2.f273224c = c11289x4ff06936.f33204x1478a44a;
            i0Var2.f273231j = c11289x4ff06936.f33199xd0293a5e;
            i0Var2.f273232k = java.lang.String.valueOf(c11289x4ff06936.f33197xafbf827);
            i0Var2.f273233l = c11289x4ff06936.f33196x187d426e;
            i0Var2.f273235n = c11289x4ff06936.f33193x89444d94;
            i0Var2.f273234m = qVar.Z;
            i0Var2.f273236o = c11289x4ff06936.f33200xa7a65d4d;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11290x5453c607 c11290x5453c607 = c11289x4ff06936.f33202x8b1eb086;
            i0Var2.f273237p = c11290x5453c607 != null ? b21.m.e(c11290x5453c607.f33206x54340220) : "";
            java.lang.Object[] objArr2 = new java.lang.Object[4];
            objArr2[0] = c11289x4ff06936.f33203x2b375427;
            objArr2[1] = java.lang.Boolean.valueOf(c11289x4ff06936.f33202x8b1eb086 != null);
            objArr2[2] = c11289x4ff06936.f33196x187d426e;
            objArr2[3] = qVar.Z;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "share music mv to chatting, singerName:%s, musicVipInfo is valid:%b, identification: %s, extInfo: %s", objArr2);
            qVar.f(i0Var2);
            return null;
        }
        if (i28 == 4) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11298x4d56d1f9 c11298x4d56d1f9 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11298x4d56d1f9) iMediaObject;
            qVar.f430207k = c11298x4d56d1f9.f33238x44a0a2f4;
            qVar.f430211l = c11298x4d56d1f9.f33237x3accbfe1;
            return null;
        }
        if (i28 == 5 || i28 == 54 || i28 == 69) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1 c11300x89dbd7a1 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1) iMediaObject;
            qVar.f430207k = c11300x89dbd7a1.f33249xa1713a8c;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11300x89dbd7a1.f33246xb2206a6f)) {
                qVar.f430235r = c11300x89dbd7a1.f33246xb2206a6f;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11300x89dbd7a1.f33245xc682a690)) {
                qVar.C2 = c11300x89dbd7a1.f33245xc682a690;
            }
            if (qVar.f430199i != 69 || !(c11300x89dbd7a1 instanceof c53.b)) {
                return null;
            }
            c53.b bVar = (c53.b) c11300x89dbd7a1;
            c53.a aVar2 = new c53.a();
            aVar2.f120177b = bVar.f120186a;
            aVar2.f120178c = bVar.f120187b;
            aVar2.f120179d = bVar.f120188c;
            aVar2.f120180e = bVar.f120189d;
            aVar2.f120181f = bVar.f120190e;
            aVar2.f120182g = bVar.f120191f;
            aVar2.f120183h = bVar.f120192g;
            aVar2.f120184i = bVar.f120193h;
            aVar2.f120185j = bVar.f120194i;
            qVar.f(aVar2);
            return null;
        }
        if (i28 == 36 || i28 == 46 || i28 == 48) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb c11287xc333feeb = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb) iMediaObject;
            qVar.f430206j2 = c11287xc333feeb.f33177xf01afcf6;
            qVar.f430202i2 = c11287xc333feeb.f33176x346425;
            qVar.f430207k = c11287xc333feeb.f33178xa1713a8c;
            k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(c11287xc333feeb.f33177xf01afcf6);
            if (Bi == null) {
                return null;
            }
            if (Bi.w0() != null) {
                qVar.A2 = Bi.w0().f158977d;
            }
            qVar.B2 = Bi.f68910xea1bd3d4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "add appbrand version and appbrand icon url : %d, %s", java.lang.Integer.valueOf(qVar.A2), qVar.B2);
            return null;
        }
        if (i28 == 1) {
            qVar.f430187f = ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11296xa95b008d) iMediaObject).f33229x36452d;
            if (aVar == null || (i17 = aVar.f270329g) <= 0) {
                return null;
            }
            rt0.c cVar = new rt0.c();
            cVar.f480907b = i17;
            qVar.f(cVar);
            return null;
        }
        if (i28 == 8) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11276x643df984 c11276x643df984 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11276x643df984) iMediaObject;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(c11276x643df984.f33076x647d5110)) {
                fp.k.c();
                byte[] bArr4 = c11276x643df984.f33076x647d5110;
                int length4 = bArr4.length;
                qVar.f430215m = bArr4.length;
                return C(bArr4);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11276x643df984.f33077x6482c58b)) {
                qVar.f430231q = str;
                return null;
            }
            qVar.f430215m = com.p314xaae8f345.mm.vfs.w6.k(c11276x643df984.f33077x6482c58b);
            fp.k.c();
            java.lang.String str6 = c11276x643df984.f33077x6482c58b;
            if (qVar.f430215m <= 0) {
                return null;
            }
            qVar.f430223o = com.p314xaae8f345.mm.vfs.w6.n(str6);
            return c11276x643df984.f33077x6482c58b;
        }
        if (i28 == 15) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11278x53a16a89 c11278x53a16a89 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11278x53a16a89) iMediaObject;
            qVar.f430267z = c11278x53a16a89.f33086x5d65bbd9;
            qVar.f430212l0 = c11278x53a16a89.f33084x3635a0b2;
            qVar.f430208k0 = c11278x53a16a89.f33085x6b6947e1;
            qVar.f430167J = 8;
            qVar.f430207k = c11278x53a16a89.url;
            return null;
        }
        if (i28 == 13) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11278x53a16a89 c11278x53a16a892 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11278x53a16a89) iMediaObject;
            qVar.f430267z = c11278x53a16a892.f33086x5d65bbd9;
            qVar.f430212l0 = c11278x53a16a892.f33084x3635a0b2;
            qVar.f430208k0 = c11278x53a16a892.f33085x6b6947e1;
            qVar.f430167J = 8;
            qVar.f430207k = c11278x53a16a892.url;
            return null;
        }
        if (i28 == 68) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11284xc62f1a51) {
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11284xc62f1a51 c11284xc62f1a51 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11284xc62f1a51) iMediaObject;
                h0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0();
                h0Var.f273198b = c11284xc62f1a51.f33110xf01afcf6;
                h0Var.f273199c = c11284xc62f1a51.f33107x346425;
                h0Var.f273200d = c11284xc62f1a51.f33108x66f18c8;
                h0Var.f273201e = c11284xc62f1a51.f33109xca90681b;
                if (iMediaObject instanceof ja3.a) {
                    ja3.a aVar3 = (ja3.a) c11284xc62f1a51;
                    h0Var.f273202f = aVar3.f380145a;
                    h0Var.f273203g = aVar3.f380146b;
                    h0Var.f273204h = aVar3.f380147c;
                    h0Var.f273205i = aVar3.f380148d;
                    h0Var.f273206j = aVar3.f380149e;
                    h0Var.f273208l = aVar3.f380150f;
                }
            } else {
                h0Var = null;
            }
            if (h0Var != null) {
                qVar.f430207k = ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11284xc62f1a51) iMediaObject).f33111xa1713a8c;
                qVar.f(h0Var);
            }
            qVar.f430167J = 0;
            return null;
        }
        if (i28 == 25) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11274x8f3c4310 c11274x8f3c4310 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11274x8f3c4310) iMediaObject;
            qVar.f430267z = c11274x8f3c4310.f33072x5d65bbd9;
            qVar.f430207k = c11274x8f3c4310.url;
            qVar.N1 = c11274x8f3c4310.f33071xca84056f;
            qVar.O1 = c11274x8f3c4310.f33069x85f9d816;
            qVar.P1 = c11274x8f3c4310.f33070x121027c0;
            qVar.f430167J = 18;
            return null;
        }
        if (i28 == 27 || i28 == 26) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11277x6889f838 c11277x6889f838 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11277x6889f838) iMediaObject;
            java.lang.String str7 = c11277x6889f838.f33079x61ad9236;
            qVar.f430267z = str7;
            qVar.f430207k = c11277x6889f838.url;
            qVar.Q1 = c11277x6889f838.tid;
            qVar.R1 = c11277x6889f838.f33082x6942258;
            qVar.S1 = c11277x6889f838.f33078x2efe91;
            qVar.T1 = str7;
            qVar.U1 = c11277x6889f838.f33081xcf44445b;
            qVar.V1 = c11277x6889f838.f33080x333a8669;
            qVar.f430167J = 20;
            return null;
        }
        if (i28 == 97) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(iMediaObject);
            throw null;
        }
        if (i28 != 101) {
            return null;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11291xe63498b8 c11291xe63498b8 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11291xe63498b8) iMediaObject;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0 g0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0();
        qVar.f430207k = "https://support.weixin.qq.com/update/";
        com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138 c16075xd72ab138 = aVar.f270328f;
        if (c16075xd72ab138 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "johnjh msg gamepageobject or liteappbizdatainfo is null");
            return null;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0 h0Var2 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0();
        h0Var2.f273198b = c16075xd72ab138.f223649d;
        h0Var2.f273199c = c16075xd72ab138.f223650e;
        h0Var2.f273200d = c16075xd72ab138.f223651f;
        h0Var2.f273201e = c16075xd72ab138.f223653h.intValue();
        qVar.f(h0Var2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138 c16075xd72ab1382 = aVar.f270328f;
        g0Var.f273163b = c16075xd72ab1382.f223652g;
        g0Var.f273164c = c16075xd72ab1382.f223654i;
        if (c11291xe63498b8.f33208x7b98c171) {
            g0Var.f273168g = 1;
        } else {
            g0Var.f273168g = 0;
        }
        g0Var.f273169h = c11291xe63498b8.f33210x795c1b2f;
        g0Var.f273167f = c11291xe63498b8.f33209xa1acac29;
        g0Var.f273166e = aVar.f270327e;
        g0Var.f273170i = 0;
        qVar.f(g0Var);
        return null;
    }

    public static int x(long j17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().J0(j17, str);
        if (J0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "ERR:" + fp.k.c() + " getinfo failed: " + str2);
            return -1;
        }
        long j18 = J0.f68112x10a0fed7;
        m(true);
        if (j18 != 101) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "ERR:" + fp.k.c() + " get status failed: " + str2 + " status:" + J0.f68112x10a0fed7);
            return -1;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J0.f68095x97924316) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J0.f68105x2c1f0acb)) {
            J0.f68112x10a0fed7 = 105L;
        } else {
            J0.f68112x10a0fed7 = 102L;
        }
        J0.f68103x4a777c2 = c01.id.e();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(J0, new java.lang.String[0]);
        pt.h0 h0Var = (pt.h0) i95.n0.c(pt.h0.class);
        java.lang.String str3 = J0.f68095x97924316;
        if (str3 == null) {
            str3 = "";
        }
        ((ot.i) h0Var).getClass();
        if (r26.i0.y(str3, "newSendFile", false)) {
            pt.g0 g0Var = (pt.g0) i95.n0.c(pt.g0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(j17, str);
            ((ot.g) g0Var).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.AppMsgFeatureService", "cancelTask " + c16564xb55e1d5);
            pu.f0 a17 = pu.f0.f439833m.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.FileAsyncSendFSC", "cancelTask " + c16564xb55e1d5);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            d75.c cVar = (d75.c) ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) pu.f0.f439834n).mo141623x754a37bb()).get(c16564xb55e1d5.m66995x9616526c());
            qi3.b0 b0Var = cVar != null ? (qi3.b0) cVar.get() : null;
            h0Var2.f391656d = b0Var;
            if (b0Var != null) {
                b0Var.x();
            }
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) a17.f439837h).mo141623x754a37bb(), null, new pu.u(c16564xb55e1d5, h0Var2, null), 1, null);
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) pu.k.f439853i.a().f439857h).mo141623x754a37bb(), null, new pu.c(c16564xb55e1d5, null), 1, null);
        }
        return 0;
    }

    public static int y(long j17, java.lang.String str, java.lang.String str2, dn.h hVar, boolean z17) {
        int a17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j17);
        if (Li.m124847x74d37ac6() != j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", fp.k.c() + " getmsgFailed id:" + j17);
            a17 = fp.k.a();
        } else {
            ot0.q v17 = ot0.q.v(Li.j());
            if (v17 != null) {
                if (ez.v0.f339310a.j(java.lang.Integer.valueOf(v17.f430199i)) && Li.mo78013xfb85f7b0() == 10000) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", "rebuildXMLAtUploadFin: stop send revoke msg(%s)", java.lang.Long.valueOf(Li.m124847x74d37ac6()));
                    return -1;
                }
                v17.f430227p = str2;
                if (z17 && hVar != null) {
                    v17.T = hVar.f69502xf11df5f5.equals("") ? v17.T : hVar.f69502xf11df5f5;
                    v17.L = hVar.f69522xf9dbbe9c.equals("") ? v17.L : hVar.f69522xf9dbbe9c;
                    v17.f430243t = hVar.f69526x419c9c3d.equals("") ? v17.f430243t : hVar.f69526x419c9c3d;
                    long j18 = hVar.f69523x17c343e7;
                    if (j18 == 0) {
                        j18 = v17.f430215m;
                    }
                    v17.f430215m = j18;
                    v17.M = hVar.f69560x7b284d5e.equals("") ? v17.M : hVar.f69560x7b284d5e;
                }
                Li.d1(ot0.q.u(v17, v17.f430227p, hVar));
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(Li.m124847x74d37ac6(), Li, true);
                ot0.t y07 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ri().y0(str, j17);
                if (y07 != null) {
                    y07.f67771x4b6e9352 = Li.j();
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ri().mo9952xce0038c9(y07, "msgId");
                }
                if (z17) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().J0(j17, str);
                    J0.f68105x2c1f0acb = str2;
                    J0.f68109x90a9378 = J0.f68113xeb1a61d6;
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(J0, new java.lang.String[0]);
                }
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgLogic", fp.k.c() + " getmsgFailed id:" + j17);
            a17 = fp.k.a();
        }
        return 0 - a17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r7, (r8 == null || (r8 = (v05.a) r8.m75936x14adae67(r8.f513848e + 8)) == null) ? null : r8.m75945x2fec8307(r8.f449897d + 1)) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair z(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r24) {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.z(com.tencent.mm.storage.f9):android.util.Pair");
    }
}

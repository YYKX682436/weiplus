package c01;

/* loaded from: classes12.dex */
public abstract class u7 {
    public static boolean a(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return false;
        }
        return (str.startsWith("+") || str2.startsWith("+")) ? str.endsWith(str2) || str2.endsWith(str) : str.equals(str2);
    }

    public static void b(r45.sr6 sr6Var, boolean z17) {
        int i17;
        java.lang.Object obj;
        r45.cu5 cu5Var;
        r45.xb xbVar;
        int i18 = sr6Var.f385951d;
        java.lang.Object[] objArr = new java.lang.Object[6];
        r45.xb xbVar2 = sr6Var.f385952e;
        objArr[0] = java.lang.Integer.valueOf(xbVar2 == null ? -1 : xbVar2.f389937w);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = sr6Var.f385952e;
        objArr[3] = sr6Var.f385953f;
        objArr[4] = sr6Var.f385954g;
        objArr[5] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile succ update:%d unifyFlag:%d, auth:%s, acct:%s, network:%s autoauth:%b", objArr);
        int i19 = i18 & 1;
        if (i19 == 0 || (xbVar = sr6Var.f385952e) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HandleAuthResponse", "summerauth updateProfile authsect not set and new uin is 0!");
            i17 = 0;
        } else {
            i17 = xbVar.f389921d;
        }
        c01.z1.N(sr6Var.f385952e.f389938x, false);
        int i27 = i18 & 2;
        if (i27 != 0) {
            r45.i1 i1Var = sr6Var.f385953f;
            gm0.j1.i();
            gm0.j1.b().f273241d = i1Var.f376638d;
        }
        gm0.j1.b().f273242e = !z17;
        gm0.j1.i().k(i17);
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        java.lang.Object obj2 = java.lang.Boolean.FALSE;
        c17.w(256, obj2);
        c01.z1.N(sr6Var.f385952e.f389938x, true);
        if (i19 != 0) {
            int i28 = sr6Var.f385952e.f389937w;
            if (i28 > 0) {
                c17.x(com.tencent.mm.storage.u3.USERINFO_UPDATE_UPDATE_FLAG_LONG, java.lang.Long.valueOf(i28));
                c17.x(com.tencent.mm.storage.u3.USERINFO_UPDATE_UPDATE_TIME_LONG, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
                c17.x(com.tencent.mm.storage.u3.USERINFO_UPDATE_UPDATE_VERION_LONG, java.lang.Long.valueOf(o45.wf.f343029g));
                com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile need update flag[%d], autoauth[%b]", java.lang.Integer.valueOf(sr6Var.f385952e.f389937w), java.lang.Boolean.valueOf(z17));
                if (z17) {
                    jx3.f.INSTANCE.idkeyStat(148L, sr6Var.f385952e.f389937w == 2 ? 19L : 41L, 1L, true);
                } else {
                    jx3.f.INSTANCE.idkeyStat(148L, sr6Var.f385952e.f389937w == 2 ? 10L : 11L, 1L, true);
                }
            } else {
                c17.x(com.tencent.mm.storage.u3.USERINFO_UPDATE_UPDATE_FLAG_LONG, java.lang.Long.valueOf(i28));
                c17.x(com.tencent.mm.storage.u3.USERINFO_UPDATE_UPDATE_TIME_LONG, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
                c17.x(com.tencent.mm.storage.u3.USERINFO_UPDATE_UPDATE_VERION_LONG, 0L);
            }
        }
        if (i27 != 0) {
            r45.i1 i1Var2 = sr6Var.f385953f;
            java.lang.String a17 = kk.v.a(i1Var2.f376640f);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i1Var2.f376644m);
            java.lang.String str = i1Var2.f376638d;
            java.lang.String str2 = i1Var2.f376639e;
            java.lang.String str3 = i1Var2.f376641g;
            java.lang.String str4 = i1Var2.f376642h;
            java.lang.String str5 = i1Var2.f376643i;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i1Var2.f376645n);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i1Var2.f376646o);
            java.lang.String str6 = i1Var2.f376647p;
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i1Var2.f376648q);
            java.lang.String str7 = i1Var2.f376649r;
            com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile acctsect BindUin:%s, Status:%d, UserName:%s, NickName:%s, BindEmail:%s, BindMobile:%s, Alias:%s, PluginFlag:%d, RegType:%d, DeviceInfoXml:%s, SafeDevice:%d, OfficialUserName:%s, OfficialUserName:%s PushMailStatus:%d, FSURL:%s", a17, valueOf, str, str2, str3, str4, str5, valueOf2, valueOf3, str6, valueOf4, str7, str7, java.lang.Integer.valueOf(i1Var2.f376651t), i1Var2.f376652u);
            if (!z17) {
                c17.w(52, java.lang.Integer.valueOf(i1Var2.f376646o));
            }
            c17.w(9, java.lang.Integer.valueOf(i1Var2.f376640f));
            c17.w(7, java.lang.Integer.valueOf(i1Var2.f376644m));
            c17.w(2, i1Var2.f376638d);
            c17.w(4, i1Var2.f376639e);
            c17.w(5, i1Var2.f376641g);
            c17.w(42, i1Var2.f376643i);
            c17.w(34, java.lang.Integer.valueOf(i1Var2.f376645n));
            gm0.j1.u().j().y0(i1Var2.f376647p);
            c17.w(64, java.lang.Integer.valueOf(i1Var2.f376648q));
            c17.w(21, i1Var2.f376649r);
            c17.w(22, i1Var2.f376649r);
            c17.w(17, java.lang.Integer.valueOf(i1Var2.f376651t));
            java.lang.String str8 = i1Var2.f376642h;
            com.tencent.mm.storage.z3 g17 = c01.z1.g();
            c01.uc ucVar = c01.uc.f37514c;
            java.lang.String c18 = ucVar.c(g17.d1(), "login_user_name");
            java.lang.String u17 = gm0.j1.u().c().u(6, "");
            com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "checkSwitchInfoWhenMobileChange: wxid=%s, switchLastUsername=%s oldMobile=%s newMobile=%s", g17.d1(), c18, u17, str8);
            if (a(u17, c18)) {
                ucVar.h(g17.d1(), "login_user_name", com.tencent.mm.sdk.platformtools.t8.u1(str8, com.tencent.mm.sdk.platformtools.t8.u1(g17.t0(), g17.d1())));
            }
            c01.b9 b9Var = c01.b9.f37069c;
            java.lang.String a18 = b9Var.a("login_user_name", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "checkSwitchInfoWhenMobileChange: wxid=%s, loginUsername=%s oldMobile=%s newMobile=%s", g17.d1(), a18, u17, str8);
            if (a(u17, a18)) {
                b9Var.d("login_user_name", com.tencent.mm.sdk.platformtools.t8.u1(str8, com.tencent.mm.sdk.platformtools.t8.u1(g17.t0(), g17.d1())));
            }
            c17.w(6, i1Var2.f376642h);
            java.lang.String selfUsername = i1Var2.f376638d;
            kotlin.jvm.internal.o.g(selfUsername, "selfUsername");
            bn0.g.f22779a.h("USERINFO_USERNAME", selfUsername);
            b9Var.d("login_weixin_username", i1Var2.f376638d);
            b9Var.d("last_login_nick_name", i1Var2.f376639e);
            b9Var.d("last_login_alias", i1Var2.f376643i);
            b9Var.c(i1Var2.f376642h, i1Var2.f376640f, i1Var2.f376641g);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.HandleAuthResponse", "summerauth updateProfile acctsect not set!");
        }
        r45.i1 i1Var3 = sr6Var.f385953f;
        if (i1Var3 != null) {
            c01.je.p(i1Var3.f376654w);
            c01.je.n(sr6Var.f385953f.f376655x);
            c01.je.j(sr6Var.f385953f.f376656y);
        }
        if (!z17 && gm0.j1.a()) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MANUAL_AUTH_AS_QQ_ACCOUNT_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        }
        if (i19 != 0) {
            r45.xb xbVar3 = sr6Var.f385952e;
            java.lang.String str9 = xbVar3.f389931q;
            java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.l(x51.j1.d(xbVar3.f389932r));
            com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile AuthTicket:%s, NewVersion:%d, UpdateFlag:%d, AuthResultFlag:%d, authKey:%s a2Key:%s fsurl:%s", xbVar3.f389935u, java.lang.Integer.valueOf(xbVar3.f389936v), java.lang.Integer.valueOf(xbVar3.f389937w), java.lang.Integer.valueOf(xbVar3.f389938x), com.tencent.mm.sdk.platformtools.t8.G1(str9), com.tencent.mm.sdk.platformtools.t8.G1(l17), xbVar3.f389939y);
            int i29 = xbVar3.f389925h;
            kk.v vVar = new kk.v(com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) c17.l(9, 0)));
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            objArr2[0] = java.lang.Integer.valueOf(i29);
            objArr2[1] = vVar;
            r45.cu5 cu5Var2 = xbVar3.f389926i;
            objArr2[2] = java.lang.Integer.valueOf(cu5Var2 == null ? -1 : cu5Var2.f371839d);
            com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile wtBuffFlag:%d, bindQQ:%s buff len:%d", objArr2);
            if (i29 == 0) {
                obj = "";
            } else if (i29 == 1) {
                jx3.f.INSTANCE.idkeyStat(148L, 20L, 1L, false);
                byte[] d17 = x51.j1.d(xbVar3.f389926i);
                obj = "";
                gm0.j1.b().l().f(vVar.longValue(), d17);
                com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "WTLoginRspBuff len %s", java.lang.Integer.valueOf(d17.length));
                java.lang.Object l18 = com.tencent.mm.sdk.platformtools.t8.l(gm0.j1.b().l().b(vVar.longValue()));
                c17.w(-1535680990, str9);
                c17.w(46, l17);
                c17.w(72, l18);
                c17.w(29, xbVar3.f389939y);
            } else {
                obj = "";
                if (i29 == 2) {
                    jx3.f.INSTANCE.idkeyStat(148L, 21L, 1L, false);
                    gm0.j1.b().l().a(vVar.longValue());
                    java.lang.Object l19 = com.tencent.mm.sdk.platformtools.t8.l(gm0.j1.b().l().b(vVar.longValue()));
                    c17.w(-1535680990, str9);
                    c17.w(46, l17);
                    c17.w(72, l19);
                    c17.w(29, xbVar3.f389939y);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "summerauth undefined wrBuffFlag[%d]", java.lang.Integer.valueOf(i29));
                }
            }
            if (!z17 && ((cu5Var = xbVar3.f389926i) == null || cu5Var.f371839d == 0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "maybe no qq login");
                if (gm0.j1.a()) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MANUAL_AUTH_AS_QQ_ACCOUNT_BOOLEAN_SYNC, obj2);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "wtBuffFlag %s", java.lang.Integer.valueOf(i29));
            r45.a67 a67Var = xbVar3.f389927m;
            if (a67Var != null) {
                java.lang.String l27 = com.tencent.mm.sdk.platformtools.t8.l(x51.j1.d(a67Var.f369797e));
                if (l27 != null && l27.length() > 0) {
                    c17.w(47, l27);
                    gm0.j1.u().f273148a.f(18, l27);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "updateProfile ksid:%s", com.tencent.mm.sdk.platformtools.t8.G1(l27));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "summerauth get ecdh flag %d, set local cache %d ", java.lang.Integer.valueOf(xbVar3.D), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("auth_info_key_prefs", 4).edit().putBoolean("auth_info_prefs_use_new_ecdh", xbVar3.D == 1).commit() ? 1 : 0));
        } else {
            obj = "";
            com.tencent.mars.xlog.Log.w("MicroMsg.HandleAuthResponse", "summerauth updateProfile authsect not set!");
            jx3.f.INSTANCE.idkeyStat(148L, 22L, 1L, false);
        }
        java.lang.Object obj3 = obj;
        c17.w(3, obj3);
        c17.w(19, obj3);
        c17.i(true);
        gm0.j1.u().f273148a.g(46, 0);
        int i37 = sr6Var.f385952e.f389938x;
        if (!z17 || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.global.RepairerConfigAutoAuthGetProfile()) == 1) {
            if ((i37 & 8) != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "summerauth not need getProfile authResultFlag:%d", java.lang.Integer.valueOf(i37));
                jx3.f.INSTANCE.idkeyStat(148L, 9L, 1L, false);
            } else {
                java.lang.String r17 = c01.z1.r();
                if (android.text.TextUtils.isEmpty(r17)) {
                    return;
                }
                gm0.j1.n().f273288b.g(new com.tencent.mm.modelsimple.p0(r17));
            }
        }
    }

    public static void c(r45.sr6 sr6Var) {
        long j17;
        r45.vt4 vt4Var;
        r45.xb xbVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.HandleAuthResponse", "onUpdateILinkStreamSession from auth");
        int i17 = sr6Var.f385951d;
        byte[] bArr = new byte[0];
        byte[] bArr2 = new byte[0];
        if ((i17 & 1) == 0 || (xbVar = sr6Var.f385952e) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HandleAuthResponse", "auth updateIlinkStream authsect not set and new uin is 0!");
            j17 = 0;
        } else {
            j17 = xbVar.f389921d & io.flutter.embedding.android.KeyboardMap.kValueMask;
            r45.cu5 cu5Var = xbVar.F;
            if (cu5Var == null || cu5Var.f371839d <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.HandleAuthResponse", "auth updateIlinkStream JwtData not set!");
            } else {
                bArr = cu5Var.f371841f.f192156a;
            }
        }
        if ((i17 & 4) == 0 || (vt4Var = sr6Var.f385954g) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HandleAuthResponse", "auth updateIlinkStream networksect not set!");
        } else {
            r45.cu5 cu5Var2 = vt4Var.f388522i;
            if (cu5Var2 == null || cu5Var2.f371839d <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.HandleAuthResponse", "auth updateIlinkStream iLinkNetWorkBuffer not set!");
            } else {
                bArr2 = cu5Var2.f371841f.f192156a;
            }
        }
        d(bArr, bArr2, j17);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(byte[] r9, byte[] r10, long r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.u7.d(byte[], byte[], long):void");
    }
}

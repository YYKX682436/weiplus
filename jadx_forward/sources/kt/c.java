package kt;

@j95.b
/* loaded from: classes8.dex */
public class c extends i95.w implements lt.i0 {
    public boolean Ai(java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17;
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f67370x28d45f97) || (h17.f67371xa2e856b6 & 32) <= 0) ? false : true;
    }

    public boolean Bi(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504) {
        if (c11286x34a5504 == null) {
            return false;
        }
        zo3.p.wi();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(zo3.p.Ai());
        sb6.append("content_");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject iMediaObject = c11286x34a5504.f33122xe4128443;
        if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9 c11283x90d63ed9 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9) iMediaObject;
            java.lang.String str = c11283x90d63ed9.f33105xcba65c20;
            if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.e(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str);
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str);
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.f(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", sb7, java.lang.Integer.valueOf(c11286x34a5504.m48467xfb85f7b0()), java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.d(str, sb7, false)));
                c11283x90d63ed9.f33105xcba65c20 = sb7;
            }
        } else if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c c11280xa65cf99c = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c) iMediaObject;
            java.lang.String str2 = c11280xa65cf99c.f33093xd426afc1;
            if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.e(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str2);
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str2);
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.f(str2)) {
                java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(str2);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17)) {
                    sb7 = sb7 + "." + n17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", sb7, java.lang.Integer.valueOf(c11286x34a5504.m48467xfb85f7b0()), java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.d(str2, sb7, false)));
                c11280xa65cf99c.f33093xd426afc1 = sb7;
            }
        } else if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11276x643df984) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11276x643df984 c11276x643df984 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11276x643df984) iMediaObject;
            java.lang.String str3 = c11276x643df984.f33077x6482c58b;
            if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.e(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str3);
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str3);
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.f(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", sb7, java.lang.Integer.valueOf(c11286x34a5504.m48467xfb85f7b0()), java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.d(str3, sb7, false)));
                c11276x643df984.f33077x6482c58b = sb7;
            }
        } else if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11297x655ab995) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11297x655ab995 c11297x655ab995 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11297x655ab995) iMediaObject;
            java.lang.String str4 = c11297x655ab995.f33233xd426afc1;
            if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.e(str4)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str4);
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str4);
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.f(str4)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", sb7, java.lang.Integer.valueOf(c11286x34a5504.m48467xfb85f7b0()), java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.d(str4, sb7, false)));
                c11297x655ab995.f33233xd426afc1 = sb7;
            }
        } else if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11282x3580fbc3) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11282x3580fbc3 c11282x3580fbc3 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11282x3580fbc3) iMediaObject;
            java.lang.String str5 = c11282x3580fbc3.f33097xd426afc1;
            if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.e(str5)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str5);
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str5);
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.f(str5)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", sb7, java.lang.Integer.valueOf(c11286x34a5504.m48467xfb85f7b0()), java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.d(str5, sb7, false)));
                c11282x3580fbc3.f33097xd426afc1 = sb7;
            }
        } else if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699 c11272xd6622699 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699) iMediaObject;
            java.lang.String str6 = c11272xd6622699.f33063xd426afc1;
            if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.e(str6)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str6);
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str6);
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.f(str6)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", sb7, java.lang.Integer.valueOf(c11286x34a5504.m48467xfb85f7b0()), java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.d(str6, sb7, false)));
                c11272xd6622699.f33063xd426afc1 = sb7;
            }
        } else {
            if (!(iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936)) {
                return false;
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936 c11289x4ff06936 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936) iMediaObject;
            java.lang.String str7 = c11289x4ff06936.f33195x4b66fa4;
            if (str7 != null) {
                if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.e(str7)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoLogic", "copyFileIfNeed file invalid: %s", str7);
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filePath: %s", str7);
                if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.f(str7)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "copyFileIfNeed filename: %s, type: %d, ret: %d", sb7, java.lang.Integer.valueOf(c11286x34a5504.m48467xfb85f7b0()), java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.d(str7, sb7, false)));
                    c11289x4ff06936.f33195x4b66fa4 = sb7;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap Di(java.lang.String r18, int r19, float r20) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kt.c.Di(java.lang.String, int, float):android.graphics.Bitmap");
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m Ni(java.lang.String str) {
        return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
    }

    public void Ri(java.lang.String str, java.lang.String str2, lt.h0 h0Var) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && h0Var != null) {
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n(h0Var, str, str2), "GetAppInfoASyncThread");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoLogic", "getAppInfoASync, appId is null");
            if (h0Var != null) {
                h0Var.a(null);
            }
        }
    }

    public java.lang.String Ui(android.content.Context context, dm.m0 m0Var) {
        return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.n(context, (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) m0Var, null);
    }

    public java.lang.String Vi(android.content.Context context, dm.m0 m0Var, java.lang.String str) {
        return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.n(context, (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) m0Var, str);
    }

    public java.lang.String Zi(android.content.Context context, java.lang.String str) {
        return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.n(context, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str), null);
    }

    public boolean aj(android.content.Context context, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z Ri = zo3.p.Ri();
        Ri.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        sb6.append("select * from AppInfo where  ( appSupportContentType & ");
        sb6.append(j17);
        sb6.append(" ) != 0 and  ( svrAppSupportContentType & ");
        sb6.append(j17);
        sb6.append(" ) != 0 and  ( appInfoFlag & 8192 ) != 0 and status != 4");
        android.database.Cursor m145256x1d3f4980 = Ri.m145256x1d3f4980(sb6.toString(), new java.lang.String[0]);
        if (m145256x1d3f4980 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoStorage", "getAppByStatus : cursor is null");
            m145256x1d3f4980 = null;
        }
        if (m145256x1d3f4980 != null) {
            while (m145256x1d3f4980.moveToNext()) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
                mVar.mo9015xbf5d97fd(m145256x1d3f4980);
                if (mVar.f67391x10a0fed7 == 1) {
                    if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.r(context, mVar.f67370x28d45f97)) {
                        mVar.f67391x10a0fed7 = 4;
                        ((kt.a) ap3.e.a()).getClass();
                        zo3.p.Ri().mo9952xce0038c9(mVar, new java.lang.String[0]);
                    } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67390xda9bc3b3)) {
                        arrayList.add(mVar);
                    }
                } else if (mVar.f67390xda9bc3b3 != null) {
                    arrayList.add(mVar);
                }
            }
            m145256x1d3f4980.close();
        }
        return arrayList.size() != 0;
    }

    public boolean bj(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("wx485a97c844086dc9", str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("wxaf060266bfa9a35c", str)) {
            return true;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
        return (h17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f67386xa1e9e82c) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f67390xda9bc3b3)) ? false : true;
    }

    public boolean cj(android.content.Context context, android.content.Intent intent, java.lang.String str, int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var, android.os.Bundle bundle) {
        return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.u(context, intent, str, i17, a5Var, bundle, null, null);
    }

    public boolean fj(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var, android.os.Bundle bundle) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoLogic", "launch app failed: context is null");
            if (a5Var == null) {
                return false;
            }
            a5Var.a(false, false);
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoLogic", "launch app failed: appid is null or nil");
            if (a5Var == null) {
                return false;
            }
            a5Var.a(false, false);
            return false;
        }
        if (c11286x34a5504 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoLogic", "launch app failed: wxMsg is null");
            if (a5Var == null) {
                return false;
            }
            a5Var.a(false, false);
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m i18 = android.os.Looper.myLooper() == android.os.Looper.getMainLooper() ? com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.i(str, Integer.MAX_VALUE) : com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.k(str, false);
        if (i18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoLogic", "get appinfo is null, appid is : [%s]", str);
            if (a5Var == null) {
                return false;
            }
            a5Var.a(false, false);
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(2088, 0));
        try {
            if (i18.f67391x10a0fed7 == 3) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w0(context)) {
                    arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(2088, 4));
                } else {
                    arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(2088, 1));
                    boolean a17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i1.a(context, i18, i18.f67386xa1e9e82c);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppInfoLogic", "requestAppShow, app is in blacklist, retry check signature, packageName:%s, isAppValid:%b", i18.f67386xa1e9e82c, java.lang.Boolean.valueOf(a17));
                    if (a17) {
                        arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(2088, 2));
                        i18 = ((kt.a) ap3.e.a()).wi(str);
                    } else {
                        arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(2088, 3));
                    }
                }
            }
            if (i18.f67391x10a0fed7 != 3) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(2088, 5));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w0(context)) {
                    arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(2088, 6));
                }
                return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.w(context, i18.f67386xa1e9e82c, c11286x34a5504, str, i18.f67384x996f3ea, i17, a5Var, bundle);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoLogic", "requestAppShow fail, app is in blacklist, packageName = " + i18.f67386xa1e9e82c);
            if (a5Var != null) {
                a5Var.a(false, false);
            }
            return false;
        } finally {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, false, false);
        }
    }

    public boolean hj(android.content.Context context, android.content.Intent intent, java.lang.String str, int i17, java.lang.String str2, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e5 e5Var) {
        return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.u(context, intent, str, i17, a5Var, null, str2, e5Var);
    }

    public boolean ij(java.lang.String str) {
        return (str == null || str.trim().length() == 0 || str.equals("weixinfile") || str.equals("invalid_appname")) ? false : true;
    }

    public boolean mj(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        return (mVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67370x28d45f97) || (mVar.f67371xa2e856b6 & 1) <= 0) ? false : true;
    }

    public boolean nj(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        return mVar == null || (mVar.f67371xa2e856b6 & 2) == 0;
    }

    public boolean wi(java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f67370x28d45f97)) {
            return false;
        }
        return h17.f67370x28d45f97.equals("wx7fa037cc7dfabad5") || (h17.f67371xa2e856b6 & 8) > 0;
    }
}

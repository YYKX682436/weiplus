package com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29;

/* loaded from: classes13.dex */
public class e {
    public static java.util.List b(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null && !list.isEmpty()) {
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(274436, null);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k) it.next();
                if (c(kVar) && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f67138x225e3613) || kVar.f67138x225e3613.toLowerCase().contains(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().toLowerCase()))) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f67145x68c45cc7) || (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && kVar.f67145x68c45cc7.toLowerCase().contains(str.toLowerCase()))) {
                        arrayList.add(kVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.k kVar) {
        if (kVar == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.j a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.f.a(kVar.f67148x29dcef91);
        int i17 = kVar.f67143x2260084a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.f.f233907c == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.f.f233907c = new com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.f.f233907c.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.q qVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.q) ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.f.f233906b).get(java.lang.Integer.valueOf(i17));
        if (qVar == null) {
            qVar = (i17 == 46 || i17 == 59) ? new tn3.d() : null;
            if (qVar != null) {
                ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.f.f233906b).put(java.lang.Integer.valueOf(i17), qVar);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTips.NewTipsFilterPool", "Invalid pathId:%s", java.lang.Integer.valueOf(i17));
            }
        }
        if (a17 == null && qVar == null) {
            return true;
        }
        return (a17 == null || qVar == null) ? a17 != null ? a17.b(kVar) : qVar.a(kVar) : a17.b(kVar) && qVar.a(kVar);
    }

    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d dVar) {
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTipsManager", "can not show new  tips！！ tipsInfo is null !!");
            return false;
        }
        if (dVar.f67238xff75c44d && !dVar.f67237x9d48d07c && f(dVar)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTipsManager", "can not show tips, isExit:%s, hadRead:%s, timeEffective:%s", java.lang.Boolean.valueOf(dVar.f67238xff75c44d), java.lang.Boolean.valueOf(dVar.f67237x9d48d07c), java.lang.Boolean.valueOf(f(dVar)));
        return false;
    }

    public boolean d(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d dVar) {
        r45.rm6 rm6Var;
        r45.rm6 rm6Var2;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTipsManager", "check path, tipsInfo is null!!!");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d y07 = rn3.i.wi().y0(dVar.f67242x29dcef91);
        if (y07 != null && (rm6Var = y07.f67246x4fa9bc8) != null && (rm6Var2 = dVar.f67246x4fa9bc8) != null) {
            java.lang.String str = rm6Var.f466553g;
            java.lang.String str2 = rm6Var2.f466553g;
            if (str == null && str2 == null) {
                return true;
            }
            if (str != null && str.equals(str2)) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTipsManager", "path illegal, localPath:%s, newPath:%s", str, str2);
        }
        return false;
    }

    public boolean e(int i17) {
        java.lang.String str;
        long j17;
        int i18;
        r45.rm6 rm6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d y07 = rn3.i.wi().y0(i17);
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTipsManager", "showDot, newTipsInfo is null !!");
            return false;
        }
        if (a(rn3.i.wi().y0(i17)) && (rm6Var = y07.f67246x4fa9bc8) != null && rm6Var.f466550d == 0) {
            java.lang.String format = java.lang.String.format("newtips_show_%d-%d", java.lang.Integer.valueOf(y07.f67242x29dcef91), java.lang.Integer.valueOf(y07.f67244x25315422));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_newtips_report", 0).getBoolean(format, false)) {
                return true;
            }
            int i19 = y07.f67242x29dcef91;
            int i27 = y07.f67244x25315422;
            int i28 = y07.f67243x2664ac30;
            long j18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_newtips_report", 0).getLong("newtips_gettipstime", 0L);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_newtips_report", 0).edit().putLong("newtips_realshow_time", currentTimeMillis).commit();
            r45.rm6 rm6Var2 = y07.f67246x4fa9bc8;
            int i29 = rm6Var2 != null ? rm6Var2.f466550d : 0;
            java.lang.String str2 = rm6Var2 != null ? rm6Var2.f466551e : "";
            java.lang.String str3 = rm6Var2 != null ? rm6Var2.f466552f : "";
            java.lang.String str4 = rm6Var2 != null ? rm6Var2.f466553g : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTipsManager", "newtipsreport:%d", 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14995, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(j18), "", "", "", java.lang.Long.valueOf(currentTimeMillis), "", "", "", java.lang.Integer.valueOf(i29), str2, str3, str4, "", 1, "");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_newtips_report", 0).edit().putBoolean(format, true).commit();
            return true;
        }
        java.lang.String format2 = java.lang.String.format("newtips_dismiss_%d-%d", java.lang.Integer.valueOf(y07.f67242x29dcef91), java.lang.Integer.valueOf(y07.f67244x25315422));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_newtips_report", 0).getBoolean(format2, false)) {
            return false;
        }
        int i37 = y07.f67242x29dcef91;
        int i38 = y07.f67244x25315422;
        int i39 = y07.f67243x2664ac30;
        long j19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_newtips_report", 0).getLong("newtips_gettipstime", 0L);
        long j27 = y07.f67234x8fbc34ae;
        long j28 = y07.f67240xcd55f7c8;
        long j29 = y07.f67235x1a23a28b;
        long j37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_newtips_report", 0).getLong("newtips_realshow_time", 0L);
        long j38 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_newtips_report", 0).getLong("newtips_makeread_time", 0L);
        long j39 = j38 - j37;
        long i110 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        if (!d(y07) || !g(y07)) {
            str = "_newtips_report";
            j17 = j28;
            i18 = 1;
        } else if (y07.f67237x9d48d07c) {
            i18 = 4;
            str = "_newtips_report";
            j17 = j28;
        } else {
            long j47 = y07.f67235x1a23a28b;
            if (j47 == 0 || i110 <= j47) {
                j17 = j28;
                long j48 = y07.f67240xcd55f7c8;
                if (j48 != 0) {
                    str = "_newtips_report";
                    long j49 = y07.f67234x8fbc34ae + j48;
                    if (j49 <= j47 && i110 > j49) {
                        i18 = 2;
                    }
                } else {
                    str = "_newtips_report";
                }
                i18 = 0;
            } else {
                i18 = 3;
                j17 = j28;
                str = "_newtips_report";
            }
        }
        r45.rm6 rm6Var3 = y07.f67246x4fa9bc8;
        int i47 = rm6Var3 != null ? rm6Var3.f466550d : 0;
        java.lang.String str5 = rm6Var3 != null ? rm6Var3.f466551e : "";
        java.lang.String str6 = rm6Var3 != null ? rm6Var3.f466552f : "";
        java.lang.String str7 = rm6Var3 != null ? rm6Var3.f466553g : "";
        long j57 = y07.f67241xebf7975a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTipsManager", "newtipsreport:%d", 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14995, java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i39), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(j37), java.lang.Long.valueOf(j38), java.lang.Long.valueOf(j39), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i47), str5, str6, str7, "", 2, java.lang.Long.valueOf(j57));
        if (i39 == 1) {
            vn3.a wi6 = rn3.i.wi();
            wi6.getClass();
            java.lang.String str8 = "delete from NewTipsInfo where tipId = " + y07.f67242x29dcef91;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTipsCompatInfoStorage", "delete sql: " + str8);
            wi6.f519959d.A("NewTipsInfo", str8);
            wi6.mo142179xf35bbb4(y07.f67242x29dcef91 + "", 5, java.lang.Integer.valueOf(y07.f67242x29dcef91));
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + str, 0).edit().putBoolean(format2, true).commit();
        return false;
    }

    public boolean f(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d dVar) {
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTipsManager", "check time, tipsInfo is null!!!");
            return false;
        }
        long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        long j17 = dVar.f67240xcd55f7c8;
        if (j17 != 0 || dVar.f67235x1a23a28b != 0) {
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Math.min(dVar.f67234x8fbc34ae + j17, dVar.f67235x1a23a28b));
            r9 = i17 >= dVar.f67234x8fbc34ae && i17 <= valueOf.longValue();
            if (i17 > valueOf.longValue()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_newtips_report", 0).edit().putLong("newtips_makeread_time", java.lang.System.currentTimeMillis()).commit();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTipsManager", "timeEffective current: %s, overdueTime: %s, disappearTime: %s, show:%s", java.lang.Long.valueOf(i17), java.lang.Long.valueOf(dVar.f67240xcd55f7c8), java.lang.Long.valueOf(dVar.f67235x1a23a28b), java.lang.Boolean.valueOf(r9));
        return r9;
    }

    public boolean g(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d dVar) {
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTipsManager", "check version, tipsInfo is null!!!");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.d y07 = rn3.i.wi().y0(dVar.f67242x29dcef91);
        if (y07 != null) {
            int i17 = dVar.f67244x25315422;
            int i18 = y07.f67244x25315422;
            if (i17 > i18) {
                return true;
            }
            if (!dVar.f67237x9d48d07c && i17 == i18) {
                return true;
            }
        }
        return false;
    }
}

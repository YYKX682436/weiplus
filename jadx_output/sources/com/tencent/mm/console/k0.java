package com.tencent.mm.console;

/* loaded from: classes12.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashSet f64818a;

    static {
        int i17 = lp.j.f320231a;
        int i18 = lp.q.f320239a;
        int i19 = lp.s.f320243a;
        int i27 = lp.m.f320234a;
        int i28 = lp.n.f320235a;
        int i29 = lp.h.f320229a;
        int i37 = lp.i.f320230a;
        int i38 = lp.t.f320244a;
        int i39 = lp.w.f320246a;
        int i47 = lp.v.f320245a;
        int i48 = lp.l.f320233a;
        int i49 = lp.r.f320240a;
        q25.b.b(new lp.c(), "//clearrecent");
        int i57 = lp.f.f320227a;
        int i58 = lp.b.f320222a;
        int i59 = lp.e.f320226a;
        int i66 = lp.o.f320236a;
        ((com.tencent.mm.feature.performance.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
        int i67 = lp.k.f320232a;
        q25.b.b(lp.g.f320228a, "//clearEcsGiftReddot");
        q25.b.b(new lp.a(), "//showyuanbao");
        int i68 = lp.d.f320225a;
        java.util.HashSet hashSet = new java.util.HashSet();
        f64818a = hashSet;
        hashSet.add("//uplog");
        hashSet.add("//pullxlog");
        hashSet.add("//clearxlog");
        hashSet.add("//upcrash");
        hashSet.add("//getfpkey");
        hashSet.add("//voipdebug");
        hashSet.add("//setkey");
        hashSet.add("//wxcamera");
        hashSet.add("//setNfcOpenUrl");
        hashSet.add("//resetwxspace");
        hashSet.add("//showyuanbao");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.console.k0.a(android.content.Context, java.lang.String):boolean");
    }

    public static java.lang.String b(java.lang.String str) {
        int indexOf = str.indexOf(" ");
        return indexOf < 0 ? "" : str.substring(indexOf).trim();
    }

    public static boolean c(java.lang.String str) {
        java.util.Iterator it = f64818a.iterator();
        while (it.hasNext()) {
            if (str.startsWith((java.lang.String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static java.lang.StringBuilder d(int i17) {
        java.io.BufferedReader bufferedReader;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.util.Date date = new java.util.Date(java.lang.System.currentTimeMillis() - (i17 * 86400000));
        java.lang.String str = lp0.b.a() + "crash_" + new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(date) + ".txt";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (com.tencent.mm.vfs.w6.j(str)) {
            return new java.lang.StringBuilder(" day -" + i17 + " no crash.");
        }
        java.io.BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    bufferedReader = new java.io.BufferedReader(new com.tencent.mm.vfs.z6(str));
                } catch (java.lang.Exception e17) {
                    e = e17;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.lang.Exception unused) {
        }
        try {
        } catch (java.lang.Exception e18) {
            e = e18;
            bufferedReader2 = bufferedReader;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CommandProcessor", e, "", new java.lang.Object[0]);
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            return sb6;
        } catch (java.lang.Throwable th7) {
            th = th7;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(bufferedReader.readLine())) {
            bufferedReader.close();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("read day -" + i17 + "file failed");
            try {
                bufferedReader.close();
            } catch (java.lang.Exception unused3) {
            }
            return sb7;
        }
        while (true) {
            java.lang.String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            sb6.append(new java.lang.String(android.util.Base64.decode(readLine.split("error_")[1], 0)).split("#accinfo.uin=")[1]);
            sb6.append("\n_____________________________________\n");
        }
        bufferedReader.close();
        return sb6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1466:0x2c2d  */
    /* JADX WARN: Removed duplicated region for block: B:1475:0x2c5f  */
    /* JADX WARN: Removed duplicated region for block: B:1678:0x32ef  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0ebc  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0ebe  */
    /* JADX WARN: Type inference failed for: r1v205 */
    /* JADX WARN: Type inference failed for: r1v809 */
    /* JADX WARN: Type inference failed for: r1v810 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v511 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(android.content.Context r32, java.lang.String r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 15352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.console.k0.e(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public static void f(int i17) {
        android.content.SharedPreferences c17 = com.tencent.mm.sdk.platformtools.l4.c(com.tencent.mm.sdk.platformtools.x2.f193071a, "sp_sns_dynswitch_stg", 4, false);
        if (i17 == -1) {
            c17.edit().remove("st_sw_use_vcodec_img").commit();
            return;
        }
        if (i17 == 0) {
            c17.edit().putBoolean("st_sw_use_vcodec_img", false).commit();
        } else if (i17 == 1) {
            c17.edit().putBoolean("st_sw_use_vcodec_img", true).commit();
        } else {
            throw new java.lang.IllegalArgumentException("Bad op parameter: " + i17);
        }
    }

    public static void g(int i17) {
        android.content.SharedPreferences c17 = com.tencent.mm.sdk.platformtools.l4.c(com.tencent.mm.sdk.platformtools.x2.f193071a, "sp_sns_dynswitch_stg", 4, false);
        if (i17 == -1) {
            c17.edit().remove("st_sw_use_wxpc_img").commit();
            return;
        }
        if (i17 == 0) {
            c17.edit().putBoolean("st_sw_use_wxpc_img", false).commit();
        } else if (i17 == 1) {
            c17.edit().putBoolean("st_sw_use_wxpc_img", true).commit();
        } else {
            throw new java.lang.IllegalArgumentException("Bad op parameter: " + i17);
        }
    }

    public static int h(java.lang.String str) {
        if (str.startsWith("//") && str.length() > 2) {
            int indexOf = str.indexOf(" ");
            if (indexOf == -1) {
                indexOf = str.length();
            }
            try {
                int P = com.tencent.mm.sdk.platformtools.t8.P(str.substring(2, indexOf), 0);
                int i17 = o45.wf.f343029g % 256;
                if (i17 != 0 && P >= i17 && P % i17 == 0) {
                    return P / i17;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return 0;
    }
}

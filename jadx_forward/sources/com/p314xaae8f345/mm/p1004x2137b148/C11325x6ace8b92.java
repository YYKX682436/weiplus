package com.p314xaae8f345.mm.p1004x2137b148;

/* renamed from: com.tencent.mm.platformtools.ExportFileUtil */
/* loaded from: classes12.dex */
public final class C11325x6ace8b92 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.Executor f153934a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    static {
        /*
            java.lang.String r0 = "MicroMsg.ExportFileUtil"
            r1 = 1
            r2 = 0
            java.lang.Class<e42.e0> r3 = e42.e0.class
            i95.m r3 = i95.n0.c(r3)     // Catch: java.lang.Throwable -> L17
            e42.e0 r3 = (e42.e0) r3     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L1f
            e42.d0 r4 = e42.d0.clicfg_media_exporting_async     // Catch: java.lang.Throwable -> L17
            h62.d r3 = (h62.d) r3     // Catch: java.lang.Throwable -> L17
            int r3 = r3.Ni(r4, r1)     // Catch: java.lang.Throwable -> L17
            goto L20
        L17:
            r3 = move-exception
            java.lang.String r4 = ""
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r3, r4, r5)
        L1f:
            r3 = r2
        L20:
            java.lang.String r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            if (r3 == 0) goto L25
            goto L26
        L25:
            r1 = r2
        L26:
            if (r1 == 0) goto L2f
            x51.w r2 = new x51.w
            r2.<init>()
            com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.f153934a = r2
        L2f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "res update cliCfg = "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r3 = ", exportingAsync = "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.m48613x8c160ea9():void");
    }

    public static void a(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            runnable.run();
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(runnable);
        }
    }

    public static java.lang.String b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExportFileUtil", "[+] Called exportImage, src: %s", str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        arrayList.add(context);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        return (java.lang.String) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/platformtools/ExportFileUtil", "exportImage", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "com/tencent/mm/platformtools/ExportFileUtil", "exportImageImpl", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:27|(2:186|187)|(3:29|30|31)|(4:(2:33|(20:35|36|37|38|39|40|41|(1:43)(1:177)|44|45|(2:171|172)(10:47|48|49|50|51|(3:53|54|(7:56|57|58|59|60|(1:62)(1:165)|63))|169|60|(0)(0)|63)|64|65|66|67|68|69|70|71|72))|70|71|72)|183|40|41|(0)(0)|44|45|(0)(0)|64|65|66|67|68|69) */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0246, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0247, code lost:
    
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x022a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x022c, code lost:
    
        r8 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExportFileUtil", r0, "rotate img failed.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x024f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x024b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03df A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0213 A[Catch: Exception -> 0x0249, all -> 0x0261, TryCatch #2 {all -> 0x0261, blocks: (B:25:0x0139, B:27:0x0143, B:30:0x0157, B:33:0x015f, B:35:0x0169, B:38:0x016f, B:41:0x018b, B:45:0x019a, B:172:0x01a0, B:66:0x0224, B:68:0x0235, B:163:0x022c, B:47:0x01ca, B:48:0x01cf, B:49:0x01d5, B:50:0x01d8, B:54:0x01e1, B:56:0x01eb, B:59:0x01f3, B:60:0x020a, B:63:0x0219, B:165:0x0213, B:177:0x0194), top: B:24:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0194 A[Catch: Exception -> 0x024b, all -> 0x0261, TRY_LEAVE, TryCatch #2 {all -> 0x0261, blocks: (B:25:0x0139, B:27:0x0143, B:30:0x0157, B:33:0x015f, B:35:0x0169, B:38:0x016f, B:41:0x018b, B:45:0x019a, B:172:0x01a0, B:66:0x0224, B:68:0x0235, B:163:0x022c, B:47:0x01ca, B:48:0x01cf, B:49:0x01d5, B:50:0x01d8, B:54:0x01e1, B:56:0x01eb, B:59:0x01f3, B:60:0x020a, B:63:0x0219, B:165:0x0213, B:177:0x0194), top: B:24:0x0139 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ca A[Catch: Exception -> 0x024f, all -> 0x0261, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x024f, blocks: (B:45:0x019a, B:47:0x01ca, B:49:0x01d5), top: B:44:0x019a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x029c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a4 A[Catch: Exception -> 0x0377, TRY_LEAVE, TryCatch #6 {Exception -> 0x0377, blocks: (B:81:0x029e, B:83:0x02a4, B:87:0x02ad, B:89:0x02b7, B:90:0x02d1, B:93:0x02e0, B:96:0x02e8, B:128:0x0311, B:132:0x0328, B:134:0x0332, B:135:0x034c, B:145:0x02da), top: B:80:0x029e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(android.content.Context r26, java.lang.String r27, java.lang.String r28, boolean r29, com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 r30) {
        /*
            Method dump skipped, instructions count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.c(android.content.Context, java.lang.String, java.lang.String, boolean, com.tencent.mm.sdk.platformtools.y6):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.d(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void e(android.content.Context context, java.lang.String str, java.lang.String str2, zb0.a0 a0Var) {
        java.lang.String i17 = i(str);
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExportFileUtil", "[+] Called exportToPublicDownloadDirWithPermissionRequest, src: %s, dest: %s", str, i17);
        h(context, new x51.u(context, str, str2), new x51.v(a0Var, str, i17));
    }

    /* renamed from: exportImageImpl */
    private static java.lang.String m48614x451550c7(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return c(context, str, str2, false, null);
    }

    /* renamed from: exportVideoImpl */
    private static java.lang.String m48615xc8e02be7(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = q75.c.b("mp4");
        }
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(str2));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u6.c(context, str, str2, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, null)) {
            return str2;
        }
        return null;
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return "";
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str2));
        if (str.isEmpty()) {
            str = r6Var.m82467xfb82e301();
        }
        if (r6Var.m() && (!com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.c(str2) || !r6Var.m82467xfb82e301().equals(str))) {
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(k(), str);
            java.lang.String m82467xfb82e301 = r6Var2.m82467xfb82e301();
            com.p314xaae8f345.mm.vfs.r6 r6Var3 = r6Var2;
            int i17 = 0;
            int i18 = 2;
            while (true) {
                if (i17 >= 99) {
                    break;
                }
                if (!r6Var3.m()) {
                    r6Var = r6Var3;
                    break;
                }
                com.p314xaae8f345.mm.vfs.r6 s17 = r6Var2.s();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int lastIndexOf = m82467xfb82e301.lastIndexOf(46);
                sb6.append(lastIndexOf < 0 ? m82467xfb82e301 : m82467xfb82e301.substring(0, lastIndexOf));
                sb6.append("(");
                sb6.append(i18);
                sb6.append(")");
                int lastIndexOf2 = m82467xfb82e301.lastIndexOf(46);
                sb6.append(lastIndexOf2 < 0 ? "" : m82467xfb82e301.substring(lastIndexOf2));
                r6Var3 = new com.p314xaae8f345.mm.vfs.r6(s17, sb6.toString());
                i18++;
                i17++;
            }
            if (i18 > 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExportFileUtil", "[!] dest file [%s] exists, rename to [%s]", r6Var.o(), r6Var3.o());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExportFileUtil", "copy file ret: " + com.p314xaae8f345.mm.vfs.w6.d(str2, r6Var.o(), false));
        }
        if (r6Var.s() != null) {
            r6Var.s().J();
        }
        java.lang.String o17 = r6Var.o();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExportFileUtil", "[+] Called exportToPublicFile, src: %s, dest: %s", str2, o17);
        return o17;
    }

    public static java.lang.String g(android.content.Context context, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 y6Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExportFileUtil", "[+] Called exportVideo, src: %s", str);
        try {
            if (android.text.TextUtils.isEmpty(str2)) {
                str2 = q75.c.b("mp4");
            }
            com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(str2));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u6.c(context, str, str2, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, y6Var)) {
                return str2;
            }
            return null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExportFileUtil", th6, "exportVideoImpl fail", new java.lang.Object[0]);
            return null;
        }
    }

    public static void h(android.content.Context context, java.util.concurrent.Callable callable, m3.a aVar) {
        l(context, new x51.d0(callable, aVar));
    }

    public static java.lang.String i(java.lang.String str) {
        java.io.File file;
        java.lang.String absolutePath;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!a17.f294812f.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str3 = a17.f294812f;
        int lastIndexOf = str3.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str3 = str3.substring(lastIndexOf + 1);
        }
        synchronized (lp0.b.class) {
            try {
                file = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CConstants", th6, "[-] Fail to get public download path from system.", new java.lang.Object[0]);
                file = null;
            }
            if (file == null) {
                file = new java.io.File(lp0.b.Y(), android.os.Environment.DIRECTORY_DOWNLOADS);
            }
            java.io.File file2 = new java.io.File(file, lp0.b.c0());
            try {
                absolutePath = file2.getCanonicalPath();
            } catch (java.lang.Throwable unused) {
                absolutePath = file2.getAbsolutePath();
            }
        }
        return new com.p314xaae8f345.mm.vfs.r6(absolutePath, str3).o();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String j(java.lang.String r3) {
        /*
            java.lang.String r0 = com.p314xaae8f345.mm.vfs.w6.n(r3)     // Catch: java.lang.Exception -> L27
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)     // Catch: java.lang.Exception -> L25
            if (r1 != 0) goto L1c
            java.lang.String r1 = "pic"
            boolean r1 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Exception -> L25
            if (r1 != 0) goto L1c
            java.lang.String r1 = "pic_hd"
            boolean r1 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Exception -> L25
            if (r1 == 0) goto L40
        L1c:
            java.lang.String r3 = q75.g.d(r3)     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = q75.g.a(r3)     // Catch: java.lang.Exception -> L25
            goto L40
        L25:
            r3 = move-exception
            goto L29
        L27:
            r3 = move-exception
            r0 = 0
        L29:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getDestImagePath err: "
            r1.<init>(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "MicroMsg.ExportFileUtil"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r3)
        L40:
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r3 == 0) goto L48
            java.lang.String r0 = "jpg"
        L48:
            java.lang.String r3 = q75.c.a(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.j(java.lang.String):java.lang.String");
    }

    public static java.lang.String k() {
        return com.p314xaae8f345.mm.vfs.q7.c("c2c_export_temp");
    }

    public static void l(android.content.Context context, m3.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExportFileUtil", "[+] Called checkStoragePermission, ctx: %s", context);
        boolean z17 = true;
        if (android.os.Build.VERSION.SDK_INT < 29) {
            byte[] bArr = j35.a0.f379028a;
            if (!(b3.l.m9698x3fed0563(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.WRITE_EXTERNAL_STORAGE") == 0)) {
                z17 = false;
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExportFileUtil", "[+] hasPermission = true");
            aVar.mo3938xab27b508(java.lang.Boolean.TRUE);
        } else if (context instanceof android.app.Activity) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExportFileUtil", "requestPermission");
            j35.u.j(context, 241, new x51.x(aVar), new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, "", "");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExportFileUtil", "[-] Context [%s] is not an ui context, regard as user denied since we can't ask him.");
            aVar.mo3938xab27b508(java.lang.Boolean.FALSE);
        }
    }

    public static void m(android.content.Context context, java.lang.String str) {
        x51.z zVar = new x51.z(context, str);
        if (android.os.Looper.myLooper() != null) {
            zVar.run();
        } else {
            ((ku5.t0) ku5.t0.f394148d).D(zVar);
        }
    }
}

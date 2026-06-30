package fp;

/* loaded from: classes11.dex */
public abstract class i {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(long r11) {
        /*
            java.lang.String r0 = "MicroMsg.CUtil"
            r1 = 0
            r3 = 0
            android.os.StatFs r4 = new android.os.StatFs     // Catch: java.lang.Exception -> L22
            java.io.File r5 = fp.m.a()     // Catch: java.lang.Exception -> L22
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Exception -> L22
            r4.<init>(r5)     // Catch: java.lang.Exception -> L22
            int r3 = r4.getBlockCount()     // Catch: java.lang.Exception -> L1f
            long r5 = (long) r3
            int r3 = r4.getAvailableBlocks()     // Catch: java.lang.Exception -> L1d
            long r7 = (long) r3
            goto L35
        L1d:
            r3 = move-exception
            goto L27
        L1f:
            r3 = move-exception
            r5 = r1
            goto L27
        L22:
            r4 = move-exception
            r5 = r1
            r10 = r4
            r4 = r3
            r3 = r10
        L27:
            java.lang.String r3 = r3.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r7 = "isDataDirHaveEnoughSpace, exception: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r7, r3)
            r7 = r1
        L35:
            r3 = 0
            if (r4 != 0) goto L39
            return r3
        L39:
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 > 0) goto L3e
            return r3
        L3e:
            long r5 = r5 - r7
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 >= 0) goto L44
            return r3
        L44:
            int r1 = r4.getBlockSize()
            long r1 = (long) r1
            int r4 = r4.getFreeBlocks()
            long r4 = (long) r4
            long r1 = r1 * r4
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 >= 0) goto L6a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "isDataDirHaveEnoughSpace needSize: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r11 = " not enough and ret false"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r11)
            return r3
        L6a:
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: fp.i.a(long):boolean");
    }

    public static boolean b() {
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        boolean z18;
        try {
            java.io.File file = new java.io.File(lp0.b.e0());
            if (file.canWrite()) {
                str2 = "";
                z18 = true;
            } else {
                str2 = "canWrite false: re-check=" + file.canWrite();
                z18 = false;
            }
            z17 = z18;
            str = str2;
            e = null;
        } catch (java.lang.Exception e17) {
            e = e17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CUtil", e, "summer isSDCardAvail 1 e: " + e.getMessage() + " SDCARD_ROOT: " + lp0.b.e0(), new java.lang.Object[0]);
            str = "io exception";
            z17 = false;
        }
        if (java.lang.Boolean.valueOf(z17).booleanValue()) {
            return true;
        }
        java.util.Map b17 = xo.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "File_SdCanWrite", new java.io.File(lp0.b.D()), e);
        b17.put("can_write_exception", e != null ? e.getMessage() : null);
        java.lang.String path = lp0.b.D();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        jz5.o a17 = xo.a.a(path, false);
        java.lang.Throwable th6 = (java.lang.Throwable) a17.f384376f;
        b17.put("test_write_result", a17.f384374d);
        b17.put("test_write_reason", a17.f384375e);
        b17.put("test_write_exception", th6 != null ? th6.getMessage() : null);
        if (e == null) {
            e = th6 != null ? th6 : new java.lang.Throwable();
        }
        ap.a.a(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, "SdcardCompat", e, b17, "SdCanWrite", str);
        return xo.a.f537273c;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(long r11) {
        /*
            boolean r0 = b()
            java.lang.String r1 = "MicroMsg.CUtil"
            r2 = 0
            if (r0 != 0) goto L10
            java.lang.String r11 = "summer isSDCardHaveEnoughSpace sdcard not avail and ret false"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r11)
            return r2
        L10:
            r3 = 0
            r0 = 0
            android.os.StatFs r5 = new android.os.StatFs     // Catch: java.lang.Exception -> L2c
            java.lang.String r6 = lp0.b.e0()     // Catch: java.lang.Exception -> L2c
            r5.<init>(r6)     // Catch: java.lang.Exception -> L2c
            int r0 = r5.getBlockCount()     // Catch: java.lang.Exception -> L29
            long r6 = (long) r0
            int r0 = r5.getAvailableBlocks()     // Catch: java.lang.Exception -> L27
            long r8 = (long) r0
            goto L3b
        L27:
            r0 = move-exception
            goto L31
        L29:
            r0 = move-exception
            r6 = r3
            goto L31
        L2c:
            r5 = move-exception
            r6 = r3
            r10 = r5
            r5 = r0
            r0 = r10
        L31:
            java.lang.String r8 = "isSDCardHaveEnoughSpace"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r8, r0)
            r8 = r3
        L3b:
            if (r5 != 0) goto L3e
            return r2
        L3e:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L43
            return r2
        L43:
            long r6 = r6 - r8
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 >= 0) goto L49
            return r2
        L49:
            int r0 = r5.getBlockSize()
            long r3 = (long) r0
            int r0 = r5.getFreeBlocks()
            long r5 = (long) r0
            long r3 = r3 * r5
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 >= 0) goto L70
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "summer isSDCardHaveEnoughSpace needSize: "
            r0.<init>(r3)
            r0.append(r11)
            java.lang.String r11 = " not enough and ret false"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r11)
            return r2
        L70:
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: fp.i.c(long):boolean");
    }
}

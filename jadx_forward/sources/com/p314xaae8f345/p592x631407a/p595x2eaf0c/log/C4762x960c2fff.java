package com.p314xaae8f345.p592x631407a.p595x2eaf0c.log;

/* renamed from: com.tencent.midas.comm.log.APLogFileInfo */
/* loaded from: classes13.dex */
public class C4762x960c2fff {

    /* renamed from: dirName */
    public static java.lang.String f20313x638764b8 = "";

    /* renamed from: fileName */
    public static java.lang.String f20314xd425c627 = "";

    /* renamed from: mmapName */
    public static java.lang.String f20315x6cbca0fa = "";

    /* renamed from: buildDirName */
    private static java.lang.String m41666x183abe6a() {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4756x935006e3 m41604x522675dc = com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.m41604x522675dc();
        if (m41604x522675dc == null || m41604x522675dc.m41616x52297553() == null) {
            return "";
        }
        java.lang.String m41616x52297553 = m41604x522675dc.m41616x52297553();
        java.lang.String str = java.io.File.separator;
        if (!m41616x52297553.endsWith(str)) {
            m41616x52297553 = m41616x52297553 + str;
        }
        java.lang.String str2 = m41616x52297553 + m41604x522675dc.m41618x1eee1641() + str;
        if (android.text.TextUtils.isEmpty(m41604x522675dc.m41619xe5e58464())) {
            return str2;
        }
        return str2 + m41604x522675dc.m41619xe5e58464() + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* renamed from: buildFileName */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m41667xb5dda2b5(boolean r3) {
        /*
            r0 = 0
            java.lang.String r1 = com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.C4762x960c2fff.f20313x638764b8     // Catch: java.lang.Throwable -> L50
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L54
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.C4762x960c2fff.f20313x638764b8     // Catch: java.lang.Throwable -> L50
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.C4762x960c2fff.f20313x638764b8     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L4d
            boolean r0 = r0.endsWith(r2)     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L1d
            r1.append(r2)     // Catch: java.lang.Throwable -> L4d
        L1d:
            java.lang.String r0 = com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.C4762x960c2fff.f20313x638764b8     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.m41728xa29cd6df(r0)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L33
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L4d
            if (r3 != 0) goto L33
            r1.append(r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L4d
            return r3
        L33:
            java.lang.String r3 = com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.m41731x7534458b()     // Catch: java.lang.Throwable -> L4d
            r1.append(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = "_"
            r1.append(r3)     // Catch: java.lang.Throwable -> L4d
            int r3 = m41668xb619a0f3(r0)     // Catch: java.lang.Throwable -> L4d
            r1.append(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = ".txt"
            r1.append(r3)     // Catch: java.lang.Throwable -> L4d
            r0 = r1
            goto L54
        L4d:
            r3 = move-exception
            r0 = r1
            goto L51
        L50:
            r3 = move-exception
        L51:
            r3.toString()
        L54:
            if (r0 != 0) goto L59
            java.lang.String r3 = ""
            goto L5d
        L59:
            java.lang.String r3 = r0.toString()
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.C4762x960c2fff.m41667xb5dda2b5(boolean):java.lang.String");
    }

    /* renamed from: buildFileNumber */
    private static int m41668xb619a0f3(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return 1;
        }
        try {
            java.lang.String[] split = str.split(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.m41731x7534458b() + "_");
            if (split.length > 1) {
                return java.lang.Integer.parseInt(split[1].split(".txt")[0]) + 1;
            }
            return 1;
        } catch (java.lang.Throwable th6) {
            th6.getMessage();
            return 1;
        }
    }

    /* renamed from: buildMmapName */
    private static java.lang.String m41669x4e747d88() {
        return f20313x638764b8 + java.io.File.separator + "MidasLog.mmap";
    }

    /* renamed from: create */
    public static void m41670xaf65a0fc() {
        try {
            f20313x638764b8 = m41666x183abe6a();
            f20314xd425c627 = m41667xb5dda2b5(true);
            f20315x6cbca0fa = m41669x4e747d88();
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
    }

    /* renamed from: updateFileName */
    public static void m41671x8038a10() {
        f20314xd425c627 = m41667xb5dda2b5(false);
    }
}

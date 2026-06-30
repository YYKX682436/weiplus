package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* loaded from: classes7.dex */
public abstract class m0 {
    public static int a(java.lang.String... strArr) {
        int i17 = 0;
        for (java.lang.String str : strArr) {
            if (str != null) {
                i17 += str.length();
            }
        }
        return i17;
    }

    public static void b(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(new com.p314xaae8f345.mm.vfs.z7(null, null, new java.io.File(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir(), str).getPath(), null, null), null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStorageHelper", "deleteTmpFile: " + str + ":" + (m17.a() && m17.f294799a.d(m17.f294800b)));
    }

    public static java.lang.String c(java.lang.String str) {
        java.io.BufferedReader bufferedReader;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir(), str);
        if (!r6Var.m()) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            try {
                bufferedReader = new java.io.BufferedReader(new com.p314xaae8f345.mm.vfs.z6(r6Var));
            } catch (java.io.IOException e17) {
                throw e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            bufferedReader = null;
        }
        try {
            char[] cArr = new char[1024];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read == -1) {
                    bufferedReader.close();
                    return stringBuffer.toString();
                }
                stringBuffer.append(java.lang.String.valueOf(cArr, 0, read));
            }
        } catch (java.io.IOException e18) {
            throw e18;
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
    }

    public static java.lang.String d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1 o1Var) {
        return o1Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.NONE ? "ok" : o1Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.QUOTA_REACHED ? "fail:quota reached" : "fail:internal error set DB data fail";
    }

    public static void e(java.lang.String str, java.lang.String... strArr) {
        com.p314xaae8f345.mm.vfs.a7 a7Var;
        java.lang.Throwable th6;
        try {
            a7Var = new com.p314xaae8f345.mm.vfs.a7(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir(), str));
            try {
                for (java.lang.String str2 : strArr) {
                    a7Var.write(str2);
                }
                try {
                    a7Var.close();
                } catch (java.io.IOException unused) {
                }
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                if (a7Var != null) {
                    try {
                        a7Var.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
                throw th6;
            }
        } catch (java.lang.Throwable th8) {
            a7Var = null;
            th6 = th8;
        }
    }
}

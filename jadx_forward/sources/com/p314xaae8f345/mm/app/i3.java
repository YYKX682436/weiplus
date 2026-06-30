package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public abstract class i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p971x6de15a2e.s[] f134982a = {null};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f134983b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f134984c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p971x6de15a2e.y f134985d = new com.p314xaae8f345.mm.app.f3();

    public static boolean a(int i17) {
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IpxxUploadHelper", "Cancel upload log[%s]", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p971x6de15a2e.s[] sVarArr = f134982a;
        synchronized (sVarArr) {
            sVar = sVarArr[0];
        }
        if (sVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IpxxUploadHelper", "Dispatcher is null.");
            return false;
        }
        synchronized (f134983b) {
            try {
                com.p314xaae8f345.mm.app.h3 h3Var = (com.p314xaae8f345.mm.app.h3) ((java.util.HashMap) f134984c).remove(java.lang.Integer.valueOf(i17));
                sVar.Q0(i17);
                if (h3Var != null) {
                    java.lang.String str = h3Var.f134970a;
                    com.p314xaae8f345.mm.app.g3 g3Var = h3Var.f134971b;
                    if (g3Var != null) {
                        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.app.e3(g3Var, i17, str));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IpxxUploadHelper", "Cancel upload log path = %s", h3Var.f134970a);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IpxxUploadHelper", th6, "Error happened.", new java.lang.Object[0]);
                return false;
            }
        }
        return true;
    }

    public static void b(com.p314xaae8f345.mm.app.g3 g3Var, java.lang.String str) {
        if (g3Var == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.app.d3(g3Var, str));
    }

    public static void c(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.app.g3 g3Var) {
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar;
        com.p314xaae8f345.mm.p971x6de15a2e.s[] sVarArr = f134982a;
        synchronized (sVarArr) {
            sVar = sVarArr[0];
        }
        if (sVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IpxxUploadHelper", "Please call init first.");
            b(g3Var, str);
            return;
        }
        synchronized (f134983b) {
            long j17 = i18;
            int i19 = -1;
            try {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str3 == null) {
                    str3 = "";
                }
                java.lang.String str4 = str3;
                if (str2 == null) {
                    str2 = "";
                }
                i19 = sVar.Z0(str, i17, j17, str4, str2);
                if (i19 >= 0) {
                    ((java.util.HashMap) f134984c).put(java.lang.Integer.valueOf(i19), new com.p314xaae8f345.mm.app.h3(i19, str, g3Var));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IpxxUploadHelper", "Fail to call uploadFile.");
                    b(g3Var, str);
                }
            } finally {
            }
        }
    }

    public static int d(int[] iArr, boolean z17, long j17, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.app.g3 g3Var) {
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar;
        com.p314xaae8f345.mm.p971x6de15a2e.s[] sVarArr = f134982a;
        synchronized (sVarArr) {
            sVar = sVarArr[0];
        }
        int i19 = -1;
        if (sVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IpxxUploadHelper", "Please call init first.");
            b(g3Var, null);
            return -1;
        }
        synchronized (f134983b) {
            try {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                i19 = sVar.D(iArr, z17, j17, i17, i18, str3 == null ? "" : str3, str, str2);
                if (i19 >= 0) {
                    ((java.util.HashMap) f134984c).put(java.lang.Integer.valueOf(i19), new com.p314xaae8f345.mm.app.h3(i19, null, g3Var));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IpxxUploadHelper", "Fail to call uploadLog.");
                    b(g3Var, null);
                }
            } finally {
                return i19;
            }
        }
        return i19;
    }
}

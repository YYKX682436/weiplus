package com.tencent.mm.app;

/* loaded from: classes12.dex */
public abstract class i3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.network.s[] f53449a = {null};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f53450b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f53451c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.network.y f53452d = new com.tencent.mm.app.f3();

    public static boolean a(int i17) {
        com.tencent.mm.network.s sVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.IpxxUploadHelper", "Cancel upload log[%s]", java.lang.Integer.valueOf(i17));
        com.tencent.mm.network.s[] sVarArr = f53449a;
        synchronized (sVarArr) {
            sVar = sVarArr[0];
        }
        if (sVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IpxxUploadHelper", "Dispatcher is null.");
            return false;
        }
        synchronized (f53450b) {
            try {
                com.tencent.mm.app.h3 h3Var = (com.tencent.mm.app.h3) ((java.util.HashMap) f53451c).remove(java.lang.Integer.valueOf(i17));
                sVar.Q0(i17);
                if (h3Var != null) {
                    java.lang.String str = h3Var.f53437a;
                    com.tencent.mm.app.g3 g3Var = h3Var.f53438b;
                    if (g3Var != null) {
                        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.app.e3(g3Var, i17, str));
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.IpxxUploadHelper", "Cancel upload log path = %s", h3Var.f53437a);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IpxxUploadHelper", th6, "Error happened.", new java.lang.Object[0]);
                return false;
            }
        }
        return true;
    }

    public static void b(com.tencent.mm.app.g3 g3Var, java.lang.String str) {
        if (g3Var == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.app.d3(g3Var, str));
    }

    public static void c(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, com.tencent.mm.app.g3 g3Var) {
        com.tencent.mm.network.s sVar;
        com.tencent.mm.network.s[] sVarArr = f53449a;
        synchronized (sVarArr) {
            sVar = sVarArr[0];
        }
        if (sVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IpxxUploadHelper", "Please call init first.");
            b(g3Var, str);
            return;
        }
        synchronized (f53450b) {
            long j17 = i18;
            int i19 = -1;
            try {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str3 == null) {
                    str3 = "";
                }
                java.lang.String str4 = str3;
                if (str2 == null) {
                    str2 = "";
                }
                i19 = sVar.Z0(str, i17, j17, str4, str2);
                if (i19 >= 0) {
                    ((java.util.HashMap) f53451c).put(java.lang.Integer.valueOf(i19), new com.tencent.mm.app.h3(i19, str, g3Var));
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IpxxUploadHelper", "Fail to call uploadFile.");
                    b(g3Var, str);
                }
            } finally {
            }
        }
    }

    public static int d(int[] iArr, boolean z17, long j17, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.app.g3 g3Var) {
        com.tencent.mm.network.s sVar;
        com.tencent.mm.network.s[] sVarArr = f53449a;
        synchronized (sVarArr) {
            sVar = sVarArr[0];
        }
        int i19 = -1;
        if (sVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IpxxUploadHelper", "Please call init first.");
            b(g3Var, null);
            return -1;
        }
        synchronized (f53450b) {
            try {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                i19 = sVar.D(iArr, z17, j17, i17, i18, str3 == null ? "" : str3, str, str2);
                if (i19 >= 0) {
                    ((java.util.HashMap) f53451c).put(java.lang.Integer.valueOf(i19), new com.tencent.mm.app.h3(i19, null, g3Var));
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IpxxUploadHelper", "Fail to call uploadLog.");
                    b(g3Var, null);
                }
            } finally {
                return i19;
            }
        }
        return i19;
    }
}

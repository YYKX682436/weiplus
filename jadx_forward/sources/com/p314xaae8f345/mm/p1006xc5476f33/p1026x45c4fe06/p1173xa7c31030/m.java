package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030;

/* loaded from: classes7.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static long f168896a;

    /* renamed from: b, reason: collision with root package name */
    public static long f168897b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f168898c = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: d, reason: collision with root package name */
    public static volatile java.lang.Boolean f168899d = java.lang.Boolean.FALSE;

    public static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, double d17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        e(str, str2, str3, "C", currentTimeMillis, currentTimeMillis, java.lang.String.format("{\"%s\":%f}", str3, java.lang.Double.valueOf(d17)));
    }

    public static final boolean b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.vfs.a7 a7Var;
        if (!fp.i.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPerformanceTracer", "dumpToFile error, SDCard is unavailable.");
            return false;
        }
        com.p314xaae8f345.mm.vfs.a7 a7Var2 = null;
        try {
            try {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(lp0.b.D() + "appbrand/trace/");
                if (!r6Var.m()) {
                    r6Var.J();
                }
                a7Var = new com.p314xaae8f345.mm.vfs.a7(new com.p314xaae8f345.mm.vfs.r6(r6Var, java.lang.String.format("trace_%s_%d", str, java.lang.Long.valueOf(f168897b))), true);
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            a7Var.write(str2);
            try {
                a7Var.close();
            } catch (java.lang.Exception unused) {
            }
            return true;
        } catch (java.lang.Exception e18) {
            a7Var2 = a7Var;
            e = e18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPerformanceTracer", "dump file error: " + e);
            if (a7Var2 == null) {
                return false;
            }
            try {
                a7Var2.close();
                return false;
            } catch (java.lang.Exception unused2) {
                return false;
            }
        } catch (java.lang.Throwable th7) {
            a7Var2 = a7Var;
            th = th7;
            if (a7Var2 != null) {
                try {
                    a7Var2.close();
                } catch (java.lang.Exception unused3) {
                }
            }
            throw th;
        }
    }

    public static synchronized java.lang.Boolean c() {
        java.lang.Boolean bool;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.class) {
            bool = f168899d;
        }
        return bool;
    }

    public static void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPerformanceTracer", "openAudits");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        f168897b = java.lang.System.currentTimeMillis();
        f168899d = java.lang.Boolean.TRUE;
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, long j18, java.lang.String str5) {
        if (c().booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.l();
            lVar.f168889a = str;
            lVar.f168892d = str3;
            lVar.f168890b = str2;
            lVar.f168891c = str4;
            lVar.f168893e = j17;
            lVar.f168894f = j18;
            lVar.f168895g = str5 != null ? java.net.URLEncoder.encode(str5) : "";
            java.util.List list = f168898c;
            if (list.size() < 10000) {
                list.add(lVar);
            }
        }
    }

    public static void f(java.lang.String str, java.lang.String str2, long j17, long j18, java.lang.String str3) {
        e(str, "Native", str2, "X", j17, j18, str3);
    }

    public static boolean g(java.lang.String str, java.util.ArrayList arrayList) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (arrayList == null) {
            return false;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (str2.endsWith("\n")) {
                sb6.append(str2);
            } else {
                sb6.append(str2);
                sb6.append("\n");
            }
        }
        return b(str, sb6.toString());
    }
}

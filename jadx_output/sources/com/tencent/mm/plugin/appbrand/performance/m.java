package com.tencent.mm.plugin.appbrand.performance;

/* loaded from: classes7.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static long f87363a;

    /* renamed from: b, reason: collision with root package name */
    public static long f87364b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f87365c = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: d, reason: collision with root package name */
    public static volatile java.lang.Boolean f87366d = java.lang.Boolean.FALSE;

    public static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, double d17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        e(str, str2, str3, "C", currentTimeMillis, currentTimeMillis, java.lang.String.format("{\"%s\":%f}", str3, java.lang.Double.valueOf(d17)));
    }

    public static final boolean b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.vfs.a7 a7Var;
        if (!fp.i.b()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPerformanceTracer", "dumpToFile error, SDCard is unavailable.");
            return false;
        }
        com.tencent.mm.vfs.a7 a7Var2 = null;
        try {
            try {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.D() + "appbrand/trace/");
                if (!r6Var.m()) {
                    r6Var.J();
                }
                a7Var = new com.tencent.mm.vfs.a7(new com.tencent.mm.vfs.r6(r6Var, java.lang.String.format("trace_%s_%d", str, java.lang.Long.valueOf(f87364b))), true);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPerformanceTracer", "dump file error: " + e);
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
        synchronized (com.tencent.mm.plugin.appbrand.performance.m.class) {
            bool = f87366d;
        }
        return bool;
    }

    public static void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPerformanceTracer", "openAudits");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        f87364b = java.lang.System.currentTimeMillis();
        f87366d = java.lang.Boolean.TRUE;
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, long j18, java.lang.String str5) {
        if (c().booleanValue()) {
            com.tencent.mm.plugin.appbrand.performance.l lVar = new com.tencent.mm.plugin.appbrand.performance.l();
            lVar.f87356a = str;
            lVar.f87359d = str3;
            lVar.f87357b = str2;
            lVar.f87358c = str4;
            lVar.f87360e = j17;
            lVar.f87361f = j18;
            lVar.f87362g = str5 != null ? java.net.URLEncoder.encode(str5) : "";
            java.util.List list = f87365c;
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

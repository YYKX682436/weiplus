package c.t.m.p134x35c0ce.c;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static c.t.m.p134x35c0ce.c.b f118394a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f118395b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List<c.t.m.p134x35c0ce.c.a> f118396c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f118397d = "";

    public b(android.content.Context context) {
        this.f118396c = null;
        this.f118395b = context;
        this.f118396c = new java.util.ArrayList();
    }

    public static c.t.m.p134x35c0ce.c.b a(android.content.Context context) {
        if (f118394a == null) {
            f118394a = new c.t.m.p134x35c0ce.c.b(context);
        }
        return f118394a;
    }

    public final synchronized dalvik.system.DexClassLoader a() {
        dalvik.system.DexClassLoader dexClassLoader;
        dalvik.system.DexClassLoader dexClassLoader2;
        java.lang.String str;
        java.io.File[] listFiles;
        c.t.m.p134x35c0ce.c.k.a(this.f118395b);
        java.util.List<c.t.m.p134x35c0ce.c.a> list = this.f118396c;
        if (list != null && list.size() > 0) {
            c.t.m.p134x35c0ce.c.q.f118451d = c.t.m.p134x35c0ce.c.q.a(this.f118396c);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f118395b.getFilesDir().getAbsolutePath());
            java.lang.String str2 = java.io.File.separator;
            sb6.append(str2);
            sb6.append(this.f118397d);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str3 = this.f118395b.getFilesDir().getAbsolutePath() + str2 + c.t.m.p134x35c0ce.c.q.f118450c;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.lang.String str4 = "";
            for (c.t.m.p134x35c0ce.c.a aVar : this.f118396c) {
                if (aVar != null) {
                    sb8.append(sb7);
                    java.lang.String str5 = java.io.File.separator;
                    sb8.append(str5);
                    sb8.append(aVar.f118390c);
                    sb8.append(java.io.File.pathSeparator);
                    if (aVar.f118390c.contains(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55637xc33c4c99)) {
                        str4 = sb7 + str5 + aVar.f118390c;
                    }
                }
            }
            try {
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    try {
                        new java.io.File(str4).setReadOnly();
                    } catch (java.lang.Throwable th6) {
                        c.t.m.p134x35c0ce.c.i.a("setReadOnly", th6);
                    }
                }
                java.lang.System.currentTimeMillis();
                dexClassLoader = new dalvik.system.DexClassLoader(sb8.toString(), str3, null, getClass().getClassLoader());
                str = "";
            } catch (java.lang.Exception e17) {
                e = e17;
                dexClassLoader = null;
            }
            try {
                java.io.File file = new java.io.File(sb7);
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
                    for (java.io.File file2 : listFiles) {
                        str = str + (file2.getName() + "," + file2.length() + "," + c.t.m.p134x35c0ce.c.q.a(file2)) + ";";
                    }
                }
                c.t.m.p134x35c0ce.c.i.a("before load ,private dir files:" + str);
                c.t.m.p134x35c0ce.c.e.a(this.f118395b).a("CPL", "suc:" + c.t.m.p134x35c0ce.c.q.f118451d);
                return dexClassLoader;
            } catch (java.lang.Exception e18) {
                e = e18;
                c.t.m.p134x35c0ce.c.i.a("try once", e);
                c.t.m.p134x35c0ce.c.e.a(this.f118395b).a("CPL", "fail:" + c.t.m.p134x35c0ce.c.q.f118451d + ",exc:" + e.toString());
                c.t.m.p134x35c0ce.c.k.a(this.f118395b);
                try {
                    java.lang.System.currentTimeMillis();
                    dexClassLoader2 = new dalvik.system.DexClassLoader(sb8.toString(), str3, null, getClass().getClassLoader());
                } catch (java.lang.Throwable unused) {
                }
                try {
                    c.t.m.p134x35c0ce.c.e.a(this.f118395b).a("CPL", "suc:c" + c.t.m.p134x35c0ce.c.q.f118451d);
                    return dexClassLoader2;
                } catch (java.lang.Throwable unused2) {
                    dexClassLoader = dexClassLoader2;
                    c.t.m.p134x35c0ce.c.i.a("try once failed", e);
                    return dexClassLoader;
                }
            }
        }
        return null;
    }

    public dalvik.system.DexClassLoader a(java.util.List<c.t.m.p134x35c0ce.c.a> list, java.lang.String str) {
        this.f118396c = list;
        this.f118397d = str;
        int i17 = 0;
        dalvik.system.DexClassLoader dexClassLoader = null;
        while (true) {
            int i18 = i17 + 1;
            if (i17 >= 3) {
                break;
            }
            try {
                dexClassLoader = a();
                c.t.m.p134x35c0ce.c.e.b().a("CPL", "lcn:" + i18);
                if (dexClassLoader != null) {
                    c.t.m.p134x35c0ce.c.k.f(this.f118395b);
                    return dexClassLoader;
                }
                i17 = i18;
            } catch (java.lang.Throwable th6) {
                c.t.m.p134x35c0ce.c.e.b().a("CPL", "fail:" + th6.toString());
            }
        }
        c.t.m.p134x35c0ce.c.k.f(this.f118395b);
        return dexClassLoader;
    }
}

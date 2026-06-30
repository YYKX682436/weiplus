package c.t.m.sapp.c;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static c.t.m.sapp.c.b f36861a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f36862b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List<c.t.m.sapp.c.a> f36863c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f36864d = "";

    public b(android.content.Context context) {
        this.f36863c = null;
        this.f36862b = context;
        this.f36863c = new java.util.ArrayList();
    }

    public static c.t.m.sapp.c.b a(android.content.Context context) {
        if (f36861a == null) {
            f36861a = new c.t.m.sapp.c.b(context);
        }
        return f36861a;
    }

    public final synchronized dalvik.system.DexClassLoader a() {
        dalvik.system.DexClassLoader dexClassLoader;
        dalvik.system.DexClassLoader dexClassLoader2;
        java.lang.String str;
        java.io.File[] listFiles;
        c.t.m.sapp.c.k.a(this.f36862b);
        java.util.List<c.t.m.sapp.c.a> list = this.f36863c;
        if (list != null && list.size() > 0) {
            c.t.m.sapp.c.q.f36918d = c.t.m.sapp.c.q.a(this.f36863c);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f36862b.getFilesDir().getAbsolutePath());
            java.lang.String str2 = java.io.File.separator;
            sb6.append(str2);
            sb6.append(this.f36864d);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str3 = this.f36862b.getFilesDir().getAbsolutePath() + str2 + c.t.m.sapp.c.q.f36917c;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.lang.String str4 = "";
            for (c.t.m.sapp.c.a aVar : this.f36863c) {
                if (aVar != null) {
                    sb8.append(sb7);
                    java.lang.String str5 = java.io.File.separator;
                    sb8.append(str5);
                    sb8.append(aVar.f36857c);
                    sb8.append(java.io.File.pathSeparator);
                    if (aVar.f36857c.contains(com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX)) {
                        str4 = sb7 + str5 + aVar.f36857c;
                    }
                }
            }
            try {
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    try {
                        new java.io.File(str4).setReadOnly();
                    } catch (java.lang.Throwable th6) {
                        c.t.m.sapp.c.i.a("setReadOnly", th6);
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
                        str = str + (file2.getName() + "," + file2.length() + "," + c.t.m.sapp.c.q.a(file2)) + ";";
                    }
                }
                c.t.m.sapp.c.i.a("before load ,private dir files:" + str);
                c.t.m.sapp.c.e.a(this.f36862b).a("CPL", "suc:" + c.t.m.sapp.c.q.f36918d);
                return dexClassLoader;
            } catch (java.lang.Exception e18) {
                e = e18;
                c.t.m.sapp.c.i.a("try once", e);
                c.t.m.sapp.c.e.a(this.f36862b).a("CPL", "fail:" + c.t.m.sapp.c.q.f36918d + ",exc:" + e.toString());
                c.t.m.sapp.c.k.a(this.f36862b);
                try {
                    java.lang.System.currentTimeMillis();
                    dexClassLoader2 = new dalvik.system.DexClassLoader(sb8.toString(), str3, null, getClass().getClassLoader());
                } catch (java.lang.Throwable unused) {
                }
                try {
                    c.t.m.sapp.c.e.a(this.f36862b).a("CPL", "suc:c" + c.t.m.sapp.c.q.f36918d);
                    return dexClassLoader2;
                } catch (java.lang.Throwable unused2) {
                    dexClassLoader = dexClassLoader2;
                    c.t.m.sapp.c.i.a("try once failed", e);
                    return dexClassLoader;
                }
            }
        }
        return null;
    }

    public dalvik.system.DexClassLoader a(java.util.List<c.t.m.sapp.c.a> list, java.lang.String str) {
        this.f36863c = list;
        this.f36864d = str;
        int i17 = 0;
        dalvik.system.DexClassLoader dexClassLoader = null;
        while (true) {
            int i18 = i17 + 1;
            if (i17 >= 3) {
                break;
            }
            try {
                dexClassLoader = a();
                c.t.m.sapp.c.e.b().a("CPL", "lcn:" + i18);
                if (dexClassLoader != null) {
                    c.t.m.sapp.c.k.f(this.f36862b);
                    return dexClassLoader;
                }
                i17 = i18;
            } catch (java.lang.Throwable th6) {
                c.t.m.sapp.c.e.b().a("CPL", "fail:" + th6.toString());
            }
        }
        c.t.m.sapp.c.k.f(this.f36862b);
        return dexClassLoader;
    }
}

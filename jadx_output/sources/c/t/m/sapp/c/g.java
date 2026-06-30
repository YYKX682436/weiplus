package c.t.m.sapp.c;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f36890a = "6.11.26";

    /* renamed from: b, reason: collision with root package name */
    public static c.t.m.sapp.c.g f36891b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f36892c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List<c.t.m.sapp.c.a> f36893d = new java.util.ArrayList();

    public g(android.content.Context context) {
        this.f36892c = context;
    }

    public static c.t.m.sapp.c.g a(android.content.Context context) {
        if (f36891b == null) {
            synchronized (c.t.m.sapp.c.g.class) {
                if (f36891b == null) {
                    f36891b = new c.t.m.sapp.c.g(context);
                }
            }
        }
        return f36891b;
    }

    public dalvik.system.DexClassLoader b() {
        a();
        int b17 = c.t.m.sapp.c.k.b(this.f36892c);
        if (b17 != 6 && b17 != 2) {
            java.lang.System.currentTimeMillis();
            if (!c.t.m.sapp.c.k.d(this.f36892c)) {
                c.t.m.sapp.c.i.a("copy to private dir failed");
            }
        } else if (!c.t.m.sapp.c.k.c(this.f36892c)) {
            d();
        }
        if (!a(true, a("__SP_Tencent_Loc_COMP_INFO__sapp_"), c.t.m.sapp.c.q.f36916b)) {
            d();
        }
        return c.t.m.sapp.c.b.a(this.f36892c).a(a("__SP_Tencent_Loc_COMP_INFO__sapp_"), c.t.m.sapp.c.q.f36916b);
    }

    public final void c() {
        java.io.File file = new java.io.File(this.f36892c.getFilesDir(), c.t.m.sapp.c.q.f36916b);
        if (!file.exists()) {
            file.mkdirs();
        }
        java.io.File file2 = new java.io.File(this.f36892c.getFilesDir(), c.t.m.sapp.c.q.f36917c);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        c.t.m.sapp.c.k.a(this.f36892c);
    }

    public void d() {
        c.t.m.sapp.c.e.a(this.f36892c).a("DCR", "goback");
        if (c.t.m.sapp.c.k.d(this.f36892c)) {
            return;
        }
        c.t.m.sapp.c.e.a(this.f36892c).a("DCR", "copy from asset failed");
    }

    public boolean a() {
        c();
        java.lang.String str = f36890a;
        java.lang.String c17 = c.t.m.sapp.c.q.c(this.f36892c, "__Tencent_Cover_SDK_Version__sapp_", "");
        c.t.m.sapp.c.i.a("cv:" + c17 + "_" + str);
        c.t.m.sapp.c.e.a(this.f36892c).a("DCV", c17 + "_" + str);
        if (str.equals(c17)) {
            return false;
        }
        c.t.m.sapp.c.q.d(this.f36892c, "__Tencent_Cover_SDK_Version__sapp_", str);
        c.t.m.sapp.c.q.d(this.f36892c, "__pro_dex_load_info___sapp", "default");
        c.t.m.sapp.c.q.d(this.f36892c, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", "");
        c.t.m.sapp.c.q.a(this.f36892c.getFilesDir().getAbsolutePath() + java.io.File.separator + "TencentLocation_sapp/UpCp");
        return false;
    }

    public boolean a(boolean z17, java.util.List<c.t.m.sapp.c.a> list, java.lang.String str) {
        boolean z18;
        java.util.List<java.lang.String> a17 = c.t.m.sapp.c.q.a(this.f36892c, new java.io.File(this.f36892c.getFilesDir(), str));
        if (a17 != null && a17.size() != 0 && list.size() != 0) {
            java.lang.String c17 = c.t.m.sapp.c.q.c(this.f36892c, "__bad_dex_info___sapp", "preference_default_sapp");
            java.util.List<c.t.m.sapp.c.a> d17 = c.t.m.sapp.c.q.d(c17);
            if (!c17.equals("preference_default_sapp") && !d17.isEmpty() && c.t.m.sapp.c.k.a(list, d17)) {
                return false;
            }
            boolean z19 = true;
            for (c.t.m.sapp.c.a aVar : list) {
                java.util.Iterator<java.lang.String> it = a17.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z18 = false;
                        break;
                    }
                    java.lang.String[] split = it.next().split(",");
                    if (split.length == 3 && aVar.f36857c.equals(split[0]) && java.lang.String.valueOf(aVar.f36858d).equals(split[1]) && aVar.f36859e.equals(split[2])) {
                        z18 = true;
                        break;
                    }
                }
                if (!z18) {
                    z19 = false;
                }
            }
            return z19;
        }
        c.t.m.sapp.c.i.a("private dir files is empty");
        c.t.m.sapp.c.e.a(this.f36892c).a("DLC", "localComp file error");
        return false;
    }

    public java.util.List<c.t.m.sapp.c.a> a(java.lang.String str) {
        java.util.List<c.t.m.sapp.c.a> d17 = c.t.m.sapp.c.q.d(c.t.m.sapp.c.q.c(this.f36892c, str, ""));
        if (d17.size() == 0) {
            c.t.m.sapp.c.e.a(this.f36892c).a("DLC", "localComp parse error");
        }
        return d17;
    }
}

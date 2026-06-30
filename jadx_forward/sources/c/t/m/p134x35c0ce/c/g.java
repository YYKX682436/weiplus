package c.t.m.p134x35c0ce.c;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f118423a = "6.11.26";

    /* renamed from: b, reason: collision with root package name */
    public static c.t.m.p134x35c0ce.c.g f118424b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f118425c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List<c.t.m.p134x35c0ce.c.a> f118426d = new java.util.ArrayList();

    public g(android.content.Context context) {
        this.f118425c = context;
    }

    public static c.t.m.p134x35c0ce.c.g a(android.content.Context context) {
        if (f118424b == null) {
            synchronized (c.t.m.p134x35c0ce.c.g.class) {
                if (f118424b == null) {
                    f118424b = new c.t.m.p134x35c0ce.c.g(context);
                }
            }
        }
        return f118424b;
    }

    public dalvik.system.DexClassLoader b() {
        a();
        int b17 = c.t.m.p134x35c0ce.c.k.b(this.f118425c);
        if (b17 != 6 && b17 != 2) {
            java.lang.System.currentTimeMillis();
            if (!c.t.m.p134x35c0ce.c.k.d(this.f118425c)) {
                c.t.m.p134x35c0ce.c.i.a("copy to private dir failed");
            }
        } else if (!c.t.m.p134x35c0ce.c.k.c(this.f118425c)) {
            d();
        }
        if (!a(true, a("__SP_Tencent_Loc_COMP_INFO__sapp_"), c.t.m.p134x35c0ce.c.q.f118449b)) {
            d();
        }
        return c.t.m.p134x35c0ce.c.b.a(this.f118425c).a(a("__SP_Tencent_Loc_COMP_INFO__sapp_"), c.t.m.p134x35c0ce.c.q.f118449b);
    }

    public final void c() {
        java.io.File file = new java.io.File(this.f118425c.getFilesDir(), c.t.m.p134x35c0ce.c.q.f118449b);
        if (!file.exists()) {
            file.mkdirs();
        }
        java.io.File file2 = new java.io.File(this.f118425c.getFilesDir(), c.t.m.p134x35c0ce.c.q.f118450c);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        c.t.m.p134x35c0ce.c.k.a(this.f118425c);
    }

    public void d() {
        c.t.m.p134x35c0ce.c.e.a(this.f118425c).a("DCR", "goback");
        if (c.t.m.p134x35c0ce.c.k.d(this.f118425c)) {
            return;
        }
        c.t.m.p134x35c0ce.c.e.a(this.f118425c).a("DCR", "copy from asset failed");
    }

    public boolean a() {
        c();
        java.lang.String str = f118423a;
        java.lang.String c17 = c.t.m.p134x35c0ce.c.q.c(this.f118425c, "__Tencent_Cover_SDK_Version__sapp_", "");
        c.t.m.p134x35c0ce.c.i.a("cv:" + c17 + "_" + str);
        c.t.m.p134x35c0ce.c.e.a(this.f118425c).a("DCV", c17 + "_" + str);
        if (str.equals(c17)) {
            return false;
        }
        c.t.m.p134x35c0ce.c.q.d(this.f118425c, "__Tencent_Cover_SDK_Version__sapp_", str);
        c.t.m.p134x35c0ce.c.q.d(this.f118425c, "__pro_dex_load_info___sapp", "default");
        c.t.m.p134x35c0ce.c.q.d(this.f118425c, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", "");
        c.t.m.p134x35c0ce.c.q.a(this.f118425c.getFilesDir().getAbsolutePath() + java.io.File.separator + "TencentLocation_sapp/UpCp");
        return false;
    }

    public boolean a(boolean z17, java.util.List<c.t.m.p134x35c0ce.c.a> list, java.lang.String str) {
        boolean z18;
        java.util.List<java.lang.String> a17 = c.t.m.p134x35c0ce.c.q.a(this.f118425c, new java.io.File(this.f118425c.getFilesDir(), str));
        if (a17 != null && a17.size() != 0 && list.size() != 0) {
            java.lang.String c17 = c.t.m.p134x35c0ce.c.q.c(this.f118425c, "__bad_dex_info___sapp", "preference_default_sapp");
            java.util.List<c.t.m.p134x35c0ce.c.a> d17 = c.t.m.p134x35c0ce.c.q.d(c17);
            if (!c17.equals("preference_default_sapp") && !d17.isEmpty() && c.t.m.p134x35c0ce.c.k.a(list, d17)) {
                return false;
            }
            boolean z19 = true;
            for (c.t.m.p134x35c0ce.c.a aVar : list) {
                java.util.Iterator<java.lang.String> it = a17.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z18 = false;
                        break;
                    }
                    java.lang.String[] split = it.next().split(",");
                    if (split.length == 3 && aVar.f118390c.equals(split[0]) && java.lang.String.valueOf(aVar.f118391d).equals(split[1]) && aVar.f118392e.equals(split[2])) {
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
        c.t.m.p134x35c0ce.c.i.a("private dir files is empty");
        c.t.m.p134x35c0ce.c.e.a(this.f118425c).a("DLC", "localComp file error");
        return false;
    }

    public java.util.List<c.t.m.p134x35c0ce.c.a> a(java.lang.String str) {
        java.util.List<c.t.m.p134x35c0ce.c.a> d17 = c.t.m.p134x35c0ce.c.q.d(c.t.m.p134x35c0ce.c.q.c(this.f118425c, str, ""));
        if (d17.size() == 0) {
            c.t.m.p134x35c0ce.c.e.a(this.f118425c).a("DLC", "localComp parse error");
        }
        return d17;
    }
}

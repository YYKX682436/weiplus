package c.t.m.sapp.c;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static int f36865a;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f36868d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f36870f;

    /* renamed from: b, reason: collision with root package name */
    public final int f36866b = 30000;

    /* renamed from: c, reason: collision with root package name */
    public final int f36867c = com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List<c.t.m.sapp.c.a> f36869e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f36871g = false;

    public c(android.content.Context context) {
        this.f36870f = null;
        this.f36868d = context;
        this.f36870f = this.f36868d.getFilesDir().getAbsolutePath() + java.io.File.separator + "TencentLocation_sapp/UpCp";
        java.io.File file = new java.io.File(this.f36868d.getFilesDir().getAbsolutePath(), "TencentLocation_sapp/UpCp");
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public final synchronized void a() {
        boolean z17;
        java.util.List<c.t.m.sapp.c.a> list = this.f36869e;
        if (list != null && list.size() > 0) {
            f36865a = 1;
            c.t.m.sapp.c.q.i(this.f36868d);
            if (c.t.m.sapp.c.q.d() < 10485760) {
                f36865a = 2;
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<c.t.m.sapp.c.a> it = this.f36869e.iterator();
            boolean z18 = true;
            while (true) {
                z17 = false;
                if (!it.hasNext()) {
                    break;
                }
                c.t.m.sapp.c.a next = it.next();
                if (a(next)) {
                    arrayList.add(next);
                } else {
                    z18 = false;
                }
            }
            if (!z18) {
                f36865a = 2;
                a(arrayList);
                return;
            }
            if (arrayList.size() == this.f36869e.size()) {
                c.t.m.sapp.c.q.c(this.f36868d, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", "");
                if (c.t.m.sapp.c.q.a(this.f36868d, this.f36869e)) {
                    c.t.m.sapp.c.q.d(this.f36868d, "__SP_UPDATE_TencentLoc_COMP_SDK_VER__sapp_", c.t.m.sapp.c.g.f36890a);
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        c.t.m.sapp.c.a aVar = (c.t.m.sapp.c.a) it6.next();
                        if (!aVar.f36857c.contains(com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX)) {
                            aVar.f36857c += com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX;
                        }
                        java.io.File file = new java.io.File(this.f36870f, aVar.f36857c);
                        boolean delete = file.exists() ? file.delete() : true;
                        java.io.File file2 = new java.io.File(this.f36870f, aVar.f36857c);
                        boolean renameTo = new java.io.File(this.f36870f, "tmp__sapp" + aVar.f36857c).renameTo(file2);
                        boolean a17 = a(aVar, file2);
                        if (delete && renameTo && a17) {
                            z17 = true;
                        }
                    }
                    if (!z17) {
                        c.t.m.sapp.c.q.d(this.f36868d, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", "");
                        c.t.m.sapp.c.q.a(this.f36870f);
                        f36865a = 2;
                        return;
                    }
                    f36865a = 1;
                    c.t.m.sapp.c.e.a(this.f36868d).a("CPU", "down suc");
                } else {
                    a(arrayList);
                    f36865a = 2;
                }
            } else {
                c.t.m.sapp.c.i.a("down load failed");
                c.t.m.sapp.c.e.a(this.f36868d).a("CPU", "down failed");
                a(arrayList);
                f36865a = 2;
            }
        }
    }

    public void b(java.util.List<c.t.m.sapp.c.a> list) {
        this.f36869e = list;
        if (f36865a != 1) {
            new java.lang.Thread(this).start();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        c.t.m.sapp.c.d.a(this.f36868d).b("updatelock_sapp");
        a();
        c.t.m.sapp.c.e.a(this.f36868d).d();
        c.t.m.sapp.c.d.a(this.f36868d).c("updatelock_sapp");
    }

    public final void a(java.util.List<c.t.m.sapp.c.a> list) {
        for (c.t.m.sapp.c.a aVar : list) {
            java.io.File file = new java.io.File(this.f36870f, "tmp__sapp" + aVar.f36857c);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
    }

    public final boolean a(c.t.m.sapp.c.a aVar) {
        byte[] b17;
        java.io.BufferedOutputStream bufferedOutputStream;
        java.lang.Exception e17;
        try {
            java.lang.String str = "https://maplbs-40171.sh.gfp.tencent-cloud.com/Index/" + aVar.f36859e;
            c.t.m.sapp.c.i.a("start down load:" + aVar.f36859e);
            java.io.BufferedOutputStream bufferedOutputStream2 = null;
            int i17 = 0;
            while (true) {
                int i18 = i17 + 1;
                if (i17 >= 3) {
                    break;
                }
                byte[] a17 = c.t.m.sapp.c.o.a(str);
                if (a17 != null && (b17 = c.t.m.sapp.c.q.b(c.t.m.sapp.c.l.a(a17, "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q"))) != null) {
                    java.io.File file = new java.io.File(this.f36870f, "tmp__sapp" + aVar.f36857c);
                    try {
                        bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file, false), 1024);
                        try {
                            try {
                                bufferedOutputStream.write(b17);
                                if (a(aVar, file)) {
                                    c.t.m.sapp.c.i.a("down load available:" + aVar.f36859e);
                                    c.t.m.sapp.c.e.a(this.f36868d).a("CPU", "sud:" + aVar.f36859e);
                                    try {
                                        bufferedOutputStream.close();
                                        return true;
                                    } catch (java.lang.Exception unused) {
                                        return true;
                                    }
                                }
                                c.t.m.sapp.c.i.a("down load unavailable:" + aVar.f36859e);
                                c.t.m.sapp.c.e.a(this.f36868d).a("CPU", "failed:" + aVar.f36859e);
                                if (file.exists() && file.isFile()) {
                                    file.delete();
                                }
                                bufferedOutputStream.close();
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                bufferedOutputStream2 = bufferedOutputStream;
                                try {
                                    bufferedOutputStream2.close();
                                } catch (java.lang.Exception unused2) {
                                }
                                throw th;
                            }
                        } catch (java.lang.Exception e18) {
                            e17 = e18;
                            if (file.exists() && file.isFile()) {
                                file.delete();
                            }
                            c.t.m.sapp.c.e.a(this.f36868d).a("CPU", "failed:" + e17.toString());
                            try {
                                bufferedOutputStream.close();
                            } catch (java.lang.Exception unused3) {
                            }
                            bufferedOutputStream2 = bufferedOutputStream;
                            c.t.m.sapp.c.q.a(5000L);
                            i17 = i18;
                        }
                    } catch (java.lang.Exception e19) {
                        bufferedOutputStream = bufferedOutputStream2;
                        e17 = e19;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                    }
                }
                c.t.m.sapp.c.q.a(5000L);
                i17 = i18;
            }
        } catch (java.lang.Throwable unused4) {
        }
        return false;
    }

    public final boolean a(c.t.m.sapp.c.a aVar, java.io.File file) {
        if (file != null && file.exists()) {
            int length = (int) file.length();
            java.lang.String a17 = c.t.m.sapp.c.q.a(file);
            if (aVar.f36858d == length && aVar.f36859e.equals(a17)) {
                return true;
            }
        }
        return false;
    }
}
